package com.roadrunner.map.integration.mapbox.navigation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.MapboxNavigation$prepareNavigationForRoutesParsing$2;
import com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.l0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class MapNavigationImpl$processFlows$1$1$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int serializer;
    public final /* synthetic */ MapboxNavigation IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ MapNavigationImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapNavigationImpl$processFlows$1$1$1$1(MapNavigationImpl mapNavigationImpl, MapboxNavigation mapboxNavigation, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.write = mapNavigationImpl;
        this.IconCompatParcelizer = mapboxNavigation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 87;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = this.read;
        if (i4 == 0) {
            MapNavigationImpl$processFlows$1$1$1$1 mapNavigationImpl$processFlows$1$1$1$1 = new MapNavigationImpl$processFlows$1$1$1$1(this.write, this.IconCompatParcelizer, shortNewsContentCardView, 0);
            int i5 = MediaBrowserCompatMediaItem + 55;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 48 / 0;
            }
            return mapNavigationImpl$processFlows$1$1$1$1;
        }
        int i7 = 1;
        if (i4 == 1) {
            return new MapNavigationImpl$processFlows$1$1$1$1(this.write, this.IconCompatParcelizer, shortNewsContentCardView, i7);
        }
        if (i4 == 2) {
            return new MapNavigationImpl$processFlows$1$1$1$1(this.write, this.IconCompatParcelizer, shortNewsContentCardView, i);
        }
        int i8 = 3;
        if (i4 != 3) {
            return new MapNavigationImpl$processFlows$1$1$1$1(this.write, this.IconCompatParcelizer, shortNewsContentCardView, 4);
        }
        return new MapNavigationImpl$processFlows$1$1$1$1(this.write, this.IconCompatParcelizer, shortNewsContentCardView, i8);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 123;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 == 0) {
            return ((MapNavigationImpl$processFlows$1$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        if (i3 == 1) {
            return ((MapNavigationImpl$processFlows$1$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        if (i3 != 2) {
            return i3 != 3 ? ((MapNavigationImpl$processFlows$1$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2) : ((MapNavigationImpl$processFlows$1$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((MapNavigationImpl$processFlows$1$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = MediaBrowserCompatMediaItem + 39;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        obj3.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [o.ShortNewsContentCardView] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = serializer + 67;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        ?? r2 = 0;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i4 = this.read;
        MapboxNavigation mapboxNavigation = this.IconCompatParcelizer;
        MapNavigationImpl mapNavigationImpl = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i5 = 4;
        int i6 = 1;
        if (i4 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.RemoteActionCompatParcelizer;
            if (i7 != 0) {
                int i8 = serializer + 57;
                MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (i7 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                mapNavigationImpl.getClass();
                mapboxNavigation.getClass();
                Object objCollect = ((ChannelFlow) FlowKt.write(new MapboxNavigation$prepareNavigationForRoutesParsing$2(mapboxNavigation, r2, 8))).collect(new MapNavigationImpl$collectRawLocation$2(mapNavigationImpl, i5), this);
                if (objCollect != coroutineSingletons) {
                    objCollect = createfromparcel2;
                }
                r2 = objCollect == coroutineSingletons ? coroutineSingletons : createfromparcel2;
            }
            int i10 = serializer + 99;
            MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return r2;
        }
        if (i4 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i12 = this.RemoteActionCompatParcelizer;
            if (i12 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                mapNavigationImpl.getClass();
                mapboxNavigation.getClass();
                Flow flowWrite = FlowKt.write(new MapboxNavigation$prepareNavigationForRoutesParsing$2(mapboxNavigation, r2, i6));
                if (((FirebaseRemoteConfigImpl) mapNavigationImpl.MediaMetadataCompat).IconCompatParcelizer(updateAdidI.IS_NAVIGATION_FLOW_THROTTLING_ENABLED)) {
                    flowWrite = FlowKt.serializer(flowWrite, DelayKt.serializer(l0.write()));
                }
                Object objCollect2 = flowWrite.collect(new NestViewModel$updateConfiguration$1$1$1$1(mapboxNavigation, 17, mapNavigationImpl), this);
                if (objCollect2 != coroutineSingletons2) {
                    objCollect2 = createfromparcel2;
                }
                if (objCollect2 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
            } else {
                if (i12 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createfromparcel2;
        }
        int i13 = 3;
        if (i4 == 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i14 = this.RemoteActionCompatParcelizer;
            if (i14 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                mapNavigationImpl.getClass();
                mapboxNavigation.getClass();
                Object objCollect3 = ((ChannelFlow) FlowKt.write(new MapboxNavigation$prepareNavigationForRoutesParsing$2(mapboxNavigation, r2, i13))).collect(new MapNavigationImpl$collectRawLocation$2(mapNavigationImpl, 0), this);
                if (objCollect3 != coroutineSingletons3) {
                    objCollect3 = createfromparcel2;
                }
                if (objCollect3 == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
            } else {
                if (i14 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i15 = MediaBrowserCompatMediaItem + 81;
                serializer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createfromparcel2;
        }
        if (i4 != 3) {
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i17 = this.RemoteActionCompatParcelizer;
            if (i17 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                mapNavigationImpl.getClass();
                mapboxNavigation.getClass();
                Object objCollect4 = ((ChannelFlow) FlowKt.write(new MapboxNavigation$prepareNavigationForRoutesParsing$2(mapboxNavigation, r2, i5))).collect(new MapNavigationImpl$collectRawLocation$2(mapNavigationImpl, i), this);
                if (objCollect4 != coroutineSingletons4) {
                    objCollect4 = createfromparcel2;
                }
                if (objCollect4 == coroutineSingletons4) {
                    return coroutineSingletons4;
                }
            } else {
                if (i17 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createfromparcel2;
        }
        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i18 = this.RemoteActionCompatParcelizer;
        if (i18 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.RemoteActionCompatParcelizer = 1;
            mapNavigationImpl.getClass();
            mapboxNavigation.getClass();
            Object objCollect5 = ((ChannelFlow) FlowKt.write(new MapboxNavigation$prepareNavigationForRoutesParsing$2(mapboxNavigation, r2, 5))).collect(new MapNavigationImpl$collectRawLocation$2(mapNavigationImpl, i13), this);
            if (objCollect5 != coroutineSingletons5) {
                objCollect5 = createfromparcel2;
            }
            if (objCollect5 == coroutineSingletons5) {
                int i19 = MediaBrowserCompatMediaItem + 123;
                serializer = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                obj2 = coroutineSingletons5;
            } else {
                obj2 = createfromparcel2;
            }
        } else if (i18 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            obj2 = createfromparcel2;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        }
        int i21 = serializer + 29;
        MediaBrowserCompatMediaItem = i21 % Fields.SpotShadowColor;
        int i22 = i21 % 2;
        return obj2;
    }
}
