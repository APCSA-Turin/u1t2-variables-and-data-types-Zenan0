/* This program is intended to tell the user
 * about Mike and his weekly goal, and whether
 * he is able to reach it or not.
 */

public class Unit1Topic2 {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.60934; // This is a constant variable used to convert miles into kilometers.

        String name = "Mike";
        int miles = 18;
        double kilometers = miles * KILOMETERS_PER_MILE; // Multiplication using a variable and a constant.
        boolean goalReached = false;
        int weeklyGoal = 25;

        System.out.println(name + "wants to reach his weekly goal of walking 25 miles.");
        System.out.println("When converted into kilometers, that is " + kilometers + "kilometers.");
        System.out.println("So far " + name + "has only walked " + miles + "miles this week.");
        System.out.println("True or false? " + name + "reached his weekly goal: " + goalReached + ".");

        miles = 25;
        if (weeklyGoal > 24) {
            goalReached = true; // Changing the value of a variable.
        } else {
            goalReached = false;
        }
        System.out.println(name + " plans to walk 7 more miles tomorrow.");
        System.out.println("True or false? That will be enough miles to complete his weekly goal: " + goalReached + ".");
        System.out.println(name + " has completed his goal of walking " + miles + "per week. Hooray!!!!");
    }
}
