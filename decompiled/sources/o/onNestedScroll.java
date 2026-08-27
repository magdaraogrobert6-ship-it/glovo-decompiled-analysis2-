package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$VoteRequest$Companion;
import kotlinx.serialization.Serializable;
import o.onNestedPreFling;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class onNestedScroll {
    public static final DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$VoteRequest$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$VoteRequest$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 103;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            onNestedPreFling onnestedprefling = onNestedPreFling.read;
            int i4 = write + 71;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return onnestedprefling;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final String method;
    public final r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k payload;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Picture$VoteRequest$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 29;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ onNestedScroll(int i, String str, String str2, r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r8lambdaerwhggzq_gqgn8cultnvrcshm8k) {
        if (7 == (i & 7)) {
            this.url = str;
            this.method = str2;
            this.payload = r8lambdaerwhggzq_gqgn8cultnvrcshm8k;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, onNestedPreFling.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 125;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.payload.content.hashCode() - af$$ExternalSyntheticOutline0.m(this.url.hashCode() - 66, 47, this.method);
        } else {
            iHashCode = this.payload.content.hashCode() + af$$ExternalSyntheticOutline0.m(this.url.hashCode() * 31, 31, this.method);
        }
        int i3 = IconCompatParcelizer + 23;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        String string;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 79;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("VoteRequest(url=", this.url, ", method=", this.method, ", payload=");
            sbM.append(this.payload);
            sbM.append(")");
            string = sbM.toString();
            int i3 = 48 / 0;
        } else {
            StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m("VoteRequest(url=", this.url, ", method=", this.method, ", payload=");
            sbM2.append(this.payload);
            sbM2.append(")");
            string = sbM2.toString();
        }
        int i4 = IconCompatParcelizer + 51;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if ((r22 instanceof o.onNestedScroll) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r4 = r4 + 113;
        o.onNestedScroll.read = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        r1 = (o.onNestedScroll) r22;
        r12 = new java.lang.Object[]{r21.url, r1.url};
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        r1 = o.onNestedScroll.read + 37;
        o.onNestedScroll.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if ((r1 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        r1 = 74 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r19 = new java.lang.Object[]{r21.method, r1.method};
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        r1 = o.onNestedScroll.read + 117;
        o.onNestedScroll.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0095, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
    
        r19 = new java.lang.Object[]{r21.payload, r1.payload};
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bb, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bd, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
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
            int r3 = o.onNestedScroll.read
            int r3 = r3 + 47
            int r4 = r3 % 128
            o.onNestedScroll.IconCompatParcelizer = r4
            int r3 = r3 % r2
            r5 = 1
            r6 = 0
            if (r3 != 0) goto L19
            r3 = 7
            int r3 = r3 / r6
            if (r0 != r1) goto L1c
            goto L1b
        L19:
            if (r0 != r1) goto L1c
        L1b:
            return r5
        L1c:
            boolean r3 = r1 instanceof o.onNestedScroll
            if (r3 != 0) goto L28
            int r4 = r4 + 113
            int r1 = r4 % 128
            o.onNestedScroll.read = r1
            int r4 = r4 % r2
            return r6
        L28:
            o.onNestedScroll r1 = (o.onNestedScroll) r1
            java.lang.String r3 = r0.url
            java.lang.String r4 = r1.url
            java.lang.Object[] r12 = new java.lang.Object[]{r3, r4}
            int r7 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r13 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            r3 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r4 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r8 = r3
            r9 = r4
            java.lang.Object r7 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L65
            int r1 = o.onNestedScroll.read
            int r1 = r1 + 37
            int r3 = r1 % 128
            o.onNestedScroll.IconCompatParcelizer = r3
            int r1 = r1 % r2
            if (r1 != 0) goto L64
            r1 = 74
            int r1 = r1 / r6
        L64:
            return r6
        L65:
            java.lang.String r7 = r0.method
            java.lang.String r8 = r1.method
            java.lang.Object[] r19 = new java.lang.Object[]{r7, r8}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            r15 = r3
            r16 = r4
            java.lang.Object r7 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L96
            int r1 = o.onNestedScroll.read
            int r1 = r1 + 117
            int r3 = r1 % 128
            o.onNestedScroll.IconCompatParcelizer = r3
            int r1 = r1 % r2
            return r6
        L96:
            o.r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r2 = r0.payload
            o.r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r1 = r1.payload
            java.lang.Object[] r19 = new java.lang.Object[]{r2, r1}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            r15 = r3
            r16 = r4
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto Lbe
            return r6
        Lbe:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onNestedScroll.equals(java.lang.Object):boolean");
    }
}
