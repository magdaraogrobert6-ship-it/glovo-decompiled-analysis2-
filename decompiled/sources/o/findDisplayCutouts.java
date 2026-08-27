package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.play.core.appupdate.internal.zzx;

/* JADX INFO: loaded from: classes2.dex */
public final class findDisplayCutouts implements ServiceConnection {
    public final /* synthetic */ zzx serializer;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzx zzxVar = this.serializer;
        zzxVar.write.write("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        zzxVar.read().post(new WindowInsetsRulersKt(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzx zzxVar = this.serializer;
        zzxVar.write.write("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        zzxVar.read().post(new getDisplayCutoutBounds(1, this));
    }

    public /* synthetic */ findDisplayCutouts(zzx zzxVar) {
        this.serializer = zzxVar;
    }
}
