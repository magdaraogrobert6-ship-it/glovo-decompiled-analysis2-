package o;

import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class getCharacterRightBounds implements set_nativeCanvasui_text {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final getQueryContext IconCompatParcelizer;
    public final StateFlow RemoteActionCompatParcelizer;
    public final getRangeForRect read;
    public final getRangeForRect serializer;
    public final MutableStateFlow write;

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 55;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        StateFlow stateFlow = this.RemoteActionCompatParcelizer;
        int i4 = i2 + 13;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return stateFlow;
        }
        throw null;
    }

    public getCharacterRightBounds(getRangeForRect getrangeforrect, getRangeForRect getrangeforrect2, getQueryContext getquerycontext, ContextScope contextScope) {
        this.read = getrangeforrect;
        this.serializer = getrangeforrect2;
        this.IconCompatParcelizer = getquerycontext;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.write = mutableStateFlow;
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new ClearDataUseCaseImpl$invoke$2(this, (ShortNewsContentCardView) null, 24), 3);
    }
}
