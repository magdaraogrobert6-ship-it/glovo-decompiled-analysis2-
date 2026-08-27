package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.customerunavailable.UtccComponentUiItem$TimerCardUiItem$Companion;
import java.util.List;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.constrainN9IONVI;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class bitOffsetToIndex extends fixedWidthOenEA2s {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final UtccComponentUiItem$TimerCardUiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.customerunavailable.UtccComponentUiItem$TimerCardUiItem$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 17;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            constrainN9IONVI constrainn9ionvi = constrainN9IONVI.write;
            int i4 = RemoteActionCompatParcelizer + 73;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 9 / 0;
            }
            return constrainn9ionvi;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final Map availableStates;
    public final constrainWidthK40F9xA currentState;
    public final bitsNeedForSizeUnchecked currentStateType;
    public final String id;
    public final boolean isEnabled;
    public final List requiredSteps;
    public final int timerInSeconds;
    public final String timerText;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.customerunavailable.UtccComponentUiItem$TimerCardUiItem$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new fastFilteredMap(1)), null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new fastFilteredMap(2))};
        int i = RemoteActionCompatParcelizer + 35;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 19 / 0;
        }
    }

    @Override // o.fixedWidthOenEA2s
    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 45;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.id;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.fixedWidthOenEA2s
    public final List read() {
        List list;
        int i = 2 % 2;
        int i2 = read + 121;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            list = this.requiredSteps;
            int i4 = 26 / 0;
        } else {
            list = this.requiredSteps;
        }
        int i5 = i3 + 43;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public /* synthetic */ bitOffsetToIndex(int i, String str, String str2, List list, int i2, Map map) {
        if (11 == (i & 11)) {
            this.id = str;
            this.title = str2;
            if ((i & 4) == 0) {
                this.requiredSteps = instance_delegatelambda0.write;
                int i3 = 2 % 2;
            } else {
                this.requiredSteps = list;
            }
            this.timerInSeconds = i2;
            if ((i & 16) != 0) {
                this.availableStates = map;
            } else {
                int i4 = IconCompatParcelizer + 9;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    this.availableStates = SimpleItemTouchHelperCallback.serializer;
                    int i5 = 58 / 0;
                } else {
                    this.availableStates = SimpleItemTouchHelperCallback.serializer;
                }
            }
            this.timerText = null;
            this.currentState = null;
            this.currentStateType = bitsNeedForSizeUnchecked.DISABLED;
            this.isEnabled = true;
            int i6 = IconCompatParcelizer + 49;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 11, constrainN9IONVI.write.getDescriptor());
        throw null;
    }

    public static bitOffsetToIndex read(bitOffsetToIndex bitoffsettoindex, String str, constrainWidthK40F9xA constrainwidthk40f9xa, bitsNeedForSizeUnchecked bitsneedforsizeunchecked, boolean z, int i) {
        String str2;
        constrainWidthK40F9xA constrainwidthk40f9xa2;
        bitsNeedForSizeUnchecked bitsneedforsizeunchecked2;
        boolean z2;
        bitsNeedForSizeUnchecked bitsneedforsizeunchecked3;
        int i2 = 2 % 2;
        String str3 = bitoffsettoindex.id;
        String str4 = bitoffsettoindex.title;
        List list = bitoffsettoindex.requiredSteps;
        int i3 = bitoffsettoindex.timerInSeconds;
        Map map = bitoffsettoindex.availableStates;
        if ((i & 32) != 0) {
            int i4 = read + 65;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            str2 = bitoffsettoindex.timerText;
        } else {
            str2 = str;
        }
        if ((i & 64) != 0) {
            int i6 = IconCompatParcelizer + 51;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            constrainwidthk40f9xa2 = bitoffsettoindex.currentState;
        } else {
            constrainwidthk40f9xa2 = constrainwidthk40f9xa;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
            int i8 = IconCompatParcelizer + 93;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                bitsneedforsizeunchecked3 = bitoffsettoindex.currentStateType;
                int i9 = 86 / 0;
            } else {
                bitsneedforsizeunchecked3 = bitoffsettoindex.currentStateType;
            }
            bitsneedforsizeunchecked2 = bitsneedforsizeunchecked3;
        } else {
            bitsneedforsizeunchecked2 = bitsneedforsizeunchecked;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) != 0) {
            int i10 = IconCompatParcelizer + 91;
            read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z2 = bitoffsettoindex.isEnabled;
        } else {
            z2 = z;
        }
        str3.getClass();
        list.getClass();
        map.getClass();
        bitsneedforsizeunchecked2.getClass();
        return new bitOffsetToIndex(str3, str4, list, i3, map, str2, constrainwidthk40f9xa2, bitsneedforsizeunchecked2, z2);
    }

    public bitOffsetToIndex(String str, String str2, List list, int i, Map map, String str3, constrainWidthK40F9xA constrainwidthk40f9xa, bitsNeedForSizeUnchecked bitsneedforsizeunchecked, boolean z) {
        str.getClass();
        list.getClass();
        bitsneedforsizeunchecked.getClass();
        this.id = str;
        this.title = str2;
        this.requiredSteps = list;
        this.timerInSeconds = i;
        this.availableStates = map;
        this.timerText = str3;
        this.currentState = constrainwidthk40f9xa;
        this.currentStateType = bitsneedforsizeunchecked;
        this.isEnabled = z;
    }

    public /* synthetic */ bitOffsetToIndex(String str, String str2, List list, int i, safeSetClipToOutline safesetcliptooutline) {
        this(str, str2, list, i, safesetcliptooutline, null, null, bitsNeedForSizeUnchecked.DISABLED, true);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.id.hashCode();
        String str = this.title;
        if (str == null) {
            int i2 = read + 51;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iRemoteActionCompatParcelizer = IconCompatParcelizer.RemoteActionCompatParcelizer(af$$ExternalSyntheticOutline0.m(this.timerInSeconds, c8$$ExternalSyntheticOutline0.m(this.requiredSteps, ((iHashCode3 * 31) + iHashCode) * 31, 31), 31), this.availableStates, 31);
        String str2 = this.timerText;
        if (str2 == null) {
            int i4 = IconCompatParcelizer + 95;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        constrainWidthK40F9xA constrainwidthk40f9xa = this.currentState;
        return Boolean.hashCode(this.isEnabled) + ((this.currentStateType.hashCode() + ((((iRemoteActionCompatParcelizer + iHashCode2) * 31) + (constrainwidthk40f9xa != null ? constrainwidthk40f9xa.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 63;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("TimerCardUiItem(id=", this.id, ", title=", this.title, ", requiredSteps=");
        sbM.append(this.requiredSteps);
        sbM.append(", timerInSeconds=");
        sbM.append(this.timerInSeconds);
        sbM.append(", availableStates=");
        sbM.append(this.availableStates);
        sbM.append(", timerText=");
        sbM.append(this.timerText);
        sbM.append(", currentState=");
        sbM.append(this.currentState);
        sbM.append(", currentStateType=");
        sbM.append(this.currentStateType);
        sbM.append(", isEnabled=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.isEnabled, ")");
        int i4 = IconCompatParcelizer + 79;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return strM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.bitOffsetToIndex) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r1 = (o.bitOffsetToIndex) r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.id, r1.id}, o.getCieXyz.write())).booleanValue() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r1 = o.bitOffsetToIndex.IconCompatParcelizer + 13;
        r3 = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        o.bitOffsetToIndex.read = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        if ((r1 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        r3 = r3 + 57;
        o.bitOffsetToIndex.IconCompatParcelizer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if ((r3 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        r1 = 57 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.title, r1.title}, o.getCieXyz.write())).booleanValue() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b6, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.requiredSteps, r1.requiredSteps}, o.getCieXyz.write())).booleanValue() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bd, code lost:
    
        if (r21.timerInSeconds == r1.timerInSeconds) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e5, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.availableStates, r1.availableStates}, o.getCieXyz.write())).booleanValue() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010d, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.timerText, r1.timerText}, o.getCieXyz.write())).booleanValue() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010f, code lost:
    
        r1 = o.bitOffsetToIndex.IconCompatParcelizer + 29;
        o.bitOffsetToIndex.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0118, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x013e, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.currentState, r1.currentState}, o.getCieXyz.write())).booleanValue() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0140, code lost:
    
        r1 = o.bitOffsetToIndex.read + 43;
        o.bitOffsetToIndex.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0149, code lost:
    
        if ((r1 % 2) == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014b, code lost:
    
        r1 = 97 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0153, code lost:
    
        if (r21.currentStateType == r1.currentStateType) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0155, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x015a, code lost:
    
        if (r21.isEnabled == r1.isEnabled) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x015c, code lost:
    
        r1 = o.bitOffsetToIndex.read + 93;
        o.bitOffsetToIndex.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0165, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0166, code lost:
    
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
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bitOffsetToIndex.equals(java.lang.Object):boolean");
    }
}
