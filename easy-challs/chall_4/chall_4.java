import java.util.Scanner;

public class chall_4 {
     public static void main(String[] var0) {
      chall_4 var1 = new chall_4();
      Scanner var2 = new Scanner(System.in);
      System.out.println("Welcome to the lair!!");
      System.out.println("Please enter the code to enter the lair");
      System.out.print("Code: ");
      String var3 = var2.next();
      String var4 = var3.substring("FLAG{".length(), var3.length() - 1);
      if (verify(var4)) {
         System.out.println("\nCongrats the code is the value of the flag");
      } else {
         System.out.println("\nNah uh, check your code again fool");
      }

   }

   public static boolean verify(String var0) {
      StringBuilder var1 = new StringBuilder();
      StringBuilder var2 = new StringBuilder();
      StringBuilder var3 = new StringBuilder();

      int var4;
      for(var4 = 0; var4 < var0.length(); var4 += 2) {
         var1.append((char)((var0.charAt(var4) ^ 69) + 40));
      }

      for(var4 = 1; var4 < var0.length(); var4 += 2) {
         var2.append((char)((var0.charAt(var4) ^ 80) + 40));
      }

      for(var4 = 0; var4 < var0.length(); ++var4) {
         if (var4 % 2 == 0) {
            var3.append(var1.charAt(var4 / 2));
         } else {
            var3.append(var2.charAt(var4 / 2));
         }
      }

      return var3.toString().equals("R^KaNaLdQQBeTK^aS_BQRM");
   }
}
