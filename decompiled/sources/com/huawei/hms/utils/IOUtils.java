package com.huawei.hms.utils;

import android.content.res.AssetManager;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.ui.graphics.Fields;
import com.huawei.hms.support.log.HMSLog;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Method;
import java.util.Locale;
import o.setFontSizeR2X_6o;

/* JADX INFO: loaded from: classes2.dex */
public final class IOUtils {
    private static int read = 0;
    private static int write = 1;

    private IOUtils() {
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                HMSLog.e("IOUtils", "An exception occurred while closing the 'Closeable' object.");
            }
        }
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static InputStream toInputStream(byte[] bArr) throws IOException {
        return new ByteArrayInputStream(bArr);
    }

    public static long copy(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        long j = 0;
        if (inputStream != null && outputStream != null) {
            if (bArr == null) {
                bArr = new byte[Fields.TransformOrigin];
            }
            while (true) {
                int i = inputStream.read(bArr);
                if (-1 == i) {
                    break;
                }
                outputStream.write(bArr, 0, i);
                j += (long) i;
            }
        }
        return j;
    }

    public static void closeQuietly(Writer writer) {
        closeQuietly((Closeable) writer);
    }

    public static void closeQuietly(InputStream inputStream) {
        closeQuietly((Closeable) inputStream);
    }

    public static void closeQuietly(OutputStream outputStream) {
        closeQuietly((Closeable) outputStream);
    }

    public static void closeQuietly(Reader reader) {
        closeQuietly((Closeable) reader);
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        return copy(inputStream, outputStream, new byte[Fields.TransformOrigin]);
    }

    public static byte[] readAssetsFile(AssetManager assetManager, String str) throws Throwable {
        int i = 2 % 2;
        if (assetManager != null) {
            if (str != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                InputStream inputStream = null;
                try {
                    try {
                        Object[] objArr = {assetManager, str};
                        Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1791441156);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (26244 - ExpandableListView.getPackedPositionType(0L)), 37 - (ViewConfiguration.getScrollBarSize() >> 8), 12 - ((byte) KeyEvent.getModifierMetaStateMask()), 1172891421, false, "write", new Class[]{AssetManager.class, String.class});
                        }
                        InputStream inputStream2 = (InputStream) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
                        try {
                            byte[] bArr = new byte[Fields.RotationZ];
                            while (true) {
                                int i2 = inputStream2.read(bArr);
                                if (i2 == -1) {
                                    byteArrayOutputStream.flush();
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    closeQuietly(inputStream2);
                                    closeQuietly((OutputStream) byteArrayOutputStream);
                                    return byteArray;
                                }
                                int i3 = write + 73;
                                read = i3 % Fields.SpotShadowColor;
                                int i4 = i3 % 2;
                                byteArrayOutputStream.write(bArr, 0, i2);
                            }
                        } catch (IOException e) {
                            e = e;
                            inputStream = inputStream2;
                            Locale locale = Locale.ROOT;
                            HMSLog.e("IOUtils", "Failed to open " + str, e);
                            closeQuietly(inputStream);
                            closeQuietly((OutputStream) byteArrayOutputStream);
                            return new byte[0];
                        } catch (Throwable th) {
                            th = th;
                            inputStream = inputStream2;
                            closeQuietly(inputStream);
                            closeQuietly((OutputStream) byteArrayOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        Throwable cause = th3.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th3;
                    } catch (IOException e2) {
                        e = e2;
                        Locale locale2 = Locale.ROOT;
                        HMSLog.e("IOUtils", "Failed to open " + str, e);
                        closeQuietly(inputStream);
                        closeQuietly((OutputStream) byteArrayOutputStream);
                        return new byte[0];
                    }
                }
            } else {
                int i5 = write + 81;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        }
        HMSLog.e("IOUtils", "readAssetFile args error");
        return new byte[0];
    }
}
