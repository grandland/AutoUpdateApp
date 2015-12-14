package com.grandland.autoupdate.client;

import com.grandland.autoupdate.client.bean.UpdateResponse;
import com.grandland.autoupdate.client.service.UpdateService;

/**
 * Created by yestin on 2015/12/14.
 */
public class ClientUpdater {

    UpdateService updateService ;

    private int version = 0 ;

    public ClientUpdater(int version, String serverBaseUrl, int updateInterval, int timeout){
        updateService = new UpdateService(serverBaseUrl, updateInterval, timeout);
    }

    /**
     * ���ظ���
     * @return  true if updated, false otherwise.
     * */
    public boolean update(){
        UpdateResponse response = updateService.requestUpdate(version);
        if(response.isNeedUpdate()){
            //TODO download
            //TODO check md5 & sha1
            //TODO execUpdate
        }
        return false;
    }

    /**
     * ִ�и���
     * @param filePath �������ص�λ��
     * */
    public boolean execUpdate(String filePath){
        //TODO unzip files
        //TODO exec setupCommand
        //TODO exec startCommand.
        return false;
    }

    /**
     * �����ֳ�
     * ���³������������
     * @return  true if delete something, false otherwise.
     * */
    public boolean cleanUp(){
        return false;
    }

}
