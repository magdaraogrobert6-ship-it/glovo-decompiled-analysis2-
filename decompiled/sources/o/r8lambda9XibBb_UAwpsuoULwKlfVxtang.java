package o;

import com.sentiance.core.model.events.N$b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda9XibBb_UAwpsuoULwKlfVxtang implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw IconCompatParcelizer = new r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw(1);
    public final BrazeCompanionExternalSyntheticLambda4 RemoteActionCompatParcelizer;
    public final List read;
    public final Byte serializer;
    public final String write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = this.serializer.hashCode();
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = this.RemoteActionCompatParcelizer;
        return (((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ (brazeCompanionExternalSyntheticLambda4 == null ? 0 : brazeCompanionExternalSyntheticLambda4.hashCode())) * (-2128831035);
    }

    public r8lambda9XibBb_UAwpsuoULwKlfVxtang(N$b n$b) {
        this.write = (String) n$b.read;
        this.read = Collections.unmodifiableList((ArrayList) n$b.write);
        this.serializer = (Byte) n$b.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = (BrazeCompanionExternalSyntheticLambda4) n$b.serializer;
    }

    public final String toString() {
        return "SmartGeofenceEvent{uuid=" + this.write + ", geofences=" + this.read + ", event_type=" + this.serializer + ", triggering_location=" + this.RemoteActionCompatParcelizer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
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
            boolean r2 = r5 instanceof o.r8lambda9XibBb_UAwpsuoULwKlfVxtang
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambda9XibBb_UAwpsuoULwKlfVxtang r5 = (o.r8lambda9XibBb_UAwpsuoULwKlfVxtang) r5
            java.lang.String r2 = r5.write
            java.lang.String r3 = r4.write
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L42
        L1b:
            java.util.List r2 = r5.read
            java.util.List r3 = r4.read
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L42
        L27:
            java.lang.Byte r2 = r5.serializer
            java.lang.Byte r3 = r4.serializer
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L42
        L33:
            o.BrazeCompanionExternalSyntheticLambda4 r5 = r5.RemoteActionCompatParcelizer
            o.BrazeCompanionExternalSyntheticLambda4 r2 = r4.RemoteActionCompatParcelizer
            if (r2 == r5) goto L43
            if (r2 == 0) goto L42
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L42
            goto L43
        L42:
            return r1
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambda9XibBb_UAwpsuoULwKlfVxtang.equals(java.lang.Object):boolean");
    }
}
