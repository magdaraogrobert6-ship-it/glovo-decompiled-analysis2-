package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda6ugNDFPZCmsyUQ0qlnt0YI4vxE implements findDesignInfoProviderslambda10 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final String read;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk write;

    public r8lambda6ugNDFPZCmsyUQ0qlnt0YI4vxE(String str, r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq) {
        r8lambdaiidsddyirtymdul5lt6pmt2zysq.getClass();
        this.read = str;
        this.write = r8lambdaiidsddyirtymdul5lt6pmt2zysq;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        String str = this.read;
        if (str == null) {
            int i3 = IconCompatParcelizer + 21;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            int i5 = IconCompatParcelizer + 65;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 2 % 5;
            }
            i = iHashCode;
        }
        return this.write.hashCode() + (i * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "InstructionsItemUi(title=" + this.read + ", instructions=" + this.write + ")";
        int i2 = serializer + 119;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 41;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambda6ugNDFPZCmsyUQ0qlnt0YI4vxE)) {
            return false;
        }
        r8lambda6ugNDFPZCmsyUQ0qlnt0YI4vxE r8lambda6ugndfpzcmsyuq0qlnt0yi4vxe = (r8lambda6ugNDFPZCmsyUQ0qlnt0YI4vxE) obj;
        Object[] objArr = {this.read, r8lambda6ugndfpzcmsyuq0qlnt0yi4vxe.read};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.write, r8lambda6ugndfpzcmsyuq0qlnt0yi4vxe.write};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            int i4 = serializer + 63;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = serializer + 13;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 3 / 0;
        }
        return true;
    }
}
