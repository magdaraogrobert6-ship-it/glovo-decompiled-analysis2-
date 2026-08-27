package com.roadrunner.countdowntimer;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.RectListDebuggerModifierNodeonAttach1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class CountDownTimer$start$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final /* synthetic */ long IconCompatParcelizer;
    public final /* synthetic */ RectListDebuggerModifierNodeonAttach1 MediaDescriptionCompat;
    public long RemoteActionCompatParcelizer;
    public long read;
    public long serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimer$start$1(long j, RectListDebuggerModifierNodeonAttach1 rectListDebuggerModifierNodeonAttach1, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = j;
        this.MediaDescriptionCompat = rectListDebuggerModifierNodeonAttach1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        CountDownTimer$start$1 countDownTimer$start$1 = new CountDownTimer$start$1(this.IconCompatParcelizer, this.MediaDescriptionCompat, shortNewsContentCardView);
        int i2 = MediaMetadataCompat + 93;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return countDownTimer$start$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 21;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((CountDownTimer$start$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = MediaMetadataCompat + 27;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x004f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:18:0x006a A[PHI: r2 r8 r9
  0x006a: PHI (r2v12 kotlin.coroutines.intrinsics.CoroutineSingletons) = (r2v4 kotlin.coroutines.intrinsics.CoroutineSingletons), (r2v13 kotlin.coroutines.intrinsics.CoroutineSingletons) binds: [B:8:0x002b, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r8v6 o.RectListDebuggerModifierNodeonAttach1) = (r8v0 o.RectListDebuggerModifierNodeonAttach1), (r8v7 o.RectListDebuggerModifierNodeonAttach1) binds: [B:8:0x002b, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r9v7 o.createFromParcel) = (r9v0 o.createFromParcel), (r9v8 o.createFromParcel) binds: [B:8:0x002b, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d A[DONT_INVERT, PHI: r2 r7 r8 r9
  0x002d: PHI (r2v5 kotlin.coroutines.intrinsics.CoroutineSingletons) = (r2v4 kotlin.coroutines.intrinsics.CoroutineSingletons), (r2v13 kotlin.coroutines.intrinsics.CoroutineSingletons) binds: [B:8:0x002b, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x002d: PHI (r7v1 int) = (r7v0 int), (r7v6 int) binds: [B:8:0x002b, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x002d: PHI (r8v1 o.RectListDebuggerModifierNodeonAttach1) = (r8v0 o.RectListDebuggerModifierNodeonAttach1), (r8v7 o.RectListDebuggerModifierNodeonAttach1) binds: [B:8:0x002b, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x002d: PHI (r9v1 o.createFromParcel) = (r9v0 o.createFromParcel), (r9v8 o.createFromParcel) binds: [B:8:0x002b, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if (0 <= r12) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1000, r20) == r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
    
        if (r9 == r2) goto L33;
     */
    /* JADX WARN: Path cross not found for [B:4:0x0014, B:7:0x0023], limit reached: 35 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d5 -> B:20:0x007f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.countdowntimer.CountDownTimer$start$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
