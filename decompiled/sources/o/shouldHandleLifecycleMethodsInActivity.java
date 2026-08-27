package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class shouldHandleLifecycleMethodsInActivity implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final BrazeCompanionExternalSyntheticLambda21 IconCompatParcelizer = new BrazeCompanionExternalSyntheticLambda21(21);
    public final Long RemoteActionCompatParcelizer;
    public final String read;
    public final List serializer;
    public final Long write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        List list = this.serializer;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        Long l = this.RemoteActionCompatParcelizer;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        Long l2 = this.write;
        return (((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ (l2 != null ? l2.hashCode() : 0)) * (-2128831035);
    }

    public shouldHandleLifecycleMethodsInActivity(setInAppMessagingRegistrationBlocklist setinappmessagingregistrationblocklist) {
        this.read = setinappmessagingregistrationblocklist.RemoteActionCompatParcelizer;
        ArrayList arrayList = setinappmessagingregistrationblocklist.read;
        this.serializer = arrayList == null ? null : Collections.unmodifiableList(arrayList);
        this.RemoteActionCompatParcelizer = setinappmessagingregistrationblocklist.serializer;
        this.write = setinappmessagingregistrationblocklist.IconCompatParcelizer;
    }

    public final String toString() {
        return "TripProfileEvent{trip_id=" + this.read + ", transport_segment=" + this.serializer + ", start_time=" + this.RemoteActionCompatParcelizer + ", end_time=" + this.write + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
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
            boolean r2 = r5 instanceof o.shouldHandleLifecycleMethodsInActivity
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.shouldHandleLifecycleMethodsInActivity r5 = (o.shouldHandleLifecycleMethodsInActivity) r5
            java.lang.String r2 = r5.read
            java.lang.String r3 = r4.read
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L46
        L1b:
            java.util.List r2 = r5.serializer
            java.util.List r3 = r4.serializer
            if (r3 == r2) goto L29
            if (r3 == 0) goto L46
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L46
        L29:
            java.lang.Long r2 = r5.RemoteActionCompatParcelizer
            java.lang.Long r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L37
            if (r3 == 0) goto L46
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L46
        L37:
            java.lang.Long r5 = r5.write
            java.lang.Long r2 = r4.write
            if (r2 == r5) goto L47
            if (r2 == 0) goto L46
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L46
            goto L47
        L46:
            return r1
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.shouldHandleLifecycleMethodsInActivity.equals(java.lang.Object):boolean");
    }
}
