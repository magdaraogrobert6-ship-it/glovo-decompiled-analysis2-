package com.roadrunner.delivery.pickupdropoff.tasks.api.mapper;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.pudo.ButtonTypeToken;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.hashBoolean;
import o.isValidParameter;
import o.logErrorui_toolingdefault;
import o.logWarningui_toolingdefault;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ButtonTypeTokenMapperKt {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Code duplicated, block: B:100:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:101:0x0228  */
    /* JADX WARN: Code duplicated, block: B:103:0x0258  */
    /* JADX WARN: Code duplicated, block: B:104:0x0259  */
    /* JADX WARN: Code duplicated, block: B:107:0x0264  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00de  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:76:0x0111  */
    /* JADX WARN: Code duplicated, block: B:77:0x0113  */
    /* JADX WARN: Code duplicated, block: B:80:0x011c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x012b  */
    /* JADX WARN: Code duplicated, block: B:85:0x012e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0137  */
    /* JADX WARN: Code duplicated, block: B:88:0x013a  */
    /* JADX WARN: Code duplicated, block: B:91:0x014c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0155  */
    /* JADX WARN: Code duplicated, block: B:94:0x0186  */
    /* JADX WARN: Code duplicated, block: B:96:0x018f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0195  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c3  */
    public static final void IconCompatParcelizer(ButtonTypeToken buttonTypeToken, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, boolean z, boolean z2, Integer num, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        int i4;
        boolean z3;
        int i5;
        Integer num2;
        int i6;
        int i7;
        boolean z4;
        boolean z5;
        Integer num3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i8;
        int i9;
        boolean z6;
        int iIntValue;
        int i10;
        int i11;
        int i12;
        boolean z7 = z;
        int i13 = 2 % 2;
        buttonTypeToken.getClass();
        str.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1732283667);
        if ((i & 6) == 0) {
            if (!(!getpostalcode.read(buttonTypeToken.ordinal()))) {
                int i14 = read + 91;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i12 = 4;
            } else {
                i12 = 2;
            }
            i3 = i12 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(str)) {
                int i16 = IconCompatParcelizer + 15;
                read = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i11 = 32;
            } else {
                i11 = 16;
            }
            i3 |= i11;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.read(modifier)) {
                int i18 = IconCompatParcelizer + 43;
                read = i18 % Fields.SpotShadowColor;
                i10 = i18 % 2 == 0 ? 26373 : Fields.CameraDistance;
            } else {
                i10 = Fields.RotationZ;
            }
            i3 |= i10;
        }
        int i19 = i2 & 16;
        if (i19 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            int i20 = read + 99;
            IconCompatParcelizer = i20 % Fields.SpotShadowColor;
            if (i20 % 2 != 0) {
                int i21 = 46 / 0;
                if (getpostalcode.write(z7)) {
                    i4 = Fields.Clip;
                } else {
                    i4 = 8192;
                }
            } else if (getpostalcode.write(z7)) {
                i4 = Fields.Clip;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        int i22 = i2 & 32;
        if (i22 == 0) {
            if ((i & 196608) == 0) {
                z3 = z2;
                i3 |= getpostalcode.write(z3) ? Fields.RenderEffect : 65536;
            }
            i5 = i2 & 64;
            if (i5 != 0) {
                if ((i & 1572864) == 0) {
                    num2 = num;
                    if (getpostalcode.read(num2)) {
                        i6 = 1048576;
                    } else {
                        i6 = Fields.BlendMode;
                    }
                    i3 |= i6;
                }
                i7 = i3 | 12582912;
                if ((4793491 & i7) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (getpostalcode.write(i7 & 1, z4)) {
                    i8 = read + 79;
                    i9 = i8 % Fields.SpotShadowColor;
                    IconCompatParcelizer = i9;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                    if (i19 != 0) {
                        z7 = true;
                    }
                    if (i22 != 0) {
                        int i23 = i9 + 63;
                        read = i23 % Fields.SpotShadowColor;
                        int i24 = i23 % 2;
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i5 != 0) {
                        num2 = null;
                    }
                    switch (logErrorui_toolingdefault.serializer[buttonTypeToken.ordinal()]) {
                        case 1:
                        case 2:
                            getpostalcode.serializer(-1722694471);
                            isValidParameter.RemoteActionCompatParcelizer(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z7, z6, num2, null, null, null, getpostalcode, ((i7 >> 3) & 524286) | (i7 & 29360128), 832);
                            getpostalcode.IconCompatParcelizer(false);
                            break;
                        case 3:
                            getpostalcode.serializer(-1722684816);
                            PrimaryKt.write(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z7, null, null, null, null, 0, null, null, null, 0.0f, getpostalcode, (i7 >> 3) & 8190, 0, 16368);
                            getpostalcode.IconCompatParcelizer(false);
                            break;
                        case 4:
                            getpostalcode.serializer(-1722678313);
                            PrimaryKt.write(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z7, z6, num2, null, null, null, null, getpostalcode, ((i7 >> 3) & 524286) | (i7 & 29360128), 0, 1856);
                            getpostalcode.IconCompatParcelizer(false);
                            break;
                        case 5:
                            getpostalcode.serializer(-1863105189);
                            if (num2 != null) {
                                iIntValue = num2.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            int i25 = i7 >> 3;
                            TertiaryKt.IconCompatParcelizer(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z7, iIntValue, hashBoolean.START, null, null, getpostalcode, (i25 & 14) | 196608 | (i25 & 112) | (i25 & 896) | (i25 & 7168), 192);
                            getpostalcode.IconCompatParcelizer(false);
                            break;
                        case 6:
                            getpostalcode.serializer(-1862799281);
                            int i26 = i7 >> 3;
                            isValidParameter.IconCompatParcelizer(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z7, num2, null, null, null, getpostalcode, ((i7 >> 6) & 57344) | (i26 & 8190) | (i26 & 3670016), 416);
                            getpostalcode.IconCompatParcelizer(false);
                            break;
                        default:
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1722696037, false);
                    }
                    z5 = z7;
                    z3 = z6;
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    z5 = z7;
                }
                num3 = num2;
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new logWarningui_toolingdefault(buttonTypeToken, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z5, z3, num3, i, i2);
                }
            }
            int i27 = read + 111;
            int i28 = i27 % Fields.SpotShadowColor;
            IconCompatParcelizer = i28;
            int i29 = i27 % 2;
            i3 |= 1572864;
            int i30 = i28 + 95;
            read = i30 % Fields.SpotShadowColor;
            int i31 = i30 % 2;
            num2 = num;
            i7 = i3 | 12582912;
            if ((4793491 & i7) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (getpostalcode.write(i7 & 1, z4)) {
                i8 = read + 79;
                i9 = i8 % Fields.SpotShadowColor;
                IconCompatParcelizer = i9;
                if (i8 % 2 == 0) {
                    throw null;
                }
                if (i19 != 0) {
                    z7 = true;
                }
                if (i22 != 0) {
                    int i210 = i9 + 63;
                    read = i210 % Fields.SpotShadowColor;
                    int i211 = i210 % 2;
                    z6 = false;
                } else {
                    z6 = z3;
                }
                if (i5 != 0) {
                    num2 = null;
                }
                switch (logErrorui_toolingdefault.serializer[buttonTypeToken.ordinal()]) {
                    case 1:
                    case 2:
                        getpostalcode.serializer(-1722694471);
                        isValidParameter.RemoteActionCompatParcelizer(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z7, z6, num2, null, null, null, getpostalcode, ((i7 >> 3) & 524286) | (i7 & 29360128), 832);
                        getpostalcode.IconCompatParcelizer(false);
                        break;
                    case 3:
                        getpostalcode.serializer(-1722684816);
                        PrimaryKt.write(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z7, null, null, null, null, 0, null, null, null, 0.0f, getpostalcode, (i7 >> 3) & 8190, 0, 16368);
                        getpostalcode.IconCompatParcelizer(false);
                        break;
                    case 4:
                        getpostalcode.serializer(-1722678313);
                        PrimaryKt.write(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z7, z6, num2, null, null, null, null, getpostalcode, ((i7 >> 3) & 524286) | (i7 & 29360128), 0, 1856);
                        getpostalcode.IconCompatParcelizer(false);
                        break;
                    case 5:
                        getpostalcode.serializer(-1863105189);
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        int i212 = i7 >> 3;
                        TertiaryKt.IconCompatParcelizer(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z7, iIntValue, hashBoolean.START, null, null, getpostalcode, (i212 & 14) | 196608 | (i212 & 112) | (i212 & 896) | (i212 & 7168), 192);
                        getpostalcode.IconCompatParcelizer(false);
                        break;
                    case 6:
                        getpostalcode.serializer(-1862799281);
                        int i213 = i7 >> 3;
                        isValidParameter.IconCompatParcelizer(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z7, num2, null, null, null, getpostalcode, ((i7 >> 6) & 57344) | (i213 & 8190) | (i213 & 3670016), 416);
                        getpostalcode.IconCompatParcelizer(false);
                        break;
                    default:
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1722696037, false);
                }
                z5 = z7;
                z3 = z6;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                z5 = z7;
            }
            num3 = num2;
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new logWarningui_toolingdefault(buttonTypeToken, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z5, z3, num3, i, i2);
            }
        }
        i3 |= 196608;
        z3 = z2;
        i5 = i2 & 64;
        if (i5 != 0) {
            if ((i & 1572864) == 0) {
                num2 = num;
                if (getpostalcode.read(num2)) {
                    i6 = 1048576;
                } else {
                    i6 = Fields.BlendMode;
                }
                i3 |= i6;
            }
            i7 = i3 | 12582912;
            if ((4793491 & i7) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (getpostalcode.write(i7 & 1, z4)) {
                i8 = read + 79;
                i9 = i8 % Fields.SpotShadowColor;
                IconCompatParcelizer = i9;
                if (i8 % 2 == 0) {
                    throw null;
                }
                if (i19 != 0) {
                    z7 = true;
                }
                if (i22 != 0) {
                    int i214 = i9 + 63;
                    read = i214 % Fields.SpotShadowColor;
                    int i215 = i214 % 2;
                    z6 = false;
                } else {
                    z6 = z3;
                }
                if (i5 != 0) {
                    num2 = null;
                }
                switch (logErrorui_toolingdefault.serializer[buttonTypeToken.ordinal()]) {
                    case 1:
                    case 2:
                        getpostalcode.serializer(-1722694471);
                        isValidParameter.RemoteActionCompatParcelizer(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z7, z6, num2, null, null, null, getpostalcode, ((i7 >> 3) & 524286) | (i7 & 29360128), 832);
                        getpostalcode.IconCompatParcelizer(false);
                        break;
                    case 3:
                        getpostalcode.serializer(-1722684816);
                        PrimaryKt.write(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z7, null, null, null, null, 0, null, null, null, 0.0f, getpostalcode, (i7 >> 3) & 8190, 0, 16368);
                        getpostalcode.IconCompatParcelizer(false);
                        break;
                    case 4:
                        getpostalcode.serializer(-1722678313);
                        PrimaryKt.write(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z7, z6, num2, null, null, null, null, getpostalcode, ((i7 >> 3) & 524286) | (i7 & 29360128), 0, 1856);
                        getpostalcode.IconCompatParcelizer(false);
                        break;
                    case 5:
                        getpostalcode.serializer(-1863105189);
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        int i216 = i7 >> 3;
                        TertiaryKt.IconCompatParcelizer(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z7, iIntValue, hashBoolean.START, null, null, getpostalcode, (i216 & 14) | 196608 | (i216 & 112) | (i216 & 896) | (i216 & 7168), 192);
                        getpostalcode.IconCompatParcelizer(false);
                        break;
                    case 6:
                        getpostalcode.serializer(-1862799281);
                        int i217 = i7 >> 3;
                        isValidParameter.IconCompatParcelizer(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z7, num2, null, null, null, getpostalcode, ((i7 >> 6) & 57344) | (i217 & 8190) | (i217 & 3670016), 416);
                        getpostalcode.IconCompatParcelizer(false);
                        break;
                    default:
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1722696037, false);
                }
                z5 = z7;
                z3 = z6;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                z5 = z7;
            }
            num3 = num2;
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new logWarningui_toolingdefault(buttonTypeToken, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z5, z3, num3, i, i2);
            }
        }
        int i218 = read + 111;
        int i219 = i218 % Fields.SpotShadowColor;
        IconCompatParcelizer = i219;
        int i220 = i218 % 2;
        i3 |= 1572864;
        int i32 = i219 + 95;
        read = i32 % Fields.SpotShadowColor;
        int i33 = i32 % 2;
        num2 = num;
        i7 = i3 | 12582912;
        if ((4793491 & i7) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (getpostalcode.write(i7 & 1, z4)) {
            i8 = read + 79;
            i9 = i8 % Fields.SpotShadowColor;
            IconCompatParcelizer = i9;
            if (i8 % 2 == 0) {
                throw null;
            }
            if (i19 != 0) {
                z7 = true;
            }
            if (i22 != 0) {
                int i2110 = i9 + 63;
                read = i2110 % Fields.SpotShadowColor;
                int i2111 = i2110 % 2;
                z6 = false;
            } else {
                z6 = z3;
            }
            if (i5 != 0) {
                num2 = null;
            }
            switch (logErrorui_toolingdefault.serializer[buttonTypeToken.ordinal()]) {
                case 1:
                case 2:
                    getpostalcode.serializer(-1722694471);
                    isValidParameter.RemoteActionCompatParcelizer(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z7, z6, num2, null, null, null, getpostalcode, ((i7 >> 3) & 524286) | (i7 & 29360128), 832);
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                case 3:
                    getpostalcode.serializer(-1722684816);
                    PrimaryKt.write(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z7, null, null, null, null, 0, null, null, null, 0.0f, getpostalcode, (i7 >> 3) & 8190, 0, 16368);
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                case 4:
                    getpostalcode.serializer(-1722678313);
                    PrimaryKt.write(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z7, z6, num2, null, null, null, null, getpostalcode, ((i7 >> 3) & 524286) | (i7 & 29360128), 0, 1856);
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                case 5:
                    getpostalcode.serializer(-1863105189);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    int i2112 = i7 >> 3;
                    TertiaryKt.IconCompatParcelizer(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z7, iIntValue, hashBoolean.START, null, null, getpostalcode, (i2112 & 14) | 196608 | (i2112 & 112) | (i2112 & 896) | (i2112 & 7168), 192);
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                case 6:
                    getpostalcode.serializer(-1862799281);
                    int i2113 = i7 >> 3;
                    isValidParameter.IconCompatParcelizer(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z7, num2, null, null, null, getpostalcode, ((i7 >> 6) & 57344) | (i2113 & 8190) | (i2113 & 3670016), 416);
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                default:
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1722696037, false);
            }
            z5 = z7;
            z3 = z6;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            z5 = z7;
        }
        num3 = num2;
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new logWarningui_toolingdefault(buttonTypeToken, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z5, z3, num3, i, i2);
        }
    }
}
