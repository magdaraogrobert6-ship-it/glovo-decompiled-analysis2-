package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class hasPhysicalKeyboard {
    public final androidx.compose.ui.window.SecureFlagPolicy write = androidx.compose.ui.window.SecureFlagPolicy.Inherit;
    public final boolean RemoteActionCompatParcelizer = true;
    public final boolean IconCompatParcelizer = true;

    public final int hashCode() {
        return Boolean.hashCode(this.IconCompatParcelizer) + d$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 29791, this.RemoteActionCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hasPhysicalKeyboard)) {
            return false;
        }
        hasPhysicalKeyboard hasphysicalkeyboard = (hasPhysicalKeyboard) obj;
        return this.write == hasphysicalkeyboard.write && this.IconCompatParcelizer == hasphysicalkeyboard.IconCompatParcelizer && this.RemoteActionCompatParcelizer == hasphysicalkeyboard.RemoteActionCompatParcelizer;
    }
}
