package o;

import java.util.concurrent.Callable;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class getHeightCallback implements Callable {
    public final /* synthetic */ int read;
    public final /* synthetic */ OkHttpCall$1 serializer;

    public /* synthetic */ getHeightCallback(OkHttpCall$1 okHttpCall$1, int i) {
        this.read = i;
        this.serializer = okHttpCall$1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.read;
        OkHttpCall$1 okHttpCall$1 = this.serializer;
        if (i == 0) {
            return Integer.valueOf(okHttpCall$1.MediaSessionCompatQueueItem().length);
        }
        if (i == 1) {
            return Integer.valueOf(okHttpCall$1.MediaSessionCompatQueueItem().length);
        }
        if (i == 2) {
            return okHttpCall$1.MediaSessionCompatQueueItem();
        }
        if (i != 3) {
            return i != 4 ? okHttpCall$1.MediaSessionCompatQueueItem() : okHttpCall$1.MediaSessionCompatQueueItem();
        }
        return Integer.valueOf(okHttpCall$1.MediaSessionCompatQueueItem().length);
    }
}
