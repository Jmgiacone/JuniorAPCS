/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package WebReader;

import java.io.*;
import java.net.*;

/**
 *
 * @author 13giaconej
 */
public class WebsiteReader
{
    public static void main(String[] args)
    {
        try
        {
            // Create a URL for the desired page    URL url = new URL("http://www.cinndev.com/testFile.txt");     BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));    String str;    while ((str = in.readLine()) != null) {        System.out.println(str);    }    in.close();} catch (MalformedURLException e) {} catch (IOException e) {}try {
            // Create <strong class="highlight"><vb_highlight>a</strong></vb_highlight> URL for the desired page
            URL url = new URL("http://www.cinndev.com/testFile.txt");

            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String str;
            while ((str = in.readLine()) != null)
            {
                System.out.println(str);
            }
            in.close();
        }
        catch (MalformedURLException e)
        {
        }
        catch (IOException e) {
    }
    }
}
