package o;

/* JADX INFO: loaded from: classes.dex */
public final class PathHitTesterdefault extends ParcelFileDescriptorRewinderInternalRewinder {
    public Exception read;

    @Override // o.ParcelFileDescriptorRewinderInternalRewinder, o.ItemSingleChoiceBinding
    public final long RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) throws Exception {
        try {
            return super.RemoteActionCompatParcelizer(registryMissingComponentException, j);
        } catch (Exception e) {
            this.read = e;
            throw e;
        }
    }

    public PathHitTesterdefault(ItemSingleChoiceBinding itemSingleChoiceBinding) {
        super(itemSingleChoiceBinding);
    }
}
