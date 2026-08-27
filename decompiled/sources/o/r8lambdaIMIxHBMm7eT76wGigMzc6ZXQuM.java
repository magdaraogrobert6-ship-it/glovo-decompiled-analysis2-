package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaIMIxHBMm7eT76wGigMzc6ZXQuM implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY write = new r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY(28);
    public final Boolean IconCompatParcelizer;
    public final Map read;
    public final Boolean serializer;

    public final int hashCode() {
        Boolean bool = this.serializer;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Map map = this.read;
        int iHashCode2 = map == null ? 0 : map.hashCode();
        Boolean bool2 = this.IconCompatParcelizer;
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ (bool2 != null ? bool2.hashCode() : 0)) * (-2128831035);
    }

    public r8lambdaIMIxHBMm7eT76wGigMzc6ZXQuM(r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy) {
        this.serializer = (Boolean) r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer;
        HashMap map = (HashMap) r8lambdadeozq815xuuwmllyyvm_qv79qy.write;
        this.read = map == null ? null : Collections.unmodifiableMap(map);
        this.IconCompatParcelizer = (Boolean) r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransportClassificationConfig{use_gig_economy_output=");
        sb.append(this.serializer);
        sb.append(", mode_overrides_from_to=");
        sb.append(this.read);
        sb.append(", enable_post_processing=");
        return c8$$ExternalSyntheticOutline0.m(sb, "}", this.IconCompatParcelizer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
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
            boolean r2 = r5 instanceof o.r8lambdaIMIxHBMm7eT76wGigMzc6ZXQuM
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdaIMIxHBMm7eT76wGigMzc6ZXQuM r5 = (o.r8lambdaIMIxHBMm7eT76wGigMzc6ZXQuM) r5
            java.lang.Boolean r2 = r5.serializer
            java.lang.Boolean r3 = r4.serializer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L3a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3a
        L1d:
            java.util.Map r2 = r5.read
            java.util.Map r3 = r4.read
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L3a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3a
        L2b:
            java.lang.Boolean r5 = r5.IconCompatParcelizer
            java.lang.Boolean r2 = r4.IconCompatParcelizer
            if (r2 == r5) goto L3b
            if (r2 == 0) goto L3a
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L3a
            goto L3b
        L3a:
            return r1
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaIMIxHBMm7eT76wGigMzc6ZXQuM.equals(java.lang.Object):boolean");
    }
}
