package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getParagraphrAG3T2kannotations extends getStrictnessusljTpc {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final Throwable RemoteActionCompatParcelizer;
    public final String serializer;

    public getParagraphrAG3T2kannotations(String str, Throwable th) {
        str.getClass();
        this.serializer = str;
        this.RemoteActionCompatParcelizer = th;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode();
        Throwable th = this.RemoteActionCompatParcelizer;
        int iHashCode2 = (iHashCode * 31) + (th == null ? 0 : th.hashCode());
        int i4 = IconCompatParcelizer + 93;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Error(reason=" + this.serializer + ", throwable=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = read + 67;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getParagraphrAG3T2kannotations)) {
            return false;
        }
        getParagraphrAG3T2kannotations getparagraphrag3t2kannotations = (getParagraphrAG3T2kannotations) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getparagraphrag3t2kannotations.serializer}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getparagraphrag3t2kannotations.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = read + 87;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = read + 103;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 == 0;
    }
}
