package com.grandland.autoupdate.client;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by yestin on 2015/12/14.
 * 主类
 */
public class ClientMain {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        FileReader fr = new FileReader("conf/updater.properties");
        props.load(fr);
        fr.close();

        ClientUpdater updater = new ClientUpdater(
                Integer.valueOf(props.getProperty("client.version")),
                props.getProperty("client.downloadPath"),
                props.getProperty("service.updateServer"),
                Integer.valueOf(props.getProperty("service.updateInterval")),
                Integer.valueOf(props.getProperty("service.timeout")));
        updater.update();

    }
}
