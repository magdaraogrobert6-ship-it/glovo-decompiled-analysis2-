package o;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class offsetPositionsForMove extends stopScroll {
    private static int read = 0;
    private static int write = 1;
    public final File IconCompatParcelizer;

    public offsetPositionsForMove(File file) {
        this.IconCompatParcelizer = file;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.IconCompatParcelizer.hashCode();
        }
        this.IconCompatParcelizer.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Success(files=" + this.IconCompatParcelizer + ")";
        int i2 = read + 99;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 13;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj && (!(obj instanceof offsetPositionsForMove) || !this.IconCompatParcelizer.equals(((offsetPositionsForMove) obj).IconCompatParcelizer))) {
            return false;
        }
        int i4 = read + 121;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
