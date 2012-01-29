/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DearJohn;

/**
 *
 * @author 13giaconej
 */
public class Letter
{
    private String to, from, body;

    public Letter(String inFrom, String inTo)
    {
        to = inTo;
        from = inFrom;
        body = "Dear " +to+ ",\n\n";
    }

    public void addLine(String line)
    {
        body = body + line + "\n";
    }

    public String getText()
    {
        body += "\nKTHNXBYE,\n\n" +from+ "";
        return body;
    }


}
