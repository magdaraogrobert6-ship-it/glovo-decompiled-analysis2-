package o;

/* JADX INFO: loaded from: classes3.dex */
public final class m1ExternalSyntheticLambda18 extends ArrangementCenter1 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final m1ExternalSyntheticLambda18 read = new m1ExternalSyntheticLambda18();
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = write + 123;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return "LastLocationRequestTimeout";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 77;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return 572386515;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 73;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj || (obj instanceof m1ExternalSyntheticLambda18)) {
            return true;
        }
        int i5 = i2 + 125;
        int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 99;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
