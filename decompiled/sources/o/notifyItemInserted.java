package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class notifyItemInserted implements notifyItemChanged, hasObservers {
    private static int RatingCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final androidx.compose.ui.text.TextStyle IconCompatParcelizer;
    public final int read;
    public final Float serializer;
    public final String write;

    public notifyItemInserted(String str, androidx.compose.ui.text.TextStyle textStyle, int i, Float f) {
        str.getClass();
        textStyle.getClass();
        this.write = str;
        this.IconCompatParcelizer = textStyle;
        this.read = i;
        this.serializer = f;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004f A[PHI: r1 r2
  0x004f: PHI (r1v12 int) = (r1v8 int), (r1v17 int) binds: [B:8:0x0042, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r2v7 java.lang.Float) = (r2v3 java.lang.Float), (r2v10 java.lang.Float) binds: [B:8:0x0042, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0044 A[PHI: r1
  0x0044: PHI (r1v9 int) = (r1v8 int), (r1v17 int) binds: [B:8:0x0042, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM;
        Float f;
        int iHashCode;
        int i = 2 % 2;
        int i2 = RatingCompat + 123;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iM = af$$ExternalSyntheticOutline0.m(this.read, MediaSessionCompatQueueItem.serializer(this.IconCompatParcelizer, this.write.hashCode() % 48, 47), 30);
            f = this.serializer;
            if (f == null) {
                int i3 = RatingCompat + 13;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                iHashCode = 0;
            } else {
                iHashCode = f.hashCode();
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.read, MediaSessionCompatQueueItem.serializer(this.IconCompatParcelizer, this.write.hashCode() * 31, 31), 31);
            f = this.serializer;
            if (f == null) {
                int i5 = RatingCompat + 13;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = f.hashCode();
            }
        }
        return iM + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "TextViewEntity(text=" + this.write + ", style=" + this.IconCompatParcelizer + ", color=" + this.read + ", weight=" + this.serializer + ")";
        int i2 = RatingCompat + 3;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof notifyItemInserted)) {
                return false;
            }
            notifyItemInserted notifyiteminserted = (notifyItemInserted) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, notifyiteminserted.write}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, notifyiteminserted.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    int i2 = RatingCompat + 43;
                    RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                if (this.read == notifyiteminserted.read) {
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, notifyiteminserted.serializer}, getCieXyz.write())).booleanValue();
                }
                int i4 = RemoteActionCompatParcelizer + 35;
                RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = RemoteActionCompatParcelizer + 109;
            RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 == 0;
        }
        int i7 = RemoteActionCompatParcelizer + 45;
        RatingCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }
}
