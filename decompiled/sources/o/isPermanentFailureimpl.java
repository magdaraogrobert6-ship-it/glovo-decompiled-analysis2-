package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.DeliveryRequestBody$Issues$Companion;
import kotlinx.serialization.Serializable;
import o.get1ASDuI8;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class isPermanentFailureimpl {
    public static final DeliveryRequestBody$Issues$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.DeliveryRequestBody$Issues$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 115;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            get1ASDuI8 get1asdui8 = get1ASDuI8.read;
            int i4 = write + 21;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return get1asdui8;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final AsyncTypefaceCacheAsyncTypefaceResult cashCollection;
    public final String paymentType;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.DeliveryRequestBody$Issues$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 43;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    public /* synthetic */ isPermanentFailureimpl(int i, AsyncTypefaceCacheAsyncTypefaceResult asyncTypefaceCacheAsyncTypefaceResult, String str) {
        if ((i & 1) == 0) {
            this.cashCollection = null;
            int i2 = read + 43;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } else {
            this.cashCollection = asyncTypefaceCacheAsyncTypefaceResult;
            int i4 = read + 33;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 3 % 2;
            } else {
                int i6 = 2 % 2;
            }
        }
        if ((i & 2) == 0) {
            this.paymentType = null;
        } else {
            this.paymentType = str;
        }
    }

    public isPermanentFailureimpl(AsyncTypefaceCacheAsyncTypefaceResult asyncTypefaceCacheAsyncTypefaceResult) {
        this.cashCollection = asyncTypefaceCacheAsyncTypefaceResult;
        this.paymentType = null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 99;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AsyncTypefaceCacheAsyncTypefaceResult asyncTypefaceCacheAsyncTypefaceResult = this.cashCollection;
        int iHashCode = 0;
        int iHashCode2 = asyncTypefaceCacheAsyncTypefaceResult == null ? 0 : asyncTypefaceCacheAsyncTypefaceResult.hashCode();
        String str = this.paymentType;
        if (str == null) {
            int i4 = read + 123;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 4 / 3;
            }
        } else {
            iHashCode = str.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Issues(cashCollection=" + this.cashCollection + ", paymentType=" + this.paymentType + ")";
        int i2 = read + 71;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if ((r22 instanceof o.isPermanentFailureimpl) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = (o.isPermanentFailureimpl) r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.cashCollection, r1.cashCollection}, o.getCieXyz.write())).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        r1 = o.isPermanentFailureimpl.serializer + 23;
        o.isPermanentFailureimpl.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.paymentType, r1.paymentType}, o.getCieXyz.write())).booleanValue()) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        return false;
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
            int r3 = o.isPermanentFailureimpl.serializer
            r4 = 1
            int r3 = r3 + r4
            int r5 = r3 % 128
            o.isPermanentFailureimpl.read = r5
            int r3 = r3 % r2
            r5 = 0
            if (r3 == 0) goto L19
            r3 = 81
            int r3 = r3 / r5
            if (r0 != r1) goto L1c
            goto L1b
        L19:
            if (r0 != r1) goto L1c
        L1b:
            return r4
        L1c:
            boolean r3 = r1 instanceof o.isPermanentFailureimpl
            if (r3 == 0) goto L80
            o.isPermanentFailureimpl r1 = (o.isPermanentFailureimpl) r1
            o.AsyncTypefaceCacheAsyncTypefaceResult r3 = r0.cashCollection
            o.AsyncTypefaceCacheAsyncTypefaceResult r6 = r1.cashCollection
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
            if (r3 != 0) goto L59
            int r1 = o.isPermanentFailureimpl.serializer
            int r1 = r1 + 23
            int r3 = r1 % 128
            o.isPermanentFailureimpl.read = r3
            int r1 = r1 % r2
            return r5
        L59:
            java.lang.String r2 = r0.paymentType
            java.lang.String r1 = r1.paymentType
            java.lang.Object[] r19 = new java.lang.Object[]{r2, r1}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ r4
            if (r1 == 0) goto L7f
            return r5
        L7f:
            return r4
        L80:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isPermanentFailureimpl.equals(java.lang.Object):boolean");
    }
}
