package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda9dwTneWqHzFwEeeDLZ80_1lxoOc {
    public final Integer IconCompatParcelizer;
    public final boolean RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final boolean read;
    public final Integer serializer;
    public final boolean write;

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.write);
        Integer num = this.IconCompatParcelizer;
        int iM = d$$ExternalSyntheticOutline0.m(((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31, 31, this.read);
        Integer num2 = this.serializer;
        return Boolean.hashCode(this.RatingCompat) + d$$ExternalSyntheticOutline0.m((iM + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.RemoteActionCompatParcelizer);
    }

    public r8lambda9dwTneWqHzFwEeeDLZ80_1lxoOc(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.write = z;
        this.IconCompatParcelizer = num;
        this.read = z2;
        this.serializer = num2;
        this.RemoteActionCompatParcelizer = z3;
        this.RatingCompat = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambda9dwTneWqHzFwEeeDLZ80_1lxoOc)) {
            return false;
        }
        r8lambda9dwTneWqHzFwEeeDLZ80_1lxoOc r8lambda9dwtnewqhzfweeedlz80_1lxooc = (r8lambda9dwTneWqHzFwEeeDLZ80_1lxoOc) obj;
        if (this.write != r8lambda9dwtnewqhzfweeedlz80_1lxooc.write) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, r8lambda9dwtnewqhzfweeedlz80_1lxooc.IconCompatParcelizer}, getCieXyz.write())).booleanValue() || this.read != r8lambda9dwtnewqhzfweeedlz80_1lxooc.read) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambda9dwtnewqhzfweeedlz80_1lxooc.serializer}, getCieXyz.write())).booleanValue() && this.RemoteActionCompatParcelizer == r8lambda9dwtnewqhzfweeedlz80_1lxooc.RemoteActionCompatParcelizer && this.RatingCompat == r8lambda9dwtnewqhzfweeedlz80_1lxooc.RatingCompat;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb.append(this.write);
        sb.append(", clientMaxWindowBits=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", clientNoContextTakeover=");
        sb.append(this.read);
        sb.append(", serverMaxWindowBits=");
        sb.append(this.serializer);
        sb.append(", serverNoContextTakeover=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", unknownValues=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.RatingCompat, ')');
    }
}
