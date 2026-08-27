package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import coil3.ExtrasKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda2;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl;
import o.PlatformDefaultTextContextMenuProviders_androidKt;
import o.RemoteActionCompatParcelizer;
import o.ShortNewsContentCardView;
import o.cancelPendingWebViewPause;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public abstract class DragGestureDetectorKt {
    public static final float serializer = Dp.m3673constructorimpl(0.125f) / Dp.m3673constructorimpl(18.0f);

    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a7 A[LOOP:0: B:24:0x008f->B:28:0x00a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x00b1 A[EDGE_INSN: B:72:0x00b1->B:30:0x00b1 BREAK  A[LOOP:0: B:24:0x008f->B:28:0x00a7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007b -> B:23:0x0081). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    public static final java.lang.Object m35horizontalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, long r19, o.InlineChildren r21, kotlin.coroutines.jvm.internal.BaseContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m35horizontalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, o.InlineChildren, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    public static final float write(ViewConfiguration viewConfiguration, int i) {
        return PointerType.m2146equalsimpl0(i, PointerType.Companion.m2151getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * serializer : viewConfiguration.getTouchSlop();
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ContinuationImpl continuationImpl) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new TapGestureDetectorKt$detectTapAndPress$2$1(new RemoteActionCompatParcelizer(8), new SubcomposeAsyncImageKt$$ExternalSyntheticLambda2(1, r8lambdaunavo3sxub_pc9xroryotnrlvsm), r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), (ShortNewsContentCardView) null), continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (objAwaitEachGesture != coroutineSingletons) {
            objAwaitEachGesture = createfromparcel;
        }
        return objAwaitEachGesture == coroutineSingletons ? objAwaitEachGesture : createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x008a A[LOOP:0: B:23:0x0074->B:27:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x008e A[EDGE_INSN: B:54:0x008e->B:29:0x008e BREAK  A[LOOP:0: B:23:0x0074->B:27:0x008a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0060 -> B:22:0x0065). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    public static final java.lang.Object m30awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m30awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e0 A[LOOP:0: B:25:0x00c7->B:29:0x00e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00eb A[EDGE_INSN: B:68:0x00eb->B:31:0x00eb BREAK  A[LOOP:0: B:25:0x00c7->B:29:0x00e0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v12, types: [androidx.compose.ui.input.pointer.PointerEventPass, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0189 -> B:61:0x0195). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    public static final java.lang.Object m31awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, int r22, androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda3 r23, kotlin.coroutines.jvm.internal.BaseContinuationImpl r24) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m31awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda3, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ee A[LOOP:0: B:25:0x00d5->B:29:0x00ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f4 A[EDGE_INSN: B:68:0x00f4->B:31:0x00f4 BREAK  A[LOOP:0: B:25:0x00d5->B:29:0x00ee], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.ui.input.pointer.PointerEventPass, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0182 -> B:61:0x0189). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    public static final java.lang.Object m33awaitTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda3 r22, kotlin.coroutines.jvm.internal.BaseContinuationImpl r23) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m33awaitTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda3, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:233:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x026b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0288 A[LOOP:8: B:37:0x0269->B:41:0x0288, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x0409 -> B:91:0x03af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0460 -> B:117:0x0475). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x05c3 -> B:158:0x05cd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x0664 -> B:173:0x0665). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x020c -> B:76:0x036b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x02d3 -> B:76:0x036b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x030b -> B:77:0x036c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x035a -> B:73:0x0363). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object processDragGesture(androidx.compose.ui.input.pointer.AwaitPointerEventScope r28, androidx.compose.ui.input.pointer.PointerInputChange r29, o.RemoteActionCompatParcelizer r30, coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda2 r31, o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r32, o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r33, o.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl r34, kotlin.coroutines.jvm.internal.BaseContinuationImpl r35) {
        /*
            Method dump skipped, instruction units count: 1840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.processDragGesture(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerInputChange, o.RemoteActionCompatParcelizer, coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda2, o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0, o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0, o.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [o.createInAppMessageEventSubscriber] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX INFO: renamed from: awaitLongPressOrCancellation-rnUCldI, reason: not valid java name */
    public static final Object m32awaitLongPressOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, ContinuationImpl continuationImpl) {
        PlatformDefaultTextContextMenuProviders_androidKt platformDefaultTextContextMenuProviders_androidKt;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        cancelPendingWebViewPause cancelpendingwebviewpause;
        if (continuationImpl instanceof PlatformDefaultTextContextMenuProviders_androidKt) {
            platformDefaultTextContextMenuProviders_androidKt = (PlatformDefaultTextContextMenuProviders_androidKt) continuationImpl;
            int i = platformDefaultTextContextMenuProviders_androidKt.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                platformDefaultTextContextMenuProviders_androidKt.write = i - Integer.MIN_VALUE;
            } else {
                platformDefaultTextContextMenuProviders_androidKt = new PlatformDefaultTextContextMenuProviders_androidKt(continuationImpl);
            }
        } else {
            platformDefaultTextContextMenuProviders_androidKt = new PlatformDefaultTextContextMenuProviders_androidKt(continuationImpl);
        }
        Object obj = platformDefaultTextContextMenuProviders_androidKt.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = platformDefaultTextContextMenuProviders_androidKt.write;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (!m36isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                    int size = changes.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i3);
                        if (PointerId.m2050equalsimpl0(pointerInputChange.m2068getIdJ3iCeTQ(), j)) {
                            break;
                        }
                        i3++;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null) {
                        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                        createInAppMessageEventSubscriber createinappmessageeventsubscriber2 = new createInAppMessageEventSubscriber();
                        createinappmessageeventsubscriber2.IconCompatParcelizer = pointerInputChange2;
                        long longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                        cancelPendingWebViewPause cancelpendingwebviewpause2 = new cancelPendingWebViewPause();
                        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(cancelpendingwebviewpause2, createinappmessageeventsubscriber2, createinappmessageeventsubscriber, null);
                        platformDefaultTextContextMenuProviders_androidKt.read = pointerInputChange2;
                        platformDefaultTextContextMenuProviders_androidKt.RemoteActionCompatParcelizer = createinappmessageeventsubscriber;
                        platformDefaultTextContextMenuProviders_androidKt.IconCompatParcelizer = cancelpendingwebviewpause2;
                        platformDefaultTextContextMenuProviders_androidKt.write = 1;
                        if (awaitPointerEventScope.withTimeout(longPressTimeoutMillis, dragGestureDetectorKt$awaitLongPressOrCancellation$2, platformDefaultTextContextMenuProviders_androidKt) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        cancelpendingwebviewpause = cancelpendingwebviewpause2;
                        j = createinappmessageeventsubscriber;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cancelpendingwebviewpause = platformDefaultTextContextMenuProviders_androidKt.IconCompatParcelizer;
            createInAppMessageEventSubscriber createinappmessageeventsubscriber3 = platformDefaultTextContextMenuProviders_androidKt.RemoteActionCompatParcelizer;
            pointerInputChange2 = platformDefaultTextContextMenuProviders_androidKt.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            j = createinappmessageeventsubscriber3;
            if (cancelpendingwebviewpause.IconCompatParcelizer) {
                PointerInputChange pointerInputChange3 = (PointerInputChange) j.IconCompatParcelizer;
                return pointerInputChange3 == null ? pointerInputChange2 : pointerInputChange3;
            }
            return null;
        } catch (PointerEventTimeoutCancellationException unused) {
            PointerInputChange pointerInputChange4 = (PointerInputChange) j.IconCompatParcelizer;
            return pointerInputChange4 == null ? pointerInputChange2 : pointerInputChange4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: drag-jO51t88, reason: not valid java name */
    public static final java.lang.Object m34dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r4, long r5, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof o.ProvideBothDefaultProviders
            if (r0 == 0) goto L13
            r0 = r8
            o.ProvideBothDefaultProviders r0 = (o.ProvideBothDefaultProviders) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.RemoteActionCompatParcelizer = r1
            goto L18
        L13:
            o.ProvideBothDefaultProviders r0 = new o.ProvideBothDefaultProviders
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.write
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r4 = r0.read
            r5 = r4
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r5 = (o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) r5
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = r0.IconCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            r7 = r4
            r4 = r5
            goto L4a
        L30:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r4)
            r4 = 0
            return r4
        L37:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
        L3a:
            r0.IconCompatParcelizer = r4
            r8 = r7
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8 = (o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) r8
            r0.read = r7
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r8 = m30awaitDragOrCancellationrnUCldI(r4, r5, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L51
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L51:
            boolean r5 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r8)
            if (r5 == 0) goto L5a
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L5a:
            r7.invoke(r8)
            long r5 = r8.m2068getIdJ3iCeTQ()
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m34dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    public static final boolean m36isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i);
            if (PointerId.m2050equalsimpl0(pointerInputChange.m2068getIdJ3iCeTQ(), j)) {
                break;
            }
            i++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z = true;
        }
        return true ^ z;
    }
}
