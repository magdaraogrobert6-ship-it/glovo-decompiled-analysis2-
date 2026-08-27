package com.roadrunner.delivery.accept.declinebutton.presentation;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getPlatformAndroidManager;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class AcceptanceRateProgressBarKt$RollingDigit$1$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ getPlatformAndroidManager write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptanceRateProgressBarKt$RollingDigit$1$1$1(int i, int i2, getPlatformAndroidManager getplatformandroidmanager, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.serializer = i2;
        this.write = getplatformandroidmanager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        AcceptanceRateProgressBarKt$RollingDigit$1$1$1 acceptanceRateProgressBarKt$RollingDigit$1$1$1 = new AcceptanceRateProgressBarKt$RollingDigit$1$1$1(this.RemoteActionCompatParcelizer, this.serializer, this.write, shortNewsContentCardView);
        int i2 = RatingCompat + 55;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return acceptanceRateProgressBarKt$RollingDigit$1$1$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ((AcceptanceRateProgressBarKt$RollingDigit$1$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }
        ((AcceptanceRateProgressBarKt$RollingDigit$1$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0052 -> B:18:0x0055). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r8.read
            o.getPlatformAndroidManager r3 = r8.write
            r4 = 1
            if (r2 == 0) goto L33
            int r5 = com.roadrunner.delivery.accept.declinebutton.presentation.AcceptanceRateProgressBarKt$RollingDigit$1$1$1.RatingCompat
            int r6 = r5 + 63
            int r7 = r6 % 128
            com.roadrunner.delivery.accept.declinebutton.presentation.AcceptanceRateProgressBarKt$RollingDigit$1$1$1.IconCompatParcelizer = r7
            int r6 = r6 % r0
            if (r2 != r4) goto L2c
            int r5 = r5 + 7
            int r2 = r5 % 128
            com.roadrunner.delivery.accept.declinebutton.presentation.AcceptanceRateProgressBarKt$RollingDigit$1$1$1.IconCompatParcelizer = r2
            int r5 = r5 % r0
            if (r5 == 0) goto L28
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            r9 = 16
            int r9 = r9 / 0
            goto L55
        L28:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L55
        L2c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            r9 = 0
            return r9
        L33:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
        L36:
            r9 = r3
            o.onHideTranslationui r9 = (o.onHideTranslationui) r9
            int r9 = r9.serializer()
            int r2 = r8.RemoteActionCompatParcelizer
            if (r9 == r2) goto L67
            int r9 = com.roadrunner.delivery.accept.declinebutton.presentation.AcceptanceRateProgressBarKt$RollingDigit$1$1$1.IconCompatParcelizer
            int r9 = r9 + 115
            int r2 = r9 % 128
            com.roadrunner.delivery.accept.declinebutton.presentation.AcceptanceRateProgressBarKt$RollingDigit$1$1$1.RatingCompat = r2
            int r9 = r9 % r0
            r8.read = r4
            r5 = 50
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r5, r8)
            if (r9 != r1) goto L55
            return r1
        L55:
            r9 = r3
            o.onHideTranslationui r9 = (o.onHideTranslationui) r9
            int r2 = r9.serializer()
            int r5 = r8.serializer
            int r2 = r2 + r5
            int r2 = r2 + 10
            int r2 = r2 % 10
            r9.serializer(r2)
            goto L36
        L67:
            o.createFromParcel r9 = o.createFromParcel.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.declinebutton.presentation.AcceptanceRateProgressBarKt$RollingDigit$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
