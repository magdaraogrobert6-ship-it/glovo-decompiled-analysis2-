package com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding;

import o.accessunpackByte3;
import o.copy8_81llAdefault;
import o.packBytes;

/* JADX INFO: loaded from: classes3.dex */
public final class ShouldShowTooltip {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final accessunpackByte3 RemoteActionCompatParcelizer;
    public final copy8_81llAdefault serializer;
    public final packBytes write;

    public ShouldShowTooltip(accessunpackByte3 accessunpackbyte3, copy8_81llAdefault copy8_81lladefault, packBytes packbytes) {
        this.RemoteActionCompatParcelizer = accessunpackbyte3;
        this.serializer = copy8_81lladefault;
        this.write = packbytes;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r1 r4
  0x002b: PHI (r1v10 o.unpackByte3) = (r1v9 o.unpackByte3), (r1v12 o.unpackByte3) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r4v5 int) = (r4v4 int), (r4v7 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r7.serializer.RemoteActionCompatParcelizer() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r7.serializer.RemoteActionCompatParcelizer() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        r1.serializer = 1;
        r8 = r7.write.RemoteActionCompatParcelizer.getTooltipShown(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (r8 != r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        r8 = com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding.ShouldShowTooltip.read + 21;
        com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding.ShouldShowTooltip.IconCompatParcelizer = r8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        if ((r8 % 2) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r8 instanceof o.unpackByte3
            r2 = 0
            if (r1 == 0) goto L2f
            int r1 = com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding.ShouldShowTooltip.read
            int r1 = r1 + 15
            int r3 = r1 % 128
            com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding.ShouldShowTooltip.IconCompatParcelizer = r3
            int r1 = r1 % r0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L22
            r1 = r8
            o.unpackByte3 r1 = (o.unpackByte3) r1
            int r4 = r1.serializer
            r5 = r4 & r3
            r6 = 62
            int r6 = r6 / r2
            if (r5 == 0) goto L2f
            goto L2b
        L22:
            r1 = r8
            o.unpackByte3 r1 = (o.unpackByte3) r1
            int r4 = r1.serializer
            r5 = r4 & r3
            if (r5 == 0) goto L2f
        L2b:
            int r4 = r4 + r3
            r1.serializer = r4
            goto L34
        L2f:
            o.unpackByte3 r1 = new o.unpackByte3
            r1.<init>(r7, r8)
        L34:
            java.lang.Object r8 = r1.RemoteActionCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r1.serializer
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L4a
            if (r4 != r6) goto L44
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            goto L90
        L44:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
            return r5
        L4a:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            o.accessunpackByte3 r8 = r7.RemoteActionCompatParcelizer
            boolean r8 = r8.read()
            if (r8 == 0) goto L99
            int r8 = com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding.ShouldShowTooltip.IconCompatParcelizer
            int r8 = r8 + 59
            int r4 = r8 % 128
            com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding.ShouldShowTooltip.read = r4
            int r8 = r8 % r0
            if (r8 == 0) goto L6c
            o.copy8_81llAdefault r8 = r7.serializer
            boolean r8 = r8.RemoteActionCompatParcelizer()
            r4 = 16
            int r4 = r4 / r2
            if (r8 == 0) goto L99
            goto L74
        L6c:
            o.copy8_81llAdefault r8 = r7.serializer
            boolean r8 = r8.RemoteActionCompatParcelizer()
            if (r8 == 0) goto L99
        L74:
            r1.serializer = r6
            o.packBytes r8 = r7.write
            com.roadrunner.delivery.ontheway.turnbyturn.settings.data.SettingsOnboardingDataStore r8 = r8.RemoteActionCompatParcelizer
            java.lang.Object r8 = r8.getTooltipShown(r1)
            if (r8 != r3) goto L90
            int r8 = com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding.ShouldShowTooltip.read
            int r8 = r8 + 21
            int r1 = r8 % 128
            com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding.ShouldShowTooltip.IconCompatParcelizer = r1
            int r8 = r8 % r0
            if (r8 == 0) goto L8c
            return r3
        L8c:
            r5.hashCode()
            throw r5
        L90:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L99
            r2 = r6
        L99:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding.ShouldShowTooltip.invoke(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
