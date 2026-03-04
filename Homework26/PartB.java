public class PartB {
//What is the output of the following program (and why)?
//The output is:
//Before: 0
//After: 0
//This is because in "class Item", the variable "value" is set equal to itself, and this is not restated or adjusted elsewhere in the code, so the value of "value" stays at the default value of 0.

//How would you change the program so that the output looks like the following:
//Before: 0
//After: 13
//To change the output to that, you would need to adjust "value = value;" to "this.value = value;", because in using "this.", you are specifying that the present value of the variable should be set equal to the NEW given value of the variable, which in this case is 13.
}