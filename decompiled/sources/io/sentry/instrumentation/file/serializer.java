package io.sentry.instrumentation.file;

import io.sentry.SentryOptions;
import io.sentry.util.PlaybackStateCompatCustomAction;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import o.getLayer;
import o.getRecommendedTimeoutMillis;
import o.internalHeightCallbacklambda0;
import o.isContentCardsUnreadVisualIndicatorEnabled;
import o.r8lambda8edyMsNhZZLVj0T9bGZ00KrYkuE;
import o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0;

/* JADX INFO: loaded from: classes4.dex */
public final class serializer extends FileOutputStream {
    public final FileOutputStream RemoteActionCompatParcelizer;
    public final getRecommendedTimeoutMillis read;

    /* JADX WARN: Illegal instructions before constructor call */
    public serializer(isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled) throws FileNotFoundException {
        FileOutputStream fileOutputStream = (FileOutputStream) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer;
        try {
            super(fileOutputStream.getFD());
            this.read = new getRecommendedTimeoutMillis((r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) iscontentcardsunreadvisualindicatorenabled.write, (File) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer, (SentryOptions) iscontentcardsunreadvisualindicatorenabled.read);
            this.RemoteActionCompatParcelizer = fileOutputStream;
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.read.read(this.RemoteActionCompatParcelizer);
        super.close();
    }

    public static isContentCardsUnreadVisualIndicatorEnabled IconCompatParcelizer(File file, FileOutputStream fileOutputStream, boolean z) {
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat = PlaybackStateCompatCustomAction.serializer ? internalHeightCallbacklambda0.IconCompatParcelizer().MediaMetadataCompat() : internalHeightCallbacklambda0.IconCompatParcelizer().read();
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer = r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat != null ? r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat.IconCompatParcelizer("file.write") : null;
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(file, z);
        }
        return new isContentCardsUnreadVisualIndicatorEnabled(file, r8lambdareqvhj3p9oule_afn8an0r0tlg0IconCompatParcelizer, fileOutputStream, internalHeightCallbacklambda0.IconCompatParcelizer().RemoteActionCompatParcelizer(), 19);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.read.RemoteActionCompatParcelizer(new read(this, bArr, i, i2, 1));
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.read.RemoteActionCompatParcelizer(new r8lambda8edyMsNhZZLVj0T9bGZ00KrYkuE(this, 3, bArr));
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(int i) {
        this.read.RemoteActionCompatParcelizer(new getLayer(i, this));
    }

    public serializer(isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.read = new getRecommendedTimeoutMillis((r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) iscontentcardsunreadvisualindicatorenabled.write, (File) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer, (SentryOptions) iscontentcardsunreadvisualindicatorenabled.read);
        this.RemoteActionCompatParcelizer = (FileOutputStream) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer;
    }
}
