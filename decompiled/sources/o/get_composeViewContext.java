package o;

import bo.app.af$$ExternalSyntheticOutline1;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class get_composeViewContext extends OutputStream {
    public long IconCompatParcelizer = -1;
    public final NetworkRequestMetricBuilder read;
    public final OutputStream serializer;
    public final com.google.firebase.perf.util.Timer write;

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.serializer.flush();
        } catch (IOException e) {
            com.google.firebase.perf.util.Timer timer = this.write;
            NetworkRequestMetricBuilder networkRequestMetricBuilder = this.read;
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.read;
        try {
            this.serializer.write(i);
            long j = this.IconCompatParcelizer + 1;
            this.IconCompatParcelizer = j;
            networkRequestMetricBuilder.write(j);
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(this.write, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    public get_composeViewContext(OutputStream outputStream, NetworkRequestMetricBuilder networkRequestMetricBuilder, com.google.firebase.perf.util.Timer timer) {
        this.serializer = outputStream;
        this.read = networkRequestMetricBuilder;
        this.write = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j = this.IconCompatParcelizer;
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.read;
        if (j != -1) {
            networkRequestMetricBuilder.write(j);
        }
        com.google.firebase.perf.util.Timer timer = this.write;
        long j2 = timer.read();
        getAndroidViewsHandlerui getandroidviewshandlerui = networkRequestMetricBuilder.RemoteActionCompatParcelizer;
        getandroidviewshandlerui.RemoteActionCompatParcelizer();
        ((NetworkRequestMetric) getandroidviewshandlerui.RemoteActionCompatParcelizer).setTimeToRequestCompletedUs(j2);
        try {
            this.serializer.close();
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(timer, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.read;
        try {
            this.serializer.write(bArr);
            long length = this.IconCompatParcelizer + ((long) bArr.length);
            this.IconCompatParcelizer = length;
            networkRequestMetricBuilder.write(length);
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(this.write, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.read;
        try {
            this.serializer.write(bArr, i, i2);
            long j = this.IconCompatParcelizer + ((long) i2);
            this.IconCompatParcelizer = j;
            networkRequestMetricBuilder.write(j);
        } catch (IOException e) {
            af$$ExternalSyntheticOutline1.m(this.write, networkRequestMetricBuilder, networkRequestMetricBuilder);
            throw e;
        }
    }
}
