package helpers;

public class GetPathName {
    public static String getPathName() {
        String path = System.getProperty("user.dir");
        return path;
    }

}