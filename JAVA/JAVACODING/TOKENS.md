Tokens:
	The smallest unit of programming code / language , which is used to compose the instruction and give some meaningful to complier.

	Tokens can be classified into 4 types
		
		1)Keywords
		2)Identifiers
		3)Literals
		4)Separators

1)Keywords:
	
	Keywords are nothing but predefined words or reserved words.
	In java totally we are having 50+ keywords.
	Every keyword is having its own meaning that can be understandable only by the complier.
	Being a programmer we cant able to change the meaning of a Keywords

	EX: public , static , void , class etc....,
	
	NOTE:
		Keywords should be written in Lowercase.


2)Identifiers:

	The name given to the Java Component by the Programmer then it is said to be Identifier.


List of Java Components:

	* Class name
	* Variable name
	* Method name
	* Interface name
	* Enum name
	* etc...



Rules of an Identifier:

1. Identifiers should never start with a number, but we can use numbers in between or at the end.

   Examples (Invalid):

   class 7Ram {
       // ❌ Invalid
   }
   
   Examples (Valid):

   class Ram {
       // ✅ Valid
   }
   

2. Identifier should not have character space.

   Examples (Invalid):

   class Ram Krishna {
       // ❌ Invalid
   }

   Examples (Valid):

   class RamKrishna {
       // ✅ Valid
   }


3. Identifier will not accept any special characters.

   Examples (Invalid):

   class @Ram {
       // ❌ Invalid
   }

   class Ajay$ {
       //  valid
   }

   class Vin#as {
       // ❌ Invalid
   }



Invalid Identifier Examples:


class 4        // ❌ Invalid: Starts with a number
class -ram     // ❌ Invalid: Special character "-"
class @jay     // ❌ Invalid: Special character "@"
class Vin#as   // ❌ Invalid: Special character "#"
class -        // ❌ Invalid: Just a symbol


Note:

From Java 9, the underscore `_` `$` will be considered a keyword and cannot be used as an identifier.



4.Keywords cannot be used as identifiers:

Examples (Invalid):


class void    // ❌
class public  // ❌
class static  // ❌


Convention:
==========

> The company standards (or) coding standards to be followed by the programmer are known as conventions.

Convention for Class Names:

For Single Word Class Names:

* The first character should be in Uppercase
* Remaining characters should be in lowercase

Examples:

class Ram   // ✅ Recommended
class ram   // ✅ Valid, but not recommended by convention

For Multi-word Class Names (Convention):

* Every word's first character should be in uppercase.

Examples:

class VikramVedha   // ✅ Correct
class vikramVedha   // ❌ Not as per convention


Note:

* Rules are mandatory
* Conventions are optional but highly recommended for clarity and standard coding practices


3)Literals:

> The data or value used in a Java program is known as a Literal.

Types of Literals:

Literals can be classified into 2 types:

1. Primitive Literal
2. Non-Primitive Literal

Primitive Literal:

> A single value data is known as a primitive literal.

Primitive literals can be classified into 3 types:

* Number Literal
* Character Literal
* Boolean Literal

Number Literal:

> Number literals can be classified into 2 types:

1. Integer Literal
2. Decimal Literal (or Floating Literal)

Character Literal:

> A character literal represents a single character enclosed in single quotes (`' '`).

Examples:


'a'    // Valid
'1'    // Valid (character 1, not number)
'$'    // Valid


Invalid Examples


'ab'   // Invalid (more than one character)
'a1'   // Invalid
''     // Invalid (empty)


Boolean Literal:

> A boolean literal has only two possible values:
> `true` or `false`

Examples:

boolean flag = true;
boolean isJavaFun = false;


Notes:

* No quotes are used
* Case-sensitive (`True`, `FALSE` → invalid)

Non-Primitive Literal:

> A non-primitive literal represents complex types or reference types (not single values).

Examples:

* String values (enclosed in double quotes):


  "Hello"  
  "Java123"

* Array literals, Objects, etc.

Notes:

* Stored as references, not actual values
* Non-primitive types are created by the programmer or part of Java's class library

4)Separators in Java:

> Separators are symbols that help define the structure of a Java program.

Common Separators:

| Separator | Meaning                        |
| --------- | ------------------------------ |
| `;`       | Statement terminator           |
| `,`       | Separator between variables    |
| `.`       | Access member of class/object  |
| `()`      | Used in methods and conditions |
| `{}`      | Define block of code           |
| `[]`      | Array declaration or access    |


Examples:

int a, b, c;          // using comma (,)
System.out.println(); // using dot (.)





