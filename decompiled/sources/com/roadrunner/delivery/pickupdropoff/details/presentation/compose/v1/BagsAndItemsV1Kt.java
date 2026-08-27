package com.roadrunner.delivery.pickupdropoff.details.presentation.compose.v1;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidFontTypefaceLoader;
import o.CircularProgressIndicatorTokens;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.TextFieldDefaults;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.show;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BagsAndItemsV1Kt {
    private static int read = 1;
    private static int serializer;

    public static final void BagsAndItemsV1(r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0 r8lambdamtsd8x0f0xutzn3oeie_s8mt0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        boolean z;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8;
        boolean z2;
        int i3 = 2 % 2;
        r8lambdamtsd8x0f0xutzn3oeie_s8mt0.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1432257106);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode2.read(r8lambdamtsd8x0f0xutzn3oeie_s8mt0) : getpostalcode2.IconCompatParcelizer(r8lambdamtsd8x0f0xutzn3oeie_s8mt0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (getpostalcode2.write(i4 & 1, (i4 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion;
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            Object obj = null;
            if (objComponentActivity == androidContentCaptureManager) {
                int i5 = read + 91;
                serializer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    getpostalcode2.write(CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE));
                    obj.hashCode();
                    throw null;
                }
                objComponentActivity = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode2.write(objComponentActivity);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate9 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i6 = serializer + 15;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion2.getCenterVertically(), getpostalcode2, 48);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor2);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            String str = r8lambdamtsd8x0f0xutzn3oeie_s8mt0.serializer;
            if (str == null) {
                int i8 = serializer + 55;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                getpostalcode2.serializer(-86031570);
                getpostalcode2.IconCompatParcelizer(false);
                z = false;
                getpostalcode = getpostalcode2;
            } else {
                getpostalcode2.serializer(-86031569);
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, 0, 0, 131066);
                getpostalcode = getpostalcode2;
                z = false;
                getpostalcode.IconCompatParcelizer(false);
            }
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, companion.then(new show(1.0f, true))});
            String str2 = r8lambdamtsd8x0f0xutzn3oeie_s8mt0.IconCompatParcelizer;
            if (str2 == null) {
                getpostalcode.serializer(-85748137);
                getpostalcode.IconCompatParcelizer(z);
                populateViewStructure_androidKtpopulate8 = populateViewStructure_androidKtpopulate9;
                z2 = true;
            } else {
                getpostalcode.serializer(-85748136);
                int i10 = ((Boolean) populateViewStructure_androidKtpopulate9.getValue()).booleanValue() ? R.drawable.ic_bold_medium_arrow_up : R.drawable.ic_bold_medium_arrow_down;
                Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion, Dimensions.setActionBarVisibilityCallback, 0.0f, 0.0f, 0.0f, 14);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (objComponentActivity2 == androidContentCaptureManager) {
                    populateViewStructure_androidKtpopulate7 = populateViewStructure_androidKtpopulate9;
                    objComponentActivity2 = new CircularProgressIndicatorTokens(populateViewStructure_androidKtpopulate7, 9);
                    getpostalcode.write(objComponentActivity2);
                } else {
                    populateViewStructure_androidKtpopulate7 = populateViewStructure_androidKtpopulate9;
                }
                populateViewStructure_androidKtpopulate8 = populateViewStructure_androidKtpopulate7;
                TertiaryKt.IconCompatParcelizer(str2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, modifierM74paddingqDBjuR0$default, false, i10, null, null, null, getpostalcode, 48, 232);
                getpostalcode.IconCompatParcelizer(z);
                z2 = true;
            }
            getpostalcode.IconCompatParcelizer(z2);
            BagsAndItemsDetailKt.RemoteActionCompatParcelizer(((Boolean) populateViewStructure_androidKtpopulate8.getValue()).booleanValue(), r8lambdamtsd8x0f0xutzn3oeie_s8mt0, getpostalcode, (i4 << 3) & 112);
            getpostalcode.IconCompatParcelizer(z2);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 19, r8lambdamtsd8x0f0xutzn3oeie_s8mt0, modifier2);
        }
    }
}
