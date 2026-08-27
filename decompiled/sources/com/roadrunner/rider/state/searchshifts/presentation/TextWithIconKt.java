package com.roadrunner.rider.state.searchshifts.presentation;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnitKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import java.util.Collections;
import java.util.Map;
import o.PurchaseVerificationHandler1;
import o.SizeKt;
import o.buildMapping;
import o.dc;
import o.getBirthDateFull;
import o.getCenterHorizontallyannotations;
import o.getCenterVerticallyannotations;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performLayout;
import o.performMeasureDjhGOtQ;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TextWithIconKt {
    private static int read = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    public static final void TextWithFlagIconStart(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        str.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1531950893);
        if ((i & 6) == 0) {
            int i5 = read + 11;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                if (getpostalcode2.read(str)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
            } else {
                int i6 = 51 / 0;
                if (getpostalcode2.read(str)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
            }
            i2 = i3 | i;
            int i7 = read + 81;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        } else {
            i2 = i;
        }
        int i9 = i2 | 48;
        if ((i9 & 19) != 18) {
            int i10 = read + 57;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i9 & 1, z)) {
            modifier2 = Modifier.Companion;
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            getCenterVerticallyannotations.IconCompatParcelizer(builder, "flagIcon", "�");
            builder.append(" ".concat(str));
            AnnotatedString annotatedString = builder.toAnnotatedString();
            getCenterHorizontallyannotations getcenterhorizontallyannotations = new getCenterHorizontallyannotations(new Placeholder(TextUnitKt.getEm(1), TextUnitKt.getEm(1), PlaceholderVerticalAlign.Companion.m2975getTextCenterJ6kI3mc(), null), PurchaseVerificationHandler1.serializer);
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(modifier2, 0.0f, Dimensions.setPrimaryBackground, 1);
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            long supportBackgroundTintMode = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode();
            Map mapSingletonMap = Collections.singletonMap("flagIcon", getcenterhorizontallyannotations);
            mapSingletonMap.getClass();
            getpostalcode = getpostalcode2;
            TextKt.m132TextZ58ophY(annotatedString, modifierM73paddingVpY3zN4$default, supportBackgroundTintMode, 0L, null, 0L, null, 0L, 0, false, 0, 0, mapSingletonMap, null, textStyleIconCompatParcelizer, getpostalcode, 0, 0, 196600);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i12 = write + 3;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier2, 22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0041 A[PHI: r3
  0x0041: PHI (r3v15 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v17 o.getPostalCode) binds: [B:8:0x002a, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002c A[PHI: r3
  0x002c: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v17 o.getPostalCode) binds: [B:8:0x002a, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void TextWithFlagIconEnd(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        Modifier modifier2;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = read + 71;
        write = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1443226822);
            if ((i & 93) == 0) {
                if (getpostalcode.read(str)) {
                    i3 = write + 97;
                    read = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        i4 = 4;
                    }
                }
                i2 = i4 | i;
            } else {
                i2 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1443226822);
            if ((i & 6) == 0) {
                if (getpostalcode.read(str)) {
                    i3 = write + 97;
                    read = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        i4 = 4;
                    }
                }
                i2 = i4 | i;
            } else {
                i2 = i;
            }
        }
        getPostalCode getpostalcode3 = getpostalcode;
        int i7 = i2 | 48;
        if (getpostalcode3.write(i7 & 1, (i7 & 19) != 18)) {
            modifier2 = Modifier.Companion;
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(str.concat(" "));
            getCenterVerticallyannotations.IconCompatParcelizer(builder, "flagIcon", "�");
            AnnotatedString annotatedString = builder.toAnnotatedString();
            getCenterHorizontallyannotations getcenterhorizontallyannotations = new getCenterHorizontallyannotations(new Placeholder(TextUnitKt.getEm(1), TextUnitKt.getEm(1), PlaceholderVerticalAlign.Companion.m2975getTextCenterJ6kI3mc(), null), PurchaseVerificationHandler1.IconCompatParcelizer);
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(modifier2, 0.0f, Dimensions.setPrimaryBackground, 1);
            int iM3511getCentere0LSkKk = TextAlign.Companion.m3511getCentere0LSkKk();
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            long supportBackgroundTintMode = ((buildMapping) getpostalcode3.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode();
            Map mapSingletonMap = Collections.singletonMap("flagIcon", getcenterhorizontallyannotations);
            mapSingletonMap.getClass();
            getpostalcode2 = getpostalcode3;
            TextKt.m132TextZ58ophY(annotatedString, modifierM73paddingVpY3zN4$default, supportBackgroundTintMode, 0L, null, 0L, TextAlign.m3504boximpl(iM3511getCentere0LSkKk), 0L, 0, false, 0, 0, mapSingletonMap, null, textStyleIconCompatParcelizer, getpostalcode2, 0, 0, 195576);
        } else {
            getpostalcode2 = getpostalcode3;
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SizeKt(i, 13, str, modifier2);
        }
    }
}
