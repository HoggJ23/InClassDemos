import java.net.URL;
import java.util.Date;

public class Favorite{
    private String videoName;
    private Date date;
    private URL url;

    public Favorite(String name , String address){
            this.videoName = name;
            this.url = new URL(address);
            this.date = new Date();
    }

    @Override // Always add a override to a tostring method 
    public String toString() {
        String s = this . videoName + "" + this.date + "\n";
        s = s + url;
        return s;
    }


}