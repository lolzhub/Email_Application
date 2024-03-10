package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;

    private String lastName;
    private String department;
    private String dpt;
    private String password;
    private int defaultPasswordLength=15;
    private String email;
    private String companySuffix="google.com";
    private int mailboxCapacity=10;
    private String alternateEmail="None";

//    Constructor to receive first name and last name
    public Email(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
//        System.out.println("Email created for: "+this.firstName+" " +this.lastName);

//        call method that returns the department
        dpt=setDepartment();
        String s = (String) dpt.subSequence(0,3);
        this.department=s.toLowerCase();
//        System.out.println("Your department is "+this.department);

//        call method that returns a random password
        this.password=randomPassword(defaultPasswordLength);
//        System.out.println("Your password is: "+ this.password);

//        combine elements to generate email
        email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
//        System.out.println("Your email is: "+ email);


    }

//    Ask for department
    private String setDepartment(){
        System.out.print("Hey "+firstName+"! Please choose one of the departments:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter department code: ");
        Scanner sc = new Scanner(System.in);
        int departmentChoice = sc.nextInt();
        if (departmentChoice==1){
            return "Sales";
        } else if (departmentChoice==2) {
            return "Development";
        } else if (departmentChoice == 3) {
            return "Accounting";
        }else{
            return "user_only";
        }
    }

//    Generate a random password
    private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-=!@#$%^&*()_+";
        char[] password = new char[length];
        for (int i=0; i<length; i++){
            int randVal = (int) (Math.random() * passwordSet.length());
            password[i]=passwordSet.charAt(randVal);
        }
        return new String(password);
    }

//    Set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
        System.out.println("Mailbox capacity successfully set to: "+getMailboxCapacity()+" mb");
    }

//    Set alternate email
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail=alternateEmail;
        System.out.println("Alternate email set successfully to: "+getAlternateEmail());
    }

//    Change password
    public void changePassword(String newPassword){
        this.password=newPassword;
        System.out.println("Password changed successfully to: "+getPassword());
    }

//    return mailbox capacity
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

//return alternate email
    public String getAlternateEmail(){
        return alternateEmail;
    }

//    return password
    public String getPassword(){
        return password;
    }

//    show all the information
    public String showInfo(){
        return "================================================================\nDisplay name: "+firstName+" "+lastName+
                "\nDepartment: "+dpt+
                "\nEmail: "+email+
                "\nPassword: "+password+
                "\nAlternate email: "+alternateEmail+
                "\nMailbox Capacity: "+mailboxCapacity+" mb\n================================================================";
    }

}
