package com.deliveryhero.customerchat.analytics.model;

import androidx.compose.ui.text.android.LayoutCompat;
import bo.app.ff$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.getDensityDpi;
import o.getImageLoaderCacheSize;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@getImageLoaderCacheSize(write = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING)
public final class Product {
    private final String name;
    private final String version;

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.version;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode();
        String str = this.version;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public Product(@getDensityDpi(serializer = "name") String str, @getDensityDpi(serializer = "version") String str2) {
        str.getClass();
        this.name = str;
        this.version = str2;
    }

    public static /* synthetic */ Product copy$default(Product product, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = product.name;
        }
        if ((i & 2) != 0) {
            str2 = product.version;
        }
        return product.copy(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product product = (Product) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, product.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.version, product.version}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Product(name=");
        sb.append(this.name);
        sb.append(", version=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.version, ')');
    }

    public final Product copy(@getDensityDpi(serializer = "name") String str, @getDensityDpi(serializer = "version") String str2) {
        str.getClass();
        return new Product(str, str2);
    }

    public /* synthetic */ Product(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "p2pchat" : str, str2);
    }
}
