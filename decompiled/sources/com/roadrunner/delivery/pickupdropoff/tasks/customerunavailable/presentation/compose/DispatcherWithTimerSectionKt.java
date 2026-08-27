package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
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
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.List;
import o.AndroidContentCaptureManagerCompanion;
import o.AnimateXAsStateClock;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getMaxDuration;
import o.getNewPassword;
import o.getPostalCode;
import o.getStable;
import o.isEqualHuaweiReferrerAppGalleryDetails;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DispatcherWithTimerSectionKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    public static final void DispatcherWithTimerSection(getStable getstable, getMaxDuration getmaxduration, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, boolean z, boolean z2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        Modifier.Companion companion;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        getstable.getClass();
        List list = getstable.requiredSteps;
        boolean zBooleanValue = getmaxduration.isTimerFinished;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1473324437);
        if ((i & 6) == 0) {
            int i9 = serializer + 91;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if ((i & 8) == 0 ? getpostalcode2.read(getstable) : getpostalcode2.IconCompatParcelizer(getstable)) {
                int i11 = RemoteActionCompatParcelizer + 89;
                serializer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0 ? getpostalcode2.read(getmaxduration) : getpostalcode2.IconCompatParcelizer(getmaxduration)) {
                int i13 = RemoteActionCompatParcelizer + 65;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            int i15 = serializer + 35;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            if (getpostalcode2.read(str)) {
                int i17 = serializer + 121;
                RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                i5 = i17 % 2 == 0 ? 17797 : Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            int i18 = RemoteActionCompatParcelizer + 97;
            serializer = i18 % Fields.SpotShadowColor;
            if (i18 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                throw null;
            }
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i19 = serializer + 45;
                RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                i4 = Fields.Clip;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        int i21 = i2 | 196608;
        if ((1572864 & i) == 0) {
            int i22 = RemoteActionCompatParcelizer + 93;
            serializer = i22 % Fields.SpotShadowColor;
            int i23 = i22 % 2;
            i21 |= getpostalcode2.write(z) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            if (getpostalcode2.write(z2)) {
                int i24 = RemoteActionCompatParcelizer + 79;
                serializer = i24 % Fields.SpotShadowColor;
                int i25 = i24 % 2;
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i21 |= i3;
        }
        int i26 = i21;
        if (!(!getpostalcode2.write(i26 & 1, (i26 & 4793491) != 4793490))) {
            Modifier.Companion companion2 = Modifier.Companion;
            boolean z3 = (i26 & 29360128) == 8388608;
            boolean z4 = getpostalcode2.read(list);
            boolean zWrite = getpostalcode2.write(zBooleanValue);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if ((z3 | z4 | zWrite) || objComponentActivity == getCreditCardExpirationMonth.write) {
                if (z2) {
                    int i27 = serializer + 33;
                    RemoteActionCompatParcelizer = i27 % Fields.SpotShadowColor;
                    int i28 = i27 % 2;
                    if (list != null) {
                        zBooleanValue = ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(list)).booleanValue();
                    }
                }
                objComponentActivity = Boolean.valueOf(zBooleanValue);
                getpostalcode2.write(objComponentActivity);
            }
            boolean zBooleanValue2 = ((Boolean) objComponentActivity).booleanValue();
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer(Dimensions.setSplitBackground), Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            String str2 = getstable.title;
            TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode2, 0, 0, 131066);
            TextKt.m131TextNvy7gAk(getstable.description, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, 0, 0, 131066);
            if (!z2) {
                getpostalcode2.serializer(1864965452);
                companion = companion2;
                AnimateXAsStateClock.IconCompatParcelizer(str, null, z, getpostalcode2, ((i26 >> 6) & 14) | ((i26 >> 12) & 896), 2);
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                companion = companion2;
                getpostalcode2.serializer(1865047137);
                getpostalcode2.IconCompatParcelizer(false);
            }
            PrimaryKt.write(getstable.dispatcherChatButtonTitle, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, SizeKt.write(companion, 1.0f), zBooleanValue2, false, Integer.valueOf(R.drawable.ic_bold_large_help_customer_support), null, null, null, null, getpostalcode2, ((i26 >> 6) & 112) | 384, 0, 2000);
            getpostalcode = getpostalcode2;
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new isEqualHuaweiReferrerAppGalleryDetails(getstable, getmaxduration, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, z, z2, i, 3);
        }
    }
}
