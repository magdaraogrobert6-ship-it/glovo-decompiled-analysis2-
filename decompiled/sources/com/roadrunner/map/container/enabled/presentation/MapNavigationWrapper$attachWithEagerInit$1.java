package com.roadrunner.map.container.enabled.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.MapView;
import com.roadrunner.delivery.accept.overlay.domain.ObserveDeliveryInformation$invoke$$inlined$map$1;
import io.sentry.util.UrlUtils;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import o.ShortNewsContentCardView;
import o.accessisRenderNodeCompatiblecp;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.supportsColorMatrixQuery;
import o.timesmpE4wyQ;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes3.dex */
public final class MapNavigationWrapper$attachWithEagerInit$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final /* synthetic */ MapNavigationWrapper IconCompatParcelizer;
    public final /* synthetic */ accessisRenderNodeCompatiblecp RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public int serializer;
    public final /* synthetic */ MapView write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapNavigationWrapper$attachWithEagerInit$1(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, MapNavigationWrapper mapNavigationWrapper, MapView mapView, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = 0;
        this.RemoteActionCompatParcelizer = accessisrendernodecompatiblecp;
        this.IconCompatParcelizer = mapNavigationWrapper;
        this.write = mapView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapNavigationWrapper$attachWithEagerInit$1(MapNavigationWrapper mapNavigationWrapper, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, MapView mapView, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.IconCompatParcelizer = mapNavigationWrapper;
        this.RemoteActionCompatParcelizer = accessisrendernodecompatiblecp;
        this.write = mapView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 123;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.read;
        if (i3 != 0) {
            if (i3 != 1) {
                return new MapNavigationWrapper$attachWithEagerInit$1(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, shortNewsContentCardView, 2);
            }
            return new MapNavigationWrapper$attachWithEagerInit$1(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, shortNewsContentCardView, 1);
        }
        MapNavigationWrapper$attachWithEagerInit$1 mapNavigationWrapper$attachWithEagerInit$1 = new MapNavigationWrapper$attachWithEagerInit$1(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write, shortNewsContentCardView);
        int i4 = MediaBrowserCompatMediaItem + 61;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return mapNavigationWrapper$attachWithEagerInit$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 91;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i4 == 0) {
            return ((MapNavigationWrapper$attachWithEagerInit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        if (i4 == 1) {
            return ((MapNavigationWrapper$attachWithEagerInit$1) create((timesmpE4wyQ) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((MapNavigationWrapper$attachWithEagerInit$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        int i5 = MediaMetadataCompat + 51;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 115;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i4 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.serializer;
            if (i5 != 0) {
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = MediaMetadataCompat + 41;
                MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = this.RemoteActionCompatParcelizer;
            supportsColorMatrixQuery lifecycle = accessisrendernodecompatiblecp.getLifecycle();
            toColorLong8_81llA tocolorlong8_81lla = toColorLong8_81llA.RESUMED;
            MapNavigationWrapper$attachWithEagerInit$1 mapNavigationWrapper$attachWithEagerInit$1 = new MapNavigationWrapper$attachWithEagerInit$1(this.IconCompatParcelizer, accessisrendernodecompatiblecp, this.write, null, 2);
            this.serializer = 1;
            if (UrlUtils.repeatOnLifecycle(lifecycle, tocolorlong8_81lla, mapNavigationWrapper$attachWithEagerInit$1, this) != coroutineSingletons) {
                return createfromparcel;
            }
            int i8 = MediaMetadataCompat + 111;
            int i9 = i8 % Fields.SpotShadowColor;
            MediaBrowserCompatMediaItem = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 95;
            MediaMetadataCompat = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return coroutineSingletons;
        }
        if (i4 != 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i13 = this.serializer;
            if (i13 != 0) {
                if (i13 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MapNavigationWrapper mapNavigationWrapper = this.IconCompatParcelizer;
            ObserveDeliveryInformation$invoke$$inlined$map$1 observeDeliveryInformation$invoke$$inlined$map$1 = new ObserveDeliveryInformation$invoke$$inlined$map$1(mapNavigationWrapper.serializer.write(), 2);
            MapNavigationWrapper$attachWithEagerInit$1 mapNavigationWrapper$attachWithEagerInit$2 = new MapNavigationWrapper$attachWithEagerInit$1(mapNavigationWrapper, this.RemoteActionCompatParcelizer, this.write, null, 1);
            this.serializer = 1;
            return FlowKt.collectLatest(observeDeliveryInformation$invoke$$inlined$map$1, mapNavigationWrapper$attachWithEagerInit$2, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i14 = this.serializer;
        MapNavigationWrapper mapNavigationWrapper2 = this.IconCompatParcelizer;
        if (i14 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (mapNavigationWrapper2.RatingCompat) {
                return createfromparcel;
            }
            this.serializer = 1;
            if (MapNavigationWrapper.access$initAndAttachNavigation(mapNavigationWrapper2, this.RemoteActionCompatParcelizer, this.write, this) == coroutineSingletons3) {
                return coroutineSingletons3;
            }
        } else {
            if (i14 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        mapNavigationWrapper2.RatingCompat = true;
        return createfromparcel;
    }
}
