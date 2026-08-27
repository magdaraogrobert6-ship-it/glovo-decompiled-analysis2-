package com.roadrunner.login.presentation.countryselection.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DefaultLazyKey;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.PopulateViewStructure_androidKtpopulate7;
import o.a5ExternalSyntheticLambda0;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getContentCaptureSessionui;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getKeyboardKindJ9_QTjY;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.isInvalidIndex;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.populate;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CountrySelectionKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    public static final void CountrySelection(a5ExternalSyntheticLambda0 a5externalsyntheticlambda0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5 = 2 % 2;
        a5externalsyntheticlambda0.getClass();
        boolean z3 = a5externalsyntheticlambda0.serializer;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        str.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1533920904);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.IconCompatParcelizer(a5externalsyntheticlambda0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = RemoteActionCompatParcelizer + 101;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i4 = 32;
                } else {
                    i4 = 16;
                }
            } else {
                int i7 = 77 / 0;
                if (!(!getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm))) {
                    i4 = 32;
                } else {
                    i4 = 16;
                }
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i8 = RemoteActionCompatParcelizer + 39;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                i2 |= getpostalcode2.read(str) ? Fields.RotationX : Fields.SpotShadowColor;
            } else {
                getpostalcode2.read(str);
                throw null;
            }
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (!getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                int i9 = IconCompatParcelizer + 117;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = 8192;
            } else {
                int i11 = IconCompatParcelizer + 91;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i3 = Fields.Clip;
            }
            i2 |= i3;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode2.read(modifier) ? Fields.RenderEffect : 65536;
        }
        if ((74899 & i2) != 74898) {
            int i13 = RemoteActionCompatParcelizer + 47;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            ScrollState scrollState = PagerWrapperFlingBehavior.read(0, getpostalcode2, 1);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(a5externalsyntheticlambda0, getpostalcode2);
            boolean z4 = getpostalcode2.read(scrollState);
            boolean z5 = getpostalcode2.read(populateViewStructure_androidKtpopulate7Serializer);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if ((z4 | z5) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new PushEventPublisherImpl$emit$1(scrollState, populateViewStructure_androidKtpopulate7Serializer, null, 15);
                getpostalcode2.write(objComponentActivity);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, scrollState, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifier, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape());
            FillElement fillElement = SizeKt.read;
            Modifier modifierThen = modifierM20backgroundbw27NRU.then(fillElement);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                int i15 = RemoteActionCompatParcelizer + 31;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!(!getpostalcode2.ComponentActivity)) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                if (z3) {
                    getpostalcode2.serializer(-904590073);
                    HeaderKt.RemoteActionCompatParcelizer(null, null, 0L, null, ExtrasKt.write(-1108275419, new DefaultLazyKey(19, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode2), null, getpostalcode2, 196608, 95);
                    z2 = false;
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    z2 = false;
                    getpostalcode2.serializer(-904300812);
                    getpostalcode2.IconCompatParcelizer(false);
                }
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier modifierThen2 = companion3.then(fillElement);
                MeasurePolicy measurePolicy = BoxKt.read(companion.getTopStart(), z2);
                int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen2);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor2);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
                Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(companion3.then(fillElement), scrollState, false, 14);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode2, 0);
                int iHashCode3 = Long.hashCode(getpostalcode2.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode2.serializer();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierIconCompatParcelizer);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion2.getConstructor();
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor3);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode3), getpostalcode2));
                Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(companion3, Dimensions.getAnimatedVisibility, 0.0f, 2);
                float f = Dimensions.setTabContainer;
                TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.login_country_selection_sub_title, getpostalcode2, 0), SizeKt.serializer(SizeKt.write(PaddingKt.m74paddingqDBjuR0$default(modifierM73paddingVpY3zN4$default, 0.0f, f, 0.0f, Dimensions.setSplitBackground, 5), 1.0f), (Alignment.Vertical) null, 3), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).WindowCallbackWrapper(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode2, 0, 0, 131064);
                int i17 = i2 << 3;
                getpostalcode = getpostalcode2;
                FilterableSelectionComponentKt.FilterableSelectionComponent(a5externalsyntheticlambda0.IconCompatParcelizer, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, str, PaddingKt.m74paddingqDBjuR0$default(SizeKt.serializer(SizeKt.write(companion3, 1.0f), (Alignment.Vertical) null, 3), 0.0f, f, 0.0f, 0.0f, 13), getpostalcode2, (i17 & 7168) | ((i2 >> 9) & 112) | (i17 & 896));
                getpostalcode.IconCompatParcelizer(true);
                if (!z3) {
                    getpostalcode.serializer(1381573977);
                    HeaderKt.RemoteActionCompatParcelizer(AlphaKt.alpha(companion3, ((getContentCaptureSessionui) ((populate) a5externalsyntheticlambda0.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer)).serializer()), StringResources_androidKt.stringResource(R.string.login_country_selection_collapsed_title, getpostalcode, 0), 0L, null, null, null, getpostalcode, 0, 124);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(1381778670);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            getpostalcode = getpostalcode2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY((Object) a5externalsyntheticlambda0, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Object) str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (isInvalidIndex) r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier, i, 15);
        }
    }
}
