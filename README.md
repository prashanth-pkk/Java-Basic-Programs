4. The program prints number of arguments, if no arguments are provided, it prints nothing.
5. to convert a char array to a String using the String constructor.
6. recursive calls
7. The startsWith() method is case-sensitive.
8. reverse() method is used to reverse the String
9. byte type in Java has a range of -128 to 127. the 257 % 256 = 1, the res = 1.
10. Math.pow(base, exponent) is a versatile method for performing exponentiation in Java.
11. Zero exponent, negative exponents, Negative base with fractional exponent.
12. The Math.ceil(x) method rounds up to the nearest integer.
13. If the length is not known or cannot be determined, getContentLength() returns -1
14. reveres() and sort() methods are performed
15. The add() method is used to add elements to the ArrayList.
    The add(index, element) method is used to insert an element at a specified position in the ArrayList.
16. add() called twice  because of type compatibility and promotion rules in Java.
17. combination of int, double in array
18. double increment
19. Since v1 is true, the if block is executed, and true is printed to the console. The else block does not execute because the if condition is satisfied.
20. The expression var & var2 evaluates to false because the bitwise AND (&) operator returns true only when both operands are true
21. The ordinal() method is a method of the Enum class. It returns the ordinal value of the constant, which is the position of the constant in the enum declaration (starting from 0).
22. When you define an enum with constants like A, B, and C, these constants are created and initialized when the enum type is loaded by the JVM.
    Enums in Java are instantiated only once (for each constant) at the time the class is loaded. When you access an enum constant (like Program22.B), all the enum constants (including A, B, and C) are initialized, and their constructors are executed.
23. due to floating-point precision, BigDecimal, which provides accurate decimal representations and avoids floating-point errors.
24. for loop
25. The Math.sqrt() function correctly computes the square root of the sum of the squares.
26. char
27. When you cast a double or int to byte in Java, if the value exceeds the range of the byte type (-128 to 127), it wraps around due to overflow, resulting in values within the valid byte range.
28. compile time error due to final method can't be override in the child class.
29. This code reads the command-line arguments passed to the program and prints each one in the first row of a 2D array (argument[0]). If no arguments are passed, no output will be produced.
30. args[0] is correct and should be used to access the first element of an array.
31. class name@hexadecimal value
32. for loop
33. for loop
34. for loop
35. for loop
36. for loop
37. for loop
38. for loop
39. The modulo(%) operation returns the remainder.
40. increment operators(++).
41. bitwise negation operator (~).
42. bitwise OR operator, bitwise AND operator
43. right shift operator, it shifts the bits of the number to the right, effectively dividing the number by 2 for each shift (dropping the remainder in the case of integer division).
44. Bitwise OR(1) , Right shift(>>), Left shift(<<)
45. a = true and b = false.
    c = a | b → true | false → true.
    d = a & b → true & false → false.
    e = d ? b : c → Since d is false, e = c → true.
46. Ternary Conditional Operator(?)
47. if-else condition
48. The ^ operator is the bitwise XOR (exclusive OR) operator for booleans. The result of the XOR operation is true if the operands are different, and false if they are the same.
49. If statement
50. for loop
51. if-else statement
52. Compile time error
53. if-else statement
54. if-else statement
55. Compile time error, the variables with same name can't be created in a class.
56. Compile time error, height variable is not declared in the Area class.
57. Compile time error, If parent class constructor throws checked exception, then child class must declare same exception otherwise fails compile time error.
58. Compile time error
59. Method overloading
60. Local variable
61. Localvariable
62. Access to x: The x variable is public, so it's directly accessible from the main method in Program62. The value x = 3 is printed.
    Access to y: The y variable is private, but you're accessing it correctly from the print() method within the same class (Demo1), so it prints y = 2.
63. Since both p and p1 share the same static variables.
64. Since x is a static variable, any modification to x affects all instances of the class. After both increment() calls, the value of x is 2, and this value is printed for both d.x and d1.x.
65. increment operator
66. Recursion, base case of the recursive function is not defined.
67. Recursive function
68. Recursion
69. Array
70. Array
71. compile time error, The class K is an inner class of Program71, which means it cannot be instantiated directly in the main method unless an instance of the outer class Program71 is created first.
    This is because in Java, non-static inner classes require an instance of their outer class to be instantiated.
72. Inner class
73. equals() method
74. getClass() method
75. inheritance
76. The superclass method display() is not called because you're calling the display() method of the subclass J. Method overriding happens when a subclass provides a new implementation for a method that is already defined in the superclass. When you call the method, Java uses the subclass's version of the method (because you’re working with an instance of the subclass).
If you want to call the superclass method explicitly, you can do so using the super keyword inside the subclass.
77. Inheritance
78. NullPointerException
79. getChars() method
80. indexOf() method
81. for loop
82. StringBuffer
83. isInfinite()
84. toBinaryString()
85. arraycopy()
86. System.exit() is a command in Java that terminates the running Java program and exits the JVM (Java Virtual Machine).
87. compareTo() method compares two Double objects based on their numeric values.
88. CharArrayReader to read from a char array and compare characters from two different readers.
89. ArithmeticException
90. try-catch
91. compile-time exception
92. try-catch
93. get class name
94. This happens because now the run() method in class T is invoked when the thread starts.
95. get current date and time
96. BitSet class
97. ArithmeticException
98. The catch block only catches ArithmeticException, but since a NullPointerException is thrown, the catch block does not get executed.
    This leads to an uncaught exception, causing the program to terminate and print the exception's stack trace.
99. try-finally block
100. Custom exception



