package com.roadrunner.login.presentation.countryselection.compose;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.login.presentation.otp.OtpNavigationKt$$ExternalSyntheticLambda4;
import com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt;
import io.sentry.SentryUUID;
import java.util.List;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.RadioButton;
import o.ah;
import o.bExternalSyntheticLambda1;
import o.buildMapping;
import o.canReadPlayIds;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getLayers;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FilterableSelectionComponentKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    public static final void NotFoundComponent(Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1767435576);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.read(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!getpostalcode2.write(i2 & 1, (i2 & 3) != 2)) {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int i4 = read + 45;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                    int i6 = RemoteActionCompatParcelizer + 33;
                    read = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                Modifier.Companion companion3 = Modifier.Companion;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.img_small_brand_not_found, getpostalcode2, 0), null, companion3.then(new RadioButton(companion.getCenterHorizontally())), null, null, 0.0f, null, getpostalcode2, Painter.$stable | 48, 120);
                Object[] objArr = {getpostalcode2, SizeKt.m75height3ABfNKs(companion3, Dimensions.setStackedBackground)};
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
                getpostalcode = getpostalcode2;
                TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.country_selection_not_found_message, getpostalcode2, 0), null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode, 0, 0, 131066);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier, i, 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    public static final void FilterableSelectionComponent(ah ahVar, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, String str, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Alignment.Vertical vertical;
        boolean z;
        char c;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = RemoteActionCompatParcelizer + 59;
        read = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        List<bExternalSyntheticLambda1> list = ahVar.IconCompatParcelizer;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        str.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-146060215);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            int i8 = read + 111;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (getpostalcode.IconCompatParcelizer(ahVar)) {
                int i10 = RemoteActionCompatParcelizer + 95;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i12 = read + 55;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            i2 |= !(getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ^ true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i14 = read + 23;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                int i15 = 72 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                    i3 = Fields.RotationX;
                } else {
                    i3 = Fields.SpotShadowColor;
                }
            } else if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            int i16 = read + 75;
            RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            i2 |= getpostalcode.read(str) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.Clip : 8192;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 9363) != 9362)) {
            int i18 = read + 11;
            RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(companion, Dimensions.getAnimatedVisibility, 0.0f, 2);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i20 = RemoteActionCompatParcelizer + 35;
                read = i20 % Fields.SpotShadowColor;
                if (i20 % 2 != 0) {
                    getpostalcode.serializer(constructor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getpostalcode.serializer(constructor);
                vertical = null;
            } else {
                vertical = null;
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            modifierM73paddingVpY3zN4$default.getClass();
            int i21 = i2;
            TextInputBigV2Kt.TextInputBigV2(str, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifierM73paddingVpY3zN4$default, false, null, StringResources_androidKt.stringResource(R.string.login_country_selection_search_placeholder, getpostalcode, 0), null, null, false, null, null, true, 0, null, null, null, null, "input_country_filter_field", null, getpostalcode, ((i2 >> 9) & 14) | (i2 & 112), 3072, 48, 6283192);
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(SizeKt.serializer(SizeKt.write(companion, 1.0f), vertical, 3), 0.0f, Dimensions.setTabContainer, 0.0f, 0.0f, 13);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            if (list.isEmpty()) {
                getpostalcode.serializer(-1199826931);
                NotFoundComponent(PaddingKt.m74paddingqDBjuR0$default(companion.then(new RadioButton(companion2.getCenterHorizontally())), 0.0f, Dimensions.setSplitBackground, 0.0f, 0.0f, 13), getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1199572855);
                for (bExternalSyntheticLambda1 bexternalsyntheticlambda1 : list) {
                    int i22 = RemoteActionCompatParcelizer + 99;
                    read = i22 % Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    Modifier.Companion companion4 = Modifier.Companion;
                    int i24 = i21;
                    if ((i24 & 896) == 256) {
                        int i25 = RemoteActionCompatParcelizer + 35;
                        read = i25 % Fields.SpotShadowColor;
                        int i26 = i25 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(bexternalsyntheticlambda1);
                    Object objComponentActivity = getpostalcode.ComponentActivity();
                    if ((zIconCompatParcelizer || z) || objComponentActivity == getCreditCardExpirationMonth.write) {
                        c = 2;
                        objComponentActivity = new OtpNavigationKt$$ExternalSyntheticLambda4(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, 2, bexternalsyntheticlambda1);
                        getpostalcode.write(objComponentActivity);
                    } else {
                        c = 2;
                    }
                    CountryItemKt.CountryItem(bexternalsyntheticlambda1, canReadPlayIds.read(companion4, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 63), getpostalcode, 0);
                    i21 = i24;
                }
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(i, 7, modifier, ahVar, r8lambdaunavo3sxub_pc9xroryotnrlvsm, str, r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
        }
    }
}
