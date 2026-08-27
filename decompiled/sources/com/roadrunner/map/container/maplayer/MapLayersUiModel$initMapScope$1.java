package com.roadrunner.map.container.maplayer;

import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SingleProcessDataStore$data$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$4;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$7$2;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import com.roadrunner.map.container.context.GetMapScope$invoke$4;
import io.grpc.internal.SharedResourcePool;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.dh;
import o.e5;
import o.getContentViewGroupParentLayout;
import o.getRangeForRect;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeRearDisplayPresentationStatusListener;

/* JADX INFO: loaded from: classes3.dex */
public final class MapLayersUiModel$initMapScope$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int serializer = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ dh RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapLayersUiModel$initMapScope$1(dh dhVar, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.RemoteActionCompatParcelizer = dhVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = serializer + 13;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.write;
        dh dhVar = this.RemoteActionCompatParcelizer;
        if (i5 == 0) {
            return new MapLayersUiModel$initMapScope$1(dhVar, shortNewsContentCardView, 0);
        }
        int i6 = 1;
        if (i5 != 1) {
            return new MapLayersUiModel$initMapScope$1(dhVar, shortNewsContentCardView, i);
        }
        MapLayersUiModel$initMapScope$1 mapLayersUiModel$initMapScope$1 = new MapLayersUiModel$initMapScope$1(dhVar, shortNewsContentCardView, i6);
        int i7 = read + 115;
        serializer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return mapLayersUiModel$initMapScope$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 61;
        read = i2 % Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 == 0) {
            return ((MapLayersUiModel$initMapScope$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        if (i3 == 1) {
            return ((MapLayersUiModel$initMapScope$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((MapLayersUiModel$initMapScope$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = read + 31;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.write;
        dh dhVar = this.RemoteActionCompatParcelizer;
        Object obj2 = createFromParcel.INSTANCE;
        int i4 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.IconCompatParcelizer;
            if (i5 != 0) {
                if (i5 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            RouterLogger routerLogger = dhVar.PlaybackStateCompat;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = dhVar.RatingCompat;
            routerLogger.getClass();
            getcontentviewgroupparentlayout.getClass();
            FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new SingleProcessDataStore$data$1.AnonymousClass1(routerLogger, shortNewsContentCardView, 23), new GetMapScope$invoke$$inlined$map$1(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new MapLayersUiModel$1(routerLogger, shortNewsContentCardView, 14), FlowKt.serializer(new StateProviderImpl$special$$inlined$map$4(((getRangeForRect) ((SharedResourcePool) routerLogger.read).IconCompatParcelizer).read(), 4))), getcontentviewgroupparentlayout, 0)), new GetMapScope$invoke$4(routerLogger, null));
            e5 e5Var = new e5(dhVar, i4);
            this.IconCompatParcelizer = 1;
            return flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.collect(e5Var, this) == coroutineSingletons ? coroutineSingletons : obj2;
        }
        if (i3 != 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.IconCompatParcelizer;
            if (i6 != 0) {
                if (i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i7 = read + 119;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj2;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ChannelLimitedFlowMerge channelLimitedFlowMergeIconCompatParcelizer = FlowKt.IconCompatParcelizer(new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(new StateProviderImpl$special$$inlined$map$4(((removeRearDisplayPresentationStatusListener) dhVar.MediaMetadataCompat.serializer).serializer, 7)));
            e5 e5Var2 = new e5(dhVar, 3);
            this.IconCompatParcelizer = 1;
            Object objCollect = channelLimitedFlowMergeIconCompatParcelizer.collect(new StateProviderImpl$special$$inlined$map$7$2(e5Var2, 12), this);
            if (objCollect != coroutineSingletons2) {
                int i9 = serializer + 51;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                objCollect = obj2;
            }
            return objCollect == coroutineSingletons2 ? coroutineSingletons2 : obj2;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.IconCompatParcelizer;
        if (i11 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Flow flowWrite = FlowKt.write(dhVar.MediaDescriptionCompat, 300L);
            e5 e5Var3 = new e5(dhVar, i);
            this.IconCompatParcelizer = 1;
            if (flowWrite.collect(e5Var3, this) == coroutineSingletons3) {
                obj2 = coroutineSingletons3;
            }
        } else if (i11 == 1) {
            int i12 = read + 109;
            serializer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                shortNewsContentCardView.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            obj2 = null;
        }
        int i13 = read + 61;
        serializer = i13 % Fields.SpotShadowColor;
        int i14 = i13 % 2;
        return obj2;
    }
}
