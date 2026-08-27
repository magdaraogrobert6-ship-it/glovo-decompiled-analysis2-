package o;

import com.google.android.gms.internal.gtm.zzbv;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutModifierNodeKt {
    public final HashMap serializer;
    public final HashMap write;

    public LayoutModifierNodeKt(zzbv zzbvVar) {
        this.serializer = new HashMap((HashMap) zzbvVar.RemoteActionCompatParcelizer);
        this.write = new HashMap((HashMap) zzbvVar.write);
    }
}
