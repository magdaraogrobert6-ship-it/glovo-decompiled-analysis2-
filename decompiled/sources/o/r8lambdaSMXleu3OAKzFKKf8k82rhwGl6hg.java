package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaSMXleu3OAKzFKKf8k82rhwGl6hg {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final String IconCompatParcelizer;
    public final setFirstVerticalStyle write;

    public r8lambdaSMXleu3OAKzFKKf8k82rhwGl6hg(setFirstVerticalStyle setfirstverticalstyle, String str) {
        setfirstverticalstyle.getClass();
        this.write = setfirstverticalstyle;
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 77;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + (this.write.hashCode() * 31);
        int i4 = RemoteActionCompatParcelizer + 49;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 85;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8lambdaSMXleu3OAKzFKKf8k82rhwGl6hg) {
            r8lambdaSMXleu3OAKzFKKf8k82rhwGl6hg r8lambdasmxleu3oakzfkkf8k82rhwgl6hg = (r8lambdaSMXleu3OAKzFKKf8k82rhwGl6hg) obj;
            if (this.write == r8lambdasmxleu3oakzfkkf8k82rhwgl6hg.write && this.IconCompatParcelizer.equals(r8lambdasmxleu3oakzfkkf8k82rhwgl6hg.IconCompatParcelizer)) {
                return true;
            }
        }
        int i3 = serializer + 117;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "AppearanceOption(mode=" + this.write + ", label=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 15;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
