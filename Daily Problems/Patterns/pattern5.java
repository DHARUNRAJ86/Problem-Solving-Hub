public class pattern5 {
    public static void main(String[] args){
        int n=5;
        patterns(n);
    }
    public static void patterns(int n){
         for(int i=0;i<n;i++) {
        	 //spaces
        	 for(int j=0;j<n-i-1;j++) {
        		 System.out.print(" ");
        	 }
        	 //characters
        	 char ch='A';
        	 int breakPoint =(2*i+1)/2;
        	 for(int k=0;k<2*i+1;k++) {
        		 System.out.print(ch);
        		 if(k<breakPoint) {
        			 ch++;
        		 }
        		 else {
        			 ch--;
        		 }
        	 }
        	 System.out.println();
         }
    }
}
