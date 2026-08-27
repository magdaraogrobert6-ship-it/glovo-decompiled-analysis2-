package o;

/* JADX INFO: loaded from: classes3.dex */
public final class TransactionCallbacks {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final String read;
    public final getIsTraversalGroup serializer;

    public TransactionCallbacks(String str, getIsTraversalGroup getistraversalgroup) {
        str.getClass();
        getistraversalgroup.getClass();
        this.read = str;
        this.serializer = getistraversalgroup;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + (this.read.hashCode() * 31);
        int i4 = IconCompatParcelizer + 45;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "FinishApplicationState(password=" + this.read + ", signInState=" + this.serializer + ")";
        int i2 = IconCompatParcelizer + 71;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 125;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionCallbacks)) {
            return false;
        }
        TransactionCallbacks transactionCallbacks = (TransactionCallbacks) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, transactionCallbacks.read}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, transactionCallbacks.serializer}, getCieXyz.write())).booleanValue();
        }
        int i4 = IconCompatParcelizer + 71;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
