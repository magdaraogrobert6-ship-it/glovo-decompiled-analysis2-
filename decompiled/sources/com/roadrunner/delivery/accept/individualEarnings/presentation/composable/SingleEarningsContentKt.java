package com.roadrunner.delivery.accept.individualEarnings.presentation.composable;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;
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
import o.AndroidAutofillManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPrefetchScheduler;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.SwitchDefaults;
import o.SwitchKt;
import o.TextFieldDefaults;
import o.accessgetReusableRectp;
import o.accessisInitializedcp;
import o.accesssetStaticLayoutConstructorcp;
import o.buildMapping;
import o.computeMaxIntrinsicWidth;
import o.constrainedMap;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.lookupAndInterpolate;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.runSyncInPlayAdIdSchedulerWithTimeout;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SingleEarningsContentKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r6.equals("Rain") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r6.equals("Bad Weather") != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.graphics.Color RemoteActionCompatParcelizer(o.constrainedMap r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r6 = r6.write
            int r1 = r6.hashCode()
            r2 = -2049983847(0xffffffff85cfba99, float:-1.9534732E-35)
            r3 = 0
            if (r1 == r2) goto L48
            int r2 = com.roadrunner.delivery.accept.individualEarnings.presentation.composable.SingleEarningsContentKt.RemoteActionCompatParcelizer
            int r4 = r2 + 113
            int r5 = r4 % 128
            com.roadrunner.delivery.accept.individualEarnings.presentation.composable.SingleEarningsContentKt.IconCompatParcelizer = r5
            int r4 = r4 % r0
            r4 = 2539444(0x26bfb4, float:3.558519E-39)
            if (r1 == r4) goto L3f
            int r2 = r2 + 107
            int r4 = r2 % 128
            com.roadrunner.delivery.accept.individualEarnings.presentation.composable.SingleEarningsContentKt.IconCompatParcelizer = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L3e
            r2 = 2581923(0x2765a3, float:3.618045E-39)
            if (r1 == r2) goto L2c
            goto L5e
        L2c:
            java.lang.String r1 = "Snow"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L50
            int r6 = com.roadrunner.delivery.accept.individualEarnings.presentation.composable.SingleEarningsContentKt.IconCompatParcelizer
            int r6 = r6 + 27
            int r1 = r6 % 128
            com.roadrunner.delivery.accept.individualEarnings.presentation.composable.SingleEarningsContentKt.RemoteActionCompatParcelizer = r1
            int r6 = r6 % r0
            goto L5e
        L3e:
            throw r3
        L3f:
            java.lang.String r0 = "Rain"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L50
            goto L5e
        L48:
            java.lang.String r0 = "Bad Weather"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L5e
        L50:
            r0 = 4278230481(0xff009dd1, double:2.1137267057E-314)
            long r0 = androidx.compose.ui.graphics.ColorKt.Color(r0)
            androidx.compose.ui.graphics.Color r6 = androidx.compose.ui.graphics.Color.m712boximpl(r0)
            return r6
        L5e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.individualEarnings.presentation.composable.SingleEarningsContentKt.RemoteActionCompatParcelizer(o.constrainedMap):androidx.compose.ui.graphics.Color");
    }

    public static final void write(getBirthDateFull getbirthdatefull, int i) {
        boolean z;
        int i2 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(179441142);
        if (i != 0) {
            int i3 = IconCompatParcelizer + 37;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = IconCompatParcelizer + 9;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            z = false;
        }
        if (getpostalcode.write(i & 1, z)) {
            BoxKt.Box(BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(SizeKt.m83size3ABfNKs(PaddingKt.m73paddingVpY3zN4$default(Modifier.Companion, Dimensions.getNestedScrollAxes, 0.0f, 2), Dimensions.RemoteActionCompatParcelizer), RoundedCornerShapeKt.IconCompatParcelizer), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onLayout(), RectangleShapeKt.getRectangleShape()), getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i7 = IconCompatParcelizer + 13;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new runSyncInPlayAdIdSchedulerWithTimeout(i, 3);
            int i9 = RemoteActionCompatParcelizer + 41;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
    }

    public static final void serializer(lookupAndInterpolate lookupandinterpolate, accessisInitializedcp accessisinitializedcp, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-977598220);
        if ((i & 6) == 0) {
            int i5 = IconCompatParcelizer + 19;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (getpostalcode.IconCompatParcelizer(lookupandinterpolate)) {
                int i7 = RemoteActionCompatParcelizer + 83;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
            int i9 = RemoteActionCompatParcelizer + 71;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                int i11 = IconCompatParcelizer + 57;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                zIconCompatParcelizer = getpostalcode.read(accessisinitializedcp);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(accessisinitializedcp);
            }
            i2 |= zIconCompatParcelizer ? 32 : 16;
        }
        int i13 = i2 | 384;
        if (getpostalcode.write(i13 & 1, (i13 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion;
            FlowLayoutKt.serializer(companion, Arrangement.IconCompatParcelizer, Arrangement.IconCompatParcelizer(Dimensions.getActionBarHideOffset), null, 0, 0, ExtrasKt.write(85417625, new PagerDefaults$$ExternalSyntheticLambda0(lookupandinterpolate, 7, accessisinitializedcp), getpostalcode), getpostalcode, ((i13 >> 6) & 14) | 1572912, 56);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 23, modifier2, (Object) lookupandinterpolate, (Object) accessisinitializedcp);
            int i14 = RemoteActionCompatParcelizer + 5;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
        }
    }

    public static final void serializer(accesssetStaticLayoutConstructorcp accesssetstaticlayoutconstructorcp, Modifier modifier, SwitchKt switchKt, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        SwitchKt switchDefaults;
        int i4;
        boolean zIconCompatParcelizer;
        int i5;
        int i6 = 2 % 2;
        accesssetstaticlayoutconstructorcp.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1841035373);
        if ((i & 6) == 0) {
            if ((i & 8) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(accesssetstaticlayoutconstructorcp);
            } else {
                int i7 = RemoteActionCompatParcelizer + 23;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    zIconCompatParcelizer = getpostalcode.read(accesssetstaticlayoutconstructorcp);
                } else {
                    getpostalcode.read(accesssetstaticlayoutconstructorcp);
                    throw null;
                }
            }
            if (zIconCompatParcelizer) {
                i5 = 4;
            } else {
                int i8 = RemoteActionCompatParcelizer + 1;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            int i10 = RemoteActionCompatParcelizer + 105;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i12 = RemoteActionCompatParcelizer + 29;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0 ? (i2 & 4) != 0 : (i2 & 3) != 0) {
                switchDefaults = switchKt;
            } else {
                switchDefaults = switchKt;
                if (getpostalcode.read(switchDefaults)) {
                    i4 = Fields.RotationX;
                }
                i3 |= i4;
            }
            i4 = Fields.SpotShadowColor;
            i3 |= i4;
        } else {
            switchDefaults = switchKt;
        }
        if (getpostalcode.write(i3 & 1, (i3 & 147) != 146)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            } else if ((i2 & 4) != 0) {
                float f = Dimensions.setActionBarVisibilityCallback;
                switchDefaults = new SwitchDefaults(f, f, f, f);
            }
            getpostalcode.RemoteActionCompatParcelizer();
            SurfaceKt.m126SurfaceT9BRK9s(SizeKt.write(modifier, 1.0f), null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), 0L, 0.0f, 0.0f, null, ExtrasKt.write(-728923982, new GapComposerKt$$ExternalSyntheticLambda0(switchDefaults, 16, accesssetstaticlayoutconstructorcp), getpostalcode), getpostalcode, 12582912, 122);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        SwitchKt switchKt2 = switchDefaults;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidAutofillManager(accesssetstaticlayoutconstructorcp, modifier, switchKt2, i, i2, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x004b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    /* JADX WARN: Code duplicated, block: B:17:0x0059 A[PHI: r3
  0x0059: PHI (r3v9 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x0031, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0033 A[PHI: r3
  0x0033: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x0031, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void Multiplier(accessisInitializedcp accessisinitializedcp, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        Modifier modifier2;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 43;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            accessisinitializedcp.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-363565481);
            if ((i & 109) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(accessisinitializedcp);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(accessisinitializedcp);
                    int i6 = RemoteActionCompatParcelizer + 97;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                }
                if (zIconCompatParcelizer) {
                    int i8 = IconCompatParcelizer + 95;
                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                int i10 = IconCompatParcelizer + 1;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i3 = i;
            }
        } else {
            accessisinitializedcp.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-363565481);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(accessisinitializedcp);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(accessisinitializedcp);
                    int i12 = RemoteActionCompatParcelizer + 97;
                    IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                }
                if (zIconCompatParcelizer) {
                    int i14 = IconCompatParcelizer + 95;
                    RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                int i16 = IconCompatParcelizer + 1;
                RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i3 = i;
            }
        }
        int i18 = i3 | 48;
        if (getpostalcode.write(i18 & 1, (i18 & 19) != 18)) {
            modifier2 = Modifier.Companion;
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            modifier2.getClass();
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, centerVertically, getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode.ComponentActivity) {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    int i19 = IconCompatParcelizer + 53;
                    RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    getpostalcode.serializer(constructor);
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_chevron_thick_double_up_right, getpostalcode, 0), accessisinitializedcp.write, SizeKt.m83size3ABfNKs(PaddingKt.m74paddingqDBjuR0$default(modifier2, 0.0f, 0.0f, Dimensions.getActionBarHideOffset, 0.0f, 11), Dimensions.setHideOnContentScrollEnabled), ColorResources_androidKt.colorResource(R.color.neutral_100, getpostalcode, 0), getpostalcode, Painter.$stable, 0);
                TextKt.m131TextNvy7gAk(accessisinitializedcp.IconCompatParcelizer, null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, FontWeight.Companion.getW400(), null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode, 1572864, 0, 131002);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(accessisinitializedcp, modifier2, i, 19);
        }
    }

    public static final void PromoBonus(lookupAndInterpolate lookupandinterpolate, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean z;
        Modifier modifier2;
        long jM732unboximpl;
        int i3;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 85;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1680348015);
        if ((i & 6) == 0) {
            if (getpostalcode2.IconCompatParcelizer(lookupandinterpolate)) {
                int i7 = IconCompatParcelizer + 51;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
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
        if (!getpostalcode2.write(i9 & 1, (i9 & 19) != 18)) {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            getpostalcode = getpostalcode2;
        } else {
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
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i10 = RemoteActionCompatParcelizer + 9;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            getpostalcode2.serializer(1025707873);
            int i12 = RemoteActionCompatParcelizer + 67;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            for (constrainedMap constrainedmap : lookupandinterpolate.write) {
                boolean z2 = getpostalcode2.read(constrainedmap.write);
                Object objComponentActivity = getpostalcode2.ComponentActivity();
                if (z2 || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = RemoteActionCompatParcelizer(constrainedmap);
                    getpostalcode2.write(objComponentActivity);
                }
                Color color = (Color) objComponentActivity;
                if (color == null) {
                    getpostalcode2.serializer(1227714851);
                    jM732unboximpl = ColorResources_androidKt.colorResource(constrainedmap.IconCompatParcelizer, getpostalcode2, 0);
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    getpostalcode2.serializer(1227712154);
                    getpostalcode2.IconCompatParcelizer(false);
                    jM732unboximpl = color.m732unboximpl();
                }
                long j = jM732unboximpl;
                int i14 = IconCompatParcelizer + 63;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(constrainedmap.serializer, getpostalcode2, 0), constrainedmap.write, SizeKt.m83size3ABfNKs(PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, Dimensions.getActionBarHideOffset, 0.0f, 11), Dimensions.setHideOnContentScrollEnabled), j, getpostalcode2, Painter.$stable, 0);
            }
            getpostalcode2.IconCompatParcelizer(false);
            String str = lookupandinterpolate.IconCompatParcelizer;
            if (str == null) {
                int i16 = RemoteActionCompatParcelizer + 3;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                if (i16 % 2 == 0) {
                    getpostalcode2.serializer(1732678540);
                    getpostalcode2.IconCompatParcelizer(true);
                } else {
                    getpostalcode2.serializer(1732678540);
                    getpostalcode2.IconCompatParcelizer(false);
                }
                getpostalcode = getpostalcode2;
                z = true;
            } else {
                getpostalcode2.serializer(1732678541);
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode2, 0, 0, 131066);
                getpostalcode = getpostalcode2;
                getpostalcode.IconCompatParcelizer(false);
                z = true;
            }
            getpostalcode.IconCompatParcelizer(z);
            modifier2 = companion;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeMaxIntrinsicWidth(lookupandinterpolate, modifier2, i, 2);
        }
    }
}
