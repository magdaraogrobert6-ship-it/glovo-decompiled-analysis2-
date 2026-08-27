package com.incognia.internal;

import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: loaded from: classes2.dex */
public final class oZF {
    public static Long mbG() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Long x() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean BGx() {
        if (!XUh.BGx(XUh.BGx, 0, 28, 1)) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory().toString());
            char c = File.separatorChar;
            sb.append(c);
            sb.append((String) W4i.Q7Z.MediaSessionCompatResultReceiverWrapper());
            sb.append(c);
            sb.append((String) W4i.fCu.MediaSessionCompatResultReceiverWrapper());
            return Boolean.valueOf(new File(sb.toString()).exists());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Long HQ() {
        if (!XUh.BGx(XUh.BGx, 26, 0, 2)) {
            return null;
        }
        try {
            FileTime fileTimeCreationTime = Files.readAttributes(Paths.get(Environment.getDownloadCacheDirectory().getPath(), new String[0]), BasicFileAttributes.class, new LinkOption[0]).creationTime();
            if (fileTimeCreationTime != null) {
                return Long.valueOf(fileTimeCreationTime.toMillis());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Long N() {
        if (!XUh.BGx(XUh.BGx, 26, 0, 2)) {
            return null;
        }
        try {
            FileTime fileTimeCreationTime = Files.readAttributes(Paths.get(Environment.getExternalStorageDirectory().getPath(), new String[0]), BasicFileAttributes.class, new LinkOption[0]).creationTime();
            if (fileTimeCreationTime != null) {
                return Long.valueOf(fileTimeCreationTime.toMillis());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean hIl() {
        try {
            return Boolean.valueOf(Environment.isExternalStorageEmulated());
        } catch (Throwable unused) {
            return null;
        }
    }
}
