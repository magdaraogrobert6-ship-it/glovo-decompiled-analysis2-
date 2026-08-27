package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.opportunities.data.OpportunitiesResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class w4ExternalSyntheticLambda0 {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final OpportunitiesResponse$Companion Companion = new OpportunitiesResponse$Companion();
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final vf activeArea;
    public final List opportunities;
    public final boolean showZone;
    public final List startNow;
    public final List subzones;
    public final List zones;

    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new waExternalSyntheticLambda3(18)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new waExternalSyntheticLambda3(19)), null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new waExternalSyntheticLambda3(20)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new waExternalSyntheticLambda3(21))};
        int i = write + 101;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ w4ExternalSyntheticLambda0(int i, List list, List list2, boolean z, vf vfVar, List list3, List list4) {
        if (7 == (i & 7)) {
            this.opportunities = list;
            this.zones = list2;
            this.showZone = z;
            if ((i & 8) == 0) {
                this.activeArea = null;
            } else {
                this.activeArea = vfVar;
            }
            int i2 = 2 % 2;
            if ((i & 16) == 0) {
                int i3 = IconCompatParcelizer + 47;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    this.subzones = null;
                } else {
                    this.subzones = null;
                    throw null;
                }
            } else {
                this.subzones = list3;
                int i4 = 2 % 2;
            }
            if ((i & 32) == 0) {
                int i5 = IconCompatParcelizer + 103;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                this.startNow = null;
                return;
            }
            this.startNow = list4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, w2.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 123;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.zones, this.opportunities.hashCode() * 31, 31), 31, this.showZone);
        vf vfVar = this.activeArea;
        int iHashCode2 = vfVar == null ? 0 : vfVar.hashCode();
        List list = this.subzones;
        if (list == null) {
            int i4 = IconCompatParcelizer + 13;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        List list2 = this.startNow;
        return ((((iM + iHashCode2) * 31) + iHashCode) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OpportunitiesResponse(opportunities=" + this.opportunities + ", zones=" + this.zones + ", showZone=" + this.showZone + ", activeArea=" + this.activeArea + ", subzones=" + this.subzones + ", startNow=" + this.startNow + ")";
        int i2 = IconCompatParcelizer + 13;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.w4ExternalSyntheticLambda0) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r1 = (o.w4ExternalSyntheticLambda0) r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.opportunities, r1.opportunities}, o.getCieXyz.write())).booleanValue()) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.zones, r1.zones}, o.getCieXyz.write())).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (r21.showZone == r1.showZone) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        r1 = o.w4ExternalSyntheticLambda0.IconCompatParcelizer + 103;
        r3 = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        o.w4ExternalSyntheticLambda0.read = r3;
        r1 = r1 % 2;
        r3 = r3 + 1;
        o.w4ExternalSyntheticLambda0.IconCompatParcelizer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        if ((r3 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        r1 = 46 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ba, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.activeArea, r1.activeArea}, o.getCieXyz.write())).booleanValue() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e2, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.subzones, r1.subzones}, o.getCieXyz.write())).booleanValue() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e4, code lost:
    
        r1 = o.w4ExternalSyntheticLambda0.IconCompatParcelizer + 49;
        o.w4ExternalSyntheticLambda0.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ed, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0113, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.startNow, r1.startNow}, o.getCieXyz.write())).booleanValue() == true) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0115, code lost:
    
        r1 = o.w4ExternalSyntheticLambda0.read + 13;
        o.w4ExternalSyntheticLambda0.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.w4ExternalSyntheticLambda0.equals(java.lang.Object):boolean");
    }
}
