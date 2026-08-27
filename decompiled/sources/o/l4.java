package o;

import com.mapbox.common.location.Location;
import com.mapbox.navigation.core.trip.session.LocationMatcherResult;
import com.mapbox.navigation.core.trip.session.LocationObserver;
import kotlinx.coroutines.channels.ProducerCoroutine;

/* JADX INFO: loaded from: classes3.dex */
public final class l4 implements LocationObserver {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 write;

    public /* synthetic */ l4(InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, int i) {
        this.serializer = i;
        this.write = inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
    }

    @Override // com.mapbox.navigation.core.trip.session.LocationObserver
    public final void onNewLocationMatcherResult(LocationMatcherResult locationMatcherResult) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        locationMatcherResult.getClass();
        if (i4 != 0) {
            ((ProducerCoroutine) this.write).b_(locationMatcherResult);
            int i5 = read + 51;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 4 % 5;
            }
        }
    }

    @Override // com.mapbox.navigation.core.trip.session.LocationObserver
    public final void onNewRawLocation(Location location) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        location.getClass();
        if (i4 == 0) {
            ((ProducerCoroutine) this.write).b_(location);
            return;
        }
        int i5 = RemoteActionCompatParcelizer + 47;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
