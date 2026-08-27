package o;

/* JADX INFO: loaded from: classes.dex */
public final class BasicTextFieldKt {
    public final long IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final long read;
    public final long serializer;
    public final long write;

    public final int hashCode() {
        return androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.IconCompatParcelizer) + MediaSessionCompatQueueItem.IconCompatParcelizer(MediaSessionCompatQueueItem.IconCompatParcelizer(MediaSessionCompatQueueItem.IconCompatParcelizer(androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.read) * 31, 31, this.RemoteActionCompatParcelizer), 31, this.write), 31, this.serializer);
    }

    public BasicTextFieldKt(long j, long j2, long j3, long j4, long j5) {
        this.read = j;
        this.RemoteActionCompatParcelizer = j2;
        this.write = j3;
        this.serializer = j4;
        this.IconCompatParcelizer = j5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(this.read, ", textColor=", sb);
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(this.RemoteActionCompatParcelizer, ", iconColor=", sb);
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(this.write, ", disabledTextColor=", sb);
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(this.serializer, ", disabledIconColor=", sb);
        sb.append((Object) androidx.compose.ui.graphics.Color.m730toStringimpl(this.IconCompatParcelizer));
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BasicTextFieldKt)) {
            return false;
        }
        BasicTextFieldKt basicTextFieldKt = (BasicTextFieldKt) obj;
        return androidx.compose.ui.graphics.Color.m723equalsimpl0(this.read, basicTextFieldKt.read) && androidx.compose.ui.graphics.Color.m723equalsimpl0(this.RemoteActionCompatParcelizer, basicTextFieldKt.RemoteActionCompatParcelizer) && androidx.compose.ui.graphics.Color.m723equalsimpl0(this.write, basicTextFieldKt.write) && androidx.compose.ui.graphics.Color.m723equalsimpl0(this.serializer, basicTextFieldKt.serializer) && androidx.compose.ui.graphics.Color.m723equalsimpl0(this.IconCompatParcelizer, basicTextFieldKt.IconCompatParcelizer);
    }
}
