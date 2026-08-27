package o;

import com.google.re2j.Parser;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class setHttpsURLConnectionProvider implements decryptAndGetPasswordBWLJW6A {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final MutableStateFlow MediaBrowserCompatMediaItem;
    public final getQueryContext RemoteActionCompatParcelizer;
    public final Parser.Pair read;
    public final MutableStateFlow serializer;
    public final MutableStateFlow write;

    @Override // o.decryptAndGetPasswordBWLJW6A
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 17;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        MutableStateFlow mutableStateFlow = this.IconCompatParcelizer;
        int i5 = i3 + 17;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return mutableStateFlow;
    }

    public setHttpsURLConnectionProvider(Parser.Pair pair, ContextScope contextScope, getQueryContext getquerycontext) {
        this.read = pair;
        this.RemoteActionCompatParcelizer = getquerycontext;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(setAttributionHandler.IconCompatParcelizer);
        this.write = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.serializer = mutableStateFlow2;
        this.IconCompatParcelizer = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new NafathModalUiModelImpl$1(this, null, 15), 3);
    }
}
