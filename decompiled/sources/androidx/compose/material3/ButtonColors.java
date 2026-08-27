package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes.dex */
public final class ButtonColors {
    public final long IconCompatParcelizer;
    public final long read;
    public final long serializer;
    public final long write;

    public final int hashCode() {
        return Color.m729hashCodeimpl(this.read) + MediaSessionCompatQueueItem.IconCompatParcelizer(MediaSessionCompatQueueItem.IconCompatParcelizer(Color.m729hashCodeimpl(this.IconCompatParcelizer) * 31, 31, this.serializer), 31, this.write);
    }

    public ButtonColors(long j, long j2, long j3, long j4) {
        this.IconCompatParcelizer = j;
        this.serializer = j2;
        this.write = j3;
        this.read = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ButtonColors)) {
            return false;
        }
        ButtonColors buttonColors = (ButtonColors) obj;
        return Color.m723equalsimpl0(this.IconCompatParcelizer, buttonColors.IconCompatParcelizer) && Color.m723equalsimpl0(this.serializer, buttonColors.serializer) && Color.m723equalsimpl0(this.write, buttonColors.write) && Color.m723equalsimpl0(this.read, buttonColors.read);
    }

    /* JADX INFO: renamed from: copy-jRlVdoo, reason: not valid java name */
    public final ButtonColors m113copyjRlVdoo(long j, long j2, long j3, long j4) {
        return new ButtonColors(j != 16 ? j : this.IconCompatParcelizer, j2 != 16 ? j2 : this.serializer, j3 != 16 ? j3 : this.write, j4 != 16 ? j4 : this.read);
    }
}
