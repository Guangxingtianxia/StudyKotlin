package net.print.o3.thread.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClientOp
{
    public static String doGet(String httpUrl)
    {
        HttpURLConnection connection = null;
        InputStream is = null;
        //
        BufferedReader br = null;
        String result = null;
        try
        {
            URL url = new URL(httpUrl);
            connection = (HttpURLConnection) url.openConnection();
            // conn type
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(15000);
            connection.setReadTimeout(60000);
            // send http request
            connection.connect();

            if (connection.getResponseCode() == 200)
            {
                is = connection.getInputStream();
                // 封装输入流is，并指定字符集，
                br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                // 存放数据
                StringBuffer sbf = new StringBuffer();
                String temp = null;
                while ((temp = br.readLine()) != null)
                {
                    sbf.append(temp);
                    sbf.append("\r\n");
                }

                result = sbf.toString();
            }


        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            // close resource
            if (br != null)
            {
                try
                {
                    br.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }

            if (is != null)
            {
                try
                {
                    is.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }

            // turn off network connection
            connection.disconnect();

        }


        return result;
    }


}
