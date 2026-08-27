package o;

import io.reactivex.CompletableEmitter;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaHnQ0TaKjW7L8s_wmIGAk0Wm18Q extends createCloseInAppMessageClickListenerlambda0 {
    public final CompletableEmitter write;

    public r8lambdaHnQ0TaKjW7L8s_wmIGAk0Wm18Q(TextAnnouncementContentCardView textAnnouncementContentCardView, CompletableEmitter completableEmitter) {
        super(textAnnouncementContentCardView, false, true);
        this.write = completableEmitter;
    }

    @Override // o.createCloseInAppMessageClickListenerlambda0
    public final void write(Object obj) {
        try {
            this.write.IconCompatParcelizer();
        } catch (Throwable th) {
            coil3.util.ContextsKt.read(this.RemoteActionCompatParcelizer, th);
        }
    }

    @Override // o.createCloseInAppMessageClickListenerlambda0
    public final void write(Throwable th, boolean z) {
        try {
            if (this.write.read(th)) {
                return;
            }
        } catch (Throwable th2) {
            markOnScreenCardsAsReadlambda1.read(th, th2);
        }
        coil3.util.ContextsKt.read(this.RemoteActionCompatParcelizer, th);
    }
}
