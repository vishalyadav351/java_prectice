# GSJ202

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Data Types

Lets look at some common data types found in programming problems for beginners

- Integer Integers are whole numbers that can be negative, zero or positive. Examples - 15, 0, -5
- Double A double will have a decimal place. Examples:- 4.5, -2.778 Note that 4.0, -2.0 are also doubles
- String Strings are a group of characters. Examples:- abcde, CodeChef, START69 Note that strings can also contain numerical characters. Examples:- a1b2c3d4, 532
- Array Arrays are used to store multiple variables (of the same datatype). Examples of arrays Array containing 6 integers - {1, 5, 7, 10, 15, 2} Array containing 4 strings - {"abcd", "d", "ccc", "c123"} Array containing a combination of string and integers cannot be created. You can only store elements of the same datatype in an array. Note that the strings in the array are enclosed inside inverted comma's like "abcd" - we will come to this at a later stage
### Task

Some data types have been added to the IDE.
Click on  **Submit**  in the IDE to proceed.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-01T10:37:10.172Z  

```java
// Click 'Submit' to view the result
class Codechef
{
	public static void main (String[] args)
	{
		int a = -5; // Integer variable
		System.out.println(a);
		
		double b = 4.0; // Double variable
		System.out.println(b);
		
		String s = "1234abc"; //String variable
		System.out.println(s);
		
		String[] array = {"1", "ab", "3", "name"}; // Array with string values
		System.out.print(array[0]);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/GSJ202)