import java.net.*;

class NetworkEx2 {
    public static void main(String[] args) throws Exception {
        URI uri = new URI("https://baijiahao.baidu.com/s?id=1819205409613024873");
        URL url = uri.toURL();

        System.out.println("url.getAutority():" + url.getAuthority());
        System.out.println("url.getContent():" + url.getContent());
        System.out.println("url.getDefaultPort():" + url.getDefaultPort());
        System.out.println("url.getPort():" + url.getPort());
        System.out.println("url.getFile():" + url.getFile());
        System.out.println("url.getHost():" + url.getHost());
        System.out.println("url.getPath():" + url.getPath());
        System.out.println("url.getProtocol():" + url.getProtocol());
        System.out.println("url.getQuery():" + url.getQuery());
        System.out.println("url.getRef():" + url.getRef());
        System.out.println("url.getUserInfo():" + url.getUserInfo());
        System.out.println("url.toExternalForm():" + url.toExternalForm());
        System.out.println("url.toURI():" + url.toURI());
    }
}
