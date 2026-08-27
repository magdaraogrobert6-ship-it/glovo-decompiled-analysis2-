package o;

import com.foodora.courier.main.presentation.MainActivity;
import com.roadrunner.delivery.repository.CachedDeliveryRepository;
import com.roadrunner.heatmap.presentation.HeatmapMapLayerUiModelImpl$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class isStaleResolvedFont implements androidx.lifecycle.DefaultLifecycleObserver {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final CachedDeliveryRepository IconCompatParcelizer;
    public final isStateSaved RemoteActionCompatParcelizer;
    public final transferSessionPackageI read;
    public final MainActivity serializer;
    public final getHeadingrAG3T2k write;

    public isStaleResolvedFont(MainActivity mainActivity, CachedDeliveryRepository cachedDeliveryRepository, isStateSaved isstatesaved, getHeadingrAG3T2k getheadingrag3t2k, transferSessionPackageI transfersessionpackagei) {
        cachedDeliveryRepository.getClass();
        isstatesaved.getClass();
        getheadingrag3t2k.getClass();
        transfersessionpackagei.getClass();
        this.serializer = mainActivity;
        this.IconCompatParcelizer = cachedDeliveryRepository;
        this.RemoteActionCompatParcelizer = isstatesaved;
        this.write = getheadingrag3t2k;
        this.read = transfersessionpackagei;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        accessisrendernodecompatiblecp.getClass();
        super.onPause(accessisrendernodecompatiblecp);
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.read;
        firebaseRemoteConfigImpl.getClass();
        if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_KEEP_SCREEN_ON_ENABLED)) {
            int i2 = MediaMetadataCompat + 41;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            this.serializer.getWindow().clearFlags(androidx.compose.ui.graphics.Fields.SpotShadowColor);
        }
        int i4 = MediaMetadataCompat + 121;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 103;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            accessisrendernodecompatiblecp.getClass();
            super.onCreate(accessisrendernodecompatiblecp);
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.read;
            firebaseRemoteConfigImpl.getClass();
            int i3 = 35 / 0;
            if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_KEEP_SCREEN_ON_ENABLED)) {
                return;
            }
        } else {
            accessisrendernodecompatiblecp.getClass();
            super.onCreate(accessisrendernodecompatiblecp);
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) this.read;
            firebaseRemoteConfigImpl2.getClass();
            if (!firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_KEEP_SCREEN_ON_ENABLED)) {
                return;
            }
        }
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new HeatmapMapLayerUiModelImpl$1(accessisrendernodecompatiblecp, this, shortNewsContentCardView, 10), 3);
        int i4 = MediaDescriptionCompat + 15;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }
}
