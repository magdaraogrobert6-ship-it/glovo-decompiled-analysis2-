package o;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class addLast {
    public static final java.util.logging.Logger write = java.util.logging.Logger.getLogger(addLast.class.getName());
    public final ConcurrentHashMap RemoteActionCompatParcelizer;

    public final void RemoteActionCompatParcelizer(LayoutModifierNodemaxIntrinsicWidth1 layoutModifierNodemaxIntrinsicWidth1) {
        synchronized (this) {
            if (!layoutModifierNodemaxIntrinsicWidth1.serializer().isCompatible()) {
                throw new GeneralSecurityException("failed to register key manager " + layoutModifierNodemaxIntrinsicWidth1.getClass() + " as it is not FIPS compatible.");
            }
            RemoteActionCompatParcelizer(new addFirst(layoutModifierNodemaxIntrinsicWidth1));
        }
    }

    public final addFirst serializer(String str) {
        addFirst addfirst;
        synchronized (this) {
            if (!this.RemoteActionCompatParcelizer.containsKey(str)) {
                throw new GeneralSecurityException("No key manager found for key type " + str);
            }
            addfirst = (addFirst) this.RemoteActionCompatParcelizer.get(str);
        }
        return addfirst;
    }

    public addLast(addLast addlast) {
        this.RemoteActionCompatParcelizer = new ConcurrentHashMap(addlast.RemoteActionCompatParcelizer);
    }

    public final void RemoteActionCompatParcelizer(addFirst addfirst) {
        synchronized (this) {
            LayoutModifierNodemaxIntrinsicWidth1 layoutModifierNodemaxIntrinsicWidth1 = addfirst.IconCompatParcelizer;
            Class cls = layoutModifierNodemaxIntrinsicWidth1.read;
            if (!layoutModifierNodemaxIntrinsicWidth1.write.keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + layoutModifierNodemaxIntrinsicWidth1.toString() + " does not support primitive class " + cls.getName());
            }
            String str = layoutModifierNodemaxIntrinsicWidth1.read();
            addFirst addfirst2 = (addFirst) this.RemoteActionCompatParcelizer.get(str);
            if (addfirst2 != null && !addfirst2.IconCompatParcelizer.getClass().equals(addfirst.IconCompatParcelizer.getClass())) {
                write.warning("Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + addfirst2.IconCompatParcelizer.getClass().getName() + ", cannot be re-registered with " + addfirst.IconCompatParcelizer.getClass().getName());
            }
            this.RemoteActionCompatParcelizer.putIfAbsent(str, addfirst);
        }
    }

    public addLast() {
        this.RemoteActionCompatParcelizer = new ConcurrentHashMap();
    }
}
