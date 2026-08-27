package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class HitTestResultKt extends replaceAll {
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int serializer;
    public final HitTestResultSubList write;

    public HitTestResultKt(int i, int i2, int i3, HitTestResultSubList hitTestResultSubList) {
        this.IconCompatParcelizer = i;
        this.serializer = i2;
        this.RemoteActionCompatParcelizer = i3;
        this.write = hitTestResultSubList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
        sb.append(this.write);
        sb.append(", ");
        sb.append(this.serializer);
        sb.append("-byte IV, ");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("-byte tag, and ");
        return af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, "-byte key)", sb);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HitTestResultKt)) {
            return false;
        }
        HitTestResultKt hitTestResultKt = (HitTestResultKt) obj;
        return hitTestResultKt.IconCompatParcelizer == this.IconCompatParcelizer && hitTestResultKt.serializer == this.serializer && hitTestResultKt.RemoteActionCompatParcelizer == this.RemoteActionCompatParcelizer && hitTestResultKt.write == this.write;
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        int i2 = this.serializer;
        int i3 = this.RemoteActionCompatParcelizer;
        return Objects.hash(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), this.write);
    }
}
