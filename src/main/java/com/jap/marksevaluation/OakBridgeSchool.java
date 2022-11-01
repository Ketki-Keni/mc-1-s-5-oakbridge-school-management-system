package com.jap.marksevaluation;

import org.jetbrains.annotations.NotNull;

import java.sql.SQLOutput;

public class OakBridgeSchool {

    // Convert the given string name to upper case
    public String convertToUpperCase(String name)
    {
        if (name.length() == 0){
            return " ";
        }
        if (name == ""){
            return " ";
        }
        String firstName = name.toUpperCase();
        return firstName;
    }

    // Find the shortest word in the list of surnames
    public String shortestSurname(String[] surnames)
    {
        String shortestSurname = surnames[0];
        for (int index = 0; index < surnames.length; index++)
        {
            if (surnames[index].length() < shortestSurname.length()){
                shortestSurname = surnames[index];
            }
        }
        return shortestSurname;
    }

    // Check if any of the names in the array is repeated, if yes return true else false
    public boolean checkIfNamesAreRepeated(String[] names){
        boolean flag = false;
        for (int index = 0; index < names.length; index++) {
            for (int index2 = index + 1; index2 < names.length; index2++) {
                flag =  names[index].equals(names[index2]);
                if(flag == true){
                    return flag;
                }
            }
        }
        return flag;
    }

    // Concatenate the name and surname of the students
    public String[] concatenateNameAndSurname(String[] names, String [] surnames){
        String[]  concatenatedNames = new String[names.length];
        for (int index = 0; index < names.length; index++)
        {
            String firstName = names[index];
            String lastName = surnames[index];
            concatenatedNames[index] = firstName.concat(" ").concat(lastName);
        }
        return  concatenatedNames;
    }

    // Display the names
    public void displayStudentNames(String[] namesArray){
        System.out.println("The Student full names (name and surname) :");
        for (int index = 0; index < namesArray.length; index++) {
            System.out.print(namesArray[index] + ", ");
        }
    }

    public static void main(String[] args) {
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        // Declare and Initialize values to the arrays
        String[] studentNames = {"Michell", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Leena", "Leo"};
        String[] studentSurnames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Martin", "Clark", "King"};

        // Call the method to convert all the student names to upper case and display results
        System.out.println("The Student names in uppercase : ");
        for (int index = 0; index < studentNames.length; index++)
        {
            String studentName = oakBridgeSchool.convertToUpperCase(studentNames[index]);
            System.out.print(studentName.concat(" "));
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");

        // Call the method to sort names in alphabetical order and display results


        // Call the method to find the shortest surname and display results
        String shortestSurname = oakBridgeSchool.shortestSurname(studentSurnames);
        System.out.println("The Shortest surname is : " + shortestSurname);
        System.out.println("----------------------------------------------------------------------------");

        // Call the method to check if two names in the array are the same and display results
        boolean namesAreRepeatedOrFalse = oakBridgeSchool.checkIfNamesAreRepeated(studentNames);
        System.out.println("There are repeated names in the name list : " + namesAreRepeatedOrFalse);
        System.out.println("----------------------------------------------------------------------------");

        // Call the method to concatenate name and surname with a space in between and display results
        String[] fullName = oakBridgeSchool.concatenateNameAndSurname(studentNames, studentSurnames);
        oakBridgeSchool.displayStudentNames(fullName);
    }
}
