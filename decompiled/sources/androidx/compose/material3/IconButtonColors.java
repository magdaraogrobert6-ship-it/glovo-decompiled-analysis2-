package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes.dex */
public final class IconButtonColors {
    public final long IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final long read;
    public final long write;

    public final int hashCode() {
        return Color.m729hashCodeimpl(this.RemoteActionCompatParcelizer) + MediaSessionCompatQueueItem.IconCompatParcelizer(MediaSessionCompatQueueItem.IconCompatParcelizer(Color.m729hashCodeimpl(this.read) * 31, 31, this.write), 31, this.IconCompatParcelizer);
    }

    public IconButtonColors(long j, long j2, long j3, long j4) {
        this.read = j;
        this.write = j2;
        this.IconCompatParcelizer = j3;
        this.RemoteActionCompatParcelizer = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IconButtonColors)) {
            return false;
        }
        IconButtonColors iconButtonColors = (IconButtonColors) obj;
        return Color.m723equalsimpl0(this.read, iconButtonColors.read) && Color.m723equalsimpl0(this.write, iconButtonColors.write) && Color.m723equalsimpl0(this.IconCompatParcelizer, iconButtonColors.IconCompatParcelizer) && Color.m723equalsimpl0(this.RemoteActionCompatParcelizer, iconButtonColors.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: copy-jRlVdoo, reason: not valid java name */
    public final IconButtonColors m115copyjRlVdoo(long j, long j2, long j3, long j4) {
        return new IconButtonColors(j != 16 ? j : this.read, j2 != 16 ? j2 : this.write, j3 != 16 ? j3 : this.IconCompatParcelizer, j4 != 16 ? j4 : this.RemoteActionCompatParcelizer);
    }
}
