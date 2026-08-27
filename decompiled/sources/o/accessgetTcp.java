package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.zzb;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetTcp implements ServiceConnection {
    public final int read;
    public final /* synthetic */ BaseGmsClient write;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        BaseGmsClient baseGmsClient = this.write;
        synchronized (baseGmsClient.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            baseGmsClient.ComponentActivity = null;
        }
        BaseGmsClient baseGmsClient2 = this.write;
        int i = this.read;
        zzb zzbVar = baseGmsClient2.MediaDescriptionCompat;
        zzbVar.sendMessage(zzbVar.obtainMessage(6, i, 1));
    }

    public accessgetTcp(BaseGmsClient baseGmsClient, int i) {
        this.write = baseGmsClient;
        this.read = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        BaseGmsClient baseGmsClient = this.write;
        if (iBinder == null) {
            baseGmsClient.ComponentActivity();
            return;
        }
        synchronized (baseGmsClient.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            baseGmsClient.ComponentActivity = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof accessgetSystemNavigationLeftcp)) ? new accessgetSystemNavigationLeftcp(iBinder) : (accessgetSystemNavigationLeftcp) iInterfaceQueryLocalInterface;
        }
        BaseGmsClient baseGmsClient2 = this.write;
        int i = this.read;
        baseGmsClient2.getClass();
        accessgetSystemNavigationUpcp accessgetsystemnavigationupcp = new accessgetSystemNavigationUpcp(baseGmsClient2, 0, null);
        zzb zzbVar = baseGmsClient2.MediaDescriptionCompat;
        zzbVar.sendMessage(zzbVar.obtainMessage(7, i, -1, accessgetsystemnavigationupcp));
    }
}
