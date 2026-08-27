package kotlinx.coroutines.internal;

import o.TextAnnouncementContentCardView;
import o.getContentViewGroupParentLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class ContextScope implements getContentViewGroupParentLayout {
    public final TextAnnouncementContentCardView serializer;

    @Override // o.getContentViewGroupParentLayout
    public final TextAnnouncementContentCardView getCoroutineContext() {
        return this.serializer;
    }

    public ContextScope(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        this.serializer = textAnnouncementContentCardView;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.serializer + ')';
    }
}
