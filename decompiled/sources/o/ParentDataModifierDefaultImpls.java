package o;

import com.google.android.gms.tasks.zzw;

/* JADX INFO: loaded from: classes2.dex */
public final class ParentDataModifierDefaultImpls {
    public final zzw RemoteActionCompatParcelizer = new zzw();

    public final void IconCompatParcelizer(Object obj) {
        this.RemoteActionCompatParcelizer.read(obj);
    }

    public final boolean IconCompatParcelizer(Exception exc) {
        zzw zzwVar = this.RemoteActionCompatParcelizer;
        zzwVar.getClass();
        accessgetSystemNavigationDowncp.serializer(exc, "Exception must not be null");
        synchronized (zzwVar.IconCompatParcelizer) {
            if (zzwVar.serializer) {
                return false;
            }
            zzwVar.serializer = true;
            zzwVar.MediaDescriptionCompat = exc;
            zzwVar.RemoteActionCompatParcelizer.write(zzwVar);
            return true;
        }
    }

    public final void RemoteActionCompatParcelizer(Exception exc) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(exc);
    }

    public final void write(Object obj) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(obj);
    }

    public ParentDataModifierDefaultImpls(ParentDataModifier parentDataModifier) {
        parentDataModifier.RemoteActionCompatParcelizer(new getMeasurementConstraintsmsEJaDk(this));
    }

    public ParentDataModifierDefaultImpls() {
    }
}
