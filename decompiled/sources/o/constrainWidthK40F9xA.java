package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.customerunavailable.UtccComponentUiItem$TimerCardUiItem$TimerState$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.constrain4WqzIAM;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class constrainWidthK40F9xA {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final String description;
    public final getNoopState stateChangeAction;
    public static final UtccComponentUiItem$TimerCardUiItem$TimerState$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.customerunavailable.UtccComponentUiItem$TimerCardUiItem$TimerState$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 3;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            constrain4WqzIAM constrain4wqziam = constrain4WqzIAM.IconCompatParcelizer;
            int i4 = write + 71;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return constrain4wqziam;
            }
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fastFilteredMap(3))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.customerunavailable.UtccComponentUiItem$TimerCardUiItem$TimerState$Companion] */
    static {
        int i = IconCompatParcelizer + 101;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ constrainWidthK40F9xA(int i, String str, getNoopState getnoopstate) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.description = null;
        } else {
            this.description = str;
            int i2 = RemoteActionCompatParcelizer + 33;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 2) != 0) {
            this.stateChangeAction = getnoopstate;
            return;
        }
        int i4 = write;
        int i5 = i4 + 49;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        this.stateChangeAction = null;
        int i7 = i4 + 87;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public constrainWidthK40F9xA(String str, getNoopState getnoopstate) {
        this.description = str;
        this.stateChangeAction = getnoopstate;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    public final int hashCode() {
        String str;
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 97;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i4;
        int i5 = 1;
        if (i3 % 2 != 0) {
            str = this.description;
            if (str == null) {
                iHashCode = 1;
                i = i4 + 81;
                RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    i5 = 0;
                }
            } else {
                int iHashCode2 = str.hashCode();
                iHashCode = i5;
                i5 = iHashCode2;
            }
        } else {
            str = this.description;
            if (str == null) {
                iHashCode = 0;
                i = i4 + 81;
                RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    i5 = 0;
                }
            } else {
                i5 = 0;
                int iHashCode3 = str.hashCode();
                iHashCode = i5;
                i5 = iHashCode3;
            }
        }
        getNoopState getnoopstate = this.stateChangeAction;
        if (getnoopstate != null) {
            iHashCode = getnoopstate.hashCode();
        }
        return (i5 * 31) + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "TimerState(description=" + this.description + ", stateChangeAction=" + this.stateChangeAction + ")";
        int i2 = RemoteActionCompatParcelizer + 71;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 32 / 0;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.constrainWidthK40F9xA) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r1 = (o.constrainWidthK40F9xA) r22;
        r12 = new java.lang.Object[]{r21.description, r1.description};
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        r1 = o.constrainWidthK40F9xA.RemoteActionCompatParcelizer + 43;
        o.constrainWidthK40F9xA.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        r19 = new java.lang.Object[]{r21.stateChangeAction, r1.stateChangeAction};
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
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
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = 2
            int r3 = r2 % r2
            int r3 = o.constrainWidthK40F9xA.write
            int r3 = r3 + 123
            int r4 = r3 % 128
            o.constrainWidthK40F9xA.RemoteActionCompatParcelizer = r4
            int r3 = r3 % r2
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L1a
            r3 = 56
            int r3 = r3 / r5
            if (r0 != r1) goto L1d
            goto L1c
        L1a:
            if (r0 != r1) goto L1d
        L1c:
            return r4
        L1d:
            boolean r3 = r1 instanceof o.constrainWidthK40F9xA
            if (r3 != 0) goto L22
            return r5
        L22:
            o.constrainWidthK40F9xA r1 = (o.constrainWidthK40F9xA) r1
            java.lang.String r3 = r0.description
            java.lang.String r6 = r1.description
            java.lang.Object[] r12 = new java.lang.Object[]{r3, r6}
            int r7 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r13 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            r15 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r16 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r8 = r15
            r9 = r16
            java.lang.Object r3 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L5b
            int r1 = o.constrainWidthK40F9xA.RemoteActionCompatParcelizer
            int r1 = r1 + 43
            int r3 = r1 % 128
            o.constrainWidthK40F9xA.write = r3
            int r1 = r1 % r2
            return r5
        L5b:
            o.getNoopState r2 = r0.stateChangeAction
            o.getNoopState r1 = r1.stateChangeAction
            java.lang.Object[] r19 = new java.lang.Object[]{r2, r1}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L80
            return r5
        L80:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.constrainWidthK40F9xA.equals(java.lang.Object):boolean");
    }
}
