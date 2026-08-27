package com.roadrunner.delivery.accept.payatpickup.implementation.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.indicators.ChipsKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.Arrays;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.LetterSpacingSpanPx;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.accessgetReusableRectp;
import o.buildMapping;
import o.chooseHeight;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getEllipsizedRightPaddingdefault;
import o.getHandleruiannotations;
import o.getHasCamera;
import o.getNewPassword;
import o.getPostalCode;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.setCurrentSemanticsNodesui;
import o.show;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PayAtPickupWithPaymentOptionsKt {
    private static int IconCompatParcelizer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:53:0x00fd A[PHI: r17
  0x00fd: PHI (r17v1 boolean) = (r17v0 boolean), (r17v7 boolean) binds: [B:52:0x00fb, B:49:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0101 A[PHI: r17
  0x0101: PHI (r17v6 boolean) = (r17v0 boolean), (r17v7 boolean) binds: [B:52:0x00fb, B:49:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x01a8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    public static final void PaymentOptionChips(String str, LetterSpacingSpanPx letterSpacingSpanPx, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        boolean z;
        boolean z2;
        Modifier modifier2;
        ?? r10;
        int i2;
        boolean zIconCompatParcelizer;
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 87;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(863366718);
        int i7 = (i & 6) == 0 ? (getpostalcode.read(str2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            int i8 = write + 47;
            int i9 = i8 % Fields.SpotShadowColor;
            IconCompatParcelizer = i9;
            if (i8 % 2 != 0 ? (i & 64) != 0 : (i & 52) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(letterSpacingSpanPx);
            } else {
                int i10 = i9 + 79;
                write = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    getpostalcode.read(letterSpacingSpanPx);
                    throw null;
                }
                zIconCompatParcelizer = getpostalcode.read(letterSpacingSpanPx);
            }
            i7 |= !(zIconCompatParcelizer ^ true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i11 = write + 91;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i13 = IconCompatParcelizer + 35;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i2 = Fields.RotationX;
            } else {
                i2 = Fields.SpotShadowColor;
            }
            i7 |= i2;
        }
        int i15 = i7 | 3072;
        if ((i15 & 1171) != 1170) {
            int i16 = write + 75;
            IconCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!getpostalcode.write(i15 & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer(Dimensions.setStackedBackground), Alignment.Companion.getCenterVertically(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i18 = IconCompatParcelizer + 45;
            write = i18 % Fields.SpotShadowColor;
            if (i18 % 2 != 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                z2 = false;
                int i19 = 36 / 0;
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            } else {
                z2 = false;
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            getpostalcode.serializer(285924410);
            for (getEllipsizedRightPaddingdefault getellipsizedrightpaddingdefault : letterSpacingSpanPx.serializer) {
                boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str2, getellipsizedrightpaddingdefault.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
                String str3 = getellipsizedrightpaddingdefault.read;
                if (zBooleanValue) {
                    int i20 = IconCompatParcelizer + 107;
                    write = i20 % Fields.SpotShadowColor;
                    int i21 = i20 % i3;
                    r10 = R.drawable.ic_check;
                } else {
                    r10 = z2;
                }
                int i22 = write + 43;
                IconCompatParcelizer = i22 % Fields.SpotShadowColor;
                int i23 = i22 % i3;
                Modifier.Companion companion3 = Modifier.Companion;
                String.format("pay_at_pickup_with_options_option_%s_%s", Arrays.copyOf(new Object[]{Boolean.valueOf(zBooleanValue), getellipsizedrightpaddingdefault.RemoteActionCompatParcelizer}, i3));
                companion3.getClass();
                boolean z3 = (i15 & 896) == 256 ? true : z2;
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(getellipsizedrightpaddingdefault);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (z3 || zIconCompatParcelizer2) {
                    objComponentActivity = new ViewUtils$$ExternalSyntheticLambda6(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 14, getellipsizedrightpaddingdefault);
                    getpostalcode.write(objComponentActivity);
                } else {
                    int i24 = IconCompatParcelizer + 75;
                    write = i24 % Fields.SpotShadowColor;
                    int i25 = i24 % i3;
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new ViewUtils$$ExternalSyntheticLambda6(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 14, getellipsizedrightpaddingdefault);
                        getpostalcode.write(objComponentActivity);
                    }
                }
                ChipsKt.RemoteActionCompatParcelizer(str3, zBooleanValue, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, companion3, r10, getpostalcode, 0, 0);
                companion = companion;
                i15 = i15;
                str2 = str;
                z2 = z2;
                i3 = 2;
            }
            getpostalcode.IconCompatParcelizer(z2);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera((Object) str, (Object) letterSpacingSpanPx, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, i, 11);
        }
    }

    public static final void PayAtPickupWithPaymentOptions(chooseHeight chooseheight, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1895220184);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            int i6 = IconCompatParcelizer + 81;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (!((i & 8) == 0 ? getpostalcode.read(chooseheight) : getpostalcode.IconCompatParcelizer(chooseheight))) {
                i4 = 2;
            } else {
                int i8 = write + 105;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    int i9 = 2 % 5;
                }
                i4 = 4;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = IconCompatParcelizer + 55;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i12 = IconCompatParcelizer + 33;
                write = i12 % Fields.SpotShadowColor;
                i3 = i12 % 2 != 0 ? 52 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i13 = i2 | 384;
        if (getpostalcode.write(i13 & 1, (i13 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierSerializer = SizeKt.serializer(SizeKt.write(companion, 1.0f), (Alignment.Vertical) null, 3);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierSerializer, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), RectangleShapeKt.getRectangleShape());
            float f = Dimensions.setActionBarVisibilityCallback;
            float f2 = Dimensions.getNestedScrollAxes;
            Modifier modifier3 = PaddingKt.read(modifierM20backgroundbw27NRU, f, f2, f, f2);
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.read;
            Alignment.Companion companion2 = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(arrangement$Center$1, companion2.getCenterVertically(), getpostalcode, 54);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier3);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i14 = IconCompatParcelizer + 41;
                write = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion.then(new show(1.0f, true)), 0.0f, 0.0f, Dimensions.getActionBarHideOffset, 0.0f, 11);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion2.getStart(), getpostalcode, 0);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!(!getpostalcode.ComponentActivity)) {
                int i16 = write + 61;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            TextKt.m131TextNvy7gAk(chooseheight.write, companion, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode, 48, 24960, 110584);
            TextKt.m131TextNvy7gAk(chooseheight.IconCompatParcelizer, companion, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 2, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 48, 24576, 114680);
            getpostalcode.IconCompatParcelizer(true);
            LetterSpacingSpanPx letterSpacingSpanPx = chooseheight.serializer;
            if (letterSpacingSpanPx != null) {
                int i18 = IconCompatParcelizer + 109;
                write = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                getpostalcode.serializer(-1321978233);
                PaymentOptionChips(chooseheight.read, letterSpacingSpanPx, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, getpostalcode, ((i13 << 3) & 896) | 64);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1321771618);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 27, modifier2, (Object) chooseheight, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }
}
