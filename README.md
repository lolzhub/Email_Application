# Email Application

This is a simple email application written in Java, allowing users to create custom email addresses with departments, set mailbox capacity, and manage passwords.

## Features

- **Custom Email Creation**: Users can create custom email addresses based on their first name, last name, and department.
- **Department Selection**: Users are prompted to select a department (Sales, Development, or Accounting) or choose 'None'.
- **Random Password Generation**: Automatically generates a random password for each email account created.
- **Mailbox Capacity Management**: Users can set the mailbox capacity for their email accounts.
- **Alternate Email Address**: Users can specify an alternate email address.
- **Password Change**: Functionality to change the password for an email account.

## Usage

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

## Sample Code

```java
package EmailApp;

public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("John", "Doe");
        email.setMailboxCapacity(500);
        email.setAlternateEmail("abc@pqr.xyz.com");
        System.out.println(email.showInfo());
    }
}
```

```java
package EmailApp;

import java.util.Scanner;

public class Email {
    // Class implementation
}
```

## Contributing

Contributions are welcome! If you have suggestions, feature requests, or bug reports, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to customize this README according to your project's needs and preferences.
