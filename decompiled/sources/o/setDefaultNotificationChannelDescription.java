package o;

import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class setDefaultNotificationChannelDescription implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setDefaultNotificationChannelNameandroid_sdk_base_release serializer = new setDefaultNotificationChannelNameandroid_sdk_base_release(0);
    public final setLocationCustomAttribute IconCompatParcelizer;
    public final setCustomEndpoint write;

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() ^ 16777619) * (-2128831035)) ^ this.write.hashCode()) * (-2128831035);
    }

    public setDefaultNotificationChannelDescription(FormBody.Builder builder) {
        this.IconCompatParcelizer = (setLocationCustomAttribute) builder.serializer;
        this.write = (setCustomEndpoint) builder.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "CreatedEdge{app=" + this.IconCompatParcelizer + ", person=" + this.write + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r5 = r5.write;
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
            boolean r2 = r5 instanceof o.setDefaultNotificationChannelDescription
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setDefaultNotificationChannelDescription r5 = (o.setDefaultNotificationChannelDescription) r5
            o.setLocationCustomAttribute r2 = r5.IconCompatParcelizer
            o.setLocationCustomAttribute r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            o.setCustomEndpoint r5 = r5.write
            o.setCustomEndpoint r2 = r4.write
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setDefaultNotificationChannelDescription.equals(java.lang.Object):boolean");
    }
}
