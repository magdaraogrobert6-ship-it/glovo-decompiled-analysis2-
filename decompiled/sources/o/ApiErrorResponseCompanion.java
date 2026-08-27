package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class ApiErrorResponseCompanion {
    public static final ApiExceptionGeneral PlaybackStateCompat = new ApiExceptionGeneral();
    public long MediaSessionCompatToken;
    public boolean ParcelableVolumeInfo;
    public long PlaybackStateCompatCustomAction;

    public long MediaMetadataCompat() {
        return this.MediaSessionCompatToken;
    }

    public ApiErrorResponseCompanion N_() {
        this.ParcelableVolumeInfo = false;
        return this;
    }

    public boolean P_() {
        return this.ParcelableVolumeInfo;
    }

    public ApiErrorResponseCompanion O_() {
        this.MediaSessionCompatToken = 0L;
        return this;
    }

    public long Q_() {
        if (this.ParcelableVolumeInfo) {
            return this.PlaybackStateCompatCustomAction;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("No deadline");
        return 0L;
    }

    public void serializer() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.ParcelableVolumeInfo && this.PlaybackStateCompatCustomAction - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public ApiErrorResponseCompanion IconCompatParcelizer(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j >= 0) {
            this.MediaSessionCompatToken = timeUnit.toNanos(j);
            return this;
        }
        DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j, "timeout < 0: "));
        return null;
    }

    public ApiErrorResponseCompanion IconCompatParcelizer(long j) {
        this.ParcelableVolumeInfo = true;
        this.PlaybackStateCompatCustomAction = j;
        return this;
    }
}
