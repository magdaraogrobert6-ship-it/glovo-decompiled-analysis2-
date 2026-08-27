package androidx.compose.ui.text.font;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class LoadedFontFamily extends FontFamily {
    public static final int $stable = 0;
    private final Typeface typeface;

    public final Typeface getTypeface() {
        return this.typeface;
    }

    public LoadedFontFamily(Typeface typeface) {
        super(true, null);
        this.typeface = typeface;
    }

    public int hashCode() {
        return this.typeface.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadedFontFamily)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.typeface, ((LoadedFontFamily) obj).typeface}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "LoadedFontFamily(typeface=" + this.typeface + ')';
    }
}
