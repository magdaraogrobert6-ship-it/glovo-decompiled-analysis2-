package o;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import com.google.android.gms.common.internal.zzo;
import com.google.android.gms.common.internal.zzq;
import com.huawei.hms.android.SystemUtils;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetTabcp implements Handler.Callback {
    public final /* synthetic */ zzq serializer;

    public /* synthetic */ accessgetTabcp(zzq zzqVar) {
        this.serializer = zzqVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            zzq zzqVar = this.serializer;
            synchronized (zzqVar.read) {
                accessgetThreecp accessgetthreecp = (accessgetThreecp) message.obj;
                zzo zzoVar = (zzo) zzqVar.read.get(accessgetthreecp);
                if (zzoVar != null && zzoVar.IconCompatParcelizer.isEmpty()) {
                    if (zzoVar.RemoteActionCompatParcelizer) {
                        accessgetThreecp accessgetthreecp2 = zzoVar.MediaBrowserCompatMediaItem;
                        zzq zzqVar2 = zzoVar.write;
                        zzqVar2.MediaSessionCompatQueueItem.removeMessages(1, accessgetthreecp2);
                        zzqVar2.MediaMetadataCompat.IconCompatParcelizer(zzqVar2.MediaBrowserCompatMediaItem, zzoVar);
                        zzoVar.RemoteActionCompatParcelizer = false;
                        zzoVar.serializer = 2;
                    }
                    zzqVar.read.remove(accessgetthreecp);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        zzq zzqVar3 = this.serializer;
        synchronized (zzqVar3.read) {
            accessgetThreecp accessgetthreecp3 = (accessgetThreecp) message.obj;
            zzo zzoVar2 = (zzo) zzqVar3.read.get(accessgetthreecp3);
            if (zzoVar2 != null && zzoVar2.serializer == 3) {
                String strValueOf = String.valueOf(accessgetthreecp3);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                sb.append("Timeout waiting for ServiceConnection callback ");
                sb.append(strValueOf);
                SentryLogcatAdapter.read("GmsClientSupervisor", sb.toString(), new Exception());
                ComponentName componentName = zzoVar2.MediaMetadataCompat;
                if (componentName == null) {
                    accessgetthreecp3.getClass();
                    componentName = null;
                }
                if (componentName == null) {
                    String str = accessgetthreecp3.RemoteActionCompatParcelizer;
                    accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str);
                    componentName = new ComponentName(str, SystemUtils.UNKNOWN);
                }
                zzoVar2.onServiceDisconnected(componentName);
            }
        }
        return true;
    }
}
