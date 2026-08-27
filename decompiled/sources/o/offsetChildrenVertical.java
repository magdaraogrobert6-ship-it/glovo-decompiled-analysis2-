package o;

import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import com.sentiance.core.model.events.N$b;
import io.grpc.internal.SharedResourcePool;
import java.time.Clock;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class offsetChildrenVertical extends androidx.lifecycle.ViewModel {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final a9 IconCompatParcelizer;
    public final MutableStateFlow MediaBrowserCompatMediaItem;
    public final N$b MediaDescriptionCompat;
    public final SharedResourcePool MediaMetadataCompat;
    public Long MediaSessionCompatQueueItem;
    public final StateFlow PlaybackStateCompat;
    public final SignInDataStore RatingCompat;
    public final Clock RemoteActionCompatParcelizer;
    public final N$b read;
    public final MutableStateFlow serializer;
    public final MutableStateFlow write;

    public final SharedResourcePool RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 1;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        PlaybackStateCompatCustomAction = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SharedResourcePool sharedResourcePool = this.MediaMetadataCompat;
        int i4 = i3 + 123;
        MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return sharedResourcePool;
    }

    public offsetChildrenVertical(SignInDataStore signInDataStore, SharedResourcePool sharedResourcePool, N$b n$b, a9 a9Var, N$b n$b2, Clock clock) {
        signInDataStore.getClass();
        sharedResourcePool.getClass();
        n$b.getClass();
        a9Var.getClass();
        n$b2.getClass();
        clock.getClass();
        this.RatingCompat = signInDataStore;
        this.MediaMetadataCompat = sharedResourcePool;
        this.read = n$b;
        this.IconCompatParcelizer = a9Var;
        this.MediaDescriptionCompat = n$b2;
        this.RemoteActionCompatParcelizer = clock;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(offsetChildrenHorizontal.RemoteActionCompatParcelizer);
        this.serializer = mutableStateFlow;
        this.PlaybackStateCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(stopInterceptRequestLayout.serializer);
        this.write = mutableStateFlow2;
        this.MediaBrowserCompatMediaItem = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new DividerUiModelImpl$1(this, null, 16), 3);
    }

    public final void serializer() {
        Long lValueOf;
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 99;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 != 0) {
            this.MediaMetadataCompat.serializer(onFailedToRecycleView.write);
            shortNewsContentCardView.hashCode();
            throw null;
        }
        this.MediaMetadataCompat.serializer(onFailedToRecycleView.write);
        Long l = this.MediaSessionCompatQueueItem;
        if (l != null) {
            lValueOf = Long.valueOf(this.RemoteActionCompatParcelizer.millis() - l.longValue());
        } else {
            int i3 = PlaybackStateCompatCustomAction + 9;
            MediaSessionCompatResultReceiverWrapper = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            lValueOf = null;
        }
        N$b n$b = this.MediaDescriptionCompat;
        BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) n$b.serializer, null, null, new PushEventPublisherImpl$emit$1(n$b, lValueOf, shortNewsContentCardView, 7), 3);
    }
}
