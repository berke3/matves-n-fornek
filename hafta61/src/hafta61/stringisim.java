package hafta61;

public class stringisim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String ad1= "Ali", ad2="ali", ad3="cemil";
		System.out.println(ad1 + ".compareTo(" + ad2 + ") : " + ad1.compareTo(ad2));
		System.out.println(ad1 + ".compareTo(" + ad3 + ") : " + ad1.compareToIgnoreCase(ad3));
		System.out.println(ad1 + ".compareTo(" + ad3 + ") : " + ad1.compareTo(ad3));
		System.out.println(ad1 + ".compareTo(" + ad3 + ") : " + ad1.compareToIgnoreCase(ad3));
		System.out.println(ad3 + ".compareTo(" + ad1 + ") : " + ad3.compareTo(ad1));
		System.out.println(ad3 + ".compareTo(" + ad1 + ") : " + ad3.compareToIgnoreCase(ad1));
		System.out.println(ad1 + ".compareTo(" + ad2 + ") : " + ad1.compareToIgnoreCase(ad2));
		System.out.println("ad3.chatAr(0)"+ad3.charAt(0));
		System.out.println("ad3.chatAr(2)"+ad3.charAt(2));
		System.out.println(ad3.codePointAt(0)); //ascii karşılığını verir
		String ad4="Nürşen",ad5="      ayşe      ",ad6 ="";
		System.out.println(ad4.codePointAt(1));
		System.out.println(ad4.codePointAt(3));
		
		System.out.println("|" + ad5 + "|");
		System.out.println("|" + ad5.trim() + "|");
		
		System.out.println(ad4.toUpperCase());
		System.out.println(ad4.toLowerCase());
		
		System.out.println(ad1+" "+ad2);
		System.out.println(ad1.concat(ad2));//iki stringi ekler
		
		System.out.println(ad4.indexOf('ş'));
		System.out.println(ad6.isEmpty());//boş mu dolumu gösterir
		System.out.println(ad4.length());*/
		String sehir = "ankara";
		System.out.println(sehir.indexOf('a'));
		System.out.println(sehir.indexOf('a',1));
		System.out.println(sehir.lastIndexOf('a'));
		System.out.println(sehir.replace('a','A'));//kücük a ola nher yeri büyük a ya çevirir
		System.out.println(sehir.startsWith("an"));//bununla başlıyor mu diye kontrol eder
		System.out.println(sehir.startsWith("na"));
		System.out.println(sehir.endsWith("ra"));
		System.out.println(sehir.endsWith("na"));
		
		String sehirAdları="Ankara İstanbul İzmir Bursa";
		String sehirler[] = sehirAdları.split(" ");
		System.out.println("---------------------");
		for (String ilAdi : sehirler) {
			System.out.println(ilAdi);
		}
		String sehirToplam="";
		for (String ilAdi : sehirler) {
			sehirToplam+=ilAdi+"/";
		}
		System.out.println(sehirToplam);
		String sehirler1[] = sehirAdları.split("/");
		
		char harfler[] = { 'N', 'u', 'r', 'a', 'y' };
		System.out.println(sehirler1.length);
		
		/*AD,CİNSİYET,MEDENİ DURUM , YAS , MAAŞ GİR
		LİSTELE
		İSİM ARAMA
		EVLİLERİN MAAŞ ORT
		ERKEKLERİN MAAŞ ORT
		EN BÜYÜK MAAŞLI KADIN BİLGİSİ
		EN KÜÜK YAŞ KİME AİT
		ÇIKIŞ
		HESAPLA*/
		
	}

}
