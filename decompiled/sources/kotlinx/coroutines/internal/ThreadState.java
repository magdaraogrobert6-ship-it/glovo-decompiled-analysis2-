package kotlinx.coroutines.internal;

import o.TextAnnouncementContentCardView;

/* JADX INFO: loaded from: classes4.dex */
final class ThreadState {
    public final TextAnnouncementContentCardView IconCompatParcelizer;
    public final ThreadLocalElement[] RemoteActionCompatParcelizer;
    public final Object[] serializer;
    public int write;

    public ThreadState(int i, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        this.IconCompatParcelizer = textAnnouncementContentCardView;
        this.serializer = new Object[i];
        this.RemoteActionCompatParcelizer = new ThreadLocalElement[i];
    }
}
