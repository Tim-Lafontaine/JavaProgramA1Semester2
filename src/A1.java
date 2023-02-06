import java.util.ArrayList;

// [ Timothy Lafontaine ID: 261066866 ]

public class A1 {

    public static void main(String[] args) {

        System.out.println(crazySeries(5));
        System.out.println(crazySeries(9));

        System.out.println(benNumber(2, 5));
        System.out.println(benNumber(3, 8));
        System.out.println(benNumber(1, 1));

        // TODO you can add more test cases here

    }

    // Q1
    public static ArrayList<Integer> crazySeries(int start) { 
        // TODO write your code in this method.
        ArrayList<Integer> answer = new ArrayList<>();

        // calls the recursive method crazySeriesRec()
        // Param. 1: original start variable, will not change
        // Param .2: variable to hold 'start' for changes
        // Param. 3: variable to hold the steps amount (the array list starts by counting down)
        // Param. 4: Arraylist that's being configured and returned
        return crazySeriesRec(start, start, -3, answer);

    }

    public static ArrayList<Integer> crazySeriesRec(int start, int current, int steps, ArrayList<Integer> answer) {

        // base case
        // is current is over the start int, exits the method
        if (current > start) {
            return answer;
        }

        // adds the current variable to the arraylist
        answer.add(current);

        // checks to see if current variable is a negative number
        if (current < 0) {

            // change steps to go back up when it hits the first negative number
            steps = 3;

        }

        // recalls the method crazySeriesRec() with these changes:
        // increments current by steps
        return crazySeriesRec(start, current += steps, steps, answer);

    }

    // Q2
    public static int benNumber(int m, int n) { 
        // TODO write your code in this method.

        // calls the recursion method benNumWIndex()
        // the 1 is the starting index
        return benNumWIndex(m, n, 1);

    }

    public static int benNumWIndex(int m, int n, int i) {

        // base case
        if (n == 0) {
            return 0;
        }

        // doubles m when i is even
        if (i % 2 == 0) {
            m *= 2; 
        }

        // increments m by 1 if index is odd
        else { 
            m += 1;
        }

        // adds m to answer and recalls the method benNumWIndx() with these changes:
        // increments i by 1 (index)
        // decrements n by 1 to lower the total numbers needed (to keep track of how much as needed after each loop )
        return m + benNumWIndex(m, n -= 1, i += 1);

    }

}
