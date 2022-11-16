package kata4;

import Loader.*;
import Histogram.*;
import java.io.File;

public class Kata4 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<String>();
        Loader loader = new Domain(new EmailsLoader(new FileLoader(new File("emails.txt"))));
        
        for (String emails: loader.load()){
            histogram.increment(emails);
        }
        HistogramDisplay histogramdisplay = new HistogramDisplay("Histogram Display", histogram);
        histogramdisplay.execute();
    }

}


