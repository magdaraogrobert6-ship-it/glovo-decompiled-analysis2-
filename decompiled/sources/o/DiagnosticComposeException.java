package o;

/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticComposeException extends androidx.compose.foundation.ClickableNode {
    public androidx.compose.ui.state.ToggleableState r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void RemoteActionCompatParcelizer(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, androidx.compose.ui.autofill.ContentDataType.Companion.getToggle());
        androidx.compose.ui.autofill.FillableData fillableDataCreateFromBoolean = androidx.compose.ui.autofill.FillableData_androidKt.createFromBoolean(androidx.compose.ui.autofill.FillableData.Companion, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != androidx.compose.ui.state.ToggleableState.Indeterminate);
        if (fillableDataCreateFromBoolean != null) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setFillableData(semanticsPropertyReceiver, fillableDataCreateFromBoolean);
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.onFillData$default(semanticsPropertyReceiver, null, new SnapshotStateListExternalSyntheticLambda1(semanticsPropertyReceiver, 1), 1, null);
    }

    public DiagnosticComposeException(androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, PagerMeasurePolicyKtrememberPagerMeasurePolicy11 pagerMeasurePolicyKtrememberPagerMeasurePolicy11, boolean z, boolean z2, String str, androidx.compose.ui.semantics.Role role, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        super(mutableInteractionSourceImpl, pagerMeasurePolicyKtrememberPagerMeasurePolicy11, z, z2, str, role, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }
}
