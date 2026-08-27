package o;

import androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes.dex */
public final class notifyFocusedRectfoundation implements constructorimpl {
    public final mouseSelection IconCompatParcelizer;
    public accessanimateWithTarget read;

    public notifyFocusedRectfoundation(accessanimateWithTarget accessanimatewithtarget) {
        mouseSelection mouseselection = androidx.compose.foundation.gestures.ScrollableKt.serializer;
        this.read = accessanimatewithtarget;
        this.IconCompatParcelizer = mouseselection;
    }

    @Override // o.constructorimpl
    public final Object performFling(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, float f, ShortNewsContentCardView shortNewsContentCardView) {
        return BuildersKt.withContext(this.IconCompatParcelizer, new DefaultFlingBehavior$performFling$2(f, this, platformSelectionBehaviorsImpl, null), shortNewsContentCardView);
    }
}
