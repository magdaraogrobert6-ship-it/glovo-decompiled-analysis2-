package o;

import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager;
import com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository;
import com.roadrunner.rider.safety.permission.presentation.RiderSafetyPermissionViewModel$onNextClick$1;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.N$b;
import io.grpc.internal.SharedResourcePool;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustAdRevenue extends androidx.lifecycle.ViewModel {
    private static int MediaSessionCompatToken = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final SharedResourcePool IconCompatParcelizer;
    public final com.airbnb.lottie.parser.DropShadowEffect MediaBrowserCompatMediaItem;
    public final PermissionHistoryRepository MediaDescriptionCompat;
    public final StateFlow MediaMetadataCompat;
    public final RiderSafetyLifecycleManager MediaSessionCompatQueueItem;
    public final GetAppStateImpl RatingCompat;
    public final C$b RemoteActionCompatParcelizer;
    public final N$b read;
    public final r8lambdaP1frYJQmg54QrMLKfwUvXZE4A5U serializer;
    public final MutableStateFlow write;

    public AdjustAdRevenue(C$b c$b, N$b n$b, RiderSafetyLifecycleManager riderSafetyLifecycleManager, PermissionHistoryRepository permissionHistoryRepository, com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect, getBitmapui_graphics getbitmapui_graphics, isAdjustUninstallDetectionPayload isadjustuninstalldetectionpayload, SharedResourcePool sharedResourcePool, r8lambdaP1frYJQmg54QrMLKfwUvXZE4A5U r8lambdap1fryjqmg54qrmlkfwuvxze4a5u) {
        c$b.getClass();
        n$b.getClass();
        riderSafetyLifecycleManager.getClass();
        permissionHistoryRepository.getClass();
        dropShadowEffect.getClass();
        getbitmapui_graphics.getClass();
        isadjustuninstalldetectionpayload.getClass();
        sharedResourcePool.getClass();
        r8lambdap1fryjqmg54qrmlkfwuvxze4a5u.getClass();
        this.RemoteActionCompatParcelizer = c$b;
        this.read = n$b;
        this.MediaSessionCompatQueueItem = riderSafetyLifecycleManager;
        this.MediaDescriptionCompat = permissionHistoryRepository;
        this.MediaBrowserCompatMediaItem = dropShadowEffect;
        this.IconCompatParcelizer = sharedResourcePool;
        this.serializer = r8lambdap1fryjqmg54qrmlkfwuvxze4a5u;
        GetAppStateImpl getAppStateImpl = new GetAppStateImpl(getbitmapui_graphics);
        this.RatingCompat = getAppStateImpl;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(c$b.IconCompatParcelizer(getAppStateImpl));
        this.write = mutableStateFlow;
        this.MediaMetadataCompat = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new RiderSafetyPermissionViewModel$onNextClick$1(this, null, 1), 3);
    }

    public final void RemoteActionCompatParcelizer(setReferrer setreferrer) {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new RxConvertKt$asFlow$1(this, setreferrer, (ShortNewsContentCardView) null, 7), 3);
        int i2 = PlaybackStateCompatCustomAction + 103;
        MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 12 / 0;
        }
    }
}
