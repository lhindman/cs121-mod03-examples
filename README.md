![CS121 Banner](images/CS121-BANNER.svg)
# Module 3 - Using Classes and Objects Guided Experimentation
The purpose of this guided experimentation is to provide students with an opportunity to experiment with the code examples presented in the lecture. It is important to keep detailed observation in your coding journal as you work through the experiments below. These observations will be useful to you as you complete the labs and you will be allowed to reference them on open book / open note quizzes.  

***You are not required to turn in your observations.***
## Getting Started
To get started on this activity, please clone this repository into your development environment  

Steps to Clone Examples
1. Copy the URL for this repo by clicking the green "Code" button above, select HTTPS then click the copy icon.
2. Open VSCode, click the Source Control icon then click Clone Repository.
3. Paste the repo URL into the "Provide repository URL" field and press Enter.
4. Browse to the location in your development environment where you want to store the repostory and click Select Repository Location.
5. When prompted, Open the repository then **[Open the workspace](images/open-examples-workspace.png)**.

## Enum Experimentation
1. Open *IceCream.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Add the following code to the end of the main() method. What is the result and why?  
    ```
    boolean result = Flavor.HUCKLEBERRY.ordinal() > Flavor.CHOCOLATE.ordinal();
    System.out.printf("\n\n%s is greater than %s: %b\n",Flavor.HUCKLEBERRY, Flavor.CHOCOLATE, result);  
    ```
    - Modify the printf statement to use '%n' in place of '\n' as shown below. What is the difference between the %n format specifier and the \n escape character.   
    ```
    System.out.printf("%n%n%s is greater than %s: %b%n",Flavor.HUCKLEBERRY, Flavor.CHOCOLATE, result); 
    ```
## Formatting Experimentation
1. Open *CircleStatsDecimalFormat.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Add the following code near the end of the main() method. What is the result and why?  
    ```
    System.out.printf("The circle's area using printf(): %.4f\n", area);
    System.out.printf("The circle's circumference using printf(): %10.3f\n", circumference);
    ```

            
1. Open *BasicDecimalFormat.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Modify the DecimalFormat object to use the pattern "$0.000" as shown below. Compare the output against the original "$0.###" pattern. What is the result and why?  
    ```
    DecimalFormat fmt = new DecimalFormat("$0.000");
    ```
     
    - Modify the DecimalFormat object to use the pattern "$00000.000000" as shown below. What is the result and why?  
    ```
    DecimalFormat fmt = new DecimalFormat("$00000.000000");
    ``` 
## String Experimentation
1. Open *StringFun.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Experiment with different values of the index character. Add a print statement to the index of the character in the console as shown below. What is the result and why?  
    ```
    int space = phrase.indexOf(' ');
    System.out.println("Character index is: " + space);
    ```
    - Change the index character to one that doesn't exist in the phrase. What value is returned by the indexOf() method and what result does this have on the rest of the program? 
    ```
    int space = phrase.indexOf('z');
    System.out.println("Character index is: " + space);
    ```    

## Random Experimentation
1. Open *RandomNumbers.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Run the prgram three times and record the values generated each time.

    - Modify the program to instantiate the Random object using a seed value as shown below. Run the prgram three times and record the values generated each time. What is the result and why?
    ```
    generator = new Random(12345);
    ```

## Math Experimentation
1. Open *Quadratic.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Run the program with the values 2, 16 and 3 for a, b and c respectively and record the results.
    - Modify the program to support reading double values from the user by replacing the nextInt() methods calls with nextDouble() as shown below.  What is the result and why?
    ```
    System.out.print("Enter the coefficient of x squared: ");
    a = scan.nextDouble();
    System.out.print("Enter the coefficient of x: ");
    b = scan.nextDouble();
    System.out.print("Enter the constant: ");
    c = scan.nextDouble();
    ```
    - Modify the program by casting the value returned by nextDouble() to an int as shown below.  Run the program with the values 2.5, 16.8, 3.2 for a, b and c respectively. Compare the results with those recorded earlier. What are the results and why?
    ```
    System.out.print("Enter the coefficient of x squared: ");
    a = (int) scan.nextDouble();
    System.out.print("Enter the coefficient of x: ");
    b = (int) scan.nextDouble();
    System.out.print("Enter the constant: ");
    c = (int) scan.nextDouble();
    ```
    
    - Remove the cast and change the declaration for a, b and c from int to double as shown below. Run the program with the values 2.5, 16.8, 3.2 for a, b and c respectively. Compare the results with those recorded earlier. What are the results and why?
    ```
    double a, b, c; 
    ```


