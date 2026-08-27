package o;

/* JADX INFO: loaded from: classes3.dex */
public final class findAnimatable extends findAnimationSpec {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final String RemoteActionCompatParcelizer;
    public final String write;

    public findAnimatable(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final String toString() {
        String strWrite;
        int i = 2 % 2;
        int i2 = serializer + 49;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("OpenDeeplink(url=", this.write, ", componentId=", this.RemoteActionCompatParcelizer, ")");
            int i3 = 47 / 0;
        } else {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("OpenDeeplink(url=", this.write, ", componentId=", this.RemoteActionCompatParcelizer, ")");
        }
        int i4 = serializer + 53;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 85;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + (this.write.hashCode() * 31);
        int i4 = serializer + 79;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 97;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof findAnimatable)) {
            return false;
        }
        findAnimatable findanimatable = (findAnimatable) obj;
        Object[] objArr = {this.write, findanimatable.write};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i3 = IconCompatParcelizer + 99;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        Object[] objArr2 = {this.RemoteActionCompatParcelizer, findanimatable.RemoteActionCompatParcelizer};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i5 = serializer + 35;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
