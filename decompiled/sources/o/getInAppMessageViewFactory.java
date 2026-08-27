package o;

import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.test.internal.ExceptionCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class getInAppMessageViewFactory implements CoroutineExceptionHandler {
    public final /* synthetic */ ExceptionCollector IconCompatParcelizer = ExceptionCollector.write;

    @Override // o.TextAnnouncementContentCardView
    public final Object fold(Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return this.IconCompatParcelizer.fold(obj, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    @Override // o.TextAnnouncementContentCardView
    public final ShortNewsContentCardViewViewHolder get(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return this.IconCompatParcelizer.get(imageOnlyContentCardViewViewHolder);
    }

    @Override // o.ShortNewsContentCardViewViewHolder
    public final ImageOnlyContentCardViewViewHolder getKey() {
        return this.IconCompatParcelizer.getKey();
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(TextAnnouncementContentCardView textAnnouncementContentCardView, Throwable th) {
        this.IconCompatParcelizer.getClass();
        synchronized (ExceptionCollector.read) {
        }
    }

    public final int hashCode() {
        return ExceptionCollector.write.hashCode();
    }

    @Override // o.TextAnnouncementContentCardView
    public final TextAnnouncementContentCardView minusKey(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return this.IconCompatParcelizer.minusKey(imageOnlyContentCardViewViewHolder);
    }

    @Override // o.TextAnnouncementContentCardView
    public final TextAnnouncementContentCardView plus(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return this.IconCompatParcelizer.plus(textAnnouncementContentCardView);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof getInAppMessageViewFactory) || (obj instanceof ExceptionCollector);
    }
}
