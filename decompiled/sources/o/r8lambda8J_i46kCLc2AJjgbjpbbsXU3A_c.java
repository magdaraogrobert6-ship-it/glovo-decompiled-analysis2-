package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c implements r8lambda56WtWDYfFxH1I9MfVEIOgBnACTY {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final String IconCompatParcelizer;
    public final r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U RemoteActionCompatParcelizer;
    public final boolean read;
    public final Integer serializer;
    public final String write;

    public r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c(r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U r8lambda7pyt14uieahlprgfczvsqchol6u, Integer num, String str, String str2, boolean z) {
        r8lambda7pyt14uieahlprgfczvsqchol6u.getClass();
        this.RemoteActionCompatParcelizer = r8lambda7pyt14uieahlprgfczvsqchol6u;
        this.serializer = num;
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.read = z;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        Integer num = this.serializer;
        int iHashCode3 = 0;
        if (num == null) {
            int i2 = MediaSessionCompatQueueItem;
            int i3 = i2 + 89;
            RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 119;
            RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        int iM = af$$ExternalSyntheticOutline0.m(((iHashCode2 * 31) + iHashCode) * 31, 31, this.write);
        String str = this.IconCompatParcelizer;
        if (str == null) {
            int i7 = MediaSessionCompatQueueItem + 89;
            RatingCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 23 / 0;
            }
        } else {
            iHashCode3 = str.hashCode();
            int i9 = RatingCompat + 33;
            MediaSessionCompatQueueItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        return Boolean.hashCode(this.read) + ((iM + iHashCode3) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("SwitchPreferenceItem(key=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", icon=");
        sb.append(this.serializer);
        sb.append(", title=");
        c8$$ExternalSyntheticOutline0.m(sb, this.write, ", description=", this.IconCompatParcelizer, ", value=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.read, ")");
        int i2 = RatingCompat + 43;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 103;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 5;
            MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else {
            if (!(obj instanceof r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c)) {
                return false;
            }
            r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c = (r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c) obj;
            if (this.RemoteActionCompatParcelizer != r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c.RemoteActionCompatParcelizer) {
                return false;
            }
            Object[] objArr = {this.serializer, r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c.serializer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() || !this.write.equals(r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c.write)) {
                return false;
            }
            Object[] objArr2 = {this.IconCompatParcelizer, r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c.IconCompatParcelizer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                if (this.read != r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c.read) {
                    return false;
                }
            } else {
                int i7 = MediaSessionCompatQueueItem + 7;
                RatingCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return false;
            }
        }
        int i9 = MediaSessionCompatQueueItem + 19;
        RatingCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return true;
    }
}
