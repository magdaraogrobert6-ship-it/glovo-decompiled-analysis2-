package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import io.sentry.SentryUUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidAutofillManager_androidKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DefaultLazyKey;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.MediaQuery_androidKtobtainUiMediaScope11;
import o.ZIndexNode;
import o.accessisAutofillable;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getBottomEnd;
import o.getCenterHorizontally;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPointerInputFilterannotations;
import o.getPostalCode;
import o.notifyViewVisibilityChanged;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;
import o.runDetachLifecycleui;

/* JADX INFO: loaded from: classes.dex */
public abstract class OutlinedTextFieldKt {
    public static final float read = Dp.m3673constructorimpl(4.0f);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OutlinedTextField(final String str, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final Modifier modifier, final boolean z, final TextStyle textStyle, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde4, final boolean z2, final VisualTransformation visualTransformation, final getCenterHorizontally getcenterhorizontally, final getBottomEnd getbottomend, boolean z3, final int i, int i2, MutableInteractionSourceImpl mutableInteractionSourceImpl, final Shape shape, final TextFieldColors textFieldColors, getBirthDateFull getbirthdatefull, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde5;
        final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde6;
        final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde7;
        final boolean z4;
        final int i10;
        final MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        getPostalCode getpostalcode;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde8;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde9;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde10;
        boolean z5;
        int i11;
        int i12;
        MutableInteractionSourceImpl mutableInteractionSourceImpl4;
        long j;
        long j2;
        boolean z6;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1901501544);
        if ((i3 & 6) == 0) {
            i7 = (getpostalcode2.read(str) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        int i13 = i3 & 384;
        int i14 = Fields.SpotShadowColor;
        if (i13 == 0) {
            i7 |= getpostalcode2.read(modifier) ? 256 : 128;
        }
        int i15 = i3 & 3072;
        int i16 = Fields.CameraDistance;
        if (i15 == 0) {
            i7 |= getpostalcode2.write(z) ? 2048 : 1024;
        }
        if ((i6 & 16) != 0) {
            i7 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i7 |= getpostalcode2.write(false) ? Fields.Clip : 8192;
        }
        if ((196608 & i3) == 0) {
            i7 |= getpostalcode2.read(textStyle) ? 131072 : 65536;
        }
        if ((i6 & 64) != 0) {
            i7 |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            i7 |= getpostalcode2.IconCompatParcelizer((Object) null) ? 1048576 : Fields.BlendMode;
        }
        if ((i3 & 12582912) == 0) {
            i7 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 8388608 : 4194304;
        }
        int i17 = i6 & Fields.RotationX;
        if (i17 != 0) {
            i7 |= 100663296;
        } else if ((i3 & 100663296) == 0) {
            i7 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i7 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde2) ? 536870912 : 268435456;
        }
        int i18 = i6 & Fields.RotationZ;
        if (i18 != 0) {
            i8 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i8 = i4 | (getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde3) ? 4 : 2);
        } else {
            i8 = i4;
        }
        int i19 = i6 & Fields.CameraDistance;
        if (i19 != 0) {
            i8 |= 48;
        } else if ((i4 & 48) == 0) {
            i8 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde4) ? 32 : 16;
        }
        int i20 = i8 | 384;
        if ((i4 & 3072) == 0) {
            if (!getpostalcode2.write(z2)) {
                i16 = 1024;
            }
            i20 |= i16;
        }
        if ((i4 & 24576) == 0) {
            i20 |= getpostalcode2.read(visualTransformation) ? Fields.Clip : 8192;
        }
        if ((i4 & 196608) == 0) {
            i20 |= getpostalcode2.read(getcenterhorizontally) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i20 |= getpostalcode2.read(getbottomend) ? 1048576 : Fields.BlendMode;
        }
        int i21 = i6 & Fields.RenderEffect;
        if (i21 != 0) {
            i20 |= 12582912;
        } else if ((i4 & 12582912) == 0) {
            i20 |= getpostalcode2.write(z3) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i20 |= getpostalcode2.read(i) ? 67108864 : 33554432;
        }
        int i22 = i6 & 1048576;
        if (i22 != 0) {
            i9 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i9 = i5 | (getpostalcode2.read(mutableInteractionSourceImpl) ? 4 : 2);
        } else {
            i9 = i5;
        }
        if ((i5 & 48) == 0) {
            i9 |= getpostalcode2.read(shape) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            if (getpostalcode2.read(textFieldColors)) {
                i14 = 256;
            }
            i9 |= i14;
        }
        if (getpostalcode2.write(i7 & 1, ((i7 & 306783379) == 306783378 && ((i20 | 805306368) & 306783379) == 306783378 && (i9 & 147) == 146) ? false : true)) {
            getpostalcode2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i3 & 1) == 0 || getpostalcode2.PlaybackStateCompat()) {
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde11 = i17 != 0 ? null : r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde12 = i18 != 0 ? null : r8lambdaa6_tctqmksh3fk6hjgcbkuvde3;
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde13 = i19 != 0 ? null : r8lambdaa6_tctqmksh3fk6hjgcbkuvde4;
                boolean z7 = i21 != 0 ? false : z3;
                mutableInteractionSourceImpl3 = i22 != 0 ? null : mutableInteractionSourceImpl;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde8 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde11;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde9 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde12;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde10 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde13;
                z5 = z7;
                i11 = 1;
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde8 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde9 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde3;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde10 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde4;
                z5 = z3;
                i11 = i2;
                mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
            }
            getpostalcode2.RemoteActionCompatParcelizer();
            if (mutableInteractionSourceImpl3 == null) {
                getpostalcode2.serializer(1310051731);
                Object objComponentActivity = getpostalcode2.ComponentActivity();
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = c8$$ExternalSyntheticOutline0.m(getpostalcode2);
                }
                i12 = 0;
                getpostalcode2.IconCompatParcelizer(false);
                mutableInteractionSourceImpl4 = (MutableInteractionSourceImpl) objComponentActivity;
            } else {
                i12 = 0;
                getpostalcode2.serializer(1981921732);
                getpostalcode2.IconCompatParcelizer(false);
                mutableInteractionSourceImpl4 = mutableInteractionSourceImpl3;
            }
            getpostalcode2.serializer(1981927842);
            long jM3106getColor0d7_KjU = textStyle.m3106getColor0d7_KjU();
            if (jM3106getColor0d7_KjU != 16) {
                z6 = i12;
                j2 = jM3106getColor0d7_KjU;
            } else {
                boolean zBooleanValue = ((Boolean) getPointerInputFilterannotations.RemoteActionCompatParcelizer(mutableInteractionSourceImpl4, getpostalcode2, i12).getValue()).booleanValue();
                if (!z) {
                    j = textFieldColors.RatingCompat;
                } else if (z2) {
                    j = textFieldColors.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                } else if (zBooleanValue) {
                    j = textFieldColors._init_lambda3;
                } else {
                    j = textFieldColors.fullyDrawnReporter_delegatelambda00;
                }
                j2 = j;
                z6 = 0;
            }
            getpostalcode2.IconCompatParcelizer(z6);
            getPostalCode getpostalcode3 = getpostalcode2;
            AndroidContentCaptureManagerCompanion.read(runDetachLifecycleui.read.write(textFieldColors._init_lambda1), ExtrasKt.write(1874034984, new MediaQuery_androidKtobtainUiMediaScope11(modifier, z2, textFieldColors, str, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z, textStyle.merge(new TextStyle(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null)), getcenterhorizontally, getbottomend, z5, i, i11, visualTransformation, mutableInteractionSourceImpl4, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde8, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde9, r8lambdaa6_tctqmksh3fk6hjgcbkuvde10, shape), getpostalcode3), getpostalcode3, 56);
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde5 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde8;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde6 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde9;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde7 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde10;
            z4 = z5;
            i10 = i11;
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl3;
            getpostalcode = getpostalcode3;
        } else {
            getPostalCode getpostalcode4 = getpostalcode2;
            getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde5 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde6 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde3;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde7 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde4;
            z4 = z3;
            i10 = i2;
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
            getpostalcode = getpostalcode4;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.MediaQuery_androidKtobtainUiMediaScope111
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i4);
                    int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i5);
                    androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(str, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, z, textStyle, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde5, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde6, r8lambdaa6_tctqmksh3fk6hjgcbkuvde7, z2, visualTransformation, getcenterhorizontally, getbottomend, z4, i, i10, mutableInteractionSourceImpl2, shape, textFieldColors, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, iRemoteActionCompatParcelizer3, i6);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0265  */
    /* JADX WARN: Code duplicated, block: B:172:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:184:0x038c  */
    /* JADX WARN: Code duplicated, block: B:208:0x0471  */
    /* JADX WARN: Code duplicated, block: B:221:0x0528  */
    /* JADX WARN: Code duplicated, block: B:245:0x061a  */
    /* JADX WARN: Code duplicated, block: B:261:0x0664 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:264:0x0669  */
    /* JADX WARN: Code duplicated, block: B:267:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:269:0x06af  */
    /* JADX WARN: Code duplicated, block: B:270:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:273:0x06be  */
    /* JADX WARN: Code duplicated, block: B:275:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:277:0x070a  */
    /* JADX WARN: Code duplicated, block: B:292:0x07a0  */
    public static final void OutlinedTextFieldLayout(final Modifier modifier, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde4, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde5, final boolean z, final AndroidAutofillManager_androidKt androidAutofillManager_androidKt, final notifyViewVisibilityChanged notifyviewvisibilitychanged, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde6, final o.SwitchKt switchKt, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        int i4;
        getPostalCode getpostalcode;
        float f;
        boolean z2;
        notifyViewVisibilityChanged notifyviewvisibilitychanged2;
        AndroidContentCaptureManager androidContentCaptureManager;
        boolean z3;
        Object objComponentActivity;
        int i5;
        MeasurePolicy measurePolicy;
        int iSerializer;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M;
        boolean zIconCompatParcelizer;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(753699262);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            i3 = i | (getpostalcode2.read(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        int i6 = i & 384;
        int i7 = Fields.RotationX;
        if (i6 == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? 256 : 128;
        }
        int i8 = i & 3072;
        int i9 = Fields.CameraDistance;
        if (i8 == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde2) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde3) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde4) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde5) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= getpostalcode2.write(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= getpostalcode2.read(androidAutofillManager_androidKt) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(notifyviewvisibilitychanged);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(notifyviewvisibilitychanged);
            }
            i4 = i2 | (zIconCompatParcelizer ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (!getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                i7 = 128;
            }
            i4 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (!getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde6)) {
                i9 = 1024;
            }
            i4 |= i9;
        }
        if ((i2 & 24576) == 0) {
            i4 |= getpostalcode2.read(switchKt) ? Fields.Clip : 8192;
        }
        int i10 = i4;
        if (getpostalcode2.write(i3 & 1, ((i3 & 306783379) == 306783378 && (i10 & 9363) == 9362) ? false : true)) {
            float fTextFieldHorizontalIconPadding = TextFieldImplKt.textFieldHorizontalIconPadding(getpostalcode2);
            boolean z4 = (i10 & 112) == 32;
            boolean z5 = (i3 & 234881024) == 67108864;
            boolean z6 = (i3 & 1879048192) == 536870912;
            int i11 = i10 & 14;
            boolean z7 = i11 == 4 || ((i10 & 8) != 0 && getpostalcode2.read(notifyviewvisibilitychanged));
            boolean z8 = (i10 & 57344) == 16384;
            boolean zSerializer = getpostalcode2.serializer(fTextFieldHorizontalIconPadding);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
            if (((z4 | z5 | z6 | z7 | z8) || zSerializer) || objComponentActivity2 == androidContentCaptureManager2) {
                f = fTextFieldHorizontalIconPadding;
                getpostalcode = getpostalcode2;
                OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = new OutlinedTextFieldMeasurePolicy(r8lambdaunavo3sxub_pc9xroryotnrlvsm, z, androidAutofillManager_androidKt, notifyviewvisibilitychanged, switchKt, f);
                getpostalcode.write(outlinedTextFieldMeasurePolicy);
                objComponentActivity2 = outlinedTextFieldMeasurePolicy;
            } else {
                getpostalcode = getpostalcode2;
                f = fTextFieldHorizontalIconPadding;
            }
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy2 = (OutlinedTextFieldMeasurePolicy) objComponentActivity2;
            LayoutDirection layoutDirection = (LayoutDirection) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalLayoutDirection());
            int iSerializer2 = SentryUUID.serializer(getpostalcode);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                AndroidContentCaptureManagerCompanion.write(getpostalcode, outlinedTextFieldMeasurePolicy2, companion.getSetMeasurePolicy());
                AndroidContentCaptureManagerCompanion.write(getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2, companion.getSetResolvedCompositionLocals());
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (getpostalcode.ComponentActivity) {
                    c8$$ExternalSyntheticOutline0.m(iSerializer2, getpostalcode, iSerializer2, setCompositeKeyHash);
                } else {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer2)}, getCieXyz.write())).booleanValue()) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer2, getpostalcode, iSerializer2, setCompositeKeyHash);
                    }
                }
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, companion.getSetModifier());
                dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf((i10 >> 6) & 14));
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 != null) {
                    getpostalcode.serializer(2145628269);
                    Modifier modifierThen = LayoutIdKt.layoutId(Modifier.Companion, "Leading").then(ZIndexNode.serializer);
                    MeasurePolicy measurePolicy2 = BoxKt.read(Alignment.Companion.getCenter(), false);
                    int iSerializer3 = SentryUUID.serializer(getpostalcode);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor3);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M2 = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                    if (getpostalcode.ComponentActivity) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer3, getpostalcode, iSerializer3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M2);
                    } else {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer3)}, getCieXyz.write())).booleanValue()) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer3, getpostalcode, iSerializer3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M2);
                        }
                    }
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, companion.getSetModifier());
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde2.invoke(getpostalcode, Integer.valueOf((i3 >> 12) & 14));
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(2145874285);
                    getpostalcode.IconCompatParcelizer(false);
                }
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 != null) {
                    getpostalcode.serializer(2145917003);
                    Modifier modifierThen2 = LayoutIdKt.layoutId(Modifier.Companion, "Trailing").then(ZIndexNode.serializer);
                    MeasurePolicy measurePolicy3 = BoxKt.read(Alignment.Companion.getCenter(), false);
                    int iSerializer4 = SentryUUID.serializer(getpostalcode);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen2);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor4);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M3 = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy3, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                    if (getpostalcode.ComponentActivity) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer4, getpostalcode, iSerializer4, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M3);
                    } else {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer4)}, getCieXyz.write())).booleanValue()) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer4, getpostalcode, iSerializer4, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M3);
                        }
                    }
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, companion.getSetModifier());
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde3.invoke(getpostalcode, Integer.valueOf((i3 >> 15) & 14));
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(2146164941);
                    getpostalcode.IconCompatParcelizer(false);
                }
                float fSerializer = PaddingKt.serializer(switchKt, layoutDirection);
                float fIconCompatParcelizer = PaddingKt.IconCompatParcelizer(switchKt, layoutDirection);
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 != null) {
                    float fM3673constructorimpl = Dp.m3673constructorimpl(fSerializer - f);
                    float fM3673constructorimpl2 = Dp.m3673constructorimpl(0.0f);
                    if (fM3673constructorimpl < fM3673constructorimpl2) {
                        fM3673constructorimpl = fM3673constructorimpl2;
                    }
                    fSerializer = Dp.m3673constructorimpl(fM3673constructorimpl);
                }
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 != null) {
                    float fM3673constructorimpl3 = Dp.m3673constructorimpl(fIconCompatParcelizer - f);
                    float fM3673constructorimpl4 = Dp.m3673constructorimpl(0.0f);
                    if (fM3673constructorimpl3 < fM3673constructorimpl4) {
                        fM3673constructorimpl3 = fM3673constructorimpl4;
                    }
                    fIconCompatParcelizer = Dp.m3673constructorimpl(fM3673constructorimpl3);
                }
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde4 != null) {
                    getpostalcode.serializer(2146868920);
                    Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(SizeKt.serializer(SizeKt.m76heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "Prefix"), TextFieldImplKt.write, 0.0f, 2), (Alignment.Vertical) null, 3), fSerializer, 0.0f, TextFieldImplKt.read, 0.0f, 10);
                    MeasurePolicy measurePolicy4 = BoxKt.read(Alignment.Companion.getTopStart(), false);
                    int iSerializer5 = SentryUUID.serializer(getpostalcode);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer5 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor5 = companion.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor5);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M4 = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy4, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer5);
                    if (getpostalcode.ComponentActivity) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer5, getpostalcode, iSerializer5, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M4);
                    } else {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer5)}, getCieXyz.write())).booleanValue()) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer5, getpostalcode, iSerializer5, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M4);
                        }
                    }
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier5, companion.getSetModifier());
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde4.invoke(getpostalcode, Integer.valueOf((i3 >> 18) & 14));
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(2147196621);
                    getpostalcode.IconCompatParcelizer(false);
                }
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde5 != null) {
                    getpostalcode.serializer(2147239866);
                    Modifier modifierM74paddingqDBjuR0$default2 = PaddingKt.m74paddingqDBjuR0$default(SizeKt.serializer(SizeKt.m76heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "Suffix"), TextFieldImplKt.write, 0.0f, 2), (Alignment.Vertical) null, 3), TextFieldImplKt.read, 0.0f, fIconCompatParcelizer, 0.0f, 10);
                    MeasurePolicy measurePolicy5 = BoxKt.read(Alignment.Companion.getTopStart(), false);
                    int iSerializer6 = SentryUUID.serializer(getpostalcode);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer6 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default2);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor6 = companion.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor6);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M5 = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy5, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer6);
                    if (getpostalcode.ComponentActivity) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer6, getpostalcode, iSerializer6, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M5);
                    } else {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer6)}, getCieXyz.write())).booleanValue()) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer6, getpostalcode, iSerializer6, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M5);
                        }
                    }
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier6, companion.getSetModifier());
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde5.invoke(getpostalcode, Integer.valueOf((i3 >> 21) & 14));
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-2147401651);
                    getpostalcode.IconCompatParcelizer(false);
                }
                Modifier.Companion companion2 = Modifier.Companion;
                Modifier modifierSerializer = SizeKt.serializer(SizeKt.m76heightInVpY3zN4$default(companion2, TextFieldImplKt.write, 0.0f, 2), (Alignment.Vertical) null, 3);
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde4 != null) {
                    fSerializer = Dp.m3673constructorimpl(0.0f);
                }
                Modifier modifierM74paddingqDBjuR0$default3 = PaddingKt.m74paddingqDBjuR0$default(modifierSerializer, fSerializer, 0.0f, r8lambdaa6_tctqmksh3fk6hjgcbkuvde5 == null ? fIconCompatParcelizer : Dp.m3673constructorimpl(0.0f), 0.0f, 10);
                if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry != null) {
                    getpostalcode.serializer(-2147031666);
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(modifierM74paddingqDBjuR0$default3), getpostalcode, Integer.valueOf((i3 >> 3) & 112));
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-2146940371);
                    getpostalcode.IconCompatParcelizer(false);
                }
                Modifier modifierThen3 = LayoutIdKt.layoutId(companion2, "TextField").then(modifierM74paddingqDBjuR0$default3);
                Alignment.Companion companion3 = Alignment.Companion;
                MeasurePolicy measurePolicy6 = BoxKt.read(companion3.getTopStart(), true);
                int iSerializer7 = SentryUUID.serializer(getpostalcode);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer7 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen3);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor7 = companion.getConstructor();
                if (getaddresscountry != null) {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor7);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M6 = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy6, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer7);
                    if (getpostalcode.ComponentActivity) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer7, getpostalcode, iSerializer7, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M6);
                    } else {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer7)}, getCieXyz.write())).booleanValue()) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer7, getpostalcode, iSerializer7, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M6);
                        }
                    }
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier7, companion.getSetModifier());
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getpostalcode, Integer.valueOf((i3 >> 3) & 14));
                    getpostalcode.IconCompatParcelizer(true);
                    if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 != null) {
                        getpostalcode.serializer(-2146287790);
                        if (i11 != 4) {
                            if ((i10 & 8) != 0) {
                                notifyviewvisibilitychanged2 = notifyviewvisibilitychanged;
                                androidContentCaptureManager = androidContentCaptureManager2;
                                if (getpostalcode.IconCompatParcelizer(notifyviewvisibilitychanged2)) {
                                }
                                objComponentActivity = getpostalcode.ComponentActivity();
                                if (!z3 || objComponentActivity == androidContentCaptureManager) {
                                    i5 = 1;
                                    objComponentActivity = new accessisAutofillable(notifyviewvisibilitychanged2, i5);
                                    getpostalcode.write(objComponentActivity);
                                } else {
                                    i5 = 1;
                                }
                                Modifier modifierThen4 = LayoutIdKt.layoutId(SizeKt.serializer(LayoutModifierKt.layout(companion2, new DefaultLazyKey(i5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity)), (Alignment.Vertical) null, 3), "Label").then(companion2);
                                measurePolicy = BoxKt.read(companion3.getTopStart(), false);
                                iSerializer = SentryUUID.serializer(getpostalcode);
                                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen4);
                                constructor = companion.getConstructor();
                                if (getaddresscountry != null) {
                                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                    if (getpostalcode.ComponentActivity) {
                                        getpostalcode.serializer(constructor);
                                    } else {
                                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                    }
                                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                                    if (getpostalcode.ComponentActivity) {
                                        c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                    } else {
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                            c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                        }
                                    }
                                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(getpostalcode, Integer.valueOf((i3 >> 9) & 14));
                                    getpostalcode.IconCompatParcelizer(true);
                                    getpostalcode.IconCompatParcelizer(false);
                                } else {
                                    SentryUUID.write();
                                    throw null;
                                }
                            } else {
                                notifyviewvisibilitychanged2 = notifyviewvisibilitychanged;
                                androidContentCaptureManager = androidContentCaptureManager2;
                            }
                            z3 = false;
                            objComponentActivity = getpostalcode.ComponentActivity();
                            if (z3) {
                                i5 = 1;
                                objComponentActivity = new accessisAutofillable(notifyviewvisibilitychanged2, i5);
                                getpostalcode.write(objComponentActivity);
                            } else {
                                i5 = 1;
                                objComponentActivity = new accessisAutofillable(notifyviewvisibilitychanged2, i5);
                                getpostalcode.write(objComponentActivity);
                            }
                            Modifier modifierThen5 = LayoutIdKt.layoutId(SizeKt.serializer(LayoutModifierKt.layout(companion2, new DefaultLazyKey(i5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity)), (Alignment.Vertical) null, 3), "Label").then(companion2);
                            measurePolicy = BoxKt.read(companion3.getTopStart(), false);
                            iSerializer = SentryUUID.serializer(getpostalcode);
                            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen5);
                            constructor = companion.getConstructor();
                            if (getaddresscountry != null) {
                                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                if (getpostalcode.ComponentActivity) {
                                    getpostalcode.serializer(constructor);
                                } else {
                                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                }
                                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                                if (getpostalcode.ComponentActivity) {
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                        c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                    }
                                } else {
                                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                }
                                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                                r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(getpostalcode, Integer.valueOf((i3 >> 9) & 14));
                                getpostalcode.IconCompatParcelizer(true);
                                getpostalcode.IconCompatParcelizer(false);
                            } else {
                                SentryUUID.write();
                                throw null;
                            }
                        } else {
                            notifyviewvisibilitychanged2 = notifyviewvisibilitychanged;
                            androidContentCaptureManager = androidContentCaptureManager2;
                        }
                        z3 = true;
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (z3) {
                            i5 = 1;
                            objComponentActivity = new accessisAutofillable(notifyviewvisibilitychanged2, i5);
                            getpostalcode.write(objComponentActivity);
                        } else {
                            i5 = 1;
                            objComponentActivity = new accessisAutofillable(notifyviewvisibilitychanged2, i5);
                            getpostalcode.write(objComponentActivity);
                        }
                        Modifier modifierThen6 = LayoutIdKt.layoutId(SizeKt.serializer(LayoutModifierKt.layout(companion2, new DefaultLazyKey(i5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity)), (Alignment.Vertical) null, 3), "Label").then(companion2);
                        measurePolicy = BoxKt.read(companion3.getTopStart(), false);
                        iSerializer = SentryUUID.serializer(getpostalcode);
                        dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen6);
                        constructor = companion.getConstructor();
                        if (getaddresscountry != null) {
                            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode.ComponentActivity) {
                                getpostalcode.serializer(constructor);
                            } else {
                                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                            if (getpostalcode.ComponentActivity) {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                }
                            } else {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                            }
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                            r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(getpostalcode, Integer.valueOf((i3 >> 9) & 14));
                            getpostalcode.IconCompatParcelizer(true);
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            SentryUUID.write();
                            throw null;
                        }
                    } else {
                        getpostalcode.serializer(-2145892819);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde6 != null) {
                        getpostalcode.serializer(-2145844304);
                        Modifier modifierSerializer2 = SizeKt.serializer(SizeKt.m76heightInVpY3zN4$default(LayoutIdKt.layoutId(companion2, "Supporting"), TextFieldImplKt.serializer, 0.0f, 2), (Alignment.Vertical) null, 3);
                        int i12 = TextFieldDefaults.serializer;
                        Modifier modifierIconCompatParcelizer = PaddingKt.IconCompatParcelizer(modifierSerializer2, TextFieldDefaults.m129supportingTextPaddinga9UjIt4$material3$default());
                        MeasurePolicy measurePolicy7 = BoxKt.read(companion3.getTopStart(), false);
                        int iSerializer8 = SentryUUID.serializer(getpostalcode);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer8 = getpostalcode.serializer();
                        Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(getpostalcode, modifierIconCompatParcelizer);
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor8 = companion.getConstructor();
                        if (getaddresscountry != null) {
                            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode.ComponentActivity) {
                                getpostalcode.serializer(constructor8);
                            } else {
                                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M7 = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy7, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer8);
                            if (getpostalcode.ComponentActivity) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer8, getpostalcode, iSerializer8, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M7);
                            } else {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer8)}, getCieXyz.write())).booleanValue()) {
                                    c8$$ExternalSyntheticOutline0.m(iSerializer8, getpostalcode, iSerializer8, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M7);
                                }
                            }
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier8, companion.getSetModifier());
                            r8lambdaa6_tctqmksh3fk6hjgcbkuvde6.invoke(getpostalcode, Integer.valueOf((i10 >> 9) & 14));
                            z2 = true;
                            getpostalcode.IconCompatParcelizer(true);
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            SentryUUID.write();
                            throw null;
                        }
                    } else {
                        z2 = true;
                        getpostalcode.serializer(-2145508915);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(z2);
                } else {
                    SentryUUID.write();
                    throw null;
                }
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.MediaQuery_androidKtobtainUiMediaScope21
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                    androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextFieldLayout(modifier, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde4, r8lambdaa6_tctqmksh3fk6hjgcbkuvde5, z, androidAutofillManager_androidKt, notifyviewvisibilitychanged, r8lambdaunavo3sxub_pc9xroryotnrlvsm, dragAndDropTargetModifierNode, r8lambdaa6_tctqmksh3fk6hjgcbkuvde6, switchKt, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }
}
