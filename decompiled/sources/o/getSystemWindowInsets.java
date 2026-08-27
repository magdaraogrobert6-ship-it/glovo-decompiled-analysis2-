package o;

import coil3.ComponentRegistry$Builder;
import com.roadrunner.freelancing.data.GoAndStartRepository;
import com.roadrunner.freelancing.presentation.goandstartinfo.GoAndStartInformationUiModelImpl;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.state.provider.data.model.FetchRiderStatusImpl;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class getSystemWindowInsets {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final ComponentRegistry$Builder IconCompatParcelizer;

    public getSystemWindowInsets(ComponentRegistry$Builder componentRegistry$Builder) {
        this.IconCompatParcelizer = componentRegistry$Builder;
    }

    public final GoAndStartInformationUiModelImpl RemoteActionCompatParcelizer(ContextScope contextScope) {
        int i = 2 % 2;
        ComponentRegistry$Builder componentRegistry$Builder = this.IconCompatParcelizer;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) componentRegistry$Builder.write).write();
        objWrite.getClass();
        setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) objWrite;
        Object objWrite2 = ((mergeJsonObjects) componentRegistry$Builder.read).write();
        objWrite2.getClass();
        GoAndStartRepository goAndStartRepository = (GoAndStartRepository) objWrite2;
        GetAppStateImpl getAppStateImpl = (GetAppStateImpl) ((requestSingleLocationUpdatelambda1) componentRegistry$Builder.RemoteActionCompatParcelizer).write();
        Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) componentRegistry$Builder.IconCompatParcelizer).write();
        objWrite3.getClass();
        Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) componentRegistry$Builder.serializer).write();
        objWrite4.getClass();
        GoAndStartInformationUiModelImpl goAndStartInformationUiModelImpl = new GoAndStartInformationUiModelImpl(settransactionsuccessful, goAndStartRepository, getAppStateImpl, (FetchRiderStatusImpl) objWrite3, (transferSessionPackageI) objWrite4, new getQueryContext(), contextScope);
        int i2 = RemoteActionCompatParcelizer + 55;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return goAndStartInformationUiModelImpl;
        }
        throw null;
    }
}
