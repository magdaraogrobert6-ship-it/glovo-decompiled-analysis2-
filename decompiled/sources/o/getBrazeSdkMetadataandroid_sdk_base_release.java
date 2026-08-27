package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getBrazeSdkMetadataandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setCustomLocationProviderNamesandroid_sdk_base_release serializer = new setCustomLocationProviderNamesandroid_sdk_base_release(1);
    public final Double IconCompatParcelizer;
    public final Double RemoteActionCompatParcelizer;
    public final Double read;
    public final Double write;

    public final int hashCode() {
        Double d = this.IconCompatParcelizer;
        int iHashCode = d == null ? 0 : d.hashCode();
        Double d2 = this.write;
        int iHashCode2 = d2 == null ? 0 : d2.hashCode();
        Double d3 = this.read;
        int iHashCode3 = d3 == null ? 0 : d3.hashCode();
        Double d4 = this.RemoteActionCompatParcelizer;
        return (((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ (d4 != null ? d4.hashCode() : 0)) * (-2128831035);
    }

    public getBrazeSdkMetadataandroid_sdk_base_release(isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled) {
        this.IconCompatParcelizer = (Double) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer;
        this.write = (Double) iscontentcardsunreadvisualindicatorenabled.write;
        this.read = (Double) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = (Double) iscontentcardsunreadvisualindicatorenabled.read;
    }

    public final String toString() {
        return "OverallSafetyScoreWeights{focus=" + this.IconCompatParcelizer + ", legal=" + this.write + ", smooth=" + this.read + ", call_while_moving=" + this.RemoteActionCompatParcelizer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
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
            boolean r2 = r5 instanceof o.getBrazeSdkMetadataandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.getBrazeSdkMetadataandroid_sdk_base_release r5 = (o.getBrazeSdkMetadataandroid_sdk_base_release) r5
            java.lang.Double r2 = r5.IconCompatParcelizer
            java.lang.Double r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L48
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L48
        L1d:
            java.lang.Double r2 = r5.write
            java.lang.Double r3 = r4.write
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L48
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L48
        L2b:
            java.lang.Double r2 = r5.read
            java.lang.Double r3 = r4.read
            if (r3 == r2) goto L39
            if (r3 == 0) goto L48
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L48
        L39:
            java.lang.Double r5 = r5.RemoteActionCompatParcelizer
            java.lang.Double r2 = r4.RemoteActionCompatParcelizer
            if (r2 == r5) goto L49
            if (r2 == 0) goto L48
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L48
            goto L49
        L48:
            return r1
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getBrazeSdkMetadataandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}
