package o;

import com.sentiance.core.model.thrift.ThriftBool;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class setEmailNotificationSubscriptionType implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setCustomUserAttributeToNow serializer = new setCustomUserAttributeToNow();
    public final Byte IconCompatParcelizer;
    public final ThriftBool write;

    public final int hashCode() {
        return (((this.write.hashCode() ^ 16777619) * (-2128831035)) ^ this.IconCompatParcelizer.hashCode()) * (-2128831035);
    }

    public setEmailNotificationSubscriptionType(FormBody.Builder builder) {
        this.write = (ThriftBool) builder.serializer;
        this.IconCompatParcelizer = (Byte) builder.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LowDiskSpaceState{is_low=");
        sb.append(this.write);
        sb.append(", percent_threshold=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.IconCompatParcelizer, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
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
            boolean r2 = r5 instanceof o.setEmailNotificationSubscriptionType
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setEmailNotificationSubscriptionType r5 = (o.setEmailNotificationSubscriptionType) r5
            com.sentiance.core.model.thrift.ThriftBool r2 = r5.write
            com.sentiance.core.model.thrift.ThriftBool r3 = r4.write
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            java.lang.Byte r5 = r5.IconCompatParcelizer
            java.lang.Byte r2 = r4.IconCompatParcelizer
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setEmailNotificationSubscriptionType.equals(java.lang.Object):boolean");
    }
}
