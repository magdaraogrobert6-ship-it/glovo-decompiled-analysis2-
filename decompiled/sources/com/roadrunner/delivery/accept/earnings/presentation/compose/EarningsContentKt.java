package com.roadrunner.delivery.accept.earnings.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.delivery.accept.earnings.api.EarningsUiModel;
import com.roadrunner.delivery.accept.earnings.presentation.EarningsUiModelImpl;
import com.roadrunner.delivery.accept.earnings.presentation.compose.EarningsContentKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPrefetchScheduler;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.LayoutCompatBreakStrategy;
import o.LayoutCompatHyphenationFrequency;
import o.LayoutCompatJustificationMode;
import o.LayoutHelper_androidKt;
import o.TextFieldDefaults;
import o.buildMapping;
import o.computeMaxIntrinsicWidth;
import o.constrainedMap;
import o.getAndroidType;
import o.getBirthDateFull;
import o.getCharSequenceForIntrinsicWidth;
import o.getCreditCardExpirationMonth;
import o.getDEFAULT_LAYOUT_ALIGNMENTui_text;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.isLineEndSpace;
import o.lookupAndInterpolate;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.registerInAppMessageManagerlambda0;
import o.runSyncInPlayAdIdSchedulerWithTimeout;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EarningsContentKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r1 == 2581923) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r4.equals("Snow") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r4.equals("Rain") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (r4.equals("Bad Weather") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        return androidx.compose.ui.graphics.Color.m712boximpl(androidx.compose.ui.graphics.ColorKt.Color(4278230481L));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        r4 = com.roadrunner.delivery.accept.earnings.presentation.compose.EarningsContentKt.IconCompatParcelizer + 93;
        com.roadrunner.delivery.accept.earnings.presentation.compose.EarningsContentKt.read = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if ((r4 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        r4 = 61 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r1 != 2539444) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r1 != 2539444) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.graphics.Color write(o.constrainedMap r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r4 = r4.write
            int r1 = r4.hashCode()
            r2 = -2049983847(0xffffffff85cfba99, float:-1.9534732E-35)
            if (r1 == r2) goto L3d
            int r2 = com.roadrunner.delivery.accept.earnings.presentation.compose.EarningsContentKt.read
            int r2 = r2 + 5
            int r3 = r2 % 128
            com.roadrunner.delivery.accept.earnings.presentation.compose.EarningsContentKt.IconCompatParcelizer = r3
            int r2 = r2 % r0
            r3 = 2539444(0x26bfb4, float:3.558519E-39)
            if (r2 != 0) goto L23
            r2 = 16
            int r2 = r2 / 0
            if (r1 == r3) goto L34
            goto L25
        L23:
            if (r1 == r3) goto L34
        L25:
            r2 = 2581923(0x2765a3, float:3.618045E-39)
            if (r1 == r2) goto L2b
            goto L53
        L2b:
            java.lang.String r1 = "Snow"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L45
            goto L53
        L34:
            java.lang.String r1 = "Rain"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L45
            goto L53
        L3d:
            java.lang.String r1 = "Bad Weather"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L53
        L45:
            r0 = 4278230481(0xff009dd1, double:2.1137267057E-314)
            long r0 = androidx.compose.ui.graphics.ColorKt.Color(r0)
            androidx.compose.ui.graphics.Color r4 = androidx.compose.ui.graphics.Color.m712boximpl(r0)
            return r4
        L53:
            int r4 = com.roadrunner.delivery.accept.earnings.presentation.compose.EarningsContentKt.IconCompatParcelizer
            int r4 = r4 + 93
            int r1 = r4 % 128
            com.roadrunner.delivery.accept.earnings.presentation.compose.EarningsContentKt.read = r1
            int r4 = r4 % r0
            r0 = 0
            if (r4 == 0) goto L63
            r4 = 61
            int r4 = r4 / 0
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.earnings.presentation.compose.EarningsContentKt.write(o.constrainedMap):androidx.compose.ui.graphics.Color");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026 A[PHI: r6
  0x0026: PHI (r6v5 o.getPostalCode) = (r6v1 o.getPostalCode), (r6v6 o.getPostalCode) binds: [B:8:0x0022, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r6
  0x0024: PHI (r6v2 o.getPostalCode) = (r6v1 o.getPostalCode), (r6v6 o.getPostalCode) binds: [B:8:0x0022, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void read(getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean z;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 29;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1976168452);
            int i4 = 78 / 0;
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1976168452);
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (getpostalcode.write(i & 1, z)) {
            int i5 = IconCompatParcelizer + 11;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            BoxKt.Box(BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(SizeKt.m83size3ABfNKs(PaddingKt.m73paddingVpY3zN4$default(Modifier.Companion, Dimensions.getNestedScrollAxes, 0.0f, 2), Dimensions.RemoteActionCompatParcelizer), RoundedCornerShapeKt.IconCompatParcelizer), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onLayout(), RectangleShapeKt.getRectangleShape()), getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i7 = IconCompatParcelizer + 79;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                int i8 = 3 % 5;
            }
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new runSyncInPlayAdIdSchedulerWithTimeout(i, 2);
        }
    }

    public static final void RemoteActionCompatParcelizer(lookupAndInterpolate lookupandinterpolate, getDEFAULT_LAYOUT_ALIGNMENTui_text getdefault_layout_alignmentui_text, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 109;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(961079742);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(lookupandinterpolate) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0 ? getpostalcode.read(getdefault_layout_alignmentui_text) : getpostalcode.IconCompatParcelizer(getdefault_layout_alignmentui_text)) {
                int i7 = IconCompatParcelizer + 111;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i9 = i2 | 384;
        int i10 = 0;
        if ((i9 & 147) != 146) {
            int i11 = read + 41;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i9 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            FlowLayoutKt.serializer(companion, Arrangement.IconCompatParcelizer, Arrangement.IconCompatParcelizer(Dimensions.getActionBarHideOffset), null, 0, 0, ExtrasKt.write(-1596828615, new isLineEndSpace(lookupandinterpolate, getdefault_layout_alignmentui_text, i10), getpostalcode), getpostalcode, ((i9 >> 6) & 14) | 1572912, 56);
            int i13 = IconCompatParcelizer + 19;
            read = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getCharSequenceForIntrinsicWidth(lookupandinterpolate, getdefault_layout_alignmentui_text, modifier2, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    public static final void read(final LayoutCompatJustificationMode layoutCompatJustificationMode, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, final boolean z, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1086256611);
        if ((i & 6) == 0) {
            int i7 = read + 65;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (getpostalcode.read(layoutCompatJustificationMode)) {
                int i9 = read + 77;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    i5 = 2;
                } else {
                    i5 = 4;
                }
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i10 = IconCompatParcelizer + 35;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.write(z)) {
                int i12 = IconCompatParcelizer + 125;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i3 = Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            int i14 = IconCompatParcelizer + 125;
            read = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.RenderEffect : 65536;
        }
        boolean z2 = false;
        if ((74899 & i2) != 74898) {
            int i16 = read + 3;
            IconCompatParcelizer = i16 % Fields.SpotShadowColor;
            if (i16 % 2 != 0) {
                z2 = true;
            }
        }
        if (getpostalcode.write(i2 & 1, z2)) {
            SurfaceKt.m126SurfaceT9BRK9s(SizeKt.write(modifier, 1.0f), null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), 0L, 0.0f, 0.0f, null, ExtrasKt.write(-989097176, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.isRtlParagraph
                private static int MediaDescriptionCompat = 0;
                private static int RatingCompat = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.ui.node.ComposeUiNode.Companion companion;
                    AndroidContentCaptureManager androidContentCaptureManager;
                    long jM732unboximpl;
                    int i17 = 2 % 2;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    boolean zWrite = getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2);
                    getAddressCountry getaddresscountry = getpostalcode2.read;
                    if (zWrite) {
                        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.Companion;
                        androidx.compose.ui.Modifier modifierWrite = androidx.compose.foundation.layout.PaddingKt.write(androidx.compose.foundation.layout.SizeKt.write(companion2, 1.0f), Dimensions.setActionBarVisibilityCallback);
                        androidx.compose.ui.Alignment.Companion companion3 = androidx.compose.ui.Alignment.Companion;
                        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(androidx.compose.foundation.layout.Arrangement.MediaDescriptionCompat, companion3.getCenterHorizontally(), getpostalcode2, 48);
                        int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                        androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
                        androidx.compose.ui.node.ComposeUiNode.Companion companion4 = androidx.compose.ui.node.ComposeUiNode.Companion;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion4.getConstructor();
                        if (getaddresscountry != null) {
                            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (!getpostalcode2.ComponentActivity) {
                                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            } else {
                                int i18 = RatingCompat + 91;
                                MediaDescriptionCompat = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i19 = i18 % 2;
                                getpostalcode2.serializer(constructor);
                            }
                            c8$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                            getpostalcode2.serializer(-60921500);
                            getpostalcode2.IconCompatParcelizer(false);
                            LayoutCompatJustificationMode layoutCompatJustificationMode2 = layoutCompatJustificationMode;
                            String str = layoutCompatJustificationMode2.MediaBrowserCompatMediaItem;
                            if (str == null) {
                                getpostalcode2.serializer(-60872645);
                                getpostalcode2.IconCompatParcelizer(false);
                                companion = companion4;
                            } else {
                                getpostalcode2.serializer(-60872644);
                                companion = companion4;
                                androidx.compose.material3.TextKt.m131TextNvy7gAk(str, companion2, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode2, 48, 0, 131064);
                                Object[] objArr = {getpostalcode2, androidx.compose.foundation.layout.PaddingKt.write(companion2, Dimensions.getNestedScrollAxes)};
                                coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
                                getpostalcode2.IconCompatParcelizer(false);
                            }
                            androidx.compose.foundation.layout.FlowLayoutKt.serializer(null, androidx.compose.foundation.layout.Arrangement.IconCompatParcelizer, null, null, 0, 0, coil3.ExtrasKt.write(-1531035325, new p4(layoutCompatJustificationMode2, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, 1), getpostalcode2), getpostalcode2, 1572912, 61);
                            lerpInv lerpinv = layoutCompatJustificationMode2.MediaMetadataCompat;
                            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                            if (lerpinv != null) {
                                getpostalcode2.serializer(-56817565);
                                Object[] objArr2 = {getpostalcode2, androidx.compose.foundation.layout.PaddingKt.write(companion2, Dimensions.getActionBarHideOffset)};
                                coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr2);
                                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(androidx.compose.foundation.layout.Arrangement.MediaBrowserCompatMediaItem, companion3.getTop(), getpostalcode2, 0);
                                int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
                                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
                                androidx.compose.ui.Modifier modifierMaterializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode2, companion2);
                                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion.getConstructor();
                                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                if (getpostalcode2.ComponentActivity) {
                                    getpostalcode2.serializer(constructor2);
                                } else {
                                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                }
                                androidx.compose.ui.node.ComposeUiNode.Companion companion5 = companion;
                                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion5, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
                                getpostalcode2.serializer(1668023706);
                                for (constrainedMap constrainedmap : lerpinv.write) {
                                    boolean z3 = getpostalcode2.read(constrainedmap.write);
                                    Object objComponentActivity = getpostalcode2.ComponentActivity();
                                    if (z3 || objComponentActivity == androidContentCaptureManager2) {
                                        objComponentActivity = EarningsContentKt.write(constrainedmap);
                                        getpostalcode2.write(objComponentActivity);
                                    }
                                    androidx.compose.ui.graphics.Color color = (androidx.compose.ui.graphics.Color) objComponentActivity;
                                    if (color != null) {
                                        getpostalcode2.serializer(-652105313);
                                        getpostalcode2.IconCompatParcelizer(false);
                                        jM732unboximpl = color.m732unboximpl();
                                    } else {
                                        int i20 = RatingCompat + 29;
                                        MediaDescriptionCompat = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        if (i20 % 2 != 0) {
                                            getpostalcode2.serializer(-652101872);
                                            jM732unboximpl = androidx.compose.ui.res.ColorResources_androidKt.colorResource(constrainedmap.IconCompatParcelizer, getpostalcode2, 0);
                                            getpostalcode2.IconCompatParcelizer(true);
                                        } else {
                                            getpostalcode2.serializer(-652101872);
                                            jM732unboximpl = androidx.compose.ui.res.ColorResources_androidKt.colorResource(constrainedmap.IconCompatParcelizer, getpostalcode2, 0);
                                            getpostalcode2.IconCompatParcelizer(false);
                                        }
                                    }
                                    long j = jM732unboximpl;
                                    int i21 = RatingCompat + 113;
                                    MediaDescriptionCompat = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i22 = i21 % 2;
                                    androidx.compose.material3.IconKt.m116Iconww6aTOc(androidx.compose.ui.res.PainterResources_androidKt.painterResource(constrainedmap.serializer, getpostalcode2, 0), constrainedmap.write, androidx.compose.foundation.layout.SizeKt.m83size3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(androidx.compose.ui.Modifier.Companion, 0.0f, 0.0f, Dimensions.getNestedScrollAxes, 0.0f, 11), Dimensions.setHideOnContentScrollEnabled), j, getpostalcode2, androidx.compose.ui.graphics.painter.Painter.$stable, 0);
                                    androidContentCaptureManager2 = androidContentCaptureManager2;
                                }
                                androidContentCaptureManager = androidContentCaptureManager2;
                                getpostalcode2.IconCompatParcelizer(false);
                                String str2 = lerpinv.RemoteActionCompatParcelizer;
                                if (str2 == null) {
                                    getpostalcode2.serializer(170082476);
                                    getpostalcode2.IconCompatParcelizer(false);
                                } else {
                                    getpostalcode2.serializer(170082477);
                                    androidx.compose.material3.TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode2, 0, 0, 131066);
                                    getpostalcode2.IconCompatParcelizer(false);
                                }
                                getpostalcode2.IconCompatParcelizer(true);
                                getpostalcode2.IconCompatParcelizer(false);
                            } else {
                                int i23 = RatingCompat + 1;
                                MediaDescriptionCompat = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i24 = i23 % 2;
                                getpostalcode2.serializer(-56817566);
                                getpostalcode2.IconCompatParcelizer(false);
                                androidContentCaptureManager = androidContentCaptureManager2;
                            }
                            lookupAndInterpolate lookupandinterpolate = layoutCompatJustificationMode2.read;
                            getDEFAULT_LAYOUT_ALIGNMENTui_text getdefault_layout_alignmentui_text = layoutCompatJustificationMode2.serializer;
                            if (lookupandinterpolate == null && getdefault_layout_alignmentui_text == null) {
                                getpostalcode2.serializer(-55103420);
                                getpostalcode2.IconCompatParcelizer(false);
                            } else {
                                getpostalcode2.serializer(-55188949);
                                Object[] objArr3 = {getpostalcode2, androidx.compose.foundation.layout.PaddingKt.write(androidx.compose.ui.Modifier.Companion, Dimensions.getActionBarHideOffset)};
                                coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr3);
                                getpostalcode2.IconCompatParcelizer(false);
                            }
                            int i25 = RatingCompat + 47;
                            MediaDescriptionCompat = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i26 = i25 % 2;
                            EarningsContentKt.RemoteActionCompatParcelizer(lookupandinterpolate, getdefault_layout_alignmentui_text, null, getpostalcode2, 0);
                            String str3 = layoutCompatJustificationMode2.write;
                            if (str3 == null) {
                                getpostalcode2.serializer(-54984412);
                                getpostalcode2.IconCompatParcelizer(false);
                            } else {
                                getpostalcode2.serializer(-54984411);
                                androidx.compose.ui.Modifier.Companion companion6 = androidx.compose.ui.Modifier.Companion;
                                Object[] objArr4 = {getpostalcode2, androidx.compose.foundation.layout.PaddingKt.write(companion6, Dimensions.getActionBarHideOffset)};
                                coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr4);
                                androidx.compose.material3.TextKt.m131TextNvy7gAk(str3, companion6, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, 48, 0, 131064);
                                getpostalcode2.IconCompatParcelizer(false);
                            }
                            getpostalcode2.IconCompatParcelizer(true);
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                            boolean z4 = getpostalcode2.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k3);
                            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                            if (z4 || objComponentActivity2 == androidContentCaptureManager) {
                                objComponentActivity2 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(7, r8lambdardpfsr94j4iebcwx_kpqzpm8k3);
                                getpostalcode2.write(objComponentActivity2);
                            }
                            getPhoneNumberNational.serializer(layoutCompatJustificationMode2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode2);
                        } else {
                            SentryUUID.write();
                            throw null;
                        }
                    } else {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), getpostalcode, 12582912, 122);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getAndroidType(layoutCompatJustificationMode, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, i);
        }
    }

    public static final void Multiplier(getDEFAULT_LAYOUT_ALIGNMENTui_text getdefault_layout_alignmentui_text, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3 = 2 % 2;
        getdefault_layout_alignmentui_text.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1101386043);
        if ((i & 6) == 0) {
            int i4 = IconCompatParcelizer + 63;
            read = i4 % Fields.SpotShadowColor;
            i2 = ((i4 % 2 == 0 ? (i & 8) != 0 : (i & 115) != 0) ? getpostalcode2.IconCompatParcelizer(getdefault_layout_alignmentui_text) : getpostalcode2.read(getdefault_layout_alignmentui_text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if ((i5 & 19) != 18) {
            int i6 = read + 115;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i5 & 1, z)) {
            int i8 = IconCompatParcelizer + 99;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            modifier2 = Modifier.Companion;
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            modifier2.getClass();
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, centerVertically, getpostalcode2, 48);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifier2);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
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
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_chevron_thick_double_up_right, getpostalcode2, 0), getdefault_layout_alignmentui_text.IconCompatParcelizer, SizeKt.m83size3ABfNKs(PaddingKt.m74paddingqDBjuR0$default(modifier2, 0.0f, 0.0f, Dimensions.getActionBarHideOffset, 0.0f, 11), Dimensions.setHideOnContentScrollEnabled), ColorResources_androidKt.colorResource(R.color.neutral_100, getpostalcode2, 0), getpostalcode2, Painter.$stable, 0);
            TextKt.m131TextNvy7gAk(getdefault_layout_alignmentui_text.RemoteActionCompatParcelizer, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, FontWeight.Companion.getW400(), null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode2, 1572864, 0, 131002);
            getpostalcode = getpostalcode2;
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new LayoutHelper_androidKt(getdefault_layout_alignmentui_text, modifier2, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:50:0x011c  */
    public static final void EarningsContent(EarningsUiModel earningsUiModel, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        boolean z2;
        int i3 = 2 % 2;
        int i4 = IconCompatParcelizer + 67;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        earningsUiModel.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(813447055);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(earningsUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if ((i6 & 19) != 18) {
            int i7 = read + 45;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i6 & 1, z)) {
            int i8 = IconCompatParcelizer + 55;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            Modifier.Companion companion = Modifier.Companion;
            EarningsUiModelImpl earningsUiModelImpl = (EarningsUiModelImpl) earningsUiModel;
            boolean zBooleanValue = ((Boolean) ExtrasKt.write(earningsUiModelImpl.MediaSessionCompatResultReceiverWrapper, getpostalcode, 0).getValue()).booleanValue();
            LayoutCompatBreakStrategy layoutCompatBreakStrategy = (LayoutCompatBreakStrategy) ExtrasKt.write(earningsUiModelImpl.ParcelableVolumeInfo, getpostalcode, 0).getValue();
            if (layoutCompatBreakStrategy instanceof LayoutCompatHyphenationFrequency) {
                getpostalcode.serializer(1195995502);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(layoutCompatBreakStrategy instanceof LayoutCompatJustificationMode)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 38577696, false);
                }
                getpostalcode.serializer(1196096438);
                LayoutCompatJustificationMode layoutCompatJustificationMode = (LayoutCompatJustificationMode) layoutCompatBreakStrategy;
                int i10 = i6 & 14;
                boolean z3 = i10 == 4;
                Object objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (z3 || objComponentActivity == androidContentCaptureManager) {
                    MapboxNavigation.AnonymousClass15 anonymousClass15 = new MapboxNavigation.AnonymousClass15(0, earningsUiModel, EarningsUiModel.class, "onEarningsDisplayed", "onEarningsDisplayed()V", 0, 21);
                    getpostalcode.write(anonymousClass15);
                    objComponentActivity = anonymousClass15;
                }
                registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity;
                if (i10 == 4) {
                    int i11 = IconCompatParcelizer + 31;
                    read = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (z2 || objComponentActivity2 == androidContentCaptureManager) {
                    MapboxNavigation.AnonymousClass15 anonymousClass16 = new MapboxNavigation.AnonymousClass15(0, earningsUiModel, EarningsUiModel.class, "onTooltipIconClicked", "onTooltipIconClicked()V", 0, 22);
                    getpostalcode.write(anonymousClass16);
                    objComponentActivity2 = anonymousClass16;
                }
                registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda1 = (registerInAppMessageManagerlambda0) objComponentActivity2;
                boolean z4 = i10 == 4;
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if (z4) {
                    MapboxNavigation.AnonymousClass15 anonymousClass17 = new MapboxNavigation.AnonymousClass15(0, earningsUiModel, EarningsUiModel.class, "onTooltipDismissed", "onTooltipDismissed()V", 0, 23);
                    getpostalcode.write(anonymousClass17);
                    int i13 = IconCompatParcelizer + 1;
                    read = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    objComponentActivity3 = anonymousClass17;
                } else {
                    int i15 = IconCompatParcelizer + 1;
                    read = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    if (objComponentActivity3 == androidContentCaptureManager) {
                        MapboxNavigation.AnonymousClass15 anonymousClass18 = new MapboxNavigation.AnonymousClass15(0, earningsUiModel, EarningsUiModel.class, "onTooltipDismissed", "onTooltipDismissed()V", 0, 23);
                        getpostalcode.write(anonymousClass18);
                        int i17 = IconCompatParcelizer + 1;
                        read = i17 % Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        objComponentActivity3 = anonymousClass18;
                    }
                }
                read(layoutCompatJustificationMode, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0, companion, zBooleanValue, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3), getpostalcode, (i6 << 3) & 896);
                getpostalcode.IconCompatParcelizer(false);
            }
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(earningsUiModel, modifier2, i, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.compose.ui.Modifier$Companion] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.Modifier] */
    public static final void PromoBonus(lookupAndInterpolate lookupandinterpolate, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        getPostalCode getpostalcode;
        ?? r2;
        boolean z2;
        long jM732unboximpl;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1194513187);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.IconCompatParcelizer(lookupandinterpolate) ? 4 : 2) | i;
        } else {
            int i5 = read + 93;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = i;
        }
        int i7 = i2 | 48;
        if ((i7 & 19) != 18) {
            int i8 = IconCompatParcelizer + 41;
            read = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (!(!getpostalcode2.write(i7 & 1, z))) {
            Modifier.Companion companion = Modifier.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getCenterVertically(), getpostalcode2, 48);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i9 = IconCompatParcelizer + 49;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i11 = read + 103;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            getpostalcode2.serializer(-1054443571);
            for (constrainedMap constrainedmap : lookupandinterpolate.write) {
                boolean z3 = getpostalcode2.read(constrainedmap.write);
                Object objComponentActivity = getpostalcode2.ComponentActivity();
                if (z3 || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = write(constrainedmap);
                    getpostalcode2.write(objComponentActivity);
                }
                Color color = (Color) objComponentActivity;
                if (color == null) {
                    getpostalcode2.serializer(-1549259361);
                    jM732unboximpl = ColorResources_androidKt.colorResource(constrainedmap.IconCompatParcelizer, getpostalcode2, 0);
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    getpostalcode2.serializer(-1549262058);
                    getpostalcode2.IconCompatParcelizer(false);
                    jM732unboximpl = color.m732unboximpl();
                    int i13 = read + 45;
                    IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                }
                IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(constrainedmap.serializer, getpostalcode2, 0), constrainedmap.write, SizeKt.m83size3ABfNKs(PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, Dimensions.getActionBarHideOffset, 0.0f, 11), Dimensions.setHideOnContentScrollEnabled), jM732unboximpl, getpostalcode2, Painter.$stable, 0);
            }
            getpostalcode2.IconCompatParcelizer(false);
            String str = lookupandinterpolate.IconCompatParcelizer;
            if (str == null) {
                getpostalcode2.serializer(1672493216);
                getpostalcode2.IconCompatParcelizer(false);
                i3 = 0;
                getpostalcode = getpostalcode2;
                z2 = true;
            } else {
                getpostalcode2.serializer(1672493217);
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode2, 0, 0, 131066);
                getpostalcode = getpostalcode2;
                i3 = 0;
                getpostalcode.IconCompatParcelizer(false);
                z2 = true;
            }
            getpostalcode.IconCompatParcelizer(z2);
            r2 = companion;
        } else {
            i3 = 0;
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            r2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeMaxIntrinsicWidth(lookupandinterpolate, r2, i, i3);
        }
    }
}
