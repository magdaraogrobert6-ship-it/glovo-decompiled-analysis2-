package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ExtendedFabLargeTokens;
import androidx.compose.material3.tokens.ExtendedFabPrimaryTokens;
import androidx.compose.material3.tokens.ExtendedFabSmallTokens;
import androidx.compose.material3.tokens.FabBaselineTokens;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.datastore.core.SimpleActor$offer$2;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.compose.AsyncImagePainter$launchJob$1;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidContentDataType;
import o.AutofillType;
import o.AutofillUtils_androidKt;
import o.ContentType;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ShortNewsContentCardView;
import o.UiMediaScopePostureCompanion;
import o.accessisRelatedToAutoCommit;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getBluntfpxItnM;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getWindowPosturem18o9QQ;
import o.onShowTranslationui;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;
import o.setImeVisible;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes.dex */
public abstract class FloatingActionButtonKt {
    public static final float read;
    public static final float write;

    static {
        int i = ExtendedFabSmallTokens.IconCompatParcelizer;
        ContentType contentType = ContentType.BodyLarge;
        int i2 = AutofillUtils_androidKt.IconCompatParcelizer;
        Dp.m3673constructorimpl(12.0f);
        int i3 = ExtendedFabLargeTokens.read;
        read = d$$ExternalSyntheticOutline0.m(16.0f, 16.0f, 12.0f, 20.0f);
        write = Dp.m3673constructorimpl(80.0f);
    }

