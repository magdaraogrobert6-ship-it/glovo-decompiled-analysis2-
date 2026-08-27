package com.roadrunner.delivery.pickupdropoff.details.api.domain;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.pudo.TagColorToken;
import com.roadrunner.rrds.compose.component.indicators.TagsKt;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.onMessageReceived;
import o.r8lambdaDTxTXwYvZoKnyqFMrsPr9CCuDY;
import o.r8lambdaYAYqCgublv1aaKYwrIvjEYiW1c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TagColorTokenMapperKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:51:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00db  */
    /* JADX WARN: Code duplicated, block: B:61:0x00df  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:68:0x0119  */
    /* JADX WARN: Code duplicated, block: B:69:0x015d  */
    /* JADX WARN: Code duplicated, block: B:70:0x017b  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void RemoteActionCompatParcelizer(TagColorToken tagColorToken, String str, Modifier modifier, int i, getBirthDateFull getbirthdatefull, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        Modifier modifier2;
        int i8;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i9;
        int i10;
        int i11;
        Modifier modifier3 = modifier;
        int i12 = 2 % 2;
        tagColorToken.getClass();
        str.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1346500035);
        if ((i2 & 6) == 0) {
            if (getpostalcode.read(tagColorToken.ordinal())) {
                int i13 = serializer + 15;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i11 = 4;
            } else {
                i11 = 2;
            }
            i4 = i11 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (getpostalcode.read(str)) {
                int i15 = serializer + 67;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                i10 = i15 % 2 != 0 ? 85 : 32;
            } else {
                i10 = 16;
            }
            i4 |= i10;
        }
        int i16 = i3 & 4;
        if (i16 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            int i17 = serializer + 105;
            IconCompatParcelizer = i17 % Fields.SpotShadowColor;
            if (i17 % 2 != 0) {
                getpostalcode.read(modifier3);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i4 |= getpostalcode.read(modifier3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i18 = i3 & 8;
        if (i18 == 0) {
            if ((i2 & 3072) == 0) {
                i5 = i;
                if (getpostalcode.read(i5)) {
                    int i19 = serializer + 61;
                    IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                    i6 = i19 % 2 != 0 ? 25021 : Fields.CameraDistance;
                } else {
                    i6 = Fields.RotationZ;
                }
                i4 |= i6;
            }
            i7 = i4 | 24576;
            if ((i7 & 9363) != 9362) {
                int i20 = IconCompatParcelizer + 59;
                serializer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i7 & 1, z)) {
                if (i16 != 0) {
                    i9 = serializer + 49;
                    IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        modifier3 = Modifier.Companion;
                        int i22 = 52 / 0;
                    } else {
                        modifier3 = Modifier.Companion;
                    }
                }
                if (i18 != 0) {
                    i8 = 0;
                } else {
                    i8 = i5;
                }
                switch (r8lambdaDTxTXwYvZoKnyqFMrsPr9CCuDY.write[tagColorToken.ordinal()]) {
                    case 1:
                        getpostalcode.serializer(-1201369744);
                        TagsKt.write(str, modifier3, i8, 0, getpostalcode, ((i7 >> 3) & 1022) | (i7 & 57344), 8);
                        getpostalcode.IconCompatParcelizer(false);
                        int i23 = serializer + 91;
                        IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                        int i24 = i23 % 2;
                        break;
                    case 2:
                        getpostalcode.serializer(-1201365938);
                        TagsKt.serializer(str, modifier3, i8, 0, getpostalcode, ((i7 >> 3) & 1022) | (i7 & 57344), 8);
                        getpostalcode.IconCompatParcelizer(false);
                        break;
                    case 3:
                        getpostalcode.serializer(-1201362161);
                        TagsKt.read(str, modifier3, i8, 0, 0L, 0L, 0L, null, getpostalcode, ((i7 >> 3) & 1022) | (i7 & 57344), 488);
                        getpostalcode.IconCompatParcelizer(false);
                        break;
                    case 4:
                        getpostalcode.serializer(-1201358386);
                        TagsKt.MediaBrowserCompatMediaItem(str, modifier3, i8, 0, getpostalcode, ((i7 >> 3) & 1022) | (i7 & 57344), 8);
                        getpostalcode.IconCompatParcelizer(false);
                        break;
                    case 5:
                        getpostalcode.serializer(-1201354642);
                        TagsKt.serializer(2032277805, onMessageReceived.IconCompatParcelizer(), onMessageReceived.IconCompatParcelizer(), -2032277804, new Object[]{str, modifier3, Integer.valueOf(i8), 0, getpostalcode, Integer.valueOf(((i7 >> 3) & 1022) | (i7 & 57344)), 8}, onMessageReceived.IconCompatParcelizer(), onMessageReceived.IconCompatParcelizer());
                        getpostalcode.IconCompatParcelizer(false);
                        break;
                    case 6:
                    case 7:
                        getpostalcode.serializer(-1201350038);
                        TagsKt.RemoteActionCompatParcelizer(str, modifier3, i8, 0, getpostalcode, ((i7 >> 3) & 1022) | (i7 & 57344), 8);
                        getpostalcode.IconCompatParcelizer(false);
                        break;
                    default:
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1201370771, false);
                }
                modifier2 = modifier3;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier2 = modifier3;
                i8 = i5;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaYAYqCgublv1aaKYwrIvjEYiW1c(tagColorToken, str, modifier2, i8, i2, i3);
            }
        }
        i4 |= 3072;
        i5 = i;
        i7 = i4 | 24576;
        if ((i7 & 9363) != 9362) {
            int i25 = IconCompatParcelizer + 59;
            serializer = i25 % Fields.SpotShadowColor;
            int i26 = i25 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i7 & 1, z)) {
            if (i16 != 0) {
                i9 = serializer + 49;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    modifier3 = Modifier.Companion;
                    int i27 = 52 / 0;
                } else {
                    modifier3 = Modifier.Companion;
                }
            }
            if (i18 != 0) {
                i8 = 0;
            } else {
                i8 = i5;
            }
            switch (r8lambdaDTxTXwYvZoKnyqFMrsPr9CCuDY.write[tagColorToken.ordinal()]) {
                case 1:
                    getpostalcode.serializer(-1201369744);
                    TagsKt.write(str, modifier3, i8, 0, getpostalcode, ((i7 >> 3) & 1022) | (i7 & 57344), 8);
                    getpostalcode.IconCompatParcelizer(false);
                    int i28 = serializer + 91;
                    IconCompatParcelizer = i28 % Fields.SpotShadowColor;
                    int i29 = i28 % 2;
                    break;
                case 2:
                    getpostalcode.serializer(-1201365938);
                    TagsKt.serializer(str, modifier3, i8, 0, getpostalcode, ((i7 >> 3) & 1022) | (i7 & 57344), 8);
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                case 3:
                    getpostalcode.serializer(-1201362161);
                    TagsKt.read(str, modifier3, i8, 0, 0L, 0L, 0L, null, getpostalcode, ((i7 >> 3) & 1022) | (i7 & 57344), 488);
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                case 4:
                    getpostalcode.serializer(-1201358386);
                    TagsKt.MediaBrowserCompatMediaItem(str, modifier3, i8, 0, getpostalcode, ((i7 >> 3) & 1022) | (i7 & 57344), 8);
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                case 5:
                    getpostalcode.serializer(-1201354642);
                    TagsKt.serializer(2032277805, onMessageReceived.IconCompatParcelizer(), onMessageReceived.IconCompatParcelizer(), -2032277804, new Object[]{str, modifier3, Integer.valueOf(i8), 0, getpostalcode, Integer.valueOf(((i7 >> 3) & 1022) | (i7 & 57344)), 8}, onMessageReceived.IconCompatParcelizer(), onMessageReceived.IconCompatParcelizer());
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                case 6:
                case 7:
                    getpostalcode.serializer(-1201350038);
                    TagsKt.RemoteActionCompatParcelizer(str, modifier3, i8, 0, getpostalcode, ((i7 >> 3) & 1022) | (i7 & 57344), 8);
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                default:
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1201370771, false);
            }
            modifier2 = modifier3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier3;
            i8 = i5;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaYAYqCgublv1aaKYwrIvjEYiW1c(tagColorToken, str, modifier2, i8, i2, i3);
        }
    }
}
