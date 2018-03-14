import java.util.Scanner;

public class AppCalculator {
 private Calculator calculator;
 private Scanner scanner;
 private Double num1;
 private Double num2;

public AppCalculator(){ 
 this.calculator = new Calculator();
 this.scanner = new Scanner(System.in);
}

private int showDialogOptions(){
 int opt = 0;
 System.out.println("____________________");
 System.out.println("Choose a operation: | ");
 System.out.println("1 - Sum             |");
 System.out.println("2 - Sub             |");
 System.out.println("3 - Mult            |");
 System.out.println("5 - Exit            |");
 System.out.println("____________________|");
 System.out.print("Option: ");
 opt = scanner.nextInt();
 return opt;
}

public void initAppCalculator(){
 int opt = 0;
 boolean continueApp = true; 

 while(continueApp){
  opt = showDialogOptions();

  switch(opt){

   case 1:  
    System.out.print("\n");	
    System.out.print("Sum - Type the first number: ");
    num1 = scanner.nextDouble();

    System.out.print("\n");

    System.out.print("Sum - Type the second number: ");
    num2 = scanner.nextDouble();

    System.out.print("\n");

    calculator.sum(num1, num2);
    System.out.printf("%.2f + %.2f = %.2f", num1, num2, calculator.getResult());
    System.out.print("\n");
    break;

   case 2:  
    System.out.print("\n");	
    System.out.print("Sub - Type the first number: ");
    num1 = scanner.nextDouble();

    System.out.print("\n");

    System.out.print("Sub - Type the second number: ");
    num2 = scanner.nextDouble();

    System.out.print("\n");

    calculator.sub(num1, num2);
    System.out.printf("%.2f - %.2f = %.2f", num1, num2, calculator.getResult());
    System.out.print("\n");
    break;

   case 3:  
    System.out.print("\n");	
    System.out.print("Mult - Type the first number: ");
    num1 = scanner.nextDouble();

    System.out.print("\n");

    System.out.print("Mult - Type the second number: ");
    num2 = scanner.nextDouble();

    System.out.print("\n");

    calculator.mult(num1, num2);
    System.out.printf("%.2f - %.2f = %.2f", num1, num2, calculator.getResult());
    System.out.print("\n");
    break;
 
   case 5:
    System.out.print("Quit...");
    continueApp = false;
     break;
  }
 }

}

}



