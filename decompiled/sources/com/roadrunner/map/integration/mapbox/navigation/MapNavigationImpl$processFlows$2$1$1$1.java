package com.roadrunner.map.integration.mapbox.navigation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.settings.SettingsViewModel$special$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.l0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class MapNavigationImpl$processFlows$2$1$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public int IconCompatParcelizer;
    public final /* synthetic */ MapNavigationImpl MediaBrowserCompatMediaItem;
    public final /* synthetic */ LocationComponentPluginImpl RemoteActionCompatParcelizer;
    public final /* synthetic */ MapboxNavigation read;
    public final /* synthetic */ int serializer = 1;
    public final /* synthetic */ MapboxMap write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapNavigationImpl$processFlows$2$1$1$1(MapNavigationImpl mapNavigationImpl, MapboxNavigation mapboxNavigation, MapboxMap mapboxMap, LocationComponentPluginImpl locationComponentPluginImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.MediaBrowserCompatMediaItem = mapNavigationImpl;
        this.read = mapboxNavigation;
        this.write = mapboxMap;
        this.RemoteActionCompatParcelizer = locationComponentPluginImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapNavigationImpl$processFlows$2$1$1$1(MapNavigationImpl mapNavigationImpl, MapboxNavigation mapboxNavigation, LocationComponentPluginImpl locationComponentPluginImpl, MapboxMap mapboxMap, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.MediaBrowserCompatMediaItem = mapNavigationImpl;
        this.read = mapboxNavigation;
        this.RemoteActionCompatParcelizer = locationComponentPluginImpl;
        this.write = mapboxMap;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 3;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            return ((MapNavigationImpl$processFlows$2$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((MapNavigationImpl$processFlows$2$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = MediaSessionCompatQueueItem + 25;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 79;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.serializer == 0) {
            return new MapNavigationImpl$processFlows$2$1$1$1(this.MediaBrowserCompatMediaItem, this.read, this.RemoteActionCompatParcelizer, this.write, shortNewsContentCardView);
        }
        MapNavigationImpl$processFlows$2$1$1$1 mapNavigationImpl$processFlows$2$1$1$1 = new MapNavigationImpl$processFlows$2$1$1$1(this.MediaBrowserCompatMediaItem, this.read, this.write, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        int i4 = MediaSessionCompatQueueItem + 103;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return mapNavigationImpl$processFlows$2$1$1$1;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 51;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.serializer;
        LocationComponentPluginImpl locationComponentPluginImpl = this.RemoteActionCompatParcelizer;
        MapboxMap mapboxMap = this.write;
        MapboxNavigation mapboxNavigation = this.read;
        MapNavigationImpl mapNavigationImpl = this.MediaBrowserCompatMediaItem;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        if (i3 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.IconCompatParcelizer;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                obj2 = MapNavigationImpl.access$collectNavigationState(mapNavigationImpl, mapboxNavigation, locationComponentPluginImpl, mapboxMap, this) == coroutineSingletons ? coroutineSingletons : createfromparcel2;
            } else if (i4 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = MediaDescriptionCompat + 83;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return obj2;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.IconCompatParcelizer;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.IconCompatParcelizer = 1;
            mapNavigationImpl.getClass();
            Flow settingsViewModel$special$$inlined$map$1 = new SettingsViewModel$special$$inlined$map$1(FlowKt.write(new PushEventPublisherImpl$emit$1(locationComponentPluginImpl, null, 22)), 11, mapboxNavigation);
            if (((FirebaseRemoteConfigImpl) mapNavigationImpl.MediaMetadataCompat).IconCompatParcelizer(updateAdidI.IS_NAVIGATION_FLOW_THROTTLING_ENABLED)) {
                int i8 = MediaSessionCompatQueueItem + 37;
                MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                settingsViewModel$special$$inlined$map$1 = FlowKt.serializer(settingsViewModel$special$$inlined$map$1, DelayKt.serializer(l0.write()));
            }
            Object objCollect = settingsViewModel$special$$inlined$map$1.collect(new MapNavigationImpl$collectRouteProgress$2(mapNavigationImpl, mapboxMap, 1), this);
            if (objCollect != coroutineSingletons2) {
                objCollect = createfromparcel2;
            }
            if (objCollect == coroutineSingletons2) {
                return coroutineSingletons2;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i10 = MediaSessionCompatQueueItem + 63;
                MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i12 = MediaSessionCompatQueueItem + 3;
            MediaDescriptionCompat = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
        return createfromparcel2;
    }
}
