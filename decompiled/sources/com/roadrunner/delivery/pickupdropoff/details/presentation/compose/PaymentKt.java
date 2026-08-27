package com.roadrunner.delivery.pickupdropoff.details.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.indicators.TagsKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidFontTypefaceLoader;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.accesstoViewInfoFactory;
import o.buildMapping;
import o.copyejIjP34;
import o.findDesignInfoProviders;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.processViewInfoslambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PaymentKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    public static final void Payment(String str, String str2, String str3, String str4, String str5, String str6, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        Arrangement$Center$1 arrangement$Center$1;
        boolean z;
        boolean z2;
        boolean z3;
        getPostalCode getpostalcode2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull;
        getpostalcode3.MediaSessionCompatQueueItem(-826861318);
        getAddressCountry getaddresscountry = getpostalcode3.read;
        if ((i & 6) == 0) {
            i2 = (getpostalcode3.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode3.read(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode3.read(str3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode3.read(str4) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode3.read(str5)) {
                int i6 = RemoteActionCompatParcelizer + 63;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = Fields.Clip;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            int i8 = write + 115;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                getpostalcode3.read(str6);
                throw null;
            }
            i2 |= getpostalcode3.read(str6) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            if (getpostalcode3.read(modifier)) {
                i3 = 1048576;
            } else {
                int i9 = RemoteActionCompatParcelizer + 35;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = Fields.BlendMode;
            }
            i2 |= i3;
        }
        int i11 = i2;
        if (!getpostalcode3.write(i11 & 1, (i11 & 599187) != 599186)) {
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            getpostalcode2 = getpostalcode3;
        } else {
            int i12 = write + 63;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode3, 0);
            int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode3.ComponentActivity) {
                getpostalcode3.serializer(constructor);
                int i14 = write + 43;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
            } else {
                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, modalBottomSheetYbuCTN8Serializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
            TextStyle textStyleParcelableVolumeInfo = performLayout.ParcelableVolumeInfo();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleParcelableVolumeInfo, getpostalcode3, i11 & 14, 0, 131066);
            Modifier.Companion companion3 = Modifier.Companion;
            float f = Dimensions.getNestedScrollAxes;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode3, SizeKt.m75height3ABfNKs(companion3, f)});
            Arrangement$Center$1 arrangement$Center$2 = Arrangement.read;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(arrangement$Center$2, companion.getTop(), getpostalcode3, 6);
            float f2 = f;
            int iHashCode2 = Long.hashCode(getpostalcode3.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode3.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode3, companion3);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode3.ComponentActivity) {
                getpostalcode3.serializer(constructor2);
            } else {
                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode3, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode2), getpostalcode3));
            Modifier modifierWrite2 = copyejIjP34.write(companion3, 1.0f);
            float f3 = Dimensions.setActionBarVisibilityCallback;
            TextKt.m131TextNvy7gAk(str2, PaddingKt.m74paddingqDBjuR0$default(modifierWrite2, 0.0f, 0.0f, f3, 0.0f, 11), ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, true, 0, 0, null, performLayout.PlaybackStateCompatCustomAction(), getpostalcode3, (i11 >> 3) & 14, 3072, 122872);
            if (str3 != null) {
                int i16 = RemoteActionCompatParcelizer + 107;
                write = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                getpostalcode3.serializer(-1829065152);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getEnd(), getpostalcode3, 48);
                int iHashCode3 = Long.hashCode(getpostalcode3.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode3.serializer();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode3, companion3);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion2.getConstructor();
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode3.ComponentActivity) {
                    getpostalcode3.serializer(constructor3);
                } else {
                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, modalBottomSheetYbuCTN8Serializer2, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode3), getpostalcode3));
                arrangement$Center$1 = arrangement$Center$2;
                TextKt.m131TextNvy7gAk(str3, null, ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.getFullyDrawnReporter.MediaSessionCompatResultReceiverWrapper(), getpostalcode3, (i11 >> 6) & 14, 0, 131066);
                getpostalcode = getpostalcode3;
                z2 = true;
                getpostalcode.IconCompatParcelizer(true);
                z = false;
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode = getpostalcode3;
                arrangement$Center$1 = arrangement$Center$2;
                z = false;
                z2 = true;
                getpostalcode.serializer(-1828786462);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(z2);
            if (str4 == null || str5 == null) {
                z3 = z;
                getpostalcode.serializer(-1355953090);
                getpostalcode.IconCompatParcelizer(z3);
            } else {
                getpostalcode.serializer(-1356606570);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, f2)});
                Modifier modifierWrite3 = SizeKt.write(companion3, 1.0f);
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(arrangement$Center$1, companion.getCenterVertically(), getpostalcode, 54);
                int iHashCode4 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite3);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i18 = RemoteActionCompatParcelizer + 41;
                    write = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    getpostalcode.serializer(constructor4);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode4), getpostalcode));
                setcurrentsemanticsnodesui = setcurrentsemanticsnodesui;
                companion3 = companion3;
                f2 = f2;
                getPostalCode getpostalcode4 = getpostalcode;
                TextKt.m131TextNvy7gAk(str4, PaddingKt.m74paddingqDBjuR0$default(copyejIjP34.write(companion3, 1.0f), 0.0f, 0.0f, f3, 0.0f, 11), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.PlaybackStateCompatCustomAction(), getpostalcode4, (i11 >> 9) & 14, 0, 131064);
                getpostalcode = getpostalcode4;
                z3 = false;
                TagsKt.serializer(str5, null, 0, getpostalcode, (i11 >> 12) & 14);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(false);
            }
            if (str6 != null) {
                getpostalcode.serializer(-1355920013);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, f2)});
                getPostalCode getpostalcode5 = getpostalcode;
                TextKt.m131TextNvy7gAk(str6, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setOnMenuItemClickListener(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.onActivityResult.MediaSessionCompatResultReceiverWrapper(), getpostalcode5, (i11 >> 15) & 14, 0, 131066);
                getpostalcode2 = getpostalcode5;
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2 = getpostalcode;
                getpostalcode2.serializer(-1355755682);
                getpostalcode2.IconCompatParcelizer(z3);
            }
            getpostalcode2.IconCompatParcelizer(true);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new processViewInfoslambda1(str, str2, str3, str4, str5, str6, modifier, i, 0);
        }
    }

    public static final void RemoteActionCompatParcelizer(accesstoViewInfoFactory accesstoviewinfofactory, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        String str;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1169920231);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(accesstoviewinfofactory) : getpostalcode.IconCompatParcelizer(accesstoviewinfofactory) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (!(!getpostalcode.write(i4 & 1, (i4 & 19) != 18))) {
            Modifier.Companion companion = Modifier.Companion;
            String str2 = accesstoviewinfofactory.write;
            String str3 = accesstoviewinfofactory.serializer;
            String str4 = accesstoviewinfofactory.read;
            findDesignInfoProviders finddesigninfoproviders = accesstoviewinfofactory.RemoteActionCompatParcelizer;
            String str5 = null;
            if (finddesigninfoproviders != null) {
                str = finddesigninfoproviders.RemoteActionCompatParcelizer;
                int i5 = write + 53;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                int i7 = RemoteActionCompatParcelizer + 79;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                str = null;
            }
            if (finddesigninfoproviders != null) {
                int i9 = write + 9;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    String str6 = finddesigninfoproviders.IconCompatParcelizer;
                    throw null;
                }
                str5 = finddesigninfoproviders.IconCompatParcelizer;
            }
            String str7 = accesstoviewinfofactory.IconCompatParcelizer;
            float f = Dimensions.getNestedScrollAxes;
            float f2 = Dimensions.setActionBarVisibilityCallback;
            Payment(str2, str3, str4, str, str5, str7, PaddingKt.m73paddingVpY3zN4$default(PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, f, 0.0f, f2, 5), f2, 0.0f, 2), getpostalcode, 0);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 16, accesstoviewinfofactory, modifier2);
        }
    }
}
