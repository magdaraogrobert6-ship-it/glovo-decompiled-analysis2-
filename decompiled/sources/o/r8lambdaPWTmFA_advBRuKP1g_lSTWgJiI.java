package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaPWTmFA_advBRuKP1g_lSTWgJiI {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final String read;
    public final String write;

    public r8lambdaPWTmFA_advBRuKP1g_lSTWgJiI(String str, String str2) {
        str2.getClass();
        this.write = str;
        this.read = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 69;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("ExtraItem(title=", this.write, ", price=", this.read, ")");
        int i4 = RemoteActionCompatParcelizer + 109;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strWrite;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 25;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.read.hashCode() >>> (this.write.hashCode() << 71);
        }
        return (this.write.hashCode() * 31) + this.read.hashCode();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 29;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 39;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdaPWTmFA_advBRuKP1g_lSTWgJiI)) {
            return false;
        }
        r8lambdaPWTmFA_advBRuKP1g_lSTWgJiI r8lambdapwtmfa_advbrukp1g_lstwgjii = (r8lambdaPWTmFA_advBRuKP1g_lSTWgJiI) obj;
        if (!this.write.equals(r8lambdapwtmfa_advbrukp1g_lstwgjii.write)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, r8lambdapwtmfa_advbrukp1g_lstwgjii.read}, getCieXyz.write())).booleanValue();
    }
}
