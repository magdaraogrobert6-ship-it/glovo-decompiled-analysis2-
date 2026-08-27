package o;

/* JADX INFO: loaded from: classes3.dex */
public final class IBrazeEndpointProvider implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY write = new r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY(26);
    public final setCustomUserAttributelambda5 RemoteActionCompatParcelizer;
    public final createUriActionFromUrlString read;
    public final IBrazeDeeplinkHandlerIntentFlagPurpose serializer;

    public final int hashCode() {
        IBrazeDeeplinkHandlerIntentFlagPurpose iBrazeDeeplinkHandlerIntentFlagPurpose = this.serializer;
        int iHashCode = iBrazeDeeplinkHandlerIntentFlagPurpose == null ? 0 : iBrazeDeeplinkHandlerIntentFlagPurpose.hashCode();
        createUriActionFromUrlString createuriactionfromurlstring = this.read;
        int iHashCode2 = createuriactionfromurlstring == null ? 0 : createuriactionfromurlstring.hashCode();
        setCustomUserAttributelambda5 setcustomuserattributelambda5 = this.RemoteActionCompatParcelizer;
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ (setcustomuserattributelambda5 != null ? setcustomuserattributelambda5.hashCode() : 0)) * (-2128831035);
    }

    public IBrazeEndpointProvider(r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy) {
        this.serializer = (IBrazeDeeplinkHandlerIntentFlagPurpose) r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer;
        this.read = (createUriActionFromUrlString) r8lambdadeozq815xuuwmllyyvm_qv79qy.write;
        this.RemoteActionCompatParcelizer = (setCustomUserAttributelambda5) r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer;
    }

    public final String toString() {
        return "OffTheGridEventProperty{offthegrid_start=" + this.serializer + ", offthegrid_end=" + this.read + ", offthegrid_discard=" + this.RemoteActionCompatParcelizer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
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
            boolean r2 = r5 instanceof o.IBrazeEndpointProvider
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.IBrazeEndpointProvider r5 = (o.IBrazeEndpointProvider) r5
            o.IBrazeDeeplinkHandlerIntentFlagPurpose r2 = r5.serializer
            o.IBrazeDeeplinkHandlerIntentFlagPurpose r3 = r4.serializer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L3a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3a
        L1d:
            o.createUriActionFromUrlString r2 = r5.read
            o.createUriActionFromUrlString r3 = r4.read
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L3a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3a
        L2b:
            o.setCustomUserAttributelambda5 r5 = r5.RemoteActionCompatParcelizer
            o.setCustomUserAttributelambda5 r2 = r4.RemoteActionCompatParcelizer
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
        throw new UnsupportedOperationException("Method not decompiled: o.IBrazeEndpointProvider.equals(java.lang.Object):boolean");
    }
}
