package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hasOverlappingRendering {
    public final CharSequence IconCompatParcelizer;
    public final int read;

    public hasOverlappingRendering(int i, CharSequence charSequence) {
        this.read = i;
        this.IconCompatParcelizer = charSequence;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hasOverlappingRendering)) {
            return false;
        }
        hasOverlappingRendering hasoverlappingrendering = (hasOverlappingRendering) obj;
        if (this.read != hasoverlappingrendering.read) {
            return false;
        }
        CharSequence charSequence = hasoverlappingrendering.IconCompatParcelizer;
        CharSequence charSequence2 = this.IconCompatParcelizer;
        String string = charSequence2 != null ? charSequence2.toString() : null;
        String string2 = charSequence != null ? charSequence.toString() : null;
        if (string == null && string2 == null) {
            return true;
        }
        return string != null && string.equals(string2);
    }

    public final int hashCode() {
        int i = this.read;
        CharSequence charSequence = this.IconCompatParcelizer;
        return Arrays.hashCode(new Object[]{Integer.valueOf(i), charSequence != null ? charSequence.toString() : null});
    }
}
