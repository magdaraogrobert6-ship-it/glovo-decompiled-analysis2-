package o;

import com.roadrunner.rider.state.noorders.presentation.HomeNoOrdersUiModelImpl;
import io.sentry.CombinedScopeView;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustLinkResolution1 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final CombinedScopeView read;

    public AdjustLinkResolution1(CombinedScopeView combinedScopeView) {
        this.read = combinedScopeView;
    }

    public final HomeNoOrdersUiModelImpl write(ContextScope contextScope) {
        int i = 2 % 2;
        CombinedScopeView combinedScopeView = this.read;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.RemoteActionCompatParcelizer).write();
        objWrite.getClass();
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.read).write();
        objWrite2.getClass();
        Object obj = ((getDoubleOrNull) combinedScopeView.write).write;
        obj.getClass();
        HomeNoOrdersUiModelImpl homeNoOrdersUiModelImpl = new HomeNoOrdersUiModelImpl((setTransactionSuccessful) objWrite, (resolveLink) objWrite2, contextScope, (SingleProcessDataStoredata1) obj);
        int i2 = RemoteActionCompatParcelizer + 49;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return homeNoOrdersUiModelImpl;
        }
        throw null;
    }
}
