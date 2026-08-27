package o;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetParentLayoutDirection implements Executor {
    public final /* synthetic */ int IconCompatParcelizer;
    public final Object read;

    public accessgetParentLayoutDirection() {
        this.IconCompatParcelizer = 0;
        this.read = new getBackEK5gGoQ(Looper.getMainLooper(), 4);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.IconCompatParcelizer;
        Object obj = this.read;
        if (i == 0) {
            ((getBackEK5gGoQ) obj).post(runnable);
            return;
        }
        if (i == 1) {
            ((accessgetStrokecp) obj).read.post(runnable);
        } else if (i != 2) {
            ((getBackEK5gGoQ) obj).post(runnable);
        } else {
            ((Executor) obj).execute(new accessgetTvRadioServicecp(runnable, 2));
        }
    }

    public /* synthetic */ accessgetParentLayoutDirection(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.read = obj;
    }

    public accessgetParentLayoutDirection(Looper looper) {
        this.IconCompatParcelizer = 3;
        this.read = new getBackEK5gGoQ(looper, 2);
    }
}
