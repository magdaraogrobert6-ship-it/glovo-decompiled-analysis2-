package com.roadrunner.nafath;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class NafathTimerManager$start$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public long RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public int serializer;
    public final /* synthetic */ long write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NafathTimerManager$start$1(long j, long j2, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = j;
        this.write = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        NafathTimerManager$start$1 nafathTimerManager$start$1 = new NafathTimerManager$start$1(this.read, this.write, shortNewsContentCardView);
        nafathTimerManager$start$1.IconCompatParcelizer = obj;
        int i2 = RatingCompat + 25;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return nafathTimerManager$start$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 107;
        RatingCompat = i2 % Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 == 0) {
            ((NafathTimerManager$start$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
            obj3.hashCode();
            throw null;
        }
        Object objInvokeSuspend = ((NafathTimerManager$start$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i3 = MediaMetadataCompat + 23;
        RatingCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return objInvokeSuspend;
        }
        obj3.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068 A[PHI: r7
  0x0068: PHI (r7v1 long) = (r7v2 long), (r7v5 long) binds: [B:17:0x0065, B:12:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1000, r13) == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (r1.emit(o.oe.write, r13) == r2) goto L25;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0074 -> B:22:0x0077). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.Object r1 = r13.IconCompatParcelizer
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r13.serializer
            r4 = 3
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L3e
            if (r3 == r6) goto L38
            int r7 = com.roadrunner.nafath.NafathTimerManager$start$1.RatingCompat
            int r7 = r7 + 37
            int r8 = r7 % 128
            com.roadrunner.nafath.NafathTimerManager$start$1.MediaMetadataCompat = r8
            int r7 = r7 % r0
            if (r3 == r0) goto L29
            if (r3 != r4) goto L23
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r14)
            goto L88
        L23:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r14)
            return r5
        L29:
            long r7 = r13.RemoteActionCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r14)
            int r14 = com.roadrunner.nafath.NafathTimerManager$start$1.MediaMetadataCompat
            int r14 = r14 + 115
            int r3 = r14 % 128
            com.roadrunner.nafath.NafathTimerManager$start$1.RatingCompat = r3
            int r14 = r14 % r0
            goto L77
        L38:
            long r7 = r13.RemoteActionCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r14)
            goto L68
        L3e:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r14)
            int r14 = com.roadrunner.nafath.NafathTimerManager$start$1.MediaMetadataCompat
            int r14 = r14 + 9
            int r3 = r14 % 128
            com.roadrunner.nafath.NafathTimerManager$start$1.RatingCompat = r3
            int r14 = r14 % r0
            r7 = 0
        L4c:
            long r9 = r13.read
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 >= 0) goto L7b
            long r11 = r13.write
            o.og r14 = new o.og
            long r9 = r9 - r7
            long r11 = r11 + r7
            r14.<init>(r9, r11)
            r13.IconCompatParcelizer = r1
            r13.RemoteActionCompatParcelizer = r7
            r13.serializer = r6
            java.lang.Object r14 = r1.emit(r14, r13)
            if (r14 != r2) goto L68
            goto L87
        L68:
            r13.IconCompatParcelizer = r1
            r13.RemoteActionCompatParcelizer = r7
            r13.serializer = r0
            r9 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r14 = kotlinx.coroutines.DelayKt.delay(r9, r13)
            if (r14 != r2) goto L77
            goto L87
        L77:
            r9 = 1
            long r7 = r7 + r9
            goto L4c
        L7b:
            r13.IconCompatParcelizer = r5
            r13.serializer = r4
            o.oe r14 = o.oe.write
            java.lang.Object r14 = r1.emit(r14, r13)
            if (r14 != r2) goto L88
        L87:
            return r2
        L88:
            o.createFromParcel r14 = o.createFromParcel.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.nafath.NafathTimerManager$start$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
