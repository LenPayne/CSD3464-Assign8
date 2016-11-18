package assign8;

/**
 *
 * @author <ENTER YOUR NAME HERE>
 */
public class Assign8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         *  In this method, play a game with the user. Allow them to catch Fish
         *  until they want to quit. Fishing has some rules, though:
         *  - A user can catch as many fish as they want, but can only keep 5
         *  - When a user catches their sixth fish, they must let go of their smallest fish by weight * length
         *  - A user can stop fishing at any time
         *  - A user's score is based on total weight * total length * total number of fish caught
         *  
         *  Example Play-Through:
         *
         *  Current Fish Held: 0 - Weight: 0 - Length: 0 - Fish Caught: 0
         *  Do you want to catch another fish? (Y/N)
         *  Y
         *  You caught a 10cm Carp that weighs 300g!
         *  Current Fish Held: 1 - Weight: 300 - Length: 10 - Fish Caught: 1
         *  Do you want to catch another fish? (Y/N)
         *  Y
         *  You caught a 11cm Carp that weighs 310g!
         *  Current Fish Held: 2 - Weight: 610 - Length: 21 - Fish Caught: 2
         *  Do you want to catch another fish? (Y/N)
         *  Y
         *  You caught a 21cm Carp that weighs 320g!
         *  Current Fish Held: 3 - Weight: 930 - Length: 42 - Fish Caught: 3
         *  Do you want to catch another fish? (Y/N)
         *  Y
         *  You caught a 10cm Carp that weighs 200g!
         *  Current Fish Held: 4 - Weight: 1130 - Length: 52 - Fish Caught: 4
         *  Do you want to catch another fish? (Y/N)
         *  Y
         *  You caught a 11cm Carp that weighs 220g!
         *  Current Fish Held: 5 - Weight: 1350 - Length: 63 - Fish Caught: 5
         *  Do you want to catch another fish? (Y/N)
         *  Y
         *  You caught a 15cm Carp that weighs 300g!
         *  Current Fish Held: 5 - Weight: 1450 - Length: 68 - Fish Caught: 6
         *  Do you want to catch another fish? (Y/N)
         *  N
         *  Congratulations. Your score is: 16433!
         */
    }

    public static double getScore(Fish[] fishes, int fishCaught) {
        // In this method, accept an array of Fish objects and calculate their
        // total score, where the score is the sum of all fish weights, times
        // the sum of all fish lengths, divided by the number of fish caught.
        // NOTE: Do not count null array members (eg- uncaught fish.)       
        return 0;
    }

    public static double getTotalWeight(Fish[] fishes) {
        // In this method, accept an array of Fish objects and return the sum of
        // the weight of each fish.
        return 0;
    }

    public static double getTotalLength(Fish[] fishes) {
        // In this method, accept an array of Fish objects and return the sum of
        // the length of each fish.
        return 0;
    }

    public static void dropSmallestFish(Fish[] fishes, Fish newFish) {
        // In this method, accept an array of Fish objects and a new Fish. If
        // the new Fish is bigger than the smallest Fish in the array, replace
        // the smallest Fish with the new Fish.
    }
}
