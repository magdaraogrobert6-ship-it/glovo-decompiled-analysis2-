package o;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class isSpecifiedk4lQ0Mannotations extends MediaDataSource {
    public long RemoteActionCompatParcelizer;
    public final /* synthetic */ getHeightannotations write;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    public isSpecifiedk4lQ0Mannotations(getHeightannotations getheightannotations) {
        this.write = getheightannotations;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        getHeightannotations getheightannotations = this.write;
        DataInputStream dataInputStream = getheightannotations.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.RemoteActionCompatParcelizer;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + ((long) dataInputStream.available())) {
                        getheightannotations.RemoteActionCompatParcelizer(j);
                        this.RemoteActionCompatParcelizer = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int i3 = getheightannotations.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.RemoteActionCompatParcelizer += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.RemoteActionCompatParcelizer = -1L;
            return -1;
        }
        return -1;
    }
}
