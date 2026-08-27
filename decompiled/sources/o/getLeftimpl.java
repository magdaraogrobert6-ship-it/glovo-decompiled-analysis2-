package o;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.EndCompoundLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class getLeftimpl extends updateModifier {
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getLeftimpl(EndCompoundLayout endCompoundLayout, int i) {
        super(endCompoundLayout);
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.updateModifier
    public void setUp() {
        if (this.RemoteActionCompatParcelizer != 1) {
            return;
        }
        EndCompoundLayout endCompoundLayout = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        endCompoundLayout.MediaSessionCompatQueueItem = null;
        CheckableImageButton checkableImageButton = endCompoundLayout.ParcelableVolumeInfo;
        checkableImageButton.setOnLongClickListener(null);
        getFeatureKeys.RemoteActionCompatParcelizer(checkableImageButton, null);
    }
}
