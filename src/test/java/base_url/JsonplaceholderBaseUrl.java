package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class JsonplaceholderBaseUrl {
    protected RequestSpecification spec;

    @Before
    public void setup() {

        spec = new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com").build();
    }
/*
URI : URI, internette bir kaynak üzerine işaret edilmiş resim veya belge gibi klasik formata uygun bir karakter dizisidir.
URL : URL, bir kaynağın örnek konumlayıcı veya tek halde kaynak bulucu olarak tanımlanabilir.
 */
    /*
    Bulutluoz hocamız birde şöyle der :
"URL : Kullanıcının görebileceği ve etkileşimde bulunacağı bir web sayfasını ifade ederken
URI : o sayfanın içerdiği bilgiyi ifade eder " .
     */
}