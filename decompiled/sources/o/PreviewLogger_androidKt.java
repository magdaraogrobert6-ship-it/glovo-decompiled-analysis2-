package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class PreviewLogger_androidKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final setParameterizedContentlambda0100 IconCompatParcelizer;
    public final ArrayList read;

    public PreviewLogger_androidKt(ArrayList arrayList, setParameterizedContentlambda0100 setparameterizedcontentlambda0100) {
        this.read = arrayList;
        this.IconCompatParcelizer = setparameterizedcontentlambda0100;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 97;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.IconCompatParcelizer.hashCode() >> (this.read.hashCode() + 19);
        } else {
            iHashCode = (this.read.hashCode() * 31) + this.IconCompatParcelizer.hashCode();
        }
        int i3 = RemoteActionCompatParcelizer + 97;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ConfirmationTask(pictureUploadTasks=" + this.read + ", confirmTask=" + this.IconCompatParcelizer + ")";
        int i2 = RemoteActionCompatParcelizer + 69;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 111;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof PreviewLogger_androidKt)) {
            return false;
        }
        PreviewLogger_androidKt previewLogger_androidKt = (PreviewLogger_androidKt) obj;
        if (this.read.equals(previewLogger_androidKt.read)) {
            return this.IconCompatParcelizer.equals(previewLogger_androidKt.IconCompatParcelizer);
        }
        int i4 = serializer + 27;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
