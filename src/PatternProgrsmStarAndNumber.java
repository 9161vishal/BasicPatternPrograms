//For this code just copy and paste
public class PatternProgrsmStarAndNumber {
	public static void main(String[] args) {
		System.out.println("(1)");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("(2)");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("(3)");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("(4)");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("(5)");
		System.out.println();
		for(int i=0;i<=4;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print((i+j)%2+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("(6)");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print((i+j)%2+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("(7)");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
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
		
		
		char ch='a';
		System.out.println("(9)");
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(ch+++" ");
			}
			System.out.println();
		}
		
		
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
