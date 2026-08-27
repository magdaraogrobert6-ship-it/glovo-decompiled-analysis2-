package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes4.dex */
public final class clipCanvasToPathlambda1 extends hasAlpha {
    public final long IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public long read;
    public final /* synthetic */ r8lambda0088L0EiZH2mqIpRPuXhwYCr8 serializer;
    public boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clipCanvasToPathlambda1(r8lambda0088L0EiZH2mqIpRPuXhwYCr8 r8lambda0088l0eizh2mqiprpuxhwycr8, DateTimeConverter dateTimeConverter, long j) {
        super(dateTimeConverter);
        dateTimeConverter.getClass();
        this.serializer = r8lambda0088l0eizh2mqiprpuxhwycr8;
        this.IconCompatParcelizer = j;
    }

    @Override // o.hasAlpha, o.DateTimeConverter
    public final void write(RegistryMissingComponentException registryMissingComponentException, long j) throws IOException {
        registryMissingComponentException.getClass();
        if (this.RemoteActionCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return;
        }
        long j2 = this.IconCompatParcelizer;
        if (j2 != -1 && this.read + j > j2) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j2, "expected ", " bytes but received ");
            sbM.append(this.read + j);
            throw new ProtocolException(sbM.toString());
        }
        try {
            this.MediaMetadataCompat.write(registryMissingComponentException, j);
            this.read += j;
        } catch (IOException e) {
            throw RemoteActionCompatParcelizer(e);
        }
    }

    @Override // o.hasAlpha, o.DateTimeConverter, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            throw RemoteActionCompatParcelizer(e);
        }
    }

    public final IOException RemoteActionCompatParcelizer(IOException iOException) {
        if (this.write) {
            return iOException;
        }
        this.write = true;
        return r8lambda0088L0EiZH2mqIpRPuXhwYCr8.serializer(this.serializer, this.read, iOException, 2);
    }

    @Override // o.hasAlpha, o.DateTimeConverter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        this.RemoteActionCompatParcelizer = true;
        long j = this.IconCompatParcelizer;
        if (j != -1 && this.read != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
        } catch (IOException e) {
            throw RemoteActionCompatParcelizer(e);
        }
    }
}
