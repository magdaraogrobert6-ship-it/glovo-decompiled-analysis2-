package com.huawei.hms.framework.network.grs.h.g;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.framework.network.grs.GrsApp;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import o.RelativeScroller;
import o.accessminIntrinsicHeightjd;
import o.getScrollAmount;
import o.scrollBy;
import o.setFontSizeR2X_6o;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    private static int RemoteActionCompatParcelizer = 0;
    private static final HostnameVerifier a = new scrollBy();
    private static int write = 1;

    public static SSLSocketFactory a(Context context) {
        int i = 2 % 2;
        try {
            try {
                Object[] objArr = {context.getAssets(), GrsApp.getInstance().getBrand("/") + "grs_sp.bks"};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1791441156);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (26243 - TextUtils.lastIndexOf("", '0', 0, 0)), 38 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 13 - KeyEvent.normalizeMetaState(0), 1172891421, false, "write", new Class[]{AssetManager.class, String.class});
                }
                RelativeScroller relativeScroller = new RelativeScroller(new getScrollAmount((InputStream) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr)), accessminIntrinsicHeightjd.RemoteActionCompatParcelizer());
                int i2 = write + 113;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return relativeScroller;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (IOException | KeyManagementException | NoSuchAlgorithmException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
            int i4 = write + 3;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return null;
        }
    }

    public static HostnameVerifier a() {
        return a;
    }
}
