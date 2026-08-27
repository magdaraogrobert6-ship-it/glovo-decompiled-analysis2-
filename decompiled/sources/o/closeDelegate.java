package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.common.domain.usecase.GetCrowdSourcingEntryPointScreenImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.data.CrowdSourcingFloatingImageRepositoryImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageButtonUiModelImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.domain.upload.usecases.ObserveUploadCompletionUseCase;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import com.sentiance.core.model.events.i$c;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class closeDelegate implements MoveCursorCommand {
    private static int serializer = 0;
    private static int write = 1;
    public final i$c IconCompatParcelizer;

    public closeDelegate(i$c i_c) {
        this.IconCompatParcelizer = i_c;
    }

    public static getDoubleOrNull write(i$c i_c) {
        int i = 2 % 2;
        getDoubleOrNull getdoubleornullWrite = getDoubleOrNull.write(new closeDelegate(i_c));
        int i2 = write + 23;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return getdoubleornullWrite;
    }

    @Override // o.copyuxg59PAdefault
    public final copywBHncE4default write(ContextScope contextScope) {
        int i = 2 % 2;
        i$c i_c = this.IconCompatParcelizer;
        CrowdSourcingFloatingImageButtonUiModelImpl crowdSourcingFloatingImageButtonUiModelImpl = new CrowdSourcingFloatingImageButtonUiModelImpl((transferSessionPackageI) ((mergeJsonObjects) i_c.write).write(), new getQueryContext(), (isResumed) ((mergeJsonObjects) i_c.MediaMetadataCompat).write(), (CrowdSourcingFloatingImageRepositoryImpl) ((mergeJsonObjects) i_c.IconCompatParcelizer).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) i_c.serializer).write(), (deleteSurroundingTextInCodePoints) ((mergeJsonObjects) i_c.RemoteActionCompatParcelizer).write(), (GetCrowdSourcingEntryPointScreenImpl) ((mergeJsonObjects) i_c.read).write(), new com.huawei.wisesecurity.ucs_credential.n0(0), new IsFixableByRetry(18), (ObserveUploadCompletionUseCase) ((mergeJsonObjects) i_c.RatingCompat).write(), (UpdateStateUseCaseImpl) ((mergeJsonObjects) i_c.MediaDescriptionCompat).write(), new com.huawei.wisesecurity.ucs_credential.g0(0), new com.huawei.wisesecurity.ucs_credential.p0(0), (getDoneeUduSuo) ((acquire) i_c.MediaBrowserCompatMediaItem).write(), contextScope);
        int i2 = write + 123;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return crowdSourcingFloatingImageButtonUiModelImpl;
        }
        throw null;
    }
}
