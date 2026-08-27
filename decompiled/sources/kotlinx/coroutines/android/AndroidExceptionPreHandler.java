package kotlinx.coroutines.android;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.TextAnnouncementContentCardView;
import o.getOnBackInvokedCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidExceptionPreHandler extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    private volatile Object _preHandler;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(TextAnnouncementContentCardView textAnnouncementContentCardView, Throwable th) {
    }

    public AndroidExceptionPreHandler() {
        super(getOnBackInvokedCallback.RemoteActionCompatParcelizer);
        this._preHandler = this;
    }
}
