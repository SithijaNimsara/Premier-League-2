package com.example.springreact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class SpringreactApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(SpringreactApplication.class, args);
//    }

    private static PremierLeagueManager pManager =new PremierLeagueManager();
    private static UserController userController = new UserController();

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        //get the data to the arrays from the text files
        pManager.startFileWriter();
        pManager.startPlayedFileWriter();
        int input = 0;
        System.out.println(pManager.arrayList1());
        SpringApplication.run(SpringreactApplication.class, args);
        userController.allTheTeams(pManager);
        while (true){
            //diplay the instruction
            System.out.println("-----------------------------");
            System.out.println("1 to register the club");
            System.out.println("2 to add a played match");
            System.out.println("3 to delete the club");
            System.out.println("4 to display the club details");
            System.out.println("5 to display the table in CLI");
            System.out.println("6 to display the GUI");
            System.out.println("7 to exit from the program");

            try {
                //get the input fron the user
                input = Integer.parseInt(scan.nextLine());
            }
            catch (NumberFormatException i) {
                //if the user didn't insert a integer
                System.out.println(i+"\nEnter an integer !!!");
            }
            if (input==1) {
                //get the information from the user
                pManager.addMember();
                //add the information to the file
                pManager.fileWriter();
            }
            else if (input==2) {
                //get the match details from the user
                pManager.addPlayedMatch();
                //add the information to the file
                pManager.fileWriter();
            }
            else if (input==3) {
                //delete the details to the given club name
                pManager.deleteMember();
                //add the information to the file
                pManager.fileWriter();
            }
            else if (input==4) {
                //display information to the given club name
                pManager.displayMember();
            }
            else if (input == 5) {
                //diaplay all the information in the console
//                pManager.cliTableView();
            }
            else if (input == 6) {

                pManager.fileWriter();
//                launch(args);
            }
            else if (input == 7) {
                //exit from the program
                break;
            }
            else {
                System.out.println("Invalid input !!!");
            }
        }

    }


}
