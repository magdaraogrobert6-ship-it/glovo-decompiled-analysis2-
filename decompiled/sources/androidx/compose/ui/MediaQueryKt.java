package androidx.compose.ui;

import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.PopulateViewStructure_androidKtpopulate7;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getCreditCardNumber;
import o.getNewPassword;
import o.getPersonFullName;
import o.getPostalCode;
import o.onViewAttachedToWindow;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes.dex */
public final class MediaQueryKt {
    private static final ProvidableCompositionLocal LocalUiMediaScope = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.MediaQueryKt$LocalUiMediaScope$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final UiMediaScope invoke() {
            throw new IllegalStateException("CompositionLocal LocalUiMediaScope not present");
        }
    });

    public static final ProvidableCompositionLocal getLocalUiMediaScope() {
        return LocalUiMediaScope;
    }

    @ExperimentalMediaQueryApi
    public static /* synthetic */ void getLocalUiMediaScope$annotations() {
    }

    @ExperimentalMediaQueryApi
    public static final onViewAttachedToWindow derivedMediaQuery(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        final UiMediaScope uiMediaScope = (UiMediaScope) getpostalcode.write((getNewPassword) LocalUiMediaScope);
        final PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode);
        boolean z = getpostalcode.read(uiMediaScope);
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if (z || objComponentActivity == getCreditCardExpirationMonth.write) {
            objComponentActivity = CompositionKt.serializer(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.MediaQueryKt$derivedMediaQuery$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Boolean invoke() {
                    return (Boolean) MediaQueryKt.derivedMediaQuery$lambda$0(populateViewStructure_androidKtpopulate7Serializer).invoke(uiMediaScope);
                }
            });
            getpostalcode.write(objComponentActivity);
        }
        return (onViewAttachedToWindow) objComponentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM derivedMediaQuery$lambda$0(onViewAttachedToWindow onviewattachedtowindow) {
        return (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) onviewattachedtowindow.getValue();
    }

    @ExperimentalMediaQueryApi
    public static final boolean mediaQuery(getCreditCardNumber getcreditcardnumber, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        ProvidableCompositionLocal localUiMediaScope = getLocalUiMediaScope();
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1 = (DragAndDropNodestartDragAndDropTransfer1) getcreditcardnumber;
        dragAndDropNodestartDragAndDropTransfer1.getClass();
        return ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getPersonFullName.write(dragAndDropNodestartDragAndDropTransfer1, localUiMediaScope))).booleanValue();
    }

    @ExperimentalMediaQueryApi
    public static final boolean mediaQuery(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        return ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((getPostalCode) getbirthdatefull).write((getNewPassword) LocalUiMediaScope))).booleanValue();
    }

    @ExperimentalMediaQueryApi
    public static final boolean mediaQuery(CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(CompositionLocalConsumerModifierNodeKt.currentValueOf(compositionLocalConsumerModifierNode, getLocalUiMediaScope()))).booleanValue();
    }
}
