package o;

import androidx.loader.content.ModernAsyncTask$1;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class getNativeStyle extends FutureTask {
    public Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getNativeStyle(getNativeFilterQuality getnativefilterquality, ModernAsyncTask$1 modernAsyncTask$1) {
        super(modernAsyncTask$1);
        this.IconCompatParcelizer = getnativefilterquality;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        if (this.RemoteActionCompatParcelizer != 0) {
            try {
                if (!isCancelled()) {
                    try {
                        ((TransformOrigin) this.IconCompatParcelizer).write((getRepeated3opZhB0) get());
                    } catch (InterruptedException | ExecutionException e) {
                        ((TransformOrigin) this.IconCompatParcelizer).write(new getRepeated3opZhB0(e));
                    }
                }
                return;
            } finally {
                this.IconCompatParcelizer = null;
            }
        }
        getNativeFilterQuality getnativefilterquality = (getNativeFilterQuality) this.IconCompatParcelizer;
        AtomicBoolean atomicBoolean = getnativefilterquality.write;
        try {
            Object obj = get();
            if (atomicBoolean.get()) {
                return;
            }
            getnativefilterquality.IconCompatParcelizer(obj);
        } catch (InterruptedException e2) {
            SentryLogcatAdapter.IconCompatParcelizer("AsyncTask", e2);
        } catch (CancellationException unused) {
            if (atomicBoolean.get()) {
                return;
            }
            getnativefilterquality.IconCompatParcelizer(null);
        } catch (ExecutionException e3) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("An error occurred while executing doInBackground()", e3.getCause());
        } catch (Throwable th) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("An error occurred while executing doInBackground()", th);
        }
    }

    public /* synthetic */ getNativeStyle(Callable callable) {
        super(callable);
    }
}
