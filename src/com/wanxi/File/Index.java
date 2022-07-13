package com.wanxi.File;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Index {
    public static void main(String[] args) {
//        demo01();
//        System.out.println(demo03());
        File file1 = new File("D:\\Java\\awork");
        ArrayList<String> objects = new ArrayList<>();
        demo08(file1, objects);
        objects.forEach((item) -> {
            System.out.println(item);
        });

    }

    /**
     * 递归方式获取文件夹下的所有文件的绝对路径
     */
    public static void demo08(File file, List<String> fileNames) {
        if (!file.isDirectory()) {
            fileNames.add(file.getAbsolutePath());
        }
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            fileNames.add(files[i].getAbsolutePath());
            if (files[i].isDirectory()) {
                demo08(files[i], fileNames);
            }
        }
    }

    /**
     * FileFilter接口完成文件筛选
     */
    public static void demo07() {
        File file = new File("D:\\Java\\awork");
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String files = pathname.getName();
                return files.endsWith(".docx");
            }
        });
        for (File file1 : files) {
            System.out.println(file1.getAbsoluteFile());
        }
    }

    /**
     * FilenameFilter接口完成文件筛选
     */
    public static void demo06() {
        File file = new File("D:\\Java\\awork");
        String[] files = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File files = new File(dir, name);
//                return !files.isDirectory();
                return name.endsWith(".docx");
            }
        });
        for (String s : files) {
            System.out.println(s);
        }
    }

    /**
     * 获取文件下的所有一级文件的File对象
     */
    public static void demo05() {
        File file = new File("D:\\Java\\awork");
        File[] files = file.listFiles();
        for (File item : files) {
            System.out.println(file.getAbsolutePath());
        }
    }

    /**
     * 查看获取文件下的所有一级文件的文件名称
     */
    public static void demo04() {
        File file = new File("D:\\Java\\awork");
        String[] fileNames = file.list();
        for (String fileName : fileNames) {
            System.out.println(fileName);
        }
    }

    /**
     * 创建
     */
    public static boolean demo03() {
        File file = new File("D:\\Java\\awork\\test\\one");
        boolean isCreate = false;
        try {
            isCreate = file.mkdirs();//创建目录结构
            isCreate = file.mkdir();//创建单个目录
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isCreate;
    }

    /**
     * 判断
     */
    public static boolean demo02() {
        File newFile = new File("D:\\Java\\awork\\登錄、主頁面前端.pptx");
        boolean isCreate = true;
        try {
            isCreate = newFile.createNewFile(); //如果文件不存在，返回true,否则返回false
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isCreate;
    }

    /**
     * 获取
     */
    public static void demo01() {
        File file = new File("D:\\Java\\awork\\登錄、主頁面前端.pptx");

        System.out.println("文件名:" + file);
        System.out.println(file.getParentFile());
        System.out.println(file.getParentFile().getName()); //获取父路径的File对象：getParentFile()
/*
        System.out.println(file.getParent()); //获取父路径：C:\Users\EDY\Desktop\Java课件
        System.out.println(file.getAbsolutePath());  //获取文件绝对路径：C:\\Users\\EDY\\Desktop\\Java课件\\Tomcat环境搭建.md

        System.out.println(file.canRead());     //可读权限
        System.out.println(file.canWrite());    //可写权限
        System.out.println(file.isHidden());    //是否为隐藏文件
        System.out.println(file.exists());      //判定文件是否存在
        System.out.println(file.isDirectory()); //判定目录与文件

        System.out.println(file.lastModified());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        date.setTime(file.lastModified()); //获取文件最后一次修改时间
        String lastTime = simpleDateFormat.format(date);
        System.out.println(lastTime);

        System.out.println(file.length()); //获取单个文件的大小
*/
    }
}