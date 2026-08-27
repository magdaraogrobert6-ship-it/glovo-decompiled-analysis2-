package com.huawei.hms.framework.network.grs.h;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
import androidx.compose.ui.graphics.Fields;
import com.adjust.sdk.Constants;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import o.setFontSizeR2X_6o;

/* JADX INFO: loaded from: classes2.dex */
public class c {
    private static final String a = "c";
    private static int serializer = 1;
    private static int write;

    public static String a(String str, Context context) throws Throwable {
        int i = 2 % 2;
        Logger.d(a, "Io getConfigContent, fileName: " + str);
        if (!TextUtils.isEmpty(str)) {
            if (context == null) {
                int i2 = serializer + 19;
                write = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                InputStream inputStream = null;
                try {
                    try {
                        if (new File(str).isDirectory()) {
                            int i4 = write + 49;
                            serializer = i4 % Fields.SpotShadowColor;
                            int i5 = i4 % 2;
                            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
                            IoUtils.closeSecure(inputStream);
                            return "";
                        }
                        try {
                            Object[] objArr = {context.getAssets(), str};
                            Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1791441156);
                            if (objRemoteActionCompatParcelizer == null) {
                                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (ExpandableListView.getPackedPositionChild(0L) + 26245), 37 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 13, 1172891421, false, "write", new Class[]{AssetManager.class, String.class});
                            }
                            InputStream inputStream2 = (InputStream) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
                            try {
                                byte[] bArr = new byte[8192];
                                while (true) {
                                    int i6 = inputStream2.read(bArr);
                                    if (i6 == -1) {
                                        byteArrayOutputStream.flush();
                                        String string = byteArrayOutputStream.toString(Constants.ENCODING);
                                        IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
                                        IoUtils.closeSecure(inputStream2);
                                        int i7 = serializer + 31;
                                        write = i7 % Fields.SpotShadowColor;
                                        int i8 = i7 % 2;
                                        return string;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i6);
                                }
                            } catch (IOException unused) {
                                inputStream = inputStream2;
                                Logger.w(a, "local config file is not exist.filename is {%s}", str);
                                IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
                                IoUtils.closeSecure(inputStream);
                                return "";
                            } catch (Throwable th) {
                                th = th;
                                inputStream = inputStream2;
                                IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
                                IoUtils.closeSecure(inputStream);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        }
                    } catch (IOException unused2) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        return "";
    }
}
