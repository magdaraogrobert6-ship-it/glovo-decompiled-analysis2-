package androidx.compose.ui.layout;

import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import o.PopulateViewStructure_androidKtpopulate7;

/* JADX INFO: loaded from: classes4.dex */
public final class LayoutBoundsHolder {
    public static final int $stable = 0;
    private final PopulateViewStructure_androidKtpopulate7 bounds$delegate = CompositionKt.RemoteActionCompatParcelizer(null);

    public final RelativeLayoutBounds getBounds() {
        return (RelativeLayoutBounds) this.bounds$delegate.getValue();
    }

    public final void setBounds$ui(RelativeLayoutBounds relativeLayoutBounds) {
        this.bounds$delegate.setValue(relativeLayoutBounds);
    }
}
