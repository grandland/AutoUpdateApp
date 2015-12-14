package com.grandland.autoupdate.client.service;

import com.grandland.autoupdate.client.bean.UpdateResponse;

/**
 * Created by yestin on 2015/12/14.
 * ���ڼ����³���ķ���
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
     * �ж��Ƿ���Ҫ���µķ���
     * @return  null if timeout; UpdateResponse entity otherwise.
     * */
    public UpdateResponse requestUpdate(int version){
        //TODO request url
        return null;
    }

    /**
     * ����
     * */
    public void download(String localPath, String remotePath){
        //download
    }


}
