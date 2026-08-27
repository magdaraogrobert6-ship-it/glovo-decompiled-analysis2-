package o;

import com.sentiance.core.model.events.C$b;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomUserAttributelambda3 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY RemoteActionCompatParcelizer = new r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY(13);
    public final setLastKnownLocationdefault IconCompatParcelizer;
    public final setInAppMessageWebViewClientMaxOnPageFinishedWaitMslambda0 read;
    public final addToCustomAttributeArraylambda1 write;

    public final int hashCode() {
        addToCustomAttributeArraylambda1 addtocustomattributearraylambda1 = this.write;
        int iHashCode = addtocustomattributearraylambda1 == null ? 0 : addtocustomattributearraylambda1.hashCode();
        setInAppMessageWebViewClientMaxOnPageFinishedWaitMslambda0 setinappmessagewebviewclientmaxonpagefinishedwaitmslambda0 = this.read;
        int iHashCode2 = setinappmessagewebviewclientmaxonpagefinishedwaitmslambda0 == null ? 0 : setinappmessagewebviewclientmaxonpagefinishedwaitmslambda0.hashCode();
        setLastKnownLocationdefault setlastknownlocationdefault = this.IconCompatParcelizer;
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ (setlastknownlocationdefault != null ? setlastknownlocationdefault.hashCode() : 0)) * (-2128831035);
    }

    public setCustomUserAttributelambda3(C$b c$b) {
        this.write = (addToCustomAttributeArraylambda1) c$b.serializer;
        this.read = (setInAppMessageWebViewClientMaxOnPageFinishedWaitMslambda0) c$b.write;
        this.IconCompatParcelizer = (setLastKnownLocationdefault) c$b.IconCompatParcelizer;
    }

    public final String toString() {
        return "DriverPassenger{ubm_gmm=" + this.write + ", outlier_detection=" + this.read + ", final_result=" + this.IconCompatParcelizer + "}";
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
            boolean r2 = r5 instanceof o.setCustomUserAttributelambda3
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setCustomUserAttributelambda3 r5 = (o.setCustomUserAttributelambda3) r5
            o.addToCustomAttributeArraylambda1 r2 = r5.write
            o.addToCustomAttributeArraylambda1 r3 = r4.write
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L3a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3a
        L1d:
            o.setInAppMessageWebViewClientMaxOnPageFinishedWaitMslambda0 r2 = r5.read
            o.setInAppMessageWebViewClientMaxOnPageFinishedWaitMslambda0 r3 = r4.read
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L3a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3a
        L2b:
            o.setLastKnownLocationdefault r5 = r5.IconCompatParcelizer
            o.setLastKnownLocationdefault r2 = r4.IconCompatParcelizer
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
        throw new UnsupportedOperationException("Method not decompiled: o.setCustomUserAttributelambda3.equals(java.lang.Object):boolean");
    }
}
