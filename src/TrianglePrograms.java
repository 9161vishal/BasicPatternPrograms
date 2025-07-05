
public class TrianglePrograms {
	public static void main(String[] args) {
		final int n=5;
		System.out.println("(1)");
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=i) {
					System.out.print("*"+" ");
			    }
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n");
		System.out.println("(2)");
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j>=i) {
					System.out.print("*"+" ");
			    }
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		
		System.out.println("\n");
		System.out.println("(3)");
		System.out.println();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n;j++) {
				if(j<=i) {
					System.out.print("*"+" ");
			    }
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("\n");
		System.out.println("(4)");
		System.out.println();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n;j++) {
				if(j>=i) {
					System.out.print("*"+" ");
			    }
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("\n");
		System.out.println("(5)");
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=i) {
					System.out.print(j+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		

		System.out.println("\n");
		System.out.println("(6)");
		System.out.println();
		int num;
		for(int i=1;i<=n;i++) {
			num=i;
			for(int j=1;j<=n;j++) {
				if(j<=i) {
					System.out.print(num--+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		

		System.out.println("\n");
		System.out.println("(7)");
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				if(j<=i) {
					System.out.print(j+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("\n");
		System.out.println("(8)");
		System.out.println();
		for(int i=n;i>=1;i--) {
			int num1=1;
			for(int j=1;j<=n;j++) {
				if(j>=i) {
					System.out.print(num1+" ");
					num1++;
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("\n");
		System.out.println("(9)");
		System.out.println();
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=1;j<=n;j++) {
				if(j<=i) {
					System.out.print(ch+++" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
	
}
