import java.util.regex.*;
class RegEx3
{	
public static void main(String args[])
{
	System.out.println(Pattern.matches(".s","as"));// true( 2nd character is s
	System.out.println(Pattern.matches(".s","mst"));//false(has more than 2 char)
	System.out.println(Pattern.matches("..s","mas"));//true(3rd character is s)

	System.out.println(Pattern.matches("[amn]","abcd"));//false(not a or m or n)//
	System.out.println(Pattern.matches("[amn],"a"));//true(among a or m or n)
	System.out.println(Pattern.matches("[amn]","ammmmnaa"));//false

	//quantifiers
	System.out.println(Pattern.matches("[amn]?",a)); //true
	System.out.println(Pattern.matches("[amn]?,"am" ));//false (a or m or n must come one time)
	System.out.println(Pattern.matches("[amn]+","aammmnnn")); //true (a or m or n comes more than once)
	System.out.println(Pattern.matches("[amn]+","aazzta" ));//false(z or t are not matching pattern)

	System.out.println(Pattern.matches("[amn]*","ammmna" ));
	System.out.println(Pattern.matches("true(a or m or n may come zero or more time ));


	