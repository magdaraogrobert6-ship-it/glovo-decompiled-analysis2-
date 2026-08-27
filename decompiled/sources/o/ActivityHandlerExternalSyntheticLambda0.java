package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.model.OtpSendRequest$Companion;
import kotlinx.serialization.Serializable;
import o.ActivityHandlerExternalSyntheticLambda17;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class ActivityHandlerExternalSyntheticLambda0 {
    public static final OtpSendRequest$Companion Companion = new Object() { // from class: com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.model.OtpSendRequest$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            ActivityHandlerExternalSyntheticLambda17 activityHandlerExternalSyntheticLambda17;
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 63;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                activityHandlerExternalSyntheticLambda17 = ActivityHandlerExternalSyntheticLambda17.read;
                int i3 = 21 / 0;
            } else {
                activityHandlerExternalSyntheticLambda17 = ActivityHandlerExternalSyntheticLambda17.read;
            }
            int i4 = IconCompatParcelizer + 9;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return activityHandlerExternalSyntheticLambda17;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final String receiver;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.model.OtpSendRequest$Companion] */
    static {
        int i = write + 107;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 17 / 0;
        }
    }

    public /* synthetic */ ActivityHandlerExternalSyntheticLambda0(int i, String str) {
        if (1 == (i & 1)) {
            this.receiver = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, ActivityHandlerExternalSyntheticLambda17.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.receiver.hashCode();
        }
        int i3 = 28 / 0;
        return this.receiver.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("OtpSendRequest(receiver=", this.receiver, ")");
        int i4 = RemoteActionCompatParcelizer + 53;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ActivityHandlerExternalSyntheticLambda0(String str) {
        str.getClass();
        this.receiver = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r12 instanceof o.ActivityHandlerExternalSyntheticLambda0) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r9 = new java.lang.Object[]{r11.receiver, ((o.ActivityHandlerExternalSyntheticLambda0) r12).receiver};
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r9, o.getCieXyz.write())).booleanValue() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        r12 = o.ActivityHandlerExternalSyntheticLambda0.RemoteActionCompatParcelizer + 111;
        o.ActivityHandlerExternalSyntheticLambda0.IconCompatParcelizer = r12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        r12 = o.ActivityHandlerExternalSyntheticLambda0.RemoteActionCompatParcelizer + 17;
        o.ActivityHandlerExternalSyntheticLambda0.IconCompatParcelizer = r12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if ((r12 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        r12 = null;
        r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r11 == r12) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r11 == r12) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.ActivityHandlerExternalSyntheticLambda0.IconCompatParcelizer
            int r1 = r1 + 83
            int r2 = r1 % 128
            o.ActivityHandlerExternalSyntheticLambda0.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            r1 = 28
            int r1 = r1 / r3
            if (r11 != r12) goto L19
            goto L18
        L16:
            if (r11 != r12) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r12 instanceof o.ActivityHandlerExternalSyntheticLambda0
            if (r1 != 0) goto L1e
            return r3
        L1e:
            o.ActivityHandlerExternalSyntheticLambda0 r12 = (o.ActivityHandlerExternalSyntheticLambda0) r12
            java.lang.String r1 = r11.receiver
            java.lang.String r12 = r12.receiver
            java.lang.Object[] r9 = new java.lang.Object[]{r1, r12}
            int r4 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            int r7 = o.getCieXyz.write()
            r5 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r6 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r12 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L54
            int r12 = o.ActivityHandlerExternalSyntheticLambda0.RemoteActionCompatParcelizer
            int r12 = r12 + 111
            int r1 = r12 % 128
            o.ActivityHandlerExternalSyntheticLambda0.IconCompatParcelizer = r1
            int r12 = r12 % r0
            return r3
        L54:
            int r12 = o.ActivityHandlerExternalSyntheticLambda0.RemoteActionCompatParcelizer
            int r12 = r12 + 17
            int r1 = r12 % 128
            o.ActivityHandlerExternalSyntheticLambda0.IconCompatParcelizer = r1
            int r12 = r12 % r0
            if (r12 != 0) goto L60
            return r2
        L60:
            r12 = 0
            r12.hashCode()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ActivityHandlerExternalSyntheticLambda0.equals(java.lang.Object):boolean");
    }
}
