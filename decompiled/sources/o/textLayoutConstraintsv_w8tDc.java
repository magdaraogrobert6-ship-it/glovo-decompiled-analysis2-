package o;

import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;

/* JADX INFO: loaded from: classes3.dex */
public abstract class textLayoutConstraintsv_w8tDc {
    private static int IconCompatParcelizer = 1;
    private static int read;

    public static final void RemoteActionCompatParcelizer(androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1604707386);
        int i3 = i | 6;
        boolean z = false;
        if ((i3 & 3) != 2) {
            int i4 = IconCompatParcelizer + 113;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                z = true;
            }
        } else {
            int i5 = read + 11;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 2 % 5;
            }
        }
        if (getpostalcode.write(i3 & 1, z)) {
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            modifier = companion;
            androidx.compose.material3.SurfaceKt.m126SurfaceT9BRK9s(androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.IconCompatParcelizer(companion, null, 3), 0.0f, Dimensions.setSplitBackground, 0.0f, 0.0f, 13), ((get_windowPosturem18o9QQ) getpostalcode.write((getNewPassword) setImeVisible.IconCompatParcelizer)).RemoteActionCompatParcelizer, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOnMenuItemClickListener(), 0L, 0.0f, 0.0f, null, drawTextd8rzKodefault.IconCompatParcelizer, getpostalcode, 12582912, 120);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        androidx.compose.ui.Modifier modifier2 = modifier;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier2, i, 3);
        }
    }
}
