package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class minHeight implements Executor {
    public static volatile minHeight IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final Object serializer;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        if (i == 0) {
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = ((LookaheadScopeKtLookaheadScope221) ((NoWindowInsetsAnimation) obj).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
            lookaheadScopeKtLookaheadScope4.write(runnable);
        } else if (i != 1) {
            ((Handler) obj).post(runnable);
        } else {
            ((ExecutorService) obj).execute(runnable);
        }
    }

    public minHeight(int i) {
        this.RemoteActionCompatParcelizer = i;
        if (i != 2) {
            this.serializer = Executors.newFixedThreadPool(2, new getCurrentContentInsetEnd(1));
        } else {
            this.serializer = new Handler(Looper.getMainLooper());
        }
    }

    public minHeight(NoWindowInsetsAnimation noWindowInsetsAnimation) {
        this.RemoteActionCompatParcelizer = 0;
        this.serializer = noWindowInsetsAnimation;
    }
}
