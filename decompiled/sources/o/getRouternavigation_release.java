package o;

import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.home.nest.NestViewModel$observeNestScope$1;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import io.grpc.internal.SharedResourcePool;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getRouternavigation_release extends androidx.lifecycle.ViewModel {
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompatCustomAction;
    public final internalPathIteratorSize IconCompatParcelizer;
    public final SharedResourcePool MediaBrowserCompatMediaItem;
    public final NestComponentRepositoryImpl MediaDescriptionCompat;
    public final attachToRecyclerView MediaMetadataCompat;
    public final NetworkErrorMapperImpl MediaSessionCompatQueueItem;
    public final StateFlow MediaSessionCompatResultReceiverWrapper;
    public final isAdapterPositionOnScreen RatingCompat;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU RemoteActionCompatParcelizer;
    public final SignInDataStore read;
    public final GetRiderStatusImpl serializer;
    public final MutableStateFlow write;

    public final SharedResourcePool RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 107;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ParcelableVolumeInfo = i3;
        int i4 = i2 % 2;
        SharedResourcePool sharedResourcePool = this.MediaBrowserCompatMediaItem;
        int i5 = i3 + 121;
        PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 62 / 0;
        }
        return sharedResourcePool;
    }

    public getRouternavigation_release(SignInDataStore signInDataStore, NestComponentRepositoryImpl nestComponentRepositoryImpl, SharedResourcePool sharedResourcePool, isOpenInternalroom_runtime isopeninternalroom_runtime, GetRiderStatusImpl getRiderStatusImpl, internalPathIteratorSize internalpathiteratorsize, NetworkErrorMapperImpl networkErrorMapperImpl, attachToRecyclerView attachtorecyclerview) {
        signInDataStore.getClass();
        nestComponentRepositoryImpl.getClass();
        sharedResourcePool.getClass();
        isopeninternalroom_runtime.getClass();
        getRiderStatusImpl.getClass();
        internalpathiteratorsize.getClass();
        networkErrorMapperImpl.getClass();
        attachtorecyclerview.getClass();
        this.read = signInDataStore;
        this.MediaDescriptionCompat = nestComponentRepositoryImpl;
        this.MediaBrowserCompatMediaItem = sharedResourcePool;
        this.serializer = getRiderStatusImpl;
        this.IconCompatParcelizer = internalpathiteratorsize;
        this.MediaSessionCompatQueueItem = networkErrorMapperImpl;
        this.MediaMetadataCompat = attachtorecyclerview;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(invokeBWLJW6A.read);
        this.write = mutableStateFlow;
        this.MediaSessionCompatResultReceiverWrapper = mutableStateFlow;
        int i = 0;
        isAdapterPositionOnScreen isadapterpositiononscreen = new isAdapterPositionOnScreen(new getImages(isopeninternalroom_runtime, i));
        this.RatingCompat = isadapterpositiononscreen;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), null, null, new NestViewModel$observeNestScope$1(this, shortNewsContentCardView, 2), 3);
        BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), null, null, new NestViewModel$observeNestScope$1(this, shortNewsContentCardView, i), 3);
        internalpathiteratorsize.RemoteActionCompatParcelizer.IconCompatParcelizer("Nest", null);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 89;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj = null;
        YieldKt.write((getContentViewGroupParentLayout) this.RatingCompat.MediaSessionCompatResultReceiverWrapper(), (CancellationException) null);
        int i4 = ParcelableVolumeInfo + 63;
        PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
