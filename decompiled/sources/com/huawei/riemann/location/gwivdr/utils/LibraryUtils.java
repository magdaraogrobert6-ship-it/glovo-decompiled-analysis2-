package com.huawei.riemann.location.gwivdr.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes4.dex */
public class LibraryUtils {
    private static final String LIBRARY_NAME = "GwiVdr";
    private static final String TAG = "LibraryUtils";

    public static boolean loadSo(String str) {
        StringBuilder sb;
        String str2;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "loadSo here!");
        if (str == null) {
            str2 = "null so file dir!";
        } else {
            File file = new File(str);
            if (!file.exists()) {
                str2 = "so file not exist!";
            } else {
                try {
                    System.load(file.getCanonicalPath());
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "so file load succeed!");
                    return true;
                } catch (FileNotFoundException unused) {
                    str2 = "load file error!";
                } catch (IOException e) {
                    e = e;
                    sb = new StringBuilder("load file dir error: ");
                    sb.append(e.getMessage());
                    WrappedCompositionsetContent1211.read(TAG, sb.toString());
                    return false;
                } catch (UnsatisfiedLinkError e2) {
                    e = e2;
                    sb = new StringBuilder("invalid file: ");
                    sb.append(e.getMessage());
                    WrappedCompositionsetContent1211.read(TAG, sb.toString());
                    return false;
                }
            }
        }
        WrappedCompositionsetContent1211.read(TAG, str2);
        return false;
    }
}
