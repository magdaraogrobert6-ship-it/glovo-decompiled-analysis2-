package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class createHandleImage {
    public final long IconCompatParcelizer;
    public final boolean read;
    public final long serializer;

    public final createHandleImage RemoteActionCompatParcelizer(createHandleImage createhandleimage) {
        return new createHandleImage(androidx.compose.ui.geometry.Offset.m482plusMKHz9U(this.serializer, createhandleimage.serializer), Math.max(this.IconCompatParcelizer, createhandleimage.IconCompatParcelizer), this.read);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.read) + d$$ExternalSyntheticOutline0.m(androidx.compose.ui.geometry.Offset.m479hashCodeimpl(this.serializer) * 31, 31, this.IconCompatParcelizer);
    }

    public createHandleImage(long j, long j2, boolean z) {
        this.serializer = j;
        this.IconCompatParcelizer = j2;
        this.read = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createHandleImage)) {
            return false;
        }
        createHandleImage createhandleimage = (createHandleImage) obj;
        return androidx.compose.ui.geometry.Offset.m474equalsimpl0(this.serializer, createhandleimage.serializer) && this.IconCompatParcelizer == createhandleimage.IconCompatParcelizer && this.read == createhandleimage.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
        sb.append((Object) androidx.compose.ui.geometry.Offset.m485toStringimpl(this.serializer));
        sb.append(", timeMillis=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", shouldApplyImmediately=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.read, ')');
    }
}
