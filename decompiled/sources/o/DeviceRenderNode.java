package o;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceRenderNode implements getClipToBounds {
    public getClipToBounds[] RemoteActionCompatParcelizer;

    @Override // o.getClipToBounds
    public final boolean RemoteActionCompatParcelizer(Class cls) {
        for (getClipToBounds getcliptobounds : this.RemoteActionCompatParcelizer) {
            if (getcliptobounds.RemoteActionCompatParcelizer(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.getClipToBounds
    public final canBeSaved read(Class cls) {
        for (getClipToBounds getcliptobounds : this.RemoteActionCompatParcelizer) {
            if (getcliptobounds.RemoteActionCompatParcelizer(cls)) {
                return getcliptobounds.read(cls);
            }
        }
        IBraze$$ExternalSyntheticBUOutline0.m("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }
}
