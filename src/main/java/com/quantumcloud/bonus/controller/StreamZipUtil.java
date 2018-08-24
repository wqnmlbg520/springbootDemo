package com.quantumcloud.bonus.controller;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;


public class StreamZipUtil {
    public static final int BUFFER = 1024;

    /**
     * 数据压缩
     *
     * @param is
     * @param os
     * @throws Exception
     */
    public static void compress(InputStream is, OutputStream os)
            throws Exception {

        GZIPOutputStream gos = new GZIPOutputStream(os);
        int count;
        byte data[] = new byte[BUFFER];
        while ((count = is.read(data, 0, BUFFER)) != -1) {
            gos.write(data, 0, count);
        }


        gos.finish();
        gos.flush();
        gos.close();
    }

    /**
     * 数据解压缩
     *
     * @param is
     * @param os
     * @throws Exception
     */
    public static void decompress(InputStream is, OutputStream os)
            throws Exception {

        GZIPInputStream gis = new GZIPInputStream(is);
        int count;
        byte data[] = new byte[BUFFER];
        while ((count = gis.read(data, 0, BUFFER)) != -1) {
            os.write(data, 0, count);
        }

        gis.close();
    }

    public static void main(String[] args) throws Exception {

        //压缩
       long star=System.currentTimeMillis();
        File beforefile = new File("d://gps2.dump.log");
        File afterfile = new File("d://gps3.dump.log");
        InputStream in = new FileInputStream(beforefile);
        OutputStream out = new FileOutputStream(afterfile);
        compress(in,out);
        long end =System.currentTimeMillis();
        double progress = end-(double)star;
        System.out.println("total:"+progress);


//        //解压
//        long star_de=System.currentTimeMillis();
//        File beforefile_de = new File("d://gps3.dump.log");
//        File afterfile_de = new File("d://gps4.dump.log");
//        InputStream in_de = new FileInputStream(beforefile_de);
//        OutputStream out_de = new FileOutputStream(afterfile_de);
//        decompress(in_de,out_de);
//        long end_de =System.currentTimeMillis();
//        double progress_de = end_de-(double)star_de;
//        System.out.println("total:"+progress_de);

    }
}
