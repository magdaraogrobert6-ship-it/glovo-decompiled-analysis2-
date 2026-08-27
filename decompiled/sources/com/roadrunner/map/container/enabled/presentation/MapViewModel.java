package com.roadrunner.map.container.enabled.presentation;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.map.container.enabled.usecases.recenter.RecenterMapTriggerImpl;
import com.roadrunner.map.container.safearea.SafeAreaPublisherImpl;
import io.grpc.internal.SharedResourcePool;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import o.E;
import o.ImageHeaderParserImageType;
import o.ShortNewsContentCardView;
import o.SimpleExecutableQuery;
import o.WindowAreaComponentApi3Requirements;
import o.access500;
import o.consumeFlingInStretch;
import o.dg;
import o.dh;
import o.e4;
import o.fillLineHorizontalBoundsui_text;
import o.getContentViewGroupParentLayout;
import o.getPivotOffsetF1C5BW0;
import o.indexForKey;
import o.isAdapterPositionOnScreen;
import o.isOpenInternalroom_runtime;
import o.isStateSaved;
import o.mergeJsonObjects;
import o.setUseTempTrackingTableroom_runtime;
import o.transferSessionPackageI;
import okio.internal.ResourceFileSystem$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class MapViewModel extends ViewModel {
    private static int PlaybackStateCompat = 1;
    private static int PlaybackStateCompatCustomAction;
    public final isOpenInternalroom_runtime IconCompatParcelizer;
    public final consumeFlingInStretch MediaBrowserCompatMediaItem;
    public final SharedResourcePool MediaDescriptionCompat;
    public final dg MediaMetadataCompat;
    public final RecenterMapTriggerImpl MediaSessionCompatQueueItem;
    public final CompositeDisposable MediaSessionCompatResultReceiverWrapper;
    public final SafeAreaPublisherImpl ParcelableVolumeInfo;
    public final isAdapterPositionOnScreen RatingCompat;
    public final WindowAreaComponentApi3Requirements RemoteActionCompatParcelizer;
    public final isStateSaved read;
    public boolean serializer;
    public final dh write;

    public MapViewModel(RecenterMapTriggerImpl recenterMapTriggerImpl, dg dgVar, getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, WindowAreaComponentApi3Requirements windowAreaComponentApi3Requirements, consumeFlingInStretch consumeflinginstretch, isStateSaved isstatesaved, SafeAreaPublisherImpl safeAreaPublisherImpl, isOpenInternalroom_runtime isopeninternalroom_runtime, e4 e4Var, SharedResourcePool sharedResourcePool) {
        recenterMapTriggerImpl.getClass();
        dgVar.getClass();
        getpivotoffsetf1c5bw0.getClass();
        windowAreaComponentApi3Requirements.getClass();
        consumeflinginstretch.getClass();
        isstatesaved.getClass();
        safeAreaPublisherImpl.getClass();
        isopeninternalroom_runtime.getClass();
        e4Var.getClass();
        sharedResourcePool.getClass();
        this.MediaSessionCompatQueueItem = recenterMapTriggerImpl;
        this.MediaMetadataCompat = dgVar;
        this.RemoteActionCompatParcelizer = windowAreaComponentApi3Requirements;
        this.MediaBrowserCompatMediaItem = consumeflinginstretch;
        this.read = isstatesaved;
        this.ParcelableVolumeInfo = safeAreaPublisherImpl;
        this.IconCompatParcelizer = isopeninternalroom_runtime;
        this.MediaDescriptionCompat = sharedResourcePool;
        isAdapterPositionOnScreen isadapterpositiononscreen = new isAdapterPositionOnScreen(new ResourceFileSystem$$ExternalSyntheticLambda0(7, this));
        this.RatingCompat = isadapterpositiononscreen;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
        access500 access500Var = e4Var.serializer;
        this.write = new dh((access500) ((indexForKey) access500Var.RatingCompat).write(), getcontentviewgroupparentlayout, new SharedResourcePool(24), (SafeAreaPublisherImpl) ((mergeJsonObjects) access500Var.serializer).write(), (SaveHeatmapUrlImpl) ((SimpleExecutableQuery) access500Var.IconCompatParcelizer).write(), new ImageHeaderParserImageType(), (SharedResourcePool) ((SimpleExecutableQuery) access500Var.MediaDescriptionCompat).write(), (E) ((mergeJsonObjects) access500Var.write).write(), (transferSessionPackageI) ((mergeJsonObjects) access500Var.MediaSessionCompatQueueItem).write(), (RouterLogger) ((setUseTempTrackingTableroom_runtime) access500Var.read).write(), (fillLineHorizontalBoundsui_text) ((mergeJsonObjects) access500Var.MediaMetadataCompat).write(), (CanRequestLocationUpdatesImpl) ((mergeJsonObjects) access500Var.RemoteActionCompatParcelizer).write());
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.MediaSessionCompatResultReceiverWrapper = compositeDisposable;
        PublishSubject publishSubject = recenterMapTriggerImpl.RemoteActionCompatParcelizer;
        Scheduler scheduler = Schedulers.RemoteActionCompatParcelizer;
        OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 = RxJavaPlugins.write;
        if (onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 != null) {
            try {
                scheduler = (Scheduler) onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.apply(scheduler);
            } catch (Throwable th) {
                throw ExceptionHelper.write(th);
            }
        } else {
            int i = PlaybackStateCompatCustomAction + 29;
            PlaybackStateCompat = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        }
        scheduler.getClass();
        publishSubject.getClass();
        Disposable disposableSubscribe = new ObservableSubscribeOn(publishSubject, scheduler).RemoteActionCompatParcelizer(AndroidSchedulers.RemoteActionCompatParcelizer()).subscribe(new PerseusInitializerImpl$$ExternalSyntheticLambda0(26, new RoomDatabase$$ExternalSyntheticLambda2(26, this)), new PerseusInitializerImpl$$ExternalSyntheticLambda0(27, new MapApiError$$ExternalSyntheticLambda1(18)));
        disposableSubscribe.getClass();
        compositeDisposable.read(disposableSubscribe);
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), null, null, new MapViewModel$observeSafeArea$1(this, shortNewsContentCardView, 1), 3);
        BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), null, null, new MapViewModel$observeSafeArea$1(this, shortNewsContentCardView, 0), 3);
        int i3 = PlaybackStateCompat + 103;
        PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 83;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaSessionCompatResultReceiverWrapper.read();
        YieldKt.write((getContentViewGroupParentLayout) this.RatingCompat.MediaSessionCompatResultReceiverWrapper(), (CancellationException) null);
        int i4 = PlaybackStateCompatCustomAction + 121;
        PlaybackStateCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
