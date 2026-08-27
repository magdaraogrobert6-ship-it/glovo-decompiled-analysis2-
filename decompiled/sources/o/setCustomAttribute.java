package o;

import io.sentry.util.network.NetworkBody;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomAttribute implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE RemoteActionCompatParcelizer = new r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(20);
    public final List read;
    public final Byte serializer;

    public final int hashCode() {
        List list = this.read;
        int iHashCode = list == null ? 0 : list.hashCode();
        Byte b = this.serializer;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (b != null ? b.hashCode() : 0)) * (-2128831035);
    }

    public setCustomAttribute(NetworkBody networkBody) {
        ArrayList arrayList = (ArrayList) networkBody.IconCompatParcelizer;
        this.read = arrayList == null ? null : Collections.unmodifiableList(arrayList);
        this.serializer = (Byte) networkBody.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoggingConfiguration{events_to_keep_for_ondemand_retrieval=");
        sb.append(this.read);
        sb.append(", retention_duration_days=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.serializer, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
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
            boolean r2 = r5 instanceof o.setCustomAttribute
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setCustomAttribute r5 = (o.setCustomAttribute) r5
            java.util.List r2 = r5.read
            java.util.List r3 = r4.read
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L2c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2c
        L1d:
            java.lang.Byte r5 = r5.serializer
            java.lang.Byte r2 = r4.serializer
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
        throw new UnsupportedOperationException("Method not decompiled: o.setCustomAttribute.equals(java.lang.Object):boolean");
    }
}
