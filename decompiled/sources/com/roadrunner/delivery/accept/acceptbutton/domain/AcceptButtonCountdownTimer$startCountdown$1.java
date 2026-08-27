package com.roadrunner.delivery.accept.acceptbutton.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class AcceptButtonCountdownTimer$startCountdown$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public /* synthetic */ Object IconCompatParcelizer;
    public int MediaMetadataCompat;
    public long RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public final /* synthetic */ long serializer;
    public float write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptButtonCountdownTimer$startCountdown$1(long j, long j2, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = j;
        this.read = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        AcceptButtonCountdownTimer$startCountdown$1 acceptButtonCountdownTimer$startCountdown$1 = new AcceptButtonCountdownTimer$startCountdown$1(this.serializer, this.read, shortNewsContentCardView);
        acceptButtonCountdownTimer$startCountdown$1.IconCompatParcelizer = obj;
        int i2 = RatingCompat + 115;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 8 / 0;
        }
        return acceptButtonCountdownTimer$startCountdown$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 65;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((AcceptButtonCountdownTimer$startCountdown$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = MediaSessionCompatQueueItem + 73;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1000, r12) == r2) goto L34;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0095 -> B:35:0x0098). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.Object r1 = r12.IconCompatParcelizer
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r12.MediaMetadataCompat
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L3c
            if (r3 == r4) goto L34
            r7 = 0
            if (r3 != r0) goto L2e
            int r3 = com.roadrunner.delivery.accept.acceptbutton.domain.AcceptButtonCountdownTimer$startCountdown$1.MediaSessionCompatQueueItem
            int r3 = r3 + 77
            int r8 = r3 % 128
            com.roadrunner.delivery.accept.acceptbutton.domain.AcceptButtonCountdownTimer$startCountdown$1.RatingCompat = r8
            int r3 = r3 % r0
            if (r3 != 0) goto L27
            long r7 = r12.RemoteActionCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r13)
            goto L98
        L27:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r13)
            r7.hashCode()
            throw r7
        L2e:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r13)
            return r7
        L34:
            float r3 = r12.write
            long r7 = r12.RemoteActionCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r13)
            goto L87
        L3c:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r13)
            long r7 = r12.serializer
            int r13 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r13 >= 0) goto L46
            goto L9c
        L46:
            r9 = -1
            int r13 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r13 >= 0) goto L9c
            long r9 = r12.read
            int r13 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            r3 = 0
            if (r13 <= 0) goto L60
            int r13 = com.roadrunner.delivery.accept.acceptbutton.domain.AcceptButtonCountdownTimer$startCountdown$1.MediaSessionCompatQueueItem
            int r13 = r13 + 105
            int r11 = r13 % 128
            com.roadrunner.delivery.accept.acceptbutton.domain.AcceptButtonCountdownTimer$startCountdown$1.RatingCompat = r11
            int r13 = r13 % r0
            float r13 = (float) r7
            float r9 = (float) r9
            float r13 = r13 / r9
            goto L61
        L60:
            r13 = r3
        L61:
            boolean r9 = java.lang.Float.isNaN(r13)
            if (r9 == 0) goto L68
            goto L72
        L68:
            int r3 = com.roadrunner.delivery.accept.acceptbutton.domain.AcceptButtonCountdownTimer$startCountdown$1.MediaSessionCompatQueueItem
            int r3 = r3 + 35
            int r9 = r3 % 128
            com.roadrunner.delivery.accept.acceptbutton.domain.AcceptButtonCountdownTimer$startCountdown$1.RatingCompat = r9
            int r3 = r3 % r0
            r3 = r13
        L72:
            o.LocaleSaverlambda1 r9 = new o.LocaleSaverlambda1
            r9.<init>(r3, r7)
            r12.IconCompatParcelizer = r1
            r12.RemoteActionCompatParcelizer = r7
            r12.write = r13
            r12.MediaMetadataCompat = r4
            java.lang.Object r3 = r1.emit(r9, r12)
            if (r3 != r2) goto L86
            goto L97
        L86:
            r3 = r13
        L87:
            r12.IconCompatParcelizer = r1
            r12.RemoteActionCompatParcelizer = r7
            r12.write = r3
            r12.MediaMetadataCompat = r0
            r9 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r13 = kotlinx.coroutines.DelayKt.delay(r9, r12)
            if (r13 != r2) goto L98
        L97:
            return r2
        L98:
            r9 = 1
            long r7 = r7 - r9
            goto L46
        L9c:
            o.createFromParcel r13 = o.createFromParcel.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.acceptbutton.domain.AcceptButtonCountdownTimer$startCountdown$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
