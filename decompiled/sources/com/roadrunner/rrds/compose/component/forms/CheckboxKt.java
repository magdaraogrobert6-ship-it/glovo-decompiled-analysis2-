package com.roadrunner.rrds.compose.component.forms;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CheckboxDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.tokens.CheckboxTokens;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.TextStyle;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.SessionMutexwithSessionCancellingPrevious2;
import o.SubList;
import o.TextFieldDefaults;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getChildren;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_release;
import o.getPostalCode;
import o.getViewingDistancetKroMQ;
import o.getWindowPosturem18o9QQ;
import o.handleUrlOverridelambda1;
import o.parseResponse;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CheckboxKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: Code duplicated, block: B:135:0x0351  */
    /* JADX INFO: renamed from: CheckboxBig-PIknLig, reason: not valid java name */
    public static final void m5038CheckboxBigPIknLig(String str, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, boolean z2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z3;
        long j;
        long j2;
        long j3;
        long jRemoveOnNewIntentListener;
        long jOnWindowStartingSupportActionMode;
        ToggleableState toggleableState;
        ToggleableState toggleableState2;
        int i3;
        int i4 = 2 % 2;
        str.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-562468448);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.write(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.read(modifier)) {
                int i5 = IconCompatParcelizer + 13;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        int i7 = i2 | 1794048;
        if (getpostalcode.write(i7 & 1, (599187 & i7) != 599186)) {
            float f = CheckboxDefaults.write;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long jRemoveOnMultiWindowModeChangedListener = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).removeOnMultiWindowModeChangedListener();
            Color.Companion companion = Color.Companion;
            long jM757getTransparent0d7_KjU = companion.m757getTransparent0d7_KjU();
            long jM759getWhite0d7_KjU = companion.m759getWhite0d7_KjU();
            long jM757getTransparent0d7_KjU2 = companion.m757getTransparent0d7_KjU();
            long jM757getTransparent0d7_KjU3 = companion.m757getTransparent0d7_KjU();
            long jM757getTransparent0d7_KjU4 = companion.m757getTransparent0d7_KjU();
            getViewingDistancetKroMQ getviewingdistancetkromq = (getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer);
            SessionMutexwithSessionCancellingPrevious2 sessionMutexwithSessionCancellingPrevious2 = getviewingdistancetkromq.read;
            if (sessionMutexwithSessionCancellingPrevious2 == null) {
                long jSerializer = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, CheckboxTokens.read);
                Color.Companion companion2 = Color.Companion;
                long jM757getTransparent0d7_KjU5 = companion2.m757getTransparent0d7_KjU();
                getChildren getchildren = CheckboxTokens.IconCompatParcelizer;
                long jSerializer2 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren);
                long jM757getTransparent0d7_KjU6 = companion2.m757getTransparent0d7_KjU();
                getChildren getchildren2 = CheckboxTokens.write;
                sessionMutexwithSessionCancellingPrevious2 = new SessionMutexwithSessionCancellingPrevious2(jSerializer, jM757getTransparent0d7_KjU5, jSerializer2, jM757getTransparent0d7_KjU6, Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren2), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), companion2.m757getTransparent0d7_KjU(), Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren2), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren), getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, CheckboxTokens.MediaSessionCompatQueueItem), Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren2), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, CheckboxTokens.serializer), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren2), 0.38f, 0.0f, 0.0f, 0.0f, 14, null));
                getviewingdistancetkromq.read = sessionMutexwithSessionCancellingPrevious2;
            }
            long jM757getTransparent0d7_KjU7 = companion.m757getTransparent0d7_KjU();
            long jM757getTransparent0d7_KjU8 = companion.m757getTransparent0d7_KjU();
            long jM757getTransparent0d7_KjU9 = companion.m757getTransparent0d7_KjU();
            long j4 = jM759getWhite0d7_KjU != 16 ? jM759getWhite0d7_KjU : sessionMutexwithSessionCancellingPrevious2.IconCompatParcelizer;
            if (jM757getTransparent0d7_KjU7 == 16) {
                jM757getTransparent0d7_KjU7 = sessionMutexwithSessionCancellingPrevious2.MediaSessionCompatResultReceiverWrapper;
            }
            long j5 = jM757getTransparent0d7_KjU7;
            long j6 = jRemoveOnMultiWindowModeChangedListener != 16 ? jRemoveOnMultiWindowModeChangedListener : sessionMutexwithSessionCancellingPrevious2.read;
            long j7 = jM757getTransparent0d7_KjU8 != 16 ? jM757getTransparent0d7_KjU8 : sessionMutexwithSessionCancellingPrevious2.PlaybackStateCompatCustomAction;
            if (jM757getTransparent0d7_KjU2 != 16) {
                int i8 = RemoteActionCompatParcelizer + 17;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    int i9 = 62 / 0;
                }
                j = jM757getTransparent0d7_KjU2;
            } else {
                j = sessionMutexwithSessionCancellingPrevious2.write;
            }
            long j8 = jM757getTransparent0d7_KjU9 != 16 ? jM757getTransparent0d7_KjU9 : sessionMutexwithSessionCancellingPrevious2.MediaBrowserCompatMediaItem;
            if (jM757getTransparent0d7_KjU4 != 16) {
                int i10 = IconCompatParcelizer + 7;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                j2 = jM757getTransparent0d7_KjU4;
            } else {
                j2 = sessionMutexwithSessionCancellingPrevious2.RatingCompat;
            }
            long j9 = jRemoveOnMultiWindowModeChangedListener != 16 ? jRemoveOnMultiWindowModeChangedListener : sessionMutexwithSessionCancellingPrevious2.serializer;
            if (jM757getTransparent0d7_KjU != 16) {
                int i12 = RemoteActionCompatParcelizer + 3;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                j3 = jM757getTransparent0d7_KjU;
            } else {
                j3 = sessionMutexwithSessionCancellingPrevious2.MediaDescriptionCompat;
            }
            SessionMutexwithSessionCancellingPrevious2 sessionMutexwithSessionCancellingPrevious3 = new SessionMutexwithSessionCancellingPrevious2(j4, j5, j6, j7, j, j8, j2, j9, j3, jM757getTransparent0d7_KjU2 != 16 ? jM757getTransparent0d7_KjU2 : sessionMutexwithSessionCancellingPrevious2.RemoteActionCompatParcelizer, jM757getTransparent0d7_KjU3 != 16 ? jM757getTransparent0d7_KjU3 : sessionMutexwithSessionCancellingPrevious2.MediaMetadataCompat, jM757getTransparent0d7_KjU4 != 16 ? jM757getTransparent0d7_KjU4 : sessionMutexwithSessionCancellingPrevious2.MediaSessionCompatQueueItem);
            if (z) {
                int i14 = RemoteActionCompatParcelizer + 103;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                getpostalcode = getpostalcode;
                getpostalcode.serializer(-1828871616);
                getpostalcode.serializer(633742420);
                jRemoveOnNewIntentListener = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).removeOnMultiWindowModeChangedListener();
                getpostalcode.IconCompatParcelizer(false);
                jOnWindowStartingSupportActionMode = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).onSupportContentChanged();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode = getpostalcode;
                getpostalcode.serializer(-1828602133);
                jRemoveOnNewIntentListener = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).removeOnNewIntentListener();
                jOnWindowStartingSupportActionMode = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).onWindowStartingSupportActionMode();
                getpostalcode.IconCompatParcelizer(false);
            }
            long j10 = jRemoveOnNewIntentListener;
            long j11 = jOnWindowStartingSupportActionMode;
            float f2 = Dimensions.MediaDescriptionCompat;
            float f3 = Dimensions._init_lambda4;
            if (z) {
                int i16 = RemoteActionCompatParcelizer + 13;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                toggleableState = ToggleableState.On;
            } else {
                toggleableState = ToggleableState.Off;
            }
            Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(!z ? BorderKt.write(Modifier.Companion, f2, j10, RoundedCornerShapeKt.IconCompatParcelizer(f3)) : BackgroundKt.m20backgroundbw27NRU(Modifier.Companion, j10, RoundedCornerShapeKt.IconCompatParcelizer(f3)), Dimensions.onPreparePanel);
            Alignment.Companion companion3 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            boolean z4 = (458752 & i7) == 131072;
            int i18 = i7 & 896;
            boolean z5 = i18 == 256;
            boolean z6 = (i7 & 112) == 32;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((z6 | z4 | z5) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new SubList(2, z, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                getpostalcode.write(objComponentActivity);
            }
            Modifier modifierRemoteActionCompatParcelizer = ClickableKt.RemoteActionCompatParcelizer(modifier, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, 15);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, centerVertically, getpostalcode, 48);
            ToggleableState toggleableState3 = toggleableState;
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion4.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion4, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            MeasurePolicy measurePolicy = BoxKt.read(companion3.getTopStart(), false);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM83size3ABfNKs);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion4.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion4, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            boolean z7 = getpostalcode.read(toggleableState3.ordinal());
            boolean z8 = i18 == 256;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (!z7 && !z8) {
                int i19 = RemoteActionCompatParcelizer + 67;
                IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                if (objComponentActivity2 == androidContentCaptureManager) {
                    toggleableState2 = toggleableState3;
                    objComponentActivity2 = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(toggleableState2, 8, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                    getpostalcode.write(objComponentActivity2);
                } else {
                    toggleableState2 = toggleableState3;
                }
            } else {
                toggleableState2 = toggleableState3;
                objComponentActivity2 = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(toggleableState2, 8, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                getpostalcode.write(objComponentActivity2);
            }
            androidx.compose.material3.CheckboxKt.IconCompatParcelizer(toggleableState2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, null, sessionMutexwithSessionCancellingPrevious3, getpostalcode, (i7 >> 6) & 7168);
            getpostalcode.IconCompatParcelizer(true);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(Modifier.Companion, Dimensions.setMenu)});
            TextKt.m131TextNvy7gAk(str, null, j11, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, i7 & 14, 0, 131066);
            getpostalcode.IconCompatParcelizer(true);
            z3 = true;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            z3 = z2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new parseResponse(str, z, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, z3, i);
        }
    }
}
