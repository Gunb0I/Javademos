
public class main {

	public static void main(String[] args) {
		//For
		for(int i=1;i<10;i++) {                //i<=10  küçük eşittir olur yani 10'u da saymasını sağlarız.
			System.out.println(i);             //for döngüsünde i ayrı while döngüsünde i ayrı çalışır. Yani while döngüsü yazarken yeni bir i belirtilmelidir. Önceki i komutu öncekinde kalmıştır.
		}
		
		System.out.println("For Döngüsü bitti efendim.");
		
		int i=1;         
		
		//While
		while(i<=10) {
			System.out.println(i);
			i+=2;		
		}
		System.out.println("While döngüsü bitti.");		
		
		
		//DoWhile
		int j=100;             //DoWhile döngüsü her zaman çalışır. 
		do{
			
			System.out.println(j);
			j+=2;
			
		}while(j<10);
		System.out.println("Do-While döngüsü bitti.");	
			
			
		
				
			
			
			
			
			
		
   }


}
