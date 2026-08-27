package o;

import com.sentiance.core.model.events.C$b;

/* JADX INFO: loaded from: classes3.dex */
public final class setEmaillambda20 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE serializer = new r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(13);
    public final setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release IconCompatParcelizer;
    public final setPhoneNumberlambda20 RemoteActionCompatParcelizer;
    public final setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release write;

    public final int hashCode() {
        setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release = this.IconCompatParcelizer;
        int iHashCode = setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release == null ? 0 : setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release.hashCode();
        setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release2 = this.write;
        int iHashCode2 = setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release2 == null ? 0 : setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release2.hashCode();
        setPhoneNumberlambda20 setphonenumberlambda20 = this.RemoteActionCompatParcelizer;
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ (setphonenumberlambda20 != null ? setphonenumberlambda20.hashCode() : 0)) * (-2128831035);
    }

    public setEmaillambda20(C$b c$b) {
        this.IconCompatParcelizer = (setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release) c$b.serializer;
        this.write = (setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release) c$b.write;
        this.RemoteActionCompatParcelizer = (setPhoneNumberlambda20) c$b.IconCompatParcelizer;
    }

    public final String toString() {
        return "SdkInitConfig{android_crash_loop_detection_config=" + this.IconCompatParcelizer + ", ios_crash_loop_detection_config=" + this.write + ", sdk_init_gate_config=" + this.RemoteActionCompatParcelizer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.write;
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
            boolean r2 = r5 instanceof o.setEmaillambda20
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setEmaillambda20 r5 = (o.setEmaillambda20) r5
            o.setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release r2 = r5.IconCompatParcelizer
            o.setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L3a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3a
        L1d:
            o.setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release r2 = r5.write
            o.setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release r3 = r4.write
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L3a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3a
        L2b:
            o.setPhoneNumberlambda20 r5 = r5.RemoteActionCompatParcelizer
            o.setPhoneNumberlambda20 r2 = r4.RemoteActionCompatParcelizer
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
        throw new UnsupportedOperationException("Method not decompiled: o.setEmaillambda20.equals(java.lang.Object):boolean");
    }
}
