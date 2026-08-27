package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.state.entity.HomeResponseItems$Companion;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getPreserveFocusAfterLayout;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getMinFlingVelocity {
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final getMaxFlingVelocity deliveryState;
    public final Map deliveryTasks;
    public final getMaxFlingVelocity garnet;
    public final getMaxFlingVelocity heatmaps;
    public final getMaxFlingVelocity instantShifts;
    public final getMaxFlingVelocity quickSessions;
    public final getOnFlingListener riderState;
    public final getMaxFlingVelocity riderStatus;
    public final getMaxFlingVelocity tnc;
    public final getMaxFlingVelocity verificationStatus;
    public final getMaxFlingVelocity workOpportunities;
    public static final HomeResponseItems$Companion Companion = new Object() { // from class: com.roadrunner.home.state.entity.HomeResponseItems$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 95;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getPreserveFocusAfterLayout getpreservefocusafterlayout = getPreserveFocusAfterLayout.IconCompatParcelizer;
            int i4 = serializer + 33;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 65 / 0;
            }
            return getpreservefocusafterlayout;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new waExternalSyntheticLambda3(1)), null, null, null, null, null, null, null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.state.entity.HomeResponseItems$Companion] */
    static {
        int i = read + 85;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getMinFlingVelocity(int i, getMaxFlingVelocity getmaxflingvelocity, getMaxFlingVelocity getmaxflingvelocity2, Map map, getMaxFlingVelocity getmaxflingvelocity3, getMaxFlingVelocity getmaxflingvelocity4, getMaxFlingVelocity getmaxflingvelocity5, getMaxFlingVelocity getmaxflingvelocity6, getMaxFlingVelocity getmaxflingvelocity7, getOnFlingListener getonflinglistener, getMaxFlingVelocity getmaxflingvelocity8, getMaxFlingVelocity getmaxflingvelocity9) {
        if (3 != (i & 3)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getPreserveFocusAfterLayout.IconCompatParcelizer.getDescriptor());
            throw null;
        }
        this.riderStatus = getmaxflingvelocity;
        this.deliveryState = getmaxflingvelocity2;
        if ((i & 4) == 0) {
            this.deliveryTasks = null;
            int i2 = 2 % 2;
        } else {
            this.deliveryTasks = map;
        }
        if ((i & 8) == 0) {
            this.heatmaps = null;
        } else {
            this.heatmaps = getmaxflingvelocity3;
        }
        if ((i & 16) == 0) {
            int i3 = IconCompatParcelizer + 125;
            int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i4;
            int i5 = i3 % 2;
            this.instantShifts = null;
            int i6 = i4 + 79;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 4 % 4;
            } else {
                int i8 = 2 % 2;
            }
        } else {
            this.instantShifts = getmaxflingvelocity4;
        }
        if ((i & 32) == 0) {
            this.workOpportunities = null;
        } else {
            this.workOpportunities = getmaxflingvelocity5;
        }
        if ((i & 64) == 0) {
            this.tnc = null;
        } else {
            this.tnc = getmaxflingvelocity6;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            this.verificationStatus = null;
        } else {
            this.verificationStatus = getmaxflingvelocity7;
            int i9 = 2 % 2;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            int i10 = IconCompatParcelizer + 123;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            this.riderState = null;
        } else {
            this.riderState = getonflinglistener;
            int i12 = serializer + 89;
            IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) == 0) {
            int i15 = IconCompatParcelizer + 55;
            serializer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i16 = i15 % 2;
            this.garnet = null;
            int i17 = 2 % 2;
        } else {
            this.garnet = getmaxflingvelocity8;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationZ) != 0) {
            this.quickSessions = getmaxflingvelocity9;
            return;
        }
        int i18 = IconCompatParcelizer + 23;
        serializer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i19 = i18 % 2;
        this.quickSessions = null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "HomeResponseItems(riderStatus=" + this.riderStatus + ", deliveryState=" + this.deliveryState + ", deliveryTasks=" + this.deliveryTasks + ", heatmaps=" + this.heatmaps + ", instantShifts=" + this.instantShifts + ", workOpportunities=" + this.workOpportunities + ", tnc=" + this.tnc + ", verificationStatus=" + this.verificationStatus + ", riderState=" + this.riderState + ", garnet=" + this.garnet + ", quickSessions=" + this.quickSessions + ")";
        int i2 = serializer + 87;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        Map map;
        int iHashCode3;
        int i;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int i2 = 2 % 2;
        int iHashCode7 = 1;
        int i3 = IconCompatParcelizer + 1;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode8 = 0;
        if (i3 % 2 != 0) {
            iHashCode = this.riderStatus.hashCode();
            iHashCode2 = this.deliveryState.hashCode();
            map = this.deliveryTasks;
            if (map == null) {
                i = 1;
                iHashCode3 = i;
                iHashCode4 = 0;
            } else {
                iHashCode3 = 1;
                iHashCode4 = map.hashCode();
            }
        } else {
            iHashCode = this.riderStatus.hashCode();
            iHashCode2 = this.deliveryState.hashCode();
            map = this.deliveryTasks;
            if (map == null) {
                i = 0;
                iHashCode3 = i;
                iHashCode4 = 0;
            } else {
                iHashCode3 = 0;
                iHashCode4 = map.hashCode();
            }
        }
        getMaxFlingVelocity getmaxflingvelocity = this.heatmaps;
        int iHashCode9 = getmaxflingvelocity == null ? 0 : getmaxflingvelocity.hashCode();
        getMaxFlingVelocity getmaxflingvelocity2 = this.instantShifts;
        if (getmaxflingvelocity2 == null) {
            int i4 = IconCompatParcelizer + 101;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = getmaxflingvelocity2.hashCode();
        }
        getMaxFlingVelocity getmaxflingvelocity3 = this.workOpportunities;
        int iHashCode10 = getmaxflingvelocity3 == null ? 0 : getmaxflingvelocity3.hashCode();
        getMaxFlingVelocity getmaxflingvelocity4 = this.tnc;
        if (getmaxflingvelocity4 == null) {
            int i6 = IconCompatParcelizer + 55;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = getmaxflingvelocity4.hashCode();
        }
        getMaxFlingVelocity getmaxflingvelocity5 = this.verificationStatus;
        int iHashCode11 = getmaxflingvelocity5 == null ? 0 : getmaxflingvelocity5.hashCode();
        getOnFlingListener getonflinglistener = this.riderState;
        if (getonflinglistener == null) {
            int i8 = serializer + 1;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                iHashCode7 = 0;
            }
        } else {
            iHashCode7 = getonflinglistener.hashCode();
        }
        getMaxFlingVelocity getmaxflingvelocity6 = this.garnet;
        if (getmaxflingvelocity6 == null) {
            int i9 = serializer + 57;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
        } else {
            iHashCode8 = getmaxflingvelocity6.hashCode();
        }
        getMaxFlingVelocity getmaxflingvelocity7 = this.quickSessions;
        if (getmaxflingvelocity7 != null) {
            iHashCode3 = getmaxflingvelocity7.hashCode();
        }
        return ((((((((((((((((((iHashCode2 + (iHashCode * 31)) * 31) + iHashCode4) * 31) + iHashCode9) * 31) + iHashCode5) * 31) + iHashCode10) * 31) + iHashCode6) * 31) + iHashCode11) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if ((!(r22 instanceof o.getMinFlingVelocity)) == true) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        r1 = (o.getMinFlingVelocity) r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.riderStatus, r1.riderStatus}, o.getCieXyz.write())).booleanValue() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        r1 = o.getMinFlingVelocity.serializer + 31;
        o.getMinFlingVelocity.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.deliveryState, r1.deliveryState}, o.getCieXyz.write())).booleanValue() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ae, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.deliveryTasks, r1.deliveryTasks}, o.getCieXyz.write())).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b0, code lost:
    
        r1 = o.getMinFlingVelocity.IconCompatParcelizer + 93;
        o.getMinFlingVelocity.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00df, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.heatmaps, r1.heatmaps}, o.getCieXyz.write())).booleanValue() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0108, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.instantShifts, r1.instantShifts}, o.getCieXyz.write())).booleanValue()) == true) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x012f, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.workOpportunities, r1.workOpportunities}, o.getCieXyz.write())).booleanValue() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0131, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0157, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.tnc, r1.tnc}, o.getCieXyz.write())).booleanValue() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0159, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x017f, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.verificationStatus, r1.verificationStatus}, o.getCieXyz.write())).booleanValue() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0181, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a7, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.riderState, r1.riderState}, o.getCieXyz.write())).booleanValue() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01cf, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.garnet, r1.garnet}, o.getCieXyz.write())).booleanValue() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f7, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.quickSessions, r1.quickSessions}, o.getCieXyz.write())).booleanValue() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01f9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01fa, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01fb, code lost:
    
        r1 = o.getMinFlingVelocity.serializer + 5;
        r3 = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        o.getMinFlingVelocity.IconCompatParcelizer = r3;
        r1 = r1 % 2;
        r3 = r3 + 83;
        o.getMinFlingVelocity.serializer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x020b, code lost:
    
        if ((r3 % 2) != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x020d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x020f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0210, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r3 = r3 + 91;
        o.getMinFlingVelocity.IconCompatParcelizer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getMinFlingVelocity.equals(java.lang.Object):boolean");
    }
}
