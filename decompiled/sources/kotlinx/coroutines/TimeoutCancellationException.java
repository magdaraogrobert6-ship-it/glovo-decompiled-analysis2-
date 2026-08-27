package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import o.DefaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class TimeoutCancellationException extends CancellationException {
    public final transient setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 RemoteActionCompatParcelizer;

    public TimeoutCancellationException(String str, DefaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1 defaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1) {
        super(str);
        this.RemoteActionCompatParcelizer = defaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1;
    }
}
