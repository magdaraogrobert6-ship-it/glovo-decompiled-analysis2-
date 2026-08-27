package o;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class trackLookaheadMeasurementByParent implements Executor {
    public final ExecutorService read;
    public final Object serializer = new Object();
    public Task RemoteActionCompatParcelizer = LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.read.execute(runnable);
    }

    public final Task serializer(Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.serializer) {
            taskContinueWithTask = this.RemoteActionCompatParcelizer.continueWithTask(this.read, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(24, runnable));
            this.RemoteActionCompatParcelizer = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public trackLookaheadMeasurementByParent(ExecutorService executorService) {
        this.read = executorService;
    }
}
