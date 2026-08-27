package o;

import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import io.sentry.SentryEnvelopeItem$$ExternalSyntheticLambda3;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class setOnReadyForComposition {
    public zzw IconCompatParcelizer = null;
    public final Executor RemoteActionCompatParcelizer;
    public final AndroidComposeViewExternalSyntheticLambda1 read;
    public static final HashMap write = new HashMap();
    public static final setSupportButtonTintList serializer = new setSupportButtonTintList(1);

    public final Task read() {
        zzw zzwVar;
        synchronized (this) {
            zzw zzwVar2 = this.IconCompatParcelizer;
            if (zzwVar2 == null || (zzwVar2.isComplete() && !this.IconCompatParcelizer.isSuccessful())) {
                this.IconCompatParcelizer = LazyKt__LazyJVMKt.write(this.RemoteActionCompatParcelizer, new setContentCaptureManagerui(4, this.read));
            }
            zzwVar = this.IconCompatParcelizer;
        }
        return zzwVar;
    }

    public final setPrimaryDirectionalMotionAxisOverrider2epLt8ui serializer() {
        synchronized (this) {
            zzw zzwVar = this.IconCompatParcelizer;
            if (zzwVar == null || !zzwVar.isSuccessful()) {
                try {
                    return (setPrimaryDirectionalMotionAxisOverrider2epLt8ui) read(read());
                } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    return null;
                }
            }
            return (setPrimaryDirectionalMotionAxisOverrider2epLt8ui) this.IconCompatParcelizer.getResult();
        }
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this) {
            this.IconCompatParcelizer = LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
        }
        AndroidComposeViewExternalSyntheticLambda1 androidComposeViewExternalSyntheticLambda1 = this.read;
        synchronized (androidComposeViewExternalSyntheticLambda1) {
            androidComposeViewExternalSyntheticLambda1.read.deleteFile(androidComposeViewExternalSyntheticLambda1.IconCompatParcelizer);
        }
    }

    public setOnReadyForComposition(Executor executor, AndroidComposeViewExternalSyntheticLambda1 androidComposeViewExternalSyntheticLambda1) {
        this.RemoteActionCompatParcelizer = executor;
        this.read = androidComposeViewExternalSyntheticLambda1;
    }

    public static Object read(Task task) throws ExecutionException, TimeoutException {
        release releaseVar = new release(1);
        Executor executor = serializer;
        task.addOnSuccessListener(executor, releaseVar);
        task.addOnFailureListener(executor, releaseVar);
        task.addOnCanceledListener(executor, releaseVar);
        if (releaseVar.serializer.await(5L, TimeUnit.SECONDS)) {
            if (task.isSuccessful()) {
                return task.getResult();
            }
            throw new ExecutionException(task.getException());
        }
        throw new TimeoutException("Task await timed out.");
    }

    public final Task IconCompatParcelizer(setPrimaryDirectionalMotionAxisOverrider2epLt8ui setprimarydirectionalmotionaxisoverrider2eplt8ui) {
        SentryEnvelopeItem$$ExternalSyntheticLambda3 sentryEnvelopeItem$$ExternalSyntheticLambda3 = new SentryEnvelopeItem$$ExternalSyntheticLambda3(this, 5, setprimarydirectionalmotionaxisoverrider2eplt8ui);
        Executor executor = this.RemoteActionCompatParcelizer;
        return LazyKt__LazyJVMKt.write(executor, sentryEnvelopeItem$$ExternalSyntheticLambda3).onSuccessTask(executor, new JankStatsFrameTracker$$ExternalSyntheticLambda3(this, 11, setprimarydirectionalmotionaxisoverrider2eplt8ui));
    }
}
