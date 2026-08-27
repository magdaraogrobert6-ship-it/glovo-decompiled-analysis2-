package kotlinx.coroutines.flow.internal;

import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;

/* JADX INFO: loaded from: classes4.dex */
final class NoOpContinuation implements ShortNewsContentCardView<Object> {
    public static final NoOpContinuation serializer = new NoOpContinuation();

    @Override // o.ShortNewsContentCardView
    public final TextAnnouncementContentCardView getContext() {
        return r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
    }

    @Override // o.ShortNewsContentCardView
    public final void resumeWith(Object obj) {
    }
}
