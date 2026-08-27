package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getFirebaseCloudMessagingSenderIdKeyandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setDefaultNotificationChannelNameandroid_sdk_base_release RemoteActionCompatParcelizer = new setDefaultNotificationChannelNameandroid_sdk_base_release(2);
    public final String IconCompatParcelizer;
    public final String read;
    public final String serializer;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        String str = this.read;
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ (str == null ? 0 : str.hashCode())) * (-2128831035);
    }

    public getFirebaseCloudMessagingSenderIdKeyandroid_sdk_base_release(BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4) {
        this.serializer = brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.serializer;
        this.IconCompatParcelizer = brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.write;
        this.read = brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnDeviceMLModel{name=");
        sb.append(this.serializer);
        sb.append(", version=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", flavor=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.read, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
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
            boolean r2 = r5 instanceof o.getFirebaseCloudMessagingSenderIdKeyandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.getFirebaseCloudMessagingSenderIdKeyandroid_sdk_base_release r5 = (o.getFirebaseCloudMessagingSenderIdKeyandroid_sdk_base_release) r5
            java.lang.String r2 = r5.serializer
            java.lang.String r3 = r4.serializer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L36
        L1b:
            java.lang.String r2 = r5.IconCompatParcelizer
            java.lang.String r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L36
        L27:
            java.lang.String r5 = r5.read
            java.lang.String r2 = r4.read
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
        throw new UnsupportedOperationException("Method not decompiled: o.getFirebaseCloudMessagingSenderIdKeyandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}
