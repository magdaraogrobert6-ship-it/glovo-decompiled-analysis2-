package o;

import android.os.Process;
import bo.app.af$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes4.dex */
public final class getQueryParameterslambda2 implements ItemSingleChoiceBinding {
    public static int MediaMetadataCompat;
    public static int RatingCompat;
    public final /* synthetic */ isActivityRegisteredInManifestlambda0 MediaBrowserCompatMediaItem;
    public boolean read;
    public final long serializer;
    public boolean write;
    public final RegistryMissingComponentException IconCompatParcelizer = new RegistryMissingComponentException();
    public final RegistryMissingComponentException RemoteActionCompatParcelizer = new RegistryMissingComponentException();

    @Override // o.ItemSingleChoiceBinding
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem.RatingCompat;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0 = this.MediaBrowserCompatMediaItem;
        synchronized (isactivityregisteredinmanifestlambda0) {
            this.write = true;
            RegistryMissingComponentException registryMissingComponentException = this.RemoteActionCompatParcelizer;
            j = registryMissingComponentException.size;
            registryMissingComponentException.serializer();
            isactivityregisteredinmanifestlambda0.notifyAll();
        }
        if (j > 0) {
            isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda1 = this.MediaBrowserCompatMediaItem;
            TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
            isactivityregisteredinmanifestlambda1.RemoteActionCompatParcelizer.read(j);
        }
        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
    }

    public getQueryParameterslambda2(isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0, long j, boolean z) {
        this.MediaBrowserCompatMediaItem = isactivityregisteredinmanifestlambda0;
        this.serializer = j;
        this.read = z;
    }

    @Override // o.ItemSingleChoiceBinding
    public final long RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) throws Throwable {
        Throwable streamResetException;
        boolean z;
        long j2;
        registryMissingComponentException.getClass();
        if (j < 0) {
            DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j, "byteCount < 0: "));
            return 0L;
        }
        do {
            isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0 = this.MediaBrowserCompatMediaItem;
            synchronized (isactivityregisteredinmanifestlambda0) {
                isactivityregisteredinmanifestlambda0.RemoteActionCompatParcelizer.getClass();
                UriUtilsExternalSyntheticLambda0 uriUtilsExternalSyntheticLambda0 = isactivityregisteredinmanifestlambda0.MediaDescriptionCompat;
                boolean z2 = true;
                boolean z3 = uriUtilsExternalSyntheticLambda0.serializer || uriUtilsExternalSyntheticLambda0.read;
                if (z3) {
                    isactivityregisteredinmanifestlambda0.RatingCompat.IconCompatParcelizer();
                }
                try {
                    if (isactivityregisteredinmanifestlambda0.serializer() == null || this.read) {
                        streamResetException = null;
                    } else {
                        streamResetException = isactivityregisteredinmanifestlambda0.IconCompatParcelizer;
                        if (streamResetException == null) {
                            InAppMessageSlideupView inAppMessageSlideupViewSerializer = isactivityregisteredinmanifestlambda0.serializer();
                            inAppMessageSlideupViewSerializer.getClass();
                            streamResetException = new StreamResetException(inAppMessageSlideupViewSerializer);
                        }
                    }
                    if (!this.write) {
                        RegistryMissingComponentException registryMissingComponentException2 = this.RemoteActionCompatParcelizer;
                        long j3 = registryMissingComponentException2.size;
                        if (j3 > 0) {
                            long jRemoteActionCompatParcelizer = registryMissingComponentException2.RemoteActionCompatParcelizer(registryMissingComponentException, Math.min(j, j3));
                            r8lambdaKJkEmUtSdzNeIKk7hv7wrAKXQZQ.write(isactivityregisteredinmanifestlambda0.MediaSessionCompatQueueItem, jRemoteActionCompatParcelizer, 0L, 2);
                            long j4 = isactivityregisteredinmanifestlambda0.MediaSessionCompatQueueItem.read();
                            if (streamResetException == null && j4 >= isactivityregisteredinmanifestlambda0.RemoteActionCompatParcelizer.okHttpSettings.serializer() / 2) {
                                isactivityregisteredinmanifestlambda0.RemoteActionCompatParcelizer.read(isactivityregisteredinmanifestlambda0.MediaMetadataCompat, j4);
                                r8lambdaKJkEmUtSdzNeIKk7hv7wrAKXQZQ.write(isactivityregisteredinmanifestlambda0.MediaSessionCompatQueueItem, 0L, j4, 1);
                            }
                            j2 = jRemoteActionCompatParcelizer;
                            z = false;
                        } else {
                            if (this.read || streamResetException != null) {
                                z2 = false;
                            } else {
                                try {
                                    isactivityregisteredinmanifestlambda0.wait();
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    throw new InterruptedIOException();
                                }
                            }
                            z = z2;
                            j2 = -1;
                        }
                        if (z3) {
                            isactivityregisteredinmanifestlambda0.RatingCompat.RemoteActionCompatParcelizer();
                        }
                    } else {
                        throw new IOException("stream closed");
                    }
                } catch (Throwable th) {
                    if (z3) {
                        isactivityregisteredinmanifestlambda0.RatingCompat.RemoteActionCompatParcelizer();
                    }
                    throw th;
                }
            }
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer.flowControlListener.getClass();
        } while (z);
        if (j2 != -1) {
            return j2;
        }
        if (streamResetException == null) {
            return -1L;
        }
        throw streamResetException;
    }

    public static int serializer() {
        int i = RatingCompat;
        int i2 = i % 7659853;
        RatingCompat = i + 1;
        if (i2 != 0) {
            return MediaMetadataCompat;
        }
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        MediaMetadataCompat = startElapsedRealtime;
        return startElapsedRealtime;
    }
}
