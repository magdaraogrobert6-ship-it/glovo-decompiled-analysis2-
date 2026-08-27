package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdabAUvFru7SWhBG96DD9tfaAOGcw4 extends r8lambdaZAOVipOHbM4PifGbUR7Pt0iDfw {
    private static int read = 1;
    private static int serializer;
    public final accessgetRadioButtoncp IconCompatParcelizer;

    public final accessgetRadioButtoncp serializer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 113;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        accessgetRadioButtoncp accessgetradiobuttoncp = this.IconCompatParcelizer;
        int i5 = i2 + 45;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return accessgetradiobuttoncp;
    }

    public r8lambdabAUvFru7SWhBG96DD9tfaAOGcw4(accessgetRadioButtoncp accessgetradiobuttoncp) {
        accessgetradiobuttoncp.getClass();
        this.IconCompatParcelizer = accessgetradiobuttoncp;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 97;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.IconCompatParcelizer.hashCode();
        }
        this.IconCompatParcelizer.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Match(action=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 65;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 55;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof r8lambdabAUvFru7SWhBG96DD9tfaAOGcw4) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, ((r8lambdabAUvFru7SWhBG96DD9tfaAOGcw4) obj).IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = read + 39;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        int i5 = serializer + 99;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
