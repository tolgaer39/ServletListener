package _05_Session;

public class SessionNotes {
	
	// javaya ozgu degildir...
	/* web uygulamalar�nda bircok istemci/client olacakt�r.
	 * ve s�reli bir request/response(istek-cevap) olacaktir...
	 * http durumsuz/stateless protokoldur.
	 * 1-tarayici server ile baglanti kurar
	 * 2-istekte buulunur- request
	 * 3-server response doner
	 * 4-server ile client aras�nda baglanti kapanir
	 * 5-bu durum her request icin tekrar edilir...
	 * 
	 * cilent server arasinda baglanti kalici- persistent degildir.
	 * clienti her seferinde tanimaz, daha once istekte bulunup bulunmad�g�na bakmaz...
	 * 
	 * 
	 * Session ayni client �n birden fazla requesti icin devamlilik saglar...
	 * Bunu HttpSession objesi ile saglayabiliriz...
	 * 
	 * 
	 *  client ilk defa geldiginde: bir istekte bulundugunda servlet container unique/tekil bir Sessionid bilgisi olsuturur 
	 *  ve bunu cevaba response 'a ekler.
	 * client tekrar gelisinde: bir istekte bulundugunda artik elinde bir SessionId bilgisi vardir. Bu sessionid bilgisinide gonderir.
	 * 
	 * Session ID bilgisi: Cookie �zerinden tasinir.
	 * Cookie tarayiciya eklenen kucuk bilgilerdir. name, value seklinde 
	 * 
	 * 
	 * HttpSession objesi olusturma
	 * Unique/tekil bir SessionId olusturma
	 * Cookie objesi olusturma
	 * SessionId ile cookie objesini iliskilendirme
	 * Cookiyi response cevaba ekleme gibi gorevlerden Servlet Container sorumludur..
	 * 
	 * 	 * */

}
