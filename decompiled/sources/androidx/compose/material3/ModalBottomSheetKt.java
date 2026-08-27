package androidx.compose.material3;

import androidx.collection.ObjectList$toString$1;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.navigation.Navigator$$ExternalSyntheticLambda1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda3;
import coil3.ExtrasKt;
import com.braze.Braze$$ExternalSyntheticLambda9;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.SentryUUID;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AutofillTree;
import o.AwaitFirstLayoutModifier;
import o.DefaultLazyKey;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.ModifierNodeDetachedCancellationException;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SelectionHandleIcon;
import o.ShortNewsContentCardView;
import o.TapGestureDetectorKtprocessTapGestureresetJob1;
import o.UiMediaScopeViewingDistance;
import o.accessgetGreencp;
import o.accesshasPhysicalKeyboard;
import o.accessisDocked;
import o.accessresolvePointerPrecision;
import o.coerceMinLinesOh53vG4foundation;
import o.createFromParcel;
import o.getAutofillTree;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getDate;
import o.getHandleruiannotations;
import o.getPersonLastName;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getRootAutofillId;
import o.getWindowPosturem18o9QQ;
import o.hasPhysicalKeyboard;
import o.isAutomotiveDevice;
import o.isDocked;
import o.mainAxisk4lQ0M;
import o.onShowTranslationui;
import o.onViewAttachedToWindow;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;
import o.resolvePointerPrecision;
import o.setFocusable;
import o.setZIndex;
import o.sideEffect;
import o.width;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class ModalBottomSheetKt {
    public static final float serializer = Dp.m3673constructorimpl(48.0f);
    public static final float write = Dp.m3673constructorimpl(24.0f);
    public static final long RemoteActionCompatParcelizer = TransformOriginKt.TransformOrigin(0.5f, 0.0f);

    public static final float IconCompatParcelizer(GraphicsLayerScope graphicsLayerScope, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.mo919getSizeNHjbRc() >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo48toPx0680j_4(serializer), fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final float RemoteActionCompatParcelizer(GraphicsLayerScope graphicsLayerScope, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.mo919getSizeNHjbRc() & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo48toPx0680j_4(write), fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final void IconCompatParcelizer(final long j, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final boolean z, final boolean z2, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        Modifier modifierSemantics;
        ?? r9;
        Object obj;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-391613911);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.serializer(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.write(z) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.write(z2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i3 = i2;
        if (!getpostalcode.write(i3 & 1, (i3 & 1171) != 1170)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else if (j != 16) {
            getpostalcode.serializer(-1438582326);
            onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer = TapGestureDetectorKtprocessTapGestureresetJob1.IconCompatParcelizer(z ? 1.0f : 0.0f, resolvePointerPrecision.serializer(AutofillTree.DefaultEffects, getpostalcode), null, null, getpostalcode, 0, 28);
            String str = setFocusable.read(getpostalcode, R.string.close_sheet);
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z2) {
                getpostalcode.serializer(-1438283579);
                Modifier.Companion companion = Modifier.Companion;
                int i4 = i3 & 112;
                boolean z3 = i4 == 32;
                Object objComponentActivity = getpostalcode.ComponentActivity();
                Object obj2 = objComponentActivity;
                if (z3 || objComponentActivity == androidContentCaptureManager) {
                    PointerInputEventHandler pointerInputEventHandler = new PointerInputEventHandler() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$1$1
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, ShortNewsContentCardView shortNewsContentCardView) {
                            Object objDetectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, new getRootAutofillId(2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), shortNewsContentCardView, 7);
                            return objDetectTapGestures$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objDetectTapGestures$default : createFromParcel.INSTANCE;
                        }
                    };
                    getpostalcode.write(pointerInputEventHandler);
                    obj2 = pointerInputEventHandler;
                }
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (PointerInputEventHandler) obj2);
                boolean z4 = getpostalcode.read(str);
                boolean z5 = i4 == 32;
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                Object obj3 = objComponentActivity2;
                if ((z5 | z4) || objComponentActivity2 == androidContentCaptureManager) {
                    Navigator$$ExternalSyntheticLambda1 navigator$$ExternalSyntheticLambda1 = new Navigator$$ExternalSyntheticLambda1(str, 3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(navigator$$ExternalSyntheticLambda1);
                    obj3 = navigator$$ExternalSyntheticLambda1;
                }
                modifierSemantics = SemanticsModifierKt.semantics(modifierPointerInput, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1437857391);
                getpostalcode.IconCompatParcelizer(false);
                modifierSemantics = Modifier.Companion;
            }
            Modifier modifierThen = Modifier.Companion.then(SizeKt.read).then(modifierSemantics);
            boolean z6 = (i3 & 14) == 4;
            boolean z7 = getpostalcode.read(onviewattachedtowindowIconCompatParcelizer);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if ((z7 || z6) || objComponentActivity3 == androidContentCaptureManager) {
                r9 = 0;
                setZIndex setzindex = new setZIndex(j, false ? 1 : 0, onviewattachedtowindowIconCompatParcelizer);
                getpostalcode.write(setzindex);
                obj = setzindex;
            } else {
                r9 = 0;
                obj = objComponentActivity3;
            }
            AwaitFirstLayoutModifier.serializer(modifierThen, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj, getpostalcode, r9);
            getpostalcode.IconCompatParcelizer((boolean) r9);
        } else {
            getpostalcode.serializer(-1437676103);
            getpostalcode.IconCompatParcelizer(false);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.MediaQuery_androidKt
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    androidx.compose.material3.ModalBottomSheetKt.IconCompatParcelizer(j, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z, z2, (getBirthDateFull) obj4, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0130  */
    /* JADX WARN: Code duplicated, block: B:104:0x013f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0169 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x016b  */
    /* JADX WARN: Code duplicated, block: B:116:0x016e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0174  */
    /* JADX WARN: Code duplicated, block: B:120:0x0177  */
    /* JADX WARN: Code duplicated, block: B:123:0x0187  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:132:0x01de  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:140:0x0207 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x020d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0227  */
    /* JADX WARN: Code duplicated, block: B:149:0x0235  */
    /* JADX WARN: Code duplicated, block: B:151:0x023b  */
    /* JADX WARN: Code duplicated, block: B:157:0x024c  */
    /* JADX WARN: Code duplicated, block: B:158:0x024f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0258 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x025a  */
    /* JADX WARN: Code duplicated, block: B:165:0x026e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0274  */
    /* JADX WARN: Code duplicated, block: B:172:0x0280  */
    /* JADX WARN: Code duplicated, block: B:173:0x0283  */
    /* JADX WARN: Code duplicated, block: B:176:0x028c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x028e  */
    /* JADX WARN: Code duplicated, block: B:180:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:183:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:185:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:191:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:192:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:195:0x02d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:198:0x02de  */
    /* JADX WARN: Code duplicated, block: B:201:0x0353  */
    /* JADX WARN: Code duplicated, block: B:203:0x035d  */
    /* JADX WARN: Code duplicated, block: B:205:0x0363  */
    /* JADX WARN: Code duplicated, block: B:211:0x0370  */
    /* JADX WARN: Code duplicated, block: B:215:0x0377  */
    /* JADX WARN: Code duplicated, block: B:217:0x038a  */
    /* JADX WARN: Code duplicated, block: B:219:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:222:0x03be  */
    /* JADX WARN: Code duplicated, block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x0107  */
    /* JADX WARN: Code duplicated, block: B:90:0x010a  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x011d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0126  */
    /* JADX INFO: renamed from: ModalBottomSheet-YbuCTN8, reason: not valid java name */
    public static final void m118ModalBottomSheetYbuCTN8(final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, final SheetState sheetState, float f, boolean z, final Shape shape, final long j, long j2, float f2, long j3, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, hasPhysicalKeyboard hasphysicalkeyboard, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long jM721copywmQWz5c$default;
        int i9;
        int i10;
        boolean z2;
        boolean z3;
        getPostalCode getpostalcode;
        final Modifier modifier2;
        final float f3;
        boolean z4;
        final long j4;
        final float f4;
        final long j5;
        final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2;
        final hasPhysicalKeyboard hasphysicalkeyboard2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier modifier3;
        boolean z5;
        int i11;
        int i12;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde3;
        Modifier modifier4;
        float f5;
        long j6;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde4;
        hasPhysicalKeyboard hasphysicalkeyboard3;
        long j7;
        float f6;
        int i13;
        width widthVarSerializer;
        width widthVarSerializer2;
        width widthVarSerializer3;
        int i14;
        boolean z6;
        boolean zIconCompatParcelizer;
        boolean zIconCompatParcelizer2;
        boolean zIconCompatParcelizer3;
        Object objComponentActivity;
        AndroidContentCaptureManager androidContentCaptureManager;
        Object objComponentActivity2;
        final getContentViewGroupParentLayout getcontentviewgroupparentlayout;
        boolean z7;
        boolean zIconCompatParcelizer4;
        int i15;
        boolean z8;
        Object objComponentActivity3;
        boolean zIconCompatParcelizer5;
        int i16;
        boolean z9;
        boolean z10;
        Object objComponentActivity4;
        Object objComponentActivity5;
        final Animatable animatable;
        boolean z11;
        boolean zIconCompatParcelizer6;
        boolean zIconCompatParcelizer7;
        boolean z12;
        Object objComponentActivity6;
        char c;
        Object objComponentActivity7;
        boolean z13;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1904798512);
        if ((i & 6) == 0) {
            i4 = (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i23 = i3 & 2;
        if (i23 == 0) {
            if ((i & 48) == 0) {
                i4 |= getpostalcode2.read(modifier) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (getpostalcode2.read(sheetState)) {
                    i22 = Fields.RotationX;
                } else {
                    i22 = Fields.SpotShadowColor;
                }
                i4 |= i22;
            }
            i5 = i4 | 3072;
            i6 = i3 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    if (getpostalcode2.write(z)) {
                        i7 = Fields.Clip;
                    } else {
                        i7 = 8192;
                    }
                    i5 |= i7;
                }
                if ((i & 196608) == 0) {
                    if (getpostalcode2.read(shape)) {
                        i21 = Fields.RenderEffect;
                    } else {
                        i21 = 65536;
                    }
                    i5 |= i21;
                }
                if ((i & 1572864) == 0) {
                    if (getpostalcode2.serializer(j)) {
                        i20 = 1048576;
                    } else {
                        i20 = Fields.BlendMode;
                    }
                    i5 |= i20;
                }
                if ((i & 12582912) == 0) {
                    i5 |= 4194304;
                }
                i8 = i5 | 100663296;
                if ((i & 805306368) == 0) {
                    jM721copywmQWz5c$default = j3;
                    if ((i3 & Fields.RotationY) == 0 || !getpostalcode2.serializer(jM721copywmQWz5c$default)) {
                        i19 = 268435456;
                    } else {
                        i19 = 536870912;
                    }
                    i8 |= i19;
                } else {
                    jM721copywmQWz5c$default = j3;
                }
                if ((i2 & 6) == 0) {
                    if (getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                        i18 = 4;
                    } else {
                        i18 = 2;
                    }
                    i9 = i2 | i18;
                } else {
                    i9 = i2;
                }
                if ((i2 & 48) != 0) {
                    i9 |= ((i3 & Fields.CameraDistance) == 0 || !getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1)) ? 16 : 32;
                }
                i10 = i9 | 384;
                if ((i2 & 3072) != 0) {
                    if (getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                        i17 = Fields.CameraDistance;
                    } else {
                        i17 = Fields.RotationZ;
                    }
                    i10 |= i17;
                }
                z2 = true;
                if ((i8 & 306783379) == 306783378 || (i10 & 1171) != 1170) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (getpostalcode2.write(i8 & 1, z3)) {
                    getpostalcode2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                    if ((i & 1) == 0 && !getpostalcode2.PlaybackStateCompat()) {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        int i24 = i8 & (-29360129);
                        if ((i3 & Fields.RotationY) != 0) {
                            i24 = i8 & (-1908408321);
                        }
                        if ((i3 & Fields.CameraDistance) != 0) {
                            i10 &= -113;
                        }
                        modifier4 = modifier;
                        f5 = f;
                        z4 = z;
                        j7 = j2;
                        f6 = f2;
                        r8lambdaa6_tctqmksh3fk6hjgcbkuvde4 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                        hasphysicalkeyboard3 = hasphysicalkeyboard;
                        i13 = i24;
                        j6 = jM721copywmQWz5c$default;
                    } else {
                        if (i23 != 0) {
                            modifier3 = Modifier.Companion;
                        } else {
                            modifier3 = modifier;
                        }
                        float f7 = BottomSheetDefaults.RemoteActionCompatParcelizer;
                        if (i6 != 0) {
                            z5 = true;
                        } else {
                            z5 = z;
                        }
                        long jIconCompatParcelizer = getWindowPosturem18o9QQ.IconCompatParcelizer(j, getpostalcode2);
                        i11 = i8 & (-29360129);
                        float fM3673constructorimpl = Dp.m3673constructorimpl(0.0f);
                        if ((i3 & Fields.RotationY) != 0) {
                            jM721copywmQWz5c$default = Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.write(getDate.write, getpostalcode2), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
                            i12 = (-1908408321) & i8;
                        } else {
                            i12 = i11;
                        }
                        if ((i3 & Fields.CameraDistance) != 0) {
                            r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = accessresolvePointerPrecision.read;
                            i10 &= -113;
                        } else {
                            r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                        }
                        modifier4 = modifier3;
                        f5 = f7;
                        j6 = jM721copywmQWz5c$default;
                        r8lambdaa6_tctqmksh3fk6hjgcbkuvde4 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde3;
                        hasphysicalkeyboard3 = new hasPhysicalKeyboard();
                        z4 = z5;
                        j7 = jIconCompatParcelizer;
                        f6 = fM3673constructorimpl;
                        i13 = i12;
                    }
                    getpostalcode2.RemoteActionCompatParcelizer();
                    AutofillTree autofillTree = AutofillTree.DefaultSpatial;
                    widthVarSerializer = resolvePointerPrecision.serializer(autofillTree, getpostalcode2);
                    widthVarSerializer2 = resolvePointerPrecision.serializer(autofillTree, getpostalcode2);
                    widthVarSerializer3 = resolvePointerPrecision.serializer(AutofillTree.FastEffects, getpostalcode2);
                    i14 = (i13 & 896) ^ 384;
                    z6 = (i14 <= 256 && getpostalcode2.read(sheetState)) || (i13 & 384) == 256;
                    zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(widthVarSerializer2);
                    zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(widthVarSerializer3);
                    zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(widthVarSerializer);
                    objComponentActivity = getpostalcode2.ComponentActivity();
                    androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    if (!(z6 | zIconCompatParcelizer | zIconCompatParcelizer2 | zIconCompatParcelizer3) || objComponentActivity == androidContentCaptureManager) {
                        accesshasPhysicalKeyboard accesshasphysicalkeyboard = new accesshasPhysicalKeyboard(sheetState, widthVarSerializer2, widthVarSerializer3, widthVarSerializer, 0);
                        getpostalcode2.write(accesshasphysicalkeyboard);
                        objComponentActivity = accesshasphysicalkeyboard;
                    }
                    getPhoneNumberNational.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode2);
                    objComponentActivity2 = getpostalcode2.ComponentActivity();
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2);
                        getpostalcode2.write(objComponentActivity2);
                    }
                    getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity2;
                    z7 = (r20 <= 256 && getpostalcode2.read(sheetState)) || (i13 & 384) == 256;
                    zIconCompatParcelizer4 = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
                    i15 = i13 & 14;
                    if (i15 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    objComponentActivity3 = getpostalcode2.ComponentActivity();
                    if (!(zIconCompatParcelizer4 | z7 | z8) || objComponentActivity3 == androidContentCaptureManager) {
                        objComponentActivity3 = new accessisDocked(sheetState, getcontentviewgroupparentlayout, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                        getpostalcode2.write(objComponentActivity3);
                    }
                    final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3;
                    zIconCompatParcelizer5 = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
                    if ((r20 > 256 || !getpostalcode2.read(sheetState)) && (i13 & 384) != 256) {
                        i16 = 4;
                        z9 = false;
                    } else {
                        z9 = true;
                        i16 = 4;
                    }
                    if (i15 == i16) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objComponentActivity4 = getpostalcode2.ComponentActivity();
                    if (!(zIconCompatParcelizer5 | z9 | z10) || objComponentActivity4 == androidContentCaptureManager) {
                        objComponentActivity4 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(getcontentviewgroupparentlayout, sheetState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 12);
                        getpostalcode2.write(objComponentActivity4);
                    }
                    final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4;
                    objComponentActivity5 = getpostalcode2.ComponentActivity();
                    if (objComponentActivity5 == androidContentCaptureManager) {
                        objComponentActivity5 = mainAxisk4lQ0M.write(0.0f);
                        getpostalcode2.write(objComponentActivity5);
                    }
                    animatable = (Animatable) objComponentActivity5;
                    z11 = (r20 <= 256 && getpostalcode2.read(sheetState)) || (i13 & 384) == 256;
                    zIconCompatParcelizer6 = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
                    zIconCompatParcelizer7 = getpostalcode2.IconCompatParcelizer(animatable);
                    if (i15 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objComponentActivity6 = getpostalcode2.ComponentActivity();
                    if ((!(z11 | zIconCompatParcelizer6 | zIconCompatParcelizer7) && !z12) || objComponentActivity6 == androidContentCaptureManager) {
                        c = 256;
                        Braze$$ExternalSyntheticLambda9 braze$$ExternalSyntheticLambda9 = new Braze$$ExternalSyntheticLambda9(sheetState, getcontentviewgroupparentlayout, animatable, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 2);
                        getpostalcode2.write(braze$$ExternalSyntheticLambda9);
                        objComponentActivity6 = braze$$ExternalSyntheticLambda9;
                    } else {
                        c = 256;
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity6;
                    getpostalcode = getpostalcode2;
                    int i25 = i13;
                    final long j8 = j6;
                    final hasPhysicalKeyboard hasphysicalkeyboard4 = hasphysicalkeyboard3;
                    final Modifier modifier5 = modifier4;
                    final float f8 = f5;
                    final boolean z14 = z4;
                    final long j9 = j7;
                    final float f9 = f6;
                    final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde5 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde4;
                    isAutomotiveDevice.m5154ModalBottomSheetDialogsW7UJKQ(r8lambdardpfsr94j4iebcwx_kpqzpm8k2, j7, hasphysicalkeyboard3, animatable, ExtrasKt.write(1010026864, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$4
                        /* JADX WARN: Code duplicated, block: B:21:0x00aa  */
                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                            int iIntValue = ((Number) obj2).intValue();
                            getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                            if (getpostalcode3.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                                Modifier modifierRemoteActionCompatParcelizer = AspectRatioKt.RemoteActionCompatParcelizer(Modifier.Companion.then(SizeKt.read));
                                Object objComponentActivity8 = getpostalcode3.ComponentActivity();
                                if (objComponentActivity8 == getCreditCardExpirationMonth.write) {
                                    objComponentActivity8 = new UiMediaScopeViewingDistance(12);
                                    getpostalcode3.write(objComponentActivity8);
                                }
                                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierRemoteActionCompatParcelizer, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, 1, null);
                                MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                                int iSerializer = SentryUUID.serializer(getpostalcode3);
                                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierSemantics$default);
                                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
                                if (getpostalcode3.read != null) {
                                    getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                    if (getpostalcode3.ComponentActivity) {
                                        getpostalcode3.serializer(constructor);
                                    } else {
                                        getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                    }
                                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode3, measurePolicy, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                                    if (!getpostalcode3.ComponentActivity) {
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode3.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                            c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                        }
                                    } else {
                                        c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                    }
                                    AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, companion.getSetModifier());
                                    SheetState sheetState2 = sheetState;
                                    boolean z15 = ((getAutofillTree) ((getPersonLastName) sheetState2.IconCompatParcelizer.MediaSessionCompatToken).getValue()) != getAutofillTree.Hidden;
                                    boolean z16 = hasphysicalkeyboard4.IconCompatParcelizer;
                                    long j10 = j8;
                                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                                    ModalBottomSheetKt.IconCompatParcelizer(j10, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, z15, z16, getpostalcode3, 0);
                                    ModalBottomSheetKt.write(animatable, getcontentviewgroupparentlayout, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier5, sheetState2, f8, z14, shape, j, j9, f9, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde5, dragAndDropTargetModifierNode, getpostalcode3, 70, 0);
                                    getpostalcode3.IconCompatParcelizer(true);
                                } else {
                                    SentryUUID.write();
                                    throw null;
                                }
                            } else {
                                getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                            }
                            return createFromParcel.INSTANCE;
                        }
                    }, getpostalcode), getpostalcode, (i10 & 896) | 28672);
                    if (sheetState.IconCompatParcelizer.RemoteActionCompatParcelizer().serializer.containsKey(getAutofillTree.Expanded)) {
                        getpostalcode.serializer(748459762);
                        if ((i14 > 256 || !getpostalcode.read(sheetState)) && (i25 & 384) != 256) {
                        }
                        objComponentActivity7 = getpostalcode.ComponentActivity();
                        if (!z2 || objComponentActivity7 == androidContentCaptureManager) {
                            z13 = false;
                            objComponentActivity7 = new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, null, 0);
                            getpostalcode.write(objComponentActivity7);
                        } else {
                            z13 = false;
                        }
                        getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, sheetState, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity7);
                        getpostalcode.IconCompatParcelizer(z13);
                    } else {
                        getpostalcode.serializer(748521266);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    modifier2 = modifier4;
                    f3 = f5;
                    j4 = j7;
                    f4 = f6;
                    j5 = j6;
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde4;
                    hasphysicalkeyboard2 = hasphysicalkeyboard3;
                } else {
                    getpostalcode = getpostalcode2;
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    modifier2 = modifier;
                    f3 = f;
                    z4 = z;
                    j4 = j2;
                    f4 = f2;
                    j5 = j3;
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                    hasphysicalkeyboard2 = hasphysicalkeyboard;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    final boolean z15 = z4;
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.accessisMicAvailable
                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                            androidx.compose.material3.ModalBottomSheetKt.m118ModalBottomSheetYbuCTN8(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, sheetState, f3, z15, shape, j, j4, f4, j5, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, hasphysicalkeyboard2, dragAndDropTargetModifierNode, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, i3);
                            return createFromParcel.INSTANCE;
                        }
                    };
                }
            }
            i5 = i4 | 27648;
            if ((i & 196608) == 0) {
                if (getpostalcode2.read(shape)) {
                    i21 = Fields.RenderEffect;
                } else {
                    i21 = 65536;
                }
                i5 |= i21;
            }
            if ((i & 1572864) == 0) {
                if (getpostalcode2.serializer(j)) {
                    i20 = 1048576;
                } else {
                    i20 = Fields.BlendMode;
                }
                i5 |= i20;
            }
            if ((i & 12582912) == 0) {
                i5 |= 4194304;
            }
            i8 = i5 | 100663296;
            if ((i & 805306368) == 0) {
                jM721copywmQWz5c$default = j3;
                if ((i3 & Fields.RotationY) == 0) {
                    i19 = 268435456;
                } else {
                    i19 = 268435456;
                }
                i8 |= i19;
            } else {
                jM721copywmQWz5c$default = j3;
            }
            if ((i2 & 6) == 0) {
                if (getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i9 = i2 | i18;
            } else {
                i9 = i2;
            }
            if ((i2 & 48) != 0) {
                i9 |= ((i3 & Fields.CameraDistance) == 0 || !getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1)) ? 16 : 32;
            }
            i10 = i9 | 384;
            if ((i2 & 3072) != 0) {
                if (getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i17 = Fields.CameraDistance;
                } else {
                    i17 = Fields.RotationZ;
                }
                i10 |= i17;
            }
            z2 = true;
            if ((i8 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (getpostalcode2.write(i8 & 1, z3)) {
                getpostalcode2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) == 0) {
                    if (i23 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier;
                    }
                    float f10 = BottomSheetDefaults.RemoteActionCompatParcelizer;
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z;
                    }
                    long jIconCompatParcelizer2 = getWindowPosturem18o9QQ.IconCompatParcelizer(j, getpostalcode2);
                    i11 = i8 & (-29360129);
                    float fM3673constructorimpl2 = Dp.m3673constructorimpl(0.0f);
                    if ((i3 & Fields.RotationY) != 0) {
                        jM721copywmQWz5c$default = Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.write(getDate.write, getpostalcode2), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 = (-1908408321) & i8;
                    } else {
                        i12 = i11;
                    }
                    if ((i3 & Fields.CameraDistance) != 0) {
                        r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = accessresolvePointerPrecision.read;
                        i10 &= -113;
                    } else {
                        r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                    }
                    modifier4 = modifier3;
                    f5 = f10;
                    j6 = jM721copywmQWz5c$default;
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde4 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde3;
                    hasphysicalkeyboard3 = new hasPhysicalKeyboard();
                    z4 = z5;
                    j7 = jIconCompatParcelizer2;
                    f6 = fM3673constructorimpl2;
                    i13 = i12;
                } else {
                    if (i23 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier;
                    }
                    float f11 = BottomSheetDefaults.RemoteActionCompatParcelizer;
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z;
                    }
                    long jIconCompatParcelizer3 = getWindowPosturem18o9QQ.IconCompatParcelizer(j, getpostalcode2);
                    i11 = i8 & (-29360129);
                    float fM3673constructorimpl3 = Dp.m3673constructorimpl(0.0f);
                    if ((i3 & Fields.RotationY) != 0) {
                        jM721copywmQWz5c$default = Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.write(getDate.write, getpostalcode2), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 = (-1908408321) & i8;
                    } else {
                        i12 = i11;
                    }
                    if ((i3 & Fields.CameraDistance) != 0) {
                        r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = accessresolvePointerPrecision.read;
                        i10 &= -113;
                    } else {
                        r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                    }
                    modifier4 = modifier3;
                    f5 = f11;
                    j6 = jM721copywmQWz5c$default;
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde4 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde3;
                    hasphysicalkeyboard3 = new hasPhysicalKeyboard();
                    z4 = z5;
                    j7 = jIconCompatParcelizer3;
                    f6 = fM3673constructorimpl3;
                    i13 = i12;
                }
                getpostalcode2.RemoteActionCompatParcelizer();
                AutofillTree autofillTree2 = AutofillTree.DefaultSpatial;
                widthVarSerializer = resolvePointerPrecision.serializer(autofillTree2, getpostalcode2);
                widthVarSerializer2 = resolvePointerPrecision.serializer(autofillTree2, getpostalcode2);
                widthVarSerializer3 = resolvePointerPrecision.serializer(AutofillTree.FastEffects, getpostalcode2);
                i14 = (i13 & 896) ^ 384;
                if (i14 <= 256) {
                }
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(widthVarSerializer2);
                zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(widthVarSerializer3);
                zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(widthVarSerializer);
                objComponentActivity = getpostalcode2.ComponentActivity();
                androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (!(z6 | zIconCompatParcelizer | zIconCompatParcelizer2 | zIconCompatParcelizer3)) {
                    accesshasPhysicalKeyboard accesshasphysicalkeyboard2 = new accesshasPhysicalKeyboard(sheetState, widthVarSerializer2, widthVarSerializer3, widthVarSerializer, 0);
                    getpostalcode2.write(accesshasphysicalkeyboard2);
                    objComponentActivity = accesshasphysicalkeyboard2;
                } else {
                    accesshasPhysicalKeyboard accesshasphysicalkeyboard3 = new accesshasPhysicalKeyboard(sheetState, widthVarSerializer2, widthVarSerializer3, widthVarSerializer, 0);
                    getpostalcode2.write(accesshasphysicalkeyboard3);
                    objComponentActivity = accesshasphysicalkeyboard3;
                }
                getPhoneNumberNational.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode2);
                objComponentActivity2 = getpostalcode2.ComponentActivity();
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2);
                    getpostalcode2.write(objComponentActivity2);
                }
                getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity2;
                if (r20 <= 256) {
                }
                zIconCompatParcelizer4 = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
                i15 = i13 & 14;
                if (i15 == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                objComponentActivity3 = getpostalcode2.ComponentActivity();
                if (!(zIconCompatParcelizer4 | z7 | z8)) {
                    objComponentActivity3 = new accessisDocked(sheetState, getcontentviewgroupparentlayout, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode2.write(objComponentActivity3);
                } else {
                    objComponentActivity3 = new accessisDocked(sheetState, getcontentviewgroupparentlayout, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode2.write(objComponentActivity3);
                }
                final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3;
                zIconCompatParcelizer5 = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
                if (r20 > 256) {
                    i16 = 4;
                    z9 = false;
                } else {
                    i16 = 4;
                    z9 = false;
                }
                if (i15 == i16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objComponentActivity4 = getpostalcode2.ComponentActivity();
                if (!(zIconCompatParcelizer5 | z9 | z10)) {
                    objComponentActivity4 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(getcontentviewgroupparentlayout, sheetState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 12);
                    getpostalcode2.write(objComponentActivity4);
                } else {
                    objComponentActivity4 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(getcontentviewgroupparentlayout, sheetState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 12);
                    getpostalcode2.write(objComponentActivity4);
                }
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4;
                objComponentActivity5 = getpostalcode2.ComponentActivity();
                if (objComponentActivity5 == androidContentCaptureManager) {
                    objComponentActivity5 = mainAxisk4lQ0M.write(0.0f);
                    getpostalcode2.write(objComponentActivity5);
                }
                animatable = (Animatable) objComponentActivity5;
                if (r20 <= 256) {
                }
                zIconCompatParcelizer6 = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
                zIconCompatParcelizer7 = getpostalcode2.IconCompatParcelizer(animatable);
                if (i15 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objComponentActivity6 = getpostalcode2.ComponentActivity();
                if (!(z11 | zIconCompatParcelizer6 | zIconCompatParcelizer7 | z12)) {
                    c = 256;
                    Braze$$ExternalSyntheticLambda9 braze$$ExternalSyntheticLambda10 = new Braze$$ExternalSyntheticLambda9(sheetState, getcontentviewgroupparentlayout, animatable, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 2);
                    getpostalcode2.write(braze$$ExternalSyntheticLambda10);
                    objComponentActivity6 = braze$$ExternalSyntheticLambda10;
                } else {
                    c = 256;
                    Braze$$ExternalSyntheticLambda9 braze$$ExternalSyntheticLambda11 = new Braze$$ExternalSyntheticLambda9(sheetState, getcontentviewgroupparentlayout, animatable, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 2);
                    getpostalcode2.write(braze$$ExternalSyntheticLambda11);
                    objComponentActivity6 = braze$$ExternalSyntheticLambda11;
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity6;
                getpostalcode = getpostalcode2;
                int i26 = i13;
                final long j10 = j6;
                final hasPhysicalKeyboard hasphysicalkeyboard5 = hasphysicalkeyboard3;
                final Modifier modifier6 = modifier4;
                final float f12 = f5;
                final boolean z16 = z4;
                final long j11 = j7;
                final float f13 = f6;
                final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde6 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde4;
                isAutomotiveDevice.m5154ModalBottomSheetDialogsW7UJKQ(r8lambdardpfsr94j4iebcwx_kpqzpm8k4, j7, hasphysicalkeyboard3, animatable, ExtrasKt.write(1010026864, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$4
                    /* JADX WARN: Code duplicated, block: B:21:0x00aa  */
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                        int iIntValue = ((Number) obj2).intValue();
                        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                        if (getpostalcode3.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                            Modifier modifierRemoteActionCompatParcelizer = AspectRatioKt.RemoteActionCompatParcelizer(Modifier.Companion.then(SizeKt.read));
                            Object objComponentActivity8 = getpostalcode3.ComponentActivity();
                            if (objComponentActivity8 == getCreditCardExpirationMonth.write) {
                                objComponentActivity8 = new UiMediaScopeViewingDistance(12);
                                getpostalcode3.write(objComponentActivity8);
                            }
                            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierRemoteActionCompatParcelizer, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, 1, null);
                            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                            int iSerializer = SentryUUID.serializer(getpostalcode3);
                            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierSemantics$default);
                            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
                            if (getpostalcode3.read != null) {
                                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                if (getpostalcode3.ComponentActivity) {
                                    getpostalcode3.serializer(constructor);
                                } else {
                                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                }
                                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode3, measurePolicy, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                                if (!getpostalcode3.ComponentActivity) {
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode3.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                        c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                    }
                                } else {
                                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                }
                                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, companion.getSetModifier());
                                SheetState sheetState2 = sheetState;
                                boolean z17 = ((getAutofillTree) ((getPersonLastName) sheetState2.IconCompatParcelizer.MediaSessionCompatToken).getValue()) != getAutofillTree.Hidden;
                                boolean z18 = hasphysicalkeyboard5.IconCompatParcelizer;
                                long j12 = j10;
                                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = r8lambdardpfsr94j4iebcwx_kpqzpm8k3;
                                ModalBottomSheetKt.IconCompatParcelizer(j12, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, z17, z18, getpostalcode3, 0);
                                ModalBottomSheetKt.write(animatable, getcontentviewgroupparentlayout, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier6, sheetState2, f12, z16, shape, j, j11, f13, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde6, dragAndDropTargetModifierNode, getpostalcode3, 70, 0);
                                getpostalcode3.IconCompatParcelizer(true);
                            } else {
                                SentryUUID.write();
                                throw null;
                            }
                        } else {
                            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, getpostalcode), getpostalcode, (i10 & 896) | 28672);
                if (sheetState.IconCompatParcelizer.RemoteActionCompatParcelizer().serializer.containsKey(getAutofillTree.Expanded)) {
                    getpostalcode.serializer(748459762);
                    z2 = i14 > 256 ? false : false;
                    objComponentActivity7 = getpostalcode.ComponentActivity();
                    if (z2) {
                        z13 = false;
                        objComponentActivity7 = new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, null, 0);
                        getpostalcode.write(objComponentActivity7);
                    } else {
                        z13 = false;
                        objComponentActivity7 = new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, null, 0);
                        getpostalcode.write(objComponentActivity7);
                    }
                    getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, sheetState, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity7);
                    getpostalcode.IconCompatParcelizer(z13);
                } else {
                    getpostalcode.serializer(748521266);
                    getpostalcode.IconCompatParcelizer(false);
                }
                modifier2 = modifier4;
                f3 = f5;
                j4 = j7;
                f4 = f6;
                j5 = j6;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde4;
                hasphysicalkeyboard2 = hasphysicalkeyboard3;
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier2 = modifier;
                f3 = f;
                z4 = z;
                j4 = j2;
                f4 = f2;
                j5 = j3;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                hasphysicalkeyboard2 = hasphysicalkeyboard;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                final boolean z17 = z4;
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.accessisMicAvailable
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                        androidx.compose.material3.ModalBottomSheetKt.m118ModalBottomSheetYbuCTN8(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, sheetState, f3, z17, shape, j, j4, f4, j5, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, hasphysicalkeyboard2, dragAndDropTargetModifierNode, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, i3);
                        return createFromParcel.INSTANCE;
                    }
                };
            }
        }
        i4 |= 48;
        if ((i & 384) == 0) {
            if (getpostalcode2.read(sheetState)) {
                i22 = Fields.RotationX;
            } else {
                i22 = Fields.SpotShadowColor;
            }
            i4 |= i22;
        }
        i5 = i4 | 3072;
        i6 = i3 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                if (getpostalcode2.write(z)) {
                    i7 = Fields.Clip;
                } else {
                    i7 = 8192;
                }
                i5 |= i7;
            }
            if ((i & 196608) == 0) {
                if (getpostalcode2.read(shape)) {
                    i21 = Fields.RenderEffect;
                } else {
                    i21 = 65536;
                }
                i5 |= i21;
            }
            if ((i & 1572864) == 0) {
                if (getpostalcode2.serializer(j)) {
                    i20 = 1048576;
                } else {
                    i20 = Fields.BlendMode;
                }
                i5 |= i20;
            }
            if ((i & 12582912) == 0) {
                i5 |= 4194304;
            }
            i8 = i5 | 100663296;
            if ((i & 805306368) == 0) {
                jM721copywmQWz5c$default = j3;
                if ((i3 & Fields.RotationY) == 0) {
                    i19 = 268435456;
                } else {
                    i19 = 268435456;
                }
                i8 |= i19;
            } else {
                jM721copywmQWz5c$default = j3;
            }
            if ((i2 & 6) == 0) {
                if (getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i9 = i2 | i18;
            } else {
                i9 = i2;
            }
            if ((i2 & 48) != 0) {
                i9 |= ((i3 & Fields.CameraDistance) == 0 || !getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1)) ? 16 : 32;
            }
            i10 = i9 | 384;
            if ((i2 & 3072) != 0) {
                if (getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i17 = Fields.CameraDistance;
                } else {
                    i17 = Fields.RotationZ;
                }
                i10 |= i17;
            }
            z2 = true;
            if ((i8 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (getpostalcode2.write(i8 & 1, z3)) {
                getpostalcode2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) == 0) {
                    if (i23 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier;
                    }
                    float f14 = BottomSheetDefaults.RemoteActionCompatParcelizer;
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z;
                    }
                    long jIconCompatParcelizer4 = getWindowPosturem18o9QQ.IconCompatParcelizer(j, getpostalcode2);
                    i11 = i8 & (-29360129);
                    float fM3673constructorimpl4 = Dp.m3673constructorimpl(0.0f);
                    if ((i3 & Fields.RotationY) != 0) {
                        jM721copywmQWz5c$default = Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.write(getDate.write, getpostalcode2), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 = (-1908408321) & i8;
                    } else {
                        i12 = i11;
                    }
                    if ((i3 & Fields.CameraDistance) != 0) {
                        r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = accessresolvePointerPrecision.read;
                        i10 &= -113;
                    } else {
                        r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                    }
                    modifier4 = modifier3;
                    f5 = f14;
                    j6 = jM721copywmQWz5c$default;
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde4 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde3;
                    hasphysicalkeyboard3 = new hasPhysicalKeyboard();
                    z4 = z5;
                    j7 = jIconCompatParcelizer4;
                    f6 = fM3673constructorimpl4;
                    i13 = i12;
                } else {
                    if (i23 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier;
                    }
                    float f15 = BottomSheetDefaults.RemoteActionCompatParcelizer;
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z;
                    }
                    long jIconCompatParcelizer5 = getWindowPosturem18o9QQ.IconCompatParcelizer(j, getpostalcode2);
                    i11 = i8 & (-29360129);
                    float fM3673constructorimpl5 = Dp.m3673constructorimpl(0.0f);
                    if ((i3 & Fields.RotationY) != 0) {
                        jM721copywmQWz5c$default = Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.write(getDate.write, getpostalcode2), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 = (-1908408321) & i8;
                    } else {
                        i12 = i11;
                    }
                    if ((i3 & Fields.CameraDistance) != 0) {
                        r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = accessresolvePointerPrecision.read;
                        i10 &= -113;
                    } else {
                        r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                    }
                    modifier4 = modifier3;
                    f5 = f15;
                    j6 = jM721copywmQWz5c$default;
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde4 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde3;
                    hasphysicalkeyboard3 = new hasPhysicalKeyboard();
                    z4 = z5;
                    j7 = jIconCompatParcelizer5;
                    f6 = fM3673constructorimpl5;
                    i13 = i12;
                }
                getpostalcode2.RemoteActionCompatParcelizer();
                AutofillTree autofillTree3 = AutofillTree.DefaultSpatial;
                widthVarSerializer = resolvePointerPrecision.serializer(autofillTree3, getpostalcode2);
                widthVarSerializer2 = resolvePointerPrecision.serializer(autofillTree3, getpostalcode2);
                widthVarSerializer3 = resolvePointerPrecision.serializer(AutofillTree.FastEffects, getpostalcode2);
                i14 = (i13 & 896) ^ 384;
                if (i14 <= 256) {
                }
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(widthVarSerializer2);
                zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(widthVarSerializer3);
                zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(widthVarSerializer);
                objComponentActivity = getpostalcode2.ComponentActivity();
                androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (!(z6 | zIconCompatParcelizer | zIconCompatParcelizer2 | zIconCompatParcelizer3)) {
                    accesshasPhysicalKeyboard accesshasphysicalkeyboard4 = new accesshasPhysicalKeyboard(sheetState, widthVarSerializer2, widthVarSerializer3, widthVarSerializer, 0);
                    getpostalcode2.write(accesshasphysicalkeyboard4);
                    objComponentActivity = accesshasphysicalkeyboard4;
                } else {
                    accesshasPhysicalKeyboard accesshasphysicalkeyboard5 = new accesshasPhysicalKeyboard(sheetState, widthVarSerializer2, widthVarSerializer3, widthVarSerializer, 0);
                    getpostalcode2.write(accesshasphysicalkeyboard5);
                    objComponentActivity = accesshasphysicalkeyboard5;
                }
                getPhoneNumberNational.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode2);
                objComponentActivity2 = getpostalcode2.ComponentActivity();
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2);
                    getpostalcode2.write(objComponentActivity2);
                }
                getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity2;
                if (r20 <= 256) {
                }
                zIconCompatParcelizer4 = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
                i15 = i13 & 14;
                if (i15 == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                objComponentActivity3 = getpostalcode2.ComponentActivity();
                if (!(zIconCompatParcelizer4 | z7 | z8)) {
                    objComponentActivity3 = new accessisDocked(sheetState, getcontentviewgroupparentlayout, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode2.write(objComponentActivity3);
                } else {
                    objComponentActivity3 = new accessisDocked(sheetState, getcontentviewgroupparentlayout, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode2.write(objComponentActivity3);
                }
                final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3;
                zIconCompatParcelizer5 = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
                if (r20 > 256) {
                    i16 = 4;
                    z9 = false;
                } else {
                    i16 = 4;
                    z9 = false;
                }
                if (i15 == i16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objComponentActivity4 = getpostalcode2.ComponentActivity();
                if (!(zIconCompatParcelizer5 | z9 | z10)) {
                    objComponentActivity4 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(getcontentviewgroupparentlayout, sheetState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 12);
                    getpostalcode2.write(objComponentActivity4);
                } else {
                    objComponentActivity4 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(getcontentviewgroupparentlayout, sheetState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 12);
                    getpostalcode2.write(objComponentActivity4);
                }
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4;
                objComponentActivity5 = getpostalcode2.ComponentActivity();
                if (objComponentActivity5 == androidContentCaptureManager) {
                    objComponentActivity5 = mainAxisk4lQ0M.write(0.0f);
                    getpostalcode2.write(objComponentActivity5);
                }
                animatable = (Animatable) objComponentActivity5;
                if (r20 <= 256) {
                }
                zIconCompatParcelizer6 = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
                zIconCompatParcelizer7 = getpostalcode2.IconCompatParcelizer(animatable);
                if (i15 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objComponentActivity6 = getpostalcode2.ComponentActivity();
                if (!(z11 | zIconCompatParcelizer6 | zIconCompatParcelizer7 | z12)) {
                    c = 256;
                    Braze$$ExternalSyntheticLambda9 braze$$ExternalSyntheticLambda12 = new Braze$$ExternalSyntheticLambda9(sheetState, getcontentviewgroupparentlayout, animatable, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 2);
                    getpostalcode2.write(braze$$ExternalSyntheticLambda12);
                    objComponentActivity6 = braze$$ExternalSyntheticLambda12;
                } else {
                    c = 256;
                    Braze$$ExternalSyntheticLambda9 braze$$ExternalSyntheticLambda13 = new Braze$$ExternalSyntheticLambda9(sheetState, getcontentviewgroupparentlayout, animatable, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 2);
                    getpostalcode2.write(braze$$ExternalSyntheticLambda13);
                    objComponentActivity6 = braze$$ExternalSyntheticLambda13;
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity6;
                getpostalcode = getpostalcode2;
                int i27 = i13;
                final long j12 = j6;
                final hasPhysicalKeyboard hasphysicalkeyboard6 = hasphysicalkeyboard3;
                final Modifier modifier7 = modifier4;
                final float f16 = f5;
                final boolean z18 = z4;
                final long j13 = j7;
                final float f17 = f6;
                final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde7 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde4;
                isAutomotiveDevice.m5154ModalBottomSheetDialogsW7UJKQ(r8lambdardpfsr94j4iebcwx_kpqzpm8k6, j7, hasphysicalkeyboard3, animatable, ExtrasKt.write(1010026864, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$4
                    /* JADX WARN: Code duplicated, block: B:21:0x00aa  */
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                        int iIntValue = ((Number) obj2).intValue();
                        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                        if (getpostalcode3.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                            Modifier modifierRemoteActionCompatParcelizer = AspectRatioKt.RemoteActionCompatParcelizer(Modifier.Companion.then(SizeKt.read));
                            Object objComponentActivity8 = getpostalcode3.ComponentActivity();
                            if (objComponentActivity8 == getCreditCardExpirationMonth.write) {
                                objComponentActivity8 = new UiMediaScopeViewingDistance(12);
                                getpostalcode3.write(objComponentActivity8);
                            }
                            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierRemoteActionCompatParcelizer, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, 1, null);
                            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                            int iSerializer = SentryUUID.serializer(getpostalcode3);
                            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierSemantics$default);
                            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
                            if (getpostalcode3.read != null) {
                                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                if (getpostalcode3.ComponentActivity) {
                                    getpostalcode3.serializer(constructor);
                                } else {
                                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                }
                                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode3, measurePolicy, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                                if (!getpostalcode3.ComponentActivity) {
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode3.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                        c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                    }
                                } else {
                                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                }
                                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, companion.getSetModifier());
                                SheetState sheetState2 = sheetState;
                                boolean z19 = ((getAutofillTree) ((getPersonLastName) sheetState2.IconCompatParcelizer.MediaSessionCompatToken).getValue()) != getAutofillTree.Hidden;
                                boolean z110 = hasphysicalkeyboard6.IconCompatParcelizer;
                                long j14 = j12;
                                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k7 = r8lambdardpfsr94j4iebcwx_kpqzpm8k5;
                                ModalBottomSheetKt.IconCompatParcelizer(j14, r8lambdardpfsr94j4iebcwx_kpqzpm8k7, z19, z110, getpostalcode3, 0);
                                ModalBottomSheetKt.write(animatable, getcontentviewgroupparentlayout, r8lambdardpfsr94j4iebcwx_kpqzpm8k7, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, modifier7, sheetState2, f16, z18, shape, j, j13, f17, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde7, dragAndDropTargetModifierNode, getpostalcode3, 70, 0);
                                getpostalcode3.IconCompatParcelizer(true);
                            } else {
                                SentryUUID.write();
                                throw null;
                            }
                        } else {
                            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, getpostalcode), getpostalcode, (i10 & 896) | 28672);
                if (sheetState.IconCompatParcelizer.RemoteActionCompatParcelizer().serializer.containsKey(getAutofillTree.Expanded)) {
                    getpostalcode.serializer(748459762);
                    if (i14 > 256) {
                    }
                    objComponentActivity7 = getpostalcode.ComponentActivity();
                    if (z2) {
                        z13 = false;
                        objComponentActivity7 = new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, null, 0);
                        getpostalcode.write(objComponentActivity7);
                    } else {
                        z13 = false;
                        objComponentActivity7 = new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, null, 0);
                        getpostalcode.write(objComponentActivity7);
                    }
                    getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, sheetState, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity7);
                    getpostalcode.IconCompatParcelizer(z13);
                } else {
                    getpostalcode.serializer(748521266);
                    getpostalcode.IconCompatParcelizer(false);
                }
                modifier2 = modifier4;
                f3 = f5;
                j4 = j7;
                f4 = f6;
                j5 = j6;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde4;
                hasphysicalkeyboard2 = hasphysicalkeyboard3;
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier2 = modifier;
                f3 = f;
                z4 = z;
                j4 = j2;
                f4 = f2;
                j5 = j3;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                hasphysicalkeyboard2 = hasphysicalkeyboard;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                final boolean z19 = z4;
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.accessisMicAvailable
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                        androidx.compose.material3.ModalBottomSheetKt.m118ModalBottomSheetYbuCTN8(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, sheetState, f3, z19, shape, j, j4, f4, j5, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, hasphysicalkeyboard2, dragAndDropTargetModifierNode, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, i3);
                        return createFromParcel.INSTANCE;
                    }
                };
            }
        }
        i5 = i4 | 27648;
        if ((i & 196608) == 0) {
            if (getpostalcode2.read(shape)) {
                i21 = Fields.RenderEffect;
            } else {
                i21 = 65536;
            }
            i5 |= i21;
        }
        if ((i & 1572864) == 0) {
            if (getpostalcode2.serializer(j)) {
                i20 = 1048576;
            } else {
                i20 = Fields.BlendMode;
            }
            i5 |= i20;
        }
        if ((i & 12582912) == 0) {
            i5 |= 4194304;
        }
        i8 = i5 | 100663296;
        if ((i & 805306368) == 0) {
            jM721copywmQWz5c$default = j3;
            if ((i3 & Fields.RotationY) == 0) {
                i19 = 268435456;
            } else {
                i19 = 268435456;
            }
            i8 |= i19;
        } else {
            jM721copywmQWz5c$default = j3;
        }
        if ((i2 & 6) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i9 = i2 | i18;
        } else {
            i9 = i2;
        }
        if ((i2 & 48) != 0) {
            i9 |= ((i3 & Fields.CameraDistance) == 0 || !getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1)) ? 16 : 32;
        }
        i10 = i9 | 384;
        if ((i2 & 3072) != 0) {
            if (getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                i17 = Fields.CameraDistance;
            } else {
                i17 = Fields.RotationZ;
            }
            i10 |= i17;
        }
        z2 = true;
        if ((i8 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (getpostalcode2.write(i8 & 1, z3)) {
            getpostalcode2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0) {
                if (i23 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier;
                }
                float f18 = BottomSheetDefaults.RemoteActionCompatParcelizer;
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z;
                }
                long jIconCompatParcelizer6 = getWindowPosturem18o9QQ.IconCompatParcelizer(j, getpostalcode2);
                i11 = i8 & (-29360129);
                float fM3673constructorimpl6 = Dp.m3673constructorimpl(0.0f);
                if ((i3 & Fields.RotationY) != 0) {
                    jM721copywmQWz5c$default = Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.write(getDate.write, getpostalcode2), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
                    i12 = (-1908408321) & i8;
                } else {
                    i12 = i11;
                }
                if ((i3 & Fields.CameraDistance) != 0) {
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = accessresolvePointerPrecision.read;
                    i10 &= -113;
                } else {
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                }
                modifier4 = modifier3;
                f5 = f18;
                j6 = jM721copywmQWz5c$default;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde4 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde3;
                hasphysicalkeyboard3 = new hasPhysicalKeyboard();
                z4 = z5;
                j7 = jIconCompatParcelizer6;
                f6 = fM3673constructorimpl6;
                i13 = i12;
            } else {
                if (i23 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier;
                }
                float f19 = BottomSheetDefaults.RemoteActionCompatParcelizer;
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z;
                }
                long jIconCompatParcelizer7 = getWindowPosturem18o9QQ.IconCompatParcelizer(j, getpostalcode2);
                i11 = i8 & (-29360129);
                float fM3673constructorimpl7 = Dp.m3673constructorimpl(0.0f);
                if ((i3 & Fields.RotationY) != 0) {
                    jM721copywmQWz5c$default = Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.write(getDate.write, getpostalcode2), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
                    i12 = (-1908408321) & i8;
                } else {
                    i12 = i11;
                }
                if ((i3 & Fields.CameraDistance) != 0) {
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = accessresolvePointerPrecision.read;
                    i10 &= -113;
                } else {
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                }
                modifier4 = modifier3;
                f5 = f19;
                j6 = jM721copywmQWz5c$default;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde4 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde3;
                hasphysicalkeyboard3 = new hasPhysicalKeyboard();
                z4 = z5;
                j7 = jIconCompatParcelizer7;
                f6 = fM3673constructorimpl7;
                i13 = i12;
            }
            getpostalcode2.RemoteActionCompatParcelizer();
            AutofillTree autofillTree4 = AutofillTree.DefaultSpatial;
            widthVarSerializer = resolvePointerPrecision.serializer(autofillTree4, getpostalcode2);
            widthVarSerializer2 = resolvePointerPrecision.serializer(autofillTree4, getpostalcode2);
            widthVarSerializer3 = resolvePointerPrecision.serializer(AutofillTree.FastEffects, getpostalcode2);
            i14 = (i13 & 896) ^ 384;
            if (i14 <= 256) {
            }
            zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(widthVarSerializer2);
            zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(widthVarSerializer3);
            zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(widthVarSerializer);
            objComponentActivity = getpostalcode2.ComponentActivity();
            androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (!(z6 | zIconCompatParcelizer | zIconCompatParcelizer2 | zIconCompatParcelizer3)) {
                accesshasPhysicalKeyboard accesshasphysicalkeyboard6 = new accesshasPhysicalKeyboard(sheetState, widthVarSerializer2, widthVarSerializer3, widthVarSerializer, 0);
                getpostalcode2.write(accesshasphysicalkeyboard6);
                objComponentActivity = accesshasphysicalkeyboard6;
            } else {
                accesshasPhysicalKeyboard accesshasphysicalkeyboard7 = new accesshasPhysicalKeyboard(sheetState, widthVarSerializer2, widthVarSerializer3, widthVarSerializer, 0);
                getpostalcode2.write(accesshasphysicalkeyboard7);
                objComponentActivity = accesshasphysicalkeyboard7;
            }
            getPhoneNumberNational.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode2);
            objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2);
                getpostalcode2.write(objComponentActivity2);
            }
            getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity2;
            if (r20 <= 256) {
            }
            zIconCompatParcelizer4 = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
            i15 = i13 & 14;
            if (i15 == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (!(zIconCompatParcelizer4 | z7 | z8)) {
                objComponentActivity3 = new accessisDocked(sheetState, getcontentviewgroupparentlayout, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode2.write(objComponentActivity3);
            } else {
                objComponentActivity3 = new accessisDocked(sheetState, getcontentviewgroupparentlayout, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode2.write(objComponentActivity3);
            }
            final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k7 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3;
            zIconCompatParcelizer5 = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
            if (r20 > 256) {
                i16 = 4;
                z9 = false;
            } else {
                i16 = 4;
                z9 = false;
            }
            if (i15 == i16) {
                z10 = true;
            } else {
                z10 = false;
            }
            objComponentActivity4 = getpostalcode2.ComponentActivity();
            if (!(zIconCompatParcelizer5 | z9 | z10)) {
                objComponentActivity4 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(getcontentviewgroupparentlayout, sheetState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 12);
                getpostalcode2.write(objComponentActivity4);
            } else {
                objComponentActivity4 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(getcontentviewgroupparentlayout, sheetState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 12);
                getpostalcode2.write(objComponentActivity4);
            }
            final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4;
            objComponentActivity5 = getpostalcode2.ComponentActivity();
            if (objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = mainAxisk4lQ0M.write(0.0f);
                getpostalcode2.write(objComponentActivity5);
            }
            animatable = (Animatable) objComponentActivity5;
            if (r20 <= 256) {
            }
            zIconCompatParcelizer6 = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
            zIconCompatParcelizer7 = getpostalcode2.IconCompatParcelizer(animatable);
            if (i15 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            objComponentActivity6 = getpostalcode2.ComponentActivity();
            if (!(z11 | zIconCompatParcelizer6 | zIconCompatParcelizer7 | z12)) {
                c = 256;
                Braze$$ExternalSyntheticLambda9 braze$$ExternalSyntheticLambda14 = new Braze$$ExternalSyntheticLambda9(sheetState, getcontentviewgroupparentlayout, animatable, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 2);
                getpostalcode2.write(braze$$ExternalSyntheticLambda14);
                objComponentActivity6 = braze$$ExternalSyntheticLambda14;
            } else {
                c = 256;
                Braze$$ExternalSyntheticLambda9 braze$$ExternalSyntheticLambda15 = new Braze$$ExternalSyntheticLambda9(sheetState, getcontentviewgroupparentlayout, animatable, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 2);
                getpostalcode2.write(braze$$ExternalSyntheticLambda15);
                objComponentActivity6 = braze$$ExternalSyntheticLambda15;
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k8 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity6;
            getpostalcode = getpostalcode2;
            int i28 = i13;
            final long j14 = j6;
            final hasPhysicalKeyboard hasphysicalkeyboard7 = hasphysicalkeyboard3;
            final Modifier modifier8 = modifier4;
            final float f110 = f5;
            final boolean z110 = z4;
            final long j15 = j7;
            final float f111 = f6;
            final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde8 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde4;
            isAutomotiveDevice.m5154ModalBottomSheetDialogsW7UJKQ(r8lambdardpfsr94j4iebcwx_kpqzpm8k8, j7, hasphysicalkeyboard3, animatable, ExtrasKt.write(1010026864, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$4
                /* JADX WARN: Code duplicated, block: B:21:0x00aa  */
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode3.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Modifier modifierRemoteActionCompatParcelizer = AspectRatioKt.RemoteActionCompatParcelizer(Modifier.Companion.then(SizeKt.read));
                        Object objComponentActivity8 = getpostalcode3.ComponentActivity();
                        if (objComponentActivity8 == getCreditCardExpirationMonth.write) {
                            objComponentActivity8 = new UiMediaScopeViewingDistance(12);
                            getpostalcode3.write(objComponentActivity8);
                        }
                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierRemoteActionCompatParcelizer, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, 1, null);
                        MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                        int iSerializer = SentryUUID.serializer(getpostalcode3);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierSemantics$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
                        if (getpostalcode3.read != null) {
                            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode3.ComponentActivity) {
                                getpostalcode3.serializer(constructor);
                            } else {
                                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode3, measurePolicy, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                            if (!getpostalcode3.ComponentActivity) {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode3.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                }
                            } else {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                            }
                            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, companion.getSetModifier());
                            SheetState sheetState2 = sheetState;
                            boolean z111 = ((getAutofillTree) ((getPersonLastName) sheetState2.IconCompatParcelizer.MediaSessionCompatToken).getValue()) != getAutofillTree.Hidden;
                            boolean z112 = hasphysicalkeyboard7.IconCompatParcelizer;
                            long j16 = j14;
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k9 = r8lambdardpfsr94j4iebcwx_kpqzpm8k7;
                            ModalBottomSheetKt.IconCompatParcelizer(j16, r8lambdardpfsr94j4iebcwx_kpqzpm8k9, z111, z112, getpostalcode3, 0);
                            ModalBottomSheetKt.write(animatable, getcontentviewgroupparentlayout, r8lambdardpfsr94j4iebcwx_kpqzpm8k9, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, modifier8, sheetState2, f110, z110, shape, j, j15, f111, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde8, dragAndDropTargetModifierNode, getpostalcode3, 70, 0);
                            getpostalcode3.IconCompatParcelizer(true);
                        } else {
                            SentryUUID.write();
                            throw null;
                        }
                    } else {
                        getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), getpostalcode, (i10 & 896) | 28672);
            if (sheetState.IconCompatParcelizer.RemoteActionCompatParcelizer().serializer.containsKey(getAutofillTree.Expanded)) {
                getpostalcode.serializer(748459762);
                if (i14 > 256) {
                }
                objComponentActivity7 = getpostalcode.ComponentActivity();
                if (z2) {
                    z13 = false;
                    objComponentActivity7 = new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, null, 0);
                    getpostalcode.write(objComponentActivity7);
                } else {
                    z13 = false;
                    objComponentActivity7 = new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, null, 0);
                    getpostalcode.write(objComponentActivity7);
                }
                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, sheetState, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity7);
                getpostalcode.IconCompatParcelizer(z13);
            } else {
                getpostalcode.serializer(748521266);
                getpostalcode.IconCompatParcelizer(false);
            }
            modifier2 = modifier4;
            f3 = f5;
            j4 = j7;
            f4 = f6;
            j5 = j6;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde4;
            hasphysicalkeyboard2 = hasphysicalkeyboard3;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            f3 = f;
            z4 = z;
            j4 = j2;
            f4 = f2;
            j5 = j3;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
            hasphysicalkeyboard2 = hasphysicalkeyboard;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final boolean z111 = z4;
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.accessisMicAvailable
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                    androidx.compose.material3.ModalBottomSheetKt.m118ModalBottomSheetYbuCTN8(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, sheetState, f3, z111, shape, j, j4, f4, j5, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, hasphysicalkeyboard2, dragAndDropTargetModifierNode, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, i3);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    public static final SheetState RemoteActionCompatParcelizer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i, int i2) {
        boolean z = (i2 & 1) == 0;
        if ((i2 & 2) != 0) {
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new UiMediaScopeViewingDistance(11);
                getpostalcode.write(objComponentActivity);
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
        }
        return SheetDefaultsKt.write(z, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getAutofillTree.Hidden, false, getbirthdatefull, (i & 14) | 384 | (i & 112), 56);
    }

    /* JADX WARN: Code duplicated, block: B:151:0x01ec  */
    public static final void write(final Animatable animatable, final getContentViewGroupParentLayout getcontentviewgroupparentlayout, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final Modifier modifier, final SheetState sheetState, final float f, final boolean z, final Shape shape, final long j, final long j2, final float f2, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        int i4;
        getPostalCode getpostalcode;
        Modifier modifierNestedScroll$default;
        int i5;
        boolean z2;
        Object objComponentActivity;
        boolean zIconCompatParcelizer;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-37400432);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.serializer;
        if ((i & 6) == 0) {
            i3 = (getpostalcode2.read(boxScopeInstance) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(animatable);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(animatable);
            }
            i3 |= zIconCompatParcelizer ? 32 : 16;
        }
        int i6 = i & 384;
        int i7 = Fields.RotationX;
        if (i6 == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout) ? 256 : 128;
        }
        int i8 = i & 3072;
        int i9 = Fields.RotationZ;
        if (i8 == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= getpostalcode2.read(modifier) ? Fields.RenderEffect : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= getpostalcode2.read(sheetState) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            i3 |= getpostalcode2.serializer(f) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= getpostalcode2.write(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= getpostalcode2.read(shape) ? 536870912 : 268435456;
        }
        int i10 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (getpostalcode2.serializer(j) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= getpostalcode2.serializer(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (!getpostalcode2.serializer(f2)) {
                i7 = 128;
            }
            i4 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                i9 = 2048;
            }
            i4 |= i9;
        }
        if ((i2 & 24576) == 0) {
            i4 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) ? Fields.Clip : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode) ? Fields.RenderEffect : 65536;
        }
        if (getpostalcode2.write(i10 & 1, ((i10 & 306783379) == 306783378 && (i4 & 74899) == 74898) ? false : true)) {
            getpostalcode2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode2.PlaybackStateCompat()) {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            getpostalcode2.RemoteActionCompatParcelizer();
            String str = setFocusable.read(getpostalcode2, com.logistics.rider.glovo.R.string.m3c_bottom_sheet_pane_title);
            Modifier modifierWrite = SizeKt.write(SizeKt.m87widthInVpY3zN4$default(boxScopeInstance.align(modifier, Alignment.Companion.getTopCenter()), 0.0f, f, 1), 1.0f);
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z) {
                getpostalcode2.serializer(-1582035383);
                Modifier.Companion companion = Modifier.Companion;
                if (((i10 & 3670016) ^ 1572864) <= 1048576 || !getpostalcode2.read(sheetState)) {
                    androidContentCaptureManager = androidContentCaptureManager;
                    if ((i10 & 1572864) != 1048576) {
                        z2 = false;
                    }
                    objComponentActivity = getpostalcode2.ComponentActivity();
                    if (!z2 || objComponentActivity == androidContentCaptureManager) {
                        SelectionHandleIcon selectionHandleIcon = SelectionHandleIcon.Vertical;
                        float f3 = SheetDefaultsKt.serializer;
                        objComponentActivity = new SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(sheetState, r8lambdaunavo3sxub_pc9xroryotnrlvsm, selectionHandleIcon);
                        getpostalcode2.write(objComponentActivity);
                    }
                    modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(companion, (NestedScrollConnection) objComponentActivity, null, 2, null);
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    androidContentCaptureManager = androidContentCaptureManager;
                }
                z2 = true;
                objComponentActivity = getpostalcode2.ComponentActivity();
                if (!z2) {
                    SelectionHandleIcon selectionHandleIcon2 = SelectionHandleIcon.Vertical;
                    float f4 = SheetDefaultsKt.serializer;
                    objComponentActivity = new SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(sheetState, r8lambdaunavo3sxub_pc9xroryotnrlvsm, selectionHandleIcon2);
                    getpostalcode2.write(objComponentActivity);
                } else {
                    SelectionHandleIcon selectionHandleIcon3 = SelectionHandleIcon.Vertical;
                    float f5 = SheetDefaultsKt.serializer;
                    objComponentActivity = new SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(sheetState, r8lambdaunavo3sxub_pc9xroryotnrlvsm, selectionHandleIcon3);
                    getpostalcode2.write(objComponentActivity);
                }
                modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(companion, (NestedScrollConnection) objComponentActivity, null, 2, null);
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2.serializer(-1582020872);
                getpostalcode2.IconCompatParcelizer(false);
                modifierNestedScroll$default = Modifier.Companion;
            }
            Modifier modifierThen = modifierWrite.then(modifierNestedScroll$default);
            AnchoredDraggableState anchoredDraggableState = sheetState.IconCompatParcelizer;
            AnchoredDraggableState anchoredDraggableState2 = sheetState.IconCompatParcelizer;
            SelectionHandleIcon selectionHandleIcon4 = SelectionHandleIcon.Vertical;
            int i11 = (i10 & 3670016) ^ 1572864;
            boolean z3 = (i11 > 1048576 && getpostalcode2.read(sheetState)) || (i10 & 1572864) == 1048576;
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (z3 || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.accessisAutomotiveDevice
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        getAutofillTree getautofilltree;
                        androidx.compose.ui.unit.IntSize intSize = (androidx.compose.ui.unit.IntSize) obj;
                        float fM3625getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(((androidx.compose.ui.unit.Constraints) obj2).m3632unboximpl());
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put(getAutofillTree.Hidden, Float.valueOf(fM3625getMaxHeightimpl));
                        float fM3848unboximpl = (int) (intSize.m3848unboximpl() & 4294967295L);
                        float f6 = fM3625getMaxHeightimpl / 2.0f;
                        androidx.compose.material3.SheetState sheetState2 = sheetState;
                        if (fM3848unboximpl > f6 && !sheetState2.MediaDescriptionCompat) {
                            linkedHashMap.put(getAutofillTree.PartiallyExpanded, Float.valueOf(f6));
                        }
                        if (((int) (intSize.m3848unboximpl() & 4294967295L)) != 0) {
                            linkedHashMap.put(getAutofillTree.Expanded, Float.valueOf(Math.max(0.0f, fM3625getMaxHeightimpl - ((int) (intSize.m3848unboximpl() & 4294967295L)))));
                        }
                        listValue listvalue = new listValue(linkedHashMap);
                        int i12 = hasSource.read[((getAutofillTree) ((getPersonLastName) sheetState2.IconCompatParcelizer.MediaSessionCompatToken).getValue()).ordinal()];
                        if (i12 == 1) {
                            getautofilltree = getAutofillTree.Hidden;
                        } else if (i12 == 2) {
                            getautofilltree = getAutofillTree.PartiallyExpanded;
                            if (!linkedHashMap.containsKey(getautofilltree)) {
                                getautofilltree = getAutofillTree.Expanded;
                                if (!linkedHashMap.containsKey(getautofilltree)) {
                                    getautofilltree = getAutofillTree.Hidden;
                                }
                            }
                        } else {
                            if (i12 != 3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return null;
                            }
                            getautofilltree = getAutofillTree.Expanded;
                            if (!linkedHashMap.containsKey(getautofilltree)) {
                                getautofilltree = getAutofillTree.Hidden;
                            }
                        }
                        return new onViewAttachedToWindowlambda0(listvalue, getautofilltree);
                    }
                };
                getpostalcode2.write(objComponentActivity2);
            }
            Modifier modifierIconCompatParcelizer = AnchoredDraggableKt.IconCompatParcelizer(modifierThen, anchoredDraggableState, selectionHandleIcon4, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2);
            accessgetGreencp accessgetgreencp = (accessgetGreencp) anchoredDraggableState2.MediaMetadataCompat;
            boolean z4 = z && sheetState.RemoteActionCompatParcelizer();
            boolean z5 = ((onShowTranslationui) ((PopulateViewStructure_androidKtpopulate7) anchoredDraggableState2.MediaSessionCompatQueueItem)).getValue() != null;
            boolean z6 = (i10 & 57344) == 16384;
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (z6 || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new ModalBottomSheetKt$ModalBottomSheetContent$4$1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, null);
                getpostalcode2.write(objComponentActivity3);
            }
            Modifier modifierRemoteActionCompatParcelizer = coerceMinLinesOh53vG4foundation.RemoteActionCompatParcelizer(modifierIconCompatParcelizer, accessgetgreencp, selectionHandleIcon4, z4, z5, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity3, DateTimeConstants.HOURS_PER_WEEK);
            boolean z7 = getpostalcode2.read(str);
            Object objComponentActivity4 = getpostalcode2.ComponentActivity();
            if (z7 || objComponentActivity4 == androidContentCaptureManager) {
                i5 = 1;
                objComponentActivity4 = new ModifierNodeDetachedCancellationException(str, 1);
                getpostalcode2.write(objComponentActivity4);
            } else {
                i5 = 1;
            }
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierRemoteActionCompatParcelizer, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, i5, null);
            int iSerializer = (int) anchoredDraggableState2.serializer();
            if (iSerializer < 0) {
                iSerializer = 0;
            }
            Modifier modifierConsumeWindowInsets = WindowInsetsPaddingKt.consumeWindowInsets(modifierSemantics$default, OffsetKt.RemoteActionCompatParcelizer(iSerializer, 13));
            boolean z8 = (i11 > 1048576 && getpostalcode2.read(sheetState)) || (i10 & 1572864) == 1048576;
            boolean z9 = (i10 & 112) == 32 || ((i10 & 64) != 0 && getpostalcode2.IconCompatParcelizer(animatable));
            Object objComponentActivity5 = getpostalcode2.ComponentActivity();
            if ((z9 | z8) || objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = new Navigator$$ExternalSyntheticLambda1(sheetState, 2, animatable);
                getpostalcode2.write(objComponentActivity5);
            }
            getpostalcode = getpostalcode2;
            int i12 = i4 << 6;
            SurfaceKt.m126SurfaceT9BRK9s(GraphicsLayerModifierKt.graphicsLayer(GraphicsLayerModifierKt.graphicsLayer(modifierConsumeWindowInsets, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5), new sideEffect(sheetState, 1)), shape, j, j2, f2, 0.0f, null, ExtrasKt.write(728743275, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7
                /* JADX WARN: Code duplicated, block: B:23:0x00d6  */
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    int i13 = 1;
                    getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode3.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Modifier modifierWindowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.write(Modifier.Companion, 1.0f), (o.TooltipDefaults) r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(getpostalcode3, 0));
                        Animatable animatable2 = animatable;
                        boolean zIconCompatParcelizer2 = getpostalcode3.IconCompatParcelizer(animatable2);
                        Object objComponentActivity6 = getpostalcode3.ComponentActivity();
                        if (zIconCompatParcelizer2 || objComponentActivity6 == getCreditCardExpirationMonth.write) {
                            objComponentActivity6 = new isDocked(i13, animatable2);
                            getpostalcode3.write(objComponentActivity6);
                        }
                        Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierWindowInsetsPadding, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6);
                        final SheetState sheetState2 = sheetState;
                        Modifier modifierGraphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(modifierGraphicsLayer, new sideEffect(sheetState2, 0));
                        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode3, 0);
                        int iSerializer2 = SentryUUID.serializer(getpostalcode3);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierGraphicsLayer2);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                        if (getpostalcode3.read == null) {
                            SentryUUID.write();
                            throw null;
                        }
                        getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode3.ComponentActivity) {
                            getpostalcode3.serializer(constructor);
                        } else {
                            getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        AndroidContentCaptureManagerCompanion.write(getpostalcode3, modalBottomSheetYbuCTN8Serializer, companion2.getSetMeasurePolicy());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer, companion2.getSetResolvedCompositionLocals());
                        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (getpostalcode3.ComponentActivity) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer2, getpostalcode3, iSerializer2, setCompositeKeyHash);
                        } else {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode3.ComponentActivity(), Integer.valueOf(iSerializer2)}, getCieXyz.write())).booleanValue()) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer2, getpostalcode3, iSerializer2, setCompositeKeyHash);
                            }
                        }
                        AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, companion2.getSetModifier());
                        final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                        if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 != null) {
                            getpostalcode3.serializer(1352934765);
                            final String str2 = setFocusable.read(getpostalcode3, com.logistics.rider.glovo.R.string.m3c_bottom_sheet_collapse_description);
                            final String str3 = setFocusable.read(getpostalcode3, com.logistics.rider.glovo.R.string.m3c_bottom_sheet_dismiss_description);
                            final String str4 = setFocusable.read(getpostalcode3, com.logistics.rider.glovo.R.string.m3c_bottom_sheet_expand_description);
                            final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                            final getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                            final boolean z10 = z;
                            SheetDefaultsKt.DragHandleWithTooltip(ExtrasKt.write(2000500644, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1
                                /* JADX WARN: Code duplicated, block: B:26:0x0101  */
                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                                public final Object invoke(Object obj3, Object obj4) {
                                    getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj3;
                                    int iIntValue2 = ((Number) obj4).intValue();
                                    getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull3;
                                    if (getpostalcode4.write(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        Modifier.Companion companion3 = Modifier.Companion;
                                        final SheetState sheetState3 = sheetState2;
                                        boolean z11 = getpostalcode4.read(sheetState3);
                                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                                        boolean z12 = getpostalcode4.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                                        getContentViewGroupParentLayout getcontentviewgroupparentlayout3 = getcontentviewgroupparentlayout2;
                                        boolean zIconCompatParcelizer3 = getpostalcode4.IconCompatParcelizer(getcontentviewgroupparentlayout3);
                                        Object objComponentActivity7 = getpostalcode4.ComponentActivity();
                                        AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                                        if ((z11 | z12 | zIconCompatParcelizer3) || objComponentActivity7 == androidContentCaptureManager2) {
                                            objComponentActivity7 = new accessisDocked(sheetState3, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, getcontentviewgroupparentlayout3);
                                            getpostalcode4.write(objComponentActivity7);
                                        }
                                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity7;
                                        Modifier modifierComposed = ComposedModifierKt.composed(companion3, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ObjectList$toString$1(6, r8lambdardpfsr94j4iebcwx_kpqzpm8k3) : InspectableValueKt.getNoInspectorInfo(), new DefaultLazyKey(0, r8lambdardpfsr94j4iebcwx_kpqzpm8k3));
                                        boolean zWrite = getpostalcode4.write(z10);
                                        boolean z13 = getpostalcode4.read(sheetState3);
                                        boolean z14 = getpostalcode4.read(str3);
                                        boolean z15 = getpostalcode4.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                                        boolean z16 = getpostalcode4.read(str4);
                                        boolean zIconCompatParcelizer4 = getpostalcode4.IconCompatParcelizer(getcontentviewgroupparentlayout3);
                                        boolean z17 = getpostalcode4.read(str2);
                                        Object objComponentActivity8 = getpostalcode4.ComponentActivity();
                                        if ((zWrite | z13 | z14 | z15 | z16 | zIconCompatParcelizer4 | z17) || objComponentActivity8 == androidContentCaptureManager2) {
                                            final boolean z18 = z10;
                                            final String str5 = str3;
                                            final String str6 = str4;
                                            final String str7 = str2;
                                            final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                                            final getContentViewGroupParentLayout getcontentviewgroupparentlayout4 = getcontentviewgroupparentlayout2;
                                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.accessresolvePosture
                                                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                                public final Object invoke(Object obj5) {
                                                    androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver = (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj5;
                                                    if (z18) {
                                                        androidx.compose.ui.semantics.SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str5, new accessisImeVisible(1, r8lambdardpfsr94j4iebcwx_kpqzpm8k4));
                                                        androidx.compose.material3.SheetState sheetState4 = sheetState3;
                                                        getAutofillTree getautofilltreeIconCompatParcelizer = sheetState4.IconCompatParcelizer();
                                                        getAutofillTree getautofilltree = getAutofillTree.PartiallyExpanded;
                                                        getContentViewGroupParentLayout getcontentviewgroupparentlayout5 = getcontentviewgroupparentlayout4;
                                                        if (getautofilltreeIconCompatParcelizer == getautofilltree) {
                                                            androidx.compose.ui.semantics.SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str6, new n$$ExternalSyntheticLambda3(sheetState4, getcontentviewgroupparentlayout5, sheetState4, 5));
                                                        } else if (sheetState4.IconCompatParcelizer.RemoteActionCompatParcelizer().serializer.containsKey(getautofilltree)) {
                                                            androidx.compose.ui.semantics.SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str7, new Rcolor(sheetState4, getcontentviewgroupparentlayout5, 4));
                                                        }
                                                    }
                                                    return createFromParcel.INSTANCE;
                                                }
                                            };
                                            getpostalcode4.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
                                            objComponentActivity8 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                                        }
                                        Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierComposed, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8);
                                        MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                                        int iSerializer3 = SentryUUID.serializer(getpostalcode4);
                                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode4.serializer();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode4, modifierSemantics);
                                        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion4.getConstructor();
                                        if (getpostalcode4.read == null) {
                                            SentryUUID.write();
                                            throw null;
                                        }
                                        getpostalcode4.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                        if (getpostalcode4.ComponentActivity) {
                                            getpostalcode4.serializer(constructor2);
                                        } else {
                                            getpostalcode4.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                        }
                                        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode4, measurePolicy, getpostalcode4, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                                        if (getpostalcode4.ComponentActivity) {
                                            c8$$ExternalSyntheticOutline0.m(iSerializer3, getpostalcode4, iSerializer3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                        } else {
                                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode4.ComponentActivity(), Integer.valueOf(iSerializer3)}, getCieXyz.write())).booleanValue()) {
                                                c8$$ExternalSyntheticOutline0.m(iSerializer3, getpostalcode4, iSerializer3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                            }
                                        }
                                        AndroidContentCaptureManagerCompanion.write(getpostalcode4, modifierMaterializeModifier2, companion4.getSetModifier());
                                        r8lambdaa6_tctqmksh3fk6hjgcbkuvde2.invoke(getpostalcode4, 0);
                                        getpostalcode4.IconCompatParcelizer(true);
                                    } else {
                                        getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                                    }
                                    return createFromParcel.INSTANCE;
                                }
                            }, getpostalcode3), getpostalcode3, 54);
                            getpostalcode3.IconCompatParcelizer(false);
                        } else {
                            getpostalcode3.serializer(1356009965);
                            getpostalcode3.IconCompatParcelizer(false);
                        }
                        dragAndDropTargetModifierNode.invoke(o.ModalBottomSheetKt.write, getpostalcode3, 6);
                        getpostalcode3.IconCompatParcelizer(true);
                    } else {
                        getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), getpostalcode, ((i10 >> 24) & 112) | 12582912 | (i12 & 896) | (i12 & 7168) | (i12 & 57344), 96);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.accessisTvDevice
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                    androidx.compose.material3.ModalBottomSheetKt.write(animatable, getcontentviewgroupparentlayout, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, sheetState, f, z, shape, j, j2, f2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, dragAndDropTargetModifierNode, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }
}
