package com.roadrunner.home.nest.onboarding.booksession;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.CheckBoxPreference;
import o.ColorModel;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DropDownPreference;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.NavContext;
import o.StrokeJoinCompanion;
import o.TextFieldDefaults;
import o.buildMapping;
import o.findChildView;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCmykxdoWZVw;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.internalPathIteratorPeek;
import o.isValidParameter;
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
public abstract class BookSessionContentKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:14:0x0050 A[PHI: r2
  0x0050: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x003a, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x003c A[PHI: r2
  0x003c: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x003a, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void RemoteActionCompatParcelizer(findChildView findchildview, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = IconCompatParcelizer + 63;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            findchildview.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1637292898);
            if ((i & 31) == 0) {
                if (getpostalcode.IconCompatParcelizer(findchildview)) {
                    i2 = 4;
                } else {
                    int i7 = RemoteActionCompatParcelizer + 103;
                    IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            findchildview.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1637292898);
            if ((i & 6) == 0) {
                if (getpostalcode.IconCompatParcelizer(findchildview)) {
                    i2 = 4;
                } else {
                    int i9 = RemoteActionCompatParcelizer + 103;
                    IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            int i11 = IconCompatParcelizer + 77;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i13 = IconCompatParcelizer + 81;
                RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode.read(modifier) ^ true ? Fields.SpotShadowColor : Fields.RotationX;
        }
        if (getpostalcode.write(i3 & 1, (i3 & 147) != 146)) {
            int i15 = IconCompatParcelizer + 41;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            NavContext navContext = (NavContext) ExtrasKt.write(findchildview.write, getpostalcode, 0).getValue();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{navContext, DropDownPreference.serializer}, getCieXyz.write())).booleanValue()) {
                int i17 = RemoteActionCompatParcelizer + 63;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                getpostalcode.serializer(1480452294);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(navContext instanceof CheckBoxPreference)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1480449395, false);
                }
                getpostalcode.serializer(1480453419);
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) navContext;
                boolean z = (i3 & 112) == 32;
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(navContext);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if ((zIconCompatParcelizer | z) || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 23, checkBoxPreference);
                    getpostalcode.write(objComponentActivity);
                }
                BookSessionContent(checkBoxPreference, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifier, getpostalcode, i3 & 896);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 11, findchildview, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier);
        }
    }

    public static final void BookSessionContent(CheckBoxPreference checkBoxPreference, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(524333202);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            int i5 = RemoteActionCompatParcelizer + 37;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = ((i & 8) == 0 ? getpostalcode.read(checkBoxPreference) : getpostalcode.IconCompatParcelizer(checkBoxPreference) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i7 = IconCompatParcelizer + 3;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        int i9 = i2;
        if (getpostalcode.write(i9 & 1, (i9 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierThen = SizeKt.write(companion, 1.0f).then(modifier);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifier2 = PaddingKt.read(BackgroundKt.m20backgroundbw27NRU(modifierThen, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).serializer(), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.getSavedStateRegistryControllerannotations)), Dimensions.onLocalesChanged, Dimensions.onPostCreate, Dimensions.onNightModeChanged, Dimensions.onKeyDown);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i10 = IconCompatParcelizer + 47;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion2.getTop(), getpostalcode, 0);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            Modifier modifierThen2 = companion.then(new show(1.0f, true));
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor3);
                int i12 = IconCompatParcelizer + 117;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
            TextKt.m131TextNvy7gAk(checkBoxPreference.serializer, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatToken(), getpostalcode, 0, 0, 131066);
            Object[] objArr = {getpostalcode, SizeKt.m75height3ABfNKs(companion, Dimensions.setSplitBackground)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
            TextKt.m131TextNvy7gAk(checkBoxPreference.write, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131066);
            getpostalcode.IconCompatParcelizer(true);
            float f = Dimensions.setTabContainer;
            Object[] objArr2 = {getpostalcode, SizeKt.m86width3ABfNKs(companion, f)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr2);
            ColorModel.read((StrokeJoinCompanion) RememberLottieCompositionKt.IconCompatParcelizer(new getCmykxdoWZVw(R.raw.calendar_successful_booking), getpostalcode).getValue(), SizeKt.m75height3ABfNKs(SizeKt.m86width3ABfNKs(companion, Dimensions.peekAvailableContext), Dimensions.removeOnConfigurationChangedListener), Integer.MAX_VALUE, false, null, null, getpostalcode, 1572864, 0, 0, 4194236);
            getpostalcode.IconCompatParcelizer(true);
            Object[] objArr3 = {getpostalcode, SizeKt.m75height3ABfNKs(companion, f)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr3);
            isValidParameter.RemoteActionCompatParcelizer(checkBoxPreference.RemoteActionCompatParcelizer.serializer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, SizeKt.write(companion, 1.0f), false, false, null, null, null, null, getpostalcode, (i9 & 112) | 384, 1016);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 12, checkBoxPreference, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier);
        }
    }
}
