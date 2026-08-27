package o;

import com.google.android.gms.net.zza;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class StretchedVideoResolutionQuirk extends VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk implements Runnable {
    public DrawModifierNodeKt RemoteActionCompatParcelizer;
    public volatile DrawModifierNodeKt read;
    public StopCodecAfterSurfaceRemovalCrashMediaServerQuirk write;
    public final LinkedBlockingQueue IconCompatParcelizer = new LinkedBlockingQueue(1);
    public final CountDownLatch serializer = new CountDownLatch(1);

    public static Object RemoteActionCompatParcelizer(LinkedBlockingQueue linkedBlockingQueue) {
        Object objTake;
        boolean z = false;
        while (true) {
            try {
                objTake = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return objTake;
    }

    @Override // o.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.MediaBrowserCompatMediaItem.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.IconCompatParcelizer.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        DrawModifierNodeKt drawModifierNodeKt = this.RemoteActionCompatParcelizer;
        if (drawModifierNodeKt != null) {
            drawModifierNodeKt.cancel(z);
        }
        DrawModifierNodeKt drawModifierNodeKt2 = this.read;
        if (drawModifierNodeKt2 != null) {
            drawModifierNodeKt2.cancel(z);
        }
        return true;
    }

    @Override // o.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.MediaBrowserCompatMediaItem.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            DrawModifierNodeKt drawModifierNodeKt = this.RemoteActionCompatParcelizer;
            if (drawModifierNodeKt != null) {
                long jNanoTime = System.nanoTime();
                drawModifierNodeKt.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (!this.serializer.await(j, timeUnit)) {
                throw new TimeoutException();
            }
            j -= Math.max(0L, System.nanoTime() - jNanoTime2);
            DrawModifierNodeKt drawModifierNodeKt2 = this.read;
            if (drawModifierNodeKt2 != null) {
                drawModifierNodeKt2.get(j, timeUnit);
            }
        }
        return this.MediaBrowserCompatMediaItem.get(j, timeUnit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        try {
            try {
                DrawModifierNodeKt drawModifierNodeKtRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(VideoQualityQuirk.IconCompatParcelizer(this.RemoteActionCompatParcelizer));
                this.read = drawModifierNodeKtRemoteActionCompatParcelizer;
                if (this.MediaBrowserCompatMediaItem.isCancelled()) {
                    drawModifierNodeKtRemoteActionCompatParcelizer.cancel(((Boolean) RemoteActionCompatParcelizer(this.IconCompatParcelizer)).booleanValue());
                    this.read = null;
                } else {
                    drawModifierNodeKtRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new zza(this, drawModifierNodeKtRemoteActionCompatParcelizer, z, 2), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
                }
            } catch (Error e) {
                onDrawWithContent ondrawwithcontent = this.RatingCompat;
                if (ondrawwithcontent != null) {
                    ondrawwithcontent.serializer(e);
                }
            } catch (UndeclaredThrowableException e2) {
                Throwable cause = e2.getCause();
                onDrawWithContent ondrawwithcontent2 = this.RatingCompat;
                if (ondrawwithcontent2 != null) {
                    ondrawwithcontent2.serializer(cause);
                }
            } catch (Exception e3) {
                onDrawWithContent ondrawwithcontent3 = this.RatingCompat;
                if (ondrawwithcontent3 != null) {
                    ondrawwithcontent3.serializer(e3);
                }
            } finally {
                this.write = null;
                this.RemoteActionCompatParcelizer = null;
                this.serializer.countDown();
            }
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e4) {
            Throwable cause2 = e4.getCause();
            onDrawWithContent ondrawwithcontent4 = this.RatingCompat;
            if (ondrawwithcontent4 != null) {
                ondrawwithcontent4.serializer(cause2);
            }
        }
    }

    public StretchedVideoResolutionQuirk(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk stopCodecAfterSurfaceRemovalCrashMediaServerQuirk, DrawModifierNodeKt drawModifierNodeKt) {
        this.write = stopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
        drawModifierNodeKt.getClass();
        this.RemoteActionCompatParcelizer = drawModifierNodeKt;
    }

    @Override // o.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (!this.MediaBrowserCompatMediaItem.isDone()) {
            DrawModifierNodeKt drawModifierNodeKt = this.RemoteActionCompatParcelizer;
            if (drawModifierNodeKt != null) {
                drawModifierNodeKt.get();
            }
            this.serializer.await();
            DrawModifierNodeKt drawModifierNodeKt2 = this.read;
            if (drawModifierNodeKt2 != null) {
                drawModifierNodeKt2.get();
            }
        }
        return this.MediaBrowserCompatMediaItem.get();
    }
}
