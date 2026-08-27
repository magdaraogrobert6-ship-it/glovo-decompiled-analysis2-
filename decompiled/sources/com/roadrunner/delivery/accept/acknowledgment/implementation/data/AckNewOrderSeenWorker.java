package com.roadrunner.delivery.accept.acknowledgment.implementation.data;

import android.content.Context;
import androidx.compose.ui.graphics.Fields;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import coil3.ExtrasKt;
import com.data.util.AndroidScheduleProvider;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import com.roadrunner.delivery.accept.repository.DeliveryAcceptDataRepository;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.internal.operators.completable.CompletablePeek;
import io.reactivex.internal.operators.completable.CompletableToSingle;
import io.reactivex.internal.operators.single.SingleJust;
import io.reactivex.internal.operators.single.SingleOnErrorReturn;
import io.sentry.HostnameCache$$ExternalSyntheticLambda0;
import java.time.Instant;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.rx2.DispatcherScheduler;
import kotlinx.coroutines.rx2.RxCompletableKt;
import o.ClickableSaverlambda1;
import o.ShortNewsContentCardView;
import o.TextUnitSaverlambda1;
import o.TextUnitTypeSaverlambda0;
import o.UrlAnnotationSaverlambda1;
import o.VerbatimTtsAnnotationSaverlambda1;
import o.accessgetAmbientShadowColor0d7_KjUjd;
import o.accessgetTextCentercp;
import o.accesssetBlendModes9anfk8jd;
import o.accesssetRenderEffectjd;
import o.createFromParcel;
import o.getPivotOffsetF1C5BW0;
import o.onItemDismiss;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdalYb5VtOc2Bfai2EaTTJcq9AhA;

