package com.roadrunner.diagnostics.presentation.view;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
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
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DefaultLazyKey;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.accessgetCoarsecp;
import o.buildMapping;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getKeyboardKindJ9_QTjY;
import o.getMaxHeight;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NotificationsDiagnosticsScreenKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[PHI: r0
  0x0047: PHI (r0v44 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v46 o.getPostalCode) binds: [B:8:0x0039, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x003b A[PHI: r0
  0x003b: PHI (r0v6 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v46 o.getPostalCode) binds: [B:8:0x0039, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        r14 = r0;
        r15 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.notifications_diagnostics_screen_header, r12, 0);
        r0 = r12.IconCompatParcelizer(r18);
        r1 = r12.ComponentActivity();
        r7 = o.getCreditCardExpirationMonth.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
    
        if (r0 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        if (r1 != r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b9, code lost:
    
        r6 = new com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, r18, o.getReferencedIds.class, "onChangeSettingsClicked", "onChangeSettingsClicked()V", 0, 22);
        r12.write(r6);
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
    
        r11 = (o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((o.registerInAppMessageManagerlambda0) r1);
        r0 = r12.IconCompatParcelizer(r18);
        r1 = r12.ComponentActivity();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e3, code lost:
    
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
    
        if (r1 != r7) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
    
        r0 = com.roadrunner.diagnostics.presentation.view.NotificationsDiagnosticsScreenKt.IconCompatParcelizer + 65;
        com.roadrunner.diagnostics.presentation.view.NotificationsDiagnosticsScreenKt.serializer = r0 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f1, code lost:
    
        r9 = new com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, r18, o.getReferencedIds.class, "onTryAgainClicked", "onTryAgainClicked()V", 0, 23);
        r12.write(r9);
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0107, code lost:
    
        NotificationsDiagnosticsContent(r14, r15, r19, r11, (o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((o.registerInAppMessageManagerlambda0) r1), androidx.compose.foundation.layout.AspectRatioKt.serializer(androidx.compose.ui.Modifier.Companion), r12, (r13 << 3) & 896);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0120, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("State should not be null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0125, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NotificationsDiagnosticsScreen(o.getReferencedIds r18, o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r19, o.getBirthDateFull r20, int r21) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.diagnostics.presentation.view.NotificationsDiagnosticsScreenKt.NotificationsDiagnosticsScreen(o.getReferencedIds, o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0, o.getBirthDateFull, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0052  */
    /* JADX WARN: Code duplicated, block: B:12:0x0054  */
    /* JADX WARN: Code duplicated, block: B:14:0x0057 A[PHI: r2
  0x0057: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x0049, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x004b A[PHI: r2
  0x004b: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x0049, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void NotificationsDiagnosticsContent(getMaxHeight getmaxheight, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        float f;
        boolean z;
        int i4;
        int i5 = 2 % 2;
        int i6 = IconCompatParcelizer + 59;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            str.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-758284920);
            if ((i & 88) == 0) {
                if (!(!getpostalcode.read(getmaxheight))) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            str.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-758284920);
            if ((i & 6) == 0) {
                if (!(!getpostalcode.read(getmaxheight))) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(str)) {
                int i7 = IconCompatParcelizer + 17;
                serializer = i7 % Fields.SpotShadowColor;
                i4 = i7 % 2 == 0 ? 84 : 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.CameraDistance : Fields.RotationZ;
        }
        Object obj = null;
        if ((i & 24576) == 0) {
            int i8 = IconCompatParcelizer + 15;
            serializer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.Clip : 8192;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                obj.hashCode();
                throw null;
            }
        }
        if ((196608 & i) == 0) {
            int i9 = serializer + 117;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i3 |= getpostalcode.read(modifier) ? Fields.RenderEffect : 65536;
        }
        int i11 = i3;
        if (getpostalcode.write(i11 & 1, (i11 & 74899) != 74898)) {
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    int i12 = serializer + 73;
                    IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                HeaderKt.m5063HeaderbbrV0mI(null, str, null, 0L, 0.0f, null, ExtrasKt.write(37519046, new DefaultLazyKey(9, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), null, null, getpostalcode, (i11 & 112) | 1572864, 445);
                Modifier.Companion companion2 = Modifier.Companion;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, Dimensions.getAnimatedVisibility)});
                String str2 = getmaxheight.write;
                TextStyle textStyleMediaSessionCompatResultReceiverWrapper = performLayout.MediaSessionCompatResultReceiverWrapper();
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                long presenter = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter();
                float f2 = Dimensions.setTabContainer;
                TextKt.m131TextNvy7gAk(str2, PaddingKt.m73paddingVpY3zN4$default(companion2, f2, 0.0f, 2), presenter, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatResultReceiverWrapper, getpostalcode, 0, 0, 131064);
                String str3 = getmaxheight.read;
                if (str3 == null) {
                    int i14 = IconCompatParcelizer + 111;
                    serializer = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 == 0) {
                        getpostalcode.serializer(1699824736);
                        z = false;
                    } else {
                        z = false;
                        getpostalcode.serializer(1699824736);
                    }
                    getpostalcode.IconCompatParcelizer(z);
                    f = 0.0f;
                } else {
                    getpostalcode.serializer(1699824737);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, Dimensions.setSplitBackground)});
                    TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
                    long presenter2 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter();
                    f = 0.0f;
                    TextKt.m131TextNvy7gAk(str3, PaddingKt.m73paddingVpY3zN4$default(companion2, f2, 0.0f, 2), presenter2, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleIconCompatParcelizer, getpostalcode, 0, 0, 131064);
                    getpostalcode.IconCompatParcelizer(false);
                }
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, f2)});
                accessgetCoarsecp.serializer(0.0f, 0, 6, 0L, getpostalcode, PaddingKt.m73paddingVpY3zN4$default(companion2, f2, f, 2));
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, f2)});
                getPostalCode getpostalcode2 = getpostalcode;
                CheckStatusKt.CheckStatus(getmaxheight.RemoteActionCompatParcelizer, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode2, (i11 >> 3) & 896, 2);
                CheckStatusKt.CheckStatus(getmaxheight.serializer, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, getpostalcode2, (i11 >> 6) & 896, 2);
                CheckStatusKt.CheckStatus(getmaxheight.IconCompatParcelizer, null, null, getpostalcode2, 0, 6);
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY((Object) getmaxheight, (Object) str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier, i, 10);
        }
    }
}
