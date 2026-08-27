package com.roadrunner.rrds.compose.component.indicators.shimmer;

import androidx.compose.material3.TextKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.sqlite.SQLite;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.rrds.compose.component.indicators.shimmer.ShimmeringDotsKt;
import com.roadrunner.rrds.compose.component.indicators.shimmer.ShimmeringTextKt;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import io.sentry.SentryUUID;
import kotlinx.coroutines.DelayKt;
import o.AndroidContentCaptureManager;
import o.ArrangementCenter1;
import o.BoxMeasurePolicy;
import o.BrazeInAppMessageManagerExternalSyntheticLambda45;
import o.Iconww6aTOc;
import o.aspectRatiodefault;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onShowTranslationui;
import o.performMeasureDjhGOtQ;
import o.placeSpaceBetweenfoundation_layout;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.suspend;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ShimmeringTextKt {
    public static final aspectRatiodefault IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        Object[] objArr = {new BrazeInAppMessageManagerExternalSyntheticLambda45(8)};
        int iWrite = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        IconCompatParcelizer = (aspectRatiodefault) DelayKt.write(-1328669373, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), 1328669375, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), iWrite, objArr);
        int i = RemoteActionCompatParcelizer + 119;
        read = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static final void read(final String str, Modifier modifier, final TextStyle textStyle, final long j, long j2, final long j3, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        boolean z;
        final Modifier modifier2;
        final long j4;
        int i3;
        Modifier modifier3;
        long presenter;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1808783153);
        boolean z2 = true;
        if ((i & 6) == 0) {
            if (!getpostalcode.read(str)) {
                i4 = 2;
            } else {
                int i6 = serializer + 31;
                write = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 2 / 4;
                }
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i8 = i2 | 48;
        if ((i & 384) == 0) {
            i8 |= getpostalcode.read(textStyle) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i8 |= !(getpostalcode.serializer(j) ^ true) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i8 |= 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= getpostalcode.serializer(j3) ? Fields.RenderEffect : 65536;
        }
        if ((74899 & i8) != 74898) {
            z = true;
        } else {
            int i9 = write + 11;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z = false;
        }
        if (getpostalcode.write(i8 & 1, z)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i3 = i8 & (-57345);
                modifier3 = modifier;
                presenter = j2;
            } else {
                i3 = i8 & (-57345);
                modifier3 = Modifier.Companion;
                presenter = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
            }
            getpostalcode.RemoteActionCompatParcelizer();
            boolean z3 = (i3 & 14) == 4;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z3 || objComponentActivity == getCreditCardExpirationMonth.write) {
                String strRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(str, "...");
                if (strRemoteActionCompatParcelizer.length() != str.length()) {
                    int i11 = write + 87;
                    serializer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                } else {
                    z2 = false;
                }
                objComponentActivity = new suspend(strRemoteActionCompatParcelizer, z2);
                getpostalcode.write(objComponentActivity);
            }
            final suspend suspendVar = (suspend) objComponentActivity;
            final long j5 = presenter;
            int i13 = ((i3 >> 3) & 14) | 3072;
            modifier2 = modifier3;
            Iconww6aTOc.serializer(modifier2, null, false, ExtrasKt.write(-602888795, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: o.TimerCycle
                private static int MediaMetadataCompat = 1;
                private static int MediaSessionCompatQueueItem;

                @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z4;
                    int i14 = 2 % 2;
                    getShouldCreateCompositionOnAttachedToWindow getshouldcreatecompositiononattachedtowindow = (getShouldCreateCompositionOnAttachedToWindow) obj;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    getshouldcreatecompositiononattachedtowindow.getClass();
                    if ((iIntValue & 6) == 0) {
                        int i15 = MediaSessionCompatQueueItem + 3;
                        MediaMetadataCompat = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                        iIntValue |= ((getPostalCode) getbirthdatefull2).read(getshouldcreatecompositiononattachedtowindow) ? 4 : 2;
                    }
                    if ((iIntValue & 19) != 18) {
                        int i17 = MediaMetadataCompat + 51;
                        MediaSessionCompatQueueItem = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode2.write(iIntValue & 1, z4)) {
                        float fMo48toPx0680j_4 = ((androidx.compose.ui.unit.Density) getpostalcode2.write((getNewPassword) androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo48toPx0680j_4(((getWindow) getshouldcreatecompositiononattachedtowindow).read());
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
                        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(androidx.compose.foundation.layout.Arrangement.MediaBrowserCompatMediaItem, androidx.compose.ui.Alignment.Companion.getTop(), getpostalcode2, 0);
                        int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                        androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode2, companion);
                        androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.Companion;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                        if (getpostalcode2.read == null) {
                            SentryUUID.write();
                            throw null;
                        }
                        getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode2.ComponentActivity) {
                            int i19 = MediaMetadataCompat + 63;
                            MediaSessionCompatQueueItem = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i19 % 2 != 0) {
                                getpostalcode2.serializer(constructor);
                                throw null;
                            }
                            getpostalcode2.serializer(constructor);
                        } else {
                            getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                        suspend suspendVar2 = suspendVar;
                        ShimmeringTextKt.m5053ShimmeringTextComponentm1t1GE4(suspendVar2.write, textStyle, j, j5, j3, ShimmeringTextKt.IconCompatParcelizer, fMo48toPx0680j_4, null, getpostalcode2, 196608);
                        if (suspendVar2.RemoteActionCompatParcelizer) {
                            int i20 = MediaSessionCompatQueueItem + 109;
                            MediaMetadataCompat = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i21 = i20 % 2;
                            getpostalcode2.serializer(1952080977);
                            coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, androidx.compose.foundation.layout.SizeKt.m86width3ABfNKs(companion, androidx.compose.ui.unit.Dp.m3673constructorimpl(2.0f))});
                            ShimmeringDotsKt.m5051ShimmeringDotsFNF3uiM(null, null, 0L, getpostalcode2, 0);
                            getpostalcode2.IconCompatParcelizer(false);
                        } else {
                            getpostalcode2.serializer(1952180921);
                            getpostalcode2.IconCompatParcelizer(false);
                        }
                        getpostalcode2.IconCompatParcelizer(true);
                        int i22 = MediaSessionCompatQueueItem + 83;
                        MediaMetadataCompat = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i22 % 2 == 0) {
                            int i23 = 3 % 5;
                        }
                    } else {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), getpostalcode, i13, 6);
            j4 = presenter;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            j4 = j2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getFireIn
                private static int MediaMetadataCompat = 0;
                private static int MediaSessionCompatQueueItem = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i14 = 2 % 2;
                    int i15 = MediaSessionCompatQueueItem + 29;
                    MediaMetadataCompat = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    ((Integer) obj2).getClass();
                    ShimmeringTextKt.read(str, modifier2, textStyle, j, j4, j3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i17 = MediaMetadataCompat + 49;
                    MediaSessionCompatQueueItem = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i17 % 2 != 0) {
                        return createfromparcel;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ShimmeringTextComponent-m1t1GE4, reason: not valid java name */
    public static final void m5053ShimmeringTextComponentm1t1GE4(final String str, final TextStyle textStyle, final long j, final long j2, final long j3, final aspectRatiodefault aspectratiodefault, final float f, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        Modifier modifier2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        int i5 = serializer + 73;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1848355976);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            int i7 = serializer + 99;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i9 = write + 95;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 |= getpostalcode.read(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.serializer(j)) {
                int i11 = serializer + 21;
                write = i11 % Fields.SpotShadowColor;
                i3 = i11 % 2 != 0 ? 16154 : Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            int i12 = serializer + 21;
            write = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            i2 |= getpostalcode.serializer(j2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.serializer(j3) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            int i14 = serializer + 101;
            write = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                getpostalcode.read(aspectratiodefault);
                throw null;
            }
            i2 |= getpostalcode.read(aspectratiodefault) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.serializer(f) ? 1048576 : Fields.BlendMode;
        }
        int i15 = 12582912 | i2;
        if (getpostalcode.write(i15 & 1, (4793491 & i15) != 4793490)) {
            Modifier.Companion companion = Modifier.Companion;
            placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layoutIconCompatParcelizer = ArrangementCenter1.IconCompatParcelizer(ArrangementCenter1.read("shimmering_text_transition", getpostalcode, 0), 0.0f, 1.0f, DelayKt.RemoteActionCompatParcelizer(aspectratiodefault, (BoxMeasurePolicy) null, 6), "shimmering_text_progress", getpostalcode, 29112, 0);
            boolean zSerializer = getpostalcode.serializer(((Number) ((onShowTranslationui) placespacebetweenfoundation_layoutIconCompatParcelizer.MediaSessionCompatQueueItem).getValue()).floatValue());
            if ((3670016 & i15) == 1048576) {
                int i16 = write + 57;
                serializer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                z = true;
            } else {
                z = false;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((zSerializer | z) || objComponentActivity == androidContentCaptureManager) {
                float f2 = f / 2.0f;
                float fFloatValue = (((Number) ((onShowTranslationui) placespacebetweenfoundation_layoutIconCompatParcelizer.MediaSessionCompatQueueItem).getValue()).floatValue() * (f + f2)) + (-f2);
                objComponentActivity = Brush.Companion.m671linearGradientmHitzGk$default(Brush.Companion, SQLite.read(Color.m712boximpl(j2), Color.m712boximpl(j3), Color.m712boximpl(j2)), Offset.m469constructorimpl((((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue)) << 32)), Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fFloatValue + f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), 0, 8, (Object) null);
                getpostalcode.write(objComponentActivity);
            }
            Brush brush = (Brush) objComponentActivity;
            Modifier modifierM890graphicsLayer_6ThJ44$default = GraphicsLayerModifierKt.m890graphicsLayer_6ThJ44$default(companion, 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524283, null);
            boolean z2 = getpostalcode.read(brush);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z2 || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new TncContentKt$$ExternalSyntheticLambda2(18, brush);
                getpostalcode.write(objComponentActivity2);
            }
            TextKt.m131TextNvy7gAk(str, DrawModifierKt.drawWithContent(modifierM890graphicsLayer_6ThJ44$default, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2), j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode, i15 & 910, (i15 << 18) & 29360128, 131064);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final Modifier modifier3 = modifier2;
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.startIn
                private static int MediaBrowserCompatMediaItem = 0;
                private static int PlaybackStateCompat = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = 2 % 2;
                    int i19 = PlaybackStateCompat + 59;
                    MediaBrowserCompatMediaItem = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    ShimmeringTextKt.m5053ShimmeringTextComponentm1t1GE4(str, textStyle, j, j2, j3, aspectratiodefault, f, modifier3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i21 = PlaybackStateCompat + 35;
                    MediaBrowserCompatMediaItem = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    return createfromparcel;
                }
            };
        }
    }
}
