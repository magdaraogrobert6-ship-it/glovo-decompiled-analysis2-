package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setDefaultNotificationChannelNameandroid_sdk_base_release serializer = new setDefaultNotificationChannelNameandroid_sdk_base_release(4);
    public final Short IconCompatParcelizer;
    public final Short RemoteActionCompatParcelizer;
    public final Short write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ this.RemoteActionCompatParcelizer.hashCode()) * (-2128831035)) ^ this.IconCompatParcelizer.hashCode()) * (-2128831035);
    }

    public getPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release(getInAppMessageTestPushEagerDisplayEnabledandroid_sdk_base_release getinappmessagetestpusheagerdisplayenabledandroid_sdk_base_release) {
        this.write = getinappmessagetestpusheagerdisplayenabledandroid_sdk_base_release.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = getinappmessagetestpusheagerdisplayenabledandroid_sdk_base_release.IconCompatParcelizer;
        this.IconCompatParcelizer = getinappmessagetestpusheagerdisplayenabledandroid_sdk_base_release.serializer;
    }

    public final String toString() {
        return "Magnetometer{x=" + this.write + ", y=" + this.RemoteActionCompatParcelizer + ", z=" + this.IconCompatParcelizer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
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
            boolean r2 = r5 instanceof o.getPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.getPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release r5 = (o.getPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release) r5
            java.lang.Short r2 = r5.write
            java.lang.Short r3 = r4.write
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L34
        L1b:
            java.lang.Short r2 = r5.RemoteActionCompatParcelizer
            java.lang.Short r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L34
        L27:
            java.lang.Short r5 = r5.IconCompatParcelizer
            java.lang.Short r2 = r4.IconCompatParcelizer
            if (r2 == r5) goto L35
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L34
            goto L35
        L34:
            return r1
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getPushDeepLinkBackStackActivityClassNameandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}
