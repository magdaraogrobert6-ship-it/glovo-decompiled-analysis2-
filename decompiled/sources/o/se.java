package o;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class se {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    public final Map RemoteActionCompatParcelizer;
    public final s6 read;
    public final sa serializer;
    public final List write;

    public se(sa saVar, s6 s6Var, Map map, List list) {
        map.getClass();
        this.serializer = saVar;
        this.read = s6Var;
        this.RemoteActionCompatParcelizer = map;
        this.write = list;
    }

    public /* synthetic */ se() {
        this(sd.RemoteActionCompatParcelizer, null, SimpleItemTouchHelperCallback.serializer, instance_delegatelambda0.write);
    }

    public static se RemoteActionCompatParcelizer(se seVar, sb sbVar) {
        int i = 2 % 2;
        s6 s6Var = seVar.read;
        Map map = seVar.RemoteActionCompatParcelizer;
        List list = seVar.write;
        seVar.getClass();
        map.getClass();
        list.getClass();
        se seVar2 = new se(sbVar, s6Var, map, list);
        int i2 = IconCompatParcelizer + 9;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return seVar2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.serializer.hashCode();
        s6 s6Var = this.read;
        if (s6Var == null) {
            int i4 = MediaDescriptionCompat + 71;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = s6Var.serializer.hashCode();
        }
        return this.write.hashCode() + IconCompatParcelizer.RemoteActionCompatParcelizer(((iHashCode2 * 31) + iHashCode) * 31, this.RemoteActionCompatParcelizer, 31);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OpportunitiesInfo(opportunities=" + this.serializer + ", activeArea=" + this.read + ", zones=" + this.RemoteActionCompatParcelizer + ", startNow=" + this.write + ")";
        int i2 = IconCompatParcelizer + 55;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 25;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se)) {
            int i4 = i3 + 107;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        se seVar = (se) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, seVar.serializer}, getCieXyz.write())).booleanValue()) {
            int i5 = IconCompatParcelizer + 21;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, seVar.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, seVar.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i7 = MediaDescriptionCompat + 1;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, seVar.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i9 = MediaDescriptionCompat + 107;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return true;
    }
}
