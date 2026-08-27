package o;

import java.util.concurrent.Callable;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class setHeightCallback implements Callable {
    public final /* synthetic */ OkHttpCall$1 RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ setHeightCallback(OkHttpCall$1 okHttpCall$1, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = okHttpCall$1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.read;
        OkHttpCall$1 okHttpCall$1 = this.RemoteActionCompatParcelizer;
        switch (i) {
            case 0:
                return Integer.valueOf(okHttpCall$1.MediaSessionCompatQueueItem().length);
            case 1:
                return Integer.valueOf(okHttpCall$1.MediaSessionCompatQueueItem().length);
            case 2:
                return okHttpCall$1.MediaSessionCompatQueueItem();
            case 3:
                return Integer.valueOf(okHttpCall$1.MediaSessionCompatQueueItem().length);
            case 4:
                return okHttpCall$1.MediaSessionCompatQueueItem();
            case 5:
                return Integer.valueOf(okHttpCall$1.MediaSessionCompatQueueItem().length);
            case 6:
                return okHttpCall$1.MediaSessionCompatQueueItem();
            case 7:
                return Integer.valueOf(okHttpCall$1.MediaSessionCompatQueueItem().length);
            case 8:
                return okHttpCall$1.MediaSessionCompatQueueItem();
            case 9:
                return okHttpCall$1.MediaSessionCompatQueueItem();
            case 10:
                return Integer.valueOf(okHttpCall$1.MediaSessionCompatQueueItem().length);
            default:
                return okHttpCall$1.MediaSessionCompatQueueItem();
        }
    }
}
