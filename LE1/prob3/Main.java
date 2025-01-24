/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Mother m1=new Mother();
		m1.show();
	}
}


// when only mother show() function is static error: overridden method is static.
// when only child show() function is static error: overriding method is static
// when both show() function are static output: Show of mother is called.