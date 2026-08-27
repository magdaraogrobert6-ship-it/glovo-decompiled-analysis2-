package o;

import android.content.Context;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.ut;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetMinimumFlingVelocityjd implements accessgetHandwritingSlopjd {
    public final Context IconCompatParcelizer;
    public final HashMap MediaBrowserCompatMediaItem = new HashMap();
    public final ArrayList MediaDescriptionCompat;
    public final HashMap MediaMetadataCompat;
    public final ut RemoteActionCompatParcelizer;
    public final String read;
    public final accessgetHasRetrievedMethodcp serializer;
    public final ViewCompositionStrategy_androidKtinstallForLifecycle2 write;

    @Override // o.accessgetHandwritingSlopjd
    public final String serializer() {
        return this.read;
    }

    @Override // o.accessgetHandwritingSlopjd
    public final Context write() {
        return this.IconCompatParcelizer;
    }

    @Override // o.accessgetHandwritingSlopjd
    public final ViewCompositionStrategy_androidKtinstallForLifecycle2 read() {
        ViewCompositionStrategy_androidKtinstallForLifecycle2 viewCompositionStrategy_androidKtinstallForLifecycle2 = this.write;
        return viewCompositionStrategy_androidKtinstallForLifecycle2 == null ? ViewCompositionStrategy_androidKtinstallForLifecycle2.RemoteActionCompatParcelizer : viewCompositionStrategy_androidKtinstallForLifecycle2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // o.accessgetHandwritingSlopjd
    public final String serializer(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        String strWrite = accessgetMaximumFlingVelocityjd.write(str);
        String str3 = (String) this.MediaMetadataCompat.get(strWrite);
        if (str3 != null) {
            return str3;
        }
        HashMap map = ViewConfiguration.RemoteActionCompatParcelizer;
        if (map.containsKey(strWrite)) {
            HashMap map2 = this.MediaBrowserCompatMediaItem;
            if (map2.containsKey(strWrite)) {
                str2 = (String) map2.get(strWrite);
            } else {
                accesssetShouldUseDispatchDrawcp accesssetshouldusedispatchdrawcp = (accesssetShouldUseDispatchDrawcp) map.get(strWrite);
                if (accesssetshouldusedispatchdrawcp == null) {
                    str2 = null;
                } else {
                    str2 = accesssetshouldusedispatchdrawcp.read(this);
                    map2.put(strWrite, str2);
                }
            }
        } else {
            str2 = null;
        }
        if (str2 != null) {
            return str2;
        }
        String strRemoteActionCompatParcelizer = this.serializer.RemoteActionCompatParcelizer(strWrite, null);
        return ut.RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer) ? this.RemoteActionCompatParcelizer.serializer(strRemoteActionCompatParcelizer) : strRemoteActionCompatParcelizer;
    }

    public accessgetMinimumFlingVelocityjd(Context context, InputStream inputStream, HashMap map, ArrayList arrayList) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.IconCompatParcelizer = context;
        String packageName = context.getPackageName();
        if (inputStream != null) {
            this.serializer = new i$d.a(inputStream, packageName);
            accessgetMaximumFlingVelocityjd.serializer(inputStream);
        } else {
            this.serializer = new com.huawei.agconnect.config.impl.m(context, packageName);
        }
        accessgetHasRetrievedMethodcp accessgethasretrievedmethodcp = this.serializer;
        this.RemoteActionCompatParcelizer = new ut(accessgethasretrievedmethodcp);
        ViewCompositionStrategy_androidKtinstallForLifecycle2 viewCompositionStrategy_androidKtinstallForLifecycle2RemoteActionCompatParcelizer = accessgetMaximumFlingVelocityjd.RemoteActionCompatParcelizer(accessgethasretrievedmethodcp.RemoteActionCompatParcelizer("/region", null), this.serializer.RemoteActionCompatParcelizer("/agcgw/url", null));
        this.write = viewCompositionStrategy_androidKtinstallForLifecycle2RemoteActionCompatParcelizer;
        HashMap mapIconCompatParcelizer = accessgetMaximumFlingVelocityjd.IconCompatParcelizer(map);
        this.MediaMetadataCompat = mapIconCompatParcelizer;
        this.MediaDescriptionCompat = arrayList;
        this.read = String.valueOf(("{packageName='" + packageName + "', routePolicy=" + viewCompositionStrategy_androidKtinstallForLifecycle2RemoteActionCompatParcelizer + ", reader=" + this.serializer.toString().hashCode() + ", customConfigMap=" + new JSONObject(mapIconCompatParcelizer).toString().hashCode() + '}').hashCode());
    }
}
