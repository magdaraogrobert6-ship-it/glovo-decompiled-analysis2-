package o;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class getScreen {
    public final BigInteger RemoteActionCompatParcelizer;
    public final getProduct read;
    public final BigInteger serializer;
    public final BigInteger write;

    public final int hashCode() {
        return (this.write.hashCode() ^ this.RemoteActionCompatParcelizer.hashCode()) ^ this.serializer.hashCode();
    }

    public getScreen(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, getProduct getproduct) {
        this.serializer = bigInteger3;
        this.write = bigInteger;
        this.RemoteActionCompatParcelizer = bigInteger2;
        this.read = getproduct;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof getScreen)) {
            return false;
        }
        getScreen getscreen = (getScreen) obj;
        return getscreen.write.equals(this.write) && getscreen.RemoteActionCompatParcelizer.equals(this.RemoteActionCompatParcelizer) && getscreen.serializer.equals(this.serializer);
    }
}
