package o;

import androidx.compose.runtime.Recomposer$join$2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class setReenterTransition {
    public final Flow write;

    public setReenterTransition(setHasOptionsMenu sethasoptionsmenu, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.write = FlowKt.RemoteActionCompatParcelizer(FlowKt.write(new Recomposer$join$2(2, 3, null), sethasoptionsmenu.IconCompatParcelizer), prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer);
    }
}
