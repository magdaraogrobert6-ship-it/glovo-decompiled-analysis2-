package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getCieXyz;
import o.onCreateVirtualViewTranslationRequests;
import o.onItemDismisslambda0;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
@onItemDismisslambda0
public final class TextInputServiceAndroid implements PlatformTextInputService {
    public static final int $stable = 8;
    private final onViewDetachedFromWindowlambda1 baseInputConnection$delegate;
    private final CursorAnchorInfoController cursorAnchorInfoController;
    private boolean editorHasFocus;
    private Rect focusedRect;
    private Runnable frameCallback;
    private List<WeakReference<RecordingInputConnection>> ics;
    private ImeOptions imeOptions;
    private final Executor inputCommandProcessorExecutor;
    private final InputMethodManager inputMethodManager;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onEditCommand;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onImeActionPerformed;
    private TextFieldValue state;
    private final onCreateVirtualViewTranslationRequests textInputCommandQueue;
    private final View view;

    public enum TextInputCommand {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard;

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendInputCommand$lambda$0(TextInputServiceAndroid textInputServiceAndroid) {
        textInputServiceAndroid.frameCallback = null;
        textInputServiceAndroid.processInputCommands();
    }

    public final TextFieldValue getState$ui() {
        return this.state;
    }

    public final View getView() {
        return this.view;
    }

    public final boolean isEditorFocused() {
        return this.editorHasFocus;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        this.editorHasFocus = true;
        this.state = textFieldValue;
        this.imeOptions = imeOptions;
        this.onEditCommand = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.onImeActionPerformed = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        sendInputCommand(TextInputCommand.StartInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void stopInput() {
        this.editorHasFocus = false;
        this.onEditCommand = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.1
            public final void invoke(List<? extends EditCommand> list) {
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends EditCommand>) obj);
                return createFromParcel.INSTANCE;
            }
        };
        this.onImeActionPerformed = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.2
            /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m3332invokeKlQnJC8(int i) {
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* synthetic */ Object invoke(Object obj) {
                m3332invokeKlQnJC8(((ImeAction) obj).m3251unboximpl());
                return createFromParcel.INSTANCE;
            }
        };
        this.focusedRect = null;
        sendInputCommand(TextInputCommand.StopInput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    private final void processInputCommands() {
        View viewFindFocus;
        if (!this.view.isFocused() && (viewFindFocus = this.view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
            this.textInputCommandQueue.RemoteActionCompatParcelizer();
            return;
        }
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        createInAppMessageEventSubscriber createinappmessageeventsubscriber2 = new createInAppMessageEventSubscriber();
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.textInputCommandQueue;
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            processInputCommands$applyToState((TextInputCommand) objArr[i2], createinappmessageeventsubscriber, createinappmessageeventsubscriber2);
        }
        this.textInputCommandQueue.RemoteActionCompatParcelizer();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{createinappmessageeventsubscriber.IconCompatParcelizer, Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
            restartInputImmediately();
        }
        Boolean bool = (Boolean) createinappmessageeventsubscriber2.IconCompatParcelizer;
        if (bool != null) {
            setKeyboardVisibleImmediately(bool.booleanValue());
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{createinappmessageeventsubscriber.IconCompatParcelizer, Boolean.FALSE}, getCieXyz.write())).booleanValue()) {
            restartInputImmediately();
        }
    }

