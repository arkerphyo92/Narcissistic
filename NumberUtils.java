public class NumberUtils {

    public static boolean isNarcissistic(int number) {        
   
        String numberString = Integer.toString(number); // Changing integer parameter to String *To get digit count of number*
        int digitCounter = numberString.length(); // Count of Digits for inputed integer from string
   
        int result =0; 
        for (int i = 0; i<digitCounter ; i++){
         int stringToReNumber = Character.getNumericValue(numberString.charAt(i)); // Getting Each Digit from string number and keep as int 
          result += Math.pow(stringToReNumber,digitCounter); // Calculating with power methods
          }     
          return number == result; // same with return (number == result)? true: false;             
        }
    }
