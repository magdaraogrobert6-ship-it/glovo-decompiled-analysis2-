package o;

/* JADX INFO: loaded from: classes3.dex */
public final class styleAccuracy extends isRendererInitialised {
    private static int read = 1;
    private static int write;
    public final nowInSecondsPrecise IconCompatParcelizer;

    public styleAccuracy(nowInSecondsPrecise nowinsecondsprecise) {
        super(false, false);
        this.IconCompatParcelizer = nowinsecondsprecise;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 39;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.IconCompatParcelizer.hashCode();
            int i3 = 31 / 0;
        } else {
            iHashCode = this.IconCompatParcelizer.hashCode();
        }
        int i4 = read + 49;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NoDelivery(summation=" + this.IconCompatParcelizer + ")";
        int i2 = read + 55;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 123;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof styleAccuracy) {
            return this.IconCompatParcelizer.equals(((styleAccuracy) obj).IconCompatParcelizer);
        }
        int i4 = write + 21;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
