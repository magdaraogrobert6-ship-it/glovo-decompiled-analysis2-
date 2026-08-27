package com.roadrunner.util.sound;

import android.app.Application;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaMetadataRetriever;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigator.R;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.web.presentation.WebViewViewModel$handleWebViewError$1;
import dagger.Lazy;
import io.grpc.internal.CallTracer;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.sync.MutexImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.setCarryoverInAppMessage;
import o.subscribeToChangeUserEventslambda31;
import o.subscribeToContentCardsUpdateslambda3;
import o.subscribeToContentCardsUpdateslambda31;
import o.subscribeToNetworkFailureslambda1;
import o.transferSessionPackageI;
import o.updateAdidI;
import okio.Okio;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultForegroundSoundManager {
    private static int MediaSessionCompatToken = 1;
    private static int ParcelableVolumeInfo;
    public final Lazy IconCompatParcelizer;
    public Ringtone MediaBrowserCompatMediaItem;
    public Ringtone MediaDescriptionCompat;
    public final MutexImpl MediaMetadataCompat;
    public final transferSessionPackageI MediaSessionCompatQueueItem;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaSessionCompatResultReceiverWrapper;
    public final getContentViewGroupParentLayout PlaybackStateCompatCustomAction;
    public final subscribeToNetworkFailureslambda1 RatingCompat;
    public final subscribeToChangeUserEventslambda31 RemoteActionCompatParcelizer;
    public final Application read;
    public final subscribeToContentCardsUpdateslambda31 serializer;
    public final CallTracer write;

    public DefaultForegroundSoundManager(CallTracer callTracer, getContentViewGroupParentLayout getcontentviewgroupparentlayout, Application application, isOpenInternalroom_runtime isopeninternalroom_runtime, subscribeToChangeUserEventslambda31 subscribetochangeusereventslambda31, subscribeToContentCardsUpdateslambda31 subscribetocontentcardsupdateslambda31, subscribeToNetworkFailureslambda1 subscribetonetworkfailureslambda1, Lazy lazy, transferSessionPackageI transfersessionpackagei) {
        getcontentviewgroupparentlayout.getClass();
        subscribetonetworkfailureslambda1.getClass();
        lazy.getClass();
        transfersessionpackagei.getClass();
        this.write = callTracer;
        this.PlaybackStateCompatCustomAction = getcontentviewgroupparentlayout;
        this.read = application;
        this.RemoteActionCompatParcelizer = subscribetochangeusereventslambda31;
        this.serializer = subscribetocontentcardsupdateslambda31;
        this.RatingCompat = subscribetonetworkfailureslambda1;
        this.IconCompatParcelizer = lazy;
        this.MediaSessionCompatQueueItem = transfersessionpackagei;
        this.MediaMetadataCompat = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
    }

    public static final void serializer(DefaultForegroundSoundManager defaultForegroundSoundManager, Ringtone ringtone) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 81;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) defaultForegroundSoundManager.MediaSessionCompatQueueItem;
        firebaseRemoteConfigImpl.getClass();
        Object[] objArr = {firebaseRemoteConfigImpl, updateAdidI.IS_OVERRIDE_SILENT_MODE_ENABLED};
        int iSerializer = R.serializer();
        if ((((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, R.serializer(), R.serializer(), -1762727220, R.serializer(), iSerializer, objArr)).booleanValue() || ((AudioManager) defaultForegroundSoundManager.IconCompatParcelizer.write()).getRingerMode() != 0) && ringtone != null) {
            int i4 = MediaSessionCompatToken + 97;
            ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                ringtone.play();
            } else {
                ringtone.play();
                throw null;
            }
        }
    }

    public final void serializer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 101;
        ParcelableVolumeInfo = i3 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 % 2 != 0) {
            shortNewsContentCardView.hashCode();
            throw null;
        }
        try {
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.MediaSessionCompatResultReceiverWrapper;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                int i4 = i2 + 75;
                ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                    shortNewsContentCardView.hashCode();
                    throw null;
                }
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            }
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.PlaybackStateCompatCustomAction;
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new DefaultForegroundSoundManager$play$1(this, shortNewsContentCardView, 1), 2);
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "An error occurred while stopping notification from new sound manager", new Object[0]);
        }
    }

    public final void write() {
        int i = 2 % 2;
        try {
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.MediaSessionCompatResultReceiverWrapper;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                int i2 = MediaSessionCompatToken + 67;
                ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.I_()) {
                    int i4 = ParcelableVolumeInfo + 81;
                    MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Notification job is already running. Skipping play request", new Object[1]);
                        return;
                    } else {
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Notification job is already running. Skipping play request", new Object[0]);
                        return;
                    }
                }
            }
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.PlaybackStateCompatCustomAction;
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            this.MediaSessionCompatResultReceiverWrapper = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new WebViewViewModel$handleWebViewError$1(this, (ShortNewsContentCardView) null, 3), 2);
            int i5 = MediaSessionCompatToken + 57;
            ParcelableVolumeInfo = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "An error occurred while playing notification from new sound manager", new Object[0]);
        }
    }

    public static final long RemoteActionCompatParcelizer(DefaultForegroundSoundManager defaultForegroundSoundManager, Context context) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 57;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Uri actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri(context, 1);
        long jLongValue = 0;
        if (actualDefaultRingtoneUri == null) {
            return 0L;
        }
        Long l = (Long) defaultForegroundSoundManager.RatingCompat.serializer.get(actualDefaultRingtoneUri);
        if (l != null) {
            return l.longValue();
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = mediaMetadataRetriever;
            try {
                mediaMetadataRetriever2.setDataSource(context, actualDefaultRingtoneUri);
                String strExtractMetadata = mediaMetadataRetriever2.extractMetadata(9);
                if (strExtractMetadata != null) {
                    int i4 = ParcelableVolumeInfo + 57;
                    MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    Long lParcelableVolumeInfo = setCarryoverInAppMessage.ParcelableVolumeInfo(strExtractMetadata);
                    if (lParcelableVolumeInfo != null) {
                        jLongValue = lParcelableVolumeInfo.longValue();
                        int i6 = ParcelableVolumeInfo + 33;
                        MediaSessionCompatToken = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                    }
                }
            } catch (Exception e) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to calculate ringtone length", new Object[0]);
            }
            Okio.RemoteActionCompatParcelizer(mediaMetadataRetriever, null);
            return jLongValue;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Okio.RemoteActionCompatParcelizer(mediaMetadataRetriever, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    public static final Object access$scheduleAudioFocusAbandonment(DefaultForegroundSoundManager defaultForegroundSoundManager, long j, ContinuationImpl continuationImpl) {
        subscribeToContentCardsUpdateslambda3 subscribetocontentcardsupdateslambda3;
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 107;
        int i3 = i2 % Fields.SpotShadowColor;
        ParcelableVolumeInfo = i3;
        int i4 = i2 % 2;
        subscribeToChangeUserEventslambda31 subscribetochangeusereventslambda31 = defaultForegroundSoundManager.RemoteActionCompatParcelizer;
        Object obj = null;
        if (continuationImpl instanceof subscribeToContentCardsUpdateslambda3) {
            int i5 = i3 + 19;
            MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = ((subscribeToContentCardsUpdateslambda3) continuationImpl).read;
                obj.hashCode();
                throw null;
            }
            subscribetocontentcardsupdateslambda3 = (subscribeToContentCardsUpdateslambda3) continuationImpl;
            int i7 = subscribetocontentcardsupdateslambda3.read;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                subscribetocontentcardsupdateslambda3.read = i7 - Integer.MIN_VALUE;
            } else {
                subscribetocontentcardsupdateslambda3 = new subscribeToContentCardsUpdateslambda3(defaultForegroundSoundManager, continuationImpl);
            }
        } else {
            subscribetocontentcardsupdateslambda3 = new subscribeToContentCardsUpdateslambda3(defaultForegroundSoundManager, continuationImpl);
        }
        Object obj2 = subscribetocontentcardsupdateslambda3.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = subscribetocontentcardsupdateslambda3.read;
        try {
            if (i8 != 0) {
                int i9 = MediaSessionCompatToken + 55;
                ParcelableVolumeInfo = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (i8 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = subscribetocontentcardsupdateslambda3.write;
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                int i11 = MediaSessionCompatToken + 65;
                ParcelableVolumeInfo = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                subscribetocontentcardsupdateslambda3.write = j;
                subscribetocontentcardsupdateslambda3.read = 1;
                if (DelayKt.delay(j, subscribetocontentcardsupdateslambda3) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            subscribetochangeusereventslambda31.RemoteActionCompatParcelizer();
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Audio Focus abandoned after " + j + "ms delay.", new Object[0]);
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "AudioFocus abandonment failed or was cancelled.", new Object[0]);
            subscribetochangeusereventslambda31.RemoteActionCompatParcelizer();
        }
        return createFromParcel.INSTANCE;
    }
}
