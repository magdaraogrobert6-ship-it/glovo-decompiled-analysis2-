package o;

import com.mapbox.maps.renderer.MapboxRenderer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class BrazeGeofence implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ BrazeGeofence(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.write = obj2;
        this.serializer = obj3;
        this.read = z;
        this.MediaSessionCompatQueueItem = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        Object obj = this.MediaSessionCompatQueueItem;
        boolean z = this.read;
        Object obj2 = this.serializer;
        Object obj3 = this.write;
        Object obj4 = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            MapboxRenderer.snapshot$lambda$3$lambda$2((ReentrantLock) obj4, (createInAppMessageEventSubscriber) obj3, (MapboxRenderer) obj2, z, (Condition) obj);
        } else {
            getAnalyticsEnabledEnterannotations.RemoteActionCompatParcelizer((getAnalyticsEnabledEnterannotations) obj4, (r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM) obj3, obj2, z, (Runnable) obj);
        }
    }
}
