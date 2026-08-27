package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes4.dex */
public final class clipCanvasToPathlambda0 extends ParcelFileDescriptorRewinderInternalRewinder {
    public final long IconCompatParcelizer;
    public final /* synthetic */ r8lambda0088L0EiZH2mqIpRPuXhwYCr8 MediaDescriptionCompat;
    public long RemoteActionCompatParcelizer;
    public boolean read;
    public boolean serializer;
    public boolean write;

    @Override // o.ParcelFileDescriptorRewinderInternalRewinder, o.ItemSingleChoiceBinding
    public final long RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) throws IOException {
        registryMissingComponentException.getClass();
        if (this.read) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return 0L;
        }
        try {
            long jRemoteActionCompatParcelizer = this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(registryMissingComponentException, j);
            boolean z = this.serializer;
            r8lambda0088L0EiZH2mqIpRPuXhwYCr8 r8lambda0088l0eizh2mqiprpuxhwycr8 = this.MediaDescriptionCompat;
            if (z) {
                this.serializer = false;
                r8lambda0088l0eizh2mqiprpuxhwycr8.eventListener.responseBodyStart(r8lambda0088l0eizh2mqiprpuxhwycr8.call);
            }
            if (jRemoteActionCompatParcelizer == -1) {
                serializer(null);
                return -1L;
            }
            long j2 = this.RemoteActionCompatParcelizer + jRemoteActionCompatParcelizer;
            long j3 = this.IconCompatParcelizer;
            if (j3 == -1 || j2 <= j3) {
                this.RemoteActionCompatParcelizer = j2;
                if (r8lambda0088l0eizh2mqiprpuxhwycr8.codec.IconCompatParcelizer()) {
                    serializer(null);
                }
                return jRemoteActionCompatParcelizer;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw serializer(e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clipCanvasToPathlambda0(r8lambda0088L0EiZH2mqIpRPuXhwYCr8 r8lambda0088l0eizh2mqiprpuxhwycr8, ItemSingleChoiceBinding itemSingleChoiceBinding, long j) {
        super(itemSingleChoiceBinding);
        itemSingleChoiceBinding.getClass();
        this.MediaDescriptionCompat = r8lambda0088l0eizh2mqiprpuxhwycr8;
        this.IconCompatParcelizer = j;
        this.serializer = true;
        if (j == 0) {
            serializer(null);
        }
    }

    @Override // o.ParcelFileDescriptorRewinderInternalRewinder, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.read) {
            return;
        }
        this.read = true;
        try {
            super.close();
        } catch (IOException e) {
            throw serializer(e);
        }
    }

    public final IOException serializer(IOException iOException) {
        if (this.write) {
            return iOException;
        }
        this.write = true;
        r8lambda0088L0EiZH2mqIpRPuXhwYCr8 r8lambda0088l0eizh2mqiprpuxhwycr8 = this.MediaDescriptionCompat;
        if (iOException == null && this.serializer) {
            this.serializer = false;
            r8lambda0088l0eizh2mqiprpuxhwycr8.eventListener.responseBodyStart(r8lambda0088l0eizh2mqiprpuxhwycr8.call);
        }
        return r8lambda0088L0EiZH2mqIpRPuXhwYCr8.serializer(r8lambda0088l0eizh2mqiprpuxhwycr8, this.RemoteActionCompatParcelizer, iOException, 4);
    }
}
