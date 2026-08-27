package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaGlz3EC9gPc1dQYZQCCn1g4v9Mg implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw RemoteActionCompatParcelizer = new r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw(27);
    public final setDefaultNotificationChannelNamelambda0 read;
    public final List write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        setDefaultNotificationChannelNamelambda0 setdefaultnotificationchannelnamelambda0 = this.read;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (setdefaultnotificationchannelnamelambda0 == null ? 0 : setdefaultnotificationchannelnamelambda0.hashCode())) * (-2128831035);
    }

    public r8lambdaGlz3EC9gPc1dQYZQCCn1g4v9Mg(r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws) {
        this.write = Collections.unmodifiableList((ArrayList) r8lambda1mnczrzuv4owduwgkg6cjtsws.write);
        this.read = (setDefaultNotificationChannelNamelambda0) r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer;
    }

    public final String toString() {
        return "OnDeviceDataSyncConfig{automatic_sync=" + this.write + ", transport_info_config=" + this.read + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
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
            boolean r2 = r5 instanceof o.r8lambdaGlz3EC9gPc1dQYZQCCn1g4v9Mg
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdaGlz3EC9gPc1dQYZQCCn1g4v9Mg r5 = (o.r8lambdaGlz3EC9gPc1dQYZQCCn1g4v9Mg) r5
            java.util.List r2 = r5.write
            java.util.List r3 = r4.write
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2a
        L1b:
            o.setDefaultNotificationChannelNamelambda0 r5 = r5.read
            o.setDefaultNotificationChannelNamelambda0 r2 = r4.read
            if (r2 == r5) goto L2b
            if (r2 == 0) goto L2a
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L2a
            goto L2b
        L2a:
            return r1
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaGlz3EC9gPc1dQYZQCCn1g4v9Mg.equals(java.lang.Object):boolean");
    }
}
