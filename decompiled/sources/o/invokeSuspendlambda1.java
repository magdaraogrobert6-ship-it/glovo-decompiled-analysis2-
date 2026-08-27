package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.sentiance.core.model.thrift.O$b;

/* JADX INFO: loaded from: classes3.dex */
public final class invokeSuspendlambda1 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final BrazeCompanionExternalSyntheticLambda21 RemoteActionCompatParcelizer = new BrazeCompanionExternalSyntheticLambda21(23);
    public final Long IconCompatParcelizer;
    public final Boolean MediaDescriptionCompat;
    public final Boolean read;
    public final Integer serializer;
    public final Integer write;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = this.read.hashCode();
        Integer num = this.serializer;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.write;
        return (((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ (num2 != null ? num2.hashCode() : 0)) * (-2128831035)) ^ this.MediaDescriptionCompat.hashCode()) * (-2128831035);
    }

    public invokeSuspendlambda1(O$b o$b) {
        this.IconCompatParcelizer = (Long) o$b.write;
        this.read = (Boolean) o$b.RemoteActionCompatParcelizer;
        this.serializer = (Integer) o$b.serializer;
        this.write = (Integer) o$b.read;
        this.MediaDescriptionCompat = (Boolean) o$b.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VehicleCrashFeedbackEvent{crash_event_time=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", is_crash=");
        sb.append(this.read);
        sb.append(", crash_latitude=");
        sb.append(this.serializer);
        sb.append(", crash_longitude=");
        sb.append(this.write);
        sb.append(", was_crash_detected_by_sdk=");
        return c8$$ExternalSyntheticOutline0.m(sb, "}", this.MediaDescriptionCompat);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
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
            boolean r2 = r5 instanceof o.invokeSuspendlambda1
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.invokeSuspendlambda1 r5 = (o.invokeSuspendlambda1) r5
            java.lang.Long r2 = r5.IconCompatParcelizer
            java.lang.Long r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L50
        L1b:
            java.lang.Boolean r2 = r5.read
            java.lang.Boolean r3 = r4.read
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L50
        L27:
            java.lang.Integer r2 = r5.serializer
            java.lang.Integer r3 = r4.serializer
            if (r3 == r2) goto L35
            if (r3 == 0) goto L50
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L50
        L35:
            java.lang.Integer r2 = r5.write
            java.lang.Integer r3 = r4.write
            if (r3 == r2) goto L43
            if (r3 == 0) goto L50
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L50
        L43:
            java.lang.Boolean r5 = r5.MediaDescriptionCompat
            java.lang.Boolean r2 = r4.MediaDescriptionCompat
            if (r2 == r5) goto L51
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L50
            goto L51
        L50:
            return r1
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.invokeSuspendlambda1.equals(java.lang.Object):boolean");
    }
}
