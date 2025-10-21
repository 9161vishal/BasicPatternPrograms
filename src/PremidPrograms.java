
public class PremidPrograms {
	public static void main(String[] args) {
		/*System.out.println("(1)");
		System.out.println();
		final int n=7;
		int il=(n/2)+1;
		int jl=n;
		int st=il;
		int en=il;
		for(int i=1;i<=il;i++) {
			for(int j=1; j<=jl;j++) {
				if((j>=st)&&(j<=en))
					System.out.print("*"+" ");
				else 
					System.out.print(" "+" " );
			}
			System.out.println();
			st--;
			en++;
		}
		
		System.out.println("(2)");         // =======================>	MY RAW LOGIC
		System.out.println();
		il=(n/2)+1;
		jl=n;
		st=1;
		en=n;
		for(int i=1;i<=il;i++) {
			for(int j=1; j<=jl;j++) {
				if((j>=st)&&(j<=en))
					System.out.print("*"+" ");
				else 
					System.out.print(" "+" " );
			}
			System.out.println();
			st++;
			en--;
		}*/
		

/*      MY OPTIMISE LOGIC
  
 (1)

            * 
          * * * 
        * * * * * 
      * * * * * * *         ------
    * * * * * * * * *             |
  * * * * * * * * * * *           v
* * * * * * * * * * * * * 
  
 */				
		System.out.println("(1)");
		System.out.println();
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" "+" ");
			}
			for(int k=1;k<=(2*i)-1;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
/*
 
 (2)

* * * * * * * * * * * * * 
  * * * * * * * * * * * 
    * * * * * * * * *     -------
      * * * * * * *              |
        * * * * *                v
          * * * 
            * 
 
 */	
		System.out.println("(2)");
		System.out.println();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" "+" ");
			}
			for(int k=1;k<=(2*i)-1;k++) {
				System.out.print("*"+" " );
			}
			
			System.out.println();
		}
		
	}
}
