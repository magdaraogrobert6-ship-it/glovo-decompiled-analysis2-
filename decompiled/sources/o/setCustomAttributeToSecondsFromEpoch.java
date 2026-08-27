package o;

import com.sentiance.core.model.thrift.ThriftBool;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomAttributeToSecondsFromEpoch implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setDateOfBirth read = new setDateOfBirth();
    public final ThriftBool IconCompatParcelizer;
    public final Byte serializer;

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() ^ 16777619) * (-2128831035)) ^ this.serializer.hashCode()) * (-2128831035);
    }

    public setCustomAttributeToSecondsFromEpoch(r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws) {
        this.IconCompatParcelizer = (ThriftBool) r8lambda1mnczrzuv4owduwgkg6cjtsws.write;
        this.serializer = (Byte) r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LowBatteryLevelState{is_low=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", percent_threshold=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.serializer, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r5 = r5.serializer;
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
            boolean r2 = r5 instanceof o.setCustomAttributeToSecondsFromEpoch
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setCustomAttributeToSecondsFromEpoch r5 = (o.setCustomAttributeToSecondsFromEpoch) r5
            com.sentiance.core.model.thrift.ThriftBool r2 = r5.IconCompatParcelizer
            com.sentiance.core.model.thrift.ThriftBool r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            java.lang.Byte r5 = r5.serializer
            java.lang.Byte r2 = r4.serializer
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCustomAttributeToSecondsFromEpoch.equals(java.lang.Object):boolean");
    }
}
