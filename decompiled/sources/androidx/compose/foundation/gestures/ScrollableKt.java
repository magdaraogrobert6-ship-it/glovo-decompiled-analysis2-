package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.BiasAbsoluteAlignment;
import o.SelectionGestures_androidKt;
import o.SelectionHandleIcon;
import o.accessawaitDown;
import o.accesstouchSelectionSubsequentPress;
import o.applyMeasureResultfoundation;
import o.cancelPendingWebViewPauselambda0;
import o.getViewportSizeYbymL2g;
import o.mouseSelection;
import o.touchSelectionFirstPress;

/* JADX INFO: loaded from: classes.dex */
public abstract class ScrollableKt {
    public static final getViewportSizeYbymL2g write = new getViewportSizeYbymL2g(13);
    public static final accessawaitDown IconCompatParcelizer = new accessawaitDown();
    public static final mouseSelection serializer = new mouseSelection();
    public static final touchSelectionFirstPress RemoteActionCompatParcelizer = new touchSelectionFirstPress();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: access$semanticsScrollBy-d-4ec7I, reason: not valid java name */
    public static final Object m53access$semanticsScrollByd4ec7I(ScrollingLogic scrollingLogic, long j, ContinuationImpl continuationImpl) {
        accesstouchSelectionSubsequentPress accesstouchselectionsubsequentpress;
        ScrollingLogic scrollingLogic2;
        cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0;
        if (continuationImpl instanceof accesstouchSelectionSubsequentPress) {
            accesstouchselectionsubsequentpress = (accesstouchSelectionSubsequentPress) continuationImpl;
            int i = accesstouchselectionsubsequentpress.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                accesstouchselectionsubsequentpress.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                accesstouchselectionsubsequentpress = new accesstouchSelectionSubsequentPress(continuationImpl);
            }
        } else {
            accesstouchselectionsubsequentpress = new accesstouchSelectionSubsequentPress(continuationImpl);
        }
        Object obj = accesstouchselectionsubsequentpress.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = accesstouchselectionsubsequentpress.IconCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda1 = new cancelPendingWebViewPauselambda0(0);
            applyMeasureResultfoundation applymeasureresultfoundation = applyMeasureResultfoundation.Default;
            ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(scrollingLogic, j, cancelpendingwebviewpauselambda1, null);
            accesstouchselectionsubsequentpress.write = scrollingLogic;
            accesstouchselectionsubsequentpress.RemoteActionCompatParcelizer = cancelpendingwebviewpauselambda1;
            accesstouchselectionsubsequentpress.IconCompatParcelizer = 1;
            if (scrollingLogic.scroll(applymeasureresultfoundation, scrollableKt$semanticsScrollBy$2, accesstouchselectionsubsequentpress) == coroutineSingletons) {
                return coroutineSingletons;
            }
            scrollingLogic2 = scrollingLogic;
            cancelpendingwebviewpauselambda0 = cancelpendingwebviewpauselambda1;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cancelpendingwebviewpauselambda0 = accesstouchselectionsubsequentpress.RemoteActionCompatParcelizer;
            scrollingLogic2 = accesstouchselectionsubsequentpress.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return Offset.m466boximpl(scrollingLogic2.m59toOffsettuRUvjQ(cancelpendingwebviewpauselambda0.write));
    }

    public static Modifier RemoteActionCompatParcelizer(Modifier.Companion companion, BiasAbsoluteAlignment biasAbsoluteAlignment, SelectionHandleIcon selectionHandleIcon, boolean z, boolean z2, MutableInteractionSourceImpl mutableInteractionSourceImpl) {
        return companion.then(new SelectionGestures_androidKt(biasAbsoluteAlignment, selectionHandleIcon, z, z2, mutableInteractionSourceImpl));
    }
}
