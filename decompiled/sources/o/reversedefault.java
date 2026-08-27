package o;

import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class reversedefault implements TextAnnouncementContentCardView {
    public final TextAnnouncementContentCardView RemoteActionCompatParcelizer;

    public final boolean equals(Object obj) {
        Object[] objArr = {this.RemoteActionCompatParcelizer, obj};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    @Override // o.TextAnnouncementContentCardView
    public final Object fold(Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return this.RemoteActionCompatParcelizer.fold(obj, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    @Override // o.TextAnnouncementContentCardView
    public final ShortNewsContentCardViewViewHolder get(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return this.RemoteActionCompatParcelizer.get(imageOnlyContentCardViewViewHolder);
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    @Override // o.TextAnnouncementContentCardView
    public final TextAnnouncementContentCardView minusKey(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        TextAnnouncementContentCardView textAnnouncementContentCardViewMinusKey = this.RemoteActionCompatParcelizer.minusKey(imageOnlyContentCardViewViewHolder);
        int i = coil3.compose.internal.UtilsKt.write;
        getDismissRunnable getdismissrunnable = CoroutineDispatcher.read;
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) get(getdismissrunnable);
        CoroutineDispatcher coroutineDispatcher2 = (CoroutineDispatcher) textAnnouncementContentCardViewMinusKey.get(getdismissrunnable);
        if ((coroutineDispatcher instanceof PathHitTester) && coroutineDispatcher != coroutineDispatcher2) {
            ((PathHitTester) coroutineDispatcher).IconCompatParcelizer = 0;
        }
        return new reversedefault(textAnnouncementContentCardViewMinusKey);
    }

    @Override // o.TextAnnouncementContentCardView
    public final TextAnnouncementContentCardView plus(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        TextAnnouncementContentCardView textAnnouncementContentCardViewPlus = this.RemoteActionCompatParcelizer.plus(textAnnouncementContentCardView);
        int i = coil3.compose.internal.UtilsKt.write;
        getDismissRunnable getdismissrunnable = CoroutineDispatcher.read;
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) get(getdismissrunnable);
        CoroutineDispatcher coroutineDispatcher2 = (CoroutineDispatcher) textAnnouncementContentCardViewPlus.get(getdismissrunnable);
        if ((coroutineDispatcher instanceof PathHitTester) && coroutineDispatcher != coroutineDispatcher2) {
            ((PathHitTester) coroutineDispatcher).IconCompatParcelizer = 0;
        }
        return new reversedefault(textAnnouncementContentCardViewPlus);
    }

    public reversedefault(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        this.RemoteActionCompatParcelizer = textAnnouncementContentCardView;
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.RemoteActionCompatParcelizer + ")";
    }
}
