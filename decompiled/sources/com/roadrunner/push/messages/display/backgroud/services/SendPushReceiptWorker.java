package com.roadrunner.push.messages.display.backgroud.services;

import android.content.Context;
import androidx.compose.ui.graphics.Fields;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import com.data.util.AndroidScheduleProvider;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.google.firebase.firestore.core.FirestoreClient$$ExternalSyntheticLambda1;
import com.roadrunner.customerchat.legacy.core.usecases.CustomerChatEventUseCase$$ExternalSyntheticLambda0;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.internal.operators.completable.CompletableToSingle;
import io.reactivex.internal.operators.single.SingleDoOnSuccess;
import io.reactivex.internal.operators.single.SingleJust;
import io.reactivex.internal.operators.single.SingleOnErrorReturn;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.LazyKt__LazyJVMKt;
import o.EnumColumnAdapter;
import o.SimpleItemTouchHelperCallback;
import o.SwipeDismissTouchListenerVerticalDismissDirection;
import o.TouchAwareSwipeDismissTouchListener;
import o.accessgetAmbientShadowColor0d7_KjUjd;
import o.accesssetBlendModes9anfk8jd;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.getPivotOffsetF1C5BW0;
import o.getToggleableState;
import o.gotOptOutResponseI;
import o.handleThirdPartySharingCallbackI;
import o.isEnabledI;
import o.isVerticalSwipeInAllowedDirection;
import o.lambdaaddGlobalCallbackParameter20;
import o.lambdagdprForgetMe34;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k;
import o.resetTransientState;
import o.transferSessionPackageI;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SendPushReceiptWorker extends RxWorker {
    private static int PlaybackStateCompat = 0;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 1;
    public final getToggleableState MediaDescriptionCompat;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 MediaMetadataCompat;
    public final EnumColumnAdapter MediaSessionCompatQueueItem;
    public final lambdaaddGlobalCallbackParameter20 MediaSessionCompatResultReceiverWrapper;
    public final transferSessionPackageI MediaSessionCompatToken;
    public final isEnabledI ParcelableVolumeInfo;
    public final getPivotOffsetF1C5BW0 PlaybackStateCompatCustomAction;
    public final handleThirdPartySharingCallbackI RatingCompat;
    public final gotOptOutResponseI write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendPushReceiptWorker(Context context, WorkerParameters workerParameters, handleThirdPartySharingCallbackI handlethirdpartysharingcallbacki, isEnabledI isenabledi, getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, gotOptOutResponseI gotoptoutresponsei, transferSessionPackageI transfersessionpackagei, EnumColumnAdapter enumColumnAdapter, getToggleableState gettoggleablestate, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, lambdaaddGlobalCallbackParameter20 lambdaaddglobalcallbackparameter20) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        handlethirdpartysharingcallbacki.getClass();
        isenabledi.getClass();
        getpivotoffsetf1c5bw0.getClass();
        gotoptoutresponsei.getClass();
        transfersessionpackagei.getClass();
        enumColumnAdapter.getClass();
        gettoggleablestate.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        lambdaaddglobalcallbackparameter20.getClass();
        this.RatingCompat = handlethirdpartysharingcallbacki;
        this.ParcelableVolumeInfo = isenabledi;
        this.PlaybackStateCompatCustomAction = getpivotoffsetf1c5bw0;
        this.write = gotoptoutresponsei;
        this.MediaSessionCompatToken = transfersessionpackagei;
        this.MediaSessionCompatQueueItem = enumColumnAdapter;
        this.MediaDescriptionCompat = gettoggleablestate;
        this.MediaMetadataCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaSessionCompatResultReceiverWrapper = lambdaaddglobalcallbackparameter20;
    }

    @Override // androidx.work.RxWorker
    public final Single serializer() {
        int i = 2 % 2;
        gotOptOutResponseI gotoptoutresponsei = this.write;
        gotoptoutresponsei.getClass();
        SingleJust singleJustSerializer = Single.serializer(new accesssetBlendModes9anfk8jd(192838, gotoptoutresponsei.RemoteActionCompatParcelizer()));
        int i2 = PlaybackStateCompat + 115;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return singleJustSerializer;
    }

    @Override // androidx.work.RxWorker
    public final Single read() {
        int i = 2 % 2;
        WorkerParameters workerParameters = this.MediaBrowserCompatMediaItem;
        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd = workerParameters.RemoteActionCompatParcelizer;
        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd2 = workerParameters.RemoteActionCompatParcelizer;
        String strRemoteActionCompatParcelizer = accessgetambientshadowcolor0d7_kjujd.RemoteActionCompatParcelizer(PushNotificationParserObj.MESSAGE_ID_KEY);
        if (strRemoteActionCompatParcelizer == null) {
            int i2 = PlaybackStateCompat + 13;
            int i3 = i2 % Fields.SpotShadowColor;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 21;
            PlaybackStateCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            strRemoteActionCompatParcelizer = "";
        }
        String strRemoteActionCompatParcelizer2 = accessgetambientshadowcolor0d7_kjujd2.RemoteActionCompatParcelizer("message_new_id");
        String str = strRemoteActionCompatParcelizer2 != null ? strRemoteActionCompatParcelizer2 : "";
        long jIconCompatParcelizer = accessgetambientshadowcolor0d7_kjujd2.IconCompatParcelizer("received_at");
        long jIconCompatParcelizer2 = accessgetambientshadowcolor0d7_kjujd2.IconCompatParcelizer("read_at");
        String strRemoteActionCompatParcelizer3 = accessgetambientshadowcolor0d7_kjujd2.RemoteActionCompatParcelizer("notification_message");
        String string = null;
        if (strRemoteActionCompatParcelizer3 == null) {
            int i7 = PlaybackStateCompat + 123;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                throw null;
            }
            strRemoteActionCompatParcelizer3 = "null_msg";
        }
        long jLongValue = ((Number) this.MediaMetadataCompat.invoke()).longValue();
        Timber.RemoteActionCompatParcelizer.getClass();
        Long lValueOf = jIconCompatParcelizer > 0 ? Long.valueOf(jLongValue - jIconCompatParcelizer) : null;
        Long lValueOf2 = jIconCompatParcelizer2 > 0 ? Long.valueOf(jLongValue - jIconCompatParcelizer2) : null;
        String strRemoteActionCompatParcelizer4 = accessgetambientshadowcolor0d7_kjujd2.RemoteActionCompatParcelizer("metadata");
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.MediaSessionCompatToken;
        firebaseRemoteConfigImpl.getClass();
        if (!firebaseRemoteConfigImpl.RemoteActionCompatParcelizer(updateAdidI.IS_PUSH_NOTIFICATION_RECEIVED_AT_ACK_ENABLED)) {
            string = strRemoteActionCompatParcelizer4;
        } else if (strRemoteActionCompatParcelizer4 != null) {
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
            isverticalswipeinalloweddirection.getClass();
            Map map = (Map) isverticalswipeinalloweddirection.serializer(strRemoteActionCompatParcelizer4, LazyKt__LazyJVMKt.read(new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, SwipeDismissTouchListenerVerticalDismissDirection.Companion.serializer())));
            if (map == null) {
                map = SimpleItemTouchHelperCallback.serializer;
            }
            string = new r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k(onMove.RemoteActionCompatParcelizer(onMove.IconCompatParcelizer(new onViewAttachedToWindowlambda0("client_received_at", TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(Long.valueOf(jIconCompatParcelizer)))), map)).toString();
        }
        lambdagdprForgetMe34 lambdagdprforgetme34 = new lambdagdprForgetMe34(lValueOf, lValueOf2, string);
        String strRemoteActionCompatParcelizer5 = accessgetambientshadowcolor0d7_kjujd2.RemoteActionCompatParcelizer("category");
        Completable completable = this.ParcelableVolumeInfo.read(strRemoteActionCompatParcelizer, lambdagdprforgetme34);
        Callable callable = new Callable() { // from class: o.lambdaisEnabled10
            private static int IconCompatParcelizer = 0;
            private static int serializer = 1;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i8 = 2 % 2;
                setClip setclip = new setClip();
                int i9 = serializer + 121;
                IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return setclip;
            }
        };
        completable.getClass();
        return new SingleOnErrorReturn(new SingleDoOnSuccess(new CompletableToSingle(completable, callable), new d0$$ExternalSyntheticLambda0(2, new CustomerChatEventUseCase$$ExternalSyntheticLambda0(strRemoteActionCompatParcelizer5, this, jLongValue))), new FirestoreClient$$ExternalSyntheticLambda1(this, str, lValueOf, strRemoteActionCompatParcelizer3)).write(((AndroidScheduleProvider) this.PlaybackStateCompatCustomAction).IconCompatParcelizer());
    }
}
