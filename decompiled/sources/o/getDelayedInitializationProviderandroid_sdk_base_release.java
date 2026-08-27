package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.core.model.events.C$b;

/* JADX INFO: loaded from: classes3.dex */
public final class getDelayedInitializationProviderandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final stopInstancelambda11 read = new stopInstancelambda11(13);
    public final Integer IconCompatParcelizer;
    public final Long RemoteActionCompatParcelizer;
    public final String write;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        String str = this.write;
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ (str == null ? 0 : str.hashCode())) * (-2128831035);
    }

    public getDelayedInitializationProviderandroid_sdk_base_release(C$b c$b) {
        this.RemoteActionCompatParcelizer = (Long) c$b.serializer;
        this.IconCompatParcelizer = (Integer) c$b.write;
        this.write = (String) c$b.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HardEvent{timestamp=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", magnitude=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", trip_id=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.write, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
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
            boolean r2 = r5 instanceof o.getDelayedInitializationProviderandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.getDelayedInitializationProviderandroid_sdk_base_release r5 = (o.getDelayedInitializationProviderandroid_sdk_base_release) r5
            java.lang.Long r2 = r5.RemoteActionCompatParcelizer
            java.lang.Long r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L36
        L1b:
            java.lang.Integer r2 = r5.IconCompatParcelizer
            java.lang.Integer r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L36
        L27:
            java.lang.String r5 = r5.write
            java.lang.String r2 = r4.write
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
        throw new UnsupportedOperationException("Method not decompiled: o.getDelayedInitializationProviderandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}
