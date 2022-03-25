public class LinearTimeExample {

    public void log(int[] numbers, String[] names){
        // O(n)
        for (int i = 0; i < numbers.length; i++){ // O(n)
            System.out.println(numbers[i]);
        }

        for( String name: names){ // O(n)
            System.out.println(name);
        }

    }

}
