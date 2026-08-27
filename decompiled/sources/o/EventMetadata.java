package o;

import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class EventMetadata {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final transferSessionPackageI read;
    public final AtomicReference serializer = new AtomicReference(null);
    public final AtomicReference IconCompatParcelizer = new AtomicReference(null);

    public EventMetadata(transferSessionPackageI transfersessionpackagei) {
        this.read = transfersessionpackagei;
    }

    public final long IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 63;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Long l = null;
        if (i2 % 2 != 0) {
            l.hashCode();
            throw null;
        }
        Long l2 = (Long) this.serializer.get();
        if (l2 != null) {
            return l2.longValue();
        }
        long jWrite = ((FirebaseRemoteConfigImpl) this.read).IconCompatParcelizer.write("smart_status_polling_delay_seconds");
        Long lValueOf = Long.valueOf(jWrite);
        if (jWrite > 0) {
            l = lValueOf;
        } else {
            int i3 = write + 51;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        if (l != null) {
            return l.longValue();
        }
        return 60L;
    }
}
