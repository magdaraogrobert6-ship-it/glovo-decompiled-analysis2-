package com.roadrunner.rider.safety.log.data;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import o.getInstallBeginTimeServerInSeconds;
import o.increaseRetries;
import o.isDeviceIdsReadingOnceEnabled;
import o.r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8;

/* JADX INFO: loaded from: classes3.dex */
public final class SubmitSafetyLogEventWorker extends CoroutineWorker {
    private static int PlaybackStateCompat = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 MediaDescriptionCompat;
    public final ExecuteApiRequest MediaMetadataCompat;
    public final isDeviceIdsReadingOnceEnabled MediaSessionCompatQueueItem;
    public final getInstallBeginTimeServerInSeconds MediaSessionCompatToken;
    public final WorkerParameters ParcelableVolumeInfo;
    public final increaseRetries RatingCompat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitSafetyLogEventWorker(Context context, WorkerParameters workerParameters, getInstallBeginTimeServerInSeconds getinstallbegintimeserverinseconds, ExecuteApiRequest executeApiRequest, r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 r8lambda4txk7kovp_j84hgvzl3zo6mzli8, isDeviceIdsReadingOnceEnabled isdeviceidsreadingonceenabled, increaseRetries increaseretries) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        getinstallbegintimeserverinseconds.getClass();
        executeApiRequest.getClass();
        r8lambda4txk7kovp_j84hgvzl3zo6mzli8.getClass();
        isdeviceidsreadingonceenabled.getClass();
        increaseretries.getClass();
        this.ParcelableVolumeInfo = workerParameters;
        this.MediaSessionCompatToken = getinstallbegintimeserverinseconds;
        this.MediaMetadataCompat = executeApiRequest;
        this.MediaDescriptionCompat = r8lambda4txk7kovp_j84hgvzl3zo6mzli8;
        this.MediaSessionCompatQueueItem = isdeviceidsreadingonceenabled;
        this.RatingCompat = increaseretries;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:19:0x0049 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010f, code lost:
    
        if (r14 == r3) goto L46;
     */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(o.ShortNewsContentCardView r14) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.safety.log.data.SubmitSafetyLogEventWorker.doWork(o.ShortNewsContentCardView):java.lang.Object");
    }
}
