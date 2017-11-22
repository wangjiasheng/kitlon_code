package wjava;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Java {
    public static void main(String[]args)
    {
        String danhao="3963220195978";
        String token="";
        String urlstr="https://sp0.baidu.com/9_Q4sjW91Qh3otqbppnN2DJv/pae/channel/data/asyncqury?cb=jQuery110205434270565948369_1511337024280&appid=4001&com=&nu="+danhao+"&vcode=&token=&_=1511337024281";
        System.out.println(urlstr);
        try {
            URL url=new URL(urlstr);
            HttpURLConnection urlConnection= (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setRequestProperty("Cookie","BIDUPSID=7C7483A04C333D368CA5C47BDA16C7B0; PSTM=1502329011; BDUSS=3ZSU0p5akt2VXEwU1dTMzlWSU1mU1F0T0dpRjRFelFUS2hXR08ySlhuQVFHTXRaSVFBQUFBJCQAAAAAAAAAAAEAAAA06qkdMzE0MjMyMzMyAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABCLo1kQi6NZZ; __cfduid=d84e1f1d15aaa0f9e0ccc3742c260f0351506683582; BAIDUID=6B82B709B0D55B639CBF40A1E7514DE2:FG=1; MCITY=-%3A; BDRCVFR[feWj1Vr5u3D]=I67x6TjHwwYf0; BDORZ=B490B5EBF6F3CD402E515D22BCDA1598; PSINO=1; H_PS_PSSID=1463_21083_17001_20881_25178_25145_22158");
            byte[] bytes=new byte[1024];
            int len=-1;
            InputStream inputStream=urlConnection.getInputStream();
            while((len=inputStream.read(bytes))!=-1)
            {
                System.out.println(new String(bytes,0,len,"utf-8"));
            }
            inputStream.close();
            urlConnection.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
