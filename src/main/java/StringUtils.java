public class StringUtils {

    String prepareString(String stringToBePrepared){
        String a = stringToBePrepared.replaceAll("[\\s\\W]+", "").toLowerCase();
        return a;
    }
}
