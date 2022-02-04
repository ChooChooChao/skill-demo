public class SkillDemo {
   public static int factorial(int num) {
       int result = 0;
       for(int i = num; i > 0; i--) {
           result *= i;
       }

       return result;
   }
} 
