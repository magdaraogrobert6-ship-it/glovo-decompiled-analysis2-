package com.mapbox.maps;

import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes2.dex */
public final class TileOptions implements Serializable {
    private final short buffer;
    private final boolean clip;
    private final short tileSize;
    private final double tolerance;
    private final boolean wrap;

    /* JADX INFO: loaded from: classes4.dex */
    public static final class Builder {
        private double tolerance = 0.375d;
        private short tileSize = 512;
        private short buffer = 128;
        private boolean clip = false;
        private boolean wrap = false;

        public Builder buffer(short s) {
            this.buffer = s;
            return this;
        }

        public Builder clip(boolean z) {
            this.clip = z;
            return this;
        }

        public Builder tileSize(short s) {
            this.tileSize = s;
            return this;
        }

        public Builder tolerance(double d) {
            this.tolerance = d;
            return this;
        }

        public Builder wrap(boolean z) {
            this.wrap = z;
            return this;
        }

        public TileOptions build() {
            return new TileOptions(this.tolerance, this.tileSize, this.buffer, this.clip, this.wrap);
        }
    }

    public short getBuffer() {
        return this.buffer;
    }

    public boolean getClip() {
        return this.clip;
    }

    public short getTileSize() {
        return this.tileSize;
    }

    public double getTolerance() {
        return this.tolerance;
    }

    public boolean getWrap() {
        return this.wrap;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Builder toBuilder() {
        return new Builder().tolerance(this.tolerance).tileSize(this.tileSize).buffer(this.buffer).clip(this.clip).wrap(this.wrap);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[tolerance: ");
        m1$$ExternalSyntheticOutline0.m(this.tolerance, ", tileSize: ", sb);
        sb.append(RecordUtils.fieldToString(Short.valueOf(this.tileSize)));
        sb.append(", buffer: ");
        sb.append(RecordUtils.fieldToString(Short.valueOf(this.buffer)));
        sb.append(", clip: ");
        MediaSessionCompatQueueItem.write(sb, this.clip, ", wrap: ");
        return ff$$ExternalSyntheticOutline0.m(this.wrap, sb, "]");
    }

    private TileOptions() {
        this.tolerance = 0.375d;
        this.tileSize = (short) 512;
        this.buffer = (short) 128;
        this.clip = false;
        this.wrap = false;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.tolerance), Short.valueOf(this.tileSize), Short.valueOf(this.buffer), Boolean.valueOf(this.clip), Boolean.valueOf(this.wrap));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TileOptions.class != obj.getClass()) {
            return false;
        }
        TileOptions tileOptions = (TileOptions) obj;
        return PartialEq.compare(this.tolerance, tileOptions.tolerance) && this.tileSize == tileOptions.tileSize && this.buffer == tileOptions.buffer && this.clip == tileOptions.clip && this.wrap == tileOptions.wrap;
    }

    private TileOptions(double d, short s, short s2, boolean z, boolean z2) {
        this.tolerance = d;
        this.tileSize = s;
        this.buffer = s2;
        this.clip = z;
        this.wrap = z2;
    }
}
