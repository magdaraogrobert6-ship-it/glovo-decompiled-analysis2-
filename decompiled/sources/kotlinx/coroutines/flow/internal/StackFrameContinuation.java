package kotlinx.coroutines.flow.internal;

import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg;

/* JADX INFO: loaded from: classes4.dex */
final class StackFrameContinuation<T> implements ShortNewsContentCardView<T>, r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg {
    public final TextAnnouncementContentCardView read;
    public final ShortNewsContentCardView serializer;

    @Override // o.ShortNewsContentCardView
    public final TextAnnouncementContentCardView getContext() {
        return this.read;
    }

    @Override // o.r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg
    public final r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg getCallerFrame() {
        ShortNewsContentCardView shortNewsContentCardView = this.serializer;
        if (shortNewsContentCardView instanceof r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg) {
            return (r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg) shortNewsContentCardView;
        }
        return null;
    }

    @Override // o.ShortNewsContentCardView
    public final void resumeWith(Object obj) {
        this.serializer.resumeWith(obj);
    }

    public StackFrameContinuation(ShortNewsContentCardView shortNewsContentCardView, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        this.serializer = shortNewsContentCardView;
        this.read = textAnnouncementContentCardView;
    }
}
