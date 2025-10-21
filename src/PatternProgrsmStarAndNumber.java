public class PatternProgrsmStarAndNumber {
	public static void main(String[] args) {
		
/*
 * (1)

1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3    -----
4 4 4 4 4         |
5 5 5 5 5         v

 * */ 
		System.out.println("(1)");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
/*
* (2)

1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5    ----
1 2 3 4 5        |
1 2 3 4 5        v

* */
		System.out.println("(2)");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
/*
(3)

1 1 1 1 1 
0 0 0 0 0 
1 1 1 1 1    ------
0 0 0 0 0          |
1 1 1 1 1          v
       
 * */
		System.out.println("(3)");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i%2+" ");
			}
			System.out.println();
		}

/*
(4)

1 0 1 0 1 
1 0 1 0 1 
1 0 1 0 1   --------
1 0 1 0 1           |
1 0 1 0 1           v

*/
		
		System.out.println("(4)");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j%2+" ");
			}
			System.out.println();
		}

/*
 (5)

1 0 1 0 1 
0 1 0 1 0 
1 0 1 0 1     -------
0 1 0 1 0            |
1 0 1 0 1            v

 * */
		
		System.out.println("(5)");
		System.out.println();
		for(int i=0;i<=4;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print((i+j)%2+" ");
			}
			System.out.println();
		}
		
/*
(6)

0 1 0 1 0 
1 0 1 0 1 
0 1 0 1 0     -------
1 0 1 0 1            |
0 1 0 1 0            v

 * */	
		System.out.println("(6)");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print((i+j)%2+" ");
			}
			System.out.println();
		}
		
/*
(7)

5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1     -----
5 4 3 2 1          |
5 4 3 2 1          v
  
*/
		
		System.out.println("(7)");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
/*
(8)

1 2 3 4 5 
2 3 4 5 6 
3 4 5 6 7     -----
4 5 6 7 8          |
5 6 7 8 9          v
  
 */
		
		int num;
		System.out.println("(8)");
		System.out.println();
		for(int i=1;i<=5;i++) {
			num=i;
			for(int j=1;j<=5;j++) {
				System.out.print(num+++" ");
			}
			System.out.println();
		}
		
/*
(9)

a b c d e 
f g h i j 
k l m n o     ------
p q r s t           |
u v w x y           v
 
 */		
		char ch='a';
		System.out.println("(9)");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(ch+++" ");
			}
			System.out.println();
		}
		

/*
(10)

A B C D E 
F G H I J 
K L M N O   ------ 
P Q R S T         |
U V W X Y         v
 
 */
		char c='A';
		System.out.println("(10)");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(c+++" ");
			}
			System.out.println();
		}
	}
}
