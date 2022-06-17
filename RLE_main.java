import java.util.Scanner;

public class RLE_main {

	public static void main(String[] args) {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Veuillez introduire la chaine CH : ");
		//n = sc.nextInt();
		//System.out.println("N = "+n);
		String CH = new String(sc.nextLine());
		CH = CH.toUpperCase();
		System.out.println("CH = "+CH);
		
		int n = CH.length();
		
		int i=0;
		int conteur=1;
		
		String temp="0";
		String CH1 = "";
		while(i<n-1) {
			char a=CH.charAt(i);
			char b=CH.charAt(i+1);
			
			if(a==b ) {
				conteur++;
				if(conteur < 3) {
				   temp=temp + a;
				   //System.out.println("temp = "+temp);
				   temp=temp + b;
				   //System.out.println("temp = "+temp);
				  }
				
				
               }else {
            	   if(conteur < 3) {
            		   if(conteur == 1) {
            			   temp=temp + a;
            			   CH1= CH1.concat(temp);
            			   temp="0";
                 		   conteur=1;
            		   }else {
            		   CH1= CH1.concat(temp);
            		   temp="0";
             		   conteur=1;
            		   }
            	   }else {
            		   CH1 = CH1 + conteur;
            		   CH1 = CH1 + a;
            		   temp="0";
            		   conteur=1;
            	   }
            	   
               }
			if(i == n-2) {
				/*if(conteur < 3) {
         		   CH1= CH1.concat(temp);
         		   
         	   }else {
         		   CH1 = CH1 + conteur;
         		   CH1 = CH1 + a;
         		   
         	   }*/
				if(conteur < 3) {
         		   if(conteur == 1) {
         			   temp=temp + b;
         			   CH1= CH1.concat(temp);
         			   
         		   }else {
         		   CH1= CH1.concat(temp);
         		  
         		   }
         	   }else {
         		   CH1 = CH1 + conteur;
         		   CH1 = CH1 + a;
         		   
         	   }
				
			}
			i++;
		}
		
		
		System.out.println("CH1 = "+CH1);
		float n1 = CH1.length();
		float T = n1/n;
		System.out.println("Le taux de compression = "+CH1.length()+" / "+n+" = "+T*100+" %");
		
	
	}

}
