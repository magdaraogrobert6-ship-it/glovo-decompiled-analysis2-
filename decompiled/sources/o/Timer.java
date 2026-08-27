package o;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class Timer extends CompletableFuture {
    public final writeSelffwf_client_release serializer;

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.serializer.IconCompatParcelizer();
        }
        return super.cancel(z);
    }

    public Timer(writeSelffwf_client_release writeselffwf_client_release) {
        this.serializer = writeselffwf_client_release;
    }
}
