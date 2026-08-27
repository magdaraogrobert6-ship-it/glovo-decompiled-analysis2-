package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SnapshotStateListExternalSyntheticLambda1 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ androidx.compose.ui.semantics.SemanticsPropertyReceiver IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ SnapshotStateListExternalSyntheticLambda1(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = semanticsPropertyReceiver;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.serializer;
        androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver = this.IconCompatParcelizer;
        androidx.compose.ui.autofill.FillableData fillableData = (androidx.compose.ui.autofill.FillableData) obj;
        boolean z = true;
        if (i != 0) {
            Boolean booleanValue = fillableData.getBooleanValue();
            if (booleanValue != null) {
                androidx.compose.ui.semantics.SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, androidx.compose.ui.state.ToggleableStateKt.ToggleableState(booleanValue.booleanValue()));
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        Boolean booleanValue2 = fillableData.getBooleanValue();
        if (booleanValue2 != null) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, androidx.compose.ui.state.ToggleableStateKt.ToggleableState(booleanValue2.booleanValue()));
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
