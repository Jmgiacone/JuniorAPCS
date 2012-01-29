/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DearJohn;

/**
 *
 * @author 13giaconej
 */
public class LetterTimChoher
{
    public static void main(String[] args)
    {
        Letter dearTim = new Letter("Jordan \"El Jefe\" Giacone", "Tim Choh");

        dearTim.addLine("I know that we haven't spoken in a while...");
        dearTim.addLine("I feel as if we're drifting apart...");
        dearTim.addLine("I can't live this lie no more.");
        dearTim.addLine("I don't want to be with you anymore...");

        System.out.println(dearTim.getText());
    }
}
