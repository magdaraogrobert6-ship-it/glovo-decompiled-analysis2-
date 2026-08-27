package com.foodora.courier.legacy.ui.main;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SimpleActor$offer$2;
import coil3.memory.MemoryCacheService;
import com.data.util.AndroidScheduleProvider;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import com.roadrunner.home.HomeFragment;
import com.ui.common.base.BaseRxViewModel;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.maybe.MaybeFilterSingle;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import io.reactivex.internal.operators.maybe.MaybeSubscribeOn;
import io.reactivex.internal.operators.mixed.SingleFlatMapObservable;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.internal.operators.single.SingleObserveOn;
import kotlinx.coroutines.BuildersKt;
import o.AndroidGraphicsContext2;
import o.ShortNewsContentCardView;
import o.accessgetIntersectcp;
import o.createFromParcel;
import o.getEmannotations;
import o.getMinWidth;
import o.getPivotOffsetF1C5BW0;
import o.getReject5zf0vsI;
import o.getSegmentFrequentTick5zf0vsI;
import o.setVerticalStyle;
import o.toBitmapConfig1JJdX4A;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class PushTokenUpdateViewModel extends BaseRxViewModel {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final getMinWidth IconCompatParcelizer;
    public final AndroidGraphicsContext2 MediaBrowserCompatMediaItem;
    public final AndroidGraphicsContext2 MediaMetadataCompat;
    public final AndroidGraphicsContext2 RatingCompat;
    public final getSegmentFrequentTick5zf0vsI RemoteActionCompatParcelizer;
    public final AndroidGraphicsContext2 read;
    public final setVerticalStyle serializer;
    public final AndroidGraphicsContext2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushTokenUpdateViewModel(getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, getMinWidth getminwidth, getSegmentFrequentTick5zf0vsI getsegmentfrequenttick5zf0vsi, setVerticalStyle setverticalstyle, MemoryCacheService memoryCacheService) {
        super(getpivotoffsetf1c5bw0);
        getpivotoffsetf1c5bw0.getClass();
        getminwidth.getClass();
        getsegmentfrequenttick5zf0vsi.getClass();
        setverticalstyle.getClass();
        memoryCacheService.getClass();
        this.IconCompatParcelizer = getminwidth;
        this.RemoteActionCompatParcelizer = getsegmentfrequenttick5zf0vsi;
        this.serializer = setverticalstyle;
        AndroidGraphicsContext2 androidGraphicsContext2 = new AndroidGraphicsContext2();
        this.read = androidGraphicsContext2;
        this.RatingCompat = androidGraphicsContext2;
        AndroidGraphicsContext2 androidGraphicsContext3 = new AndroidGraphicsContext2();
        this.MediaMetadataCompat = androidGraphicsContext3;
        AndroidGraphicsContext2 androidGraphicsContext4 = new AndroidGraphicsContext2();
        this.write = androidGraphicsContext4;
        this.MediaBrowserCompatMediaItem = androidGraphicsContext4;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new SimpleActor$offer$2(new StateProviderImpl$special$$inlined$map$2(((getEmannotations) memoryCacheService.RemoteActionCompatParcelizer).IconCompatParcelizer, 1), (ShortNewsContentCardView) null, this), 3);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        androidGraphicsContext3.RemoteActionCompatParcelizer(createfromparcel);
        CompositeDisposable compositeDisposableParcelableVolumeInfo = ParcelableVolumeInfo();
        ObservableSubscribeOn observableSubscribeOn = new ObservableSubscribeOn(new SingleFlatMapObservable(Single.serializer(createfromparcel), new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(13, new getReject5zf0vsI(this, 2))), ((AndroidScheduleProvider) PlaybackStateCompat()).IconCompatParcelizer());
        ((AndroidScheduleProvider) PlaybackStateCompat()).getClass();
        compositeDisposableParcelableVolumeInfo.read(observableSubscribeOn.RemoteActionCompatParcelizer(AndroidSchedulers.RemoteActionCompatParcelizer()).subscribe(new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(14, new getReject5zf0vsI(this, 3)), new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(9, new HomeFragment.AnonymousClass1(1, Timber.RemoteActionCompatParcelizer, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 8))));
        RemoteActionCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        CompositeDisposable compositeDisposableParcelableVolumeInfo = ParcelableVolumeInfo();
        getSegmentFrequentTick5zf0vsI getsegmentfrequenttick5zf0vsi = this.RemoteActionCompatParcelizer;
        MaybeSubscribeOn maybeSubscribeOn = new MaybeSubscribeOn(new MaybeFilterSingle(new SingleObserveOn(getsegmentfrequenttick5zf0vsi.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer().write(((AndroidScheduleProvider) getsegmentfrequenttick5zf0vsi.serializer).IconCompatParcelizer()), AndroidSchedulers.RemoteActionCompatParcelizer()), new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(10, new getReject5zf0vsI(this, 0))), ((AndroidScheduleProvider) PlaybackStateCompat()).IconCompatParcelizer());
        ((AndroidScheduleProvider) PlaybackStateCompat()).getClass();
        Disposable disposableSubscribe = new MaybeObserveOn(maybeSubscribeOn, AndroidSchedulers.RemoteActionCompatParcelizer()).subscribe(new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(11, new getReject5zf0vsI(this, 1)), new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(12, new accessgetIntersectcp(26)));
        disposableSubscribe.getClass();
        compositeDisposableParcelableVolumeInfo.getClass();
        compositeDisposableParcelableVolumeInfo.read(disposableSubscribe);
        int i2 = MediaSessionCompatQueueItem + 29;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
