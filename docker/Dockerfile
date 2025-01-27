# Use the UBI8 OpenJDK 17 image as the base for building the application
FROM registry.access.redhat.com/ubi8/openjdk-17:1.15-1.1682053058 AS builder

# Install required tools (gzip and Maven 3.8.8)
USER root
RUN microdnf install -y gzip && \
    curl -sSL https://dlcdn.apache.org/maven/maven-3/3.8.8/binaries/apache-maven-3.8.8-bin.tar.gz | tar -xz -C /opt && \
    rm -f /usr/bin/mvn && \
    ln -s /opt/apache-maven-3.8.8/bin/mvn /usr/bin/mvn && \
    microdnf clean all

# Build dependency offline to streamline build
RUN mkdir project
WORKDIR /home/jboss/project
COPY pom.xml .
RUN mvn -version # Verify Maven version
RUN mvn dependency:go-offline -B

# Copy source code and build the application
COPY src src
RUN mvn package -Dmaven.test.skip=true -B

# Extract artifact information for deployment
RUN grep version target/maven-archiver/pom.properties | cut -d '=' -f2 >.env-version
RUN grep artifactId target/maven-archiver/pom.properties | cut -d '=' -f2 >.env-id
RUN mv target/$(cat .env-id)-$(cat .env-version).jar target/export-run-artifact.jar

# Use the UBI8 OpenJDK 17 runtime image for the final deployment
FROM registry.access.redhat.com/ubi8/openjdk-17-runtime:1.15-1.1682053056
COPY --from=builder /home/jboss/project/target/export-run-artifact.jar  /deployments/export-run-artifact.jar
EXPOSE 8081
ENTRYPOINT ["/opt/jboss/container/java/run/run-java.sh", "--server.port=8081"]
