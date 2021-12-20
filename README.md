# CS121 - Module 3 - Using Classes and Objects Guided Experimentation
The purpose of this guided experimentation is to provide students with an opportunity to experiment with the code examples presented in the lecture. It is important to keep detailed observation notes as you work through the experiments below. These observations will be useful to you as you complete the labs and you will be allowed to reference them on open book / open note quizzes. You will not be required to turn in your observations.
## Getting Started
To get started on this activity, please clone this repository into your development environment
1. Copy the URL for this repo by clicking the green "Code" button above, select HTTPS then click the copy icon.
2. Open VSCode, click the Source Control icon then click Clone Repository.
3. Pasted the repo URL into the "Provide repository URL" field and press Enter
4. Browse to the location in your development environment where you want to store the repostory and click Select Repository Location.
5. When prompted, Open the repository then Open the workspace

## Expressions Experimentation
1. Open *ConversionFun.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Add code to output Volume 3 where volume3 is calculated as shown below. What is the result and why?  
    ```
    volume3 = PI * radiusCubed * (4 / 3);  
    ```
 
    - Add code to output Volume 4 where volume4 is calculated as shown below. What is the result and why?  
    ```
    volume4 = 4 / (3 * PI) * radiusCubed;  
    ```
            
1. Open *CookieFun.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Update the cookiesPerFriend expression as shown below. What is the result and why?  
    ```
    cookiesPerFriend = (double) (numCookies / numFriends);  
    ```

## Variable Experimentation
1. Open *Geometry.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Change the declaration for sides from an int to a double as shown below. What is the result and why?  
    ```
    double sides = 7; 
    ```
            
    - Modify the declaration for sides from to use the final operator as shown below. What is the result and why?  
    ```
    final double sides = 7;
    ```
            
1. Open *PianoKeys.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Modify the declaration for keys from to use the final operator as shown below. What is the result and why?  
    ```
    final int keys = 88; 
    ```
            
## String Experimentation
1. Open *Lincoln.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Declare a variable called quote to hold a String value as shown below. What is the result and why?  
    ```
    String quote;  
    System.out.println("Whatever you are, be a good one.");  
    ```

    - Initialize the quote variable using the existing text as shown below. What is the result and why?  
    ```
    String quote;  
    quote = "Whatever you are, be a good one.";
    System.out.println("Whatever you are, be a good one.");  
    ```
    
    - Update the final println() statement to use the String variable instead of the String literal. What is the result and why?  
    ```
    String quote;  
    quote = "Whatever you are, be a good one.";
    System.out.println(quote);  
    ```
1. Open *Facts.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Declare a variable called dialingCode to hold a int value as shown below. What is the result and why?  
    ```
    int dialCode;  
    System.out.println("Dialing code for Antarctica: " + 672);  
    ```

    - Initialize the dialCode variable as shown below. What is the result and why?  
    ```
    int dialCode;  
    dialCode = 672;
    System.out.println("Dialing code for Antarctica: " + 672);  
    ```
    
    - Update the final println() statement to use the int variable instead of the hardcoded value. What is the result and why?  
    ```
    int dialCode;  
    dialCode = 672;
    System.out.println("Dialing code for Antarctica: " + dialCode);  
    ```

## User Input Experimentation
1. Open *Echo.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Modify the line that reads input using the **nextLine()** Scanner method to use the **next()** Scanner method as shown below. What is the result and why?
    ```
    message = scan.next();
    ```

1. Open *Milage.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - When prompted for number of miles enter: **12.0**  What is the result and why?  

    - When prompted for number of miles enter: **12**, when prompted for the gallons of fuel used enter: **two**  What is the result and why?

    - When prompted for number of miles enter: **12**, when prompted for the gallons of fuel used enter: **2**  What is the result and why?


