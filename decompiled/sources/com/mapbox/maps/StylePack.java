package com.mapbox.maps;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public final class StylePack implements Serializable {
    private final long completedResourceCount;
    private final long completedResourceSize;
    private final Date expires;
    private final Value extraData;
    private final GlyphsRasterizationMode glyphsRasterizationMode;
    private final long requiredResourceCount;
    private final String styleURI;

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getCompletedResourceSize() {
        return this.completedResourceSize;
    }

    public Date getExpires() {
        return this.expires;
    }

    public Value getExtraData() {
        return this.extraData;
    }

    public GlyphsRasterizationMode getGlyphsRasterizationMode() {
        return this.glyphsRasterizationMode;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    public String getStyleURI() {
        return this.styleURI;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        String str = this.styleURI;
        GlyphsRasterizationMode glyphsRasterizationMode = this.glyphsRasterizationMode;
        long j = this.requiredResourceCount;
        long j2 = this.completedResourceCount;
        long j3 = this.completedResourceSize;
        return Objects.hash(str, glyphsRasterizationMode, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), this.expires, this.extraData);
    }

    public StylePack(String str, GlyphsRasterizationMode glyphsRasterizationMode, long j, long j2, long j3, Date date, Value value) {
        this.styleURI = str;
        this.glyphsRasterizationMode = glyphsRasterizationMode;
        this.requiredResourceCount = j;
        this.completedResourceCount = j2;
        this.completedResourceSize = j3;
        this.expires = date;
        this.extraData = value;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[styleURI: ");
        IconCompatParcelizer.read(sb, this.styleURI, ", glyphsRasterizationMode: ");
        sb.append(RecordUtils.fieldToString(this.glyphsRasterizationMode));
        sb.append(", requiredResourceCount: ");
        af$$ExternalSyntheticOutline1.m(this.requiredResourceCount, ", completedResourceCount: ", sb);
        af$$ExternalSyntheticOutline1.m(this.completedResourceCount, ", completedResourceSize: ", sb);
        af$$ExternalSyntheticOutline1.m(this.completedResourceSize, ", expires: ", sb);
        sb.append(RecordUtils.fieldToString(this.expires));
        sb.append(", extraData: ");
        sb.append(RecordUtils.fieldToString(this.extraData));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StylePack.class != obj.getClass()) {
            return false;
        }
        StylePack stylePack = (StylePack) obj;
        return Objects.equals(this.styleURI, stylePack.styleURI) && Objects.equals(this.glyphsRasterizationMode, stylePack.glyphsRasterizationMode) && this.requiredResourceCount == stylePack.requiredResourceCount && this.completedResourceCount == stylePack.completedResourceCount && this.completedResourceSize == stylePack.completedResourceSize && Objects.equals(this.expires, stylePack.expires) && Objects.equals(this.extraData, stylePack.extraData);
    }
}
