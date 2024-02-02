import java.io.*;
import java.net.*;
import org.apache.http.HttpEntity;
import org.apache.http.client.*;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.*;

public class Client1
{
    public static void main(String[] args)
	{
        try
		{
            if (args.length < 1) {
                System.out.println("Usage: java ClientHTTP <hostname>");
                System.exit(1);
            }

			CloseableHttpClient client = HttpClients.createDefault () ;
			String url = " http :// " + args [0];
			HttpGet request = new HttpGet ( url ) ;


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

