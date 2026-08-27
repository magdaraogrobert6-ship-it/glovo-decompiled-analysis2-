package o;

import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.lifecycle.BlockRunner$maybeRun$1;
import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import java.util.concurrent.CancellationException;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: classes.dex */
public final class getNormalNSsRyOo implements androidx.compose.ui.text.input.PlatformTextInputService {
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU IconCompatParcelizer;
    public SharedFlowImpl RemoteActionCompatParcelizer;
    public KeepScreenOnNode serializer;
    public getKey2 write;

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void hideSoftwareKeyboard() {
        SoftwareKeyboardController softwareKeyboardController;
        KeepScreenOnNode keepScreenOnNode = this.serializer;
        if (keepScreenOnNode == null || (softwareKeyboardController = (SoftwareKeyboardController) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf((setFrameRate) keepScreenOnNode, androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController())) == null) {
            return;
        }
        softwareKeyboardController.hide();
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void showSoftwareKeyboard() {
        SoftwareKeyboardController softwareKeyboardController;
        KeepScreenOnNode keepScreenOnNode = this.serializer;
        if (keepScreenOnNode == null || (softwareKeyboardController = (SoftwareKeyboardController) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf((setFrameRate) keepScreenOnNode, androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController())) == null) {
            return;
        }
        softwareKeyboardController.show();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004c  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0152, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r23.m3329getCompositionMzsxiRA(), r24.m3329getCompositionMzsxiRA()}, o.getCieXyz.write())).booleanValue() == false) goto L41;
     */
    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateState(androidx.compose.ui.text.input.TextFieldValue r23, androidx.compose.ui.text.input.TextFieldValue r24) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getNormalNSsRyOo.updateState(androidx.compose.ui.text.input.TextFieldValue, androidx.compose.ui.text.input.TextFieldValue):void");
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void updateTextLayoutResult(androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.ui.text.TextLayoutResult textLayoutResult, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
        getKey2 getkey2 = this.write;
        if (getkey2 != null) {
            KeyedComposedModifier1 keyedComposedModifier1 = getkey2.write;
            synchronized (keyedComposedModifier1.ParcelableVolumeInfo) {
                keyedComposedModifier1.ResultReceiver = textFieldValue;
                keyedComposedModifier1.PlaybackStateCompatCustomAction = offsetMapping;
                keyedComposedModifier1.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = textLayoutResult;
                keyedComposedModifier1.MediaDescriptionCompat = rect;
                keyedComposedModifier1.IconCompatParcelizer = rect2;
                if (keyedComposedModifier1.write || keyedComposedModifier1.MediaSessionCompatResultReceiverWrapper) {
                    keyedComposedModifier1.serializer();
                }
            }
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void stopInput() {
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.IconCompatParcelizer;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        this.IconCompatParcelizer = null;
        MutableSharedFlow mutableSharedFlowWrite = write();
        if (mutableSharedFlowWrite != null) {
            ((SharedFlowImpl) mutableSharedFlowWrite).IconCompatParcelizer();
        }
    }

    public final MutableSharedFlow write() {
        SharedFlowImpl sharedFlowImpl = this.RemoteActionCompatParcelizer;
        if (sharedFlowImpl != null) {
            return sharedFlowImpl;
        }
        if (!FrameRateKt.RemoteActionCompatParcelizer) {
            return null;
        }
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(1, 0, IInAppMessageViewWrapper.DROP_LATEST, 2);
        this.RemoteActionCompatParcelizer = sharedFlowImplRemoteActionCompatParcelizer;
        return sharedFlowImplRemoteActionCompatParcelizer;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void notifyFocusedRect(androidx.compose.ui.geometry.Rect rect) {
        android.graphics.Rect rect2;
        getKey2 getkey2 = this.write;
        if (getkey2 != null) {
            getkey2.IconCompatParcelizer = new android.graphics.Rect(MathKt.write(rect.getLeft()), MathKt.write(rect.getTop()), MathKt.write(rect.getRight()), MathKt.write(rect.getBottom()));
            if (!getkey2.RemoteActionCompatParcelizer.isEmpty() || (rect2 = getkey2.IconCompatParcelizer) == null) {
                return;
            }
            getkey2.PlaybackStateCompatCustomAction.requestRectangleOnScreen(new android.graphics.Rect(rect2));
        }
    }

    public final void IconCompatParcelizer(setFrameRate setframerate) {
        if (this.serializer != setframerate) {
            TriStateCheckbox.RemoteActionCompatParcelizer("Expected textInputModifierNode to be " + setframerate + " but was " + this.serializer);
        }
        this.serializer = null;
    }

    public final void read(toAndroidVertexModeJOOmi9M toandroidvertexmodejoomi9m) {
        KeepScreenOnNode keepScreenOnNode = this.serializer;
        if (keepScreenOnNode == null) {
            return;
        }
        NavHostKt$NavHost$29$1 navHostKt$NavHost$29$1 = new NavHostKt$NavHost$29$1(toandroidvertexmodejoomi9m, this, keepScreenOnNode, null, 5);
        setFrameRate setframerate = (setFrameRate) keepScreenOnNode;
        this.IconCompatParcelizer = setframerate.isAttached() ? BuildersKt.RemoteActionCompatParcelizer(setframerate.getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new BlockRunner$maybeRun$1(setframerate, navHostKt$NavHost$29$1, null, 16), 1) : null;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void startInput(androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.ImeOptions imeOptions, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        read(new toAndroidVertexModeJOOmi9M(textFieldValue, this, imeOptions, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, 4));
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void startInput() {
        read(null);
    }
}
