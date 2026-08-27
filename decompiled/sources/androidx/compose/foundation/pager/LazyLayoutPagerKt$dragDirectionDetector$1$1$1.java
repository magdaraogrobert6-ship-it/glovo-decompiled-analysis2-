package androidx.compose.foundation.pager;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutPagerKt$dragDirectionDetector$1$1$1 extends RestrictedSuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public PointerInputChange read;
    public PointerInputChange serializer;
    public final /* synthetic */ PagerState write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        LazyLayoutPagerKt$dragDirectionDetector$1$1$1 lazyLayoutPagerKt$dragDirectionDetector$1$1$1 = new LazyLayoutPagerKt$dragDirectionDetector$1$1$1(this.write, shortNewsContentCardView);
        lazyLayoutPagerKt$dragDirectionDetector$1$1$1.IconCompatParcelizer = obj;
        return lazyLayoutPagerKt$dragDirectionDetector$1$1$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutPagerKt$dragDirectionDetector$1$1$1) create((AwaitPointerEventScope) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0079  */
    /* JADX WARN: Code duplicated, block: B:23:0x0086 A[LOOP:0: B:19:0x0077->B:23:0x0086, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0056 A[EDGE_INSN: B:28:0x0056->B:14:0x0056 BREAK  A[LOOP:0: B:19:0x0077->B:23:0x0086], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0066 -> B:18:0x0069). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.RemoteActionCompatParcelizer
            androidx.compose.foundation.pager.PagerState r2 = r12.write
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L2d
            if (r1 == r5) goto L25
            if (r1 != r3) goto L1f
            androidx.compose.ui.input.pointer.PointerInputChange r1 = r12.serializer
            androidx.compose.ui.input.pointer.PointerInputChange r5 = r12.read
            java.lang.Object r6 = r12.IconCompatParcelizer
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r6
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r13)
            r11 = r6
            r6 = r1
            r1 = r11
            goto L69
        L1f:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r13)
            return r6
        L25:
            java.lang.Object r1 = r12.IconCompatParcelizer
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r13)
            goto L42
        L2d:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r13)
            java.lang.Object r13 = r12.IconCompatParcelizer
            r1 = r13
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            androidx.compose.ui.input.pointer.PointerEventPass r13 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            r12.IconCompatParcelizer = r1
            r12.RemoteActionCompatParcelizer = r5
            java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(r1, r4, r13, r12)
            if (r13 != r0) goto L42
            goto L68
        L42:
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            androidx.compose.ui.geometry.Offset$Companion r5 = androidx.compose.ui.geometry.Offset.Companion
            long r7 = r5.m493getZeroF1C5BW0()
            o.PopulateViewStructure_androidKtpopulate7 r5 = r2._init_lambda1
            androidx.compose.ui.geometry.Offset r7 = androidx.compose.ui.geometry.Offset.m466boximpl(r7)
            o.onShowTranslationui r5 = (o.onShowTranslationui) r5
            r5.setValue(r7)
            r5 = r13
        L56:
            if (r6 != 0) goto L95
            androidx.compose.ui.input.pointer.PointerEventPass r13 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            r12.IconCompatParcelizer = r1
            r12.read = r5
            r12.serializer = r6
            r12.RemoteActionCompatParcelizer = r3
            java.lang.Object r13 = r1.awaitPointerEvent(r13, r12)
            if (r13 != r0) goto L69
        L68:
            return r0
        L69:
            androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.ui.input.pointer.PointerEvent) r13
            java.util.List r7 = r13.getChanges()
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            int r8 = r8.size()
            r9 = r4
        L77:
            if (r9 >= r8) goto L89
            java.lang.Object r10 = r7.get(r9)
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            boolean r10 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(r10)
            if (r10 != 0) goto L86
            goto L56
        L86:
            int r9 = r9 + 1
            goto L77
        L89:
            java.util.List r13 = r13.getChanges()
            java.lang.Object r13 = r13.get(r4)
            r6 = r13
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            goto L56
        L95:
            long r0 = r6.m2071getPositionF1C5BW0()
            long r3 = r5.m2071getPositionF1C5BW0()
            long r0 = androidx.compose.ui.geometry.Offset.m481minusMKHz9U(r0, r3)
            o.PopulateViewStructure_androidKtpopulate7 r13 = r2._init_lambda1
            androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.m466boximpl(r0)
            o.onShowTranslationui r13 = (o.onShowTranslationui) r13
            r13.setValue(r0)
            o.createFromParcel r13 = o.createFromParcel.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPagerKt$dragDirectionDetector$1$1$1(PagerState pagerState, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = pagerState;
    }
}
