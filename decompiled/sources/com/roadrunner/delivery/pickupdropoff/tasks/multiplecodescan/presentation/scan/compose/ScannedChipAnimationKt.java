package com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.compose.ShelfNumberChipKt;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.ScannedChipAnimationKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.mainAxisk4lQ0M;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ScannedChipAnimationKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:102:0x0178  */
    /* JADX WARN: Code duplicated, block: B:139:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:141:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:142:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:144:0x02f6  */
    public static final void ScannedChipAnimation(final String str, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final Modifier modifier, final float f, final float f2, final float f3, final float f4, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        boolean z2;
        boolean z3;
        boolean z4;
        Animatable animatable;
        final Animatable animatable2;
        final Animatable animatable3;
        Boolean bool;
        getPostalCode getpostalcode2;
        boolean z5;
        MeasurePolicy measurePolicy;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        int i3;
        int i4 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull;
        getpostalcode3.MediaSessionCompatQueueItem(34768958);
        if ((i & 6) == 0) {
            i2 = (getpostalcode3.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode3.write(true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode3.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode3.read(modifier)) {
                int i5 = RemoteActionCompatParcelizer + 95;
                int i6 = i5 % Fields.SpotShadowColor;
                serializer = i6;
                i3 = i5 % 2 == 0 ? 22292 : Fields.CameraDistance;
                int i7 = i6 + 35;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode3.serializer(f) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode3.serializer(f2) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= !(getpostalcode3.serializer(f3) ^ true) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= getpostalcode3.serializer(f4) ? 8388608 : 4194304;
        }
        if ((i2 & 4793491) != 4793490) {
            z = true;
        } else {
            int i9 = serializer + 77;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z = false;
        }
        if (getpostalcode3.write(i2 & 1, z)) {
            Object objComponentActivity = getpostalcode3.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = mainAxisk4lQ0M.write(0.0f);
                getpostalcode3.write(objComponentActivity);
            }
            Animatable animatable4 = (Animatable) objComponentActivity;
            Object objComponentActivity2 = getpostalcode3.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = mainAxisk4lQ0M.write(0.0f);
                getpostalcode3.write(objComponentActivity2);
            }
            Animatable animatable5 = (Animatable) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode3.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = mainAxisk4lQ0M.write(1.0f);
                getpostalcode3.write(objComponentActivity3);
            }
            Animatable animatable6 = (Animatable) objComponentActivity3;
            Object objComponentActivity4 = getpostalcode3.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = mainAxisk4lQ0M.write(1.0f);
                getpostalcode3.write(objComponentActivity4);
            }
            Animatable animatable7 = (Animatable) objComponentActivity4;
            Boolean bool2 = Boolean.TRUE;
            if ((i2 & 112) == 32) {
                int i11 = serializer + 65;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            if ((3670016 & i2) == 1048576) {
                int i13 = RemoteActionCompatParcelizer + 25;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            int i15 = 57344 & i2;
            boolean z6 = i15 == 16384;
            if ((i2 & 29360128) == 8388608) {
                int i16 = RemoteActionCompatParcelizer + 49;
                serializer = i16 % Fields.SpotShadowColor;
                if (i16 % 2 == 0) {
                    z4 = false;
                } else {
                    z4 = true;
                }
            } else {
                z4 = false;
            }
            int i17 = 458752 & i2;
            boolean z7 = i17 == 131072;
            boolean zIconCompatParcelizer = getpostalcode3.IconCompatParcelizer(animatable4);
            boolean zIconCompatParcelizer2 = getpostalcode3.IconCompatParcelizer(animatable5);
            boolean zIconCompatParcelizer3 = getpostalcode3.IconCompatParcelizer(animatable7);
            boolean zIconCompatParcelizer4 = getpostalcode3.IconCompatParcelizer(animatable6);
            int i18 = i2;
            boolean z8 = (i2 & 896) == 256;
            Object objComponentActivity5 = getpostalcode3.ComponentActivity();
            if (((z2 | z3 | z6 | z4 | z7 | zIconCompatParcelizer | zIconCompatParcelizer2 | zIconCompatParcelizer3 | zIconCompatParcelizer4) || z8) || objComponentActivity5 == androidContentCaptureManager) {
                animatable = animatable6;
                animatable2 = animatable4;
                animatable3 = animatable5;
                bool = bool2;
                getpostalcode2 = getpostalcode3;
                ScannedChipAnimationKt$ScannedChipAnimation$1$1 scannedChipAnimationKt$ScannedChipAnimation$1$1 = new ScannedChipAnimationKt$ScannedChipAnimation$1$1(f3, f, f4, f2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, animatable2, animatable3, animatable7, animatable, null);
                getpostalcode2.write(scannedChipAnimationKt$ScannedChipAnimation$1$1);
                objComponentActivity5 = scannedChipAnimationKt$ScannedChipAnimation$1$1;
            } else {
                animatable = animatable6;
                animatable2 = animatable4;
                getpostalcode2 = getpostalcode3;
                bool = bool2;
                animatable3 = animatable5;
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, bool, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity5);
            boolean z9 = i15 == 16384;
            boolean zIconCompatParcelizer5 = getpostalcode2.IconCompatParcelizer(animatable2);
            boolean z10 = i17 == 131072;
            boolean zIconCompatParcelizer6 = getpostalcode2.IconCompatParcelizer(animatable3);
            Object objComponentActivity6 = getpostalcode2.ComponentActivity();
            if (!(zIconCompatParcelizer5 | z9 | z10) && !zIconCompatParcelizer6) {
                int i19 = RemoteActionCompatParcelizer + 19;
                serializer = i19 % Fields.SpotShadowColor;
                if (i19 % 2 == 0) {
                    z5 = false;
                    int i20 = 52 / 0;
                    if (objComponentActivity6 == androidContentCaptureManager) {
                    }
                } else {
                    z5 = false;
                    if (objComponentActivity6 == androidContentCaptureManager) {
                    }
                }
                getpostalcode = getpostalcode2;
                Modifier modifierM890graphicsLayer_6ThJ44$default = GraphicsLayerModifierKt.m890graphicsLayer_6ThJ44$default(LayoutModifierKt.layout(modifier, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity6), ((Number) animatable7.write()).floatValue(), ((Number) animatable7.write()).floatValue(), ((Number) animatable.write()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524280, null);
                measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), z5);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM890graphicsLayer_6ThJ44$default);
                companion = ComposeUiNode.Companion;
                constructor = companion.getConstructor();
                if (getpostalcode.read != null) {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    ShelfNumberChipKt.m4946ShelfNumberChiphGBTI10(str, true, null, 0.0f, null, getpostalcode, (i18 & 14) | 48, 28);
                    getpostalcode.IconCompatParcelizer(true);
                } else {
                    SentryUUID.write();
                    throw null;
                }
            } else {
                z5 = false;
            }
            objComponentActivity6 = new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: o.unaryMinusD9Ej5fM
                private static int MediaDescriptionCompat = 1;
                private static int read;

                @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i21 = 2 % 2;
                    androidx.compose.ui.layout.MeasureScope measureScope = (androidx.compose.ui.layout.MeasureScope) obj;
                    androidx.compose.ui.layout.Measurable measurable = (androidx.compose.ui.layout.Measurable) obj2;
                    measureScope.getClass();
                    measurable.getClass();
                    final androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(((androidx.compose.ui.unit.Constraints) obj3).m3632unboximpl());
                    int width = placeableMo2209measureBRTryo0.getWidth();
                    int height = placeableMo2209measureBRTryo0.getHeight();
                    final float f5 = f;
                    final androidx.compose.animation.core.Animatable animatable8 = animatable2;
                    final float f6 = f2;
                    final androidx.compose.animation.core.Animatable animatable9 = animatable3;
                    androidx.compose.ui.layout.MeasureResult measureResultLayout$default = androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, width, height, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.getInfinityD9Ej5fMannotations
                        private static int MediaDescriptionCompat = 0;
                        private static int RatingCompat = 1;

                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Object invoke(Object obj4) {
                            int i22 = 2 % 2;
                            int i23 = MediaDescriptionCompat + 33;
                            RatingCompat = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i24 = i23 % 2;
                            androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj4;
                            placementScope.getClass();
                            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeableMo2209measureBRTryo0, (int) (((Number) animatable8.write()).floatValue() + f5), (int) (((Number) animatable9.write()).floatValue() + f6), 0.0f, 4, null);
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i25 = MediaDescriptionCompat + 27;
                            RatingCompat = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i25 % 2 != 0) {
                                return createfromparcel;
                            }
                            Object obj5 = null;
                            obj5.hashCode();
                            throw null;
                        }
                    }, 4, null);
                    int i22 = MediaDescriptionCompat + 27;
                    read = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    return measureResultLayout$default;
                }
            };
            getpostalcode2.write(objComponentActivity6);
            getpostalcode = getpostalcode2;
            Modifier modifierM890graphicsLayer_6ThJ44$default2 = GraphicsLayerModifierKt.m890graphicsLayer_6ThJ44$default(LayoutModifierKt.layout(modifier, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity6), ((Number) animatable7.write()).floatValue(), ((Number) animatable7.write()).floatValue(), ((Number) animatable.write()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524280, null);
            measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), z5);
            iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM890graphicsLayer_6ThJ44$default2);
            companion = ComposeUiNode.Companion;
            constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                ShelfNumberChipKt.m4946ShelfNumberChiphGBTI10(str, true, null, 0.0f, null, getpostalcode, (i18 & 14) | 48, 28);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode = getpostalcode3;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.plus5rwHm24
                private static int MediaBrowserCompatMediaItem = 0;
                private static int MediaMetadataCompat = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i21 = 2 % 2;
                    int i22 = MediaBrowserCompatMediaItem + 67;
                    MediaMetadataCompat = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    ((Integer) obj2).getClass();
                    ScannedChipAnimationKt.ScannedChipAnimation(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, f, f2, f3, f4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i24 = MediaBrowserCompatMediaItem + 103;
                    MediaMetadataCompat = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i25 = i24 % 2;
                    return createfromparcel;
                }
            };
        }
    }
}
