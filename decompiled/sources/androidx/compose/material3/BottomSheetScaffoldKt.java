package androidx.compose.material3;

import androidx.collection.ObjectList$toString$1;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.tokens.SheetBottomTokens;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.Navigator$$ExternalSyntheticLambda1;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.math.MathKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AutofillTree;
import o.DefaultLazyKey;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.Rcolor;
import o.SelectionHandleIcon;
import o.UiMediaScopeKeyboardKindCompanion;
import o.UiMediaScopeViewingDistance;
import o.accessgetGreencp;
import o.accessgetNonecp;
import o.accesshasPhysicalKeyboard;
import o.coerceMinLinesOh53vG4foundation;
import o.createFromParcel;
import o.drawTextJFhB2K4default;
import o.getAutofillTree;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.getWindowPosturem18o9QQ;
import o.minusKey;
import o.onShowTranslationui;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdasnlgwmkSxg21kU6oUnz2gRJJRc8;
import o.removeNodeAtDepth;
import o.resolvePointerPrecision;
import o.sensitiveContentdefault;
import o.setFocusable;
import o.setImeVisible;
import o.sideEffect;
import o.width;

/* JADX INFO: loaded from: classes.dex */
public abstract class BottomSheetScaffoldKt {
    public static final SheetState IconCompatParcelizer(int i, getBirthDateFull getbirthdatefull, int i2) {
        getAutofillTree getautofilltree = getAutofillTree.PartiallyExpanded;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if (objComponentActivity == getCreditCardExpirationMonth.write) {
            objComponentActivity = new UiMediaScopeViewingDistance(10);
            getpostalcode.write(objComponentActivity);
        }
        return SheetDefaultsKt.write(false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getautofilltree, (i2 & 4) != 0, getbirthdatefull, (i << 3) & 7168, 49);
    }

