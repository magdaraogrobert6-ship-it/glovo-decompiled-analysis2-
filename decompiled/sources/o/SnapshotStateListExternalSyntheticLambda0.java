package o;

import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class SnapshotStateListExternalSyntheticLambda0 extends androidx.compose.foundation.ClickableNode {
    public final CoroutineLiveData$$ExternalSyntheticLambda0 r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public boolean r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void RemoteActionCompatParcelizer(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, androidx.compose.ui.state.ToggleableStateKt.ToggleableState(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0));
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, androidx.compose.ui.autofill.ContentDataType.Companion.getToggle());
        androidx.compose.ui.autofill.FillableData fillableDataCreateFromBoolean = androidx.compose.ui.autofill.FillableData_androidKt.createFromBoolean(androidx.compose.ui.autofill.FillableData.Companion, this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
        if (fillableDataCreateFromBoolean != null) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setFillableData(semanticsPropertyReceiver, fillableDataCreateFromBoolean);
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.onFillData$default(semanticsPropertyReceiver, null, new SnapshotStateListExternalSyntheticLambda1(semanticsPropertyReceiver, 0), 1, null);
    }

    public SnapshotStateListExternalSyntheticLambda0(boolean z, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z2, androidx.compose.ui.semantics.Role role, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(mutableInteractionSourceImpl, null, false, z2, null, role, new SubList(0, z, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = z;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new CoroutineLiveData$$ExternalSyntheticLambda0(9, this);
    }
}
