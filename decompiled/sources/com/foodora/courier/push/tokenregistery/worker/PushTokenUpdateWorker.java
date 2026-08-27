package com.foodora.courier.push.tokenregistery.worker;

import android.content.Context;
import androidx.cardview.widget.CardView$1;
import androidx.compose.ui.graphics.Fields;
import androidx.work.CoroutineWorker;
import androidx.work.CoroutineWorker$startWork$1;
import androidx.work.WorkerParameters;
import coil3.Extras$Key;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl;
import com.roadrunner.experience_tools.braze.BrazeManagerImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.EnumColumnAdapter;
import o.InterceptedKeyInputNode;
import o.SemanticsPropertiesContentDescription1;
import o.ShortNewsContentCardView;
import o.executeAsList;
import o.getOnEvent;
import o.handleThirdPartySharingCallbackI;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.onInterceptKeyBeforeSoftKeyboardZmokQxo;
import o.parseLayoutDescription;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.setAmbientShadowColor8_81llA;
import o.setClip;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class PushTokenUpdateWorker extends CoroutineWorker {
    private static int ParcelableVolumeInfo = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final handleThirdPartySharingCallbackI MediaDescriptionCompat;
    public final EnumColumnAdapter MediaMetadataCompat;
    public final isOpenInternalroom_runtime MediaSessionCompatQueueItem;
    public final InterceptedKeyInputNode MediaSessionCompatResultReceiverWrapper;
    public final onInterceptKeyBeforeSoftKeyboardZmokQxo MediaSessionCompatToken;
    public final SemanticsPropertiesContentDescription1 RatingCompat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushTokenUpdateWorker(Context context, WorkerParameters workerParameters, SemanticsPropertiesContentDescription1 semanticsPropertiesContentDescription1, onInterceptKeyBeforeSoftKeyboardZmokQxo oninterceptkeybeforesoftkeyboardzmokqxo, handleThirdPartySharingCallbackI handlethirdpartysharingcallbacki, InterceptedKeyInputNode interceptedKeyInputNode, isOpenInternalroom_runtime isopeninternalroom_runtime, EnumColumnAdapter enumColumnAdapter) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        semanticsPropertiesContentDescription1.getClass();
        oninterceptkeybeforesoftkeyboardzmokqxo.getClass();
        handlethirdpartysharingcallbacki.getClass();
        interceptedKeyInputNode.getClass();
        isopeninternalroom_runtime.getClass();
        enumColumnAdapter.getClass();
        this.RatingCompat = semanticsPropertiesContentDescription1;
        this.MediaSessionCompatToken = oninterceptkeybeforesoftkeyboardzmokqxo;
        this.MediaDescriptionCompat = handlethirdpartysharingcallbacki;
        this.MediaSessionCompatResultReceiverWrapper = interceptedKeyInputNode;
        this.MediaSessionCompatQueueItem = isopeninternalroom_runtime;
        this.MediaMetadataCompat = enumColumnAdapter;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object doWork(ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        int i = 2 % 2;
        ((inCompatibilityMode) this.MediaSessionCompatQueueItem).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new CoroutineWorker$startWork$1(this, null, 9), shortNewsContentCardView);
        int i2 = PlaybackStateCompatCustomAction + 93;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objWithContext;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public static final Object access$registerPushToken(PushTokenUpdateWorker pushTokenUpdateWorker, String str, ContinuationImpl continuationImpl) {
        getOnEvent getonevent;
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 65;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            handleThirdPartySharingCallbackI handlethirdpartysharingcallbacki = pushTokenUpdateWorker.MediaDescriptionCompat;
            boolean z = continuationImpl instanceof getOnEvent;
            obj.hashCode();
            throw null;
        }
        handleThirdPartySharingCallbackI handlethirdpartysharingcallbacki2 = pushTokenUpdateWorker.MediaDescriptionCompat;
        if (continuationImpl instanceof getOnEvent) {
            getonevent = (getOnEvent) continuationImpl;
            int i3 = getonevent.IconCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                getonevent.IconCompatParcelizer = i3 - Integer.MIN_VALUE;
            } else {
                getonevent = new getOnEvent(pushTokenUpdateWorker, continuationImpl);
            }
        } else {
            getonevent = new getOnEvent(pushTokenUpdateWorker, continuationImpl);
        }
        Object obj2 = getonevent.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = getonevent.IconCompatParcelizer;
        try {
            if (i4 != 0) {
                int i5 = PlaybackStateCompatCustomAction + 101;
                ParcelableVolumeInfo = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = getonevent.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                handlethirdpartysharingcallbacki2.IconCompatParcelizer.logEvent("push_update", null);
                onInterceptKeyBeforeSoftKeyboardZmokQxo oninterceptkeybeforesoftkeyboardzmokqxo = pushTokenUpdateWorker.MediaSessionCompatToken;
                getonevent.RemoteActionCompatParcelizer = str;
                getonevent.IconCompatParcelizer = 1;
                if (((CardView$1) ((Extras$Key) oninterceptkeybeforesoftkeyboardzmokqxo).IconCompatParcelizer).updatePushToken(str, getonevent) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            CardView$1 cardView$1 = (CardView$1) pushTokenUpdateWorker.MediaSessionCompatResultReceiverWrapper;
            cardView$1.getClass();
            str.getClass();
            ((BrazeManagerImpl) ((parseLayoutDescription) cardView$1.RemoteActionCompatParcelizer)).read().setRegisteredPushToken(str);
            ((CustomerChatProviderImpl) ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) cardView$1.IconCompatParcelizer).write()).read(str);
            return new setClip();
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Push register failed in worker", new Object[0]);
            if (pushTokenUpdateWorker.MediaBrowserCompatMediaItem.write >= 5) {
                int i7 = ParcelableVolumeInfo + 19;
                PlaybackStateCompatCustomAction = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    EnumColumnAdapter enumColumnAdapter = pushTokenUpdateWorker.MediaMetadataCompat;
                    executeAsList executeaslist = executeAsList.OA;
                    e.getMessage();
                    obj.hashCode();
                    throw null;
                }
                EnumColumnAdapter enumColumnAdapter2 = pushTokenUpdateWorker.MediaMetadataCompat;
                executeAsList executeaslist2 = executeAsList.OA;
                String message = e.getMessage();
                if (message == null) {
                    int i8 = PlaybackStateCompatCustomAction + 3;
                    ParcelableVolumeInfo = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    message = "";
                }
                EnumColumnAdapter.serializer(enumColumnAdapter2, "push_token_update_failed", executeaslist2, message);
            }
            handlethirdpartysharingcallbacki2.IconCompatParcelizer.logEvent("push_update_error", null);
            return new setAmbientShadowColor8_81llA();
        }
    }
}
