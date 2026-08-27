package o;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.Segment;

/* JADX INFO: loaded from: classes4.dex */
public final class getHtmlInAppMessageActionListener extends Segment {
    public final /* synthetic */ AtomicReferenceArray write;

    @Override // kotlinx.coroutines.internal.Segment
    public final int serializer() {
        return getInAppMessageAnimationFactory.read;
    }

    @Override // kotlinx.coroutines.internal.Segment
    public final void RemoteActionCompatParcelizer(int i, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        this.write.set(i, getInAppMessageAnimationFactory.RemoteActionCompatParcelizer);
        MediaSessionCompatResultReceiverWrapper();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.RatingCompat + ", hashCode=" + hashCode() + ']';
    }

    public getHtmlInAppMessageActionListener(long j, getHtmlInAppMessageActionListener gethtmlinappmessageactionlistener, int i) {
        super(j, gethtmlinappmessageactionlistener, i);
        this.write = new AtomicReferenceArray(getInAppMessageAnimationFactory.read);
    }
}
