package com.roadrunner.map.container.enabled.presentation;

import androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$1;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.opportunities.map.ShiftZoneMapLayerUiModelImpl$1;
import dagger.Lazy;
import io.sentry.util.UrlUtils;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.SharingStarted;
import o.C;
import o.P;
import o.ShortNewsContentCardView;
import o.T;
import o.accessisRenderNodeCompatiblecp;
import o.addRearDisplayPresentationStatusListener;
import o.createFromParcel;
import o.endRearDisplaySession;
import o.getContentViewGroupParentLayout;
import o.inCompatibilityMode;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.removeRearDisplayPresentationStatusListener;
import o.removeRearDisplayStatusListener;
import o.supportsColorMatrixQuery;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes3.dex */
public final class MapboxFragment$observeLocationUpdates$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ MapboxFragment RemoteActionCompatParcelizer;
    public int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxFragment$observeLocationUpdates$1(MapboxFragment mapboxFragment, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = mapboxFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = serializer + 47;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.IconCompatParcelizer;
        MapboxFragment mapboxFragment = this.RemoteActionCompatParcelizer;
        if (i5 == 0) {
            MapboxFragment$observeLocationUpdates$1 mapboxFragment$observeLocationUpdates$1 = new MapboxFragment$observeLocationUpdates$1(mapboxFragment, shortNewsContentCardView, 0);
            int i6 = write + 79;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return mapboxFragment$observeLocationUpdates$1;
        }
        int i8 = 1;
        if (i5 == 1) {
            return new MapboxFragment$observeLocationUpdates$1(mapboxFragment, shortNewsContentCardView, i8);
        }
        if (i5 == 2) {
            return new MapboxFragment$observeLocationUpdates$1(mapboxFragment, shortNewsContentCardView, i);
        }
        int i9 = 3;
        if (i5 != 3) {
            return i5 != 4 ? new MapboxFragment$observeLocationUpdates$1(mapboxFragment, shortNewsContentCardView, 5) : new MapboxFragment$observeLocationUpdates$1(mapboxFragment, shortNewsContentCardView, 4);
        }
        return new MapboxFragment$observeLocationUpdates$1(mapboxFragment, shortNewsContentCardView, i9);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = serializer + 5;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 == 0) {
            return ((MapboxFragment$observeLocationUpdates$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        if (i3 == 1) {
            return ((MapboxFragment$observeLocationUpdates$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        if (i3 != 2) {
            if (i3 != 3) {
                return i3 != 4 ? ((MapboxFragment$observeLocationUpdates$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2) : ((MapboxFragment$observeLocationUpdates$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            }
            return ((MapboxFragment$observeLocationUpdates$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((MapboxFragment$observeLocationUpdates$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = write + 109;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        MapboxFragment mapboxFragment = this.RemoteActionCompatParcelizer;
        Object obj2 = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i3 = 1;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.read;
            if (i4 != 0) {
                int i5 = write + 45;
                serializer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0 ? i4 != 1 : i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj2;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            supportsColorMatrixQuery lifecycle = mapboxFragment.getLifecycle();
            lifecycle.getClass();
            toColorLong8_81llA tocolorlong8_81lla = toColorLong8_81llA.RESUMED;
            MapboxFragment$observeLocationUpdates$1 mapboxFragment$observeLocationUpdates$1 = new MapboxFragment$observeLocationUpdates$1(mapboxFragment, shortNewsContentCardView, 5);
            this.read = 1;
            if (UrlUtils.repeatOnLifecycle(lifecycle, tocolorlong8_81lla, mapboxFragment$observeLocationUpdates$1, this) != coroutineSingletons) {
                return obj2;
            }
            int i6 = write + 5;
            serializer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return coroutineSingletons;
            }
            shortNewsContentCardView.hashCode();
            throw null;
        }
        if (i2 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.read;
            if (i7 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                T t = (T) mapboxFragment.serializer().write();
                this.read = 1;
                ((inCompatibilityMode) t.read).getClass();
                Object objWithContext = BuildersKt.withContext(prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer, new ShiftZoneMapLayerUiModelImpl$1(t, null, 1), this);
                if (objWithContext != coroutineSingletons2) {
                    objWithContext = obj2;
                }
                if (objWithContext == coroutineSingletons2) {
                    obj2 = coroutineSingletons2;
                }
            } else if (i7 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj2 = null;
            }
            int i8 = serializer + 93;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return obj2;
        }
        if (i2 == 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.read;
            if (i10 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                accessisRenderNodeCompatiblecp viewLifecycleOwner = mapboxFragment.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                toColorLong8_81llA tocolorlong8_81lla2 = toColorLong8_81llA.STARTED;
                MapboxFragment$observeLocationUpdates$1 mapboxFragment$observeLocationUpdates$2 = new MapboxFragment$observeLocationUpdates$1(mapboxFragment, shortNewsContentCardView, i3);
                this.read = 1;
                return UrlUtils.repeatOnLifecycle(viewLifecycleOwner, tocolorlong8_81lla2, mapboxFragment$observeLocationUpdates$2, this) == coroutineSingletons3 ? coroutineSingletons3 : obj2;
            }
            int i11 = write + 1;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (i10 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj2;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i13 = 3;
        if (i2 == 3) {
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i14 = this.read;
            if (i14 != 0) {
                if (i14 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Lazy lazy = mapboxFragment.MediaSessionCompatToken;
            if (lazy == null) {
                removeNodeAtDepth.serializer("recenterButtonVisibilityDelegate");
                throw null;
            }
            C c = (C) lazy.write();
            this.read = 1;
            ((inCompatibilityMode) c.RemoteActionCompatParcelizer).getClass();
            Object objWithContext2 = BuildersKt.withContext(prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer, new ShiftZoneMapLayerUiModelImpl$1(c, null, 2), this);
            if (objWithContext2 != coroutineSingletons4) {
                objWithContext2 = obj2;
            }
            if (objWithContext2 != coroutineSingletons4) {
                return obj2;
            }
            int i15 = serializer + 125;
            write = i15 % Fields.SpotShadowColor;
            if (i15 % 2 == 0) {
                int i16 = 38 / 0;
            }
            return coroutineSingletons4;
        }
        if (i2 != 4) {
            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i17 = this.read;
            if (i17 != 0) {
                if (i17 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i18 = write + 117;
                serializer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MapViewModel mapViewModelWrite = mapboxFragment.write();
            this.read = 1;
            addRearDisplayPresentationStatusListener addreardisplaypresentationstatuslistener = new addRearDisplayPresentationStatusListener(ConstantKt.DEFAULT_REQUEST_TIMEOUT, endRearDisplaySession.PRIORITY_BALANCED_POWER_ACCURACY);
            removeRearDisplayStatusListener removereardisplaystatuslistener = (removeRearDisplayStatusListener) mapViewModelWrite.RemoteActionCompatParcelizer;
            removereardisplaystatuslistener.getClass();
            Object objCollect = FlowKt.read(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ComposableLambdaImpl$invoke$1(2, removereardisplaystatuslistener.serializer, removeRearDisplayPresentationStatusListener.class, "setLocation", "setLocation(Lcom/roadrunner/location/api/model/LocationResult;)V", 4, 2), FlowKt.serializer(removereardisplaystatuslistener.IconCompatParcelizer.serializer(addreardisplaypresentationstatuslistener))), removereardisplaystatuslistener.RemoteActionCompatParcelizer, SharingStarted.Companion.read(3)).collect(P.RemoteActionCompatParcelizer, this);
            if (objCollect != coroutineSingletons5) {
                objCollect = obj2;
            }
            return objCollect == coroutineSingletons5 ? coroutineSingletons5 : obj2;
        }
        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i20 = this.read;
        if (i20 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            accessisRenderNodeCompatiblecp viewLifecycleOwner2 = mapboxFragment.getViewLifecycleOwner();
            viewLifecycleOwner2.getClass();
            toColorLong8_81llA tocolorlong8_81lla3 = toColorLong8_81llA.STARTED;
            MapboxFragment$observeLocationUpdates$1 mapboxFragment$observeLocationUpdates$3 = new MapboxFragment$observeLocationUpdates$1(mapboxFragment, shortNewsContentCardView, i13);
            this.read = 1;
            return UrlUtils.repeatOnLifecycle(viewLifecycleOwner2, tocolorlong8_81lla3, mapboxFragment$observeLocationUpdates$3, this) == coroutineSingletons6 ? coroutineSingletons6 : obj2;
        }
        int i21 = serializer;
        int i22 = i21 + 39;
        write = i22 % Fields.SpotShadowColor;
        int i23 = i22 % 2;
        if (i20 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i24 = i21 + 69;
        write = i24 % Fields.SpotShadowColor;
        if (i24 % 2 != 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return obj2;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        shortNewsContentCardView.hashCode();
        throw null;
    }
}
