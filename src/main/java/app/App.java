package app;

public class App 
{
    public static void main(String args[]) 
    {
        int[] array = fizzbuzz(1, 20);
        System.out.println("");
        System.out.println("fizz: " + array[0]);
        System.out.println("buzz: " + array[1]);
        System.out.println("fizzbuzz: " + array[2]);
        System.out.println("lucky: " + array[3]);
        System.out.println("integer: " + array[4]);
    }

    public static int[] fizzbuzz(int start, int end)
    {
        int[] output = {0, 0, 0, 0, 0};
        for (int counter = start; counter <= end; counter += 1){
            if (Integer.toString(counter).contains("3")){
                output[3] += 1;
                System.out.print("lucky ");
            }
            else if (counter % 3 == 0 && counter % 5 == 0){
                output[2] += 1;
                System.out.print("fizzbuzz ");
            }
            else if (counter % 3 == 0){
                output[0] += 1;
                System.out.print("fizz ");
            }
            else if (counter % 5 == 0){
                output[1] += 1;
                System.out.print("buzz ");
            }
            else {
                output[4] += 1;
                System.out.print(counter + " ");
            }
        }
        return output;
    }
}