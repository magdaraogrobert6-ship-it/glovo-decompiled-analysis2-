package com.roadrunner.liveness.review.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getNonZeroRgk1Os;
import o.getPostalCode;
import o.internalPathIteratorPeek;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setCurrentItem;
import o.setCurrentSemanticsNodesui;
import o.stopIgnoring;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ReviewScreenKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057 A[PHI: r11
  0x0057: PHI (r11v5 o.getPostalCode) = (r11v1 o.getPostalCode), (r11v6 o.getPostalCode) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0030 A[PHI: r11
  0x0030: PHI (r11v2 o.getPostalCode) = (r11v1 o.getPostalCode), (r11v6 o.getPostalCode) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void IconCompatParcelizer(setCurrentItem setcurrentitem, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6 = 2 % 2;
        int i7 = IconCompatParcelizer + 89;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            setcurrentitem.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-336058605);
            if ((i & 67) == 0) {
                i2 = RemoteActionCompatParcelizer + 101;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    getpostalcode.read(setcurrentitem);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (getpostalcode.read(setcurrentitem)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
                int i8 = RemoteActionCompatParcelizer + 97;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            } else {
                i4 = i;
            }
        } else {
            setcurrentitem.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-336058605);
            if ((i & 6) == 0) {
                i2 = RemoteActionCompatParcelizer + 101;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    getpostalcode.read(setcurrentitem);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (getpostalcode.read(setcurrentitem)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
                int i10 = RemoteActionCompatParcelizer + 97;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            } else {
                i4 = i;
            }
        }
        if ((i & 48) == 0) {
            i4 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i12 = IconCompatParcelizer + 21;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i5 = Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i4 |= i5;
        }
        if ((i4 & 147) != 146) {
            int i14 = IconCompatParcelizer + 17;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i4 & 1, z)) {
            int i16 = IconCompatParcelizer + 3;
            RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            ReviewContent((i4 << 6) & 7168, getpostalcode, modifier.then(SizeKt.read), setcurrentitem.IconCompatParcelizer, setcurrentitem.read, setcurrentitem.RemoteActionCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 23, setcurrentitem, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0041  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    public static final void ReviewContent(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, String str2, String str3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = IconCompatParcelizer + 51;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1692017419);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            int i9 = RemoteActionCompatParcelizer + 103;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (getpostalcode.read(str)) {
                int i11 = IconCompatParcelizer + 105;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    i5 = 2;
                } else {
                    i5 = 4;
                }
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i12 = RemoteActionCompatParcelizer + 75;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                if (getpostalcode.read(str2)) {
                    i4 = 32;
                } else {
                    i4 = 16;
                }
            } else {
                int i13 = 44 / 0;
                if (getpostalcode.read(str2)) {
                    i4 = 32;
                } else {
                    i4 = 16;
                }
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i14 = RemoteActionCompatParcelizer + 121;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            i2 |= getpostalcode.read(str3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i16 = IconCompatParcelizer + 117;
                RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                i3 = i16 % 2 != 0 ? 25801 : Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.Clip : 8192;
        }
        int i17 = i2;
        if (getpostalcode.write(i17 & 1, (i17 & 9363) != 9362)) {
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierWrite = PaddingKt.write(BackgroundKt.m20backgroundbw27NRU(modifier, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape()), Dimensions.getAnimatedVisibility);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            Object obj = null;
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i18 = IconCompatParcelizer + 31;
            RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
            if (i18 % 2 == 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier modifierM = d$$ExternalSyntheticOutline0.m(1.0f, true, companion3);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer, companion.getCenterHorizontally(), getpostalcode, 54);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                float f = Dimensions.setStackedBackground;
                getNonZeroRgk1Os.write(Integer.valueOf(R.drawable.img_medium_brand_selfie), "", PaddingKt.write(companion3, f), Okio.RemoteActionCompatParcelizer(R.drawable.img_medium_brand_selfie, getpostalcode, 0), null, null, null, null, ContentScale.Companion.getNone(), null, getpostalcode, (Painter.$stable << 9) | 48, 6, 31728);
                Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, f, 0.0f, 0.0f, 13);
                TextStyle textStyleMediaSessionCompatResultReceiverWrapper = performLayout.MediaSessionCompatResultReceiverWrapper();
                TextAlign.Companion companion4 = TextAlign.Companion;
                TextKt.m131TextNvy7gAk(str, modifierM74paddingqDBjuR0$default, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion4.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatResultReceiverWrapper, getpostalcode, i17 & 14, 0, 130040);
                TextKt.m131TextNvy7gAk(str2, PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, Dimensions.setSplitBackground, 0.0f, 0.0f, 13), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion4.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.PlaybackStateCompatCustomAction(), getpostalcode, (i17 >> 3) & 14, 0, 130040);
                getpostalcode.IconCompatParcelizer(true);
                PrimaryKt.write(str3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion3, 1.0f), 0.0f, f, 0.0f, 0.0f, 13), false, false, null, null, null, null, null, getpostalcode, (i17 >> 6) & 126, 0, 2040);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z = getpostalcode.ComponentActivity;
                obj.hashCode();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new stopIgnoring(i, str, str2, str3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, 4);
        }
    }
}
