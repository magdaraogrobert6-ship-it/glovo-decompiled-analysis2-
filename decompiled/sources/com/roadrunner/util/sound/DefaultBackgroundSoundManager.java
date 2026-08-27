package com.roadrunner.util.sound;

import android.app.Application;
import android.media.Ringtone;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import dagger.Lazy;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.DelayKt;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.isOpenInternalroom_runtime;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.subscribeToChangeUserEventslambda31;
import o.subscribeToContentCardsUpdateslambda1;
import o.subscribeToContentCardsUpdateslambda31;
import o.subscribeToFeatureFlagsUpdateslambda30;
import o.subscribeToNetworkFailureslambda1;
import o.transferSessionPackageI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultBackgroundSoundManager {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int PlaybackStateCompat;
    public final Application IconCompatParcelizer;
    public final getContentViewGroupParentLayout MediaBrowserCompatMediaItem;
    public final subscribeToNetworkFailureslambda1 MediaDescriptionCompat;
    public final transferSessionPackageI MediaMetadataCompat;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaSessionCompatQueueItem;
    public Ringtone RatingCompat;
    public final Lazy RemoteActionCompatParcelizer;
    public final subscribeToFeatureFlagsUpdateslambda30 read;
    public final subscribeToChangeUserEventslambda31 serializer;
    public final subscribeToContentCardsUpdateslambda31 write;

    public DefaultBackgroundSoundManager(getContentViewGroupParentLayout getcontentviewgroupparentlayout, Application application, isOpenInternalroom_runtime isopeninternalroom_runtime, subscribeToFeatureFlagsUpdateslambda30 subscribetofeatureflagsupdateslambda30, subscribeToChangeUserEventslambda31 subscribetochangeusereventslambda31, subscribeToContentCardsUpdateslambda31 subscribetocontentcardsupdateslambda31, subscribeToNetworkFailureslambda1 subscribetonetworkfailureslambda1, Lazy lazy, transferSessionPackageI transfersessionpackagei) {
        this.MediaBrowserCompatMediaItem = getcontentviewgroupparentlayout;
        this.IconCompatParcelizer = application;
        this.read = subscribetofeatureflagsupdateslambda30;
        this.serializer = subscribetochangeusereventslambda31;
        this.write = subscribetocontentcardsupdateslambda31;
        this.MediaDescriptionCompat = subscribetonetworkfailureslambda1;
        this.RemoteActionCompatParcelizer = lazy;
        this.MediaMetadataCompat = transfersessionpackagei;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r1.isPlaying() == true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void read(android.net.Uri r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.util.sound.DefaultBackgroundSoundManager.PlaybackStateCompat
            int r1 = r1 + 87
            int r2 = r1 % 128
            com.roadrunner.util.sound.DefaultBackgroundSoundManager.MediaSessionCompatResultReceiverWrapper = r2
            int r1 = r1 % r0
            o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r1 = r5.MediaSessionCompatQueueItem
            r2 = 1
            if (r1 == 0) goto L21
            boolean r1 = r1.I_()
            if (r1 != r2) goto L21
            int r6 = com.roadrunner.util.sound.DefaultBackgroundSoundManager.PlaybackStateCompat
            int r6 = r6 + 5
            int r1 = r6 % 128
            com.roadrunner.util.sound.DefaultBackgroundSoundManager.MediaSessionCompatResultReceiverWrapper = r1
            int r6 = r6 % r0
            goto L34
        L21:
            android.media.Ringtone r1 = r5.RatingCompat
            if (r1 == 0) goto L3f
            int r3 = com.roadrunner.util.sound.DefaultBackgroundSoundManager.MediaSessionCompatResultReceiverWrapper
            int r3 = r3 + 63
            int r4 = r3 % 128
            com.roadrunner.util.sound.DefaultBackgroundSoundManager.PlaybackStateCompat = r4
            int r3 = r3 % r0
            boolean r1 = r1.isPlaying()
            if (r1 != r2) goto L3f
        L34:
            timber.log.Timber$Forest r6 = timber.log.Timber.RemoteActionCompatParcelizer
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "New delivery sound is already playing. Skipping play request"
            r6.IconCompatParcelizer(r1, r0)
            return
        L3f:
            kotlinx.coroutines.scheduling.DefaultScheduler r1 = o.prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer
            kotlinx.coroutines.scheduling.DefaultIoScheduler r1 = kotlinx.coroutines.scheduling.DefaultIoScheduler.RemoteActionCompatParcelizer
            kotlinx.coroutines.rx2.RxConvertKt$asFlow$1 r2 = new kotlinx.coroutines.rx2.RxConvertKt$asFlow$1
            r3 = 21
            r4 = 0
            r2.<init>(r5, r6, r4, r3)
            o.getContentViewGroupParentLayout r6 = r5.MediaBrowserCompatMediaItem
            o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r6 = kotlinx.coroutines.BuildersKt.RemoteActionCompatParcelizer(r6, r1, r4, r2, r0)
            r5.MediaSessionCompatQueueItem = r6
            int r6 = com.roadrunner.util.sound.DefaultBackgroundSoundManager.MediaSessionCompatResultReceiverWrapper
            int r6 = r6 + 73
            int r1 = r6 % 128
            com.roadrunner.util.sound.DefaultBackgroundSoundManager.PlaybackStateCompat = r1
            int r6 = r6 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.util.sound.DefaultBackgroundSoundManager.read(android.net.Uri):void");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object access$scheduleAudioFocusAbandonment(DefaultBackgroundSoundManager defaultBackgroundSoundManager, long j, ContinuationImpl continuationImpl) {
        subscribeToContentCardsUpdateslambda1 subscribetocontentcardsupdateslambda1;
        int i = 2 % 2;
        subscribeToChangeUserEventslambda31 subscribetochangeusereventslambda31 = defaultBackgroundSoundManager.serializer;
        if (continuationImpl instanceof subscribeToContentCardsUpdateslambda1) {
            subscribetocontentcardsupdateslambda1 = (subscribeToContentCardsUpdateslambda1) continuationImpl;
            int i2 = subscribetocontentcardsupdateslambda1.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                subscribetocontentcardsupdateslambda1.serializer = i2 - Integer.MIN_VALUE;
            } else {
                subscribetocontentcardsupdateslambda1 = new subscribeToContentCardsUpdateslambda1(defaultBackgroundSoundManager, continuationImpl);
            }
        } else {
            subscribetocontentcardsupdateslambda1 = new subscribeToContentCardsUpdateslambda1(defaultBackgroundSoundManager, continuationImpl);
        }
        Object obj = subscribetocontentcardsupdateslambda1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = subscribetocontentcardsupdateslambda1.serializer;
        try {
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                subscribetocontentcardsupdateslambda1.RemoteActionCompatParcelizer = j;
                subscribetocontentcardsupdateslambda1.serializer = 1;
                if (DelayKt.delay(j, subscribetocontentcardsupdateslambda1) == coroutineSingletons) {
                    int i4 = MediaSessionCompatResultReceiverWrapper + 69;
                    PlaybackStateCompat = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        return coroutineSingletons;
                    }
                    throw null;
                }
            } else {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    int i5 = MediaSessionCompatResultReceiverWrapper + 87;
                    PlaybackStateCompat = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return null;
                }
                j = subscribetocontentcardsupdateslambda1.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
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
