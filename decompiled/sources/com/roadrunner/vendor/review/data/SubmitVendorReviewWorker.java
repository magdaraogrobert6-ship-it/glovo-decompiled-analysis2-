package com.roadrunner.vendor.review.data;

import android.content.Context;
import androidx.compose.ui.graphics.Fields;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.accesssetRenderEffectjd;
import o.getCachedContentCards;
import o.isItemDismissable;
import o.isVerticalSwipeInAllowedDirection;
import o.onItemDismiss;
import o.resetTransientState;
import o.setAmbientShadowColor8_81llA;
import o.setClip;
import o.waitForUserDependencyThreadlambda0;
import o.waitForUserDependencyThreadlambda1;

/* JADX INFO: loaded from: classes3.dex */
public final class SubmitVendorReviewWorker extends CoroutineWorker {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    public final waitForUserDependencyThreadlambda1 MediaMetadataCompat;
    public final WorkerParameters MediaSessionCompatQueueItem;
    public final ExecuteApiRequest RatingCompat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitVendorReviewWorker(Context context, WorkerParameters workerParameters, waitForUserDependencyThreadlambda1 waitforuserdependencythreadlambda1, ExecuteApiRequest executeApiRequest) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        waitforuserdependencythreadlambda1.getClass();
        executeApiRequest.getClass();
        this.MediaSessionCompatQueueItem = workerParameters;
        this.MediaMetadataCompat = waitforuserdependencythreadlambda1;
        this.RatingCompat = executeApiRequest;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // androidx.work.CoroutineWorker
    public final Object doWork(ShortNewsContentCardView shortNewsContentCardView) {
        waitForUserDependencyThreadlambda0 waitforuserdependencythreadlambda0;
        Object objM4875invokegIAlus;
        int i = 2 % 2;
        if (shortNewsContentCardView instanceof waitForUserDependencyThreadlambda0) {
            waitforuserdependencythreadlambda0 = (waitForUserDependencyThreadlambda0) shortNewsContentCardView;
            int i2 = waitforuserdependencythreadlambda0.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                waitforuserdependencythreadlambda0.serializer = i2 - Integer.MIN_VALUE;
            } else {
                waitforuserdependencythreadlambda0 = new waitForUserDependencyThreadlambda0(this, (ContinuationImpl) shortNewsContentCardView);
            }
        } else {
            waitforuserdependencythreadlambda0 = new waitForUserDependencyThreadlambda0(this, (ContinuationImpl) shortNewsContentCardView);
        }
        Object obj = waitforuserdependencythreadlambda0.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = waitforuserdependencythreadlambda0.serializer;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            WorkerParameters workerParameters = this.MediaSessionCompatQueueItem;
            long jIconCompatParcelizer = workerParameters.RemoteActionCompatParcelizer.IconCompatParcelizer("delivery_id");
            String strRemoteActionCompatParcelizer = workerParameters.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("submit_vendor_review_request");
            if (jIconCompatParcelizer != 0) {
                if (strRemoteActionCompatParcelizer == null) {
                    int i4 = MediaSessionCompatResultReceiverWrapper + 57;
                    MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                } else {
                    isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                    isverticalswipeinalloweddirection.getClass();
                    HistoryApiRequest$getHistory$2 historyApiRequest$getHistory$2 = new HistoryApiRequest$getHistory$2(this, jIconCompatParcelizer, (getCachedContentCards) isverticalswipeinalloweddirection.serializer(strRemoteActionCompatParcelizer, getCachedContentCards.Companion.serializer()), (ShortNewsContentCardView) null, 6);
                    waitforuserdependencythreadlambda0.serializer = 1;
                    objM4875invokegIAlus = this.RatingCompat.m4875invokegIAlus(historyApiRequest$getHistory$2, waitforuserdependencythreadlambda0);
                    if (objM4875invokegIAlus == coroutineSingletons) {
                        int i6 = MediaDescriptionCompat + 75;
                        MediaSessionCompatResultReceiverWrapper = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        return coroutineSingletons;
                    }
                }
            }
            return new accesssetRenderEffectjd();
        }
        if (i3 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        objM4875invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        if (objM4875invokegIAlus instanceof isItemDismissable) {
            return this.MediaBrowserCompatMediaItem.write < 5 ? new setAmbientShadowColor8_81llA() : new accesssetRenderEffectjd();
        }
        return new setClip();
    }
}
