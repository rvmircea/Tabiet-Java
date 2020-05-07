import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class AppUsersDbOperations {

    Properties properties;
    FileInputStream input;
    Connection myConn;

    public AppUsersDbOperations() {
        this.properties = new Properties();
        this.input = null;
        this.myConn = null;
    }

}
