import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
public class SaveImageFromURL
{

    public static void main(String[] args) throws IOException
    {
        String seite = "<body id=\"www-wikipedia-org\">"
                + "<div class=\"central-textlogo\">"
                + "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
                + "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\">"
                + "</div>"
                + "</body>";

        int indexAnfang = seite.indexOf("src=\"") + 5;
        int indexEnde = seite.indexOf("></div>");
        System.out.println(indexAnfang);
        System.out.println(indexEnde);
        String downloadUrl = seite.substring(indexAnfang, indexEnde);
        System.out.println(downloadUrl);

            URL url = new URL(downloadUrl);
        BufferedImage image = ImageIO.read(url);
        ImageIO.write(image, "png", new File("bild.png"));
    }
}
