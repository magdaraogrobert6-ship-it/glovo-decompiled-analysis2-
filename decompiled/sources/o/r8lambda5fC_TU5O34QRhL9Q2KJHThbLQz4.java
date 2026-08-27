package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda5fC_TU5O34QRhL9Q2KJHThbLQz4 implements r8lambda56WtWDYfFxH1I9MfVEIOgBnACTY {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final String IconCompatParcelizer;
    public final String read;
    public final r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4 write;

    public r8lambda5fC_TU5O34QRhL9Q2KJHThbLQz4(r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4 r8lambda61usyyumzjrqq3yb5acq_1_eeg4, String str, String str2) {
        r8lambda61usyyumzjrqq3yb5acq_1_eeg4.getClass();
        this.write = r8lambda61usyyumzjrqq3yb5acq_1_eeg4;
        this.IconCompatParcelizer = str;
        this.read = str2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 93;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(com.logistics.rider.glovo.R.drawable.ic_bold_large_settings_device) + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.read);
        int i4 = RemoteActionCompatParcelizer + 11;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("AppLinkItem(key=");
        sb.append(this.write);
        sb.append(", title=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", description=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.read, ", icon=2131231256)");
        int i2 = serializer + 49;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 59;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 111;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof r8lambda5fC_TU5O34QRhL9Q2KJHThbLQz4)) {
            return false;
        }
        r8lambda5fC_TU5O34QRhL9Q2KJHThbLQz4 r8lambda5fc_tu5o34qrhl9q2kjhthblqz4 = (r8lambda5fC_TU5O34QRhL9Q2KJHThbLQz4) obj;
        if (this.write == r8lambda5fc_tu5o34qrhl9q2kjhthblqz4.write) {
            return this.IconCompatParcelizer.equals(r8lambda5fc_tu5o34qrhl9q2kjhthblqz4.IconCompatParcelizer) && this.read.equals(r8lambda5fc_tu5o34qrhl9q2kjhthblqz4.read);
        }
        int i6 = i3 + 109;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
