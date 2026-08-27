package o;

import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class getUnspecifiede0LSkKk {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final InitializeAppStartupItemsImpl RemoteActionCompatParcelizer;

    public getUnspecifiede0LSkKk(InitializeAppStartupItemsImpl initializeAppStartupItemsImpl) {
        this.RemoteActionCompatParcelizer = initializeAppStartupItemsImpl;
    }

    public final TextAlignKt read(ContextScope contextScope) {
        int i = 2 % 2;
        getQueryContext getquerycontext = new getQueryContext();
        InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = this.RemoteActionCompatParcelizer;
        SendTestPushUseCase sendTestPushUseCase = (SendTestPushUseCase) ((LayoutCompat) initializeAppStartupItemsImpl.IconCompatParcelizer).write();
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) initializeAppStartupItemsImpl.serializer).write();
        objWrite.getClass();
        TextAlignKt textAlignKt = new TextAlignKt(getquerycontext, contextScope, sendTestPushUseCase, (accessgetParagraphcp) objWrite);
        int i2 = IconCompatParcelizer + 17;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return textAlignKt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
