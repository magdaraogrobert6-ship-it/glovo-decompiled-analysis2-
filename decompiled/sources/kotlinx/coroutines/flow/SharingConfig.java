package kotlinx.coroutines.flow;

import o.IInAppMessageViewWrapper;
import o.TextAnnouncementContentCardView;

/* JADX INFO: loaded from: classes4.dex */
final class SharingConfig<T> {
    public final Flow IconCompatParcelizer;
    public final IInAppMessageViewWrapper RemoteActionCompatParcelizer;
    public final TextAnnouncementContentCardView read;
    public final int write;

    public SharingConfig(int i, TextAnnouncementContentCardView textAnnouncementContentCardView, IInAppMessageViewWrapper iInAppMessageViewWrapper, Flow flow) {
        this.IconCompatParcelizer = flow;
        this.write = i;
        this.RemoteActionCompatParcelizer = iInAppMessageViewWrapper;
        this.read = textAnnouncementContentCardView;
    }
}
