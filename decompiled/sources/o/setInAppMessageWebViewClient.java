package o;

import com.huawei.location.logic.E5;
import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class setInAppMessageWebViewClient implements ItemSingleChoiceBinding {
    public final /* synthetic */ E5 IconCompatParcelizer;
    public boolean read;
    public final /* synthetic */ RegistryNoSourceEncoderAvailableException serializer;
    public final /* synthetic */ SingleRequest write;

    @Override // o.ItemSingleChoiceBinding
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        return this.serializer.RemoteActionCompatParcelizer();
    }

    public setInAppMessageWebViewClient(RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException, E5 e5, SingleRequest singleRequest) {
        this.serializer = registryNoSourceEncoderAvailableException;
        this.IconCompatParcelizer = e5;
        this.write = singleRequest;
    }

    @Override // o.ItemSingleChoiceBinding
    public final long RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) throws IOException {
        registryMissingComponentException.getClass();
        try {
            long jRemoteActionCompatParcelizer = this.serializer.RemoteActionCompatParcelizer(registryMissingComponentException, j);
            SingleRequest singleRequest = this.write;
            if (jRemoteActionCompatParcelizer != -1) {
                registryMissingComponentException.IconCompatParcelizer(singleRequest.bufferField, registryMissingComponentException.size - jRemoteActionCompatParcelizer, jRemoteActionCompatParcelizer);
                singleRequest.write();
                return jRemoteActionCompatParcelizer;
            }
            if (!this.read) {
                this.read = true;
                singleRequest.close();
            }
            return -1L;
        } catch (IOException e) {
            if (!this.read) {
                this.read = true;
                this.IconCompatParcelizer.read();
            }
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.read) {
            TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
            TimeUnit.MILLISECONDS.getClass();
            try {
                if (!setWebViewContent.RemoteActionCompatParcelizer(this, 100)) {
                    this.read = true;
                    this.IconCompatParcelizer.read();
                }
            } catch (IOException unused) {
            }
        }
        this.serializer.close();
    }
}
