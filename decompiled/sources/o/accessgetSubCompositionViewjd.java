package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetSubCompositionViewjd implements Executor {
    public static volatile accessgetSubCompositionViewjd IconCompatParcelizer;
    public final /* synthetic */ int MediaBrowserCompatMediaItem;
    public static final /* synthetic */ accessgetSubCompositionViewjd write = new accessgetSubCompositionViewjd(5);
    public static final /* synthetic */ accessgetSubCompositionViewjd serializer = new accessgetSubCompositionViewjd(6);
    public static final /* synthetic */ accessgetSubCompositionViewjd RemoteActionCompatParcelizer = new accessgetSubCompositionViewjd(7);
    public static final /* synthetic */ accessgetSubCompositionViewjd read = new accessgetSubCompositionViewjd(8);
    public static final /* synthetic */ accessgetSubCompositionViewjd MediaSessionCompatQueueItem = new accessgetSubCompositionViewjd(9);

    public /* synthetic */ accessgetSubCompositionViewjd(int i) {
        this.MediaBrowserCompatMediaItem = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.MediaBrowserCompatMediaItem) {
            case 0:
                new Handler(Looper.getMainLooper()).post(runnable);
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                Fill.IconCompatParcelizer().post(runnable);
                break;
            case 4:
                runnable.run();
                break;
            case 5:
                runnable.run();
                break;
            case 6:
                runnable.run();
                break;
            case 7:
                runnable.run();
                break;
            case 8:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
