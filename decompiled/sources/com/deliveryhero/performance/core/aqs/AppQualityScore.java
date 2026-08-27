package com.deliveryhero.performance.core.aqs;

import android.app.Application;
import androidx.room.Room;
import androidx.work.CoroutineWorker$startWork$1;
import com.roadrunner.home.HomeFragment;
import io.sentry.util.UrlUtils;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import o.BlurFilter;
import o.InnerShadowPainter;
import o.InnerShadowRenderer;
import o.SimpleItemTouchHelperCallback;
import o.accessgetWcp;
import o.and;
import o.getFloatValue;
import o.getIndex;
import o.getOnBackInvokedCallback;
import o.isAdapterPositionOnScreen;
import o.requestFocusBypassUnfocusableComposeView;

/* JADX INFO: loaded from: classes2.dex */
public final class AppQualityScore {
    public static volatile AppQualityScore IconCompatParcelizer;
    public static final accessgetWcp RemoteActionCompatParcelizer = new accessgetWcp(7);
    public final ExecutorCoroutineDispatcherImpl MediaBrowserCompatMediaItem;
    public final isAdapterPositionOnScreen MediaDescriptionCompat;
    public final InnerShadowRenderer MediaMetadataCompat;
    public final requestFocusBypassUnfocusableComposeView MediaSessionCompatQueueItem;
    public final getIndex MediaSessionCompatResultReceiverWrapper;
    public final isAdapterPositionOnScreen MediaSessionCompatToken;
    public final BlurFilter ParcelableVolumeInfo;
    public final ContextScope PlaybackStateCompat;
    public final isAdapterPositionOnScreen PlaybackStateCompatCustomAction;
    public final and RatingCompat;
    public final AtomicReference read;
    public final Application serializer;
    public boolean write;

    public AppQualityScore(Application application, BlurFilter blurFilter, getIndex getindex, requestFocusBypassUnfocusableComposeView requestfocusbypassunfocusablecomposeview) {
        this.serializer = application;
        this.ParcelableVolumeInfo = blurFilter;
        this.MediaSessionCompatResultReceiverWrapper = getindex;
        this.MediaSessionCompatQueueItem = requestfocusbypassunfocusablecomposeview;
        int i = 1;
        and andVar = new and(getOnBackInvokedCallback.RemoteActionCompatParcelizer, i);
        this.RatingCompat = andVar;
        ExecutorCoroutineDispatcherImpl executorCoroutineDispatcherImpl = LazyKt__LazyJVMKt.read("AppQualityScoreDispatcher");
        this.MediaBrowserCompatMediaItem = executorCoroutineDispatcherImpl;
        ContextScope contextScopeRemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(Room.read(UrlUtils.serializer(), executorCoroutineDispatcherImpl).plus(andVar));
        this.PlaybackStateCompat = contextScopeRemoteActionCompatParcelizer;
        this.MediaSessionCompatToken = new isAdapterPositionOnScreen(new InnerShadowRenderer(this, 0));
        this.MediaDescriptionCompat = new isAdapterPositionOnScreen(InnerShadowPainter.IconCompatParcelizer);
        this.PlaybackStateCompatCustomAction = new isAdapterPositionOnScreen(new InnerShadowRenderer(this, 2));
        this.read = new AtomicReference(SimpleItemTouchHelperCallback.serializer);
        InnerShadowRenderer innerShadowRenderer = new InnerShadowRenderer(this, i);
        this.MediaMetadataCompat = innerShadowRenderer;
        BuildersKt.RemoteActionCompatParcelizer(contextScopeRemoteActionCompatParcelizer, null, null, new CoroutineWorker$startWork$1(this, null, 4), 3);
        blurFilter.read(new getFloatValue(new HomeFragment.AnonymousClass1(1, this, AppQualityScore.class, "onAppStartToInteractiveReady", "onAppStartToInteractiveReady(Lcom/deliveryhero/performance/core/aqs/AppStartToInteractiveEvent;)V", 0, 3), innerShadowRenderer));
    }
}
