package com.roadrunner.home.nest.onboarding.tutorial;

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
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.ColorModel;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.EditTextPreference;
import o.FlingCancellationException;
import o.ListPreferenceSavedState;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.NavControllerImplExternalSyntheticLambda0;
import o.StrokeJoinCompanion;
import o.TextFieldDefaults;
import o.buildMapping;
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
import o.makeFlag;
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
public abstract class StartTutorialContentKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void read(makeFlag makeflag, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        makeflag.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(234902584);
        if ((i & 6) == 0) {
            int i4 = IconCompatParcelizer + 59;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(makeflag);
                throw null;
            }
            i2 = (getpostalcode.IconCompatParcelizer(makeflag) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 147) != 146) {
            int i5 = serializer + 85;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            NavControllerImplExternalSyntheticLambda0 navControllerImplExternalSyntheticLambda0 = (NavControllerImplExternalSyntheticLambda0) ExtrasKt.write(makeflag.read, getpostalcode, 0).getValue();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{navControllerImplExternalSyntheticLambda0, EditTextPreference.write}, getCieXyz.write())).booleanValue()) {
                int i7 = serializer + 25;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                getpostalcode.serializer(-1891875684);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(navControllerImplExternalSyntheticLambda0 instanceof ListPreferenceSavedState)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1891878579, false);
                }
                getpostalcode.serializer(-1891874493);
                ListPreferenceSavedState listPreferenceSavedState = (ListPreferenceSavedState) navControllerImplExternalSyntheticLambda0;
                boolean z2 = (i2 & 112) == 32;
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(navControllerImplExternalSyntheticLambda0);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (!(!(zIconCompatParcelizer | z2)) || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 24, listPreferenceSavedState);
                    getpostalcode.write(objComponentActivity);
                }
                StartTutorialContent(listPreferenceSavedState, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifier, getpostalcode, i2 & 896);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 13, makeflag, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0045  */
    /* JADX WARN: Code duplicated, block: B:12:0x0051  */
    /* JADX WARN: Code duplicated, block: B:14:0x0057  */
    /* JADX WARN: Code duplicated, block: B:15:0x0062  */
    /* JADX WARN: Code duplicated, block: B:17:0x0065 A[PHI: r2 r4
  0x0065: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x0036, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r4v13 o.getAddressCountry) = (r4v2 o.getAddressCountry), (r4v14 o.getAddressCountry) binds: [B:8:0x0036, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0038 A[PHI: r2 r4
  0x0038: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x0036, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0038: PHI (r4v3 o.getAddressCountry) = (r4v2 o.getAddressCountry), (r4v14 o.getAddressCountry) binds: [B:8:0x0036, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void StartTutorialContent(ListPreferenceSavedState listPreferenceSavedState, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        int i2;
        boolean zIconCompatParcelizer;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = serializer + 25;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1051324536);
            getaddresscountry = getpostalcode.read;
            if ((i & 76) == 0) {
                i2 = IconCompatParcelizer;
                int i7 = i2 + 35;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if ((i & 8) == 0) {
                    int i9 = i2 + 5;
                    serializer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    zIconCompatParcelizer = getpostalcode.read(listPreferenceSavedState);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(listPreferenceSavedState);
                }
                if (zIconCompatParcelizer) {
                    int i11 = IconCompatParcelizer + 9;
                    serializer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        } else {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1051324536);
            getaddresscountry = getpostalcode.read;
            if ((i & 6) == 0) {
                i2 = IconCompatParcelizer;
                int i13 = i2 + 35;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                if ((i & 8) == 0) {
                    int i15 = i2 + 5;
                    serializer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    zIconCompatParcelizer = getpostalcode.read(listPreferenceSavedState);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(listPreferenceSavedState);
                }
                if (zIconCompatParcelizer) {
                    int i17 = IconCompatParcelizer + 9;
                    serializer = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        }
        if ((i & 48) == 0) {
            i4 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i19 = i4;
        if (getpostalcode.write(i19 & 1, (i19 & 147) != 146)) {
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
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode.ComponentActivity) {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    int i20 = IconCompatParcelizer + 107;
                    serializer = i20 % Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    getpostalcode.serializer(constructor);
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
                    int i22 = IconCompatParcelizer + 89;
                    serializer = i22 % Fields.SpotShadowColor;
                    int i23 = i22 % 2;
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
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                getPostalCode getpostalcode2 = getpostalcode;
                TextKt.m131TextNvy7gAk(listPreferenceSavedState.read, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatToken(), getpostalcode2, 0, 0, 131066);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, Dimensions.setSplitBackground)});
                TextKt.m131TextNvy7gAk(listPreferenceSavedState.IconCompatParcelizer, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, 0, 0, 131066);
                getpostalcode.IconCompatParcelizer(true);
                float f = Dimensions.setTabContainer;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion, f)});
                ColorModel.read((StrokeJoinCompanion) RememberLottieCompositionKt.IconCompatParcelizer(new getCmykxdoWZVw(R.raw.safety), getpostalcode).getValue(), SizeKt.m75height3ABfNKs(SizeKt.m86width3ABfNKs(companion, Dimensions.peekAvailableContext), Dimensions.removeOnConfigurationChangedListener), Integer.MAX_VALUE, false, null, null, getpostalcode, 1572864, 0, 0, 4194236);
                getpostalcode.IconCompatParcelizer(true);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, f)});
                PrimaryKt.write(listPreferenceSavedState.write.serializer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, SizeKt.write(companion, 1.0f), false, false, null, null, null, null, null, getpostalcode, (i19 & 112) | 384, 0, 2040);
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 14, listPreferenceSavedState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier);
        }
    }
}
