package com.roadrunner.delivery.accept.newordertitle.presentation.compose;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.roadrunner.delivery.accept.newordertitle.api.NewOrderTitleUiModel;
import com.roadrunner.delivery.accept.newordertitle.presentation.NewOrderTitleUiModelImpl;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import o.AndroidPrefetchScheduler;
import o.accessgetZeroVerticalPaddingp;
import o.buildMapping;
import o.dc;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getLineHeightPaddings;
import o.getNewPassword;
import o.getPostalCode;
import o.getSharedTextAndroidCanvas;
import o.performLayout;
import o.performMeasureDjhGOtQ;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NewOrderTitleContentKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x003f A[PHI: r9
  0x003f: PHI (r9v5 o.getPostalCode) = (r9v1 o.getPostalCode), (r9v6 o.getPostalCode) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002b A[PHI: r9
  0x002b: PHI (r9v2 o.getPostalCode) = (r9v1 o.getPostalCode), (r9v6 o.getPostalCode) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void serializer(NewOrderTitleUiModel newOrderTitleUiModel, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = 23;
        int i6 = read + 23;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            newOrderTitleUiModel.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(764719575);
            if ((i & 43) == 0) {
                int i7 = RemoteActionCompatParcelizer + 115;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (getpostalcode.read(newOrderTitleUiModel)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            newOrderTitleUiModel.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(764719575);
            if ((i & 6) == 0) {
                int i9 = RemoteActionCompatParcelizer + 115;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (getpostalcode.read(newOrderTitleUiModel)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        int i11 = i3 | 48;
        if (!(!getpostalcode.write(i11 & 1, (i11 & 19) != 18))) {
            int i12 = RemoteActionCompatParcelizer + 105;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            modifier = Modifier.Companion;
            accessgetZeroVerticalPaddingp accessgetzeroverticalpaddingp = (accessgetZeroVerticalPaddingp) ExtrasKt.write(((NewOrderTitleUiModelImpl) newOrderTitleUiModel).MediaDescriptionCompat, getpostalcode, 0).getValue();
            if (accessgetzeroverticalpaddingp instanceof getSharedTextAndroidCanvas) {
                getpostalcode.serializer(1254527334);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(accessgetzeroverticalpaddingp instanceof getLineHeightPaddings)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 456107559, false);
                }
                int i14 = read + 83;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                getpostalcode.serializer(1254596588);
                IconCompatParcelizer(i11 & 112, getpostalcode, modifier, ((getLineHeightPaddings) accessgetzeroverticalpaddingp).read);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(newOrderTitleUiModel, modifier, i, i5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    public static final void IconCompatParcelizer(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        int i3;
        int i4 = 2 % 2;
        str.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-80562032);
        if ((i & 6) == 0) {
            if (getpostalcode2.read(str)) {
                int i5 = RemoteActionCompatParcelizer + 1;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 3;
                }
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            int i7 = read + 15;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.read(modifier) ? 32 : 16;
        }
        int i9 = i2;
        if ((i9 & 19) != 18) {
            int i10 = read + 49;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            z = i10 % 2 != 0;
        }
        if (getpostalcode2.write(i9 & 1, z)) {
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(str, PaddingKt.RemoteActionCompatParcelizer(SizeKt.write(modifier, 1.0f), Dimensions.setActionBarVisibilityCallback, Dimensions.getNestedScrollAxes), ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode(), 0L, FontWeight.Companion.getW600(), null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, (i9 & 14) | 1572864, 0, 129976);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier, 3);
        }
    }
}
