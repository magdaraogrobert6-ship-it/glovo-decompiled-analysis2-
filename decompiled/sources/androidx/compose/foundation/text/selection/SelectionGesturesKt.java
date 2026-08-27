package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.text.TextRange;
import coil3.ExtrasKt;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.logic.zp;
import com.huawei.location.ut;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import o.InlineChildren;
import o.ModifierNode;
import o.cancelPendingWebViewPause;
import o.createFromParcel;
import o.getNodeannotations;
import o.seekAnimationsanimation_core;

/* JADX INFO: loaded from: classes.dex */
public abstract class SelectionGesturesKt {
    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d A[LOOP:0: B:19:0x004e->B:23:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object access$awaitDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof o.accessfoldOutjd
            if (r0 == 0) goto L13
            r0 = r8
            o.accessfoldOutjd r0 = (o.accessfoldOutjd) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.RemoteActionCompatParcelizer = r1
            goto L18
        L13:
            o.accessfoldOutjd r0 = new o.accessfoldOutjd
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.read
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = r0.IconCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            goto L40
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r7)
            r7 = 0
            return r7
        L30:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
        L33:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r0.IconCompatParcelizer = r7
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r8 = r7.awaitPointerEvent(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            java.util.List r2 = r8.getChanges()
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L4e:
            if (r5 >= r4) goto L60
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDown(r6)
            if (r6 != 0) goto L5d
            goto L33
        L5d:
            int r5 = r5 + 1
            goto L4e
        L60:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.access$awaitDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c4, code lost:
    
        if (r15 == r1) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$touchSelectionSubsequentPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope r11, o.AlignmentHorizontal r12, androidx.compose.ui.input.pointer.PointerEvent r13, int r14, kotlin.coroutines.jvm.internal.BaseContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.access$touchSelectionSubsequentPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope, o.AlignmentHorizontal, androidx.compose.ui.input.pointer.PointerEvent, int, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        if (r14 == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object touchSelectionFirstPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope r11, o.AlignmentHorizontal r12, androidx.compose.ui.input.pointer.PointerEvent r13, kotlin.coroutines.jvm.internal.BaseContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionFirstPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope, o.AlignmentHorizontal, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb A[Catch: all -> 0x0056, TryCatch #2 {all -> 0x0056, blocks: (B:20:0x0051, B:42:0x00c3, B:44:0x00cb, B:46:0x00dc, B:48:0x00e8), top: B:103:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00dc A[Catch: all -> 0x0056, TryCatch #2 {all -> 0x0056, blocks: (B:20:0x0051, B:42:0x00c3, B:44:0x00cb, B:46:0x00dc, B:48:0x00e8), top: B:103:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e8 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #2 {all -> 0x0056, blocks: (B:20:0x0051, B:42:0x00c3, B:44:0x00cb, B:46:0x00dc, B:48:0x00e8), top: B:103:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a5 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:13:0x0039, B:82:0x0188, B:84:0x0190, B:86:0x0194, B:88:0x01a5, B:90:0x01b1), top: B:101:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01b1 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:13:0x0039, B:82:0x0188, B:84:0x0190, B:86:0x0194, B:88:0x01a5, B:90:0x01b1), top: B:101:0x0039 }] */
    public static final Object mouseSelection(AwaitPointerEventScope awaitPointerEventScope, ut utVar, zp zpVar, PointerEvent pointerEvent, BaseContinuationImpl baseContinuationImpl) throws Throwable {
        ModifierNode modifierNode;
        seekAnimationsanimation_core seekanimationsanimation_core;
        LegacyTextFieldState legacyTextFieldState;
        ut utVar2;
        Object obj;
        cancelPendingWebViewPause cancelpendingwebviewpause;
        seekAnimationsanimation_core seekanimationsanimation_core2;
        ut utVar3;
        List<PointerInputChange> changes;
        int size;
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes2;
        int size2;
        PointerInputChange pointerInputChange2;
        AwaitPointerEventScope awaitPointerEventScope2 = awaitPointerEventScope;
        seekAnimationsanimation_core seekanimationsanimation_core3 = getNodeannotations.write;
        if (baseContinuationImpl instanceof ModifierNode) {
            modifierNode = (ModifierNode) baseContinuationImpl;
            int i = modifierNode.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                modifierNode.serializer = i - Integer.MIN_VALUE;
            } else {
                modifierNode = new ModifierNode(baseContinuationImpl);
            }
        } else {
            modifierNode = new ModifierNode(baseContinuationImpl);
        }
        ModifierNode modifierNode2 = modifierNode;
        Object objM34dragjO51t88 = modifierNode2.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = modifierNode2.serializer;
        int i3 = 0;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objM34dragjO51t88);
            PointerInputChange pointerInputChange3 = pointerEvent.getChanges().get(0);
            if (PointerEvent_androidKt.m2044isShiftPressed5xRPYO0(pointerEvent.m2003getKeyboardModifiersk7X9c1A())) {
                long jM2071getPositionF1C5BW0 = pointerInputChange3.m2071getPositionF1C5BW0();
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) utVar.MediaBrowserCompatMediaItem;
                LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                if (legacyTextFieldState2 != null && legacyTextFieldState2.serializer() != null && textFieldSelectionManager.RemoteActionCompatParcelizer()) {
                    textFieldSelectionManager.ComponentActivity = -1;
                    FocusRequester focusRequester = textFieldSelectionManager.MediaSessionCompatQueueItem;
                    if (focusRequester != null) {
                        FocusRequester.m380requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                    }
                    utVar.RemoteActionCompatParcelizer(textFieldSelectionManager.MediaDescriptionCompat(), jM2071getPositionF1C5BW0, false, getNodeannotations.write);
                    try {
                        pointerInputChange3.consume();
                        long jM2068getIdJ3iCeTQ = pointerInputChange3.m2068getIdJ3iCeTQ();
                        InlineChildren inlineChildren = new InlineChildren(21, utVar);
                        modifierNode2.RemoteActionCompatParcelizer = awaitPointerEventScope2;
                        modifierNode2.IconCompatParcelizer = utVar;
                        modifierNode2.serializer = 1;
                        objM34dragjO51t88 = DragGestureDetectorKt.m34dragjO51t88(awaitPointerEventScope2, jM2068getIdJ3iCeTQ, inlineChildren, modifierNode2);
                        if (objM34dragjO51t88 != coroutineSingletons) {
                            utVar3 = utVar;
                            if (((Boolean) objM34dragjO51t88).booleanValue()) {
                                changes = awaitPointerEventScope2.getCurrentEvent().getChanges();
                                size = changes.size();
                                while (i3 < size) {
                                    pointerInputChange = changes.get(i3);
                                    if (PointerEventKt.changedToUp(pointerInputChange)) {
                                        pointerInputChange.consume();
                                    }
                                    i3++;
                                }
                            }
                            utVar3.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                        }
                        return coroutineSingletons;
                    } catch (Throwable th) {
                        th = th;
                        utVar3 = utVar;
                        utVar3.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                        throw th;
                    }
                }
            } else {
                int i4 = zpVar.write;
                if (i4 != 1) {
                    if (i4 != 2) {
                        seekanimationsanimation_core2 = getNodeannotations.serializer;
                    } else {
                        seekanimationsanimation_core2 = getNodeannotations.RatingCompat;
                    }
                    seekanimationsanimation_core = seekanimationsanimation_core2;
                } else {
                    seekanimationsanimation_core = seekanimationsanimation_core3;
                }
                long jM2071getPositionF1C5BW1 = pointerInputChange3.m2071getPositionF1C5BW0();
                int i5 = zpVar.write;
                TextFieldSelectionManager textFieldSelectionManager2 = (TextFieldSelectionManager) utVar.MediaBrowserCompatMediaItem;
                if (textFieldSelectionManager2.RemoteActionCompatParcelizer() && textFieldSelectionManager2.MediaDescriptionCompat().getText().length() != 0 && (legacyTextFieldState = textFieldSelectionManager2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) != null && legacyTextFieldState.serializer() != null) {
                    FocusRequester focusRequester2 = textFieldSelectionManager2.MediaSessionCompatQueueItem;
                    if (focusRequester2 != null) {
                        FocusRequester.m380requestFocus3ESFkO8$default(focusRequester2, 0, 1, null);
                    }
                    textFieldSelectionManager2.IconCompatParcelizer = jM2071getPositionF1C5BW1;
                    textFieldSelectionManager2.ComponentActivity = -1;
                    textFieldSelectionManager2.RemoteActionCompatParcelizer(true);
                    long jRemoteActionCompatParcelizer = utVar.RemoteActionCompatParcelizer(textFieldSelectionManager2.MediaDescriptionCompat(), textFieldSelectionManager2.IconCompatParcelizer, true, seekanimationsanimation_core);
                    if (i5 >= 2) {
                        utVar.write = true;
                        utVar.RatingCompat = TextRange.m3064boximpl(jRemoteActionCompatParcelizer);
                    }
                    try {
                        cancelPendingWebViewPause cancelpendingwebviewpause2 = new cancelPendingWebViewPause();
                        cancelpendingwebviewpause2.IconCompatParcelizer = !seekanimationsanimation_core.equals(seekanimationsanimation_core3);
                        long jM2068getIdJ3iCeTQ2 = pointerInputChange3.m2068getIdJ3iCeTQ();
                        UserJavascriptInterfaceBase$$ExternalSyntheticLambda12 userJavascriptInterfaceBase$$ExternalSyntheticLambda12 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(utVar, seekanimationsanimation_core, cancelpendingwebviewpause2, 10);
                        modifierNode2.RemoteActionCompatParcelizer = awaitPointerEventScope2;
                        modifierNode2.IconCompatParcelizer = utVar;
                        modifierNode2.read = cancelpendingwebviewpause2;
                        modifierNode2.serializer = 2;
                        Object objM34dragjO51t89 = DragGestureDetectorKt.m34dragjO51t88(awaitPointerEventScope2, jM2068getIdJ3iCeTQ2, userJavascriptInterfaceBase$$ExternalSyntheticLambda12, modifierNode2);
                        if (objM34dragjO51t89 != coroutineSingletons) {
                            obj = objM34dragjO51t89;
                            cancelpendingwebviewpause = cancelpendingwebviewpause2;
                            utVar2 = utVar;
                            if (((Boolean) obj).booleanValue()) {
                                changes2 = awaitPointerEventScope2.getCurrentEvent().getChanges();
                                size2 = changes2.size();
                                while (i3 < size2) {
                                    pointerInputChange2 = changes2.get(i3);
                                    if (PointerEventKt.changedToUp(pointerInputChange2)) {
                                        pointerInputChange2.consume();
                                    }
                                    i3++;
                                }
                            }
                            utVar2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                        }
                        return coroutineSingletons;
                    } catch (Throwable th2) {
                        th = th2;
                        utVar2 = utVar;
                        utVar2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                        throw th;
                    }
                }
            }
        } else if (i2 == 1) {
            utVar3 = modifierNode2.IconCompatParcelizer;
            awaitPointerEventScope2 = modifierNode2.RemoteActionCompatParcelizer;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(objM34dragjO51t88);
                if (((Boolean) objM34dragjO51t88).booleanValue()) {
                    changes = awaitPointerEventScope2.getCurrentEvent().getChanges();
                    size = changes.size();
                    while (i3 < size) {
                        pointerInputChange = changes.get(i3);
                        if (PointerEventKt.changedToUp(pointerInputChange)) {
                            pointerInputChange.consume();
                        }
                        i3++;
                    }
                }
                utVar3.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            } catch (Throwable th3) {
                th = th3;
                utVar3.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                throw th;
            }
        } else if (i2 == 2) {
            cancelPendingWebViewPause cancelpendingwebviewpause3 = modifierNode2.read;
            utVar2 = modifierNode2.IconCompatParcelizer;
            AwaitPointerEventScope awaitPointerEventScope3 = modifierNode2.RemoteActionCompatParcelizer;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(objM34dragjO51t88);
                cancelpendingwebviewpause = cancelpendingwebviewpause3;
                awaitPointerEventScope2 = awaitPointerEventScope3;
                obj = objM34dragjO51t88;
                if (((Boolean) obj).booleanValue() && cancelpendingwebviewpause.IconCompatParcelizer) {
                    changes2 = awaitPointerEventScope2.getCurrentEvent().getChanges();
                    size2 = changes2.size();
                    while (i3 < size2) {
                        pointerInputChange2 = changes2.get(i3);
                        if (PointerEventKt.changedToUp(pointerInputChange2)) {
                            pointerInputChange2.consume();
                        }
                        i3++;
                    }
                }
                utVar2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            } catch (Throwable th4) {
                th = th4;
                utVar2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                throw th;
            }
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        return createFromParcel.INSTANCE;
    }
}
