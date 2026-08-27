package o;

import io.reactivex.Scheduler;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class getCompositingStrategyke2Ky5w implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Scheduler write;

    public /* synthetic */ getCompositingStrategyke2Ky5w(int i, Scheduler scheduler) {
        this.IconCompatParcelizer = i;
        this.write = scheduler;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.IconCompatParcelizer;
        if (i == 0 || i == 1) {
            ((Callable) obj).getClass();
        } else if (i != 2) {
            ((Scheduler) obj).getClass();
        } else {
            ((Scheduler) obj).getClass();
        }
        return this.write;
    }
}
