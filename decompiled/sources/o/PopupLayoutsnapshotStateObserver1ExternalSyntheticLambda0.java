package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.pudo.OrderStatusValue$Companion;
import com.roadrunner.delivery.state.pudo.TagColorToken;
import kotlinx.serialization.Serializable;
import o.PopupLayoutsnapshotStateObserver1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0 {
    public static final OrderStatusValue$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.OrderStatusValue$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            PopupLayoutsnapshotStateObserver1 popupLayoutsnapshotStateObserver1;
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 1;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                popupLayoutsnapshotStateObserver1 = PopupLayoutsnapshotStateObserver1.RemoteActionCompatParcelizer;
                int i3 = 68 / 0;
            } else {
                popupLayoutsnapshotStateObserver1 = PopupLayoutsnapshotStateObserver1.RemoteActionCompatParcelizer;
            }
            int i4 = IconCompatParcelizer + 59;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return popupLayoutsnapshotStateObserver1;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String date;
    public final TagColorToken style;
    public final String text;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.pudo.OrderStatusValue$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 27;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 99;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.date;
        int i5 = i3 + 51;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final TagColorToken read() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 123;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        TagColorToken tagColorToken = this.style;
        int i5 = i2 + 25;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return tagColorToken;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = write + 85;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.text;
        }
        int i3 = 4 / 0;
        return this.text;
    }

    public /* synthetic */ PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0(int i, String str, TagColorToken tagColorToken, String str2) {
        if (3 == (i & 3)) {
            this.text = str;
            this.style = tagColorToken;
            if ((i & 4) == 0) {
                this.date = null;
                int i2 = write + 75;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            this.date = str2;
            int i3 = serializer + 59;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, PopupLayoutsnapshotStateObserver1.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 113;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.text.hashCode();
        int iHashCode3 = this.style.hashCode();
        String str = this.date;
        if (str == null) {
            int i4 = write + 113;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return ((iHashCode3 + (iHashCode2 * 31)) * 31) + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("OrderStatusValue(text=");
        sb.append(this.text);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", date=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.date, ")");
        int i2 = write + 27;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r1 = (o.PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0) r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.text, r1.text}, o.getCieXyz.write())).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if (r21.style == r1.style) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        r1 = o.PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0.write + 23;
        o.PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.date, r1.date}, o.getCieXyz.write())).booleanValue()) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
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
            int r3 = o.PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0.write
            int r3 = r3 + 13
            int r4 = r3 % 128
            o.PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0.serializer = r4
            int r3 = r3 % r2
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L1a
            r3 = 42
            int r3 = r3 / r5
            if (r0 != r1) goto L1d
            goto L1c
        L1a:
            if (r0 != r1) goto L1d
        L1c:
            return r4
        L1d:
            boolean r3 = r1 instanceof o.PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0
            if (r3 != 0) goto L22
            return r5
        L22:
            o.PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0 r1 = (o.PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0) r1
            java.lang.String r3 = r0.text
            java.lang.String r6 = r1.text
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
            if (r3 != 0) goto L52
            return r5
        L52:
            com.roadrunner.delivery.state.pudo.TagColorToken r3 = r0.style
            com.roadrunner.delivery.state.pudo.TagColorToken r6 = r1.style
            if (r3 == r6) goto L62
            int r1 = o.PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0.write
            int r1 = r1 + 23
            int r3 = r1 % 128
            o.PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0.serializer = r3
            int r1 = r1 % r2
            return r5
        L62:
            java.lang.String r2 = r0.date
            java.lang.String r1 = r1.date
            java.lang.Object[] r19 = new java.lang.Object[]{r2, r1}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ r4
            if (r1 == 0) goto L88
            return r5
        L88:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.PopupLayoutsnapshotStateObserver1ExternalSyntheticLambda0.equals(java.lang.Object):boolean");
    }
}
