import java.io.IOException;
import java.util.*;
import java.util.Scanner.*;

public class Einzelzeichen
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Tippen Sie ein Einzelzeichen ein: ");
        char einzelzeichen = (char) System.in.read();

        if (einzelzeichen >= 'A' && einzelzeichen <= 'Z') {
            System.out.println("Großbuchstabe");
        }
        if((einzelzeichen >= '0' && einzelzeichen <= '9') || (einzelzeichen >= 'a' && einzelzeichen <= 'f') || (einzelzeichen >= 'A' && einzelzeichen <= 'F')) {
            System.out.println("Hexadezimale Ziffer");
        }
        if(einzelzeichen == '0' || einzelzeichen == '1'){
            System.out.println("binäre Ziffer");
        }
        if(einzelzeichen >= '0' && einzelzeichen <= '7') {
            System.out.println("oktale Ziffer");
        }

    }
}
