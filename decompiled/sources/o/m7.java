package o;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.lifecycle.MapboxNavigationApp;
import com.mapbox.navigation.ui.maps.route.callout.model.DefaultRouteCalloutAdapterOptions;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineApi;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineViewOptions;
import com.roadrunner.domain.usecase.SuspendingWorkUseCase$$ExternalSyntheticLambda0;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.map.integration.mapbox.route.RouteLineApi$$ExternalSyntheticLambda6;
import com.roadrunner.map.integration.mapbox.route.RouteLineApi$$ExternalSyntheticLambda7;
import java.util.List;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class m7 {
    private static int PlaybackStateCompatCustomAction = 0;
    private static int ResultReceiver = 1;
    public String IconCompatParcelizer;
    public final isAdapterPositionOnScreen MediaBrowserCompatMediaItem;
    public m2 MediaDescriptionCompat;
    public final isAdapterPositionOnScreen MediaMetadataCompat;
    public SuspendingWorkUseCase$$ExternalSyntheticLambda0 MediaSessionCompatQueueItem;
    public final float MediaSessionCompatResultReceiverWrapper = Resources.getSystem().getDisplayMetrics().density * 15.0f;
    public final md MediaSessionCompatToken;
    public final shouldSkipDump ParcelableVolumeInfo;
    public final mb PlaybackStateCompat;
    public final setTransactionSuccessful RatingCompat;
    public final resolveBulletTextUnitToPxo2QH7mI RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen read;
    public MapView serializer;
    public final isAdapterPositionOnScreen write;

    public m7(Application application, j4 j4Var, resolveBulletTextUnitToPxo2QH7mI resolvebullettextunittopxo2qh7mi, md mdVar, shouldSkipDump shouldskipdump, setTransactionSuccessful settransactionsuccessful, mb mbVar) {
        this.RemoteActionCompatParcelizer = resolvebullettextunittopxo2qh7mi;
        this.MediaSessionCompatToken = mdVar;
        this.ParcelableVolumeInfo = shouldskipdump;
        this.RatingCompat = settransactionsuccessful;
        this.PlaybackStateCompat = mbVar;
        this.MediaBrowserCompatMediaItem = new isAdapterPositionOnScreen(new SealedClassSerializer$$ExternalSyntheticLambda0(this, 5, application));
        final int i = 0;
        this.read = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.m8
            private static int IconCompatParcelizer = 1;
            private static int RemoteActionCompatParcelizer;
            public final /* synthetic */ m7 read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IconCompatParcelizer + 89;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                int i5 = i;
                m7 m7Var = this.read;
                if (i5 == 0) {
                    MapboxRouteLineApiOptions.Builder builder = new MapboxRouteLineApiOptions.Builder();
                    builder.vanishingRouteLineEnabled();
                    builder.isRouteCalloutsEnabled(m7Var.RemoteActionCompatParcelizer.IconCompatParcelizer());
                    return builder.build();
                }
                if (i5 != 1) {
                    return new MapboxRouteLineView((MapboxRouteLineViewOptions) m7Var.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper());
                }
                MapboxRouteLineApi mapboxRouteLineApi = new MapboxRouteLineApi((MapboxRouteLineApiOptions) m7Var.read.MediaSessionCompatResultReceiverWrapper());
                int i6 = IconCompatParcelizer + 47;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return mapboxRouteLineApi;
            }
        });
        final int i2 = 1;
        this.write = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.m8
            private static int IconCompatParcelizer = 1;
            private static int RemoteActionCompatParcelizer;
            public final /* synthetic */ m7 read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = IconCompatParcelizer + 89;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i2;
                m7 m7Var = this.read;
                if (i6 == 0) {
                    MapboxRouteLineApiOptions.Builder builder = new MapboxRouteLineApiOptions.Builder();
                    builder.vanishingRouteLineEnabled();
                    builder.isRouteCalloutsEnabled(m7Var.RemoteActionCompatParcelizer.IconCompatParcelizer());
                    return builder.build();
                }
                if (i6 != 1) {
                    return new MapboxRouteLineView((MapboxRouteLineViewOptions) m7Var.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper());
                }
                MapboxRouteLineApi mapboxRouteLineApi = new MapboxRouteLineApi((MapboxRouteLineApiOptions) m7Var.read.MediaSessionCompatResultReceiverWrapper());
                int i7 = IconCompatParcelizer + 47;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return mapboxRouteLineApi;
            }
        });
        final int i3 = 2;
        this.MediaMetadataCompat = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.m8
            private static int IconCompatParcelizer = 1;
            private static int RemoteActionCompatParcelizer;
            public final /* synthetic */ m7 read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i4 = 2 % 2;
                int i5 = IconCompatParcelizer + 89;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                int i7 = i3;
                m7 m7Var = this.read;
                if (i7 == 0) {
                    MapboxRouteLineApiOptions.Builder builder = new MapboxRouteLineApiOptions.Builder();
                    builder.vanishingRouteLineEnabled();
                    builder.isRouteCalloutsEnabled(m7Var.RemoteActionCompatParcelizer.IconCompatParcelizer());
                    return builder.build();
                }
                if (i7 != 1) {
                    return new MapboxRouteLineView((MapboxRouteLineViewOptions) m7Var.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper());
                }
                MapboxRouteLineApi mapboxRouteLineApi = new MapboxRouteLineApi((MapboxRouteLineApiOptions) m7Var.read.MediaSessionCompatResultReceiverWrapper());
                int i8 = IconCompatParcelizer + 47;
                RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return mapboxRouteLineApi;
            }
        });
    }

    public final MapboxRouteLineApi IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = ResultReceiver + 13;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        MapboxRouteLineApi mapboxRouteLineApi = (MapboxRouteLineApi) this.write.MediaSessionCompatResultReceiverWrapper();
        int i4 = ResultReceiver + 9;
        PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return mapboxRouteLineApi;
        }
        throw null;
    }

    public final MapboxRouteLineView RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 103;
        ResultReceiver = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        MapboxRouteLineView mapboxRouteLineView = (MapboxRouteLineView) this.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper();
        int i4 = ResultReceiver + 1;
        PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
        return mapboxRouteLineView;
    }

    public final void IconCompatParcelizer(Style style) {
        int i = 2 % 2;
        int i2 = ResultReceiver;
        int i3 = i2 + 53;
        PlaybackStateCompatCustomAction = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = j4.RemoteActionCompatParcelizer(style);
            return;
        }
        int i5 = i2 + 31;
        PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serializer(List list, MapboxMap mapboxMap, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        List alternativeMetadataFor;
        int i = 2 % 2;
        list.getClass();
        mapboxMap.getClass();
        Style styleDeprecated = mapboxMap.getStyleDeprecated();
        if (styleDeprecated == null) {
            return;
        }
        IconCompatParcelizer(styleDeprecated);
        if (list.isEmpty()) {
            setRectOutlinetz77jQwdefault setrectoutlinetz77jqwdefault = new setRectOutlinetz77jQwdefault(23);
            IconCompatParcelizer(styleDeprecated);
            IconCompatParcelizer().clearRouteLine(new RouteLineApi$$ExternalSyntheticLambda7(this, styleDeprecated, setrectoutlinetz77jqwdefault));
            int i2 = PlaybackStateCompatCustomAction + 15;
            ResultReceiver = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MapboxRouteLineApi mapboxRouteLineApiIconCompatParcelizer = IconCompatParcelizer();
        MapboxNavigation mapboxNavigationCurrent = MapboxNavigationApp.current();
        if (mapboxNavigationCurrent != null) {
            int i3 = ResultReceiver + 5;
            PlaybackStateCompatCustomAction = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            alternativeMetadataFor = mapboxNavigationCurrent.getAlternativeMetadataFor(list);
        } else {
            alternativeMetadataFor = instance_delegatelambda0.write;
        }
        mapboxRouteLineApiIconCompatParcelizer.setNavigationRoutes(list, alternativeMetadataFor, new RouteLineApi$$ExternalSyntheticLambda6(this, styleDeprecated, mapboxMap, list, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
    }

    public final void write() {
        MapView mapView;
        Style styleDeprecated;
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 79;
        ResultReceiver = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.RemoteActionCompatParcelizer.IconCompatParcelizer() && this.MediaDescriptionCompat == null && (mapView = this.serializer) != null && (styleDeprecated = mapView.getMapboxMapDeprecated().getStyleDeprecated()) != null) {
            IconCompatParcelizer(styleDeprecated);
            Context context = mapView.getContext();
            context.getClass();
            DefaultRouteCalloutAdapterOptions.Builder builder = new DefaultRouteCalloutAdapterOptions.Builder();
            builder.routeCalloutType();
            unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
            builder.m4790similarDurationDeltaLRDsOJo(coil3.UriKt.RemoteActionCompatParcelizer(1, setUnregisteredInAppMessage.MINUTES));
            m2 m2Var = new m2(context, builder.build(), this.ParcelableVolumeInfo, this.RatingCompat, new RetryWithDelay$$ExternalSyntheticLambda0(29, this));
            RemoteActionCompatParcelizer().setCalloutAdapter(mapView.getViewAnnotationManager(), m2Var);
            this.MediaDescriptionCompat = m2Var;
            int i4 = ResultReceiver + 67;
            PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 4;
            }
        }
        int i6 = PlaybackStateCompatCustomAction + 103;
        ResultReceiver = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }
}
