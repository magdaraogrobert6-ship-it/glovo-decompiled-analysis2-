package o;

import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.lifecycle.MapboxNavigationObserver;
import kotlinx.coroutines.channels.ProducerCoroutine;

/* JADX INFO: loaded from: classes3.dex */
public final class l3 implements MapboxNavigationObserver {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 write;

    public l3(InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) {
        this.write = inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
    }

    @Override // com.mapbox.navigation.core.lifecycle.MapboxNavigationObserver
    public final void onAttached(MapboxNavigation mapboxNavigation) {
        int i = 2 % 2;
        mapboxNavigation.getClass();
        ((ProducerCoroutine) this.write).b_(new le(mapboxNavigation));
        int i2 = read + 69;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // com.mapbox.navigation.core.lifecycle.MapboxNavigationObserver
    public final void onDetached(MapboxNavigation mapboxNavigation) {
        int i = 2 % 2;
        mapboxNavigation.getClass();
        ((ProducerCoroutine) this.write).b_(new lb(mapboxNavigation));
        int i2 = RemoteActionCompatParcelizer + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
