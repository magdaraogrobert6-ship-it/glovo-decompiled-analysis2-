package o;

import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class getLastLineBottomEVpEnUU implements getNoneEVpEnUU {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final SendTestPushUseCase RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final StateFlow serializer;
    public final MutableStateFlow write;

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        StateFlow stateFlow;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 51;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            stateFlow = this.read;
            int i4 = 70 / 0;
        } else {
            stateFlow = this.read;
        }
        int i5 = i2 + 9;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getLastLineBottomEVpEnUU(ContextScope contextScope, SendTestPushUseCase sendTestPushUseCase) {
        this.RemoteActionCompatParcelizer = sendTestPushUseCase;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.IconCompatParcelizer = mutableStateFlow;
        this.read = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(getCentere0LSkKk.write);
        this.write = mutableStateFlow2;
        this.serializer = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new SwitcherUiModelImpl$1(this, (ShortNewsContentCardView) null, 12), 3);
    }
}
