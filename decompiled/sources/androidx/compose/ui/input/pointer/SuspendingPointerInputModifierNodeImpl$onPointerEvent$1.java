package androidx.compose.ui.input.pointer;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class SuspendingPointerInputModifierNodeImpl$onPointerEvent$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    int label;
    final /* synthetic */ SuspendingPointerInputModifierNodeImpl this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
        return new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this.this$0, shortNewsContentCardView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r5.invoke(r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r5.invoke(r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto L14
            if (r1 != r2) goto Ld
            goto L14
        Ld:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r5)
            r5 = 0
            return r5
        L14:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r5)
            goto L46
        L18:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r5)
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r5 = r4.this$0
            o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r5 = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.access$get_deprecatedPointerInputHandler$p(r5)
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r1 = r4.this$0
            if (r5 == 0) goto L37
            o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r5 = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.access$get_deprecatedPointerInputHandler$p(r1)
            r5.getClass()
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r1 = r4.this$0
            r4.label = r3
            java.lang.Object r5 = r5.invoke(r1, r4)
            if (r5 != r0) goto L46
            goto L45
        L37:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r5 = r1.getPointerInputEventHandler()
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r1 = r4.this$0
            r4.label = r2
            java.lang.Object r5 = r5.invoke(r1, r4)
            if (r5 != r0) goto L46
        L45:
            return r0
        L46:
            o.createFromParcel r5 = o.createFromParcel.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl, ShortNewsContentCardView<? super SuspendingPointerInputModifierNodeImpl$onPointerEvent$1> shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.this$0 = suspendingPointerInputModifierNodeImpl;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        return ((SuspendingPointerInputModifierNodeImpl$onPointerEvent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
    }
}
