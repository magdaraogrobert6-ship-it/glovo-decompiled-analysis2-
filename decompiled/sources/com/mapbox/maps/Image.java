package com.mapbox.maps;

import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes2.dex */
public final class Image implements Serializable {
    private final DataRef data;
    private final int height;
    private final int width;

    public DataRef getData() {
        return this.data;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Image(int i, int i2, DataRef dataRef) {
        this.width = i;
        this.height = i2;
        this.data = dataRef;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[width: ");
        IconCompatParcelizer.write(this.width, ", height: ", sb);
        IconCompatParcelizer.write(this.height, ", data: ", sb);
        sb.append(RecordUtils.fieldToString(this.data));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        int i = this.width;
        int i2 = this.height;
        return Objects.hash(Integer.valueOf(i), Integer.valueOf(i2), this.data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Image.class != obj.getClass()) {
            return false;
        }
        Image image = (Image) obj;
        return this.width == image.width && this.height == image.height && Objects.equals(this.data, image.data);
    }
}
