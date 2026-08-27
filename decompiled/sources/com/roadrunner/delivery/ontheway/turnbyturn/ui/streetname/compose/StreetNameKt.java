package com.roadrunner.delivery.ontheway.turnbyturn.ui.streetname.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.rrds.compose.component.indicators.TagsKt;
import o.AndroidFontTypefaceLoader;
import o.TextAlignCompanion;
import o.accessgetEndcp;
import o.getBirthDateFull;
import o.getCentere0LSkKk;
import o.getHandleruiannotations;
import o.getLastLineBottomEVpEnUU;
import o.getNoneEVpEnUU;
import o.getPostalCode;

/* JADX INFO: loaded from: classes3.dex */
public abstract class StreetNameKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    public static final void RemoteActionCompatParcelizer(TextAlignCompanion textAlignCompanion, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-652350890);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(textAlignCompanion) : getpostalcode.IconCompatParcelizer(textAlignCompanion) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i4 = IconCompatParcelizer + 55;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = IconCompatParcelizer + 55;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            TagsKt.MediaBrowserCompatMediaItem(textAlignCompanion.RemoteActionCompatParcelizer, modifier, 0, 0, getpostalcode, i2 & 112, 28);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 11, textAlignCompanion, modifier);
        }
    }

    public static final void read(getNoneEVpEnUU getnoneevpenuu, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        TextAlignCompanion textAlignCompanion;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getnoneevpenuu.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-316606405);
        if ((i & 6) == 0) {
            if (getpostalcode.read(getnoneevpenuu)) {
                int i6 = read + 23;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                int i8 = read + 89;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i10 = i2 | 48;
        if (getpostalcode.write(i10 & 1, (i10 & 19) != 18)) {
            modifier = Modifier.Companion;
            accessgetEndcp accessgetendcp = (accessgetEndcp) ExtrasKt.write(((getLastLineBottomEVpEnUU) getnoneevpenuu).serializer, getpostalcode, 0).getValue();
            if (accessgetendcp instanceof getCentere0LSkKk) {
                getpostalcode.serializer(683929599);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(accessgetendcp instanceof TextAlignCompanion)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 683926001, false);
                }
                int i11 = read + 75;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    getpostalcode.serializer(-272962458);
                    textAlignCompanion = (TextAlignCompanion) accessgetendcp;
                    i3 = i10 & 115;
                } else {
                    getpostalcode.serializer(-272962458);
                    textAlignCompanion = (TextAlignCompanion) accessgetendcp;
                    i3 = i10 & 112;
                }
                RemoteActionCompatParcelizer(textAlignCompanion, modifier, getpostalcode, i3);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 10, getnoneevpenuu, modifier);
        }
    }
}
