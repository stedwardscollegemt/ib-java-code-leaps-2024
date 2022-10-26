package lesson02;

import helpers.Keyboard;

/**
 * TODO:
 * 
 * The Year 13 students have been told to get into teams of a specific size for the
 * Group 4 Project due next week. 
 * Write a program that: 
 *    - Prompts for the total number of students.
 *    - Prompts for size of the teams to be formed.
 *    - Displays how many teams can be formed.
 *    - Displays how many students are left without a team.
 * 
 * Use appropriate naming conventions and be sure to add comments.
 * Hint: Make use of the mod operator %
 */
public class CalculateTeams {
    public static void main(String[] args) {
        // TODO: Declare variables
        int totalStudents, teamSize, teams, remaining;

        // Input
        System.out.println("Please enter the total number of students:");
        totalStudents = Keyboard.readInt();

        System.out.println("Please enter the size of the teams:");
        teamSize = Keyboard.readInt();

        // Process
        teams = totalStudents / teamSize;
        remaining = totalStudents % teamSize;

        // Output
        System.out.println("Number of teams formed: " + teams);
        System.out.println("Students without a team: " + remaining);
    }
}