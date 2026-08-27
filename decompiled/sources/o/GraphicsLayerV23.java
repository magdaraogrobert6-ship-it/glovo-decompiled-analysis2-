package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class GraphicsLayerV23 extends accessgetTestFailCreateRenderNodecp {
    public final String serializer;

    public final String serializer() {
        return this.serializer;
    }

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    public GraphicsLayerV23(String str) {
        this.serializer = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GraphicsLayerV23) && this.serializer.equals(((GraphicsLayerV23) obj).serializer);
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("Success(cachedPath="), this.serializer, ')');
    }
}
