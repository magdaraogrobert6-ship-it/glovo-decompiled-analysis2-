package com.roadrunner.rrds.compose.component.buttons.slider;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.b8$$ExternalSyntheticLambda4;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt;
import io.sentry.SentryUUID;
import kotlinx.coroutines.DelayKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.ArrangementCenter1;
import o.ArrangementHorizontal;
import o.BoxMeasurePolicy;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.Iconww6aTOc;
import o.SnapFlingBehaviorKt;
import o.configConnectionForGET;
import o.getAccessibilityExtraKeyui;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.onShowTranslationui;
import o.placeSpaceBetweenfoundation_layout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M;
import o.r8lambdaeTmD53lKOnFij4CBzEIrqp4Jyw;
import o.r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.requiredWidthInVpY3zN4default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SliderButtonContainerKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    public static final void read(configConnectionForGET configconnectionforget, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3;
        int i3 = 2 % 2;
        int i4 = serializer + 65;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1329438259);
        if ((i & 6) == 0) {
            int i6 = serializer + 121;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 = (getpostalcode.read(configconnectionforget) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = serializer + 101;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i9 = RemoteActionCompatParcelizer + 25;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 |= getpostalcode.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i11 = i2 | 221184;
        if (getpostalcode.write(i11 & 1, (74899 & i11) != 74898)) {
            int i12 = serializer + 77;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new b8$$ExternalSyntheticLambda4(1);
                getpostalcode.write(objComponentActivity);
            }
            r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity;
            AndroidContentCaptureManagerCompanion.read(CompositionLocalsKt.getLocalLayoutDirection().write(LayoutDirection.Ltr), ExtrasKt.write(-270207347, new getAccessibilityExtraKeyui(configconnectionforget, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k3), getpostalcode), getpostalcode, 56);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(configconnectionforget, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, i, 25);
            int i14 = RemoteActionCompatParcelizer + 103;
            serializer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
        }
    }

    public static final void IconCompatParcelizer(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1752873952);
        if ((i & 6) == 0) {
            int i7 = RemoteActionCompatParcelizer + 53;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (getpostalcode.read(str)) {
                int i9 = RemoteActionCompatParcelizer + 119;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i11 = serializer + 39;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            i2 |= getpostalcode.serializer(0.8f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i4 = Fields.SpotShadowColor;
            } else {
                int i13 = RemoteActionCompatParcelizer + 59;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i4 = Fields.RotationX;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i15 = i2 | 24576;
        if ((196608 & i) == 0) {
            i15 |= getpostalcode.read((Object) null) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            int i16 = serializer + 33;
            RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2)) {
                int i18 = serializer + 113;
                RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                i3 = 1048576;
                if (i18 % 2 == 0) {
                    int i19 = 24 / 0;
                }
            } else {
                i3 = Fields.BlendMode;
            }
            i15 |= i3;
        }
        if (getpostalcode.write(i15 & 1, (599187 & i15) != 599186)) {
            Modifier.Companion companion = Modifier.Companion;
            Iconww6aTOc.serializer(SizeKt.write(companion, 1.0f), null, false, ExtrasKt.write(-1965243402, new r8lambdaeTmD53lKOnFij4CBzEIrqp4Jyw(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, str), getpostalcode), getpostalcode, 3072, 6);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, i, 26);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0 A[PHI: r7 r10 r11
  0x00f0: PHI (r7v12 androidx.compose.ui.Modifier) = (r7v11 androidx.compose.ui.Modifier), (r7v15 androidx.compose.ui.Modifier) binds: [B:52:0x00ee, B:49:0x00d9] A[DONT_GENERATE, DONT_INLINE]
  0x00f0: PHI (r10v6 o.ArrangementHorizontal) = (r10v5 o.ArrangementHorizontal), (r10v21 o.ArrangementHorizontal) binds: [B:52:0x00ee, B:49:0x00d9] A[DONT_GENERATE, DONT_INLINE]
  0x00f0: PHI (r11v1 float) = (r11v0 float), (r11v16 float) binds: [B:52:0x00ee, B:49:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5 A[PHI: r7 r10 r11
  0x00f5: PHI (r7v14 androidx.compose.ui.Modifier) = (r7v11 androidx.compose.ui.Modifier), (r7v15 androidx.compose.ui.Modifier) binds: [B:52:0x00ee, B:49:0x00d9] A[DONT_GENERATE, DONT_INLINE]
  0x00f5: PHI (r10v20 o.ArrangementHorizontal) = (r10v5 o.ArrangementHorizontal), (r10v21 o.ArrangementHorizontal) binds: [B:52:0x00ee, B:49:0x00d9] A[DONT_GENERATE, DONT_INLINE]
  0x00f5: PHI (r11v15 float) = (r11v0 float), (r11v16 float) binds: [B:52:0x00ee, B:49:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0167  */
    /* JADX INFO: renamed from: SliderHandle-t6yy7ic, reason: not valid java name */
    public static final void m5037SliderHandlet6yy7ic(final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, final long j, final long j2, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        boolean z;
        final Modifier modifier2;
        ArrangementHorizontal arrangementHorizontal;
        float f;
        float f2;
        float f3;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1342943449);
        if ((i & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i7 = serializer + 97;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i9 = serializer + 37;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i11 = RemoteActionCompatParcelizer + 57;
                serializer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i13 = RemoteActionCompatParcelizer + 113;
            serializer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                int i14 = 78 / 0;
                if (getpostalcode.serializer(j)) {
                    i3 = Fields.RotationX;
                } else {
                    i3 = Fields.SpotShadowColor;
                }
            } else if (!getpostalcode.serializer(j)) {
                i3 = Fields.SpotShadowColor;
            } else {
                i3 = Fields.RotationX;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.serializer(j2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i15 = i2 | 24576;
        if ((i15 & 9363) != 9362) {
            int i16 = serializer + 59;
            int i17 = i16 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i17;
            int i18 = i16 % 2;
            int i19 = i17 + 27;
            serializer = i19 % Fields.SpotShadowColor;
            if (i19 % 2 != 0) {
                int i20 = 5 / 5;
            }
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i15 & 1, z)) {
            int i21 = serializer + 105;
            RemoteActionCompatParcelizer = i21 % Fields.SpotShadowColor;
            if (i21 % 2 == 0) {
                modifier2 = Modifier.Companion;
                arrangementHorizontal = ArrangementCenter1.read("Slider handle animation", getpostalcode, 0);
                f = Dimensions.onConfigurationChanged;
                if (((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke()).booleanValue()) {
                    f2 = Dimensions.onActivityResult;
                    f3 = f;
                } else {
                    f3 = f;
                    f2 = f3;
                }
            } else {
                modifier2 = Modifier.Companion;
                arrangementHorizontal = ArrangementCenter1.read("Slider handle animation", getpostalcode, 0);
                f = Dimensions.onConfigurationChanged;
                if (((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke()).booleanValue()) {
                    f2 = Dimensions.onActivityResult;
                    f3 = f;
                } else {
                    f3 = f;
                    f2 = f3;
                }
            }
            placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layoutIconCompatParcelizer = ArrangementCenter1.IconCompatParcelizer(arrangementHorizontal, f3, f2, DelayKt.RemoteActionCompatParcelizer((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{1000, 0, SnapFlingBehaviorKt.IconCompatParcelizer, 2}), BoxMeasurePolicy.Reverse, 4), "Slider Handle grow shrink animation", getpostalcode, 28680, 0);
            boolean z2 = (i15 & 14) == 4;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z2) {
                objComponentActivity = new r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M(10, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity);
            } else {
                int i22 = serializer + 67;
                RemoteActionCompatParcelizer = i22 % Fields.SpotShadowColor;
                if (i22 % 2 == 0) {
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    throw null;
                }
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M(10, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity);
                }
            }
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(SizeKt.m75height3ABfNKs(SizeKt.m86width3ABfNKs(OffsetKt.RemoteActionCompatParcelizer(modifier2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity), Dp.m3673constructorimpl(((Number) ((onShowTranslationui) placespacebetweenfoundation_layoutIconCompatParcelizer.MediaSessionCompatQueueItem).getValue()).floatValue())), f3), j, RoundedCornerShapeKt.IconCompatParcelizer);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
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
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_bold_medium_arrow_right, getpostalcode, 0), "Arrow icon", SizeKt.m83size3ABfNKs(BoxScopeInstance.serializer.align(modifier2, companion.getCenter()), Dimensions.initializeViewTreeOwners), j2, getpostalcode, Painter.$stable | 48 | (i15 & 7168), 0);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.readLongField
                private static int MediaMetadataCompat = 0;
                private static int RatingCompat = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i23 = 2 % 2;
                    int i24 = RatingCompat + 41;
                    MediaMetadataCompat = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i25 = i24 % 2;
                    ((Integer) obj2).getClass();
                    SliderButtonContainerKt.m5037SliderHandlet6yy7ic(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, j, j2, modifier2, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i26 = RatingCompat + 65;
                    MediaMetadataCompat = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i27 = i26 % 2;
                    return createfromparcel;
                }
            };
            int i23 = RemoteActionCompatParcelizer + 13;
            serializer = i23 % Fields.SpotShadowColor;
            int i24 = i23 % 2;
        }
    }
}
