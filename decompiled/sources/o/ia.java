package o;

import com.mapbox.maps.MapView;
import com.mapbox.navigation.ui.maps.camera.NavigationCamera;
import com.mapbox.navigation.ui.maps.camera.data.MapboxNavigationViewportDataSource;
import com.roadrunner.map.container.enabled.usecases.recenter.RecenterMapTriggerImpl;
import com.roadrunner.map.integration.mapbox.camera.CalculateSafeAreaUseCase;

/* JADX INFO: loaded from: classes3.dex */
public final class ia {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int MediaSessionCompatToken = 1;
    public final getHeadingrAG3T2k IconCompatParcelizer;
    public NavigationCamera MediaBrowserCompatMediaItem;
    public final RecenterMapTriggerImpl MediaDescriptionCompat;
    public MapView MediaMetadataCompat;
    public MapboxNavigationViewportDataSource ParcelableVolumeInfo;
    public fromColorLong RatingCompat;
    public final ib RemoteActionCompatParcelizer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU read;
    public final i8 serializer;
    public final CalculateSafeAreaUseCase write;
    public boolean MediaSessionCompatQueueItem = true;
    public final ie PlaybackStateCompatCustomAction = new ie();

    public ia(RecenterMapTriggerImpl recenterMapTriggerImpl, ib ibVar, i8 i8Var, getHeadingrAG3T2k getheadingrag3t2k, CalculateSafeAreaUseCase calculateSafeAreaUseCase) {
        this.MediaDescriptionCompat = recenterMapTriggerImpl;
        this.RemoteActionCompatParcelizer = ibVar;
        this.serializer = i8Var;
        this.IconCompatParcelizer = getheadingrag3t2k;
        this.write = calculateSafeAreaUseCase;
    }

    public final void read() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper;
        int i3 = i2 + 117;
        MediaSessionCompatToken = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        NavigationCamera navigationCamera = this.MediaBrowserCompatMediaItem;
        if (navigationCamera != null) {
            int i5 = i2 + 85;
            MediaSessionCompatToken = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                NavigationCamera.requestNavigationCameraToFollowing$default(navigationCamera);
                throw null;
            }
            NavigationCamera.requestNavigationCameraToFollowing$default(navigationCamera);
        }
        serialize serializeVar = serialize.NAVIGATION;
        serializeVar.getClass();
        this.RemoteActionCompatParcelizer.serializer.write(serializeVar);
    }
}
