package com.roadrunner.helpcenter.businessmetrics;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.DefaultLifecycleObserver;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.accessisRenderNodeCompatiblecp;
import o.dump;
import o.getContentViewGroupParentLayout;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessMetricsTracker implements DefaultLifecycleObserver {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final dump IconCompatParcelizer;
    public final ContextScope MediaMetadataCompat;
    public final dump RatingCompat;
    public final isOpenInternalroom_runtime RemoteActionCompatParcelizer;
    public final getContentViewGroupParentLayout read;
    public final transferSessionPackageI serializer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU write;

    public BusinessMetricsTracker(transferSessionPackageI transfersessionpackagei, dump dumpVar, dump dumpVar2, getContentViewGroupParentLayout getcontentviewgroupparentlayout, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        transfersessionpackagei.getClass();
        dumpVar.getClass();
        dumpVar2.getClass();
        getcontentviewgroupparentlayout.getClass();
        isopeninternalroom_runtime.getClass();
        this.serializer = transfersessionpackagei;
        this.IconCompatParcelizer = dumpVar;
        this.RatingCompat = dumpVar2;
        this.read = getcontentviewgroupparentlayout;
        this.RemoteActionCompatParcelizer = isopeninternalroom_runtime;
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        this.MediaMetadataCompat = YieldKt.RemoteActionCompatParcelizer(DefaultIoScheduler.RemoteActionCompatParcelizer);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 47;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accessisrendernodecompatiblecp.getClass();
        JobKt.serializer(this.MediaMetadataCompat.serializer);
        int i4 = MediaSessionCompatQueueItem + 45;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        accessisrendernodecompatiblecp.getClass();
        JobKt.serializer(this.MediaMetadataCompat.serializer);
        ((inCompatibilityMode) this.RemoteActionCompatParcelizer).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(this.read, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new BusinessMetricsTracker$runTimer$1(this, null, 1), 2);
        int i2 = MediaBrowserCompatMediaItem + 55;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 32 / 0;
        }
    }
}
