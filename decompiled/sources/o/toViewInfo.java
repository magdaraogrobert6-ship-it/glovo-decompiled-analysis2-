package o;

import com.roadrunner.delivery.pickupdropoff.details.api.domain.TagColorTokenMapperKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class toViewInfo {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    public static final void IconCompatParcelizer(WrapPreview wrapPreview, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        int i4 = write + 49;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        wrapPreview.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(416738571);
        if ((i & 6) == 0) {
            int i6 = IconCompatParcelizer + 5;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0 ? (i & 8) != 0 : (i & 79) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(wrapPreview);
                int i7 = write + 63;
                IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                zIconCompatParcelizer = getpostalcode.read(wrapPreview);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i9 = i2 | 48;
        if ((i9 & 19) != 18) {
            int i10 = IconCompatParcelizer + 85;
            write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!getpostalcode.write(i9 & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            modifier = androidx.compose.ui.Modifier.Companion;
            TagColorTokenMapperKt.RemoteActionCompatParcelizer(wrapPreview.write, wrapPreview.IconCompatParcelizer, modifier, 0, getpostalcode, (i9 << 3) & 896, 24);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getSLookupTables(wrapPreview, modifier, i, 1);
        }
    }
}
