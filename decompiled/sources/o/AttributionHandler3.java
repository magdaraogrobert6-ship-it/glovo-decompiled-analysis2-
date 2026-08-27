package o;

import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.startworking.domain.stopworking.StopWorkingUseCaseImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class AttributionHandler3 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final getQueryContext IconCompatParcelizer;
    public final StateFlow MediaMetadataCompat;
    public final StopWorkingUseCaseImpl MediaSessionCompatQueueItem;
    public final restoreChildFragmentState RatingCompat;
    public final setTransactionSuccessful RemoteActionCompatParcelizer;
    public final NetworkErrorMapperImpl read;
    public final MutableStateFlow serializer;
    public final ContextScope write;

    public AttributionHandler3(setTransactionSuccessful settransactionsuccessful, StopWorkingUseCaseImpl stopWorkingUseCaseImpl, restoreChildFragmentState restorechildfragmentstate, NetworkErrorMapperImpl networkErrorMapperImpl, getQueryContext getquerycontext, ContextScope contextScope) {
        this.RemoteActionCompatParcelizer = settransactionsuccessful;
        this.MediaSessionCompatQueueItem = stopWorkingUseCaseImpl;
        this.RatingCompat = restorechildfragmentstate;
        this.read = networkErrorMapperImpl;
        this.IconCompatParcelizer = getquerycontext;
        this.write = contextScope;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(getOnAttributionReadListener.serializer);
        this.serializer = mutableStateFlow;
        this.MediaMetadataCompat = mutableStateFlow;
    }

    public final void serializer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 31;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer.IconCompatParcelizer(getOnAttributionReadListener.serializer);
            throw null;
        }
        this.serializer.IconCompatParcelizer(getOnAttributionReadListener.serializer);
        int i3 = MediaBrowserCompatMediaItem + 97;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }
}
