package o;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class getProgramBlueEK5gGoQ extends zzbm implements getQEK5gGoQ {
    public final AtomicReference RemoteActionCompatParcelizer;
    public boolean serializer;

    public getProgramBlueEK5gGoQ() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.RemoteActionCompatParcelizer = new AtomicReference();
    }

    public final Bundle RemoteActionCompatParcelizer(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.RemoteActionCompatParcelizer;
        synchronized (atomicReference) {
            if (!this.serializer) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.RemoteActionCompatParcelizer.get();
        }
        return bundle;
    }

    @Override // o.getQEK5gGoQ
    public final void RemoteActionCompatParcelizer(Bundle bundle) {
        AtomicReference atomicReference = this.RemoteActionCompatParcelizer;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.serializer = true;
                    this.RemoteActionCompatParcelizer.notify();
                } catch (Throwable th) {
                    this.RemoteActionCompatParcelizer.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Long read() {
        return (Long) IconCompatParcelizer(RemoteActionCompatParcelizer(500L), Long.class);
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, Bundle.CREATOR);
        getPageDownEK5gGoQ.read(parcel);
        RemoteActionCompatParcelizer(bundle);
        parcel2.writeNoException();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object IconCompatParcelizer(android.os.Bundle r3, java.lang.Class r4) {
        /*
            if (r3 == 0) goto L2a
            java.lang.String r0 = "r"
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> Lf
            return r3
        Lf:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received: "
            java.lang.String r2 = ", "
            java.lang.String r3 = bo.app.af$$ExternalSyntheticOutline0.m(r1, r4, r2, r3)
            java.lang.String r4 = "AM"
            io.sentry.android.core.SentryLogcatAdapter.write(r4, r3, r0)
            throw r0
        L2a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getProgramBlueEK5gGoQ.IconCompatParcelizer(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final String serializer(long j) {
        return (String) IconCompatParcelizer(RemoteActionCompatParcelizer(j), String.class);
    }
}
