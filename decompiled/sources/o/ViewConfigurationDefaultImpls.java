package o;

import android.content.Context;
import android.util.Log;
import com.huawei.location.ut;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewConfigurationDefaultImpls extends onStateChanged {
    public volatile com.huawei.agconnect.config.impl.m IconCompatParcelizer;
    public volatile ut MediaDescriptionCompat;
    public final Object MediaMetadataCompat = new Object();
    public ViewCompositionStrategy_androidKtinstallForLifecycle2 MediaSessionCompatQueueItem = ViewCompositionStrategy_androidKtinstallForLifecycle2.RemoteActionCompatParcelizer;
    public final HashMap RatingCompat = new HashMap();
    public final String RemoteActionCompatParcelizer;
    public final Context serializer;

    @Override // o.accessgetHandwritingSlopjd
    public final Context write() {
        return this.serializer;
    }

    @Override // o.accessgetHandwritingSlopjd
    public final ViewCompositionStrategy_androidKtinstallForLifecycle2 read() {
        if (this.MediaSessionCompatQueueItem == ViewCompositionStrategy_androidKtinstallForLifecycle2.RemoteActionCompatParcelizer && this.IconCompatParcelizer == null) {
            RemoteActionCompatParcelizer();
        }
        return this.MediaSessionCompatQueueItem;
    }

    @Override // o.accessgetHandwritingSlopjd
    public final String serializer() {
        return "DEFAULT_INSTANCE";
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.IconCompatParcelizer == null) {
            synchronized (this.MediaMetadataCompat) {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = new com.huawei.agconnect.config.impl.m(this.serializer, this.RemoteActionCompatParcelizer);
                    this.MediaDescriptionCompat = new ut(this.IconCompatParcelizer);
                }
                if (this.MediaSessionCompatQueueItem == ViewCompositionStrategy_androidKtinstallForLifecycle2.RemoteActionCompatParcelizer) {
                    if (this.IconCompatParcelizer != null) {
                        this.MediaSessionCompatQueueItem = accessgetMaximumFlingVelocityjd.RemoteActionCompatParcelizer(this.IconCompatParcelizer.RemoteActionCompatParcelizer("/region", null), this.IconCompatParcelizer.RemoteActionCompatParcelizer("/agcgw/url", null));
                    } else {
                        Log.w("AGConnectServiceConfig", "get route fail , config not ready");
                    }
                }
            }
        }
    }

    @Override // o.accessgetHandwritingSlopjd
    public final String serializer(String str) {
        accesssetShouldUseDispatchDrawcp accesssetshouldusedispatchdrawcp;
        if (this.IconCompatParcelizer == null) {
            RemoteActionCompatParcelizer();
        }
        int i = 0;
        if (str.length() > 0) {
            while (str.charAt(i) == '/') {
                i++;
            }
        }
        String strConcat = "/".concat(str.substring(i));
        String str2 = (String) this.RatingCompat.get(strConcat);
        if (str2 != null) {
            return str2;
        }
        HashMap map = ViewConfiguration.RemoteActionCompatParcelizer;
        String str3 = (map.containsKey(strConcat) && (accesssetshouldusedispatchdrawcp = (accesssetShouldUseDispatchDrawcp) map.get(strConcat)) != null) ? accesssetshouldusedispatchdrawcp.read(this) : null;
        if (str3 != null) {
            return str3;
        }
        String strRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(strConcat, null);
        return ut.RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer) ? this.MediaDescriptionCompat.serializer(strRemoteActionCompatParcelizer) : strRemoteActionCompatParcelizer;
    }

    public ViewConfigurationDefaultImpls(Context context, String str) {
        this.serializer = context;
        this.RemoteActionCompatParcelizer = str;
    }
}
