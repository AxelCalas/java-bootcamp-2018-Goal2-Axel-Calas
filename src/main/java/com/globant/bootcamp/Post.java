package com.globant.bootcamp;

import java.util.Scanner;

public class Post {
    
    public String getPost() {
        System.out.print("\nUser: ");
        String user = getInput();
        System.out.print("Email: ");
        String email = getInput();
        System.out.print("Message: ");
        String message = getInput();
        
        String post = "User: " + user + "\n" + 
                        "Email: " + email + "\n" + 
                        "Message => " + message + "\n";
        return post;
    }
    
    public String getInput() {
        String input = "";
        Scanner scanner = new Scanner (System.in);
        input = scanner.nextLine (); 
        scanner.close();
        return input;
    }
    
}
