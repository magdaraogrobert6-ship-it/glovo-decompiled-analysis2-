package o;

import com.roadrunner.delivery.pickupdropoff.details.api.domain.TagColorTokenMapperKt;
import com.roadrunner.delivery.state.pudo.TagColorToken;

/* JADX INFO: loaded from: classes3.dex */
public abstract class putInto {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    public static final void RemoteActionCompatParcelizer(WrapPreview wrapPreview, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        String str;
        TagColorToken tagColorToken;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        wrapPreview.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1469452166);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(wrapPreview) : getpostalcode.IconCompatParcelizer(wrapPreview) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(modifier)) {
                int i8 = RemoteActionCompatParcelizer + 35;
                write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if (!(!getpostalcode.write(i2 & 1, (i2 & 19) != 18))) {
            int i10 = RemoteActionCompatParcelizer + 105;
            write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                str = wrapPreview.IconCompatParcelizer;
                tagColorToken = wrapPreview.write;
                i3 = 0;
                i4 = (i2 << 2) & 19351;
                i5 = 102;
            } else {
                str = wrapPreview.IconCompatParcelizer;
                tagColorToken = wrapPreview.write;
                i3 = 0;
                i4 = (i2 << 3) & 896;
                i5 = 24;
            }
            TagColorTokenMapperKt.RemoteActionCompatParcelizer(tagColorToken, str, modifier, i3, getpostalcode, i4, i5);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getSLookupTables(wrapPreview, modifier, i, 0);
            int i11 = RemoteActionCompatParcelizer + 33;
            write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
    }
}
