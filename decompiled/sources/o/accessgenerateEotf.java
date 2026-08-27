package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class accessgenerateEotf {
    public boolean IconCompatParcelizer;
    public boolean read;
    public boolean write;

    public boolean IconCompatParcelizer() {
        return (this.read || this.write) && this.IconCompatParcelizer;
    }

    public void serializer(ArrayList arrayList) {
        if ((this.IconCompatParcelizer || this.write || this.read) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((PreviewExternalSyntheticLambda0) it.next()).write();
            }
            setInflatedId.IconCompatParcelizer(3, "ForceCloseDeferrableSurface");
        }
    }
}
