package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setDefaultNotificationChannelNamelambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o write = new r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(29);
    public final Boolean IconCompatParcelizer;
    public final List RemoteActionCompatParcelizer;
    public final Boolean read;

    public final int hashCode() {
        Boolean bool = this.IconCompatParcelizer;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.read;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        List list = this.RemoteActionCompatParcelizer;
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ (list != null ? list.hashCode() : 0)) * (-2128831035);
    }

    public setDefaultNotificationChannelNamelambda0(r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy) {
        this.IconCompatParcelizer = (Boolean) r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer;
        this.read = (Boolean) r8lambdadeozq815xuuwmllyyvm_qv79qy.write;
        ArrayList arrayList = (ArrayList) r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer;
        this.RemoteActionCompatParcelizer = arrayList == null ? null : Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransportInfoConfig{include_tags=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", omit_location_data=");
        sb.append(this.read);
        sb.append(", transport_payload_upload_policy=");
        return MediaSessionCompatQueueItem.read(sb, this.RemoteActionCompatParcelizer, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
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
            boolean r2 = r5 instanceof o.setDefaultNotificationChannelNamelambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setDefaultNotificationChannelNamelambda0 r5 = (o.setDefaultNotificationChannelNamelambda0) r5
            java.lang.Boolean r2 = r5.IconCompatParcelizer
            java.lang.Boolean r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L3a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3a
        L1d:
            java.lang.Boolean r2 = r5.read
            java.lang.Boolean r3 = r4.read
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L3a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3a
        L2b:
            java.util.List r5 = r5.RemoteActionCompatParcelizer
            java.util.List r2 = r4.RemoteActionCompatParcelizer
            if (r2 == r5) goto L3b
            if (r2 == 0) goto L3a
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L3a
            goto L3b
        L3a:
            return r1
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setDefaultNotificationChannelNamelambda0.equals(java.lang.Object):boolean");
    }
}
