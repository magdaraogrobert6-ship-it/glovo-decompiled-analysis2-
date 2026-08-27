package com.roadrunner.delivery.accept.autoaccept.presentation.compose;

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
import androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda3;
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
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPrefetchScheduler;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.LayoutCompatJustificationMode;
import o.LayoutHelper_androidKt;
import o.TextFieldDefaults;
import o.buildMapping;
import o.computeMaxIntrinsicWidth;
import o.constrainedMap;
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
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.runSyncInPlayAdIdSchedulerWithTimeout;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EarningsComposableKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r5.equals("Snow") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r5.equals("Rain") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r5.equals("Bad Weather") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        r5 = androidx.compose.ui.graphics.Color.m712boximpl(androidx.compose.ui.graphics.ColorKt.Color(4278230481L));
        r1 = com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsComposableKt.IconCompatParcelizer + 89;
        com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsComposableKt.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if ((r1 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.graphics.Color read(o.constrainedMap r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsComposableKt.IconCompatParcelizer
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsComposableKt.serializer = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L63
            java.lang.String r5 = r5.write
            int r1 = r5.hashCode()
            r3 = -2049983847(0xffffffff85cfba99, float:-1.9534732E-35)
            if (r1 == r3) goto L40
            r3 = 2539444(0x26bfb4, float:3.558519E-39)
            if (r1 == r3) goto L37
            int r3 = com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsComposableKt.IconCompatParcelizer
            int r3 = r3 + 45
            int r4 = r3 % 128
            com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsComposableKt.serializer = r4
            int r3 = r3 % r0
            r3 = 2581923(0x2765a3, float:3.618045E-39)
            if (r1 == r3) goto L2e
            goto L62
        L2e:
            java.lang.String r1 = "Snow"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L48
            goto L62
        L37:
            java.lang.String r1 = "Rain"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L48
            goto L62
        L40:
            java.lang.String r1 = "Bad Weather"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L62
        L48:
            r3 = 4278230481(0xff009dd1, double:2.1137267057E-314)
            long r3 = androidx.compose.ui.graphics.ColorKt.Color(r3)
            androidx.compose.ui.graphics.Color r5 = androidx.compose.ui.graphics.Color.m712boximpl(r3)
            int r1 = com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsComposableKt.IconCompatParcelizer
            int r1 = r1 + 89
            int r3 = r1 % 128
            com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsComposableKt.serializer = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L61
            return r5
        L61:
            throw r2
        L62:
            return r2
        L63:
            java.lang.String r5 = r5.write
            r5.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsComposableKt.read(o.constrainedMap):androidx.compose.ui.graphics.Color");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:12:0x0062  */
    /* JADX WARN: Code duplicated, block: B:15:0x006b  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static final void write(getBirthDateFull getbirthdatefull, int i) {
        boolean z;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 91;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1248231162);
        if (i != 0) {
            int i5 = IconCompatParcelizer + 61;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                z = true;
            }
            if (getpostalcode.write(i & 1, z)) {
                BoxKt.Box(BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(SizeKt.m83size3ABfNKs(PaddingKt.m73paddingVpY3zN4$default(Modifier.Companion, Dimensions.getNestedScrollAxes, 0.0f, 2), Dimensions.RemoteActionCompatParcelizer), RoundedCornerShapeKt.IconCompatParcelizer), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onLayout(), RectangleShapeKt.getRectangleShape()), getpostalcode, 0);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new runSyncInPlayAdIdSchedulerWithTimeout(i, 1);
            }
        }
        int i6 = IconCompatParcelizer + 93;
        serializer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        z = false;
        if (getpostalcode.write(i & 1, z)) {
            BoxKt.Box(BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(SizeKt.m83size3ABfNKs(PaddingKt.m73paddingVpY3zN4$default(Modifier.Companion, Dimensions.getNestedScrollAxes, 0.0f, 2), Dimensions.RemoteActionCompatParcelizer), RoundedCornerShapeKt.IconCompatParcelizer), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onLayout(), RectangleShapeKt.getRectangleShape()), getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new runSyncInPlayAdIdSchedulerWithTimeout(i, 1);
        }
    }

    public static final void RemoteActionCompatParcelizer(lookupAndInterpolate lookupandinterpolate, getDEFAULT_LAYOUT_ALIGNMENTui_text getdefault_layout_alignmentui_text, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        int i5 = serializer + 51;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-851480968);
        if ((i & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(lookupandinterpolate)) {
                int i7 = IconCompatParcelizer + 53;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i9 = serializer + 75;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            i2 |= (i9 % 2 == 0 ? (i & 64) != 0 : (i & 117) != 0) ? getpostalcode.IconCompatParcelizer(getdefault_layout_alignmentui_text) : getpostalcode.read(getdefault_layout_alignmentui_text) ? 32 : 16;
        }
        int i10 = i2 | 384;
        if ((i10 & 147) != 146) {
            int i11 = IconCompatParcelizer;
            int i12 = i11 + 41;
            serializer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            int i14 = i11 + 27;
            serializer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i10 & 1, z)) {
            int i16 = ((i10 >> 6) & 14) | 1572912;
            modifier2 = Modifier.Companion;
            FlowLayoutKt.serializer(modifier2, Arrangement.IconCompatParcelizer, Arrangement.IconCompatParcelizer(Dimensions.getActionBarHideOffset), null, 0, 0, ExtrasKt.write(1726765277, new isLineEndSpace(lookupandinterpolate, getdefault_layout_alignmentui_text, 1), getpostalcode), getpostalcode, i16, 56);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getCharSequenceForIntrinsicWidth(lookupandinterpolate, getdefault_layout_alignmentui_text, modifier2, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    public static final void read(LayoutCompatJustificationMode layoutCompatJustificationMode, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4 = 2 % 2;
        layoutCompatJustificationMode.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1665693326);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.read(layoutCompatJustificationMode) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if ((i & 48) == 0) {
            int i5 = IconCompatParcelizer + 91;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                if (getpostalcode2.read(modifier)) {
                    i3 = 32;
                } else {
                    i3 = 16;
                }
            } else {
                int i6 = 45 / 0;
                if (getpostalcode2.read(modifier)) {
                    i3 = 32;
                } else {
                    i3 = 16;
                }
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            int i7 = serializer + 37;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = true;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            getpostalcode = getpostalcode2;
            SurfaceKt.m126SurfaceT9BRK9s(SizeKt.write(modifier, 1.0f), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setActionBarVisibilityCallback), ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).serializer(), 0L, 0.0f, 0.0f, null, ExtrasKt.write(1688740585, new GapComposer$$ExternalSyntheticLambda3(16, layoutCompatJustificationMode), getpostalcode2), getpostalcode2, 12582912, 120);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(layoutCompatJustificationMode, modifier, i, 12);
        }
    }

    public static final void Multiplier(getDEFAULT_LAYOUT_ALIGNMENTui_text getdefault_layout_alignmentui_text, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        Modifier modifier2;
        boolean zIconCompatParcelizer;
        int i4;
        int i5 = 2 % 2;
        getdefault_layout_alignmentui_text.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1557615333);
        if ((i & 6) == 0) {
            int i6 = serializer + 13;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0 ? (i & 8) == 0 : (i & 47) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(getdefault_layout_alignmentui_text);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(getdefault_layout_alignmentui_text);
            }
            if (zIconCompatParcelizer) {
                int i7 = IconCompatParcelizer + 13;
                serializer = i7 % Fields.SpotShadowColor;
                i4 = 4;
                if (i7 % 2 == 0) {
                    int i8 = 4 / 3;
                }
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i9 = i2 | 48;
        if (getpostalcode2.write(i9 & 1, (i9 & 19) != 18)) {
            int i10 = serializer + 17;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            companion.getClass();
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, centerVertically, getpostalcode2, 48);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    int i12 = serializer + 11;
                    IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                modifier2 = companion;
                IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_chevron_thick_double_up_right, getpostalcode2, 0), getdefault_layout_alignmentui_text.IconCompatParcelizer, SizeKt.m83size3ABfNKs(PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dimensions.getActionBarHideOffset, 0.0f, 11), Dimensions.setHideOnContentScrollEnabled), ColorResources_androidKt.colorResource(R.color.neutral_100, getpostalcode2, 0), getpostalcode2, Painter.$stable, 0);
                TextKt.m131TextNvy7gAk(getdefault_layout_alignmentui_text.RemoteActionCompatParcelizer, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, FontWeight.Companion.getW400(), null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode2, 1572864, 0, 131002);
                getpostalcode = getpostalcode2;
                i3 = 1;
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode = getpostalcode2;
            i3 = 1;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new LayoutHelper_androidKt(getdefault_layout_alignmentui_text, modifier2, i, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.compose.ui.Modifier$Companion] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r4v24, types: [int] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v28 */
    public static final void PromoBonus(lookupAndInterpolate lookupandinterpolate, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        getPostalCode getpostalcode;
        long jM732unboximpl;
        ?? r4;
        getPostalCode getpostalcode2;
        ?? r2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull;
        getpostalcode3.MediaSessionCompatQueueItem(1316527155);
        if ((i & 6) == 0) {
            int i5 = serializer + 99;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (getpostalcode3.IconCompatParcelizer(lookupandinterpolate)) {
                int i7 = IconCompatParcelizer + 95;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i9 = i2 | 48;
        if ((i9 & 19) != 18) {
            int i10 = serializer + 95;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (!getpostalcode3.write(i9 & 1, z)) {
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            r2 = modifier;
            getpostalcode2 = getpostalcode3;
            r4 = 1;
        } else {
            int i11 = IconCompatParcelizer + 5;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            Modifier.Companion companion = Modifier.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getCenterVertically(), getpostalcode3, 48);
            int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode3.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i13 = serializer + 17;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode3.ComponentActivity) {
                int i15 = IconCompatParcelizer + 55;
                serializer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    getpostalcode3.serializer(constructor);
                    int i16 = 34 / 0;
                } else {
                    getpostalcode3.serializer(constructor);
                }
            } else {
                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode3, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
            getpostalcode3.serializer(-1841842651);
            for (constrainedMap constrainedmap : lookupandinterpolate.write) {
                boolean z3 = getpostalcode3.read(constrainedmap.write);
                Object objComponentActivity = getpostalcode3.ComponentActivity();
                if (z3 || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = read(constrainedmap);
                    getpostalcode3.write(objComponentActivity);
                }
                Color color = (Color) objComponentActivity;
                if (color == null) {
                    int i17 = serializer + 95;
                    IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    getpostalcode3.serializer(-853800473);
                    jM732unboximpl = ColorResources_androidKt.colorResource(constrainedmap.IconCompatParcelizer, getpostalcode3, 0);
                    getpostalcode3.IconCompatParcelizer(false);
                } else {
                    getpostalcode3.serializer(-853803170);
                    getpostalcode3.IconCompatParcelizer(false);
                    jM732unboximpl = color.m732unboximpl();
                }
                IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(constrainedmap.serializer, getpostalcode3, 0), constrainedmap.write, SizeKt.m83size3ABfNKs(PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, Dimensions.getActionBarHideOffset, 0.0f, 11), Dimensions.setHideOnContentScrollEnabled), jM732unboximpl, getpostalcode3, Painter.$stable, 0);
            }
            getpostalcode3.IconCompatParcelizer(false);
            String str = lookupandinterpolate.IconCompatParcelizer;
            if (str == null) {
                getpostalcode3.serializer(-1262041753);
                getpostalcode3.IconCompatParcelizer(false);
                getpostalcode = getpostalcode3;
                z2 = true;
            } else {
                getpostalcode3.serializer(-1262041752);
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode3.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode3, 0, 0, 131066);
                getPostalCode getpostalcode4 = getpostalcode3;
                getpostalcode4.IconCompatParcelizer(false);
                z2 = true;
                getpostalcode = getpostalcode4;
            }
            getpostalcode.IconCompatParcelizer(z2);
            r2 = companion;
            getpostalcode2 = getpostalcode;
            r4 = z2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeMaxIntrinsicWidth(lookupandinterpolate, r2, i, r4);
        }
    }
}
