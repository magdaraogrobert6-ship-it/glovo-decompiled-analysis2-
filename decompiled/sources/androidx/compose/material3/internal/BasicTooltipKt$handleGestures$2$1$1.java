package androidx.compose.material3.internal;

import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class BasicTooltipKt$handleGestures$2$1$1 extends RestrictedSuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public PointerEventPass IconCompatParcelizer;
    public final /* synthetic */ TooltipStateImpl RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ getContentViewGroupParentLayout write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$handleGestures$2$1$1(getContentViewGroupParentLayout getcontentviewgroupparentlayout, TooltipStateImpl tooltipStateImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = getcontentviewgroupparentlayout;
        this.RemoteActionCompatParcelizer = tooltipStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        BasicTooltipKt$handleGestures$2$1$1 basicTooltipKt$handleGestures$2$1$1 = new BasicTooltipKt$handleGestures$2$1$1(this.write, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        basicTooltipKt$handleGestures$2$1$1.serializer = obj;
        return basicTooltipKt$handleGestures$2$1$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((BasicTooltipKt$handleGestures$2$1$1) create((AwaitPointerEventScope) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:0x006c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:12:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.read
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L14
            androidx.compose.ui.input.pointer.PointerEventPass r1 = r8.IconCompatParcelizer
            java.lang.Object r4 = r8.serializer
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L31
        L14:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            return r3
        L1a:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            java.lang.Object r9 = r8.serializer
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r4 = r9
        L24:
            r8.serializer = r4
            r8.IconCompatParcelizer = r1
            r8.read = r2
            java.lang.Object r9 = r4.awaitPointerEvent(r1, r8)
            if (r9 != r0) goto L31
            return r0
        L31:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
            java.util.List r5 = r9.getChanges()
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            int r5 = r5.m2074getTypeT8wyACA()
            androidx.compose.ui.input.pointer.PointerType$Companion r6 = androidx.compose.ui.input.pointer.PointerType.Companion
            int r6 = r6.m2151getMouseT8wyACA()
            boolean r5 = androidx.compose.ui.input.pointer.PointerType.m2146equalsimpl0(r5, r6)
            if (r5 == 0) goto L24
            int r9 = r9.m2004getType7fucELk()
            androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.ui.input.pointer.PointerEventType.Companion
            int r6 = r5.m2015getEnter7fucELk()
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventType.m2011equalsimpl0(r9, r6)
            androidx.compose.material3.TooltipStateImpl r7 = r8.RemoteActionCompatParcelizer
            if (r6 == 0) goto L6c
            androidx.compose.material3.internal.BasicTooltipKt$anchorSemantics$1$1$1 r9 = new androidx.compose.material3.internal.BasicTooltipKt$anchorSemantics$1$1$1
            r9.<init>(r7, r3, r2)
            o.getContentViewGroupParentLayout r5 = r8.write
            r6 = 3
            kotlinx.coroutines.BuildersKt.RemoteActionCompatParcelizer(r5, r3, r3, r9, r6)
            goto L24
        L6c:
            int r5 = r5.m2016getExit7fucELk()
            boolean r9 = androidx.compose.ui.input.pointer.PointerEventType.m2011equalsimpl0(r9, r5)
            if (r9 == 0) goto L24
            r7.IconCompatParcelizer()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
