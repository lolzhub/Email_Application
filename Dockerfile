# Use a base image with Java installed
FROM openjdk:8-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the source code into the container
COPY ./src /app/src

# Create the bin directory
RUN mkdir bin

# Compile the Java application
RUN javac -d bin src/EmailApp/*.java

# Define the entry point for the container
CMD ["java", "-cp", "bin", "EmailApp.EmailApp"]
