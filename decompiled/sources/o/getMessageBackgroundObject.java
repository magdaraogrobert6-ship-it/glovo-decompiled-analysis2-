package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class getMessageBackgroundObject extends ParcelFileDescriptorRewinderInternalRewinder {
    public final /* synthetic */ _get_messageWebView_lambda3 RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMessageBackgroundObject(getOperator getoperator, RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException) {
        super(registryNoSourceEncoderAvailableException);
        this.RemoteActionCompatParcelizer = getoperator;
    }

    @Override // o.ParcelFileDescriptorRewinderInternalRewinder, o.ItemSingleChoiceBinding
    public long RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) throws IOException {
        if (this.serializer != 1) {
            return super.RemoteActionCompatParcelizer(registryMissingComponentException, j);
        }
        try {
            return super.RemoteActionCompatParcelizer(registryMissingComponentException, j);
        } catch (IOException e) {
            ((getOperator) this.RemoteActionCompatParcelizer).serializer = e;
            throw e;
        }
    }

    @Override // o.ParcelFileDescriptorRewinderInternalRewinder, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.serializer != 0) {
            super.close();
        } else {
            ((setHasAppliedWindowInsets) this.RemoteActionCompatParcelizer).IconCompatParcelizer.close();
            super.close();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMessageBackgroundObject(ItemSingleChoiceBinding itemSingleChoiceBinding, setHasAppliedWindowInsets sethasappliedwindowinsets) {
        super(itemSingleChoiceBinding);
        this.RemoteActionCompatParcelizer = sethasappliedwindowinsets;
    }
}
