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
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.forms.RadioButtonKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import java.util.Map;
import java.util.WeakHashMap;
import kotlinx.coroutines.JobKt__JobKt$invokeOnCompletion$1;
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
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_release;
import o.getPostalCode;
import o.p7;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaTgPsXaTTZ8gJI5Nphc8TulxhY9I;
import o.r8lambdaTzEg3OyXzs_g1yz9Ru89UTPm8;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdarMv397hzZJazOE3eMmLe0m6ePY0;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.setRoundRectOutlineTNW_H78default;
import o.trigger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ChatLanguageSelectorScreenKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    public static final void ChatLanguageSelectorScreen(r8lambdaTgPsXaTTZ8gJI5Nphc8TulxhY9I r8lambdatgpsxattz8gji5nphc8tulxhy9i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-286487363);
        getAddressCountry getaddresscountry = getpostalcode.read;
        int i5 = (i & 6) == 0 ? (getpostalcode.IconCompatParcelizer(r8lambdatgpsxattz8gji5nphc8tulxhy9i) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i6 = read + 61;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i5 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i8 = read + 73;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                i3 = i8 % 2 != 0 ? 14149 : Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i5 |= i3;
        }
        int i9 = i5;
        if ((i9 & 1171) != 1170) {
            int i10 = RemoteActionCompatParcelizer + 53;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i9 & 1, z)) {
            int i12 = RemoteActionCompatParcelizer + 113;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
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
                int i14 = read + 23;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            HeaderKt.serializer(null, StringResources_androidKt.stringResource(R.string.settings_chat_language_title, getpostalcode, 0), 0L, ExtrasKt.write(-2085538145, new trigger(18, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), null, null, null, getpostalcode, 24576, 237);
            String strStringResource = StringResources_androidKt.stringResource(R.string.settings_select_language_title, getpostalcode, 0);
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            long presenter = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
            Modifier.Companion companion3 = Modifier.Companion;
            TextKt.m131TextNvy7gAk(strStringResource, PaddingKt.write(companion3, Dimensions.setTabContainer), presenter, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleIconCompatParcelizer, getpostalcode, 0, 0, 131064);
            boolean z3 = false;
            boolean z4 = true;
            Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(companion3, PagerWrapperFlingBehavior.read(0, getpostalcode, 1), false, 14);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierIconCompatParcelizer);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
                int i16 = read + 83;
                RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            getpostalcode.serializer(1990033133);
            for (Map.Entry entry : r8lambdatgpsxattz8gji5nphc8tulxhy9i.RemoteActionCompatParcelizer.entrySet()) {
                int i18 = RemoteActionCompatParcelizer + 85;
                read = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(SizeKt.write(Modifier.Companion, 1.0f), Dimensions.setTabContainer, Dimensions.getAnimatedVisibility);
                boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambdatgpsxattz8gji5nphc8tulxhy9i.write, entry.getKey()}, getCieXyz.write())).booleanValue();
                String str = (String) entry.getValue();
                if ((i9 & 112) == 32) {
                    int i20 = RemoteActionCompatParcelizer + 57;
                    read = i20 % Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    z2 = z4;
                } else {
                    z2 = z3;
                }
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(entry);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if ((z2 || zIconCompatParcelizer) || objComponentActivity == getCreditCardExpirationMonth.write) {
                    i2 = 18;
                    objComponentActivity = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(r8lambdaunavo3sxub_pc9xroryotnrlvsm, i2, entry);
                    getpostalcode.write(objComponentActivity);
                } else {
                    i2 = 18;
                }
                RadioButtonKt.RadioButton(str, zBooleanValue, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifierRemoteActionCompatParcelizer, null, false, false, getpostalcode, 0, 112);
                z3 = false;
                z4 = true;
            }
            boolean z5 = z4;
            af$$ExternalSyntheticOutline0.m(getpostalcode, z3, z5, z5);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7(i, 23, r8lambdatgpsxattz8gji5nphc8tulxhy9i, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d A[PHI: r1
  0x004d: PHI (r1v34 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v36 o.getPostalCode) binds: [B:8:0x0032, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:9:0x0034 A[PHI: r1
  0x0034: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v36 o.getPostalCode) binds: [B:8:0x0032, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void ChatLanguageSelectorScreen(r8lambdaTzEg3OyXzs_g1yz9Ru89UTPm8 r8lambdatzeg3oyxzs_g1yz9ru89utpm8, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        int i4;
        boolean z;
        int i5 = 2 % 2;
        int i6 = read + 39;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(250930606);
            if ((i & 20) == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdatzeg3oyxzs_g1yz9ru89utpm8)) {
                    i4 = RemoteActionCompatParcelizer + 11;
                    read = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        i2 = 5;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        } else {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(250930606);
            if ((i & 6) == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdatzeg3oyxzs_g1yz9ru89utpm8)) {
                    i4 = RemoteActionCompatParcelizer + 11;
                    read = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        i2 = 5;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        int i7 = i3;
        if ((i7 & 19) != 18) {
            int i8 = RemoteActionCompatParcelizer + 47;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i7 & 1, z)) {
            int i10 = RemoteActionCompatParcelizer + 71;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(r8lambdatzeg3oyxzs_g1yz9ru89utpm8.RatingCompat, getpostalcode2, 0);
            Modifier.Companion companion = Modifier.Companion;
            WeakHashMap weakHashMap = TooltipKt.serializer;
            Modifier modifierIconCompatParcelizer = PaddingKt.IconCompatParcelizer(companion, OffsetKt.read(setRoundRectOutlineTNW_H78default.read(getpostalcode2).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, getpostalcode2));
            r8lambdaTgPsXaTTZ8gJI5Nphc8TulxhY9I r8lambdatgpsxattz8gji5nphc8tulxhy9i = (r8lambdaTgPsXaTTZ8gJI5Nphc8TulxhY9I) populateViewStructure_androidKtpopulate7Write.getValue();
            boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(r8lambdatzeg3oyxzs_g1yz9ru89utpm8);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer) {
                JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$1 = new JobKt__JobKt$invokeOnCompletion$1(1, r8lambdatzeg3oyxzs_g1yz9ru89utpm8, r8lambdaTzEg3OyXzs_g1yz9Ru89UTPm8.class, "onLanguageSelected", "onLanguageSelected(Ljava/lang/String;)V", 0, 5);
                getpostalcode2.write(jobKt__JobKt$invokeOnCompletion$1);
                objComponentActivity = jobKt__JobKt$invokeOnCompletion$1;
            } else {
                int i12 = RemoteActionCompatParcelizer + 3;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$2 = new JobKt__JobKt$invokeOnCompletion$1(1, r8lambdatzeg3oyxzs_g1yz9ru89utpm8, r8lambdaTzEg3OyXzs_g1yz9Ru89UTPm8.class, "onLanguageSelected", "onLanguageSelected(Ljava/lang/String;)V", 0, 5);
                    getpostalcode2.write(jobKt__JobKt$invokeOnCompletion$2);
                    objComponentActivity = jobKt__JobKt$invokeOnCompletion$2;
                }
            }
            ChatLanguageSelectorScreen(r8lambdatgpsxattz8gji5nphc8tulxhy9i, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity), modifierIconCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode2, (i7 << 6) & 7168);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdarMv397hzZJazOE3eMmLe0m6ePY0(i, 12, r8lambdatzeg3oyxzs_g1yz9ru89utpm8, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }
}
