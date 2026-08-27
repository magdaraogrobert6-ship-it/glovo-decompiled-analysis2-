package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.remoteconfig.fwf.genii.PersistedEvalResult$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getAttributionWithTimeout {
    public static final PersistedEvalResult$Companion Companion = new PersistedEvalResult$Companion();
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final boolean abTest;
    public final String explanationKind;
    public final String variation;

    static {
        int i = serializer + 95;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getAttributionWithTimeout(int i, String str, String str2, boolean z) {
        if (7 == (i & 7)) {
            this.variation = str;
            this.abTest = z;
            this.explanationKind = str2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, getAdid.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 29;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return d$$ExternalSyntheticOutline0.m(this.variation.hashCode() * 31, 31, this.abTest) + this.explanationKind.hashCode();
        }
        return this.explanationKind.hashCode() >> d$$ExternalSyntheticOutline0.m(this.variation.hashCode() >>> 107, 58, this.abTest);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 11;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m("PersistedEvalResult(variation=", this.variation, ", abTest=", ", explanationKind=", this.abTest), this.explanationKind, ")");
        }
        ff$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m("PersistedEvalResult(variation=", this.variation, ", abTest=", ", explanationKind=", this.abTest), this.explanationKind, ")");
        throw null;
    }

    public getAttributionWithTimeout(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.variation = str;
        this.abTest = z;
        this.explanationKind = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r1 = null;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if ((r22 instanceof o.getAttributionWithTimeout) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        r4 = r4 + 113;
        o.getAttributionWithTimeout.write = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        r1 = (o.getAttributionWithTimeout) r22;
        r12 = new java.lang.Object[]{r21.variation, r1.variation};
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (r21.abTest == r1.abTest) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        r1 = o.getAttributionWithTimeout.write + 95;
        o.getAttributionWithTimeout.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        r19 = new java.lang.Object[]{r21.explanationKind, r1.explanationKind};
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r4 = r4 + 7;
        o.getAttributionWithTimeout.write = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if ((r4 % 2) == 0) goto L11;
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
            int r3 = o.getAttributionWithTimeout.write
            int r3 = r3 + 31
            int r4 = r3 % 128
            o.getAttributionWithTimeout.IconCompatParcelizer = r4
            int r3 = r3 % r2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L1a
            r3 = 42
            int r3 = r3 / r6
            if (r0 != r1) goto L2b
            goto L1c
        L1a:
            if (r0 != r1) goto L2b
        L1c:
            int r4 = r4 + 7
            int r1 = r4 % 128
            o.getAttributionWithTimeout.write = r1
            int r4 = r4 % r2
            if (r4 == 0) goto L26
            return r5
        L26:
            r1 = 0
            r1.hashCode()
            throw r1
        L2b:
            boolean r3 = r1 instanceof o.getAttributionWithTimeout
            if (r3 != 0) goto L37
            int r4 = r4 + 113
            int r1 = r4 % 128
            o.getAttributionWithTimeout.write = r1
            int r4 = r4 % r2
            return r6
        L37:
            o.getAttributionWithTimeout r1 = (o.getAttributionWithTimeout) r1
            java.lang.String r3 = r0.variation
            java.lang.String r4 = r1.variation
            java.lang.Object[] r12 = new java.lang.Object[]{r3, r4}
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
            if (r3 != 0) goto L67
            return r6
        L67:
            boolean r3 = r0.abTest
            boolean r4 = r1.abTest
            if (r3 == r4) goto L77
            int r1 = o.getAttributionWithTimeout.write
            int r1 = r1 + 95
            int r3 = r1 % 128
            o.getAttributionWithTimeout.IconCompatParcelizer = r3
            int r1 = r1 % r2
            return r6
        L77:
            java.lang.String r2 = r0.explanationKind
            java.lang.String r1 = r1.explanationKind
            java.lang.Object[] r19 = new java.lang.Object[]{r2, r1}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L9c
            return r6
        L9c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getAttributionWithTimeout.equals(java.lang.Object):boolean");
    }
}
