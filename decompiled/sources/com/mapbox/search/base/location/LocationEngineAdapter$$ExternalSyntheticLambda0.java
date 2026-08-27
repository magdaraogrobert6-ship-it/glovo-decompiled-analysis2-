package com.mapbox.search.base.location;

import com.google.firebase.inappmessaging.internal.DisplayCallbacksImpl;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.location.Location;
import com.mapbox.common.location.LocationObserver;
import com.mapbox.geojson.Point;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import java.util.List;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LocationEngineAdapter$$ExternalSyntheticLambda0 implements LocationObserver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ LocationEngineAdapter$$ExternalSyntheticLambda0(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.mapbox.common.location.LocationObserver
    public final void onLocationUpdateReceived(List list) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        if (i == 0) {
            LocationEngineAdapter locationEngineAdapter = (LocationEngineAdapter) obj;
            list.getClass();
            Location location = (Location) onContentCardDismissed.MediaMetadataCompat(list);
            if (location != null) {
                Point pointFromLngLat = Point.fromLngLat(location.getLongitude(), location.getLatitude());
                pointFromLngLat.getClass();
                locationEngineAdapter.lastLocationInfo = new LocationEngineAdapter.LocationInfo(pointFromLngLat, System.currentTimeMillis());
            }
            locationEngineAdapter.stopLocationListener();
            return;
        }
        DisplayCallbacksImpl displayCallbacksImpl = (DisplayCallbacksImpl) obj;
        list.getClass();
        if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.DEBUG)) {
            LoggerProviderKt.logD("location callback " + list, "TripSessionLocationEngine");
        }
        Location location2 = (Location) onContentCardDismissed.MediaBrowserCompatMediaItem(list);
        if (location2 != null) {
            displayCallbacksImpl.handleReceivedLocation(location2);
        }
    }
}
