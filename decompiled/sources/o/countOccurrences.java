package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class countOccurrences extends BroadcastReceiver {
    public boolean IconCompatParcelizer = false;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ countOccurrences(int i, Object obj) {
        this.serializer = i;
        this.write = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.serializer;
        Object obj = this.write;
        if (i == 0) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            boolean z = this.IconCompatParcelizer;
            boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            this.IconCompatParcelizer = z2;
            if (!z2 || z) {
                return;
            }
            ((r8lambdaYT7KkhvXyPX5qC1jtJtr5iFnrzo) obj).read.serializer();
            return;
        }
        com.huawei.agconnect.config.impl.m mVar = (com.huawei.agconnect.config.impl.m) obj;
        boolean z3 = mVar.read();
        if (mVar.read() && !this.IconCompatParcelizer) {
            mVar.read(true);
        } else if (!z3 && this.IconCompatParcelizer) {
            mVar.read(false);
        }
        this.IconCompatParcelizer = z3;
    }
}
