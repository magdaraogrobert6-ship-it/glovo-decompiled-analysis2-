package o;

import android.content.res.ColorStateList;

/* JADX INFO: loaded from: classes4.dex */
public final class validateDateComponents {
    public final ColorStateList IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final ColorStateList read;
    public final ColorStateList write;

    public final int hashCode() {
        ColorStateList colorStateList = this.read;
        int iHashCode = colorStateList == null ? 0 : colorStateList.hashCode();
        ColorStateList colorStateList2 = this.write;
        int iHashCode2 = colorStateList2 == null ? 0 : colorStateList2.hashCode();
        ColorStateList colorStateList3 = this.IconCompatParcelizer;
        return Integer.hashCode(this.RemoteActionCompatParcelizer) + (((((iHashCode * 31) + iHashCode2) * 31) + (colorStateList3 != null ? colorStateList3.hashCode() : 0)) * 31);
    }

    public validateDateComponents(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i) {
        this.read = colorStateList;
        this.write = colorStateList2;
        this.IconCompatParcelizer = colorStateList3;
        this.RemoteActionCompatParcelizer = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof validateDateComponents)) {
            return false;
        }
        validateDateComponents validatedatecomponents = (validateDateComponents) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, validatedatecomponents.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, validatedatecomponents.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, validatedatecomponents.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && this.RemoteActionCompatParcelizer == validatedatecomponents.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "TagStyle(textColor=" + this.read + ", backgroundTint=" + this.write + ", strokeColor=" + this.IconCompatParcelizer + ", strokeWidth=" + this.RemoteActionCompatParcelizer + ")";
    }
}
