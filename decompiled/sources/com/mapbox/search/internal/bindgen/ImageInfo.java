package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class ImageInfo implements Serializable {
    private final ImageCategory category;
    private final int height;
    private final String thumbnail;
    private final String type;
    private final String url;
    private final int width;

    public ImageCategory getCategory() {
        return this.category;
    }

    public int getHeight() {
        return this.height;
    }

    public String getThumbnail() {
        return this.thumbnail;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        String str = this.url;
        int i = this.width;
        int i2 = this.height;
        return Objects.hash(str, Integer.valueOf(i), Integer.valueOf(i2), this.thumbnail, this.category, this.type);
    }

    public ImageInfo(String str, int i, int i2, String str2, ImageCategory imageCategory, String str3) {
        this.url = str;
        this.width = i;
        this.height = i2;
        this.thumbnail = str2;
        this.category = imageCategory;
        this.type = str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[url: ");
        IconCompatParcelizer.read(sb, this.url, ", width: ");
        IconCompatParcelizer.write(this.width, ", height: ", sb);
        IconCompatParcelizer.write(this.height, ", thumbnail: ", sb);
        IconCompatParcelizer.read(sb, this.thumbnail, ", category: ");
        sb.append(RecordUtils.fieldToString(this.category));
        sb.append(", type: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.type, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageInfo imageInfo = (ImageInfo) obj;
        return Objects.equals(this.url, imageInfo.url) && this.width == imageInfo.width && this.height == imageInfo.height && Objects.equals(this.thumbnail, imageInfo.thumbnail) && Objects.equals(this.category, imageInfo.category) && Objects.equals(this.type, imageInfo.type);
    }
}
