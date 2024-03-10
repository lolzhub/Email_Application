# Email Application

This is a simple email application written in Java, allowing users to create custom email addresses with departments, set mailbox capacity, and manage passwords.

## Features

- **Custom Email Creation**: Users can create custom email addresses based on their first name, last name, and department.
- **Department Selection**: Users are prompted to select a department (Sales, Development, or Accounting) or choose 'None'.
- **Random Password Generation**: Automatically generates a random password for each email account created.
- **Mailbox Capacity Management**: Users can set the mailbox capacity for their email accounts.
- **Alternate Email Address**: Users can specify an alternate email address.
- **Password Change**: Functionality to change the password for an email account.

## Usage: Method 1 (Running on Native machine)

### Prerequisites

- Java Development Kit (JDK)
- IDE (Integrated Development Environment) like IntelliJ IDEA or Eclipse

### Instructions

1. Clone the repository to your local machine:

```
git clone https://github.com/lolzhub/Email_Application.git
```

2. Open the project in your preferred IDE.

3. Navigate to the `src` folder and locate `EmailApp.java` and `Email.java`.

4. Run the `EmailApp.java` file to execute the email application.

5. Follow the prompts to create and manage email accounts.

---

## Usage: Method 2 (Running on a Docker container)

To use this Docker image, follow these steps:

1. **Pull the Docker Image**:

   ```bash
   docker pull lolzhub/email-app:latest
   ```

2. **Run the Docker Container**:

   ```bash
   docker run -it lolzhub/email-app:latest
   ```

   This command will start the Docker container in interactive mode, allowing you to interact with the Java email application.

3. **Follow the Application Instructions**:

   Once the container is running, follow the instructions provided by the Java email application. You can set the mailbox capacity, alternate email, change passwords, view account information, and more.


## Additional Information

- **Issues**: If you encounter any issues or have suggestions for improvements, please open an issue in the GitHub repository.

## Contributing

Contributions are welcome! If you have suggestions, feature requests, or bug reports, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

