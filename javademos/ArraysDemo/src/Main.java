
public class Main {

	public static void main(String[] args) {             //düşük level'den yükseğe doğru kodlama şekilleri.
		String ogrenci1 = "Engin";
		String ogrenci2 = "Civan";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Derin";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		System.out.println("-------------------------");
		
		
		String[] ogrenciler = new String [4];
	    ogrenciler[0]="Engin";
	    ogrenciler[1]="Civan";
	    ogrenciler[2]="Salih";
	    ogrenciler[3]="Derin";
	    
	    for(int i=0;i<ogrenciler.length;i++){
	    	System.out.println(ogrenciler[i]);
	    }
		
		System.out.println("-------------------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
		

	}

}
