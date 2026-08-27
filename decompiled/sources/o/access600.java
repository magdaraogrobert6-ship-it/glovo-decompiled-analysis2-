package o;

import android.content.Context;
import com.foodora.courier.push.tokenregistery.worker.PushTokenUpdateWorker;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheManager;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetsDownloadingWorker;
import com.roadrunner.customerchat.selfservice.data.cache.WebChatNativeCacheDataStore;
import com.roadrunner.customerchat.selfservice.domain.asset.DownloadChatAssetsUseCase;
import com.roadrunner.push.core.domain.work.ProceedWithRegisterToken;
import com.roadrunner.push.core.domain.work.RegisterPushTokenWorker;
import io.sentry.metrics.MetricsBatchProcessor;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes3.dex */
public final class access600 implements getViewWidget {
    private static int read = 1;
    private static int write;
    public final Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ access600(int i, Object obj) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // o.getViewWidget
    public final accesssetSpotShadowColor8_81llAjd read(Context context, androidx.work.WorkerParameters workerParameters) {
        int i = 2 % 2;
        int i2 = read + 33;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.serializer;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i3 != 0) {
            if (i3 != 1) {
                MapDelegateProviderImpl mapDelegateProviderImpl = (MapDelegateProviderImpl) obj;
                return new ChatAssetsDownloadingWorker(context, workerParameters, (TextUnitType) ((mergeJsonObjects) mapDelegateProviderImpl.mapboxMap).write(), (startDocument) ((mergeJsonObjects) mapDelegateProviderImpl.mapCameraManagerDelegate).write(), (DownloadChatAssetsUseCase) ((invokeqtAw6s) mapDelegateProviderImpl.mapProjectionDelegate).write(), (requireIndexInRange) ((mergeJsonObjects) mapDelegateProviderImpl.mapTransformDelegate).write(), (WebChatNativeCacheDataStore) ((mergeJsonObjects) mapDelegateProviderImpl.mapListenerDelegate).write(), (processingInstruction) ((mergeJsonObjects) mapDelegateProviderImpl.mapStyleManagerDelegate).write(), (ChatAssetCacheManager) ((mergeJsonObjects) mapDelegateProviderImpl.mapInteractionDelegate).write(), (copyw_4Rhrwdefault) ((insertBasedOnParentOffset) mapDelegateProviderImpl.mapAttributionDelegate$delegate).write(), (getCache) ((invokeqtAw6s) mapDelegateProviderImpl.mapPluginProviderDelegate).write(), (getError) ((mergeJsonObjects) mapDelegateProviderImpl.indoorManager).write());
            }
            MetricsBatchProcessor metricsBatchProcessor = (MetricsBatchProcessor) obj;
            return new PushTokenUpdateWorker(context, workerParameters, (SemanticsPropertiesContentDescription1) ((mergeJsonObjects) metricsBatchProcessor.RemoteActionCompatParcelizer).write(), (onInterceptKeyBeforeSoftKeyboardZmokQxo) ((getEditableText) metricsBatchProcessor.serializer).write(), (handleThirdPartySharingCallbackI) ((mergeJsonObjects) metricsBatchProcessor.write).write(), (InterceptedKeyInputNode) ((invokeqtAw6s) metricsBatchProcessor.read).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) metricsBatchProcessor.MediaSessionCompatQueueItem).write(), (EnumColumnAdapter) ((mergeJsonObjects) metricsBatchProcessor.IconCompatParcelizer).write());
        }
        context.getClass();
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) obj;
        ProceedWithRegisterToken proceedWithRegisterToken = (ProceedWithRegisterToken) ((setPaddingBottom) okHttpCall$1.write).write();
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) okHttpCall$1.serializer).write();
        objWrite.getClass();
        RegisterPushTokenWorker registerPushTokenWorker = new RegisterPushTokenWorker(context, workerParameters, proceedWithRegisterToken, (access800) objWrite);
        int i4 = write + 109;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return registerPushTokenWorker;
        }
        throw null;
    }
}
