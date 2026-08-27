package com.roadrunner.rrds.compose.component.image.zoomable;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.UtilNetworkingIConnectionOptions;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DetectZoomableGesturesKt {
    private static int read = 0;
    private static int write = 1;

    public static final void consumePositionChanges(PointerEvent pointerEvent) {
        int i = 2 % 2;
        int i2 = read + 125;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i4 = read + 123;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        for (int i6 = 0; i6 < size; i6++) {
            PointerInputChange pointerInputChange = changes.get(i6);
            if (PointerEventKt.positionChanged(pointerInputChange)) {
                pointerInputChange.consume();
                int i7 = read + 3;
                write = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 2 % 4;
                }
            }
        }
    }

    public static final boolean isPressed(PointerEvent pointerEvent) {
        List<PointerInputChange> changes;
        int size;
        int i;
        int i2 = 2 % 2;
        int i3 = read + 1;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            changes = pointerEvent.getChanges();
            size = changes.size();
            i = 1;
        } else {
            changes = pointerEvent.getChanges();
            size = changes.size();
            i = 0;
        }
        while (i < size) {
            if (changes.get(i).getPressed()) {
                int i4 = read + 107;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return true;
            }
            i++;
        }
        int i6 = write + 121;
        read = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 94 / 0;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static final Object awaitEvent(AwaitPointerEventScope awaitPointerEventScope, ContinuationImpl continuationImpl) {
        UtilNetworkingIConnectionOptions utilNetworkingIConnectionOptions;
        int i = 2 % 2;
        int i2 = write + 63;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof UtilNetworkingIConnectionOptions) {
            utilNetworkingIConnectionOptions = (UtilNetworkingIConnectionOptions) continuationImpl;
            int i4 = utilNetworkingIConnectionOptions.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                utilNetworkingIConnectionOptions.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                utilNetworkingIConnectionOptions = new UtilNetworkingIConnectionOptions(continuationImpl);
            }
        } else {
            utilNetworkingIConnectionOptions = new UtilNetworkingIConnectionOptions(continuationImpl);
        }
        Object objAwaitPointerEvent = utilNetworkingIConnectionOptions.write;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = utilNetworkingIConnectionOptions.IconCompatParcelizer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objAwaitPointerEvent);
            PointerEventPass pointerEventPass = PointerEventPass.Main;
            utilNetworkingIConnectionOptions.IconCompatParcelizer = 1;
            objAwaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, utilNetworkingIConnectionOptions);
            if (objAwaitPointerEvent == obj) {
                int i6 = read + 91;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return obj;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objAwaitPointerEvent);
        }
        PointerEvent pointerEvent = (PointerEvent) objAwaitPointerEvent;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i8 = read + 67;
        write = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        for (int i10 = 0; i10 < size; i10++) {
            if (changes.get(i10).isConsumed()) {
                int i11 = write + 89;
                read = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    return null;
                }
                throw null;
            }
        }
        return pointerEvent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        if (isPressed(r11) == false) goto L36;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004d -> B:25:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object consumeAllEventsUntilReleased(androidx.compose.ui.input.pointer.AwaitPointerEventScope r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r11 instanceof o.UtilNetworking2
            if (r1 == 0) goto L16
            r1 = r11
            o.UtilNetworking2 r1 = (o.UtilNetworking2) r1
            int r2 = r1.write
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 + r3
            r1.write = r2
            goto L1b
        L16:
            o.UtilNetworking2 r1 = new o.UtilNetworking2
            r1.<init>(r11)
        L1b:
            java.lang.Object r11 = r1.RemoteActionCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.write
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L42
            int r10 = com.roadrunner.rrds.compose.component.image.zoomable.DetectZoomableGesturesKt.read
            int r10 = r10 + 107
            int r6 = r10 % 128
            com.roadrunner.rrds.compose.component.image.zoomable.DetectZoomableGesturesKt.write = r6
            int r10 = r10 % r0
            if (r10 != 0) goto L33
            if (r3 != r5) goto L3b
            goto L35
        L33:
            if (r3 != r5) goto L3b
        L35:
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = r1.IconCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            goto L5e
        L3b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r10)
            r10 = 0
            return r10
        L42:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
        L45:
            r1.IconCompatParcelizer = r10
            r1.write = r5
            java.lang.Object r11 = awaitEvent(r10, r1)
            if (r11 != r2) goto L5e
            int r10 = com.roadrunner.rrds.compose.component.image.zoomable.DetectZoomableGesturesKt.write
            int r10 = r10 + 89
            int r11 = r10 % 128
            com.roadrunner.rrds.compose.component.image.zoomable.DetectZoomableGesturesKt.read = r11
            int r10 = r10 % r0
            if (r10 == 0) goto L5d
            r10 = 23
            int r10 = r10 / r4
        L5d:
            return r2
        L5e:
            androidx.compose.ui.input.pointer.PointerEvent r11 = (androidx.compose.ui.input.pointer.PointerEvent) r11
            if (r11 != 0) goto L63
            goto L9a
        L63:
            java.util.List r3 = r11.getChanges()
            r6 = r3
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            r7 = r4
        L6f:
            if (r7 >= r6) goto L94
            int r8 = com.roadrunner.rrds.compose.component.image.zoomable.DetectZoomableGesturesKt.read
            int r8 = r8 + 91
            int r9 = r8 % 128
            com.roadrunner.rrds.compose.component.image.zoomable.DetectZoomableGesturesKt.write = r9
            int r8 = r8 % r0
            if (r8 != 0) goto L88
            java.lang.Object r8 = r3.get(r7)
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            r8.consume()
            int r7 = r7 + 70
            goto L6f
        L88:
            java.lang.Object r8 = r3.get(r7)
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            r8.consume()
            int r7 = r7 + 1
            goto L6f
        L94:
            boolean r11 = isPressed(r11)
            if (r11 != 0) goto L45
        L9a:
            o.createFromParcel r10 = o.createFromParcel.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rrds.compose.component.image.zoomable.DetectZoomableGesturesKt.consumeAllEventsUntilReleased(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:52:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x0111  */
    /* JADX WARN: Code duplicated, block: B:56:0x011b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x013d  */
    /* JADX WARN: Code duplicated, block: B:60:0x013f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0147  */
    /* JADX WARN: Code duplicated, block: B:74:0x0176  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[LOOP:2: B:46:0x00ec->B:85:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Path cross not found for [B:37:0x00c4, B:45:0x00e8], limit reached: 82 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0153 -> B:18:0x0055). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object awaitTouchSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope r12, kotlin.coroutines.jvm.internal.BaseContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rrds.compose.component.image.zoomable.DetectZoomableGesturesKt.awaitTouchSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:107:0x0304  */
    /* JADX WARN: Code duplicated, block: B:187:0x02bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x023b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0179  */
    /* JADX WARN: Code duplicated, block: B:36:0x0189  */
    /* JADX WARN: Code duplicated, block: B:38:0x018d  */
    /* JADX WARN: Code duplicated, block: B:42:0x019f  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x0221  */
    /* JADX WARN: Code duplicated, block: B:59:0x022b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0236  */
    /* JADX WARN: Code duplicated, block: B:66:0x0244  */
    /* JADX WARN: Code duplicated, block: B:68:0x024e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0262  */
    /* JADX WARN: Code duplicated, block: B:74:0x026d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0279  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Code duplicated, block: B:92:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:93:0x02b1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x02fb -> B:104:0x02fe). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:167:0x04f6 -> B:168:0x04f7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object access$detectGesture(androidx.compose.ui.input.pointer.AwaitPointerEventScope r26, o.getSessionParameters r27, o.getSessionParameters r28, kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1 r29, androidx.compose.ui.tooling.data.SlotTreeKt$$ExternalSyntheticLambda0 r30, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r31, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r32, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r33, kotlin.coroutines.jvm.internal.BaseContinuationImpl r34) {
        /*
            Method dump skipped, instruction units count: 1340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rrds.compose.component.image.zoomable.DetectZoomableGesturesKt.access$detectGesture(androidx.compose.ui.input.pointer.AwaitPointerEventScope, o.getSessionParameters, o.getSessionParameters, kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1, androidx.compose.ui.tooling.data.SlotTreeKt$$ExternalSyntheticLambda0, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }
}
