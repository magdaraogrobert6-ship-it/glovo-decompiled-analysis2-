package o;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdaMoJg2Lf6y92Yb4SyAXDmAYofuA {
    public static final r8lambda0OyDyRxHf9VxLg_dWmpWMJcIdY read;

    static {
        r8lambda0OyDyRxHf9VxLg_dWmpWMJcIdY constructobjectquietly;
        AtomicReference atomicReference = new AtomicReference();
        try {
            constructobjectquietly = (r8lambda0OyDyRxHf9VxLg_dWmpWMJcIdY) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(r8lambda0OyDyRxHf9VxLg_dWmpWMJcIdY.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            constructobjectquietly = new constructObjectQuietly();
        } catch (Exception e2) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Storage override failed to initialize", e2);
            return;
        }
        read = constructobjectquietly;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            setResourcePackageName.IconCompatParcelizer.log(Level.FINE, "Storage override doesn't exist. Using default", th);
        }
    }
}
