class pattern8{
    public static void main(String[] args){
        int n=5;
        pattern(n);
    }
    public static void pattern(int n){
         int iniSpace=0;
    	 //up
         for(int i=0;i<n;i++) {
        	 //stars
        	 for(int j=0;j<n-i;j++) {
        		 System.out.print("*");
        	 }
        	 for(int k=0;k<iniSpace;k++) {
        		 System.out.print(" ");
        	 }
        	 for(int l=0;l<n-i;l++) {
        		 System.out.print("*");
        	 }
        	 iniSpace+=2;
        	 System.out.println();
         }
         //down
         int initialSpace=8;
         
         for(int i=0;i<n;i++) {
        	 for(int j=0;j<=i;j++) {
        		 System.out.print("*");
        	 }
        	 for(int k=initialSpace;k>0;k--) {
        		 System.out.print(" ");
        	 }
        	 for(int l=0;l<=i;l++) {
        		 System.out.print("*");
        	 }
        	 initialSpace-=2;
        	 System.out.println();
         }
    }
}