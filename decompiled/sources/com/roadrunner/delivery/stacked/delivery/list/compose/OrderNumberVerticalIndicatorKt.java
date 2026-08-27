package com.roadrunner.delivery.stacked.delivery.list.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.pudo.TagColorToken;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DefaultPagerNestedScrollConnection;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.VelocityCompanion;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.getZero9UxMQ8M;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.position;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OrderNumberVerticalIndicatorKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:14:0x004c A[PHI: r0
  0x004c: PHI (r0v13 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v15 o.getPostalCode) binds: [B:8:0x0032, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:9:0x0034 A[PHI: r0
  0x0034: PHI (r0v6 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v15 o.getPostalCode) binds: [B:8:0x0032, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void OrderNumberVerticalIndicator(TagColorToken tagColorToken, int i, Modifier modifier, getBirthDateFull getbirthdatefull, int i2) {
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = read + 99;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            tagColorToken.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(2144033778);
            if ((i2 & 80) == 0) {
                if (getpostalcode.read(tagColorToken.ordinal())) {
                    i3 = 4;
                } else {
                    int i8 = read + 91;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    i3 = 2;
                }
                i4 = i3 | i2;
            } else {
                i4 = i2;
            }
        } else {
            tagColorToken.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(2144033778);
            if ((i2 & 6) == 0) {
                if (getpostalcode.read(tagColorToken.ordinal())) {
                    i3 = 4;
                } else {
                    int i10 = read + 91;
                    IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    i3 = 2;
                }
                i4 = i3 | i2;
            } else {
                i4 = i2;
            }
        }
        if ((i2 & 48) == 0) {
            i4 |= getpostalcode.read(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            int i12 = IconCompatParcelizer + 65;
            read = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                if (getpostalcode.read(modifier)) {
                    i5 = Fields.RotationX;
                } else {
                    i5 = Fields.SpotShadowColor;
                }
            } else {
                int i13 = 8 / 0;
                if (getpostalcode.read(modifier)) {
                    i5 = Fields.RotationX;
                } else {
                    i5 = Fields.SpotShadowColor;
                }
            }
            i4 |= i5;
        }
        if (getpostalcode.write(i4 & 1, !((i4 & 147) == 146))) {
            Modifier modifierSerializer = SizeKt.serializer(modifier, 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierSerializer);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                int i14 = IconCompatParcelizer + 95;
                read = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Modifier.Companion companion2 = Modifier.Companion;
                CircleWithNumber(tagColorToken, i, companion2, getpostalcode, (i4 & 14) | 384 | (i4 & 112));
                DividerKt.m5057DividerVerticalDashedDt02yhY(Dimensions.RemoteActionCompatParcelizer, 0, 4, 0L, getpostalcode, PaddingKt.m74paddingqDBjuR0$default(SizeKt.serializer(companion2, 1.0f), 0.0f, Dimensions.setStackedBackground, 0.0f, 0.0f, 13));
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getZero9UxMQ8M(tagColorToken, i, modifier, i2, 0);
            int i16 = IconCompatParcelizer + 9;
            read = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
        }
    }

    public static final void CircleWithNumber(TagColorToken tagColorToken, int i, Modifier modifier, getBirthDateFull getbirthdatefull, int i2) {
        int i3;
        long jOnPictureInPictureUiStateChanged;
        Modifier modifierWrite;
        boolean z;
        long popupTheme;
        long presenter;
        int i4;
        int i5;
        int i6 = 2 % 2;
        tagColorToken.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-535299467);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i2 & 6) == 0) {
            i3 = (getpostalcode.read(tagColorToken.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (getpostalcode.read(i)) {
                int i7 = IconCompatParcelizer + 103;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i9 = IconCompatParcelizer + 17;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i3 |= i4;
        }
        if (getpostalcode.write(i3 & 1, (i3 & 147) != 146)) {
            int i11 = read + 23;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(modifier, Dimensions.setVisibility);
            int[] iArr = VelocityCompanion.write;
            switch (iArr[tagColorToken.ordinal()]) {
                case 1:
                    getpostalcode.serializer(-932362458);
                    jOnPictureInPictureUiStateChanged = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onPictureInPictureUiStateChanged();
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                case 2:
                    getpostalcode.serializer(-932360156);
                    jOnPictureInPictureUiStateChanged = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onPreparePanel();
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                case 3:
                    getpostalcode.serializer(-932357883);
                    jOnPictureInPictureUiStateChanged = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                case 4:
                case 5:
                    getpostalcode.serializer(-932354810);
                    jOnPictureInPictureUiStateChanged = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onRequestPermissionsResult();
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                case 6:
                    getpostalcode.serializer(-932352508);
                    jOnPictureInPictureUiStateChanged = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onPictureInPictureModeChanged();
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                case 7:
                    getpostalcode.serializer(-932350268);
                    jOnPictureInPictureUiStateChanged = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onPanelClosed();
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                default:
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -932364030, false);
            }
            getTopLeftannotations gettopleftannotations = RoundedCornerShapeKt.IconCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierM83size3ABfNKs, jOnPictureInPictureUiStateChanged, gettopleftannotations);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion.getCenter(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i13 = IconCompatParcelizer + 105;
                read = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    getpostalcode.serializer(constructor);
                    int i14 = 5 / 0;
                } else {
                    getpostalcode.serializer(constructor);
                }
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i15 = IconCompatParcelizer + 31;
                read = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            if (tagColorToken != TagColorToken.SuccessPale) {
                getpostalcode.serializer(1723681405);
                Modifier.Companion companion3 = Modifier.Companion;
                position positionVarSerializer = DefaultPagerNestedScrollConnection.serializer(Dimensions.read, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter());
                modifierWrite = BorderKt.write(companion3, positionVarSerializer.read, positionVarSerializer.IconCompatParcelizer, gettopleftannotations);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(1723790215);
                getpostalcode.IconCompatParcelizer(false);
                modifierWrite = Modifier.Companion;
            }
            Modifier modifierM83size3ABfNKs2 = SizeKt.m83size3ABfNKs(modifierWrite, Dimensions.getAnimatedVisibility);
            if (iArr[tagColorToken.ordinal()] == 1) {
                getpostalcode.serializer(444147819);
                popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setCustomView();
                z = false;
                getpostalcode.IconCompatParcelizer(false);
            } else {
                z = false;
                getpostalcode.serializer(444149305);
                popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
                getpostalcode.IconCompatParcelizer(false);
            }
            Modifier modifierM20backgroundbw27NRU2 = BackgroundKt.m20backgroundbw27NRU(modifierM83size3ABfNKs2, popupTheme, gettopleftannotations);
            MeasurePolicy measurePolicy2 = BoxKt.read(companion.getCenter(), z);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i17 = IconCompatParcelizer + 89;
                read = i17 % Fields.SpotShadowColor;
                if (i17 % 2 != 0) {
                    getpostalcode.serializer(constructor2);
                    int i18 = 90 / 0;
                } else {
                    getpostalcode.serializer(constructor2);
                }
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            TextStyle textStyleR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = performLayout.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            if (iArr[tagColorToken.ordinal()] == 1) {
                getpostalcode.serializer(-1911524642);
                presenter = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1911523713);
                presenter = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
                getpostalcode.IconCompatParcelizer(false);
            }
            TextKt.m131TextNvy7gAk(String.valueOf(i), null, presenter, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, getpostalcode, 0, 0, 131066);
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i19 = IconCompatParcelizer + 19;
            read = i19 % Fields.SpotShadowColor;
            if (i19 % 2 != 0) {
                int i20 = 4 / 3;
            }
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getZero9UxMQ8M(tagColorToken, i, modifier, i2, 1);
        }
    }
}
