package o;

import android.os.Bundle;
import android.os.Looper;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.SynchronizationContext$1;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetProgramGreencp {
    public Bundle serializer;
    public final Map write = Collections.synchronizedMap(new ImageKt(0));
    public int IconCompatParcelizer = 0;

    public final void RemoteActionCompatParcelizer(Bundle bundle) {
        this.IconCompatParcelizer = 1;
        this.serializer = bundle;
        for (Map.Entry entry : this.write.entrySet()) {
            ((accessgetNumPadMoveEndcp) entry.getValue()).write(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void serializer(String str, accessgetNumPadMoveEndcp accessgetnumpadmoveendcp) {
        Map map = this.write;
        if (map.containsKey(str)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(new StringBuilder(String.valueOf(str).length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
            return;
        }
        map.put(str, accessgetnumpadmoveendcp);
        if (this.IconCompatParcelizer > 0) {
            new getBackEK5gGoQ(Looper.getMainLooper(), 2).post(new SynchronizationContext$1(3, this, accessgetnumpadmoveendcp, str, false));
        }
    }

    public final void read(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.write.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((accessgetNumPadMoveEndcp) entry.getValue()).RemoteActionCompatParcelizer(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }
}
