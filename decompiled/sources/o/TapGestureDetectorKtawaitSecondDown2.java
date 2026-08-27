package o;

/* JADX INFO: loaded from: classes.dex */
public final class TapGestureDetectorKtawaitSecondDown2 {
    public final androidx.compose.animation.core.Animatable RemoteActionCompatParcelizer;
    public long read;

    public final int hashCode() {
        return androidx.compose.ui.unit.IntSize.m3845hashCodeimpl(this.read) + (this.RemoteActionCompatParcelizer.hashCode() * 31);
    }

    public TapGestureDetectorKtawaitSecondDown2(androidx.compose.animation.core.Animatable animatable, long j) {
        this.RemoteActionCompatParcelizer = animatable;
        this.read = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TapGestureDetectorKtawaitSecondDown2) {
            TapGestureDetectorKtawaitSecondDown2 tapGestureDetectorKtawaitSecondDown2 = (TapGestureDetectorKtawaitSecondDown2) obj;
            if (this.RemoteActionCompatParcelizer == tapGestureDetectorKtawaitSecondDown2.RemoteActionCompatParcelizer && androidx.compose.ui.unit.IntSize.m3842equalsimpl0(this.read, tapGestureDetectorKtawaitSecondDown2.read)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "AnimData(anim=" + this.RemoteActionCompatParcelizer + ", startSize=" + ((Object) androidx.compose.ui.unit.IntSize.m3847toStringimpl(this.read)) + ')';
    }
}
