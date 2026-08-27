package o;

import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class getOffsetX {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final unpackInt1 IconCompatParcelizer;
    public final getDEFAULT_TEXT_DIRECTION_HEURISTICui_text MediaBrowserCompatMediaItem;
    public final DeliveryAcceptanceLogger MediaMetadataCompat;
    public final StateFlow RatingCompat;
    public final getSecondaryUpstream RemoteActionCompatParcelizer;
    public final ContextScope read;
    public final AndroidFontResolveInterceptor serializer;
    public final MutableStateFlow write;

    public getOffsetX(AndroidFontResolveInterceptor androidFontResolveInterceptor, unpackInt2 unpackint2, unpackInt1 unpackint1, getSecondaryUpstream getsecondaryupstream, getDEFAULT_TEXT_DIRECTION_HEURISTICui_text getdefault_text_direction_heuristicui_text, DeliveryAcceptanceLogger deliveryAcceptanceLogger, ContextScope contextScope) {
        androidFontResolveInterceptor.getClass();
        unpackint2.getClass();
        unpackint1.getClass();
        getsecondaryupstream.getClass();
        getdefault_text_direction_heuristicui_text.getClass();
        deliveryAcceptanceLogger.getClass();
        this.serializer = androidFontResolveInterceptor;
        this.IconCompatParcelizer = unpackint1;
        this.RemoteActionCompatParcelizer = getsecondaryupstream;
        this.MediaBrowserCompatMediaItem = getdefault_text_direction_heuristicui_text;
        this.MediaMetadataCompat = deliveryAcceptanceLogger;
        this.read = contextScope;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new loadAsync(false, false, false));
        this.write = mutableStateFlow;
        this.RatingCompat = mutableStateFlow;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (((FirebaseRemoteConfigImpl) unpackint2.RemoteActionCompatParcelizer).MediaDescriptionCompat()) {
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new ClearDataUseCaseImpl$invoke$2(this, shortNewsContentCardView, 27), 3);
            int i = MediaSessionCompatQueueItem + 29;
            MediaDescriptionCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        }
        int i3 = MediaSessionCompatQueueItem + 67;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
