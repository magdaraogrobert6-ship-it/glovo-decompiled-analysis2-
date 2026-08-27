package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.pudo.OrderStatusCondition$Companion;
import com.roadrunner.delivery.state.pudo.ValidationType;
import kotlinx.serialization.Serializable;
import o.PopupLayoutWhenMappings;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class PopupLayoutCompaniononCommitAffectingPopupPosition1 {
    public static final OrderStatusCondition$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.OrderStatusCondition$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 101;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            PopupLayoutWhenMappings popupLayoutWhenMappings = PopupLayoutWhenMappings.read;
            int i4 = IconCompatParcelizer + 35;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return popupLayoutWhenMappings;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public final String date;
    public final ValidationType validationType;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.pudo.OrderStatusCondition$Companion] */
    static {
        int i = read + 53;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 63;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.date;
        int i5 = i2 + 51;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final ValidationType write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 13;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ValidationType validationType = this.validationType;
        int i5 = i2 + 43;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return validationType;
    }

    public /* synthetic */ PopupLayoutCompaniononCommitAffectingPopupPosition1(int i, String str, ValidationType validationType) {
        if (3 == (i & 3)) {
            this.date = str;
            this.validationType = validationType;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, PopupLayoutWhenMappings.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 115;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.validationType.hashCode() >> (this.date.hashCode() - 97);
        } else {
            iHashCode = (this.date.hashCode() * 31) + this.validationType.hashCode();
        }
        int i3 = IconCompatParcelizer + 113;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r13 instanceof o.PopupLayoutCompaniononCommitAffectingPopupPosition1) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r13 = (o.PopupLayoutCompaniononCommitAffectingPopupPosition1) r13;
        r10 = new java.lang.Object[]{r12.date, r13.date};
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r10, o.getCieXyz.write())).booleanValue() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r12.validationType == r13.validationType) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 51;
        o.PopupLayoutCompaniononCommitAffectingPopupPosition1.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.PopupLayoutCompaniononCommitAffectingPopupPosition1.write
            int r2 = r1 + 69
            int r3 = r2 % 128
            o.PopupLayoutCompaniononCommitAffectingPopupPosition1.IconCompatParcelizer = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 46
            int r2 = r2 / r4
            if (r12 != r13) goto L20
            goto L18
        L16:
            if (r12 != r13) goto L20
        L18:
            int r1 = r1 + 51
            int r13 = r1 % 128
            o.PopupLayoutCompaniononCommitAffectingPopupPosition1.IconCompatParcelizer = r13
            int r1 = r1 % r0
            return r3
        L20:
            boolean r0 = r13 instanceof o.PopupLayoutCompaniononCommitAffectingPopupPosition1
            if (r0 != 0) goto L25
            return r4
        L25:
            o.PopupLayoutCompaniononCommitAffectingPopupPosition1 r13 = (o.PopupLayoutCompaniononCommitAffectingPopupPosition1) r13
            java.lang.String r0 = r12.date
            java.lang.String r1 = r13.date
            java.lang.Object[] r10 = new java.lang.Object[]{r0, r1}
            int r5 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            r6 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r7 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r0 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L52
            return r4
        L52:
            com.roadrunner.delivery.state.pudo.ValidationType r0 = r12.validationType
            com.roadrunner.delivery.state.pudo.ValidationType r13 = r13.validationType
            if (r0 == r13) goto L59
            return r4
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.PopupLayoutCompaniononCommitAffectingPopupPosition1.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OrderStatusCondition(date=" + this.date + ", validationType=" + this.validationType + ")";
        int i2 = IconCompatParcelizer + 71;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
