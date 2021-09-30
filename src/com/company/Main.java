/*Jake Eckstein
CSC112 Fall 2021
Programming Assignment 1
September 29, 2021
This program reads an input file and organizes students, their student ID and their test scores then places them into groups that assigns group leaders and averages the group's scores.
*/

package com.company;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        Random randNum = new Random();

        FileInputStream input_file = null;
        try {
            input_file = new FileInputStream("input.txt");
        } catch (FileNotFoundException e) {
            System.exit(1);
        }

        Scanner scanner = new Scanner(input_file);

        // count num lines in input.txt
        int numLines = 0;
        while (scanner.hasNext()) { //continues scanner until condition is met(there is no next line)
            numLines++;
            scanner.next();
        }

        scanner.close();
        input_file.close();

        FileInputStream input = null;
        try {
            input = new FileInputStream("input.txt");
        } catch (FileNotFoundException e) {
            System.exit(1);
        }

        int numStudents = numLines / 9;

        Scanner scnr = new Scanner(input);

        // create file if it doesn't exist
        File createFile = new File("output.txt");
        if (createFile.createNewFile()) {
            System.out.println("Created file: " + createFile.getName());

        } else {
            System.out.println("File already exists.");
        }

        FileWriter writeToFile = new FileWriter("output.txt");
        int i = 0;
        int j = 0;
        String[] firstName = new String[numStudents];
        String[] middleName = new String[numStudents];
        String[] lastName = new String[numStudents];
        int[] studentID = new int[numStudents];
        double[] avgTest = new double[numStudents];
        String[] sortLastNames = new String[numStudents];
        double sum;
        double avg;

        for (i = 0; i < numStudents; i++) { // loop through input file for student names and student ID
            firstName[i] = scnr.next();
            middleName[i] = scnr.next();
            lastName[i] = scnr.next();
            studentID[i] = scnr.nextInt();

            sum = 0;
            for (j = 0; j < 5; j++) { // loops through the test scores and adds them together
                sum += scnr.nextInt();
            }
            avg = sum / 5;
            avgTest[i] = avg;
        }
        for (i = 0; i < numStudents; i++) { //makes sortLastName lastName so it can store them alphabetically
            sortLastNames[i] = lastName[i];
        }

        Arrays.sort(sortLastNames);


        for (i = 0; i < numStudents; i++) { // looping through numStudents at i and j to print the student's name and student ID ACCORDING TO FORMAT
            for (j = 0; j < numStudents; j++) { //
                if (sortLastNames[i].equals(lastName[j])) {
                    System.out.println(lastName[j] + ", " + firstName[j] + " " + middleName[j]);
                    writeToFile.write(lastName[j] + ", " + firstName[j] + " " + middleName[j] + '\n');
                    System.out.println(studentID[j]);
                    writeToFile.write(String.valueOf(studentID[j]) + '\n');
                    System.out.println(avgTest[j]);
                    writeToFile.write(String.valueOf(avgTest[j]) + '\n');
                }
            }
        }
        int numGroups = (numStudents / 4);
        int remainingStudents = numStudents % 4;

        // don't create extra group
        boolean extraGroup = false;
        if (remainingStudents == 1) { // if one is remainder it stores it as group of 5
            extraGroup = true;
        }
        else {
            numGroups += 1;
        }

        int sCounter = 0;
        for (i = 0; i < numGroups; i++) { // adds the number following the group
            System.out.println("Group " + (i+1));
            writeToFile.write("\nGROUP " + (i+1) + '\n');
            String[] groupStudents;
            double[] testGrades;
            if (i == numGroups - 1) { // this helps with the remainder students by how to store them depending on how many of them there will be
                if (extraGroup) {
                    groupStudents = new String[5];
                    testGrades = new double[5];
                } else {
                    groupStudents = new String[remainingStudents];
                    testGrades = new double[remainingStudents];
                }


            } else {
                groupStudents = new String[4];
                testGrades = new double[4];
            }
            for (j = 0; j < groupStudents.length; j++) { // once the number of students equals the student counter it breaks
                if (numStudents == sCounter) {
                    break;
                }
                testGrades[j] = avgTest[sCounter];

                groupStudents[j] = firstName[sCounter] + " " + middleName[sCounter] + " " + lastName[sCounter];
                writeToFile.write(firstName[sCounter] + " " + middleName[sCounter] + " " + lastName[sCounter] + '\n');
                sCounter+=1;
            }


            int randomNumber = randNum.nextInt(groupStudents.length);
            String groupLeader = groupStudents[randomNumber];
            writeToFile.write("Group " + (i+1) + "'s " +  "leader: " + groupLeader + '\n');
            System.out.println("Group leader: " + groupLeader + '\n');

            System.out.println(Arrays.toString(groupStudents));

            System.out.println(Arrays.toString(testGrades));

            float total = 0;
            for (double testGrade : testGrades) { //for each testGrade in testGrades this loops through
                total += testGrade;
            }
            double groupAverage = total / testGrades.length;
            writeToFile.write(String.format("%.2f", groupAverage) + '\n');




        }



        writeToFile.close();


    }


}
