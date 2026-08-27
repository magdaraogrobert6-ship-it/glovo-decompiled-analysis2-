package o;

/* JADX INFO: loaded from: classes.dex */
public final class setChildui {
    public final long read;
    public final long write;

    public final int hashCode() {
        return androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.write) + (androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.read) * 31);
    }

    public setChildui(long j, long j2) {
        this.read = j;
        this.write = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setChildui)) {
            return false;
        }
        setChildui setchildui = (setChildui) obj;
        return androidx.compose.ui.graphics.Color.m723equalsimpl0(this.read, setchildui.read) && androidx.compose.ui.graphics.Color.m723equalsimpl0(this.write, setchildui.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(this.read, ", selectionBackgroundColor=", sb);
        sb.append((Object) androidx.compose.ui.graphics.Color.m730toStringimpl(this.write));
        sb.append(')');
        return sb.toString();
    }
}
