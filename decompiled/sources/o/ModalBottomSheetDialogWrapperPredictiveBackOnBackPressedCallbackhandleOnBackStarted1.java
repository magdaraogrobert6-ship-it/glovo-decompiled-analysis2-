package o;

/* JADX INFO: loaded from: classes.dex */
public final class ModalBottomSheetDialogWrapperPredictiveBackOnBackPressedCallbackhandleOnBackStarted1 extends androidx.compose.ui.node.ModifierNodeElement<ModalBottomSheetKtModalBottomSheet4> {
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        ModalBottomSheetKtModalBottomSheet4 modalBottomSheetKtModalBottomSheet4 = new ModalBottomSheetKtModalBottomSheet4();
        modalBottomSheetKtModalBottomSheet4.RemoteActionCompatParcelizer = this.write;
        return modalBottomSheetKtModalBottomSheet4;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.write.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        this.serializer.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        ModalBottomSheetKtModalBottomSheet4 modalBottomSheetKtModalBottomSheet4 = (ModalBottomSheetKtModalBottomSheet4) node;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = modalBottomSheetKtModalBottomSheet4.RemoteActionCompatParcelizer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = this.write;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm2 != r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            modalBottomSheetKtModalBottomSheet4.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        }
    }

    public ModalBottomSheetDialogWrapperPredictiveBackOnBackPressedCallbackhandleOnBackStarted1(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ModalBottomSheetDialogWrapperPredictiveBackOnBackPressedCallbackhandleOnBackStarted1) && ((ModalBottomSheetDialogWrapperPredictiveBackOnBackPressedCallbackhandleOnBackStarted1) obj).write == this.write;
    }
}
