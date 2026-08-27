package com.roadrunner.inappnotifications.data;

import android.content.Context;
import androidx.compose.ui.graphics.Fields;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import coil3.ExtrasKt;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.inappnotifications.domain.FetchAndSaveInAppMessageUseCase;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.accessgetAmbientShadowColor0d7_KjUjd;
import o.accesssetRenderEffectjd;
import o.isItemDismissable;
import o.onItemDismiss;
import o.processAdapterUpdatesAndSetAnimationFlags;
import o.removeDetachedView;
import o.setAmbientShadowColor8_81llA;
import o.setClip;

/* JADX INFO: loaded from: classes3.dex */
public final class FetchInAppMessageWorker extends CoroutineWorker {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public final FetchAndSaveInAppMessageUseCase MediaMetadataCompat;
    public final WorkerParameters MediaSessionCompatQueueItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchInAppMessageWorker(Context context, WorkerParameters workerParameters, FetchAndSaveInAppMessageUseCase fetchAndSaveInAppMessageUseCase) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        fetchAndSaveInAppMessageUseCase.getClass();
        this.MediaSessionCompatQueueItem = workerParameters;
        this.MediaMetadataCompat = fetchAndSaveInAppMessageUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    @Override // androidx.work.CoroutineWorker
    public final Object doWork(ShortNewsContentCardView shortNewsContentCardView) {
        removeDetachedView removedetachedview;
        Object objM4982invoke0E7RQCE$implementation;
        int i = 2 % 2;
        if (shortNewsContentCardView instanceof removeDetachedView) {
            int i2 = RatingCompat + 17;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            removedetachedview = (removeDetachedView) shortNewsContentCardView;
            int i4 = removedetachedview.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = RatingCompat + 55;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                removedetachedview.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                removedetachedview = new removeDetachedView(this, (ContinuationImpl) shortNewsContentCardView);
                int i7 = RatingCompat + 3;
                MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
        } else {
            removedetachedview = new removeDetachedView(this, (ContinuationImpl) shortNewsContentCardView);
            int i9 = RatingCompat + 3;
            MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        Object obj = removedetachedview.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = removedetachedview.RemoteActionCompatParcelizer;
        if (i11 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd = this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer;
            accessgetambientshadowcolor0d7_kjujd.getClass();
            String strRemoteActionCompatParcelizer = accessgetambientshadowcolor0d7_kjujd.RemoteActionCompatParcelizer("in_app_message_data");
            if (strRemoteActionCompatParcelizer == null) {
                return new accesssetRenderEffectjd();
            }
            String strRemoteActionCompatParcelizer2 = accessgetambientshadowcolor0d7_kjujd.RemoteActionCompatParcelizer(PushNotificationParserObj.MESSAGE_ID_KEY);
            if (strRemoteActionCompatParcelizer2 == null) {
                return new accesssetRenderEffectjd();
            }
            String strRemoteActionCompatParcelizer3 = accessgetambientshadowcolor0d7_kjujd.RemoteActionCompatParcelizer("campaign_id");
            if (strRemoteActionCompatParcelizer3 == null) {
                return new accesssetRenderEffectjd();
            }
            String strRemoteActionCompatParcelizer4 = accessgetambientshadowcolor0d7_kjujd.RemoteActionCompatParcelizer("execution_id");
            if (strRemoteActionCompatParcelizer4 == null) {
                return new accesssetRenderEffectjd();
            }
            String strRemoteActionCompatParcelizer5 = accessgetambientshadowcolor0d7_kjujd.RemoteActionCompatParcelizer("template_id");
            if (strRemoteActionCompatParcelizer5 == null) {
                return new accesssetRenderEffectjd();
            }
            String strRemoteActionCompatParcelizer6 = accessgetambientshadowcolor0d7_kjujd.RemoteActionCompatParcelizer("notification_id");
            if (strRemoteActionCompatParcelizer6 == null) {
                return new accesssetRenderEffectjd();
            }
            processAdapterUpdatesAndSetAnimationFlags processadapterupdatesandsetanimationflags = new processAdapterUpdatesAndSetAnimationFlags(strRemoteActionCompatParcelizer2, strRemoteActionCompatParcelizer3, strRemoteActionCompatParcelizer4, strRemoteActionCompatParcelizer5, strRemoteActionCompatParcelizer6);
            removedetachedview.RemoteActionCompatParcelizer = 1;
            objM4982invoke0E7RQCE$implementation = this.MediaMetadataCompat.m4982invoke0E7RQCE$implementation(strRemoteActionCompatParcelizer, processadapterupdatesandsetanimationflags, removedetachedview);
            if (objM4982invoke0E7RQCE$implementation == coroutineSingletons) {
                int i12 = MediaDescriptionCompat + 11;
                RatingCompat = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4982invoke0E7RQCE$implementation = ((onItemDismiss) obj).IconCompatParcelizer;
            int i14 = RatingCompat + 7;
            MediaDescriptionCompat = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
        }
        if (objM4982invoke0E7RQCE$implementation instanceof isItemDismissable) {
            return this.MediaBrowserCompatMediaItem.write < 5 ? new setAmbientShadowColor8_81llA() : new accesssetRenderEffectjd();
        }
        return new setClip();
    }
}
