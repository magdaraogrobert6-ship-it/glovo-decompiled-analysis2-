package o;

import com.sentiance.core.model.thrift.MotionActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final isAmazonDeviceannotations RemoteActionCompatParcelizer = new isAmazonDeviceannotations();
    public final Long read;
    public final MotionActivity serializer;
    public final getBRAZE_PUSH_DELIVERY_ENABLED_KEYannotations write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ this.serializer.hashCode()) * (-2128831035)) ^ this.write.hashCode()) * (-2128831035);
    }

    public getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations(r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy) {
        this.read = (Long) r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer;
        this.serializer = (MotionActivity) r8lambdadeozq815xuuwmllyyvm_qv79qy.write;
        this.write = (getBRAZE_PUSH_DELIVERY_ENABLED_KEYannotations) r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer;
    }

    public final String toString() {
        return "MotionActivityEvent{timestamp=" + this.read + ", motion_activity=" + this.serializer + ", confidence=" + this.write + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r5 = r5.write;
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
            boolean r2 = r5 instanceof o.getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations r5 = (o.getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations) r5
            java.lang.Long r2 = r5.read
            java.lang.Long r3 = r4.read
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L34
        L1b:
            com.sentiance.core.model.thrift.MotionActivity r2 = r5.serializer
            com.sentiance.core.model.thrift.MotionActivity r3 = r4.serializer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L34
        L27:
            o.getBRAZE_PUSH_DELIVERY_ENABLED_KEYannotations r5 = r5.write
            o.getBRAZE_PUSH_DELIVERY_ENABLED_KEYannotations r2 = r4.write
            if (r2 == r5) goto L35
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L34
            goto L35
        L34:
            return r1
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations.equals(java.lang.Object):boolean");
    }
}
