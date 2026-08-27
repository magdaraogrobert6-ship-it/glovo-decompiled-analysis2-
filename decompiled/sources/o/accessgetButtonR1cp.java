package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButtonR1cp extends accessgetChannelUpcp {
    public final Integer IconCompatParcelizer;

    public accessgetButtonR1cp(Integer num) {
        this.IconCompatParcelizer = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetChannelUpcp)) {
            return false;
        }
        Integer num = this.IconCompatParcelizer;
        accessgetButtonR1cp accessgetbuttonr1cp = (accessgetButtonR1cp) ((accessgetChannelUpcp) obj);
        if (num == null) {
            return accessgetbuttonr1cp.IconCompatParcelizer == null;
        }
        return num.equals(accessgetbuttonr1cp.IconCompatParcelizer);
    }

    public final String toString() {
        return IconCompatParcelizer.write(this.IconCompatParcelizer, "}", new StringBuilder("ExternalPRequestContext{originAssociatedProductId="));
    }

    public final int hashCode() {
        Integer num = this.IconCompatParcelizer;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }
}
