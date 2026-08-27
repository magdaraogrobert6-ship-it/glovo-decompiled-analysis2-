package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class isFirebaseCloudMessagingRegistrationEnabledandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setCustomLocationProviderNamesandroid_sdk_base_release RemoteActionCompatParcelizer = new setCustomLocationProviderNamesandroid_sdk_base_release(7);
    public final String IconCompatParcelizer;
    public final isFallbackFirebaseMessagingServiceEnabledandroid_sdk_base_release read;
    public final Byte write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        isFallbackFirebaseMessagingServiceEnabledandroid_sdk_base_release isfallbackfirebasemessagingserviceenabledandroid_sdk_base_release = this.read;
        int iHashCode2 = isfallbackfirebasemessagingserviceenabledandroid_sdk_base_release == null ? 0 : isfallbackfirebasemessagingserviceenabledandroid_sdk_base_release.hashCode();
        String str = this.IconCompatParcelizer;
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ (str != null ? str.hashCode() : 0)) * (-2128831035);
    }

    public isFirebaseCloudMessagingRegistrationEnabledandroid_sdk_base_release(r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy) {
        this.write = (Byte) r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer;
        this.read = (isFallbackFirebaseMessagingServiceEnabledandroid_sdk_base_release) r8lambdadeozq815xuuwmllyyvm_qv79qy.write;
        this.IconCompatParcelizer = (String) r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Moving{value=");
        sb.append(this.write);
        sb.append(", properties=");
        sb.append(this.read);
        sb.append(", correlation_id=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
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
            boolean r2 = r5 instanceof o.isFirebaseCloudMessagingRegistrationEnabledandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.isFirebaseCloudMessagingRegistrationEnabledandroid_sdk_base_release r5 = (o.isFirebaseCloudMessagingRegistrationEnabledandroid_sdk_base_release) r5
            java.lang.Byte r2 = r5.write
            java.lang.Byte r3 = r4.write
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L38
        L1b:
            o.isFallbackFirebaseMessagingServiceEnabledandroid_sdk_base_release r2 = r5.read
            o.isFallbackFirebaseMessagingServiceEnabledandroid_sdk_base_release r3 = r4.read
            if (r3 == r2) goto L29
            if (r3 == 0) goto L38
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L38
        L29:
            java.lang.String r5 = r5.IconCompatParcelizer
            java.lang.String r2 = r4.IconCompatParcelizer
            if (r2 == r5) goto L39
            if (r2 == 0) goto L38
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L38
            goto L39
        L38:
            return r1
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isFirebaseCloudMessagingRegistrationEnabledandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}
