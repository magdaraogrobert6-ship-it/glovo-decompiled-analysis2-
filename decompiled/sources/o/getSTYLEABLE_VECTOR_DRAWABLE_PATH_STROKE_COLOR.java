package o;

import com.sentiance.core.model.events.E$b;

/* JADX INFO: loaded from: classes2.dex */
public final class getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR implements mergeJsonObjects {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ E$b read;

    public /* synthetic */ getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(E$b e$b, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = e$b;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = serializer + 25;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.RemoteActionCompatParcelizer;
        E$b e$b = this.read;
        int i6 = 3;
        if (i5 != 0) {
            int i7 = 1;
            if (i5 != 1) {
                return i5 != 2 ? new getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP((getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) e$b.read, (E$b) e$b.RemoteActionCompatParcelizer, i7) : new getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP((getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) e$b.read, (E$b) e$b.RemoteActionCompatParcelizer, i);
            }
            return new getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP((getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) e$b.read, (E$b) e$b.RemoteActionCompatParcelizer, i6);
        }
        getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP getstyleable_vector_drawable_path_stroke_line_cap = new getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP((getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) e$b.read, (E$b) e$b.RemoteActionCompatParcelizer, 0);
        int i8 = write + 3;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return getstyleable_vector_drawable_path_stroke_line_cap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