    private static final void processInputCommands$applyToState(TextInputCommand textInputCommand, createInAppMessageEventSubscriber createinappmessageeventsubscriber, createInAppMessageEventSubscriber createinappmessageeventsubscriber2) {
        int i = WhenMappings.$EnumSwitchMapping$0[textInputCommand.ordinal()];
        if (i == 1) {
            Boolean bool = Boolean.TRUE;
            createinappmessageeventsubscriber.IconCompatParcelizer = bool;
            createinappmessageeventsubscriber2.IconCompatParcelizer = bool;
        } else if (i == 2) {
            Boolean bool2 = Boolean.FALSE;
            createinappmessageeventsubscriber.IconCompatParcelizer = bool2;
            createinappmessageeventsubscriber2.IconCompatParcelizer = bool2;
        } else {
            if (i != 3 && i != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{createinappmessageeventsubscriber.IconCompatParcelizer, Boolean.FALSE}, getCieXyz.write())).booleanValue()) {
                return;
            }
            createinappmessageeventsubscriber2.IconCompatParcelizer = Boolean.valueOf(textInputCommand == TextInputCommand.ShowKeyboard);
        }
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput();
    }

    private final void sendInputCommand(TextInputCommand textInputCommand) {
        this.textInputCommandQueue.IconCompatParcelizer(textInputCommand);
        if (this.frameCallback == null) {
            RxWorker$1$$ExternalSyntheticLambda0 rxWorker$1$$ExternalSyntheticLambda0 = new RxWorker$1$$ExternalSyntheticLambda0(3, this);
            this.inputCommandProcessorExecutor.execute(rxWorker$1$$ExternalSyntheticLambda0);
            this.frameCallback = rxWorker$1$$ExternalSyntheticLambda0;
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void hideSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.HideKeyboard);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    @onItemDismisslambda0
    public void notifyFocusedRect(androidx.compose.ui.geometry.Rect rect) {
        Rect rect2;
        this.focusedRect = new Rect(MathKt.write(rect.getLeft()), MathKt.write(rect.getTop()), MathKt.write(rect.getRight()), MathKt.write(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void showSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.ShowKeyboard);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0048  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0137, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.m3329getCompositionMzsxiRA(), r22.m3329getCompositionMzsxiRA()}, o.getCieXyz.write())).booleanValue() == false) goto L34;
     */
    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateState(androidx.compose.ui.text.input.TextFieldValue r21, androidx.compose.ui.text.input.TextFieldValue r22) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.TextInputServiceAndroid.updateState(androidx.compose.ui.text.input.TextFieldValue, androidx.compose.ui.text.input.TextFieldValue):void");
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
        this.cursorAnchorInfoController.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, r8lambdaunavo3sxub_pc9xroryotnrlvsm, rect, rect2);
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextInputCommand.values().length];
            try {
                iArr[TextInputCommand.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextInputCommand.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextInputCommand.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextInputCommand.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TextInputServiceAndroid(View view, MatrixPositionCalculator matrixPositionCalculator, InputMethodManager inputMethodManager, Executor executor) {
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.inputCommandProcessorExecutor = executor;
        this.onEditCommand = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1
            public final void invoke(List<? extends EditCommand> list) {
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends EditCommand>) obj);
                return createFromParcel.INSTANCE;
            }
        };
        this.onImeActionPerformed = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1
            /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m3331invokeKlQnJC8(int i) {
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* synthetic */ Object invoke(Object obj) {
                m3331invokeKlQnJC8(((ImeAction) obj).m3251unboximpl());
                return createFromParcel.INSTANCE;
            }
        };
        this.state = new TextFieldValue("", TextRange.Companion.m3081getZerod9O1mEE(), (TextRange) null, 4, (DefaultConstructorMarker) null);
        this.imeOptions = ImeOptions.Companion.getDefault();
        this.ics = new ArrayList();
        this.baseInputConnection$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final BaseInputConnection invoke() {
                return new BaseInputConnection(this.this$0.getView(), false);
            }

            {
                super(0);
            }
        });
        this.cursorAnchorInfoController = new CursorAnchorInfoController(matrixPositionCalculator, inputMethodManager);
        this.textInputCommandQueue = new onCreateVirtualViewTranslationRequests(new TextInputCommand[16]);
    }

    private final void setKeyboardVisibleImmediately(boolean z) {
        InputMethodManager inputMethodManager = this.inputMethodManager;
        if (z) {
            inputMethodManager.showSoftInput();
        } else {
            inputMethodManager.hideSoftInput();
        }
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        if (!this.editorHasFocus) {
            return null;
        }
        TextInputServiceAndroid_androidKt.update(editorInfo, this.imeOptions, this.state);
        TextInputServiceAndroid_androidKt.updateWithEmojiCompat(editorInfo);
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.state, new InputEventCallback2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.createInputConnection.1
            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onConnectionClosed(RecordingInputConnection recordingInputConnection2) {
                int size = TextInputServiceAndroid.this.ics.size();
                for (int i = 0; i < size; i++) {
                    Object[] objArr = {((WeakReference) TextInputServiceAndroid.this.ics.get(i)).get(), recordingInputConnection2};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                        TextInputServiceAndroid.this.ics.remove(i);
                        return;
                    }
                }
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onEditCommands(List<? extends EditCommand> list) {
                TextInputServiceAndroid.this.onEditCommand.invoke(list);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            /* JADX INFO: renamed from: onImeAction-KlQnJC8 */
            public void mo3280onImeActionKlQnJC8(int i) {
                TextInputServiceAndroid.this.onImeActionPerformed.invoke(ImeAction.m3245boximpl(i));
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onKeyEvent(KeyEvent keyEvent) {
                TextInputServiceAndroid.this.getBaseInputConnection().sendKeyEvent(keyEvent);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onRequestCursorAnchorInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
                TextInputServiceAndroid.this.cursorAnchorInfoController.requestUpdate(z, z2, z3, z4, z5, z6);
            }
        }, this.imeOptions.getAutoCorrect());
        this.ics.add(new WeakReference<>(recordingInputConnection));
        return recordingInputConnection;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput() {
        sendInputCommand(TextInputCommand.StartInput);
    }

    public /* synthetic */ TextInputServiceAndroid(View view, MatrixPositionCalculator matrixPositionCalculator, InputMethodManager inputMethodManager, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, matrixPositionCalculator, inputMethodManager, (i & 8) != 0 ? TextInputServiceAndroid_androidKt.asExecutor(Choreographer.getInstance()) : executor);
    }

    public TextInputServiceAndroid(View view, MatrixPositionCalculator matrixPositionCalculator) {
        this(view, matrixPositionCalculator, new InputMethodManagerImpl(view), null, 8, null);
    }
}
