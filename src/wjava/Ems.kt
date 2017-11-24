package wjava

import com.google.gson.JsonObject
import org.json.JSONArray
import org.json.JSONObject
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.MalformedURLException
import java.net.URL
import java.text.SimpleDateFormat
var number:String="3963220195978";
//申通快递
fun main(args: Array<String>) {
    var urlstr: String = "https://sp0.baidu.com/9_Q4sjW91Qh3otqbppnN2DJv/pae/channel/data/asyncqury?cb=jQuery110205434270565948369_1511337024280&appid=4001&com=&nu=$number&vcode=&token=&_=1511337024281"
    var result: String? = null;
    try {
        val url = URL(urlstr);
        val urlConn = url.openConnection() as HttpURLConnection
        urlConn.connectTimeout = 5000//超时时间
        urlConn.requestMethod = "GET"
        urlConn.setRequestProperty("Cookie", "BIDUPSID=7C7483A04C333D368CA5C47BDA16C7B0; PSTM=1502329011; BDUSS=3ZSU0p5akt2VXEwU1dTMzlWSU1mU1F0T0dpRjRFelFUS2hXR08ySlhuQVFHTXRaSVFBQUFBJCQAAAAAAAAAAAEAAAA06qkdMzE0MjMyMzMyAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABCLo1kQi6NZZ; __cfduid=d84e1f1d15aaa0f9e0ccc3742c260f0351506683582; BAIDUID=6B82B709B0D55B639CBF40A1E7514DE2:FG=1; MCITY=-%3A; BDRCVFR[feWj1Vr5u3D]=I67x6TjHwwYf0; BDORZ=B490B5EBF6F3CD402E515D22BCDA1598; PSINO=1; H_PS_PSSID=1463_21083_17001_20881_25178_25145_22158");
        val `in` = InputStreamReader(urlConn.inputStream);
        val buffer = BufferedReader(`in`)
        var inputLine: String? = null;
        result = ""//每次清空数据
        while (buffer.readLine().apply { inputLine = this } != null) {
            result += inputLine!! + "\n"
        }
        `in`.close()
        urlConn.disconnect()
        var indexof = result.indexOf("(");
        var result = result.substring(indexof);
        var json = result.substring(1, result.length - 2);
        var jsonobj = JSONObject(json)
        var data = jsonobj.get("data") as JSONObject
        var info = data.getJSONObject("info");
        var context = info.getJSONArray("context") as JSONArray
        for(x in context.length()-1 downTo  0)
        {
            var item=context.getJSONObject(x);
            var time=item.getString("time")
            var desc=item.getString("desc")
            var format=SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
            var resulttime=format.format(time.toLong()*1000)
            println("$resulttime  $desc")
        }

    } catch (e: MalformedURLException) {
        e.printStackTrace();
    } catch (ioe: IOException) {
        ioe.printStackTrace();
    } finally {

    }
}