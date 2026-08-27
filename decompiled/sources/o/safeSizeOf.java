package o;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class safeSizeOf extends getEntries {
    public final String IconCompatParcelizer;
    public int read;

    @Override // o.getEntries, o.FocusMeteringAction
    public final String read() {
        return this.IconCompatParcelizer;
    }

    @Override // o.getEntries, o.FocusMeteringAction
    public final int RemoteActionCompatParcelizer(int i) {
        return MediaStoreVideoCannotWrite.RemoteActionCompatParcelizer(this.write.RemoteActionCompatParcelizer(i) - this.read);
    }

    public safeSizeOf(FocusMeteringAction focusMeteringAction) {
        super(focusMeteringAction);
        this.IconCompatParcelizer = "virtual-" + focusMeteringAction.read() + "-" + UUID.randomUUID().toString();
    }

    @Override // o.getEntries, o.FocusMeteringAction
    public final int MediaDescriptionCompat() {
        return RemoteActionCompatParcelizer(0);
    }
}
