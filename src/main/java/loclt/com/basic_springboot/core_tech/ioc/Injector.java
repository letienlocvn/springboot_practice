package loclt.com.basic_springboot.core_tech.ioc;

import javax.management.InstanceNotFoundException;
import javax.management.OperationsException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Injector {
    private static final String  IOC_CONFIGURATION_FILE_NAME = "src/main/resources/iocDemo.properties";

    public Injector() {
//        throw new UnsupportedOperationException();
    }

    public static Object getInstance(String key) throws InstanceNotFoundException {
        try (InputStream input = new FileInputStream(IOC_CONFIGURATION_FILE_NAME)) {
            // load a properties file
            Properties prop = new Properties();
            prop.load(input);

            // get the property value
            String className = prop.getProperty(key);
            Class classShoes = Class.forName(className);
            return classShoes.getDeclaredConstructor().newInstance();
        } catch (IOException | InstantiationException | IllegalAccessException | ClassNotFoundException |
                 NoSuchMethodException e) {
            e.printStackTrace();
            throw new InstanceNotFoundException(
                    "Can't create instance of " + key + " base on the configuration of " + IOC_CONFIGURATION_FILE_NAME);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

}
