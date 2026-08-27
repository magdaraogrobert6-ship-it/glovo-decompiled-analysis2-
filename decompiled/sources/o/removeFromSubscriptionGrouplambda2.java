package o;

import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.thrift.PersonTerminator;

/* JADX INFO: loaded from: classes3.dex */
public final class removeFromSubscriptionGrouplambda2 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setCustomAttributelambda10 write = new setCustomAttributelambda10();
    public final Integer IconCompatParcelizer;
    public final PersonTerminator RemoteActionCompatParcelizer;
    public final setCustomEndpoint serializer;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ this.IconCompatParcelizer.hashCode()) * (-2128831035)) ^ this.RemoteActionCompatParcelizer.hashCode()) * (-2128831035);
    }

    public removeFromSubscriptionGrouplambda2(C$b c$b) {
        this.serializer = (setCustomEndpoint) c$b.serializer;
        this.IconCompatParcelizer = (Integer) c$b.write;
        this.RemoteActionCompatParcelizer = (PersonTerminator) c$b.IconCompatParcelizer;
    }

    public final String toString() {
        return "DeletedProperty{person=" + this.serializer + ", timestamp=" + this.IconCompatParcelizer + ", terminator=" + this.RemoteActionCompatParcelizer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
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
            boolean r2 = r5 instanceof o.removeFromSubscriptionGrouplambda2
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.removeFromSubscriptionGrouplambda2 r5 = (o.removeFromSubscriptionGrouplambda2) r5
            o.setCustomEndpoint r2 = r5.serializer
            o.setCustomEndpoint r3 = r4.serializer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L34
        L1b:
            java.lang.Integer r2 = r5.IconCompatParcelizer
            java.lang.Integer r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L34
        L27:
            com.sentiance.core.model.thrift.PersonTerminator r5 = r5.RemoteActionCompatParcelizer
            com.sentiance.core.model.thrift.PersonTerminator r2 = r4.RemoteActionCompatParcelizer
            if (r2 == r5) goto L35
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L34
            goto L35
        L34:
            return r1
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.removeFromSubscriptionGrouplambda2.equals(java.lang.Object):boolean");
    }
}
