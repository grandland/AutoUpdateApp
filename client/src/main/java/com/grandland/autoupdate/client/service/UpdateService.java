package com.grandland.autoupdate.client.service;

import com.grandland.autoupdate.client.bean.UpdateResponse;

/**
 * Created by yestin on 2015/12/14.
 * 用于检查更新程序的服务。
 */
public class UpdateService {

    private String requestBaseUrl = null;
    private int checkInterval = 60 * 60 * 1000; //milliseconds
    private int timeout = 3000; //milliseconds.

    public UpdateService(String requestBaseUrl) {
        this.requestBaseUrl = requestBaseUrl;
    }

    public UpdateService(String requestBaseUrl, int checkInterval, int timeout) {
        this.requestBaseUrl = requestBaseUrl;
        this.checkInterval = checkInterval;
        this.timeout = timeout;
    }

    /**
     * 判断是否需要更新的方法
     * @return  null if timeout; UpdateResponse entity otherwise.
     * */
    public UpdateResponse requestUpdate(int version){
        //TODO request url
        //TODO parse response json to object.
        return null;
    }

    /**
     * 下载
     * @return localPath 下载后的本地文件地址
     * */
    public String download(String localPath, String remotePath){
        //TODO download
        return null;
    }


}
