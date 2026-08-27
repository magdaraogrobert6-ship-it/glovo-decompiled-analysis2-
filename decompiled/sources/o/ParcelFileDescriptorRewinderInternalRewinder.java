package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ParcelFileDescriptorRewinderInternalRewinder implements ItemSingleChoiceBinding {
    public final ItemSingleChoiceBinding MediaBrowserCompatMediaItem;

    @Override // o.ItemSingleChoiceBinding
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.MediaBrowserCompatMediaItem.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.MediaBrowserCompatMediaItem + ')';
    }

    public ParcelFileDescriptorRewinderInternalRewinder(ItemSingleChoiceBinding itemSingleChoiceBinding) {
        itemSingleChoiceBinding.getClass();
        this.MediaBrowserCompatMediaItem = itemSingleChoiceBinding;
    }

    @Override // o.ItemSingleChoiceBinding
    public long RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) {
        registryMissingComponentException.getClass();
        return this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(registryMissingComponentException, j);
    }
}
