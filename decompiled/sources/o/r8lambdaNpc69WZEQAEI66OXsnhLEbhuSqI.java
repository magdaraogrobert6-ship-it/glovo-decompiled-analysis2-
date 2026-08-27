package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.sentiance.core.model.thrift.O$b;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o IconCompatParcelizer = new r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(2);
    public final Boolean MediaDescriptionCompat;
    public final Long RemoteActionCompatParcelizer;
    public final Long read;
    public final Integer serializer;
    public final Integer write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.serializer.hashCode();
        Integer num = this.write;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        Boolean bool = this.MediaDescriptionCompat;
        return (((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ (bool != null ? bool.hashCode() : 0)) * (-2128831035);
    }

    public r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI(O$b o$b) {
        this.read = (Long) o$b.write;
        this.RemoteActionCompatParcelizer = (Long) o$b.RemoteActionCompatParcelizer;
        this.serializer = (Integer) o$b.serializer;
        this.write = (Integer) o$b.read;
        this.MediaDescriptionCompat = (Boolean) o$b.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StepCountEvent{start_time=");
        sb.append(this.read);
        sb.append(", end_time=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", steps=");
        sb.append(this.serializer);
        sb.append(", steps_since_boot=");
        sb.append(this.write);
        sb.append(", did_device_reboot=");
        return c8$$ExternalSyntheticOutline0.m(sb, "}", this.MediaDescriptionCompat);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r5 = r5.MediaDescriptionCompat;
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
            boolean r2 = r5 instanceof o.r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI r5 = (o.r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI) r5
            java.lang.Long r2 = r5.read
            java.lang.Long r3 = r4.read
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L50
        L1b:
            java.lang.Long r2 = r5.RemoteActionCompatParcelizer
            java.lang.Long r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L50
        L27:
            java.lang.Integer r2 = r5.serializer
            java.lang.Integer r3 = r4.serializer
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L50
        L33:
            java.lang.Integer r2 = r5.write
            java.lang.Integer r3 = r4.write
            if (r3 == r2) goto L41
            if (r3 == 0) goto L50
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L50
        L41:
            java.lang.Boolean r5 = r5.MediaDescriptionCompat
            java.lang.Boolean r2 = r4.MediaDescriptionCompat
            if (r2 == r5) goto L51
            if (r2 == 0) goto L50
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L50
            goto L51
        L50:
            return r1
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI.equals(java.lang.Object):boolean");
    }
}
