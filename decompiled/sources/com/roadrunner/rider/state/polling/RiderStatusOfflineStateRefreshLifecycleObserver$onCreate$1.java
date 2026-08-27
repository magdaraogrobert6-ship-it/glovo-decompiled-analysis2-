package com.roadrunner.rider.state.polling;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.main.lifecycle.PermissionsLifecycleObserver;
import com.roadrunner.heatmap.data.HeatmapDataStore$set$2;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import io.sentry.util.UrlUtils;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import o.ShortNewsContentCardView;
import o.accessisRenderNodeCompatiblecp;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderStatusOfflineStateRefreshLifecycleObserver$onCreate$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ accessisRenderNodeCompatiblecp IconCompatParcelizer;
    public final /* synthetic */ PermissionsLifecycleObserver read;
    public final /* synthetic */ int serializer = 1;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiderStatusOfflineStateRefreshLifecycleObserver$onCreate$1(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, PermissionsLifecycleObserver permissionsLifecycleObserver, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = accessisrendernodecompatiblecp;
        this.read = permissionsLifecycleObserver;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiderStatusOfflineStateRefreshLifecycleObserver$onCreate$1(PermissionsLifecycleObserver permissionsLifecycleObserver, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = permissionsLifecycleObserver;
        this.IconCompatParcelizer = accessisrendernodecompatiblecp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 95;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = this.IconCompatParcelizer;
        PermissionsLifecycleObserver permissionsLifecycleObserver = this.read;
        if (i4 == 0) {
            return new RiderStatusOfflineStateRefreshLifecycleObserver$onCreate$1(accessisrendernodecompatiblecp, permissionsLifecycleObserver, shortNewsContentCardView);
        }
        RiderStatusOfflineStateRefreshLifecycleObserver$onCreate$1 riderStatusOfflineStateRefreshLifecycleObserver$onCreate$1 = new RiderStatusOfflineStateRefreshLifecycleObserver$onCreate$1(permissionsLifecycleObserver, accessisrendernodecompatiblecp, shortNewsContentCardView);
        int i5 = MediaSessionCompatQueueItem + 81;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return riderStatusOfflineStateRefreshLifecycleObserver$onCreate$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            return ((RiderStatusOfflineStateRefreshLifecycleObserver$onCreate$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((RiderStatusOfflineStateRefreshLifecycleObserver$onCreate$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = RemoteActionCompatParcelizer + 35;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = this.IconCompatParcelizer;
        PermissionsLifecycleObserver permissionsLifecycleObserver = this.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.write;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1IconCompatParcelizer = ((GetRiderStatusImpl) permissionsLifecycleObserver.RatingCompat).IconCompatParcelizer();
                HeatmapDataStore$set$2 heatmapDataStore$set$2 = new HeatmapDataStore$set$2(permissionsLifecycleObserver, accessisrendernodecompatiblecp, shortNewsContentCardView, 10);
                this.write = 1;
                return FlowKt.collectLatest(getMapScope$invoke$$inlined$map$1IconCompatParcelizer, heatmapDataStore$set$2, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            int i4 = RemoteActionCompatParcelizer + 117;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0 ? i3 != 1 : i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.write;
        if (i5 != 0) {
            int i6 = MediaSessionCompatQueueItem + 35;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (i5 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        toColorLong8_81llA tocolorlong8_81lla = toColorLong8_81llA.STARTED;
        RiderStatusOfflineStateRefreshLifecycleObserver$onCreate$1 riderStatusOfflineStateRefreshLifecycleObserver$onCreate$1 = new RiderStatusOfflineStateRefreshLifecycleObserver$onCreate$1(permissionsLifecycleObserver, accessisrendernodecompatiblecp, (ShortNewsContentCardView) null);
        this.write = 1;
        if (UrlUtils.repeatOnLifecycle(accessisrendernodecompatiblecp, tocolorlong8_81lla, riderStatusOfflineStateRefreshLifecycleObserver$onCreate$1, this) != coroutineSingletons2) {
            return createfromparcel;
        }
        int i8 = MediaSessionCompatQueueItem + 83;
        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return coroutineSingletons2;
    }
}
