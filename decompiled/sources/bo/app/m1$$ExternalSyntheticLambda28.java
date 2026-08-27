package bo.app;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaVgLfNFYp2qCVVXh_8D8TU6XRSCQ;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m1$$ExternalSyntheticLambda28 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ boolean f$2;

    public /* synthetic */ m1$$ExternalSyntheticLambda28(boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaVgLfNFYp2qCVVXh_8D8TU6XRSCQ r8lambdavglfnfyp2qcvvxh_8d8tu6xrscq) {
        this.$r8$classId = 3;
        this.f$2 = z;
        this.f$0 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.f$1 = r8lambdavglfnfyp2qcvvxh_8d8tu6xrscq;
    }

    public /* synthetic */ m1$$ExternalSyntheticLambda28(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r2 != 2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        r5 = (o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) r5;
        r4 = (o.r8lambdaVgLfNFYp2qCVVXh_8D8TU6XRSCQ) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r6 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        r1 = r1 + 29;
        bo.app.m1$$ExternalSyntheticLambda28.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
        r5.invoke(r4.RemoteActionCompatParcelizer);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        return o.createFromParcel.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        return com.braze.Braze.setGoogleAdvertisingId$lambda$1((com.braze.Braze) r5, (java.lang.String) r4, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r2 != 2) goto L13;
     */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = bo.app.m1$$ExternalSyntheticLambda28.RemoteActionCompatParcelizer
            int r2 = r1 + 75
            int r3 = r2 % 128
            bo.app.m1$$ExternalSyntheticLambda28.write = r3
            int r2 = r2 % r0
            r3 = 1
            if (r2 != 0) goto L22
            int r2 = r8.$r8$classId
            java.lang.Object r4 = r8.f$1
            java.lang.Object r5 = r8.f$0
            boolean r6 = r8.f$2
            r7 = 63
            int r7 = r7 / 0
            if (r2 == 0) goto L58
            if (r2 == r3) goto L4f
            if (r2 == r0) goto L46
            goto L30
        L22:
            int r2 = r8.$r8$classId
            java.lang.Object r4 = r8.f$1
            java.lang.Object r5 = r8.f$0
            boolean r6 = r8.f$2
            if (r2 == 0) goto L58
            if (r2 == r3) goto L4f
            if (r2 == r0) goto L46
        L30:
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r5 = (o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) r5
            o.r8lambdaVgLfNFYp2qCVVXh_8D8TU6XRSCQ r4 = (o.r8lambdaVgLfNFYp2qCVVXh_8D8TU6XRSCQ) r4
            if (r6 == 0) goto L37
            goto L43
        L37:
            int r1 = r1 + 29
            int r2 = r1 % 128
            bo.app.m1$$ExternalSyntheticLambda28.write = r2
            int r1 = r1 % r0
            o.accessgetStrictcp r0 = r4.RemoteActionCompatParcelizer
            r5.invoke(r0)
        L43:
            o.createFromParcel r0 = o.createFromParcel.INSTANCE
            return r0
        L46:
            com.braze.Braze r5 = (com.braze.Braze) r5
            java.lang.String r4 = (java.lang.String) r4
            o.createFromParcel r0 = com.braze.Braze.$r8$lambda$lR5SL_tSS1JcT7wrmZ_9di0raRc(r5, r4, r6)
            return r0
        L4f:
            java.lang.String r5 = (java.lang.String) r5
            java.util.Set r4 = (java.util.Set) r4
            java.lang.String r0 = com.braze.Braze.$r8$lambda$JCyq9hDmmD1Ary7SWiIULjTMbm0(r5, r4, r6)
            return r0
        L58:
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            bo.app.hf r4 = (bo.app.hf) r4
            bo.app.g9 r0 = bo.app.m1.b(r5, r4, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.m1$$ExternalSyntheticLambda28.invoke():java.lang.Object");
    }
}
