package o;

import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class valueOfE8nx0Ws implements TextDirectionKt {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final StateFlow IconCompatParcelizer;
    public final SendTestPushUseCase MediaDescriptionCompat;
    public final StateFlow MediaSessionCompatQueueItem;
    public final getQueryContext RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final MutableStateFlow serializer;
    public final accessgetParagraphcp write;

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.IconCompatParcelizer;
        int i5 = i3 + 121;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return stateFlow;
        }
        throw null;
    }

    public valueOfE8nx0Ws(transferSessionPackageI transfersessionpackagei, getQueryContext getquerycontext, ContextScope contextScope, SendTestPushUseCase sendTestPushUseCase, accessgetParagraphcp accessgetparagraphcp) {
        this.RemoteActionCompatParcelizer = getquerycontext;
        this.MediaDescriptionCompat = sendTestPushUseCase;
        this.write = accessgetparagraphcp;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.read = mutableStateFlow;
        this.IconCompatParcelizer = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(getRtls_7Xco.DISABLED);
        this.serializer = mutableStateFlow2;
        this.MediaSessionCompatQueueItem = mutableStateFlow2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (((FirebaseRemoteConfigImpl) transfersessionpackagei).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus()) {
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new SwitcherUiModelImpl$1(this, shortNewsContentCardView, 14), 3);
            int i = MediaMetadataCompat + 111;
            RatingCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        int i4 = MediaMetadataCompat + 41;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }
}
