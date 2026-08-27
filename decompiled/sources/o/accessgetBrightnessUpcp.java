package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetBrightnessUpcp extends accessgetButton1cp {
    public final Integer serializer;

    @Override // o.accessgetButton1cp
    public final Integer RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    public final int hashCode() {
        return this.serializer.hashCode() ^ 1000003;
    }

    public accessgetBrightnessUpcp(Integer num) {
        this.serializer = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetButton1cp)) {
            return false;
        }
        return this.serializer.equals(((accessgetBrightnessUpcp) ((accessgetButton1cp) obj)).serializer);
    }

    public final String toString() {
        return IconCompatParcelizer.write(this.serializer, "}", new StringBuilder("ProductData{productId="));
    }
}
