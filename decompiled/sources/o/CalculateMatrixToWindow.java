package o;

import java.util.Arrays;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class CalculateMatrixToWindow {
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final boolean read;
    public final float write;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof CalculateMatrixToWindow)) {
                return false;
            }
            CalculateMatrixToWindow calculateMatrixToWindow = (CalculateMatrixToWindow) obj;
            if (Float.floatToIntBits(this.write) != Float.floatToIntBits(calculateMatrixToWindow.write)) {
                return false;
            }
            if (!TuplesKt.write(Integer.valueOf(this.IconCompatParcelizer), Integer.valueOf(calculateMatrixToWindow.IconCompatParcelizer)) || !TuplesKt.write((Object) 1, (Object) 1) || !TuplesKt.write((Object) 1, (Object) 1)) {
                return false;
            }
            if (!TuplesKt.write(Boolean.valueOf(this.read), Boolean.valueOf(calculateMatrixToWindow.read))) {
                return false;
            }
            if (!TuplesKt.write(Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(calculateMatrixToWindow.RemoteActionCompatParcelizer)) || !TuplesKt.write((Object) null, (Object) null)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Float.floatToIntBits(this.write)), Integer.valueOf(this.IconCompatParcelizer), 1, 1, Boolean.valueOf(this.read), Integer.valueOf(this.RemoteActionCompatParcelizer), null});
    }

    public /* synthetic */ CalculateMatrixToWindow(int i, int i2, boolean z, float f) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.read = z;
        this.write = f;
    }

    public final String toString() {
        accessgetTvTeletextcp accessgettvteletextcp = new accessgetTvTeletextcp("FaceDetectorOptions");
        accessgettvteletextcp.IconCompatParcelizer(this.IconCompatParcelizer, "landmarkMode");
        accessgettvteletextcp.IconCompatParcelizer(1, "contourMode");
        accessgettvteletextcp.IconCompatParcelizer(this.RemoteActionCompatParcelizer, "classificationMode");
        accessgettvteletextcp.IconCompatParcelizer(1, "performanceMode");
        boolean z = this.read;
        createMeasurePolicy createmeasurepolicy = new createMeasurePolicy((byte) 0, 15);
        ((accessgetTvTeletextcp) accessgettvteletextcp.write).write = createmeasurepolicy;
        accessgettvteletextcp.write = createmeasurepolicy;
        createmeasurepolicy.serializer = String.valueOf(z);
        createmeasurepolicy.RemoteActionCompatParcelizer = "trackingEnabled";
        accessgettvteletextcp.IconCompatParcelizer(this.write, "minFaceSize");
        return accessgettvteletextcp.toString();
    }
}
