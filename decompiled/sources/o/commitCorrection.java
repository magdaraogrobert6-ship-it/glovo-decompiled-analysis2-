package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.common.data.repository.CrowdSourcingImageRepositoryImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.domain.usecase.GetCrowdSourcingEntryPointScreenImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.data.CrowdSourcingFloatingImageRepositoryImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageCameraOnlyUiModelImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.domain.upload.usecases.ObserveUploadCompletionUseCase;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.sentiance.core.model.thrift.k$c;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class commitCorrection implements copyuxg59PAdefault {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final k$c read;

    public commitCorrection(k$c k_c) {
        this.read = k_c;
    }

    public static getDoubleOrNull serializer(k$c k_c) {
        int i = 2 % 2;
        getDoubleOrNull getdoubleornullWrite = getDoubleOrNull.write(new commitCorrection(k_c));
        int i2 = IconCompatParcelizer + 119;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
        }
        return getdoubleornullWrite;
    }

    @Override // o.copyuxg59PAdefault
    public final copywBHncE4default write(ContextScope contextScope) {
        int i = 2 % 2;
        k$c k_c = this.read;
        CrowdSourcingFloatingImageCameraOnlyUiModelImpl crowdSourcingFloatingImageCameraOnlyUiModelImpl = new CrowdSourcingFloatingImageCameraOnlyUiModelImpl((transferSessionPackageI) ((mergeJsonObjects) k_c.RemoteActionCompatParcelizer).write(), new getQueryContext(), (isResumed) ((mergeJsonObjects) k_c.write).write(), (CrowdSourcingImageRepositoryImpl) ((mergeJsonObjects) k_c.IconCompatParcelizer).write(), (CrowdSourcingFloatingImageRepositoryImpl) ((mergeJsonObjects) k_c.read).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) k_c.serializer).write(), (GetCrowdSourcingEntryPointScreenImpl) ((mergeJsonObjects) k_c.MediaBrowserCompatMediaItem).write(), new com.huawei.wisesecurity.ucs_credential.n0(0), new IsFixableByRetry(18), new com.huawei.wisesecurity.ucs_credential.g0(0), (getDoneeUduSuo) ((mergeJsonObjects) k_c.MediaSessionCompatQueueItem).write(), (ObserveUploadCompletionUseCase) ((mergeJsonObjects) k_c.MediaDescriptionCompat).write(), contextScope);
        int i2 = IconCompatParcelizer + 39;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return crowdSourcingFloatingImageCameraOnlyUiModelImpl;
    }
}
