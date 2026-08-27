package kotlinx.coroutines.test.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.ImageOnlyContentCardViewViewHolder;
import o.TextAnnouncementContentCardView;
import o.getInAppMessageViewFactory;
import o.getOnBackInvokedCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class ExceptionCollector extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public static final ExceptionCollector write = new ExceptionCollector(getOnBackInvokedCallback.RemoteActionCompatParcelizer);
    public static final Object read = new Object();

    static {
        new ArrayList();
        new LinkedHashMap();
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(TextAnnouncementContentCardView textAnnouncementContentCardView, Throwable th) {
        synchronized (read) {
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ExceptionCollector) || (obj instanceof getInAppMessageViewFactory);
    }

    public ExceptionCollector(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        super(imageOnlyContentCardViewViewHolder);
    }
}
