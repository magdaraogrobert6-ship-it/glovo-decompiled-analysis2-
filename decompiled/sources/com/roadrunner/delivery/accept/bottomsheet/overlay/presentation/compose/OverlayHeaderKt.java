package com.roadrunner.delivery.accept.bottomsheet.overlay.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.accept.earnings.api.EarningsUiModel;
import com.roadrunner.delivery.accept.individualEarnings.api.presentation.IndividualEarningsUiModel;
import com.roadrunner.delivery.accept.newordertitle.api.NewOrderTitleUiModel;
import io.sentry.SentryUUID;
import kotlinx.coroutines.flow.StateFlow;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.accessgetCoarsecp;
import o.accessgetReusableRectp;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getIncludePadding;
import o.getLineVisibleEnd;
import o.getNewPassword;
import o.getPostalCode;
import o.getSharedTextAndroidCanvasannotations;
import o.onViewCreated;
import o.performMeasureDjhGOtQ;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OverlayHeaderKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    public static final void OverlayHeader(SignInDataStore signInDataStore, p0 p0Var, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1655625672);
        if ((i & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(signInDataStore)) {
                int i6 = read + 33;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(p0Var)) {
                i3 = 32;
            } else {
                int i8 = read + 9;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = getLineVisibleEnd.read;
                getpostalcode.write(objComponentActivity);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = getSharedTextAndroidCanvasannotations.IconCompatParcelizer;
                getpostalcode.write(objComponentActivity2);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = getIncludePadding.serializer;
                getpostalcode.write(objComponentActivity3);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity3;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write((StateFlow) signInDataStore.read, getpostalcode, 0);
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(SizeKt.write(modifier, 1.0f), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), RectangleShapeKt.getRectangleShape());
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!(!getpostalcode.ComponentActivity)) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                getpostalcode.serializer(-400651036);
                for (onViewCreated onviewcreated : (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) populateViewStructure_androidKtpopulate7Write.getValue()) {
                    if (onviewcreated instanceof EarningsUiModel) {
                        getpostalcode.serializer(-492847552);
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(onviewcreated, getpostalcode, 48);
                        getpostalcode.IconCompatParcelizer(false);
                    } else if (onviewcreated instanceof IndividualEarningsUiModel) {
                        getpostalcode.serializer(-492738370);
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.invoke(onviewcreated, getpostalcode, 48);
                        getpostalcode.IconCompatParcelizer(false);
                    } else if (!(onviewcreated instanceof NewOrderTitleUiModel)) {
                        getpostalcode.serializer(-492563716);
                        getpostalcode.IconCompatParcelizer(false);
                        int i10 = read + 33;
                        RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                    } else {
                        int i12 = read + 91;
                        RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                        if (i12 % 2 == 0) {
                            getpostalcode.serializer(-492632381);
                            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.invoke(onviewcreated, getpostalcode, 48);
                            z = true;
                        } else {
                            getpostalcode.serializer(-492632381);
                            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.invoke(onviewcreated, getpostalcode, 48);
                            z = false;
                        }
                        getpostalcode.IconCompatParcelizer(z);
                    }
                }
                getpostalcode.IconCompatParcelizer(false);
                if (!((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) populateViewStructure_androidKtpopulate7Write.getValue()).isEmpty()) {
                    getpostalcode.serializer(465116357);
                    accessgetCoarsecp.serializer(0.0f, 0, 7, 0L, getpostalcode, null);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(465157680);
                    getpostalcode.IconCompatParcelizer(false);
                }
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 19, modifier, (Object) signInDataStore, (Object) p0Var);
        }
    }
}
