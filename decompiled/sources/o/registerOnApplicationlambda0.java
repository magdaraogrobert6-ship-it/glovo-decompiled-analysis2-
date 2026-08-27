package o;

import com.sentiance.core.model.events.ThriftBool;
import io.sentry.util.network.NetworkBody;

/* JADX INFO: loaded from: classes3.dex */
public final class registerOnApplicationlambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final onActivityResumedlambda1 write = new onActivityResumedlambda1();
    public final Byte RemoteActionCompatParcelizer;
    public final ThriftBool serializer;

    public final int hashCode() {
        return (((this.serializer.hashCode() ^ 16777619) * (-2128831035)) ^ this.RemoteActionCompatParcelizer.hashCode()) * (-2128831035);
    }

    public registerOnApplicationlambda0(NetworkBody networkBody) {
        this.serializer = (ThriftBool) networkBody.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = (Byte) networkBody.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LowDiskSpaceState{is_low=");
        sb.append(this.serializer);
        sb.append(", percent_threshold=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.RemoteActionCompatParcelizer, "}");
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
            boolean r2 = r5 instanceof o.registerOnApplicationlambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.registerOnApplicationlambda0 r5 = (o.registerOnApplicationlambda0) r5
            com.sentiance.core.model.events.ThriftBool r2 = r5.serializer
            com.sentiance.core.model.events.ThriftBool r3 = r4.serializer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            java.lang.Byte r5 = r5.RemoteActionCompatParcelizer
            java.lang.Byte r2 = r4.RemoteActionCompatParcelizer
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.registerOnApplicationlambda0.equals(java.lang.Object):boolean");
    }
}
