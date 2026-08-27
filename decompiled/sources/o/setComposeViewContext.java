package o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class setComposeViewContext implements accessgetNumPadDirectionUpcp {
    public static final AtomicReference read = new AtomicReference();

    @Override // o.accessgetNumPadDirectionUpcp
    public final void read(boolean z) {
        Random random = RemoteConfigComponent.read;
        synchronized (RemoteConfigComponent.class) {
            Iterator it = RemoteConfigComponent.RemoteActionCompatParcelizer.values().iterator();
            while (it.hasNext()) {
                ((FirebaseRemoteConfig) it.next()).serializer(z);
            }
        }
    }
}
