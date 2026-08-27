package com.huawei.riemann.gnsslocation.core.bean.log;

import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public class GpsRtiItem {
    public static int read;
    public static int serializer;
    public int ageOfDate;
    public int numberOfRsStation;
    public int prn;
    public int status;
    public int ure;

    public static int write() {
        int i = read;
        int i2 = i % 5841051;
        read = i + 1;
        if (i2 != 0) {
            return serializer;
        }
        int iMyTid = Process.myTid();
        serializer = iMyTid;
        return iMyTid;
    }
}
