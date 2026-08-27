package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaQL6ub89hblyhJQInoVzkJXjcYls implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final getSdkEnablementProviderandroid_sdk_base_release serializer = new getSdkEnablementProviderandroid_sdk_base_release(22);
    public final List read;
    public final List write;

    public final int hashCode() {
        return (((this.read.hashCode() ^ 16777619) * (-2128831035)) ^ this.write.hashCode()) * (-2128831035);
    }

    public r8lambdaQL6ub89hblyhJQInoVzkJXjcYls(r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws) {
        this.read = Collections.unmodifiableList((ArrayList) r8lambda1mnczrzuv4owduwgkg6cjtsws.write);
        this.write = Collections.unmodifiableList((ArrayList) r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnDeviceMLModelInferenceIO{inputs=");
        sb.append(this.read);
        sb.append(", outputs=");
        return MediaSessionCompatQueueItem.read(sb, this.write, "}");
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
            boolean r2 = r5 instanceof o.r8lambdaQL6ub89hblyhJQInoVzkJXjcYls
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdaQL6ub89hblyhJQInoVzkJXjcYls r5 = (o.r8lambdaQL6ub89hblyhJQInoVzkJXjcYls) r5
            java.util.List r2 = r5.read
            java.util.List r3 = r4.read
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            java.util.List r5 = r5.write
            java.util.List r2 = r4.write
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaQL6ub89hblyhJQInoVzkJXjcYls.equals(java.lang.Object):boolean");
    }
}
