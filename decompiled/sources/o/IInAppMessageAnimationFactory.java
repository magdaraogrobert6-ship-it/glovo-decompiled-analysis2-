package o;

import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class IInAppMessageAnimationFactory extends ScopeCoroutine {
    private volatile boolean threadLocalIsSet;
    public final ThreadLocal write;

    @Override // kotlinx.coroutines.internal.ScopeCoroutine
    public final void ComponentActivity() {
        ResultReceiver();
    }

    public final void IconCompatParcelizer(TextAnnouncementContentCardView textAnnouncementContentCardView, Object obj) {
        this.threadLocalIsSet = true;
        this.write.set(new onViewAttachedToWindowlambda0(textAnnouncementContentCardView, obj));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IInAppMessageAnimationFactory(ShortNewsContentCardView shortNewsContentCardView, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        DefaultInAppMessageViewWrapperopendismissInAppMessageCallbackFallback1 defaultInAppMessageViewWrapperopendismissInAppMessageCallbackFallback1 = DefaultInAppMessageViewWrapperopendismissInAppMessageCallbackFallback1.read;
        super(shortNewsContentCardView, textAnnouncementContentCardView.get(defaultInAppMessageViewWrapperopendismissInAppMessageCallbackFallback1) == null ? textAnnouncementContentCardView.plus(defaultInAppMessageViewWrapperopendismissInAppMessageCallbackFallback1) : textAnnouncementContentCardView);
        this.write = new ThreadLocal();
        if (shortNewsContentCardView.getContext().get(ShortNewsContentCardViewCompanion.serializer) instanceof CoroutineDispatcher) {
            return;
        }
        Object objSerializer = ThreadContextKt.serializer(textAnnouncementContentCardView, null);
        ThreadContextKt.write(textAnnouncementContentCardView, objSerializer);
        IconCompatParcelizer(textAnnouncementContentCardView, objSerializer);
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.JobSupport
    public final void IconCompatParcelizer(Object obj) {
        ResultReceiver();
        int iWrite = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite2 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite3 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        Object obj2 = Options.Companion.read(iWrite, -1825394297, iWrite2, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{obj}, iWrite3, 1825394297);
        ShortNewsContentCardView shortNewsContentCardView = this.IconCompatParcelizer;
        TextAnnouncementContentCardView context = shortNewsContentCardView.getContext();
        IInAppMessageAnimationFactory iInAppMessageAnimationFactory = null;
        Object objSerializer = ThreadContextKt.serializer(context, null);
        if (objSerializer != ThreadContextKt.IconCompatParcelizer) {
            int iSerializer = getQueryParameterslambda2.serializer();
            int iSerializer2 = getQueryParameterslambda2.serializer();
            iInAppMessageAnimationFactory = (IInAppMessageAnimationFactory) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 391625664, new Object[]{shortNewsContentCardView, context, objSerializer}, getQueryParameterslambda2.serializer(), -391625664, iSerializer);
        }
        try {
            shortNewsContentCardView.resumeWith(obj2);
        } finally {
            if (iInAppMessageAnimationFactory == null || iInAppMessageAnimationFactory.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()) {
                ThreadContextKt.write(context, objSerializer);
            }
        }
    }

    public final void ResultReceiver() {
        if (this.threadLocalIsSet) {
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) this.write.get();
            if (onviewattachedtowindowlambda0 != null) {
                ThreadContextKt.write((TextAnnouncementContentCardView) onviewattachedtowindowlambda0.serializer, onviewattachedtowindowlambda0.write);
            }
            this.write.remove();
        }
    }

    public final boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        boolean z = this.threadLocalIsSet && this.write.get() == null;
        this.write.remove();
        return !z;
    }
}
