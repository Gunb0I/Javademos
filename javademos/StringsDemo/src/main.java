import javax.sound.midi.SysexMessage;

public class main {

	public static void main(String[] args) {
		String mesaj = "Bugun hava çok güzel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı : " + mesaj.length());
		System.out.println("5.eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.startsWith("b"));//Java küçük harfler ve büyük harflere duyarlı bir dildir.
		System.out.println(mesaj.endsWith("."));
		
		char[] karakterler = new char[8];        //.getChars komutu istisna olarak son söylenen charı almaz, bir fazlası yazılmalıdır doğru sonuç için.
		mesaj.getChars(0, 8, karakterler, 0);    //Nereden başlıyayım /nereden bitireyim/ hangi değişkene getireyim/başlangıç noktam
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf('a'));  //Bir metnin içindeki karakteri ve ya karakterlerin sayı numarasını bulur.
		System.out.println(mesaj.indexOf("çok"));//Metinde bulduğu ilk karakteri verir. Sonrakileri önemsemez.
		System.out.println(mesaj.lastIndexOf("av"));//Karakteri aramaya en sağdan yani sondan başlar.
		System.out.println(18);
	}

}