/* JADX INFO: loaded from: classes3.dex */
public final class AckNewOrderSeenWorker extends RxWorker {
    private static int PlaybackStateCompat = 1;
    private static int PlaybackStateCompatCustomAction;
    public final ClickableSaverlambda1 MediaDescriptionCompat;
    public final TextUnitTypeSaverlambda0 MediaMetadataCompat;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 MediaSessionCompatQueueItem;
    public final WorkerParameters ParcelableVolumeInfo;
    public final getPivotOffsetF1C5BW0 RatingCompat;
    public final VerbatimTtsAnnotationSaverlambda1 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AckNewOrderSeenWorker(Context context, WorkerParameters workerParameters, ClickableSaverlambda1 clickableSaverlambda1, TextUnitTypeSaverlambda0 textUnitTypeSaverlambda0, getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, VerbatimTtsAnnotationSaverlambda1 verbatimTtsAnnotationSaverlambda1) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        clickableSaverlambda1.getClass();
        textUnitTypeSaverlambda0.getClass();
        getpivotoffsetf1c5bw0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        verbatimTtsAnnotationSaverlambda1.getClass();
        this.ParcelableVolumeInfo = workerParameters;
        this.MediaDescriptionCompat = clickableSaverlambda1;
        this.MediaMetadataCompat = textUnitTypeSaverlambda0;
        this.RatingCompat = getpivotoffsetf1c5bw0;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = verbatimTtsAnnotationSaverlambda1;
    }

    @Override // androidx.work.RxWorker
    public final Scheduler RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 59;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Scheduler schedulerIconCompatParcelizer = ((AndroidScheduleProvider) this.RatingCompat).IconCompatParcelizer();
        int i4 = PlaybackStateCompatCustomAction + 13;
        PlaybackStateCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return schedulerIconCompatParcelizer;
        }
        throw null;
    }

    @Override // androidx.work.RxWorker
    public final Single serializer() {
        int i = 2 % 2;
        VerbatimTtsAnnotationSaverlambda1 verbatimTtsAnnotationSaverlambda1 = this.write;
        verbatimTtsAnnotationSaverlambda1.getClass();
        SingleJust singleJustSerializer = Single.serializer(new accesssetBlendModes9anfk8jd(192837, verbatimTtsAnnotationSaverlambda1.serializer()));
        int i2 = PlaybackStateCompatCustomAction + 5;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 78 / 0;
        }
        return singleJustSerializer;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$storeAcknowledgmentTimestamp(AckNewOrderSeenWorker ackNewOrderSeenWorker, ContinuationImpl continuationImpl) {
        UrlAnnotationSaverlambda1 urlAnnotationSaverlambda1;
        int i = 2 % 2;
        if (continuationImpl instanceof UrlAnnotationSaverlambda1) {
            urlAnnotationSaverlambda1 = (UrlAnnotationSaverlambda1) continuationImpl;
            int i2 = urlAnnotationSaverlambda1.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                urlAnnotationSaverlambda1.write = i2 - Integer.MIN_VALUE;
            } else {
                urlAnnotationSaverlambda1 = new UrlAnnotationSaverlambda1(ackNewOrderSeenWorker, continuationImpl);
            }
        } else {
            urlAnnotationSaverlambda1 = new UrlAnnotationSaverlambda1(ackNewOrderSeenWorker, continuationImpl);
        }
        Object obj = urlAnnotationSaverlambda1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = urlAnnotationSaverlambda1.write;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            long jIconCompatParcelizer = ackNewOrderSeenWorker.ParcelableVolumeInfo.RemoteActionCompatParcelizer.IconCompatParcelizer("delivery_id");
            TextUnitTypeSaverlambda0 textUnitTypeSaverlambda0 = ackNewOrderSeenWorker.MediaMetadataCompat;
            TextUnitSaverlambda1 textUnitSaverlambda1 = new TextUnitSaverlambda1(jIconCompatParcelizer);
            urlAnnotationSaverlambda1.write = 1;
            if (((StoreAcknowledgmentTimestampImpl) textUnitTypeSaverlambda0).m4896invokegIAlus(textUnitSaverlambda1, urlAnnotationSaverlambda1) == coroutineSingletons) {
                int i4 = PlaybackStateCompat + 55;
                PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i5 = PlaybackStateCompat + 15;
                PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 45 / 0;
                }
                return null;
            }
            int i7 = PlaybackStateCompatCustomAction + 9;
            PlaybackStateCompat = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((onItemDismiss) obj).getClass();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ((onItemDismiss) obj).getClass();
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i8 = PlaybackStateCompat + 63;
        PlaybackStateCompatCustomAction = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return createfromparcel;
        }
        throw null;
    }

    @Override // androidx.work.RxWorker
    public final Single read() {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = PlaybackStateCompatCustomAction + 73;
        PlaybackStateCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        WorkerParameters workerParameters = this.MediaBrowserCompatMediaItem;
        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd = workerParameters.RemoteActionCompatParcelizer;
        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd2 = workerParameters.RemoteActionCompatParcelizer;
        long jIconCompatParcelizer = accessgetambientshadowcolor0d7_kjujd.IconCompatParcelizer("initial_time");
        if (((Instant) this.MediaSessionCompatQueueItem.invoke()).isAfter(Instant.ofEpochMilli(jIconCompatParcelizer).plusSeconds(5400L))) {
            SingleJust singleJustSerializer = Single.serializer(new accesssetRenderEffectjd());
            int i5 = PlaybackStateCompat + 9;
            PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return singleJustSerializer;
        }
        String strRemoteActionCompatParcelizer = accessgetambientshadowcolor0d7_kjujd2.RemoteActionCompatParcelizer("acknowledgment_url");
        String str = strRemoteActionCompatParcelizer == null ? "" : strRemoteActionCompatParcelizer;
        String strRemoteActionCompatParcelizer2 = accessgetambientshadowcolor0d7_kjujd2.RemoteActionCompatParcelizer("confirmation_number");
        String str2 = strRemoteActionCompatParcelizer2 == null ? "" : strRemoteActionCompatParcelizer2;
        DeliveryAcceptDataRepository deliveryAcceptDataRepository = (DeliveryAcceptDataRepository) this.MediaDescriptionCompat;
        String value = deliveryAcceptDataRepository.MediaSessionCompatQueueItem.getValue();
        deliveryAcceptDataRepository.getClass();
        value.getClass();
        Completable completableSerializer = deliveryAcceptDataRepository.RemoteActionCompatParcelizer.serializer(str, str2, value, jIconCompatParcelizer);
        RetryWithDelay$$ExternalSyntheticLambda1 retryWithDelay$$ExternalSyntheticLambda1 = new RetryWithDelay$$ExternalSyntheticLambda1(7, new accessgetTextCentercp(25));
        completableSerializer.getClass();
        CompletablePeek completablePeek = new CompletablePeek(completableSerializer, retryWithDelay$$ExternalSyntheticLambda1, Functions.read);
        Scheduler schedulerIconCompatParcelizer = ((AndroidScheduleProvider) this.RatingCompat).IconCompatParcelizer();
        return new SingleOnErrorReturn(new CompletableToSingle(new CompletableAndThenCompletable(completablePeek, new CompletableOnErrorComplete(RxCompletableKt.RemoteActionCompatParcelizer(schedulerIconCompatParcelizer instanceof DispatcherScheduler ? ((DispatcherScheduler) schedulerIconCompatParcelizer).RemoteActionCompatParcelizer : new r8lambdalYb5VtOc2Bfai2EaTTJcq9AhA(schedulerIconCompatParcelizer), new ClearDataUseCaseImpl$invoke$2(this, (ShortNewsContentCardView) null, 11)))), new HostnameCache$$ExternalSyntheticLambda0(i)), new RetryWithDelay$$ExternalSyntheticLambda1(6, this));
    }
}
