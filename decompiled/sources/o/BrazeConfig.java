package o;

import io.sentry.util.network.NetworkBody;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeConfig implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY read = new r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY(27);
    public final List RemoteActionCompatParcelizer;
    public final String serializer;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        List list = this.RemoteActionCompatParcelizer;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (list == null ? 0 : list.hashCode())) * (-2128831035);
    }

    public BrazeConfig(NetworkBody networkBody) {
        this.serializer = (String) networkBody.IconCompatParcelizer;
        ArrayList arrayList = (ArrayList) networkBody.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = arrayList == null ? null : Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockedSdkLogEvent{category=");
        sb.append(this.serializer);
        sb.append(", severity_levels=");
        return MediaSessionCompatQueueItem.read(sb, this.RemoteActionCompatParcelizer, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r5 = r5.RemoteActionCompatParcelizer;
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
            boolean r2 = r5 instanceof o.BrazeConfig
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.BrazeConfig r5 = (o.BrazeConfig) r5
            java.lang.String r2 = r5.serializer
            java.lang.String r3 = r4.serializer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2a
        L1b:
            java.util.List r5 = r5.RemoteActionCompatParcelizer
            java.util.List r2 = r4.RemoteActionCompatParcelizer
            if (r2 == r5) goto L2b
            if (r2 == 0) goto L2a
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L2a
            goto L2b
        L2a:
            return r1
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BrazeConfig.equals(java.lang.Object):boolean");
    }
}
