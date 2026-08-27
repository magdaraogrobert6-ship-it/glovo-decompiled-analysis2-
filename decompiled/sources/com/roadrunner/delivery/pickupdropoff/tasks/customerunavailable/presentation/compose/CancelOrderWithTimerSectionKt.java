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
import com.huawei.riemann.location.common.utils.Constant;
import com.incognia.internal.pcn;
import com.roadrunner.delivery.pickupdropoff.tasks.api.mapper.ButtonTypeTokenMapperKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.List;
import o.AndroidContentCaptureManagerCompanion;
import o.AnimateXAsStateClock;
import o.ComposeAnimationState;
import o.ContextCache;
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
import o.isEqualHuaweiReferrerAppGalleryDetails;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CancelOrderWithTimerSectionKt {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    public static final void CancelOrderWithTimerSection(ContextCache contextCache, getMaxDuration getmaxduration, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, boolean z, boolean z2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        contextCache.getClass();
        List list = contextCache.requiredSteps;
        boolean zBooleanValue = getmaxduration.isTimerFinished;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(375089112);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(contextCache) : getpostalcode.IconCompatParcelizer(contextCache) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? getpostalcode.read(getmaxduration) : getpostalcode.IconCompatParcelizer(getmaxduration) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(str)) {
                int i6 = read + 85;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i3 = Fields.RotationZ;
            } else {
                int i8 = read + 125;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = Fields.CameraDistance;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            int i10 = read + 37;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.Clip : 8192;
        }
        int i12 = i2 | 196608;
        if ((1572864 & i) == 0) {
            i12 |= getpostalcode.write(z) ? 1048576 : Fields.BlendMode;
        }
        Object obj = null;
        if ((12582912 & i) == 0) {
            int i13 = IconCompatParcelizer + 71;
            read = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                getpostalcode.write(z2);
                throw null;
            }
            i12 |= getpostalcode.write(z2) ? 8388608 : 4194304;
        }
        if (getpostalcode.write(i12 & 1, (4793491 & i12) != 4793490)) {
            Modifier.Companion companion = Modifier.Companion;
            boolean z3 = (29360128 & i12) == 8388608;
            boolean z4 = getpostalcode.read(list);
            boolean zWrite = getpostalcode.write(zBooleanValue);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z3 | z4 | zWrite) || objComponentActivity == getCreditCardExpirationMonth.write) {
                if (z2 && list != null) {
                    zBooleanValue = ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(list)).booleanValue();
                }
                objComponentActivity = Boolean.valueOf(zBooleanValue);
                getpostalcode.write(objComponentActivity);
            }
            boolean zBooleanValue2 = ((Boolean) objComponentActivity).booleanValue();
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer(Dimensions.setSplitBackground), Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i14 = read + 113;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z5 = getpostalcode.ComponentActivity;
                obj.hashCode();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            String str2 = contextCache.title;
            TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode, 0, 0, 131066);
            TextKt.m131TextNvy7gAk(contextCache.description, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131066);
            if (z2) {
                getpostalcode.serializer(-878698304);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-878779989);
                AnimateXAsStateClock.IconCompatParcelizer(str, null, z, getpostalcode, ((i12 >> 6) & 14) | ((i12 >> 12) & 896), 2);
                getpostalcode.IconCompatParcelizer(false);
            }
            ComposeAnimationState composeAnimationState = contextCache.button;
            if (composeAnimationState == null) {
                getpostalcode.serializer(-878656951);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-878656950);
                ButtonTypeTokenMapperKt.IconCompatParcelizer(composeAnimationState.type, composeAnimationState.actionTitle, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, SizeKt.write(companion, 1.0f), zBooleanValue2, false, null, getpostalcode, ((i12 >> 3) & 896) | 3072, Constant.ERROR_WSS_INVALID);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new isEqualHuaweiReferrerAppGalleryDetails(contextCache, getmaxduration, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, z, z2, i, 1);
        }
    }
}
