package o;

import kotlinx.coroutines.JobKt;

/* JADX INFO: loaded from: classes.dex */
public final class asComposePaint implements AutoCloseable, getContentViewGroupParentLayout {
    public final TextAnnouncementContentCardView RemoteActionCompatParcelizer;

    @Override // o.getContentViewGroupParentLayout
    public final TextAnnouncementContentCardView getCoroutineContext() {
        return this.RemoteActionCompatParcelizer;
    }

    public asComposePaint(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        textAnnouncementContentCardView.getClass();
        this.RemoteActionCompatParcelizer = textAnnouncementContentCardView;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        JobKt.serializer(this.RemoteActionCompatParcelizer, null);
    }
}
