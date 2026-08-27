package com.roadrunner.settings.ui.screens;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.forms.RadioButtonKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import com.roadrunner.settings.subscreens.appearance.AppearanceViewModel;
import io.sentry.SentryUUID;
import java.util.WeakHashMap;
import kotlinx.coroutines.JobKt__JobKt$invokeOnCompletion$1;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.PopulateViewStructure_androidKtpopulate7;
import o.TooltipKt;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_release;
import o.getPostalCode;
import o.getQueryContext;
import o.p7;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaSMXleu3OAKzFKKf8k82rhwGl6hg;
import o.r8lambdaTq96bk0BBdzjoDKqhVDnbn_apY;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M;
import o.r8lambdarMv397hzZJazOE3eMmLe0m6ePY0;
import o.registerInAppMessageManagerlambda0;
import o.setRoundRectOutlineTNW_H78default;
import o.trigger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AppearanceScreenKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    public static final void AppearanceScreen(r8lambdaTq96bk0BBdzjoDKqhVDnbn_apY r8lambdatq96bk0bbdzjodkqhvdnbn_apy, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1398763992);
        getAddressCountry getaddresscountry = getpostalcode.read;
        int i4 = (i & 6) == 0 ? (getpostalcode.IconCompatParcelizer(r8lambdatq96bk0bbdzjodkqhvdnbn_apy) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
            int i5 = IconCompatParcelizer + 53;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        if ((i & 3072) == 0) {
            i4 |= !getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationZ : Fields.CameraDistance;
        }
        int i7 = i4;
        if (!(!getpostalcode.write(i7 & 1, (i7 & 1171) != 1170))) {
            Modifier modifierThen = modifier.then(SizeKt.read);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i8 = IconCompatParcelizer + 75;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            HeaderKt.serializer(null, r8lambdatq96bk0bbdzjodkqhvdnbn_apy.write, 0L, ExtrasKt.write(-846180470, new trigger(17, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), null, null, null, getpostalcode, 24576, 237);
            AnnotatedString annotatedString = r8lambdatq96bk0bbdzjodkqhvdnbn_apy.IconCompatParcelizer;
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            long presenter = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
            Modifier.Companion companion3 = Modifier.Companion;
            TextKt.m132TextZ58ophY(annotatedString, PaddingKt.write(companion3, Dimensions.setTabContainer), presenter, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, textStyleIconCompatParcelizer, getpostalcode, 0, 0, 262136);
            boolean z = true;
            boolean z2 = false;
            Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(companion3, PagerWrapperFlingBehavior.read(0, getpostalcode, 1), false, 14);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierIconCompatParcelizer);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            getpostalcode.serializer(-1749890259);
            for (r8lambdaSMXleu3OAKzFKKf8k82rhwGl6hg r8lambdasmxleu3oakzfkkf8k82rhwgl6hg : r8lambdatq96bk0bbdzjodkqhvdnbn_apy.RemoteActionCompatParcelizer) {
                Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(SizeKt.write(Modifier.Companion, 1.0f), Dimensions.setTabContainer, Dimensions.getAnimatedVisibility);
                boolean z3 = r8lambdatq96bk0bbdzjodkqhvdnbn_apy.serializer == r8lambdasmxleu3oakzfkkf8k82rhwgl6hg.write ? z : z2;
                String str = r8lambdasmxleu3oakzfkkf8k82rhwgl6hg.IconCompatParcelizer;
                boolean z4 = (i7 & 112) == 32 ? z : z2;
                boolean z5 = getpostalcode.read(r8lambdasmxleu3oakzfkkf8k82rhwgl6hg);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if ((z4 || z5) || objComponentActivity == getCreditCardExpirationMonth.write) {
                    i2 = 17;
                    objComponentActivity = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(r8lambdaunavo3sxub_pc9xroryotnrlvsm, i2, r8lambdasmxleu3oakzfkkf8k82rhwgl6hg);
                    getpostalcode.write(objComponentActivity);
                } else {
                    i2 = 17;
                }
                RadioButtonKt.RadioButton(str, z3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifierRemoteActionCompatParcelizer, null, false, false, getpostalcode, 0, 112);
                z = true;
                z2 = false;
            }
            boolean z6 = z;
            af$$ExternalSyntheticOutline0.m(getpostalcode, z2, z6, z6);
            int i10 = IconCompatParcelizer + 57;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7(i, 22, r8lambdatq96bk0bbdzjodkqhvdnbn_apy, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }

    public static final void AppearanceScreen(AppearanceViewModel appearanceViewModel, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(944168985);
        if ((i & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(appearanceViewModel)) {
                int i5 = read + 95;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true ? 16 : 32;
        }
        int i7 = i2;
        if (getpostalcode.write(i7 & 1, (i7 & 19) != 18)) {
            int i8 = IconCompatParcelizer + 63;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(appearanceViewModel.read, getpostalcode, 0);
            Modifier.Companion companion = Modifier.Companion;
            WeakHashMap weakHashMap = TooltipKt.serializer;
            Modifier modifierIconCompatParcelizer = PaddingKt.IconCompatParcelizer(companion, OffsetKt.read(setRoundRectOutlineTNW_H78default.read(getpostalcode).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, getpostalcode));
            r8lambdaTq96bk0BBdzjoDKqhVDnbn_apY r8lambdatq96bk0bbdzjodkqhvdnbn_apy = (r8lambdaTq96bk0BBdzjoDKqhVDnbn_apY) populateViewStructure_androidKtpopulate7Write.getValue();
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(appearanceViewModel);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$1 = new SettingsScreenKt$SettingsScreen$2$1(0, appearanceViewModel, AppearanceViewModel.class, "onClose", "onClose()V", 0, 20);
                getpostalcode.write(settingsScreenKt$SettingsScreen$2$1);
                objComponentActivity = settingsScreenKt$SettingsScreen$2$1;
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity;
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(appearanceViewModel);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2 || objComponentActivity2 == androidContentCaptureManager) {
                JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$1 = new JobKt__JobKt$invokeOnCompletion$1(1, appearanceViewModel, AppearanceViewModel.class, "onModeSelected", "onModeSelected(Lcom/roadrunner/designsystem/mode/api/DesignSystemMode;)V", 0, 4);
                getpostalcode.write(jobKt__JobKt$invokeOnCompletion$1);
                objComponentActivity2 = jobKt__JobKt$invokeOnCompletion$1;
            }
            AppearanceScreen(r8lambdatq96bk0bbdzjodkqhvdnbn_apy, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity2), modifierIconCompatParcelizer, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0, getpostalcode, 0);
            getQueryContext getquerycontext = appearanceViewModel.serializer;
            if ((i7 & 112) == 32) {
                int i10 = IconCompatParcelizer + 61;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                z = true;
            } else {
                int i12 = IconCompatParcelizer + 53;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                z = false;
            }
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (z || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M(0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity3);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode, 8);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdarMv397hzZJazOE3eMmLe0m6ePY0(i, 11, appearanceViewModel, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }
}
