package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.internal.ScopeCoroutine;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;

/* JADX INFO: loaded from: classes4.dex */
final class FlowCoroutine<T> extends ScopeCoroutine<T> {
    @Override // kotlinx.coroutines.JobSupport
    public final boolean serializer(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return MediaDescriptionCompat(th);
    }

    public FlowCoroutine(ShortNewsContentCardView shortNewsContentCardView, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        super(shortNewsContentCardView, textAnnouncementContentCardView);
    }
}
