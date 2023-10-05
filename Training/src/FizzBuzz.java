public class FizzBuzz {
    public static void fizz(){
        for (int i = 1; i < 101; i++){
            String output = "";
            if (i % 3 == 0){
                output += "Fizz";
            }
            if (i % 5 == 0){
                output += "Buzz";
            }
            if (output.isEmpty()){
                output = String.valueOf(i);
            }
            System.out.println(output);
        }
    }

}
