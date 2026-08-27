package com.mapbox.maps;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes2.dex */
public final class CanonicalTileID implements Serializable {
    private final int x;
    private final int y;
    private final byte z;

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public byte getZ() {
        return this.z;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public CanonicalTileID(byte b, int i, int i2) {
        this.z = b;
        this.x = i;
        this.y = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[z: ");
        MediaSessionCompatQueueItem.serializer(this.z, sb, ", x: ");
        IconCompatParcelizer.write(this.x, ", y: ", sb);
        return SweepGradientShader9KIMszodefault.serializer(this.y, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Byte.valueOf(this.z), Integer.valueOf(this.x), Integer.valueOf(this.y));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CanonicalTileID.class != obj.getClass()) {
            return false;
        }
        CanonicalTileID canonicalTileID = (CanonicalTileID) obj;
        return this.z == canonicalTileID.z && this.x == canonicalTileID.x && this.y == canonicalTileID.y;
    }
}
