package com.example.hello.photowall.model;

/**
 * Created by 韦作铭 on 2018/3/8.
 */

public class ImageInfo {
    //图片文件夹
    private String picDir;

    //第一张图片的路径 ,用于做文件夹的图标
    private String firstImagePath;

    //图片文件夹名称
    private String folderName;

    //图片数量
    private int count;

    public String getPicDir() {
        return picDir;
    }

    public void setPicDir(String picDir) {
        this.picDir = picDir;
        int lastIndexOf = this.picDir.lastIndexOf("/");
        this.folderName = this.picDir.substring(lastIndexOf);
    }

    public String getFirstImagePath() {
        return firstImagePath;
    }

    public void setFirstImagePath(String firstImagePath) {
        this.firstImagePath = firstImagePath;
    }

    public String getFolderName() {
        return folderName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
