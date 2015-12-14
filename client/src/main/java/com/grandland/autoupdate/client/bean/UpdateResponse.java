package com.grandland.autoupdate.client.bean;

import java.util.Date;

/**
 * Created by yestin on 2015/12/14.
 * ���·�������
 */
public class UpdateResponse {
    /**
     * �Ƿ���Ҫ����
     * */
    private boolean needUpdate;
    /**
     * ����·��
     */
    private String downloadPath;
    /**
     * ����ʱ��
     * */
    private Date updateTime;
    /**
     * �°汾��*/
    private int newVersion;
    /**
     * �°���������
     * */
    private String startCommand;
    /**
     * ��������
     * */
    private String setupCommand;

    /**
     * ��������MD5ֵ
     * */
    private String md5;
    /**
     * ��������sha1ֵ
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
