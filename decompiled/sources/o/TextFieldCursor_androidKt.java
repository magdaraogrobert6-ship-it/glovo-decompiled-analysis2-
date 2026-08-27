package o;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldCursor_androidKt {
    public final int read;
    public final List serializer;
    public final float[] write;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        return ((Arrays.hashCode(this.write) + (iHashCode * 31)) * 31) + this.read;
    }

    public final float serializer(Object obj) {
        int iIndexOf = this.serializer.indexOf(obj);
        accessisRelatedToAutoCommit accessisrelatedtoautocommit = androidx.compose.foundation.gestures.AnchoredDraggableKt.write;
        if (iIndexOf >= 0) {
            float[] fArr = this.write;
            if (iIndexOf < fArr.length) {
                return fArr[iIndexOf];
            }
        }
        accessisrelatedtoautocommit.invoke(Integer.valueOf(iIndexOf));
        return Float.NaN;
    }

    public final Object serializer(float f, boolean z) {
        float[] fArr = this.write;
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        float f2 = Float.POSITIVE_INFINITY;
        while (i < length) {
            float f3 = fArr[i];
            float f4 = z ? f3 - f : f - f3;
            if (f4 < 0.0f) {
                f4 = Float.POSITIVE_INFINITY;
            }
            if (f4 <= f2) {
                i3 = i2;
                f2 = f4;
            }
            i++;
            i2++;
        }
        if (i3 == -1) {
            return null;
        }
        return this.serializer.get(i3);
    }

    public TextFieldCursor_androidKt(List list, float[] fArr) {
        this.serializer = list;
        this.write = fArr;
        if (list.size() != fArr.length) {
            TriStateCheckbox.read("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + onContentCardClicked.write(fArr));
        }
        this.read = fArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldCursor_androidKt)) {
            return false;
        }
        TextFieldCursor_androidKt textFieldCursor_androidKt = (TextFieldCursor_androidKt) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, textFieldCursor_androidKt.serializer}, getCieXyz.write())).booleanValue() && Arrays.equals(this.write, textFieldCursor_androidKt.write) && this.read == textFieldCursor_androidKt.read;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    public final String toString() {
        float f;
        StringBuilder sb = new StringBuilder("DraggableAnchors(anchors={");
        int i = 0;
        while (true) {
            int i2 = this.read;
            if (i < i2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(onContentCardDismissed.read(i, this.serializer));
                sb2.append('=');
                accessisRelatedToAutoCommit accessisrelatedtoautocommit = androidx.compose.foundation.gestures.AnchoredDraggableKt.write;
                if (i >= 0) {
                    float[] fArr = this.write;
                    if (i < fArr.length) {
                        f = fArr[i];
                    } else {
                        accessisrelatedtoautocommit.invoke(Integer.valueOf(i));
                        f = Float.NaN;
                    }
                } else {
                    accessisrelatedtoautocommit.invoke(Integer.valueOf(i));
                    f = Float.NaN;
                }
                sb2.append(f);
                sb.append(sb2.toString());
                if (i < i2 - 1) {
                    sb.append(", ");
                }
                i++;
            } else {
                sb.append("})");
                return sb.toString();
            }
        }
    }

    public final Object read(float f) {
        float[] fArr = this.write;
        int length = fArr.length;
        float f2 = Float.POSITIVE_INFINITY;
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        while (i < length) {
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs <= f2) {
                i3 = i2;
                f2 = fAbs;
            }
            i++;
            i2++;
        }
        if (i3 == -1) {
            return null;
        }
        return this.serializer.get(i3);
    }
}
