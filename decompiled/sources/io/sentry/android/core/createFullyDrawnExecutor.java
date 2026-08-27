package io.sentry.android.core;

import android.content.Context;
import com.adjust.sdk.Constants;
import io.sentry.SentryUUID;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import o.UriActionExternalSyntheticLambda4;

/* JADX INFO: loaded from: classes4.dex */
public abstract class createFullyDrawnExecutor {
    public static String RemoteActionCompatParcelizer;
    public static final Charset IconCompatParcelizer = Charset.forName(Constants.ENCODING);
    public static final io.sentry.util.RemoteActionCompatParcelizer read = new io.sentry.util.RemoteActionCompatParcelizer();

    public static String read(Context context) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = read.serializer();
        try {
            if (RemoteActionCompatParcelizer == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    boolean zExists = file.exists();
                    Charset charset = IconCompatParcelizer;
                    if (!zExists) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            String strIconCompatParcelizer = SentryUUID.IconCompatParcelizer();
                            fileOutputStream.write(strIconCompatParcelizer.getBytes(charset));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            RemoteActionCompatParcelizer = strIconCompatParcelizer;
                            uriActionExternalSyntheticLambda4Serializer.close();
                            return strIconCompatParcelizer;
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        byte[] bArr = new byte[(int) randomAccessFile.length()];
                        randomAccessFile.readFully(bArr);
                        String str = new String(bArr, charset);
                        randomAccessFile.close();
                        RemoteActionCompatParcelizer = str;
                    } catch (Throwable th3) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    throw new RuntimeException(th5);
                }
            }
            String str2 = RemoteActionCompatParcelizer;
            uriActionExternalSyntheticLambda4Serializer.close();
            return str2;
        } catch (Throwable th6) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }
}