    public static final void IconCompatParcelizer(final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final Modifier modifier, final Shape shape, final long j, long j2, getBluntfpxItnM getbluntfpxitnm, final MutableInteractionSourceImpl mutableInteractionSourceImpl, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        long jIconCompatParcelizer;
        getBluntfpxItnM getbluntfpxitnm2;
        getPostalCode getpostalcode;
        final long j3;
        final getBluntfpxItnM getbluntfpxitnm3;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(748201188);
        if ((i & 6) == 0) {
            i3 = (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.read(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode2.read(shape) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode2.serializer(j) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                jIconCompatParcelizer = j2;
                int i4 = getpostalcode2.serializer(jIconCompatParcelizer) ? Fields.Clip : 8192;
                i3 |= i4;
            } else {
                jIconCompatParcelizer = j2;
            }
            i3 |= i4;
        } else {
            jIconCompatParcelizer = j2;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                getbluntfpxitnm2 = getbluntfpxitnm;
                int i5 = getpostalcode2.read(getbluntfpxitnm2) ? Fields.RenderEffect : 65536;
                i3 |= i5;
            } else {
                getbluntfpxitnm2 = getbluntfpxitnm;
            }
            i3 |= i5;
        } else {
            getbluntfpxitnm2 = getbluntfpxitnm;
        }
        if ((1572864 & i) == 0) {
            i3 |= getpostalcode2.read(mutableInteractionSourceImpl) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 8388608 : 4194304;
        }
        if (getpostalcode2.write(i3 & 1, (4793491 & i3) != 4793490)) {
            getpostalcode2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0 || getpostalcode2.PlaybackStateCompat()) {
                if ((i2 & 16) != 0) {
                    jIconCompatParcelizer = getWindowPosturem18o9QQ.IconCompatParcelizer(j, getpostalcode2);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    getbluntfpxitnm2 = FloatingActionButtonDefaults.read(0.0f, 0.0f, 0.0f, 0.0f, 15);
                    i3 &= -458753;
                }
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
            }
            long j4 = jIconCompatParcelizer;
            getBluntfpxItnM getbluntfpxitnm4 = getbluntfpxitnm2;
            getpostalcode2.RemoteActionCompatParcelizer();
            int i6 = i3 << 9;
            getpostalcode = getpostalcode2;
            m114FloatingActionButtonlFWlFE(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, AndroidContentDataType.serializer(ExtendedFabPrimaryTokens.IconCompatParcelizer, getpostalcode2), FabBaselineTokens.RemoteActionCompatParcelizer, FabBaselineTokens.serializer, modifier, shape, j, j4, getbluntfpxitnm4, mutableInteractionSourceImpl, dragAndDropTargetModifierNode, getpostalcode, (i3 & 14) | 3456 | (57344 & i6) | (458752 & i6) | (3670016 & i6) | (29360128 & i6) | (234881024 & i6) | (i6 & 1879048192), (i3 >> 21) & 14);
            j3 = j4;
            getbluntfpxitnm3 = getbluntfpxitnm4;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            j3 = jIconCompatParcelizer;
            getbluntfpxitnm3 = getbluntfpxitnm2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getBookm18o9QQ
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    androidx.compose.material3.FloatingActionButtonKt.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, shape, j, j3, getbluntfpxitnm3, mutableInteractionSourceImpl, dragAndDropTargetModifierNode, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    public static final void IconCompatParcelizer(final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, Shape shape, long j, long j2, getBluntfpxItnM getbluntfpxitnm, final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        final Modifier modifier2;
        final Shape shape2;
        final long j3;
        final long j4;
        final getBluntfpxItnM getbluntfpxitnm2;
        Modifier modifier3;
        Shape shape3;
        long jWrite;
        int i3;
        long jIconCompatParcelizer;
        getBluntfpxItnM getbluntfpxitnm3;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1039585610);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 = i2 | 176;
        }
        if ((i & 3072) == 0) {
            i4 |= Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        int i5 = 1572864 | i4;
        if ((i & 12582912) == 0) {
            i5 |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? 8388608 : 4194304;
        }
        if (getpostalcode.write(i5 & 1, (4793491 & i5) != 4793490)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier;
                shape3 = shape;
                jWrite = j;
                jIconCompatParcelizer = j2;
                i3 = i5 & (-524161);
                getbluntfpxitnm3 = getbluntfpxitnm;
            } else {
                modifier3 = Modifier.Companion;
                int i6 = FloatingActionButtonDefaults.RemoteActionCompatParcelizer;
                shape3 = setImeVisible.read(ExtendedFabPrimaryTokens.write, getpostalcode);
                jWrite = getWindowPosturem18o9QQ.write(AutofillType.IconCompatParcelizer, getpostalcode);
                i3 = i5 & (-524161);
                jIconCompatParcelizer = getWindowPosturem18o9QQ.IconCompatParcelizer(jWrite, getpostalcode);
                getbluntfpxitnm3 = FloatingActionButtonDefaults.read(0.0f, 0.0f, 0.0f, 0.0f, 15);
            }
            getpostalcode.RemoteActionCompatParcelizer();
            IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier3, shape3, jWrite, jIconCompatParcelizer, getbluntfpxitnm3, null, ExtrasKt.write(-1233936436, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$1
                /* JADX WARN: Code duplicated, block: B:18:0x00a1  */
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(SizeKt.read(Modifier.Companion, FloatingActionButtonKt.write, 0.0f, 0.0f, 14), FloatingActionButtonKt.read, 0.0f, 2);
                        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = o.TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer, Alignment.Companion.getCenterVertically(), getpostalcode2, 54);
                        int iSerializer = SentryUUID.serializer(getpostalcode2);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM73paddingVpY3zN4$default);
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
                        AndroidContentCaptureManagerCompanion.write(getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, companion.getSetMeasurePolicy());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer, companion.getSetResolvedCompositionLocals());
                        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (getpostalcode2.ComponentActivity) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, setCompositeKeyHash);
                        } else {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode2.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, setCompositeKeyHash);
                            }
                        }
                        AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, companion.getSetModifier());
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(o.TextFieldKt.read, getpostalcode2, 6);
                        getpostalcode2.IconCompatParcelizer(true);
                    } else {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), getpostalcode, 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 3670016), 0);
            shape2 = shape3;
            getbluntfpxitnm2 = getbluntfpxitnm3;
            modifier2 = modifier3;
            j3 = jWrite;
            j4 = jIconCompatParcelizer;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            shape2 = shape;
            j3 = j;
            j4 = j2;
            getbluntfpxitnm2 = getbluntfpxitnm;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.accessgetBookcp
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    androidx.compose.material3.FloatingActionButtonKt.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, shape2, j3, j4, getbluntfpxitnm2, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: FloatingActionButton-lF-WlFE, reason: not valid java name */
    public static final void m114FloatingActionButtonlFWlFE(final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final TextStyle textStyle, final float f, final float f2, final Modifier modifier, final Shape shape, final long j, final long j2, final getBluntfpxItnM getbluntfpxitnm, final MutableInteractionSourceImpl mutableInteractionSourceImpl, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        int i4;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(121669932);
        if ((i & 6) == 0) {
            i3 = (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.read(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode.serializer(f) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode.serializer(f2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i3 |= getpostalcode.read(modifier) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= getpostalcode.read(shape) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= getpostalcode.serializer(j) ? 1048576 : Fields.BlendMode;
        }
        int i5 = i3;
        if ((12582912 & i) == 0) {
            i5 |= getpostalcode.serializer(j2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i5 |= getpostalcode.read(getbluntfpxitnm) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i5 |= getpostalcode.read(mutableInteractionSourceImpl) ? 536870912 : 268435456;
        }
        int i6 = i5;
        if ((i2 & 6) == 0) {
            i4 = i2 | (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (getpostalcode.write(i6 & 1, ((i6 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            getpostalcode.RemoteActionCompatParcelizer();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (mutableInteractionSourceImpl == null) {
                getpostalcode.serializer(-282833393);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = c8$$ExternalSyntheticOutline0.m(getpostalcode);
                }
                mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) objComponentActivity;
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(960707016);
                getpostalcode.IconCompatParcelizer(false);
                mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
            }
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new accessisRelatedToAutoCommit(25);
                getpostalcode.write(objComponentActivity2);
            }
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, 1, null);
            float f3 = getbluntfpxitnm.IconCompatParcelizer;
            int i7 = i6 >> 21;
            boolean z = getpostalcode.read(mutableInteractionSourceImpl2);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (z || objComponentActivity3 == androidContentCaptureManager) {
                FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = new FloatingActionButtonElevationAnimatable(getbluntfpxitnm.IconCompatParcelizer, getbluntfpxitnm.serializer, getbluntfpxitnm.read, getbluntfpxitnm.RemoteActionCompatParcelizer);
                getpostalcode.write(floatingActionButtonElevationAnimatable);
                objComponentActivity3 = floatingActionButtonElevationAnimatable;
            }
            FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable2 = (FloatingActionButtonElevationAnimatable) objComponentActivity3;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(floatingActionButtonElevationAnimatable2);
            boolean z2 = (((i7 & 112) ^ 48) > 32 && getpostalcode.read(getbluntfpxitnm)) || (i7 & 48) == 32;
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer | z2) || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new SimpleActor$offer$2(floatingActionButtonElevationAnimatable2, getbluntfpxitnm, (ShortNewsContentCardView) null, 3);
                getpostalcode.write(objComponentActivity4);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, getbluntfpxitnm, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4);
            boolean z3 = getpostalcode.read(mutableInteractionSourceImpl2);
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(floatingActionButtonElevationAnimatable2);
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if ((z3 | zIconCompatParcelizer2) || objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = new AsyncImagePainter$launchJob$1(mutableInteractionSourceImpl2, floatingActionButtonElevationAnimatable2, null, 2);
                getpostalcode.write(objComponentActivity5);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, mutableInteractionSourceImpl2, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity5);
            int i8 = i6 >> 6;
            SurfaceKt.m127Surfaceo_FOJdg(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierSemantics$default, false, shape, j, j2, f3, ((Dp) ((onShowTranslationui) floatingActionButtonElevationAnimatable2.serializer.IconCompatParcelizer.write).getValue()).m3687unboximpl(), null, mutableInteractionSourceImpl2, ExtrasKt.write(-1779603465, new UiMediaScopePostureCompanion(j2, textStyle, f, f2, dragAndDropTargetModifierNode), getpostalcode), getpostalcode, (i6 & 14) | (i8 & 7168) | (57344 & i8) | (i8 & 458752), 260);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.accessgetTabletopcp
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                    androidx.compose.material3.FloatingActionButtonKt.m114FloatingActionButtonlFWlFE(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, textStyle, f, f2, modifier, shape, j, j2, getbluntfpxitnm, mutableInteractionSourceImpl, dragAndDropTargetModifierNode, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }
}
