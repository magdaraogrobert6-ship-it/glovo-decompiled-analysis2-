package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class gotoUri implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final String RemoteActionCompatParcelizer;
    public final String read;

    public final int hashCode() {
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.read;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (str2 != null ? str2.hashCode() : 0)) * (-2128831035);
    }

    public gotoUri(FormBody.Builder builder) {
        this.RemoteActionCompatParcelizer = (String) builder.serializer;
        this.read = (String) builder.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BehaviorFeature{type=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", value=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.read, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
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
            boolean r2 = r5 instanceof o.gotoUri
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.gotoUri r5 = (o.gotoUri) r5
            java.lang.String r2 = r5.RemoteActionCompatParcelizer
            java.lang.String r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L2c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2c
        L1d:
            java.lang.String r5 = r5.read
            java.lang.String r2 = r4.read
            if (r2 == r5) goto L2d
            if (r2 == 0) goto L2c
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L2c
            goto L2d
        L2c:
            return r1
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.gotoUri.equals(java.lang.Object):boolean");
    }
}
