package TestMaven;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class App
{
    final static Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        BasicConfigurator.configure();
        logger.info("This is info");
        logger.warn("This is warn");
        logger.error("This is error");
        logger.fatal("This is fatal");
    }
}
