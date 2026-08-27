package o;

import com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class isNullGroup {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final androidx.work.impl.WorkerWrapper.Builder serializer;

    public isNullGroup(androidx.work.impl.WorkerWrapper.Builder builder) {
        this.serializer = builder;
    }

    public final PickUpDropOffDetailsUiModelImpl RemoteActionCompatParcelizer(fastFilterNotNull fastfilternotnull, ContextScope contextScope) {
        int i = 2 % 2;
        fastfilternotnull.getClass();
        androidx.work.impl.WorkerWrapper.Builder builder = this.serializer;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.write).write();
        objWrite.getClass();
        processViewInfos processviewinfos = (processViewInfos) objWrite;
        BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21 = new BrazeCompanionExternalSyntheticLambda21(12);
        AndroidUiDispatcherCompanioncurrentThread1 androidUiDispatcherCompanioncurrentThread1 = new AndroidUiDispatcherCompanioncurrentThread1(8);
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaSessionCompatQueueItem).write();
        objWrite2.getClass();
        initlambda2 initlambda2Var = (initlambda2) objWrite2;
        Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.read).write();
        objWrite3.getClass();
        initlambda20 initlambda20Var = (initlambda20) objWrite3;
        Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaBrowserCompatMediaItem).write();
        objWrite4.getClass();
        UpdateStateUseCaseImpl updateStateUseCaseImpl = (UpdateStateUseCaseImpl) objWrite4;
        Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaMetadataCompat).write();
        objWrite5.getClass();
        IsFixableByRetry isFixableByRetry = new IsFixableByRetry(21);
        initui_toolingdefault initui_toolingdefaultVar = (initui_toolingdefault) ((setVerticalBias) builder.IconCompatParcelizer).write();
        Object objWrite6 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.RemoteActionCompatParcelizer).write();
        objWrite6.getClass();
        PickUpDropOffDetailsUiModelImpl pickUpDropOffDetailsUiModelImpl = new PickUpDropOffDetailsUiModelImpl(fastfilternotnull, contextScope, processviewinfos, brazeCompanionExternalSyntheticLambda21, androidUiDispatcherCompanioncurrentThread1, initlambda2Var, initlambda20Var, updateStateUseCaseImpl, (isOpenInternalroom_runtime) objWrite5, isFixableByRetry, initui_toolingdefaultVar, (initlambda2020) objWrite6, new getQueryContext());
        int i2 = IconCompatParcelizer + 43;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return pickUpDropOffDetailsUiModelImpl;
        }
        throw null;
    }
}
