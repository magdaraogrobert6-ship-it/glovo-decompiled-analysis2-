package o;

import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class resolveContentProvider {
    private static int IconCompatParcelizer = 1;
    private static int write;

    public static final void IconCompatParcelizer(androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-588299900);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i4 = write + 29;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = IconCompatParcelizer + 27;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            androidx.compose.material3.IconKt.m117Iconww6aTOc(androidx.compose.ui.res.VectorResources_androidKt.vectorResource(androidx.compose.ui.graphics.vector.ImageVector.Companion, com.logistics.rider.glovo.R.drawable.ic_bold_medium_spinner_default, getpostalcode, 6), "Slider loading spinner", androidx.compose.ui.draw.RotateKt.rotate(modifier, ((Number) ((onShowTranslationui) ArrangementCenter1.IconCompatParcelizer(ArrangementCenter1.read("Loading animation", getpostalcode, 0), Float.valueOf(0.0f), Float.valueOf(360.0f), DelayKt.RemoteActionCompatParcelizer((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{1200, 0, performFling.read, 2}), BoxMeasurePolicy.Restart, 4), "Loading icon rotation animation", getpostalcode, 229816).MediaSessionCompatQueueItem).getValue()).floatValue()), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setEmojiCompatEnabled(), getpostalcode, 48, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i8 = write + 41;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier, i, 26);
        }
    }
}
