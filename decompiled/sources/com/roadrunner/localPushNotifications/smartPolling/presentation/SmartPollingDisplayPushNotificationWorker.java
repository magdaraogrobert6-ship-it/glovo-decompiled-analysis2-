package com.roadrunner.localPushNotifications.smartPolling.presentation;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import o.accessrequireViewFactoryHolder;
import o.getCurrentItem;
import o.lambdaaddGlobalCallbackParameter20;
import o.r8lambdaKLUglSIfRlmIAl3gbMulFwcpk84;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class SmartPollingDisplayPushNotificationWorker extends CoroutineWorker {
    private static int MediaSessionCompatToken = 1;
    private static int PlaybackStateCompatCustomAction;
    public final r8lambdaKLUglSIfRlmIAl3gbMulFwcpk84 MediaDescriptionCompat;
    public final transferSessionPackageI MediaMetadataCompat;
    public final lambdaaddGlobalCallbackParameter20 MediaSessionCompatQueueItem;
    public final accessrequireViewFactoryHolder PlaybackStateCompat;
    public final getCurrentItem RatingCompat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartPollingDisplayPushNotificationWorker(Context context, WorkerParameters workerParameters, accessrequireViewFactoryHolder accessrequireviewfactoryholder, getCurrentItem getcurrentitem, r8lambdaKLUglSIfRlmIAl3gbMulFwcpk84 r8lambdakluglsifrlmial3gbmulfwcpk84, lambdaaddGlobalCallbackParameter20 lambdaaddglobalcallbackparameter20, transferSessionPackageI transfersessionpackagei) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        accessrequireviewfactoryholder.getClass();
        getcurrentitem.getClass();
        r8lambdakluglsifrlmial3gbmulfwcpk84.getClass();
        lambdaaddglobalcallbackparameter20.getClass();
        transfersessionpackagei.getClass();
        this.PlaybackStateCompat = accessrequireviewfactoryholder;
        this.RatingCompat = getcurrentitem;
        this.MediaDescriptionCompat = r8lambdakluglsifrlmial3gbmulfwcpk84;
        this.MediaSessionCompatQueueItem = lambdaaddglobalcallbackparameter20;
        this.MediaMetadataCompat = transfersessionpackagei;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bf, code lost:
    
        if (((com.roadrunner.localPushNotifications.smartPolling.domain.DeliveryAcceptanceLocalPushNotificationFactoryImpl) r13.RatingCompat).invoke(r14, r1) == r2) goto L33;
     */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(o.ShortNewsContentCardView r14) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.localPushNotifications.smartPolling.presentation.SmartPollingDisplayPushNotificationWorker.doWork(o.ShortNewsContentCardView):java.lang.Object");
    }
}
