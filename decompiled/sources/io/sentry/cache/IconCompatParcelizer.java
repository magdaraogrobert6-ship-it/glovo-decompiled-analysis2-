package io.sentry.cache;

import com.adjust.sdk.Constants;
import io.sentry.SentryOptions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IconCompatParcelizer {
    public static final Charset read = Charset.forName(Constants.ENCODING);

    public static void RemoteActionCompatParcelizer(SentryOptions sentryOptions, String str, String str2) {
        File fileIconCompatParcelizer = IconCompatParcelizer(sentryOptions, str);
        if (fileIconCompatParcelizer == null) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(fileIconCompatParcelizer, str2);
        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Deleting %s from scope cache", str2);
        if (file.delete()) {
            return;
        }
        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Failed to delete: %s", file.getAbsolutePath());
    }

    public static void write(SentryOptions sentryOptions, Object obj, String str, String str2) {
        File fileIconCompatParcelizer = IconCompatParcelizer(sentryOptions, str);
        if (fileIconCompatParcelizer == null) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileIconCompatParcelizer, str2));
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, read));
                try {
                    sentryOptions.getSerializer().serializer(bufferedWriter, obj);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th5, "Error persisting entity: %s", str2);
        }
    }

    public static Object IconCompatParcelizer(SentryOptions sentryOptions, String str, String str2, Class cls) {
        File fileIconCompatParcelizer = IconCompatParcelizer(sentryOptions, str);
        if (fileIconCompatParcelizer == null) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(fileIconCompatParcelizer, str2);
        if (!file.exists()) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "No entry stored for %s", str2);
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), read));
            try {
                Object objWrite = sentryOptions.getSerializer().write(bufferedReader, cls);
                bufferedReader.close();
                return objWrite;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th3, "Error reading entity from scope cache: %s", str2);
            return null;
        }
    }

    public static File IconCompatParcelizer(SentryOptions sentryOptions, String str) {
        String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }
}
