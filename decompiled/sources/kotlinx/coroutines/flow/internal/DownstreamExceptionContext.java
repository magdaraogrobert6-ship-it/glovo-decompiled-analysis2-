package kotlinx.coroutines.flow.internal;

import o.ImageOnlyContentCardViewViewHolder;
import o.ShortNewsContentCardViewViewHolder;
import o.TextAnnouncementContentCardView;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class DownstreamExceptionContext implements TextAnnouncementContentCardView {
    public final Throwable read;
    public final /* synthetic */ TextAnnouncementContentCardView write;

    @Override // o.TextAnnouncementContentCardView
    public final Object fold(Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return this.write.fold(obj, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    @Override // o.TextAnnouncementContentCardView
    public final ShortNewsContentCardViewViewHolder get(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return this.write.get(imageOnlyContentCardViewViewHolder);
    }

    @Override // o.TextAnnouncementContentCardView
    public final TextAnnouncementContentCardView minusKey(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return this.write.minusKey(imageOnlyContentCardViewViewHolder);
    }

    @Override // o.TextAnnouncementContentCardView
    public final TextAnnouncementContentCardView plus(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return this.write.plus(textAnnouncementContentCardView);
    }

    public DownstreamExceptionContext(TextAnnouncementContentCardView textAnnouncementContentCardView, Throwable th) {
        this.write = textAnnouncementContentCardView;
        this.read = th;
    }
}
