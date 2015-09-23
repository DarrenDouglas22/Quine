# Quine
A java program that prints itself

The process of writing a self-printing program was a lot less linear than I anticipated. I chose to work in Java because it is the high-level language that I have the most experience with.I spent a good amount of time early on trying to wrap my head around the idea before diving in and I knew working with another language would have required even more work to relearn. I also did not have a great idea of what tools or libraries this assigment might require, and I knew it wouldn't hurt to use a language with so much open documentation.
 My first thought was to start by printing a string. I quickly realized that I needed some source code to accompany my string if I wanted to not only to print the string, but to print the code that prints the string. This then developed into me making an array of strings to contain the source code, with each line being its own string in the array. When I printed the array, I realized that I successfully printed the source code, but I needed a way to print the string's initialization and contents as well. I first hardcoded print output of the first few lines of my code, the string array, and the last few lines of my code. This resulted in correct output for the first few lines of my code and the last few lines of my code, but not for the string array. To fix this, I needed to loop through the string array to print the lines based on the format I wanted. Here are my for loops I used:  

		for (int i = 0; i < 5; i++) {System.out.println(myCode[i]);	}	

		for (int i = 0; i < myCode.length ; i++) {System.out.println(q+myCode[i]+q+c);}

		for (int i = 5; i < myCode.length; i++) {System.out.println(myCode[i]);}

This allowed me to efficiently print out the string array and the code surrounding it. After getting some decent output on the terminal, the final stretch was in precise formatting to make sure my output was character for character identical to my input. This resulted in the use of the quotation mark and comma ASCII values to include in my program. In the end, I feel like I now not only have a better understanding of Java, but also in formatting and I/O.
