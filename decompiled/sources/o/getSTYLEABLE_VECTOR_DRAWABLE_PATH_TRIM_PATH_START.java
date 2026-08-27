package o;

import bo.app.f2$$ExternalSyntheticLambda4;

/* JADX INFO: loaded from: classes2.dex */
public final class getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final f2$$ExternalSyntheticLambda4 RemoteActionCompatParcelizer;
    public final String serializer;

    public getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START(String str, f2$$ExternalSyntheticLambda4 f2__externalsyntheticlambda4) {
        str.getClass();
        this.serializer = str;
        this.RemoteActionCompatParcelizer = f2__externalsyntheticlambda4;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + (this.serializer.hashCode() * 31);
        int i4 = IconCompatParcelizer + 25;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 95;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START) {
            getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START getstyleable_vector_drawable_path_trim_path_start = (getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START) obj;
            Object[] objArr = {this.serializer, getstyleable_vector_drawable_path_trim_path_start.serializer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() || this.RemoteActionCompatParcelizer != getstyleable_vector_drawable_path_trim_path_start.RemoteActionCompatParcelizer) {
                return false;
            }
            int i4 = IconCompatParcelizer + 95;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 63 / 0;
            }
            return true;
        }
        int i6 = read + 123;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Button(label=" + this.serializer + ", action=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = IconCompatParcelizer + 57;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
        }
        return str;
    }
}
