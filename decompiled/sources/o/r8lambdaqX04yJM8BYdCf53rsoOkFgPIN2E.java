package o;

import com.roadrunner.delivery.state.pudo.TypographyToken;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaqX04yJM8BYdCf53rsoOkFgPIN2E {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final TypographyToken serializer;
    public final String write;

    public r8lambdaqX04yJM8BYdCf53rsoOkFgPIN2E(TypographyToken typographyToken, String str) {
        typographyToken.getClass();
        str.getClass();
        this.serializer = typographyToken;
        this.write = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 17;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + (this.serializer.hashCode() * 31);
        int i4 = read + 7;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 37;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdaqX04yJM8BYdCf53rsoOkFgPIN2E)) {
            return false;
        }
        r8lambdaqX04yJM8BYdCf53rsoOkFgPIN2E r8lambdaqx04yjm8bydcf53rsookfgpin2e = (r8lambdaqX04yJM8BYdCf53rsoOkFgPIN2E) obj;
        if (this.serializer == r8lambdaqx04yjm8bydcf53rsookfgpin2e.serializer) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, r8lambdaqx04yjm8bydcf53rsookfgpin2e.write}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = RemoteActionCompatParcelizer + 67;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        int i5 = read + 43;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OrderDetailItemUiV1(style=" + this.serializer + ", text=" + this.write + ")";
        int i2 = read + 77;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
