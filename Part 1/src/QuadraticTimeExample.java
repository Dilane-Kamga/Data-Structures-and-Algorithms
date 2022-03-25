public class QuadraticTimeExample {

    public void log(int[] numbers){

        // O(n^2)
        for (int first : numbers)           // O(n)
            for (int second : numbers)      // O(n)
                System.out.println(first + ", " + second);

    }
}
