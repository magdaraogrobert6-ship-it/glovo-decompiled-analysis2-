package com.roadrunner.push.core.domain.work;

import android.content.Context;
import androidx.compose.ui.graphics.Fields;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.access800;

/* JADX INFO: loaded from: classes3.dex */
public final class RegisterPushTokenWorker extends CoroutineWorker {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final ProceedWithRegisterToken MediaDescriptionCompat;
    public final access800 MediaSessionCompatQueueItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterPushTokenWorker(Context context, WorkerParameters workerParameters, ProceedWithRegisterToken proceedWithRegisterToken, access800 access800Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        proceedWithRegisterToken.getClass();
        access800Var.getClass();
        this.MediaDescriptionCompat = proceedWithRegisterToken;
        this.MediaSessionCompatQueueItem = access800Var;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object doWork(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RatingCompat + 33;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaSessionCompatQueueItem.read();
        WorkerParameters workerParameters = this.MediaBrowserCompatMediaItem;
        String strRemoteActionCompatParcelizer = workerParameters.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("token");
        if (strRemoteActionCompatParcelizer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("push token should not be null");
            return null;
        }
        int i4 = MediaMetadataCompat + 21;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return this.MediaDescriptionCompat.invoke(workerParameters.write, strRemoteActionCompatParcelizer, (ContinuationImpl) shortNewsContentCardView);
        }
        int i5 = 62 / 0;
        return this.MediaDescriptionCompat.invoke(workerParameters.write, strRemoteActionCompatParcelizer, (ContinuationImpl) shortNewsContentCardView);
    }
}
