package o;

import java.io.InterruptedIOException;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public final class UriUtilsExternalSyntheticLambda0 implements DateTimeConverter {
    public final /* synthetic */ isActivityRegisteredInManifestlambda0 IconCompatParcelizer;
    public final boolean read;
    public boolean serializer;
    public final RegistryMissingComponentException write = new RegistryMissingComponentException();

    public final void IconCompatParcelizer(boolean z) {
        long jMin;
        boolean z2;
        isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0 = this.IconCompatParcelizer;
        synchronized (isactivityregisteredinmanifestlambda0) {
            isactivityregisteredinmanifestlambda0.PlaybackStateCompatCustomAction.IconCompatParcelizer();
            while (isactivityregisteredinmanifestlambda0.MediaSessionCompatResultReceiverWrapper >= isactivityregisteredinmanifestlambda0.ParcelableVolumeInfo && !this.read && !this.serializer && isactivityregisteredinmanifestlambda0.serializer() == null) {
                try {
                    try {
                        isactivityregisteredinmanifestlambda0.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    isactivityregisteredinmanifestlambda0.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer();
                    throw th;
                }
            }
            isactivityregisteredinmanifestlambda0.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer();
            isactivityregisteredinmanifestlambda0.write();
            jMin = Math.min(isactivityregisteredinmanifestlambda0.ParcelableVolumeInfo - isactivityregisteredinmanifestlambda0.MediaSessionCompatResultReceiverWrapper, this.write.size);
            isactivityregisteredinmanifestlambda0.MediaSessionCompatResultReceiverWrapper += jMin;
            z2 = z && jMin == this.write.size;
        }
        this.IconCompatParcelizer.PlaybackStateCompatCustomAction.IconCompatParcelizer();
        try {
            isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda1 = this.IconCompatParcelizer;
            isactivityregisteredinmanifestlambda1.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(isactivityregisteredinmanifestlambda1.MediaMetadataCompat, z2, this.write, jMin);
        } finally {
            this.IconCompatParcelizer.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer();
        }
    }

    @Override // o.DateTimeConverter
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.PlaybackStateCompatCustomAction;
    }

    @Override // o.DateTimeConverter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0 = this.IconCompatParcelizer;
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        synchronized (isactivityregisteredinmanifestlambda0) {
            if (this.serializer) {
                return;
            }
            boolean z = isactivityregisteredinmanifestlambda0.serializer() == null;
            isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda1 = this.IconCompatParcelizer;
            if (!isactivityregisteredinmanifestlambda1.MediaDescriptionCompat.read) {
                if (this.write.size > 0) {
                    while (this.write.size > 0) {
                        IconCompatParcelizer(true);
                    }
                } else if (z) {
                    isactivityregisteredinmanifestlambda1.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(isactivityregisteredinmanifestlambda1.MediaMetadataCompat, true, null, 0L);
                }
            }
            isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda2 = this.IconCompatParcelizer;
            synchronized (isactivityregisteredinmanifestlambda2) {
                this.serializer = true;
                isactivityregisteredinmanifestlambda2.notifyAll();
            }
            this.IconCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer();
            this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        }
    }

    @Override // o.DateTimeConverter, java.io.Flushable
    public final void flush() {
        isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0 = this.IconCompatParcelizer;
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        synchronized (isactivityregisteredinmanifestlambda0) {
            isactivityregisteredinmanifestlambda0.write();
        }
        while (this.write.size > 0) {
            IconCompatParcelizer(false);
            this.IconCompatParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer();
        }
    }

    public UriUtilsExternalSyntheticLambda0(isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0, boolean z) {
        this.IconCompatParcelizer = isactivityregisteredinmanifestlambda0;
        this.read = z;
    }

    @Override // o.DateTimeConverter
    public final void write(RegistryMissingComponentException registryMissingComponentException, long j) {
        registryMissingComponentException.getClass();
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        RegistryMissingComponentException registryMissingComponentException2 = this.write;
        registryMissingComponentException2.write(registryMissingComponentException, j);
        while (registryMissingComponentException2.size >= 16384) {
            IconCompatParcelizer(false);
        }
    }
}
