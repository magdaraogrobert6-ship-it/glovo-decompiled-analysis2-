package com.roadrunner.sidemenu.data;

import androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$1;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.rider.state.provider.domain.SaveShiftInfo$invoke$2;
import com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.onItemDismiss;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8;

/* JADX INFO: loaded from: classes3.dex */
public final class SideMenuRepository {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final SharedFlowImpl IconCompatParcelizer;
    public final SideMenuCacheImpl MediaDescriptionCompat;
    public final isOpenInternalroom_runtime RemoteActionCompatParcelizer;
    public final SharedFlowImpl read;
    public final r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 serializer;
    public final SideMenuApiRequest write;

    public SideMenuRepository(SideMenuApiRequest sideMenuApiRequest, SideMenuCacheImpl sideMenuCacheImpl, r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 r8lambda4txk7kovp_j84hgvzl3zo6mzli8, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        sideMenuApiRequest.getClass();
        sideMenuCacheImpl.getClass();
        r8lambda4txk7kovp_j84hgvzl3zo6mzli8.getClass();
        isopeninternalroom_runtime.getClass();
        this.write = sideMenuApiRequest;
        this.MediaDescriptionCompat = sideMenuCacheImpl;
        this.serializer = r8lambda4txk7kovp_j84hgvzl3zo6mzli8;
        this.RemoteActionCompatParcelizer = isopeninternalroom_runtime;
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(0, 0, null, 7);
        this.IconCompatParcelizer = sharedFlowImplRemoteActionCompatParcelizer;
        this.read = sharedFlowImplRemoteActionCompatParcelizer;
    }

    public final Flow read() {
        int i = 2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1 flowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1RemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(new ComposableLambdaImpl$invoke$1(2, this.MediaDescriptionCompat, SideMenuCacheImpl.class, "get", "get(Ljava/lang/Long;)Lkotlinx/coroutines/flow/Flow;", 4, 4), FlowKt.read(new SaveShiftInfo$invoke$2(this, shortNewsContentCardView, 19)));
        ((inCompatibilityMode) this.RemoteActionCompatParcelizer).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Flow flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(flowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1RemoteActionCompatParcelizer, DefaultIoScheduler.RemoteActionCompatParcelizer);
        int i2 = MediaBrowserCompatMediaItem + 47;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return flowRemoteActionCompatParcelizer;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: fetchSideMenu-IoAF18A, reason: not valid java name */
    public final Object m5068fetchSideMenuIoAF18A(ContinuationImpl continuationImpl) {
        SideMenuRepository$fetchSideMenu$1 sideMenuRepository$fetchSideMenu$1;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 11;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof SideMenuRepository$fetchSideMenu$1) {
            sideMenuRepository$fetchSideMenu$1 = (SideMenuRepository$fetchSideMenu$1) continuationImpl;
            int i4 = sideMenuRepository$fetchSideMenu$1.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                sideMenuRepository$fetchSideMenu$1.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                sideMenuRepository$fetchSideMenu$1 = new SideMenuRepository$fetchSideMenu$1(this, continuationImpl);
            }
        } else {
            sideMenuRepository$fetchSideMenu$1 = new SideMenuRepository$fetchSideMenu$1(this, continuationImpl);
        }
        Object objWithContext = sideMenuRepository$fetchSideMenu$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = sideMenuRepository$fetchSideMenu$1.RemoteActionCompatParcelizer;
        if (i5 != 0) {
            int i6 = MediaSessionCompatQueueItem + 63;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i8 = MediaBrowserCompatMediaItem + 89;
                MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            ((inCompatibilityMode) this.RemoteActionCompatParcelizer).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
            SideMenuRepository$fetchSideMenu$2 sideMenuRepository$fetchSideMenu$2 = new SideMenuRepository$fetchSideMenu$2(this, null);
            sideMenuRepository$fetchSideMenu$1.RemoteActionCompatParcelizer = 1;
            objWithContext = BuildersKt.withContext(defaultIoScheduler, sideMenuRepository$fetchSideMenu$2, sideMenuRepository$fetchSideMenu$1);
            if (objWithContext == coroutineSingletons) {
                int i9 = MediaSessionCompatQueueItem + 57;
                MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return coroutineSingletons;
            }
        }
        return ((onItemDismiss) objWithContext).IconCompatParcelizer;
    }
}
