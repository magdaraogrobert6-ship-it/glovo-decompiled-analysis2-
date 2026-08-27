package o;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getDeviceObjectAllowlistandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final io.sentry.hints.MediaSessionCompatQueueItem write = new io.sentry.hints.MediaSessionCompatQueueItem(0, 2);
    public final Byte IconCompatParcelizer;
    public final Map RemoteActionCompatParcelizer;
    public final Long serializer;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        Byte b = this.IconCompatParcelizer;
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ (b == null ? 0 : b.hashCode())) * (-2128831035);
    }

    public getDeviceObjectAllowlistandroid_sdk_base_release(r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy) {
        this.serializer = (Long) r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = Collections.unmodifiableMap((Map) r8lambdadeozq815xuuwmllyyvm_qv79qy.write);
        this.IconCompatParcelizer = (Byte) r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Venue{id=");
        sb.append(this.serializer);
        sb.append(", tags=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", hecto_likelihood=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.IconCompatParcelizer, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
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
            boolean r2 = r5 instanceof o.getDeviceObjectAllowlistandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.getDeviceObjectAllowlistandroid_sdk_base_release r5 = (o.getDeviceObjectAllowlistandroid_sdk_base_release) r5
            java.lang.Long r2 = r5.serializer
            java.lang.Long r3 = r4.serializer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L36
        L1b:
            java.util.Map r2 = r5.RemoteActionCompatParcelizer
            java.util.Map r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L36
        L27:
            java.lang.Byte r5 = r5.IconCompatParcelizer
            java.lang.Byte r2 = r4.IconCompatParcelizer
            if (r2 == r5) goto L37
            if (r2 == 0) goto L36
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L36
            goto L37
        L36:
            return r1
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDeviceObjectAllowlistandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}
