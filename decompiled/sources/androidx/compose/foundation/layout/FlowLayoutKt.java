package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import java.util.List;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.Container4EFweAY;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ModalBottomSheetDialogsW7UJKQ;
import o.ModalBottomSheetKtModalBottomSheetContent7;
import o.OutlinedTextFieldLayout;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getKeyboardKindJ9_QTjY;
import o.getPostalCode;
import o.intrinsicWidth;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public abstract class FlowLayoutKt {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;

    static {
        Alignment.Companion companion = Alignment.Companion;
        companion.getTop();
        companion.getStart();
    }

    public static final void FlowRow(Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, intrinsicWidth intrinsicwidth, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1956591841);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(horizontal) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(vertical) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(vertical2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.read(Integer.MAX_VALUE) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.read(Integer.MAX_VALUE) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.read(intrinsicwidth) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 8388608 : 4194304;
        }
        int i4 = i2;
        if (getpostalcode.write(i4 & 1, (i4 & 4793491) != 4793490)) {
            int i5 = i4 & 3670016;
            boolean z = i5 == 1048576;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new OutlinedTextFieldLayout(intrinsicwidth.read);
                getpostalcode.write(objComponentActivity);
            }
            OutlinedTextFieldLayout outlinedTextFieldLayout = (OutlinedTextFieldLayout) objComponentActivity;
            int i6 = i4 >> 3;
            boolean z2 = (((i6 & 14) ^ 6) > 4 && getpostalcode.read(horizontal)) || (i6 & 6) == 4;
            boolean z3 = (((i6 & 112) ^ 48) > 32 && getpostalcode.read(vertical)) || (i6 & 48) == 32;
            boolean z4 = (((i6 & 896) ^ 384) > 256 && getpostalcode.read(vertical2)) || (i6 & 384) == 256;
            boolean z5 = (((i6 & 7168) ^ 3072) > 2048 && getpostalcode.read(Integer.MAX_VALUE)) || (i6 & 3072) == 2048;
            boolean z6 = (((57344 & i6) ^ 24576) > 16384 && getpostalcode.read(Integer.MAX_VALUE)) || (i6 & 24576) == 16384;
            boolean z7 = getpostalcode.read(outlinedTextFieldLayout);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (((z6 | z2 | z3 | z4 | z5) || z7) || objComponentActivity2 == androidContentCaptureManager) {
                i3 = 8388608;
                objComponentActivity2 = new FlowMeasurePolicy(horizontal, vertical, horizontal.mo64getSpacingD9Ej5fM(), new ModalBottomSheetKtModalBottomSheetContent7(vertical2), vertical.mo64getSpacingD9Ej5fM(), outlinedTextFieldLayout);
                getpostalcode.write(objComponentActivity2);
            } else {
                i3 = 8388608;
            }
            FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) objComponentActivity2;
            boolean z8 = i5 == 1048576;
            boolean z9 = (i4 & 29360128) == i3;
            boolean z10 = (i4 & 458752) == 131072;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            Object obj = objComponentActivity3;
            if ((z9 | z8 | z10) || objComponentActivity3 == androidContentCaptureManager) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new DragAndDropTargetModifierNode(new ModalBottomSheetDialogsW7UJKQ(dragAndDropTargetModifierNode, 0), true, -1192950673));
                intrinsicwidth.getClass();
                int i7 = Container4EFweAY.IconCompatParcelizer[intrinsicwidth.read.ordinal()];
                getpostalcode.write(arrayList);
                obj = arrayList;
            }
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0CombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts((List) obj);
            boolean z11 = getpostalcode.read(flowMeasurePolicy);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (z11 || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = MultiContentMeasurePolicyKt.createMeasurePolicy(flowMeasurePolicy);
                getpostalcode.write(objComponentActivity4);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objComponentActivity4;
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
                }
                af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0CombineAsVirtualLayouts.invoke(getpostalcode, 0);
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY(modifier, horizontal, vertical, vertical2, intrinsicwidth, dragAndDropTargetModifierNode, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public static final void serializer(final Modifier modifier, final Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i, int i2, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, final int i3, final int i4) {
        int i5;
        Arrangement.Vertical vertical3;
        int i6;
        boolean z;
        final int i7;
        final int i8;
        final Arrangement.Vertical vertical4;
        final Alignment.Vertical vertical5;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier modifier2;
        Arrangement.Vertical vertical6;
        int i9;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1303174015);
        int i10 = i4 & 1;
        if (i10 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (getpostalcode.read(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= getpostalcode.read(horizontal) ? 32 : 16;
        }
        int i11 = i4 & 4;
        if (i11 == 0) {
            if ((i3 & 384) == 0) {
                vertical3 = vertical;
                i5 |= getpostalcode.read(vertical3) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            i6 = i5 | 224256;
            if ((i3 & 1572864) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i9 = 1048576;
                } else {
                    i9 = Fields.BlendMode;
                }
                i6 |= i9;
            }
            if ((599187 & i6) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i6 & 1, z)) {
                if (i10 != 0) {
                    modifier2 = Modifier.Companion;
                } else {
                    modifier2 = modifier;
                }
                if (i11 != 0) {
                    vertical6 = Arrangement.MediaDescriptionCompat;
                } else {
                    vertical6 = vertical3;
                }
                Alignment.Vertical top = Alignment.Companion.getTop();
                FlowRow(modifier2, horizontal, vertical6, top, intrinsicWidth.serializer, dragAndDropTargetModifierNode, getpostalcode, (i6 & 14) | 1572864 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | ((i6 << 3) & 29360128));
                i7 = Integer.MAX_VALUE;
                i8 = Integer.MAX_VALUE;
                modifier = modifier2;
                vertical4 = vertical6;
                vertical5 = top;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i7 = i;
                i8 = i2;
                vertical4 = vertical3;
                vertical5 = vertical2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.OutlinedTextFieldKt
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        androidx.compose.foundation.layout.FlowLayoutKt.serializer(modifier, horizontal, vertical4, vertical5, i7, i8, dragAndDropTargetModifierNode, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), i4);
                        return createFromParcel.INSTANCE;
                    }
                };
            }
        }
        i5 |= 384;
        vertical3 = vertical;
        i6 = i5 | 224256;
        if ((i3 & 1572864) == 0) {
            if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                i9 = 1048576;
            } else {
                i9 = Fields.BlendMode;
            }
            i6 |= i9;
        }
        if ((599187 & i6) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i6 & 1, z)) {
            if (i10 != 0) {
                modifier2 = Modifier.Companion;
            } else {
                modifier2 = modifier;
            }
            if (i11 != 0) {
                vertical6 = Arrangement.MediaDescriptionCompat;
            } else {
                vertical6 = vertical3;
            }
            Alignment.Vertical top2 = Alignment.Companion.getTop();
            FlowRow(modifier2, horizontal, vertical6, top2, intrinsicWidth.serializer, dragAndDropTargetModifierNode, getpostalcode, (i6 & 14) | 1572864 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | ((i6 << 3) & 29360128));
            i7 = Integer.MAX_VALUE;
            i8 = Integer.MAX_VALUE;
            modifier = modifier2;
            vertical4 = vertical6;
            vertical5 = top2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            i7 = i;
            i8 = i2;
            vertical4 = vertical3;
            vertical5 = vertical2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.OutlinedTextFieldKt
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    androidx.compose.foundation.layout.FlowLayoutKt.serializer(modifier, horizontal, vertical4, vertical5, i7, i8, dragAndDropTargetModifierNode, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), i4);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }
}
