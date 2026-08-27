package o;

import bo.app.af$$ExternalSyntheticOutline1;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class handleIndirectPointerEvent extends InputStream {
    public final com.google.firebase.perf.util.Timer MediaSessionCompatQueueItem;
    public long RemoteActionCompatParcelizer;
    public final NetworkRequestMetricBuilder read;
    public final InputStream write;
    public long IconCompatParcelizer = -1;
    public long serializer = -1;

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return this.write.available();
        } catch (IOException e) {
            com.google.firebase.perf.util.Timer timer = this.MediaSessionCompatQueueItem;
            NetworkRequestMetricBuilder networkRequestMetricBuilder = this.read;
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.read;
        com.google.firebase.perf.util.Timer timer = this.MediaSessionCompatQueueItem;
        long j = timer.read();
        if (this.serializer == -1) {
            this.serializer = j;
        }
        try {
            this.write.close();
            long j2 = this.IconCompatParcelizer;
            if (j2 != -1) {
                networkRequestMetricBuilder.read(j2);
            }
            long j3 = this.RemoteActionCompatParcelizer;
            if (j3 != -1) {
                getAndroidViewsHandlerui getandroidviewshandlerui = networkRequestMetricBuilder.RemoteActionCompatParcelizer;
                getandroidviewshandlerui.RemoteActionCompatParcelizer();
                ((NetworkRequestMetric) getandroidviewshandlerui.RemoteActionCompatParcelizer).setTimeToResponseInitiatedUs(j3);
            }
            networkRequestMetricBuilder.IconCompatParcelizer(this.serializer);
            networkRequestMetricBuilder.RemoteActionCompatParcelizer();
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.write.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.write.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        com.google.firebase.perf.util.Timer timer = this.MediaSessionCompatQueueItem;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.read;
        try {
            int i = this.write.read();
            long j = timer.read();
            if (this.RemoteActionCompatParcelizer == -1) {
                this.RemoteActionCompatParcelizer = j;
            }
            if (i != -1 || this.serializer != -1) {
                write(1L);
                networkRequestMetricBuilder.read(this.IconCompatParcelizer);
                return i;
            }
            this.serializer = j;
            networkRequestMetricBuilder.IconCompatParcelizer(j);
            networkRequestMetricBuilder.RemoteActionCompatParcelizer();
            return i;
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        try {
            this.write.reset();
        } catch (IOException e) {
            com.google.firebase.perf.util.Timer timer = this.MediaSessionCompatQueueItem;
            NetworkRequestMetricBuilder networkRequestMetricBuilder = this.read;
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        com.google.firebase.perf.util.Timer timer = this.MediaSessionCompatQueueItem;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.read;
        try {
            long jSkip = this.write.skip(j);
            long j2 = timer.read();
            if (this.RemoteActionCompatParcelizer == -1) {
                this.RemoteActionCompatParcelizer = j2;
            }
            if (jSkip == 0 && j != 0 && this.serializer == -1) {
                this.serializer = j2;
                networkRequestMetricBuilder.IconCompatParcelizer(j2);
                return jSkip;
            }
            write(jSkip);
            networkRequestMetricBuilder.read(this.IconCompatParcelizer);
            return jSkip;
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    public handleIndirectPointerEvent(InputStream inputStream, NetworkRequestMetricBuilder networkRequestMetricBuilder, com.google.firebase.perf.util.Timer timer) {
        this.MediaSessionCompatQueueItem = timer;
        this.write = inputStream;
        this.read = networkRequestMetricBuilder;
        this.RemoteActionCompatParcelizer = ((NetworkRequestMetric) networkRequestMetricBuilder.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer).getTimeToResponseInitiatedUs();
    }

    public final void write(long j) {
        long j2 = this.IconCompatParcelizer;
        if (j2 == -1) {
            this.IconCompatParcelizer = j;
        } else {
            this.IconCompatParcelizer = j2 + j;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        com.google.firebase.perf.util.Timer timer = this.MediaSessionCompatQueueItem;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.read;
        try {
            int i3 = this.write.read(bArr, i, i2);
            long j = timer.read();
            if (this.RemoteActionCompatParcelizer == -1) {
                this.RemoteActionCompatParcelizer = j;
            }
            if (i3 == -1 && this.serializer == -1) {
                this.serializer = j;
                networkRequestMetricBuilder.IconCompatParcelizer(j);
                networkRequestMetricBuilder.RemoteActionCompatParcelizer();
                return i3;
            }
            write(i3);
            networkRequestMetricBuilder.read(this.IconCompatParcelizer);
            return i3;
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        com.google.firebase.perf.util.Timer timer = this.MediaSessionCompatQueueItem;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.read;
        try {
            int i = this.write.read(bArr);
            long j = timer.read();
            if (this.RemoteActionCompatParcelizer == -1) {
                this.RemoteActionCompatParcelizer = j;
            }
            if (i == -1 && this.serializer == -1) {
                this.serializer = j;
                networkRequestMetricBuilder.IconCompatParcelizer(j);
                networkRequestMetricBuilder.RemoteActionCompatParcelizer();
                return i;
            }
            write(i);
            networkRequestMetricBuilder.read(this.IconCompatParcelizer);
            return i;
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }
}
