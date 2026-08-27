package o;

import android.content.Context;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.localPushNotifications.smartPolling.presentation.SmartPollingDisplayPushNotificationWorker;
import com.roadrunner.rider.safety.log.data.SubmitSafetyLogEventWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class setInstallBeginTimeServerInSeconds implements getViewWidget {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final Object IconCompatParcelizer;
    public final Object MediaBrowserCompatMediaItem;
    public final Object RemoteActionCompatParcelizer;
    public final Object read;
    public final Object serializer;
    public final /* synthetic */ int write = 1;

    public setInstallBeginTimeServerInSeconds(getInstallBeginTimeServerInSeconds getinstallbegintimeserverinseconds, ExecuteApiRequest executeApiRequest, r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 r8lambda4txk7kovp_j84hgvzl3zo6mzli8, isDeviceIdsReadingOnceEnabled isdeviceidsreadingonceenabled, increaseRetries increaseretries) {
        getinstallbegintimeserverinseconds.getClass();
        executeApiRequest.getClass();
        r8lambda4txk7kovp_j84hgvzl3zo6mzli8.getClass();
        isdeviceidsreadingonceenabled.getClass();
        increaseretries.getClass();
        this.MediaBrowserCompatMediaItem = getinstallbegintimeserverinseconds;
        this.serializer = executeApiRequest;
        this.read = r8lambda4txk7kovp_j84hgvzl3zo6mzli8;
        this.IconCompatParcelizer = isdeviceidsreadingonceenabled;
        this.RemoteActionCompatParcelizer = increaseretries;
    }

    public setInstallBeginTimeServerInSeconds(accessrequireViewFactoryHolder accessrequireviewfactoryholder, getCurrentItem getcurrentitem, lambdaaddGlobalCallbackParameter20 lambdaaddglobalcallbackparameter20, transferSessionPackageI transfersessionpackagei, r8lambdaKLUglSIfRlmIAl3gbMulFwcpk84 r8lambdakluglsifrlmial3gbmulfwcpk84) {
        this.MediaBrowserCompatMediaItem = accessrequireviewfactoryholder;
        this.serializer = getcurrentitem;
        this.read = lambdaaddglobalcallbackparameter20;
        this.IconCompatParcelizer = transfersessionpackagei;
        this.RemoteActionCompatParcelizer = r8lambdakluglsifrlmial3gbmulfwcpk84;
    }

    @Override // o.getViewWidget
    public final accesssetSpotShadowColor8_81llAjd read(Context context, androidx.work.WorkerParameters workerParameters) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 35;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            context.getClass();
            throw null;
        }
        int i3 = this.write;
        Object obj = this.RemoteActionCompatParcelizer;
        Object obj2 = this.IconCompatParcelizer;
        Object obj3 = this.read;
        Object obj4 = this.serializer;
        Object obj5 = this.MediaBrowserCompatMediaItem;
        context.getClass();
        if (i3 != 0) {
            return new SmartPollingDisplayPushNotificationWorker(context, workerParameters, (accessrequireViewFactoryHolder) obj5, (getCurrentItem) obj4, (r8lambdaKLUglSIfRlmIAl3gbMulFwcpk84) obj, (lambdaaddGlobalCallbackParameter20) obj3, (transferSessionPackageI) obj2);
        }
        SubmitSafetyLogEventWorker submitSafetyLogEventWorker = new SubmitSafetyLogEventWorker(context, workerParameters, (getInstallBeginTimeServerInSeconds) obj5, (ExecuteApiRequest) obj4, (r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8) obj3, (isDeviceIdsReadingOnceEnabled) obj2, (increaseRetries) obj);
        int i4 = MediaSessionCompatQueueItem + 61;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
        return submitSafetyLogEventWorker;
    }
}
