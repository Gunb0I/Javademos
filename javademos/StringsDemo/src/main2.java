import javax.management.MBeanRegistrationException;

public class main2 {

	public static void main(String[] args) {
		String mesaj = "Bugun hava çok güzel.";
		System.out.println(mesaj);
		
		System.out.println(mesaj.replace(" ", "-")); //mevcut değişkenin içeriğini değiştirmeye yarar
		System.out.println(mesaj);
		
		String yeniMesaj = mesaj.replace(" ", "-");  //değiştirilen değşkenle devam etmek için, değiştirilen değişken yeni değişkene atanmalıdır.
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2));      //metindeki seçili yerden kesmeyi sağlar.
		System.out.println(mesaj.substring(2,5));    //aynı metodun daha detaylı kesme şekli.
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		
		System.out.println(mesaj.toLowerCase());     //metindeki tüm kelimeleri küçük harfe dönüştürür.
		System.out.println(mesaj.toUpperCase());     //metindeki tüm keilemeier büyük harfe dönüştürür.
		}
		
		System.out.println(mesaj.trim()); //kaynaktan gelen verilerin başında ve sonunda boşlıklar varsa temiz sayfaya çekmesi ve gereksiz boşlukları ortadan kalrıması için kullanılır.
		
	
	}

}
