package o;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetMediaStopcp extends Thread {
    public final long IconCompatParcelizer;
    public final java.lang.ref.WeakReference RemoteActionCompatParcelizer;
    public final CountDownLatch write = new CountDownLatch(1);
    public boolean serializer = false;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        java.lang.ref.WeakReference weakReference = this.RemoteActionCompatParcelizer;
        try {
            if (this.write.await(this.IconCompatParcelizer, TimeUnit.MILLISECONDS) || (advertisingIdClient = (AdvertisingIdClient) weakReference.get()) == null) {
                return;
            }
            advertisingIdClient.zza();
            this.serializer = true;
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = (AdvertisingIdClient) weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zza();
                this.serializer = true;
            }
        }
    }

    public accessgetMediaStopcp(AdvertisingIdClient advertisingIdClient, long j) {
        this.RemoteActionCompatParcelizer = new java.lang.ref.WeakReference(advertisingIdClient);
        this.IconCompatParcelizer = j;
        start();
    }
}
