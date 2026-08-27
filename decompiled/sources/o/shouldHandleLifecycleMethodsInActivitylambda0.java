package o;

import com.sentiance.core.model.events.H$b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class shouldHandleLifecycleMethodsInActivitylambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final BrazeExternalSyntheticLambda5 serializer = new BrazeExternalSyntheticLambda5(19);
    public final Map IconCompatParcelizer;
    public final Byte read;

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() ^ 16777619) * (-2128831035)) ^ this.read.hashCode()) * (-2128831035);
    }

    public shouldHandleLifecycleMethodsInActivitylambda0(H$b h$b) {
        this.IconCompatParcelizer = Collections.unmodifiableMap((HashMap) h$b.serializer);
        this.read = (Byte) h$b.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetadataEvent{metadata=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", action=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.read, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r5 = r5.read;
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
            boolean r2 = r5 instanceof o.shouldHandleLifecycleMethodsInActivitylambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.shouldHandleLifecycleMethodsInActivitylambda0 r5 = (o.shouldHandleLifecycleMethodsInActivitylambda0) r5
            java.util.Map r2 = r5.IconCompatParcelizer
            java.util.Map r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            java.lang.Byte r5 = r5.read
            java.lang.Byte r2 = r4.read
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.shouldHandleLifecycleMethodsInActivitylambda0.equals(java.lang.Object):boolean");
    }
}
