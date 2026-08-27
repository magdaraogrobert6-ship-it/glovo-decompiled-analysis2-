package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setDeviceObjectAllowlist implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setCustomLocationProviderNamesandroid_sdk_base_release IconCompatParcelizer = new setCustomLocationProviderNamesandroid_sdk_base_release(14);
    public final Long RemoteActionCompatParcelizer;
    public final String read;
    public final Long write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ this.write.hashCode()) * (-2128831035)) ^ this.RemoteActionCompatParcelizer.hashCode()) * (-2128831035);
    }

    public setDeviceObjectAllowlist(BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda2 brazeActivityLifecycleCallbackListenerExternalSyntheticLambda2) {
        this.read = brazeActivityLifecycleCallbackListenerExternalSyntheticLambda2.RemoteActionCompatParcelizer;
        this.write = brazeActivityLifecycleCallbackListenerExternalSyntheticLambda2.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = brazeActivityLifecycleCallbackListenerExternalSyntheticLambda2.write;
    }

    public final String toString() {
        return "TripProfileComplete{trip_id=" + this.read + ", start_time=" + this.write + ", end_time=" + this.RemoteActionCompatParcelizer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.write;
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
            boolean r2 = r5 instanceof o.setDeviceObjectAllowlist
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setDeviceObjectAllowlist r5 = (o.setDeviceObjectAllowlist) r5
            java.lang.String r2 = r5.read
            java.lang.String r3 = r4.read
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L34
        L1b:
            java.lang.Long r2 = r5.write
            java.lang.Long r3 = r4.write
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L34
        L27:
            java.lang.Long r5 = r5.RemoteActionCompatParcelizer
            java.lang.Long r2 = r4.RemoteActionCompatParcelizer
            if (r2 == r5) goto L35
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L34
            goto L35
        L34:
            return r1
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setDeviceObjectAllowlist.equals(java.lang.Object):boolean");
    }
}
