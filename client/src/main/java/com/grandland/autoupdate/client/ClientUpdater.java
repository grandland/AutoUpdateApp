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
     * 下载更新
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
     * 执行更新
     * @param filePath 更新下载的位置
     * */
    public boolean execUpdate(String filePath){
        //TODO unzip files
        //TODO exec setupCommand
        //TODO exec startCommand.
        return false;
    }

    /**
     * 清理现场
     * 在新程序启动后进行
     * @return  true if delete something, false otherwise.
     * */
    public boolean cleanUp(){
        return false;
    }

}
