package com.roadrunner.login.presentation.welcome;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.login.presentation.otp.OtpNavigationKt$$ExternalSyntheticLambda4;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.forms.DropdownKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.ColorModel;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetDialogWrapper;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.RadioButton;
import o.StrokeJoinCompanion;
import o.buildMapping;
import o.d9;
import o.da;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCmykxdoWZVw;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getLayers;
import o.getNewPassword;
import o.getPostalCode;
import o.internalPathIteratorPeek;
import o.isValidParameter;
import o.launchAttributionResponseTasks;
import o.launchEventResponseTasks;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WelcomeContentKt {
    public static final long IconCompatParcelizer = ColorKt.Color(4294243577L);
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        int i = write + 67;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static final void RemoteActionCompatParcelizer(Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1077659711);
        if ((i & 6) == 0) {
            if (!(!getpostalcode.read(modifier))) {
                int i5 = serializer + 87;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i7 = serializer + 125;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            ColorModel.read((StrokeJoinCompanion) RememberLottieCompositionKt.IconCompatParcelizer(new getCmykxdoWZVw(R.raw.cycling_full_width_login_page), getpostalcode).getValue(), SizeKt.write(modifier, 1.0f), Integer.MAX_VALUE, true, null, null, getpostalcode, 1572864, 3072, 0, 4186044);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier, i, 21);
        }
    }

    public static final void WelcomeContent(da daVar, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        daVar.getClass();
        launchEventResponseTasks launcheventresponsetasks = daVar.serializer;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1979999962);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            if (!getpostalcode2.IconCompatParcelizer(daVar)) {
                i5 = 2;
            } else {
                int i7 = serializer + 53;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode2.read(modifier)) {
                i4 = Fields.RotationX;
            } else {
                int i9 = read + 57;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        int i11 = i2;
        if (getpostalcode2.write(i11 & 1, (i11 & 147) != 146)) {
            FillElement fillElement = SizeKt.read;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifier.then(fillElement), IconCompatParcelizer, RectangleShapeKt.getRectangleShape());
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion.getBottomCenter(), false);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier modifierThen = companion3.then(fillElement);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.write, companion.getStart(), getpostalcode2, 6);
                int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor2);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
                RemoteActionCompatParcelizer(ModalBottomSheetDialogWrapper.IconCompatParcelizer(SizeKt.serializer((Modifier) companion3, companion.getBottom(), true), 1.0f), getpostalcode2, 0);
                Modifier modifierWrite = SizeKt.write(companion3, 1.0f);
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                Modifier modifierM20backgroundbw27NRU2 = BackgroundKt.m20backgroundbw27NRU(modifierWrite, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape());
                float f = Dimensions.setTabContainer;
                Modifier modifier2 = PaddingKt.read(modifierM20backgroundbw27NRU2, f, f, f, f);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion.getStart(), getpostalcode2, 0);
                int iHashCode3 = Long.hashCode(getpostalcode2.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode2.serializer();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode2, modifier2);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion2.getConstructor();
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    int i12 = read + 113;
                    serializer = i12 % Fields.SpotShadowColor;
                    if (i12 % 2 != 0) {
                        getpostalcode2.serializer(constructor3);
                    } else {
                        getpostalcode2.serializer(constructor3);
                        throw null;
                    }
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode3), getpostalcode2));
                TextKt.m132TextZ58ophY(daVar.MediaSessionCompatQueueItem, SizeKt.write(companion3, 1.0f), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).WindowCallbackWrapper(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode2, 48, 0, 262136);
                DropdownKt.read(daVar.MediaBrowserCompatMediaItem, daVar.IconCompatParcelizer, PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion3, 1.0f), 0.0f, f, 0.0f, 0.0f, 13), false, 0, null, getpostalcode2, 0, 120);
                PrimaryKt.write(StringResources_androidKt.stringResource(daVar.RemoteActionCompatParcelizer, getpostalcode2, 0), daVar.write, PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion3, 1.0f), 0.0f, Dimensions.setVisibility, 0.0f, 0.0f, 13), false, false, null, null, null, null, null, getpostalcode2, 0, 0, 2040);
                if (launcheventresponsetasks instanceof launchAttributionResponseTasks) {
                    getpostalcode2.serializer(990596168);
                    Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion3, 1.0f), 0.0f, f, 0.0f, 0.0f, 13);
                    String str = ((launchAttributionResponseTasks) launcheventresponsetasks).serializer;
                    boolean z = (i11 & 112) == 32;
                    boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(daVar);
                    Object objComponentActivity = getpostalcode2.ComponentActivity();
                    if ((zIconCompatParcelizer | z) || objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new OtpNavigationKt$$ExternalSyntheticLambda4(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 5, daVar);
                        getpostalcode2.write(objComponentActivity);
                    }
                    getpostalcode = getpostalcode2;
                    isValidParameter.RemoteActionCompatParcelizer(str, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifierM74paddingqDBjuR0$default, false, false, null, null, null, null, getpostalcode2, 0, 1016);
                    i3 = 0;
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode = getpostalcode2;
                    i3 = 0;
                    getpostalcode.serializer(990984846);
                    getpostalcode.IconCompatParcelizer(false);
                }
                d9.read(i3, getpostalcode, PaddingKt.m74paddingqDBjuR0$default(companion3.then(new RadioButton(companion.getCenterHorizontally())), 0.0f, Dimensions.getAnimatedVisibility, 0.0f, 0.0f, 13), daVar.RatingCompat);
                af$$ExternalSyntheticOutline0.m(getpostalcode, true, true, true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 26, daVar, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier);
        }
    }
}
