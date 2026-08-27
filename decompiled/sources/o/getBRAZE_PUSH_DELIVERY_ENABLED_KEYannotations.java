package o;

import com.sentiance.core.model.thrift.CMMotionActivityConfidence;
import io.socket.parser.IOParser$Decoder;

/* JADX INFO: loaded from: classes3.dex */
public final class getBRAZE_PUSH_DELIVERY_ENABLED_KEYannotations implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final getBRAZEannotations serializer = new getBRAZEannotations();
    public final CMMotionActivityConfidence IconCompatParcelizer;
    public final Byte read;

    public final int hashCode() {
        Byte b = this.read;
        int iHashCode = b == null ? 0 : b.hashCode();
        CMMotionActivityConfidence cMMotionActivityConfidence = this.IconCompatParcelizer;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (cMMotionActivityConfidence != null ? cMMotionActivityConfidence.hashCode() : 0)) * (-2128831035);
    }

    public getBRAZE_PUSH_DELIVERY_ENABLED_KEYannotations(IOParser$Decoder iOParser$Decoder) {
        this.read = (Byte) iOParser$Decoder.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = (CMMotionActivityConfidence) iOParser$Decoder.read;
    }

    public final String toString() {
        return "MotionActivityConfidence{android_confidence=" + this.read + ", cm_confidence=" + this.IconCompatParcelizer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r5 = r5.IconCompatParcelizer;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof o.getBRAZE_PUSH_DELIVERY_ENABLED_KEYannotations
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.getBRAZE_PUSH_DELIVERY_ENABLED_KEYannotations r5 = (o.getBRAZE_PUSH_DELIVERY_ENABLED_KEYannotations) r5
            java.lang.Byte r2 = r5.read
            java.lang.Byte r3 = r4.read
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L2c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2c
        L1d:
            com.sentiance.core.model.thrift.CMMotionActivityConfidence r5 = r5.IconCompatParcelizer
            com.sentiance.core.model.thrift.CMMotionActivityConfidence r2 = r4.IconCompatParcelizer
            if (r2 == r5) goto L2d
            if (r2 == 0) goto L2c
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L2c
            goto L2d
        L2c:
            return r1
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getBRAZE_PUSH_DELIVERY_ENABLED_KEYannotations.equals(java.lang.Object):boolean");
    }
}
