
public class DiamondProgram {
	public static void main(String[] args) {
/*             1
                     * 
                   * * * 
                 * * * * * 
               * * * * * * *   ------
                 * * * * *           |
                   * * *             v
                     * 
 * */
		int n=7,sp=n/2,str=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=str;k++) {
				System.out.print("* ");
			}
			System.out.println();
			if(i<=n/2) {
				sp--;
				str=str+2;
			}
			else {
				sp++;
				str=str-2;

			}
		}
		
/*
 * 2
              * * * * * * * 
                * * * * * 
                  * * * 
                    *        ----
                  * * *          |
                * * * * *        v
              * * * * * * * 
 * */
		n=7;sp=0;str=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=str;k++) {
				System.out.print("* ");
			}
			System.out.println();
			if(i<=n/2) {
				sp++;
				str=str-2;
			}
			else {
				sp--;
				str=str+2;

			}
			
		}
		
		

/*           *               * 
             * *           * *   -----
             * * *       * * *        |
             * * * *   * * * *        v
 */
		
		System.out.println('\n');
		System.out.println("2\n");
		n=5;int spc=(n*2)-3;
		for(int i=1;i<=n-1;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int k=1;k<=spc;k++) {
				System.out.print("  ");
			}
				
				for(int l=1;l<=i;l++) {
					System.out.print("* ");
			}
			System.out.println();
			spc=spc-2;
			
		}
		System.out.println(spc);
		for(int i = 0; i < spc; i++) {
			System.out.print("* ");
		}
	}
}
