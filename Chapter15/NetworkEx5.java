import java.io.*;
import java.net.*;

public class NetworkEx5 {
    public static void main(String[] args) {
        URL url = null;
        InputStream in = null;
        FileOutputStream out = null;
        String address = "https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=school&step_word=&hs=0&pn=11&spn=0&di=7445700328764211201&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=2&ie=utf-8&oe=utf-8&in=&cl=2&lm=&st=-1&cs=3740303288%2C1378455383&os=2563996027%2C193720863&simid=3526273288%2C331455605&adpicid=0&lpn=0&ln=1387&fr=&fmq=1734944919813_R&fm=detail&ic=0&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=&height=&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=https%3A%2F%2Fwww.iscteachertraining.co.uk%2Fmedia%2F1225%2Fblundells_school.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Btfvpjwvij6p6wtgtg2_z%26e3Bv5_z%26e3B7hAzdH3Fu56-fvi55sfAzdH3Frw6ptvtrwptg2-fvi55sfAzdH3F&gsm=1e&rpstart=0&rpnum=0&islist=&querylist=&nojc=undefined&lid=7583250873708853212";
        int ch = 0;

        try {
            url = new URL(address);
            in = url.openStream();
            out = new FileOutputStream("image");

            while((ch=in.read()) != -1) {
                out.write(ch);
            }
            in.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}