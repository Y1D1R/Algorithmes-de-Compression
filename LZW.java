import java.util.Scanner;

public class LZW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a;
		Scanner sc = new Scanner(System.in);
		System.out.print("veuillez introduire votre chaine : ");
		String CH = new String(sc.nextLine());
		int len=255 + CH.length();
		//creation du dictionnaire
		String[] D = new String[len] ;
		//initialisation du dictionnaire
		for(int i=0; i<=255 ; i++) {
			 a = (char) i;
			 D[i]=a+"";
		}
		for(int i=256 ; i<len ; i++) {
			D[i]="";
		}
		
		
		//Algorithme LZW
		String W = CH.charAt(0)+"";
		for(int i=1 ; i<CH.length() ; i++) {
			String aa = CH.charAt(i)+"";
			int in =indice(W.concat(aa), D , len);
			//si w+a n'est pas dans D
			if(in == -1) {
				System.out.print(indice(W+"",D,len)+" ");
				ajouter(W.concat(aa),D,len);
				W=aa;
			}else {
				W = W.concat(aa);
			}
		}
		
		System.out.print(indice(W+"",D,len));
	
		
		
		
		
	
	}
	
	
	public static int indice(String ch , String[] D , int len) {
		
		for (int i=0;i<len;i++) {	
			if(ch.equals(D[i])) {
				return i;
				
			}
		}
		return -1;
	}
	
	public static void ajouter(String ch , String[] D,int len) {
		int i =0;
		boolean b = false;
		while(b==false) {
		if(D[i] == "") {
			D[i] = ch;
			b=true;
		}else {
			i++;
		}
		}
	}
	
	public static void afficher( String[] D,int len) {
		System.out.println("\n Affichage du Dictionnaire ");
		for (int i=0;i<len;i++) {
			System.out.println(" D[ "+i+" ] = "+D[i]);
		}
	}

}
