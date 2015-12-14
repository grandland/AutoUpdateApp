package com.grandland.autoupdate.client.bean;

import java.util.Date;

/**
 * Created by yestin on 2015/12/14.
 * 更新返回数据
 */
public class UpdateResponse {
    /**
     * 是否需要更新
     * */
    private boolean needUpdate;
    /**
     * 下载路径
     */
    private String downloadPath;
    /**
     * 更新时间
     * */
    private Date updateTime;
    /**
     * 新版本号*/
    private int newVersion;
    /**
     * 新版启动命令
     * */
    private String startCommand;
    /**
     * 设置命令
     * */
    private String setupCommand;

    /**
     * 下载链接MD5值
     * */
    private String md5;
    /**
     * 下载链接sha1值
     * */
    private String sha1;

    public boolean isNeedUpdate() {
        return needUpdate;
    }

    public void setNeedUpdate(boolean needUpdate) {
        this.needUpdate = needUpdate;
    }

    public String getDownloadPath() {
        return downloadPath;
    }

    public void setDownloadPath(String downloadPath) {
        this.downloadPath = downloadPath;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getNewVersion() {
        return newVersion;
    }

    public void setNewVersion(int newVersion) {
        this.newVersion = newVersion;
    }

    public String getStartCommand() {
        return startCommand;
    }

    public void setStartCommand(String startCommand) {
        this.startCommand = startCommand;
    }

    public String getSetupCommand() {
        return setupCommand;
    }

    public void setSetupCommand(String setupCommand) {
        this.setupCommand = setupCommand;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getSha1() {
        return sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    @Override
    public String toString() {
        return "UpdateResponse{" +
                "needUpdate=" + needUpdate +
                ", downloadPath='" + downloadPath + '\'' +
                ", updateTime=" + updateTime +
                ", newVersion=" + newVersion +
                ", startCommand='" + startCommand + '\'' +
                ", setupCommand='" + setupCommand + '\'' +
                ", md5='" + md5 + '\'' +
                ", sha1='" + sha1 + '\'' +
                '}';
    }
}
