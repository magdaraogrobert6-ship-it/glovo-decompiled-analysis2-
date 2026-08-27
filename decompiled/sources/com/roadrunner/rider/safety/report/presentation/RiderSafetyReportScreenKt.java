package com.roadrunner.rider.safety.report.presentation;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.login.presentation.otp.OtpNavigationKt$$ExternalSyntheticLambda4;
import com.roadrunner.rrds.compose.component.message.BannerMessageKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import java.util.Iterator;
import o.AndroidContentCaptureManagerCompanion;
import o.DefaultLazyKey;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.buildMapping;
import o.computeHorizontalScrollExtent;
import o.dc;
import o.disableAppSetIdReading;
import o.enableBridgeSecurity;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getDefaultTracker;
import o.getEventDeduplicationIdsMaxSize;
import o.getHandleruiannotations;
import o.getKeyboardKindJ9_QTjY;
import o.getNewPassword;
import o.getOnDeeplinkResponseListener;
import o.getOnEventTrackingFailedListener;
import o.getOnEventTrackingSucceededListener;
import o.getOnRemoteTriggerListener;
import o.getOnSessionTrackingSucceededListener;
import o.getOnThirdPartySharingSettingsChangedListener;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.onKeyEventZmokQxo;
import o.p7;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.requiredWidthInVpY3zN4default;
import o.trigger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RiderSafetyReportScreenKt {
    private static int read = 1;
    private static int serializer;

    public static final void write(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-964927351);
        if ((i & 6) == 0) {
            int i5 = serializer + 65;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (!getpostalcode2.read(str)) {
                int i7 = read + 99;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i9 = i2 | 48;
        if (getpostalcode2.write(i9 & 1, (i9 & 19) != 18)) {
            int i10 = read + 65;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            Modifier.Companion companion = Modifier.Companion;
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.rider_safety_report_greeting, new Object[]{str}, getpostalcode2, 0), companion, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-961708487, pcn.serializer(), new Object[0], 961708487, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, i9 & 112, 0, 131064);
            int i12 = serializer + 49;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier2, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    public static final void IconCompatParcelizer(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1175978058);
        if ((i & 6) == 0) {
            int i6 = serializer + 61;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                if (getpostalcode.read(str)) {
                    i4 = 4;
                } else {
                    i4 = 2;
                }
            } else {
                int i7 = 52 / 0;
                if (getpostalcode.read(str)) {
                    i4 = 4;
                } else {
                    i4 = 2;
                }
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i8 = read + 33;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= !(getpostalcode.read(modifier) ^ true) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 147) != 146) {
            int i10 = serializer + 55;
            read = i10 % Fields.SpotShadowColor;
            z = i10 % 2 != 0;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            BannerMessageKt.IconCompatParcelizer(modifier, (ImageVector) null, str, StringResources_androidKt.stringResource(R.string.rider_safety_report_welcome_title, getpostalcode, 0), StringResources_androidKt.stringResource(R.string.rider_safety_report_welcome_message, getpostalcode, 0), StringResources_androidKt.stringResource(R.string.got_it, getpostalcode, 0), enableBridgeSecurity.TERTIARY, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, ((i2 >> 6) & 14) | 12582912 | ((i2 << 6) & 896) | ((i2 << 21) & 234881024), 34);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeHorizontalScrollExtent(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 17);
        }
    }

    public static final void RiderSafetyReportContent(getOnEventTrackingFailedListener getoneventtrackingfailedlistener, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1843208260);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(getoneventtrackingfailedlistener) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i5 = serializer + 17;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                i3 = Fields.RotationX;
            } else {
                int i7 = read + 33;
                serializer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 3 / 5;
                }
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        int i9 = i2 | 3072;
        if (getpostalcode.write(i9 & 1, (i9 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(companion, PagerWrapperFlingBehavior.read(0, getpostalcode, 1), false, 14);
            float f = Dimensions.setLogo;
            float f2 = Dimensions.setHideOnContentScrollEnabled;
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(modifierIconCompatParcelizer, f, f2);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
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
            getDefaultTracker getdefaulttracker = getoneventtrackingfailedlistener.RemoteActionCompatParcelizer;
            getOnSessionTrackingSucceededListener getonsessiontrackingsucceededlistener = getoneventtrackingfailedlistener.serializer;
            if (getdefaulttracker instanceof getEventDeduplicationIdsMaxSize) {
                int i10 = read + 55;
                serializer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                getpostalcode.serializer(-907142042);
                write(0, getpostalcode, null, ((getEventDeduplicationIdsMaxSize) getoneventtrackingfailedlistener.RemoteActionCompatParcelizer).serializer);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-907036332);
                getpostalcode.IconCompatParcelizer(false);
            }
            AnimatedVisibilityKt.serializer(getoneventtrackingfailedlistener.IconCompatParcelizer, null, onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3).serializer(onKeyEventZmokQxo.RemoteActionCompatParcelizer(null, null, 15)), onKeyEventZmokQxo.write(null, 3).read(onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, (Alignment.Vertical) null, 15)), null, ExtrasKt.write(-198862026, new DefaultLazyKey(22, r8lambdardpfsr94j4iebcwx_kpqzpm8k1), getpostalcode), getpostalcode, 1600518, 18);
            AnimatedVisibilityKt.serializer(getoneventtrackingfailedlistener.MediaMetadataCompat.serializer, null, onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3).serializer(onKeyEventZmokQxo.RemoteActionCompatParcelizer(null, null, 15)), onKeyEventZmokQxo.write(null, 3).read(onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, (Alignment.Vertical) null, 15)), null, ExtrasKt.write(98637471, new PagerDefaults$$ExternalSyntheticLambda0(getoneventtrackingfailedlistener, 20, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), getpostalcode, 1600518, 18);
            modifier2 = companion;
            Object[] objArr = {getpostalcode, SizeKt.m75height3ABfNKs(modifier2, f2)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
            RiderSafetyScoreKt.RiderSafetyScore(getonsessiontrackingsucceededlistener.write, getoneventtrackingfailedlistener.write, null, null, null, null, getpostalcode, 0);
            Object[] objArr2 = {getpostalcode, SizeKt.m75height3ABfNKs(modifier2, Dimensions.setHasNonEmbeddedTabs)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr2);
            getpostalcode.serializer(-1553244887);
            Iterator it = getoneventtrackingfailedlistener.read.iterator();
            while (it.hasNext()) {
                int i12 = serializer + 27;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                RecommendationItemKt.RecommendationItem((disableAppSetIdReading) it.next(), null, getpostalcode, 0);
                Object[] objArr3 = {getpostalcode, SizeKt.m75height3ABfNKs(Modifier.Companion, Dimensions.setHasNonEmbeddedTabs)};
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr3);
            }
            getpostalcode.IconCompatParcelizer(false);
            ScoreBreakdownKt.ScoreBreakdown(getonsessiontrackingsucceededlistener.RemoteActionCompatParcelizer, getonsessiontrackingsucceededlistener.IconCompatParcelizer, getonsessiontrackingsucceededlistener.serializer, getoneventtrackingfailedlistener.RatingCompat, SizeKt.write(Modifier.Companion, 1.0f), getpostalcode, 24576);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7((Object) getoneventtrackingfailedlistener, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i, 16);
        }
    }

    public static final void RiderSafetyReportScreen(getOnDeeplinkResponseListener getondeeplinkresponselistener, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        getondeeplinkresponselistener.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1400332916);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.read(getondeeplinkresponselistener) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i6 = 32;
            } else {
                int i8 = serializer + 73;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i10 = serializer + 123;
                read = i10 % Fields.SpotShadowColor;
                i5 = i10 % 2 == 0 ? 3829 : Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i11 = serializer + 71;
                read = i11 % Fields.SpotShadowColor;
                i4 = i11 % 2 == 0 ? 31576 : Fields.CameraDistance;
            } else {
                i4 = Fields.RotationZ;
            }
            i2 |= i4;
        }
        Object obj = null;
        if ((i & 24576) == 0) {
            int i12 = read + 5;
            serializer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.Clip : 8192;
            } else {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                obj.hashCode();
                throw null;
            }
        }
        if ((196608 & i) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i13 = read + 117;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i3 = Fields.RenderEffect;
                if (i14 != 0) {
                    int i15 = 35 / 0;
                }
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if (getpostalcode2.write(i2 & 1, (74899 & i2) != 74898)) {
            Modifier modifierThen = modifier.then(SizeKt.read);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    int i16 = read + 27;
                    serializer = i16 % Fields.SpotShadowColor;
                    if (i16 % 2 == 0) {
                        getpostalcode2.serializer(constructor);
                        modifier2 = null;
                    } else {
                        getpostalcode2.serializer(constructor);
                        throw null;
                    }
                } else {
                    modifier2 = null;
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                HeaderKt.serializer(null, StringResources_androidKt.stringResource(R.string.rider_safety_report_title, getpostalcode2, 0), 0L, ExtrasKt.write(1830377426, new trigger(16, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode2), null, null, null, getpostalcode2, 24576, 237);
                if (getondeeplinkresponselistener instanceof getOnEventTrackingFailedListener) {
                    getpostalcode2.serializer(-837585834);
                    int i17 = i2 >> 6;
                    z = true;
                    RiderSafetyReportContent((getOnEventTrackingFailedListener) getondeeplinkresponselistener, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, null, getpostalcode2, (i2 & 14) | (i17 & 112) | (i17 & 896));
                    getpostalcode2.IconCompatParcelizer(false);
                    getpostalcode = getpostalcode2;
                } else {
                    getpostalcode = getpostalcode2;
                    z = true;
                    if (getondeeplinkresponselistener instanceof getOnRemoteTriggerListener) {
                        getpostalcode.serializer(-837579276);
                        getOnRemoteTriggerListener getonremotetriggerlistener = (getOnRemoteTriggerListener) getondeeplinkresponselistener;
                        String strStringResource = StringResources_androidKt.stringResource(getonremotetriggerlistener.serializer, getpostalcode, 0);
                        String strStringResource2 = StringResources_androidKt.stringResource(getonremotetriggerlistener.write, getpostalcode, 0);
                        String strStringResource3 = StringResources_androidKt.stringResource(getonremotetriggerlistener.read, getpostalcode, 0);
                        boolean z3 = (i2 & 896) == 256;
                        boolean z4 = (i2 & 14) == 4;
                        Object objComponentActivity = getpostalcode.ComponentActivity();
                        if ((z4 | z3) || objComponentActivity == getCreditCardExpirationMonth.write) {
                            objComponentActivity = new OtpNavigationKt$$ExternalSyntheticLambda4(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 23, getondeeplinkresponselistener);
                            getpostalcode.write(objComponentActivity);
                        }
                        int i18 = getonremotetriggerlistener.RemoteActionCompatParcelizer;
                        z2 = true;
                        getOnEventTrackingSucceededListener.serializer(i18, 0, getpostalcode, null, strStringResource, strStringResource2, strStringResource3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity);
                        getpostalcode.IconCompatParcelizer(false);
                    } else if (getondeeplinkresponselistener.equals(getOnThirdPartySharingSettingsChangedListener.read)) {
                        getpostalcode.serializer(-837566229);
                        ReiderSafetyReportLoadingContentKt.RiderSafetyReportLoadingContent(modifier2, getpostalcode, 0);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, -837586679, false);
                    }
                    int i19 = serializer + 11;
                    read = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    getpostalcode.IconCompatParcelizer(z2);
                }
                z2 = z;
                int i110 = serializer + 11;
                read = i110 % Fields.SpotShadowColor;
                int i21 = i110 % 2;
                getpostalcode.IconCompatParcelizer(z2);
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY((Object) getondeeplinkresponselistener, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier, i, 21);
        }
    }
}
