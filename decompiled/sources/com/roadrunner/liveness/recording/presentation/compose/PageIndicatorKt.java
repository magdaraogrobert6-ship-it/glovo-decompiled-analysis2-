package com.roadrunner.liveness.recording.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.unit.Dp;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.liveness.recording.presentation.compose.PageIndicatorKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.TextFieldDefaults;
import o.accessparse;
import o.buildMapping;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PageIndicatorKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    /* JADX WARN: Code duplicated, block: B:14:0x0044 A[PHI: r8
  0x0044: PHI (r8v9 o.getPostalCode) = (r8v5 o.getPostalCode), (r8v11 o.getPostalCode) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0030 A[PHI: r8
  0x0030: PHI (r8v6 o.getPostalCode) = (r8v5 o.getPostalCode), (r8v11 o.getPostalCode) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void RemoteActionCompatParcelizer(final float f, final long j, final long j2, final float f2, getBirthDateFull getbirthdatefull, final int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = IconCompatParcelizer + 81;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1779318065);
            if ((i & 100) == 0) {
                if (getpostalcode.serializer(f)) {
                    int i8 = RemoteActionCompatParcelizer + 41;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1779318065);
            if ((i & 6) == 0) {
                if (getpostalcode.serializer(f)) {
                    int i10 = RemoteActionCompatParcelizer + 41;
                    IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
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
            if (getpostalcode.serializer(j)) {
                int i12 = RemoteActionCompatParcelizer + 89;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.serializer(j2)) {
                int i14 = RemoteActionCompatParcelizer + 109;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                i4 = i14 % 2 == 0 ? 11945 : Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i3 |= i4;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode.serializer(f2) ^ true ? Fields.RotationZ : Fields.CameraDistance;
            int i15 = IconCompatParcelizer + 95;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            int i17 = RemoteActionCompatParcelizer + 27;
            IconCompatParcelizer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            Modifier modifierM84sizeVpY3zN4 = SizeKt.m84sizeVpY3zN4(PaddingKt.write(Modifier.Companion, Dimensions.setPrimaryBackground), f, f);
            getTopLeftannotations gettopleftannotations = RoundedCornerShapeKt.IconCompatParcelizer;
            BoxKt.Box(BackgroundKt.m20backgroundbw27NRU(BorderKt.write(modifierM84sizeVpY3zN4, f2, j2, gettopleftannotations), j, gettopleftannotations), getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.TransitionValuesMaps
                private static int MediaBrowserCompatMediaItem = 1;
                private static int MediaSessionCompatQueueItem;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = 2 % 2;
                    int i20 = MediaBrowserCompatMediaItem + 109;
                    MediaSessionCompatQueueItem = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    ((Integer) obj2).intValue();
                    PageIndicatorKt.RemoteActionCompatParcelizer(f, j, j2, f2, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i22 = MediaBrowserCompatMediaItem + 111;
                    MediaSessionCompatQueueItem = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    return createfromparcel;
                }
            };
        }
    }

    public static final void PageIndicator(int i, int i2, Modifier modifier, getBirthDateFull getbirthdatefull, int i3) {
        int i4;
        boolean z;
        float fM3673constructorimpl;
        long overflowReserved;
        long jM757getTransparent0d7_KjU;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = RemoteActionCompatParcelizer + 3;
        IconCompatParcelizer = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-264316712);
        if ((i3 & 6) == 0) {
            if (getpostalcode.read(i)) {
                int i10 = RemoteActionCompatParcelizer + 15;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i4 = i6 | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= getpostalcode.read(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i12 = RemoteActionCompatParcelizer + 19;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                i5 = i12 % 2 == 0 ? 15329 : Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i4 |= i5;
        }
        if ((i4 & 147) != 146) {
            int i13 = IconCompatParcelizer + 5;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i4 & 1, z)) {
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer, Alignment.Companion.getCenterVertically(), getpostalcode, 54);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                int i15 = IconCompatParcelizer + 43;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen.indicator_stroke_width, getpostalcode, 0);
                    getpostalcode.serializer(240887393);
                    for (int i16 = 0; i16 < i; i16++) {
                        if (i16 < i2) {
                            getpostalcode.serializer(373949841);
                            fM3673constructorimpl = Dimensions.getNestedScrollAxes;
                            overflowReserved = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSupportBackgroundTintList();
                            jM757getTransparent0d7_KjU = Color.Companion.m757getTransparent0d7_KjU();
                            getpostalcode.IconCompatParcelizer(false);
                        } else if (i16 == i2) {
                            getpostalcode.serializer(374163493);
                            fM3673constructorimpl = Dp.m3673constructorimpl(Dimensions.getNestedScrollAxes + fDimensionResource);
                            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                            long popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme();
                            long presenter = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter();
                            getpostalcode.IconCompatParcelizer(false);
                            overflowReserved = popupTheme;
                            jM757getTransparent0d7_KjU = presenter;
                        } else {
                            getpostalcode.serializer(374372371);
                            fM3673constructorimpl = Dimensions.getNestedScrollAxes;
                            overflowReserved = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOverflowReserved();
                            jM757getTransparent0d7_KjU = Color.Companion.m757getTransparent0d7_KjU();
                            getpostalcode.IconCompatParcelizer(false);
                        }
                        RemoteActionCompatParcelizer(fM3673constructorimpl, overflowReserved, jM757getTransparent0d7_KjU, fDimensionResource, getpostalcode, 0);
                    }
                    getpostalcode.IconCompatParcelizer(false);
                    getpostalcode.IconCompatParcelizer(true);
                } else {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    boolean z2 = getpostalcode.ComponentActivity;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessparse(i, i2, modifier, i3, 0);
        }
    }
}
