package io.sentry.instrumentation.file;

import io.sentry.SentryOptions;
import io.sentry.util.PlaybackStateCompatCustomAction;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import o.EventDuplicationValidatorDataStoreProviderCompanion;
import o.getRecommendedTimeoutMillis;
import o.internalHeightCallbacklambda0;
import o.isContentCardsUnreadVisualIndicatorEnabled;
import o.r8lambda8edyMsNhZZLVj0T9bGZ00KrYkuE;
import o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0;

/* JADX INFO: loaded from: classes4.dex */
public final class write extends FileInputStream {
    public final getRecommendedTimeoutMillis serializer;
    public final FileInputStream write;

    /* JADX WARN: Illegal instructions before constructor call */
    public write(isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled) throws FileNotFoundException {
        FileInputStream fileInputStream = (FileInputStream) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer;
        try {
            super(fileInputStream.getFD());
            this.serializer = new getRecommendedTimeoutMillis((r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) iscontentcardsunreadvisualindicatorenabled.write, (File) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer, (SentryOptions) iscontentcardsunreadvisualindicatorenabled.read);
            this.write = fileInputStream;
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.serializer.read(this.write);
        super.close();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final long skip(long j) {
        return ((Long) this.serializer.RemoteActionCompatParcelizer(new EventDuplicationValidatorDataStoreProviderCompanion(this, j))).longValue();
    }

    public static isContentCardsUnreadVisualIndicatorEnabled write(File file, FileInputStream fileInputStream) {
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat = PlaybackStateCompatCustomAction.serializer ? internalHeightCallbacklambda0.IconCompatParcelizer().MediaMetadataCompat() : internalHeightCallbacklambda0.IconCompatParcelizer().read();
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer = r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat != null ? r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat.IconCompatParcelizer("file.read") : null;
        if (fileInputStream == null) {
            fileInputStream = new FileInputStream(file);
        }
        return new isContentCardsUnreadVisualIndicatorEnabled(file, r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer, fileInputStream, internalHeightCallbacklambda0.IconCompatParcelizer().RemoteActionCompatParcelizer(), 18);
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return ((Integer) this.serializer.RemoteActionCompatParcelizer(new read(this, bArr, i, i2, 0))).intValue();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return ((Integer) this.serializer.RemoteActionCompatParcelizer(new r8lambda8edyMsNhZZLVj0T9bGZ00KrYkuE(this, 1, bArr))).intValue();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read() {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.serializer.RemoteActionCompatParcelizer(new r8lambda8edyMsNhZZLVj0T9bGZ00KrYkuE(this, 2, atomicInteger));
        return atomicInteger.get();
    }

    public write(isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.serializer = new getRecommendedTimeoutMillis((r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) iscontentcardsunreadvisualindicatorenabled.write, (File) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer, (SentryOptions) iscontentcardsunreadvisualindicatorenabled.read);
        this.write = (FileInputStream) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer;
    }
}
