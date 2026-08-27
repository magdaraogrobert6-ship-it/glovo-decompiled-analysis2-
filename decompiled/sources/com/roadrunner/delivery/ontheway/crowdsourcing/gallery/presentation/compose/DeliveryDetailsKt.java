package com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.IconCompatParcelizer;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.buildMapping;
import o.canReadPlayIds;
import o.computeHorizontalScrollExtent;
import o.emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseObserveNavigationEntrancePictureinvokeinlinedmap12;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.getPrivateImeOptions;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.showSoftInput;
import o.supportingTextPaddinga9UjIt4material3default;
import o.times6HolHcs;
import o.updateExtractedText;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DeliveryDetailsKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Code duplicated, block: B:51:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ed  */
    public static final void write(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        TextStyle textStyle;
        int i3;
        long j;
        TextStyle textStyleIconCompatParcelizer;
        int iM3569getEllipsisgIe3tQ8;
        long supportBackgroundTintMode;
        Object objComponentActivity;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-341776234);
        if ((i & 6) == 0) {
            int i8 = RemoteActionCompatParcelizer + 89;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (getpostalcode.read(str)) {
                i6 = 4;
            } else {
                int i10 = RemoteActionCompatParcelizer + 61;
                read = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    int i11 = 5 % 3;
                }
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i12 = RemoteActionCompatParcelizer + 91;
                read = i12 % Fields.SpotShadowColor;
                i5 = i12 % 2 == 0 ? 34 : 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (!getpostalcode.read(modifier)) {
                int i13 = RemoteActionCompatParcelizer + 57;
                read = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i4 = Fields.SpotShadowColor;
            } else {
                i4 = Fields.RotationX;
            }
            i2 |= i4;
        }
        boolean z = false;
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            int i15 = read + 27;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
                supportBackgroundTintMode = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode();
                iM3569getEllipsisgIe3tQ8 = TextOverflow.Companion.m3569getEllipsisgIe3tQ8();
                if ((i2 & 69) != 42) {
                    textStyle = textStyleIconCompatParcelizer;
                }
                j = supportBackgroundTintMode;
                i3 = iM3569getEllipsisgIe3tQ8;
                objComponentActivity = getpostalcode.ComponentActivity();
                if (z || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(10, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity);
                    int i16 = read + 119;
                    RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                }
                TextKt.m131TextNvy7gAk(str, modifier, j, 0L, null, null, 0L, null, 0L, i3, false, 0, 0, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, textStyle, getpostalcode, (i2 & 14) | ((i2 >> 3) & 112), 384, 61432);
            } else {
                TextStyle textStyleIconCompatParcelizer2 = performLayout.IconCompatParcelizer();
                long supportBackgroundTintMode2 = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode();
                int iM3569getEllipsisgIe3tQ9 = TextOverflow.Companion.m3569getEllipsisgIe3tQ8();
                if ((i2 & 112) == 32) {
                    textStyleIconCompatParcelizer = textStyleIconCompatParcelizer2;
                    iM3569getEllipsisgIe3tQ8 = iM3569getEllipsisgIe3tQ9;
                    supportBackgroundTintMode = supportBackgroundTintMode2;
                } else {
                    textStyle = textStyleIconCompatParcelizer2;
                    i3 = iM3569getEllipsisgIe3tQ9;
                    j = supportBackgroundTintMode2;
                }
                objComponentActivity = getpostalcode.ComponentActivity();
                if (z) {
                    objComponentActivity = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(10, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity);
                    int i18 = read + 119;
                    RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                } else {
                    objComponentActivity = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(10, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity);
                    int i110 = read + 119;
                    RemoteActionCompatParcelizer = i110 % Fields.SpotShadowColor;
                    int i111 = i110 % 2;
                }
                TextKt.m131TextNvy7gAk(str, modifier, j, 0L, null, null, 0L, null, 0L, i3, false, 0, 0, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, textStyle, getpostalcode, (i2 & 14) | ((i2 >> 3) & 112), 384, 61432);
            }
            textStyle = textStyleIconCompatParcelizer;
            z = true;
            j = supportBackgroundTintMode;
            i3 = iM3569getEllipsisgIe3tQ8;
            objComponentActivity = getpostalcode.ComponentActivity();
            if (z) {
                objComponentActivity = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(10, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity);
                int i112 = read + 119;
                RemoteActionCompatParcelizer = i112 % Fields.SpotShadowColor;
                int i113 = i112 % 2;
            } else {
                objComponentActivity = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(10, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity);
                int i114 = read + 119;
                RemoteActionCompatParcelizer = i114 % Fields.SpotShadowColor;
                int i115 = i114 % 2;
            }
            TextKt.m131TextNvy7gAk(str, modifier, j, 0L, null, null, 0L, null, 0L, i3, false, 0, 0, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, textStyle, getpostalcode, (i2 & 14) | ((i2 >> 3) & 112), 384, 61432);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeHorizontalScrollExtent(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    public static final void DestinationHeader(String str, Integer num, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        int i3;
        Integer num2;
        int i4;
        int i5 = 2 % 2;
        int i6 = read + 101;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-800818140);
        if ((i & 6) == 0) {
            int i8 = read + 117;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                int i9 = 91 / 0;
                if (getpostalcode2.read(str)) {
                    int i10 = read + 55;
                    RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    i4 = 4;
                } else {
                    i4 = 2;
                }
            } else if (getpostalcode2.read(str)) {
                int i12 = read + 55;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i14 = RemoteActionCompatParcelizer + 117;
            read = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            i2 |= getpostalcode2.read(num) ? 32 : 16;
        }
        int i16 = i2;
        if ((i16 & 19) != 18) {
            int i17 = RemoteActionCompatParcelizer + 3;
            read = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            z = true;
        } else {
            int i19 = read + 115;
            RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            z = false;
        }
        if (getpostalcode2.write(i16 & 1, z)) {
            int i21 = RemoteActionCompatParcelizer + 93;
            read = i21 % Fields.SpotShadowColor;
            int i22 = i21 % 2;
            Modifier modifierWrite = SizeKt.write(Modifier.Companion, 1.0f);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.read, Alignment.Companion.getCenterVertically(), getpostalcode2, 54);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            TextStyle textStyle = (TextStyle) performLayout.read(-961708487, pcn.serializer(), new Object[0], 961708487, pcn.serializer(), pcn.serializer(), pcn.serializer());
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, textStyle, getpostalcode2, i16 & 14, 24960, 110586);
            num2 = num;
            if (num2 == null) {
                getpostalcode = getpostalcode2;
                getpostalcode.serializer(1088628327);
                i3 = 0;
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode = getpostalcode2;
                i3 = 0;
                getpostalcode.serializer(1088628328);
                IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(num.intValue(), getpostalcode, 0), (String) null, (Modifier) null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), getpostalcode, Painter.$stable | 48, 4);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            i3 = 0;
            num2 = num;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPrivateImeOptions(str, num2, i, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    public static final void DetailsSection(updateExtractedText updateextractedtext, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Object obj;
        boolean z2;
        boolean z3;
        Modifier.Companion companion;
        boolean z4;
        Modifier modifierM;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        String str = updateextractedtext.write;
        String str2 = updateextractedtext.serializer;
        showSoftInput showsoftinput = updateextractedtext.MediaBrowserCompatMediaItem;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1382011609);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(updateextractedtext) : getpostalcode.IconCompatParcelizer(updateextractedtext) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | 48;
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i8 = RemoteActionCompatParcelizer + 105;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i5 = Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i7 |= i5;
        }
        if ((i & 3072) == 0) {
            int i10 = read + 59;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                int i11 = 33 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    int i12 = RemoteActionCompatParcelizer + 51;
                    read = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    i4 = Fields.CameraDistance;
                } else {
                    i4 = Fields.RotationZ;
                }
            } else if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i14 = RemoteActionCompatParcelizer + 51;
                read = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i4 = Fields.CameraDistance;
            } else {
                i4 = Fields.RotationZ;
            }
            i7 |= i4;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2)) {
                int i16 = read + 15;
                RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i3 = Fields.Clip;
            } else {
                i3 = 8192;
            }
            i7 |= i3;
        }
        int i18 = i7;
        if ((i18 & 9363) != 9362) {
            int i19 = read + 91;
            RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i18 & 1, z)) {
            int i21 = read + 27;
            RemoteActionCompatParcelizer = i21 % Fields.SpotShadowColor;
            String str3 = null;
            if (i21 % 2 != 0) {
                Modifier.Companion companion2 = Modifier.Companion;
                showSoftInput showsoftinput2 = showSoftInput.EXPANDED;
                str3.hashCode();
                throw null;
            }
            Modifier.Companion companion3 = Modifier.Companion;
            boolean z5 = showsoftinput == showSoftInput.EXPANDED;
            Modifier modifierWrite = SizeKt.write(companion3, 1.0f);
            if (showsoftinput != null) {
                int i22 = RemoteActionCompatParcelizer + 81;
                read = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            Modifier modifier2 = canReadPlayIds.read(modifierWrite, null, z2, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode, 61);
            float f = Dimensions.setActionBarVisibilityCallback;
            Modifier modifierWrite2 = PaddingKt.write(modifier2, f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion4.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i24 = read + 49;
            RemoteActionCompatParcelizer = i24 % Fields.SpotShadowColor;
            if (i24 % 2 != 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z6 = getpostalcode.ComponentActivity;
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion4, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            if (str2.length() > 0) {
                getpostalcode.serializer(1020697756);
                z3 = false;
                DestinationHeader(str2, showsoftinput != null ? Integer.valueOf(showsoftinput.getIconRes()) : null, getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                z3 = false;
                getpostalcode.serializer(1020810193);
                getpostalcode.IconCompatParcelizer(false);
            }
            if (str.length() > 0) {
                getpostalcode.serializer(1020861870);
                if (z5) {
                    companion = companion3;
                    modifierM = companion;
                } else {
                    companion = companion3;
                    modifierM = d$$ExternalSyntheticOutline0.m(1.0f, z3, companion);
                }
                write((i18 >> 3) & 112, getpostalcode, modifierM, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.IconCompatParcelizer(z3);
            } else {
                companion = companion3;
                getpostalcode.serializer(1021141521);
                getpostalcode.IconCompatParcelizer(z3);
            }
            String str4 = updateextractedtext.read;
            if (str4 != null) {
                int i25 = read + 89;
                RemoteActionCompatParcelizer = i25 % Fields.SpotShadowColor;
                int i26 = i25 % 2;
                if (str4.length() != 0) {
                    str3 = str4;
                }
            }
            if (str3 == null) {
                getpostalcode.serializer(1021220477);
                getpostalcode.IconCompatParcelizer(false);
                z4 = true;
            } else {
                getpostalcode.serializer(1021220478);
                z4 = true;
                DividerKt.read(0.0f, 0, 4, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOverflowReserved(), getpostalcode, PaddingKt.m73paddingVpY3zN4$default(companion, 0.0f, f, 1));
                DeliveryNotesSection(str3, z5, updateextractedtext.RatingCompat, updateextractedtext.MediaSessionCompatResultReceiverWrapper, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, (i18 & 57344) | ((i18 << 9) & 458752));
                getpostalcode.IconCompatParcelizer(false);
            }
            IconCompatParcelizer.IconCompatParcelizer(companion, Dimensions.getNestedScrollAxes, getpostalcode, z4);
            obj = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            obj = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM(updateextractedtext, obj, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, i, 11);
        }
    }

    public static final void DeliveryNotesSection(String str, boolean z, boolean z2, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1325467177);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            int i6 = RemoteActionCompatParcelizer + 3;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = read + 17;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (getpostalcode.write(z)) {
                int i10 = RemoteActionCompatParcelizer + 51;
                read = i10 % Fields.SpotShadowColor;
                i4 = i10 % 2 == 0 ? 65 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.write(z2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i11 = read + 45;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (getpostalcode.read(str2)) {
                int i13 = RemoteActionCompatParcelizer + 27;
                read = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i3 = Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RenderEffect : 65536;
        }
        int i15 = i2;
        if (getpostalcode.write(i15 & 1, (i15 & 74899) != 74898)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            Alignment.Companion companion2 = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion2.getCenterVertically(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i16 = RemoteActionCompatParcelizer + 95;
                read = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_file_new_note, getpostalcode, 0);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            IconKt.m116Iconww6aTOc(painterPainterResource, "Delivery Notes Icon", SizeKt.m83size3ABfNKs(companion, Dimensions.setLogo).then(new emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseObserveNavigationEntrancePictureinvokeinlinedmap12(companion2.getTop())), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setOnMenuItemClickListener(), getpostalcode, Painter.$stable | 48, 0);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, PaddingKt.m74paddingqDBjuR0$default(companion, Dimensions.getNestedScrollAxes, 0.0f, 0.0f, 0.0f, 14)});
            Modifier modifierWrite2 = SizeKt.write(companion, 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion2.getStart(), getpostalcode, 0);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            int i18 = z ? Integer.MAX_VALUE : 2;
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            long supportBackgroundTintMode = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode();
            int iM3569getEllipsisgIe3tQ8 = TextOverflow.Companion.m3569getEllipsisgIe3tQ8();
            if ((i15 & 458752) == 131072) {
                int i19 = RemoteActionCompatParcelizer + 5;
                read = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z3 || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(9, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                getpostalcode.write(objComponentActivity);
                int i21 = read + 115;
                RemoteActionCompatParcelizer = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
            }
            TextKt.m131TextNvy7gAk(str, null, supportBackgroundTintMode, 0L, null, null, 0L, null, 0L, iM3569getEllipsisgIe3tQ8, false, i18, 0, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, textStyleIconCompatParcelizer, getpostalcode, i15 & 14, 384, 45050);
            if (z2) {
                getpostalcode.serializer(1062857665);
                TertiaryKt.IconCompatParcelizer(str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, false, 0, null, null, null, getpostalcode, (i15 >> 9) & 126, 252);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(1063009503);
                getpostalcode.IconCompatParcelizer(false);
            }
            int i23 = RemoteActionCompatParcelizer + 5;
            read = i23 % Fields.SpotShadowColor;
            int i24 = i23 % 2;
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
            int i25 = read + 45;
            RemoteActionCompatParcelizer = i25 % Fields.SpotShadowColor;
            int i26 = i25 % 2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new times6HolHcs(str, z, z2, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, i);
        }
    }
}
