package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class BlockingMessageCompanion extends ParcelFileDescriptorRewinderInternalRewinder {
    public long IconCompatParcelizer;
    public final long serializer;
    public final boolean write;

    public BlockingMessageCompanion(ItemSingleChoiceBinding itemSingleChoiceBinding, long j, boolean z) {
        super(itemSingleChoiceBinding);
        this.serializer = j;
        this.write = z;
    }

    @Override // o.ParcelFileDescriptorRewinderInternalRewinder, o.ItemSingleChoiceBinding
    public final long RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) throws IOException {
        registryMissingComponentException.getClass();
        long j2 = this.IconCompatParcelizer;
        long j3 = this.serializer;
        if (j2 > j3) {
            j = 0;
        } else if (this.write) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jRemoteActionCompatParcelizer = this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(registryMissingComponentException, j);
        if (jRemoteActionCompatParcelizer != -1) {
            this.IconCompatParcelizer += jRemoteActionCompatParcelizer;
        }
        long j5 = this.IconCompatParcelizer;
        if ((j5 >= j3 || jRemoteActionCompatParcelizer != -1) && j5 <= j3) {
            return jRemoteActionCompatParcelizer;
        }
        if (jRemoteActionCompatParcelizer > 0 && j5 > j3) {
            long j6 = registryMissingComponentException.size;
            RegistryMissingComponentException registryMissingComponentException2 = new RegistryMissingComponentException();
            registryMissingComponentException2.IconCompatParcelizer(registryMissingComponentException);
            registryMissingComponentException.write(registryMissingComponentException2, j6 - (j5 - j3));
            registryMissingComponentException2.serializer();
        }
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j3, "expected ", " bytes but got ");
        sbM.append(this.IconCompatParcelizer);
        throw new IOException(sbM.toString());
    }
}