    /* JADX WARN: Code duplicated, block: B:90:0x01a2  */
    /* JADX INFO: renamed from: BottomSheetScaffold-sdMYb0k, reason: not valid java name */
    public static final void m112BottomSheetScaffoldsdMYb0k(final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, Modifier modifier, final sensitiveContentdefault sensitivecontentdefault, final float f, float f2, Shape shape, final long j, long j2, float f3, float f4, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode2, boolean z, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, final long j3, long j4, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        int i4;
        getPostalCode getpostalcode;
        final Modifier modifier2;
        final float f5;
        final Shape shape2;
        final long j5;
        final float f6;
        final float f7;
        final boolean z2;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
        final long j6;
        boolean z3;
        long jIconCompatParcelizer;
        float f8;
        float f9;
        Modifier modifier3;
        long j7;
        float f10;
        Shape shape3;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(920075480);
        if ((i & 6) == 0) {
            i3 = (getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 48;
        if ((i & 384) == 0) {
            i5 |= getpostalcode2.read(sensitivecontentdefault) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i5 |= getpostalcode2.serializer(f) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i6 = i5 | 24576;
        if ((i & 196608) == 0) {
            i6 = 90112 | i5;
        }
        if ((i & 1572864) == 0) {
            i6 |= getpostalcode2.serializer(j) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i6 |= 4194304;
        }
        int i7 = i6 | 905969664;
        if ((i2 & 6) == 0) {
            i4 = (getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i4 | 3504;
        if ((i2 & 24576) == 0) {
            i8 |= getpostalcode2.serializer(j3) ? Fields.Clip : 8192;
        }
        if ((i2 & 196608) == 0) {
            i8 |= 65536;
        }
        if ((1572864 & i2) == 0) {
            i8 |= getpostalcode2.IconCompatParcelizer(drawTextJFhB2K4default.read) ? 1048576 : 524288;
        }
        if (getpostalcode2.write(i7 & 1, ((306783379 & i7) == 306783378 && (599187 & i8) == 599186) ? false : true)) {
            getpostalcode2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode2.PlaybackStateCompat()) {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier;
                f10 = f2;
                shape3 = shape;
                j7 = j2;
                f8 = f3;
                f9 = f4;
                z3 = z;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
                jIconCompatParcelizer = j4;
            } else {
                Modifier.Companion companion = Modifier.Companion;
                float f11 = BottomSheetDefaults.RemoteActionCompatParcelizer;
                BottomSheetDefaults bottomSheetDefaults = BottomSheetDefaults.write;
                Shape shape4 = setImeVisible.read(SheetBottomTokens.IconCompatParcelizer, getpostalcode2);
                long jIconCompatParcelizer2 = getWindowPosturem18o9QQ.IconCompatParcelizer(j, getpostalcode2);
                float fM3673constructorimpl = Dp.m3673constructorimpl(0.0f);
                float f12 = BottomSheetDefaults.IconCompatParcelizer;
                z3 = true;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = accessgetNonecp.IconCompatParcelizer;
                jIconCompatParcelizer = getWindowPosturem18o9QQ.IconCompatParcelizer(j3, getpostalcode2);
                f8 = fM3673constructorimpl;
                f9 = f12;
                modifier3 = companion;
                j7 = jIconCompatParcelizer2;
                f10 = f11;
                shape3 = shape4;
            }
            getpostalcode2.RemoteActionCompatParcelizer();
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifier3.then(SizeKt.read), j3, RectangleShapeKt.getRectangleShape());
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
            int iSerializer = SentryUUID.serializer(getpostalcode2);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM20backgroundbw27NRU);
            Modifier modifier4 = modifier3;
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                if (getpostalcode2.ComponentActivity) {
                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                } else {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode2.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                    }
                }
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, companion2.getSetModifier());
                getpostalcode = getpostalcode2;
                AndroidContentCaptureManagerCompanion.read(UiMediaScopeKeyboardKindCompanion.read.write(Color.m712boximpl(jIconCompatParcelizer)), ExtrasKt.write(999829022, new minusKey(sensitivecontentdefault, f, f10, z3, shape3, j, j7, f8, f9, dragAndDropTargetModifierNode2, dragAndDropTargetModifierNode, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2), getpostalcode), getpostalcode, 56);
                getpostalcode.IconCompatParcelizer(true);
                f5 = f10;
                shape2 = shape3;
                j5 = j7;
                f6 = f8;
                f7 = f9;
                z2 = z3;
                j6 = jIconCompatParcelizer;
                modifier2 = modifier4;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            f5 = f2;
            shape2 = shape;
            j5 = j2;
            f6 = f3;
            f7 = f4;
            z2 = z;
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
            j6 = j4;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.MotionDurationScaleDefaultImpls
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                    androidx.compose.material3.BottomSheetScaffoldKt.m112BottomSheetScaffoldsdMYb0k(dragAndDropTargetModifierNode, modifier2, sensitivecontentdefault, f, f5, shape2, j, j5, f6, f7, dragAndDropTargetModifierNode2, z2, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3, j3, j6, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    public static final void write(final SheetState sheetState, final float f, final float f2, final boolean z, final Shape shape, final long j, final long j2, final float f3, final float f4, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode2, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        int i4;
        getPostalCode getpostalcode;
        int i5;
        Modifier modifierNestedScroll$default;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-2108849428);
        if ((i & 6) == 0) {
            i3 = (getpostalcode2.read(sheetState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.serializer(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode2.serializer(f2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode2.write(z) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i3 |= getpostalcode2.read(shape) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= getpostalcode2.serializer(j) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= getpostalcode2.serializer(j2) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            i3 |= getpostalcode2.serializer(f3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= getpostalcode2.serializer(f4) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (getpostalcode2.write(i6 & 1, ((i6 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            AutofillTree autofillTree = AutofillTree.DefaultSpatial;
            width widthVarSerializer = resolvePointerPrecision.serializer(autofillTree, getpostalcode2);
            width widthVarSerializer2 = resolvePointerPrecision.serializer(autofillTree, getpostalcode2);
            width widthVarSerializer3 = resolvePointerPrecision.serializer(AutofillTree.FastEffects, getpostalcode2);
            int i7 = i6 & 14;
            boolean z2 = i7 == 4;
            boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(widthVarSerializer2);
            boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(widthVarSerializer3);
            boolean zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(widthVarSerializer);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (((z2 | zIconCompatParcelizer | zIconCompatParcelizer2) || zIconCompatParcelizer3) || objComponentActivity == androidContentCaptureManager) {
                i5 = 1;
                objComponentActivity = new accesshasPhysicalKeyboard(sheetState, widthVarSerializer2, widthVarSerializer3, widthVarSerializer, 1);
                getpostalcode2.write(objComponentActivity);
            } else {
                i5 = 1;
            }
            getPhoneNumberNational.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode2);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2);
                getpostalcode2.write(objComponentActivity2);
            }
            final getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity2;
            SelectionHandleIcon selectionHandleIcon = SelectionHandleIcon.Vertical;
            final float fMo48toPx0680j_4 = ((Density) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalDensity())).mo48toPx0680j_4(f);
            if (z) {
                getpostalcode2.serializer(2049456610);
                Modifier.Companion companion = Modifier.Companion;
                boolean z3 = getpostalcode2.read(sheetState.IconCompatParcelizer);
                Object objComponentActivity3 = getpostalcode2.ComponentActivity();
                if (z3 || objComponentActivity3 == androidContentCaptureManager) {
                    Navigator$$ExternalSyntheticLambda1 navigator$$ExternalSyntheticLambda1 = new Navigator$$ExternalSyntheticLambda1(getcontentviewgroupparentlayout, i5, sheetState);
                    float f5 = SheetDefaultsKt.serializer;
                    SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 = new SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(sheetState, navigator$$ExternalSyntheticLambda1, selectionHandleIcon);
                    getpostalcode2.write(sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1);
                    objComponentActivity3 = sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1;
                }
                modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(companion, (NestedScrollConnection) objComponentActivity3, null, 2, null);
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2.serializer(2049851798);
                getpostalcode2.IconCompatParcelizer(false);
                modifierNestedScroll$default = Modifier.Companion;
            }
            Modifier modifierThen = SizeKt.m77requiredHeightInVpY3zN4$default(SizeKt.write(SizeKt.m87widthInVpY3zN4$default(Modifier.Companion, 0.0f, f2, 1), 1.0f), f).then(modifierNestedScroll$default);
            AnchoredDraggableState anchoredDraggableState = sheetState.IconCompatParcelizer;
            boolean z4 = i7 == 4;
            boolean zSerializer = getpostalcode2.serializer(fMo48toPx0680j_4);
            Object objComponentActivity4 = getpostalcode2.ComponentActivity();
            if ((z4 | zSerializer) || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.updateCoordinatorui
                    /* JADX WARN: Code duplicated, block: B:40:0x00b8 A[PHI: r1
  0x00b8: PHI (r1v4 o.getAutofillTree) = 
  (r1v3 o.getAutofillTree)
  (r1v5 o.getAutofillTree)
  (r1v6 o.getAutofillTree)
  (r1v7 o.getAutofillTree)
  (r1v8 o.getAutofillTree)
  (r1v9 o.getAutofillTree)
  (r1v10 o.getAutofillTree)
 binds: [B:39:0x00b6, B:30:0x009b, B:33:0x00a4, B:36:0x00ad, B:19:0x007b, B:22:0x0084, B:25:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        getAutofillTree getautofilltree;
                        float fM3625getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(((androidx.compose.ui.unit.Constraints) obj2).m3632unboximpl());
                        float fM3848unboximpl = (int) (((androidx.compose.ui.unit.IntSize) obj).m3848unboximpl() & 4294967295L);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        androidx.compose.material3.SheetState sheetState2 = sheetState;
                        boolean z5 = sheetState2.MediaDescriptionCompat;
                        float f6 = fMo48toPx0680j_4;
                        if (!z5) {
                            linkedHashMap.put(getAutofillTree.PartiallyExpanded, Float.valueOf(fM3625getMaxHeightimpl - f6));
                        }
                        if (fM3848unboximpl != f6) {
                            linkedHashMap.put(getAutofillTree.Expanded, Float.valueOf(Math.max(fM3625getMaxHeightimpl - fM3848unboximpl, 0.0f)));
                        }
                        if (!sheetState2.RatingCompat) {
                            linkedHashMap.put(getAutofillTree.Hidden, Float.valueOf(fM3625getMaxHeightimpl));
                        }
                        listValue listvalue = new listValue(linkedHashMap);
                        getAutofillTree getautofilltree2 = (getAutofillTree) ((getPersonLastName) sheetState2.IconCompatParcelizer.MediaSessionCompatToken).getValue();
                        int i8 = SensitiveContentKt.write[getautofilltree2.ordinal()];
                        if (i8 == 1) {
                            getautofilltree = getAutofillTree.Hidden;
                            if (linkedHashMap.containsKey(getautofilltree)) {
                                getautofilltree2 = getautofilltree;
                            }
                        } else if (i8 == 2) {
                            getautofilltree = getAutofillTree.PartiallyExpanded;
                            if (linkedHashMap.containsKey(getautofilltree)) {
                                getautofilltree2 = getautofilltree;
                            } else {
                                getautofilltree = getAutofillTree.Expanded;
                                if (linkedHashMap.containsKey(getautofilltree)) {
                                    getautofilltree2 = getautofilltree;
                                } else {
                                    getautofilltree = getAutofillTree.Hidden;
                                    if (linkedHashMap.containsKey(getautofilltree)) {
                                        getautofilltree2 = getautofilltree;
                                    }
                                }
                            }
                        } else {
                            if (i8 != 3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return null;
                            }
                            getautofilltree = getAutofillTree.Expanded;
                            if (linkedHashMap.containsKey(getautofilltree)) {
                                getautofilltree2 = getautofilltree;
                            } else {
                                getautofilltree = getAutofillTree.PartiallyExpanded;
                                if (linkedHashMap.containsKey(getautofilltree)) {
                                    getautofilltree2 = getautofilltree;
                                } else {
                                    getautofilltree = getAutofillTree.Hidden;
                                    if (linkedHashMap.containsKey(getautofilltree)) {
                                        getautofilltree2 = getautofilltree;
                                    }
                                }
                            }
                        }
                        return new onViewAttachedToWindowlambda0(listvalue, getautofilltree2);
                    }
                };
                getpostalcode2.write(objComponentActivity4);
            }
            Modifier modifierIconCompatParcelizer = AnchoredDraggableKt.IconCompatParcelizer(modifierThen, anchoredDraggableState, selectionHandleIcon, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4);
            AnchoredDraggableState anchoredDraggableState2 = sheetState.IconCompatParcelizer;
            int i8 = i6 >> 9;
            int i9 = (i8 & 112) | 12582912 | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (i8 & 458752);
            getpostalcode = getpostalcode2;
            SurfaceKt.m126SurfaceT9BRK9s(GraphicsLayerModifierKt.graphicsLayer(coerceMinLinesOh53vG4foundation.RemoteActionCompatParcelizer(modifierIconCompatParcelizer, (accessgetGreencp) anchoredDraggableState2.MediaMetadataCompat, selectionHandleIcon, z, ((onShowTranslationui) ((PopulateViewStructure_androidKtpopulate7) anchoredDraggableState2.MediaSessionCompatQueueItem)).getValue() != null, new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState2, null), 32), new sideEffect(sheetState, 1)), shape, j, j2, f3, f4, null, ExtrasKt.write(1508311921, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3
                /* JADX WARN: Code duplicated, block: B:18:0x00a8  */
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode3.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(SizeKt.write(Modifier.Companion, 1.0f), new sideEffect(sheetState, 0));
                        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode3, 0);
                        int iSerializer = SentryUUID.serializer(getpostalcode3);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierGraphicsLayer);
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
                            c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, setCompositeKeyHash);
                        } else {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode3.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, setCompositeKeyHash);
                            }
                        }
                        AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, companion2.getSetModifier());
                        getpostalcode3.serializer(-1044068159);
                        final String str = setFocusable.read(getpostalcode3, R.string.m3c_bottom_sheet_collapse_description);
                        final String str2 = setFocusable.read(getpostalcode3, R.string.m3c_bottom_sheet_dismiss_description);
                        final String str3 = setFocusable.read(getpostalcode3, R.string.m3c_bottom_sheet_expand_description);
                        final SheetState sheetState2 = sheetState;
                        final getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                        final boolean z5 = z;
                        final DragAndDropTargetModifierNode dragAndDropTargetModifierNode3 = dragAndDropTargetModifierNode;
                        SheetDefaultsKt.DragHandleWithTooltip(ExtrasKt.write(-511691176, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1
                            /* JADX WARN: Code duplicated, block: B:26:0x00fe  */
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
                                    SheetState sheetState3 = sheetState2;
                                    boolean z6 = getpostalcode4.read(sheetState3);
                                    getContentViewGroupParentLayout getcontentviewgroupparentlayout3 = getcontentviewgroupparentlayout2;
                                    boolean zIconCompatParcelizer4 = getpostalcode4.IconCompatParcelizer(getcontentviewgroupparentlayout3);
                                    Object objComponentActivity5 = getpostalcode4.ComponentActivity();
                                    AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                                    if ((z6 | zIconCompatParcelizer4) || objComponentActivity5 == androidContentCaptureManager2) {
                                        objComponentActivity5 = new Rcolor(sheetState3, getcontentviewgroupparentlayout3, 0);
                                        getpostalcode4.write(objComponentActivity5);
                                    }
                                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity5;
                                    Modifier modifierComposed = ComposedModifierKt.composed(companion3, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ObjectList$toString$1(6, r8lambdardpfsr94j4iebcwx_kpqzpm8k0) : InspectableValueKt.getNoInspectorInfo(), new DefaultLazyKey(0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
                                    boolean z7 = getpostalcode4.read(sheetState3);
                                    boolean zWrite = getpostalcode4.write(z5);
                                    boolean z8 = getpostalcode4.read(str3);
                                    boolean zIconCompatParcelizer5 = getpostalcode4.IconCompatParcelizer(getcontentviewgroupparentlayout3);
                                    boolean z9 = getpostalcode4.read(str);
                                    boolean z10 = getpostalcode4.read(str2);
                                    Object objComponentActivity6 = getpostalcode4.ComponentActivity();
                                    if ((z7 | zWrite | z8 | zIconCompatParcelizer5 | z9 | z10) || objComponentActivity6 == androidContentCaptureManager2) {
                                        objComponentActivity6 = new r8lambdasnlgwmkSxg21kU6oUnz2gRJJRc8(sheetState2, z5, str3, str, str2, getcontentviewgroupparentlayout2, 1);
                                        getpostalcode4.write(objComponentActivity6);
                                    }
                                    Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierComposed, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6);
                                    MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                                    int iSerializer2 = SentryUUID.serializer(getpostalcode4);
                                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode4.serializer();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode4, modifierSemantics);
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion4.getConstructor();
                                    if (getpostalcode4.read != null) {
                                        getpostalcode4.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                        if (getpostalcode4.ComponentActivity) {
                                            getpostalcode4.serializer(constructor2);
                                        } else {
                                            getpostalcode4.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                        }
                                        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode4, measurePolicy, getpostalcode4, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                                        if (!getpostalcode4.ComponentActivity) {
                                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode4.ComponentActivity(), Integer.valueOf(iSerializer2)}, getCieXyz.write())).booleanValue()) {
                                                c8$$ExternalSyntheticOutline0.m(iSerializer2, getpostalcode4, iSerializer2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                            }
                                        } else {
                                            c8$$ExternalSyntheticOutline0.m(iSerializer2, getpostalcode4, iSerializer2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                        }
                                        AndroidContentCaptureManagerCompanion.write(getpostalcode4, modifierMaterializeModifier2, companion4.getSetModifier());
                                        dragAndDropTargetModifierNode3.invoke(getpostalcode4, 0);
                                        getpostalcode4.IconCompatParcelizer(true);
                                    } else {
                                        SentryUUID.write();
                                        throw null;
                                    }
                                } else {
                                    getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                                }
                                return createFromParcel.INSTANCE;
                            }
                        }, getpostalcode3), getpostalcode3, 54);
                        getpostalcode3.IconCompatParcelizer(false);
                        dragAndDropTargetModifierNode2.invoke(o.ModalBottomSheetKt.write, getpostalcode3, 6);
                        getpostalcode3.IconCompatParcelizer(true);
                    } else {
                        getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode2), getpostalcode, i9, 64);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getScaleFactor
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                    androidx.compose.material3.BottomSheetScaffoldKt.write(sheetState, f, f2, z, shape, j, j2, f3, f4, dragAndDropTargetModifierNode, dragAndDropTargetModifierNode2, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x013e  */
    public static final void BottomSheetScaffoldLayout(DragAndDropTargetModifierNode dragAndDropTargetModifierNode, DragAndDropTargetModifierNode dragAndDropTargetModifierNode2, DragAndDropTargetModifierNode dragAndDropTargetModifierNode3, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final SheetState sheetState, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1217723575);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer((Object) null) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode3) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.read(sheetState) ? 131072 : 65536;
        }
        if (getpostalcode.write(i2 & 1, (74899 & i2) != 74898)) {
            List list = SQLite.read(accessgetNonecp.read, dragAndDropTargetModifierNode, dragAndDropTargetModifierNode2, dragAndDropTargetModifierNode3);
            boolean z = (458752 & i2) == 131072;
            boolean z2 = (i2 & 57344) == 16384;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((z2 | z) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1
                    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo69measure3p2s80s(MeasureScope measureScope, List list2, long j) {
                        Integer numValueOf;
                        List list3 = (List) list2.get(0);
                        int i3 = 1;
                        List list4 = (List) list2.get(1);
                        List list5 = (List) list2.get(2);
                        List list6 = (List) list2.get(3);
                        final int iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(j);
                        final int iM3625getMaxHeightimpl = Constraints.m3625getMaxHeightimpl(j);
                        long jM3616copyZbe2FdA$default = Constraints.m3616copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        final ArrayList arrayList = new ArrayList(list5.size());
                        int size = list5.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            arrayList.add(((Measurable) list5.get(i4)).mo2209measureBRTryo0(jM3616copyZbe2FdA$default));
                        }
                        final ArrayList arrayList2 = new ArrayList(list3.size());
                        int size2 = list3.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            arrayList2.add(((Measurable) list3.get(i5)).mo2209measureBRTryo0(jM3616copyZbe2FdA$default));
                        }
                        if (!arrayList2.isEmpty()) {
                            numValueOf = Integer.valueOf(((Placeable) arrayList2.get(0)).getHeight());
                            int size3 = arrayList2.size() - 1;
                            if (1 <= size3) {
                                while (true) {
                                    Integer numValueOf2 = Integer.valueOf(((Placeable) arrayList2.get(i3)).getHeight());
                                    if (numValueOf2.compareTo(numValueOf) > 0) {
                                        numValueOf = numValueOf2;
                                    }
                                    if (i3 == size3) {
                                        break;
                                    }
                                    i3++;
                                }
                            }
                        } else {
                            numValueOf = null;
                        }
                        final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                        long jM3616copyZbe2FdA$default2 = Constraints.m3616copyZbe2FdA$default(jM3616copyZbe2FdA$default, 0, 0, 0, iM3625getMaxHeightimpl - iIntValue, 7, null);
                        final ArrayList arrayList3 = new ArrayList(list4.size());
                        int size4 = list4.size();
                        for (int i6 = 0; i6 < size4; i6++) {
                            arrayList3.add(((Measurable) list4.get(i6)).mo2209measureBRTryo0(jM3616copyZbe2FdA$default2));
                        }
                        final ArrayList arrayList4 = new ArrayList(list6.size());
                        int size5 = list6.size();
                        for (int i7 = 0; i7 < size5; i7++) {
                            arrayList4.add(((Measurable) list6.get(i7)).mo2209measureBRTryo0(jM3616copyZbe2FdA$default));
                        }
                        final SheetState sheetState2 = sheetState;
                        final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                        return MeasureScope.layout$default(measureScope, iM3626getMaxWidthimpl, iM3625getMaxHeightimpl, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.Rstyle
                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final Object invoke(Object obj) {
                                Integer numValueOf3;
                                Integer numValueOf4;
                                Integer numValueOf5;
                                int iWrite;
                                androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
                                ArrayList arrayList5 = arrayList;
                                if (!arrayList5.isEmpty()) {
                                    numValueOf3 = Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList5.get(0)).getWidth());
                                    int size6 = arrayList5.size() - 1;
                                    if (1 <= size6) {
                                        int i8 = 1;
                                        while (true) {
                                            Integer numValueOf6 = Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList5.get(i8)).getWidth());
                                            if (numValueOf6.compareTo(numValueOf3) > 0) {
                                                numValueOf3 = numValueOf6;
                                            }
                                            if (i8 == size6) {
                                                break;
                                            }
                                            i8++;
                                        }
                                    }
                                } else {
                                    numValueOf3 = null;
                                }
                                int iIntValue2 = numValueOf3 != null ? numValueOf3.intValue() : 0;
                                int i9 = iM3626getMaxWidthimpl;
                                int iMax = Math.max(0, (i9 - iIntValue2) / 2);
                                ArrayList arrayList6 = arrayList4;
                                if (!arrayList6.isEmpty()) {
                                    numValueOf4 = Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList6.get(0)).getWidth());
                                    int size7 = arrayList6.size() - 1;
                                    if (1 <= size7) {
                                        int i10 = 1;
                                        while (true) {
                                            Integer numValueOf7 = Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList6.get(i10)).getWidth());
                                            if (numValueOf7.compareTo(numValueOf4) > 0) {
                                                numValueOf4 = numValueOf7;
                                            }
                                            if (i10 == size7) {
                                                break;
                                            }
                                            i10++;
                                        }
                                    }
                                } else {
                                    numValueOf4 = null;
                                }
                                int iIntValue3 = numValueOf4 != null ? numValueOf4.intValue() : 0;
                                if (!arrayList6.isEmpty()) {
                                    numValueOf5 = Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList6.get(0)).getHeight());
                                    int size8 = arrayList6.size() - 1;
                                    if (1 <= size8) {
                                        int i11 = 1;
                                        while (true) {
                                            Integer numValueOf8 = Integer.valueOf(((androidx.compose.ui.layout.Placeable) arrayList6.get(i11)).getHeight());
                                            if (numValueOf8.compareTo(numValueOf5) > 0) {
                                                numValueOf5 = numValueOf8;
                                            }
                                            if (i11 == size8) {
                                                break;
                                            }
                                            i11++;
                                        }
                                    }
                                } else {
                                    numValueOf5 = null;
                                }
                                int iIntValue4 = numValueOf5 != null ? numValueOf5.intValue() : 0;
                                int i12 = (i9 - iIntValue3) / 2;
                                int i13 = Rstring.RemoteActionCompatParcelizer[sheetState2.IconCompatParcelizer().ordinal()];
                                if (i13 != 1) {
                                    if (i13 != 2 && i13 != 3) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                        return null;
                                    }
                                    iWrite = iM3625getMaxHeightimpl;
                                } else {
                                    iWrite = MathKt.write(((Number) r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke()).floatValue());
                                }
                                int i14 = iWrite;
                                ArrayList arrayList7 = arrayList3;
                                int size9 = arrayList7.size();
                                int i15 = 0;
                                while (i15 < size9) {
                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) arrayList7.get(i15), 0, iIntValue, 0.0f, 4, null);
                                    i15++;
                                    size9 = size9;
                                    arrayList7 = arrayList7;
                                }
                                ArrayList arrayList8 = arrayList2;
                                int size10 = arrayList8.size();
                                int i16 = 0;
                                while (i16 < size10) {
                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) arrayList8.get(i16), 0, 0, 0.0f, 4, null);
                                    i16++;
                                    size10 = size10;
                                    arrayList8 = arrayList8;
                                }
                                int i17 = 0;
                                for (int size11 = arrayList5.size(); i17 < size11; size11 = size11) {
                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) arrayList5.get(i17), iMax, 0, 0.0f, 4, null);
                                    i17++;
                                }
                                int size12 = arrayList6.size();
                                for (int i18 = 0; i18 < size12; i18++) {
                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) arrayList6.get(i18), i12, i14 - iIntValue4, 0.0f, 4, null);
                                }
                                return createFromParcel.INSTANCE;
                            }
                        }, 4, null);
                    }
                };
                getpostalcode.write(objComponentActivity);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) objComponentActivity;
            Modifier.Companion companion = Modifier.Companion;
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0CombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(list);
            boolean z3 = getpostalcode.read(multiContentMeasurePolicy);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z3 || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                getpostalcode.write(objComponentActivity2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objComponentActivity2;
            int iSerializer = SentryUUID.serializer(getpostalcode);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                if (getpostalcode.ComponentActivity) {
                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                } else {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                    }
                }
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion2.getSetModifier());
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM(dragAndDropTargetModifierNode, dragAndDropTargetModifierNode2, dragAndDropTargetModifierNode3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, sheetState, i, 2);
        }
    }
}
