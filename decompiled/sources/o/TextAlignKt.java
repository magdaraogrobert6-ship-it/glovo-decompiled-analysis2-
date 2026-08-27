package o;

import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class TextAlignKt implements getJustifye0LSkKk {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final SendTestPushUseCase MediaDescriptionCompat;
    public final StateFlow RemoteActionCompatParcelizer;
    public final accessgetParagraphcp read;
    public final getQueryContext serializer;
    public final StateFlow write = StateFlowKt.read(Boolean.TRUE);

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 25;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.write;
        int i5 = i3 + 7;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public TextAlignKt(getQueryContext getquerycontext, ContextScope contextScope, SendTestPushUseCase sendTestPushUseCase, accessgetParagraphcp accessgetparagraphcp) {
        this.serializer = getquerycontext;
        this.MediaDescriptionCompat = sendTestPushUseCase;
        this.read = accessgetparagraphcp;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(valueOfIgVj0fw.OVERVIEW);
        this.IconCompatParcelizer = mutableStateFlow;
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new SwitcherUiModelImpl$1(this, (ShortNewsContentCardView) null, 0), 3);
    }
}
