package o;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class BannerExternalSyntheticLambda0 {
    private final HashMap IconCompatParcelizer;
    private final String read;

    public final HashMap RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String serializer() {
        return this.read;
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() + (this.read.hashCode() * 31);
    }

    public BannerExternalSyntheticLambda0(getBannerIdannotations getbanneridannotations) {
        this.read = getbanneridannotations.IconCompatParcelizer;
        this.IconCompatParcelizer = getbanneridannotations.serializer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BannerExternalSyntheticLambda0.class != obj.getClass()) {
            return false;
        }
        BannerExternalSyntheticLambda0 bannerExternalSyntheticLambda0 = (BannerExternalSyntheticLambda0) obj;
        if (this.read.equals(bannerExternalSyntheticLambda0.read)) {
            return this.IconCompatParcelizer.equals(bannerExternalSyntheticLambda0.IconCompatParcelizer);
        }
        return false;
    }
}
