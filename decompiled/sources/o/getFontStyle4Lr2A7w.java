package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.hms.location.LocationRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class getFontStyle4Lr2A7w {
    public static final getFontStyle4Lr2A7w serializer;
    public final int[] IconCompatParcelizer;
    public final int MediaMetadataCompat;
    public final getFontSizeXSAIIZE RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final int[] write;

    public getFontStyle4Lr2A7w(int i, int i2, int i3) {
        this.read = i;
        this.MediaMetadataCompat = i2;
        this.RemoteActionCompatParcelizer = i3;
        this.write = new int[i2];
        this.IconCompatParcelizer = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.write[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.IconCompatParcelizer[this.write[i6]] = i6;
        }
        this.RatingCompat = new getFontSizeXSAIIZE(this, new int[]{0});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.read));
        sb.append(',');
        return af$$ExternalSyntheticOutline0.m(sb, this.MediaMetadataCompat, ')');
    }

    public final int write(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.IconCompatParcelizer;
        return this.write[(iArr[i] + iArr[i2]) % (this.MediaMetadataCompat - 1)];
    }

    static {
        new getFontStyle4Lr2A7w(4201, androidx.compose.ui.graphics.Fields.TransformOrigin, 1);
        new getFontStyle4Lr2A7w(1033, androidx.compose.ui.graphics.Fields.RotationZ, 1);
        new getFontStyle4Lr2A7w(67, 64, 1);
        new getFontStyle4Lr2A7w(19, 16, 1);
        serializer = new getFontStyle4Lr2A7w(285, androidx.compose.ui.graphics.Fields.RotationX, 0);
        new getFontStyle4Lr2A7w(LocationRequest.PRIORITY_MAG_POSITION, androidx.compose.ui.graphics.Fields.RotationX, 1);
    }
}
