package o;

import com.roadrunner.liveness.presentation.LivenessDetectionActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class getCompass implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ LivenessDetectionActivity read;

    public /* synthetic */ getCompass(LivenessDetectionActivity livenessDetectionActivity, int i) {
        this.IconCompatParcelizer = i;
        this.read = livenessDetectionActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        return com.roadrunner.liveness.presentation.LivenessDetectionActivity.serializer(r2, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r5 = com.roadrunner.liveness.presentation.LivenessDetectionActivity.write(r2, r5, r6);
        r6 = o.getCompass.serializer + 51;
        o.getCompass.write = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r1 != 0) goto L9;
     */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getCompass.write
            int r1 = r1 + 117
            int r2 = r1 % 128
            o.getCompass.serializer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L21
            int r1 = r4.IconCompatParcelizer
            com.roadrunner.liveness.presentation.LivenessDetectionActivity r2 = r4.read
            o.getBirthDateFull r5 = (o.getBirthDateFull) r5
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r3 = 14
            int r3 = r3 / 0
            if (r1 == 0) goto L34
            goto L2f
        L21:
            int r1 = r4.IconCompatParcelizer
            com.roadrunner.liveness.presentation.LivenessDetectionActivity r2 = r4.read
            o.getBirthDateFull r5 = (o.getBirthDateFull) r5
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r1 == 0) goto L34
        L2f:
            o.createFromParcel r5 = com.roadrunner.liveness.presentation.LivenessDetectionActivity.serializer(r2, r5, r6)
            return r5
        L34:
            o.createFromParcel r5 = com.roadrunner.liveness.presentation.LivenessDetectionActivity.write(r2, r5, r6)
            int r6 = o.getCompass.serializer
            int r6 = r6 + 51
            int r1 = r6 % 128
            o.getCompass.write = r1
            int r6 = r6 % r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getCompass.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
