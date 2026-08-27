package o;

import com.sentiance.core.model.events.C$b;

/* JADX INFO: loaded from: classes3.dex */
public final class handleIncomingIntentlambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final getSdkEnablementProviderandroid_sdk_base_release read = new getSdkEnablementProviderandroid_sdk_base_release(23);
    public final Byte IconCompatParcelizer;
    public final Integer RemoteActionCompatParcelizer;
    public final Integer serializer;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ this.RemoteActionCompatParcelizer.hashCode()) * (-2128831035)) ^ this.serializer.hashCode()) * (-2128831035);
    }

    public handleIncomingIntentlambda0(C$b c$b) {
        this.IconCompatParcelizer = (Byte) c$b.serializer;
        this.RemoteActionCompatParcelizer = (Integer) c$b.write;
        this.serializer = (Integer) c$b.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VisitEvent{type=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", latitude=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", longitude=");
        return IconCompatParcelizer.write(this.serializer, "}", sb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r5 = r5.serializer;
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
            boolean r2 = r5 instanceof o.handleIncomingIntentlambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.handleIncomingIntentlambda0 r5 = (o.handleIncomingIntentlambda0) r5
            java.lang.Byte r2 = r5.IconCompatParcelizer
            java.lang.Byte r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L34
        L1b:
            java.lang.Integer r2 = r5.RemoteActionCompatParcelizer
            java.lang.Integer r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L34
        L27:
            java.lang.Integer r5 = r5.serializer
            java.lang.Integer r2 = r4.serializer
            if (r2 == r5) goto L35
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L34
            goto L35
        L34:
            return r1
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.handleIncomingIntentlambda0.equals(java.lang.Object):boolean");
    }
}
