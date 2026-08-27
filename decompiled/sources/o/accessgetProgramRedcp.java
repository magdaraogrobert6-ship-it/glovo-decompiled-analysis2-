package o;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.zzw;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetProgramRedcp {
    public int IconCompatParcelizer;
    public final ImageKt read = new ImageKt(0);
    public final ParentDataModifierDefaultImpls write = new ParentDataModifierDefaultImpls();
    public boolean RemoteActionCompatParcelizer = false;
    public final ImageKt serializer = new ImageKt(0);

    public final void IconCompatParcelizer(accessgetNumPadDividecp accessgetnumpaddividecp, ConnectionResult connectionResult, String str) {
        ImageKt imageKt = this.serializer;
        imageKt.put(accessgetnumpaddividecp, connectionResult);
        ImageKt imageKt2 = this.read;
        imageKt2.put(accessgetnumpaddividecp, str);
        this.IconCompatParcelizer--;
        if (!connectionResult.read()) {
            this.RemoteActionCompatParcelizer = true;
        }
        if (this.IconCompatParcelizer == 0) {
            boolean z = this.RemoteActionCompatParcelizer;
            ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = this.write;
            if (z) {
                parentDataModifierDefaultImpls.RemoteActionCompatParcelizer(new AvailabilityException(imageKt));
            } else {
                parentDataModifierDefaultImpls.IconCompatParcelizer(imageKt2);
            }
        }
    }

    public final zzw serializer() {
        return this.write.RemoteActionCompatParcelizer;
    }

    public final Image write() {
        return (Image) this.serializer.keySet();
    }

    public accessgetProgramRedcp(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.serializer.put(((accessgetNumPadAddcp) it.next()).getApiKey(), null);
        }
        this.IconCompatParcelizer = this.serializer.MediaMetadataCompat;
    }
}
