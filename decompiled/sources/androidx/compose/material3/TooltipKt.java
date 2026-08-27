package androidx.compose.material3;

import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.PopupPositionProvider;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import io.sentry.SentryUUID;
import o.AndroidAutofillType_androidKt;
import o.AndroidAutofill_androidKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidContentDataType;
import o.AndroidFillableData;
import o.ContentDataType;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ScrollExtensionsKtanimateScrollBy2;
import o.UiMediaScopeKeyboardKindCompanion;
import o.createFromParcel;
import o.getAndroidType;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.getWindowPosturem18o9QQ;
import o.hideTranslatedText;
import o.isDocked;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.requiredHeightInVpY3zN4default;
import o.setImeVisible;

/* JADX INFO: loaded from: classes.dex */
public abstract class TooltipKt {
    public static final o.SwitchDefaults serializer;
    public static final float RemoteActionCompatParcelizer = Dp.m3673constructorimpl(4.0f);
    public static final float read = Dp.m3673constructorimpl(24.0f);
    public static final float write = Dp.m3673constructorimpl(40.0f);

    public static final void read(PopupPositionProvider popupPositionProvider, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, TooltipStateImpl tooltipStateImpl, Modifier modifier, boolean z, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        boolean z2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-293753984);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & Fields.RotationY) == 0 ? getpostalcode.read(tooltipStateImpl) : getpostalcode.IconCompatParcelizer(tooltipStateImpl) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i3 = i2 | 14380032;
        if ((100663296 & i) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode2) ? 67108864 : 33554432;
        }
        if (getpostalcode.write(i3 & 1, (38347923 & i3) != 38347922)) {
            Modifier.Companion companion = Modifier.Companion;
            final Transition transitionWrite = requiredHeightInVpY3zN4default.write(tooltipStateImpl.serializer, "tooltip transition", getpostalcode, 48);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = CompositionKt.RemoteActionCompatParcelizer(null);
                getpostalcode.write(objComponentActivity);
            }
            final PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new AndroidFillableData(new AndroidAutofillType_androidKt(0, populateViewStructure_androidKtpopulate7), popupPositionProvider);
                getpostalcode.write(objComponentActivity2);
            }
            final AndroidFillableData androidFillableData = (AndroidFillableData) objComponentActivity2;
            BasicTooltipKt.BasicTooltipBox(popupPositionProvider, ExtrasKt.write(-527401546, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$3
                /* JADX WARN: Code duplicated, block: B:22:0x009c  */
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Modifier.Companion companion2 = Modifier.Companion;
                        boolean zIsDebugInspectorInfoEnabled = InspectableValueKt.isDebugInspectorInfoEnabled();
                        Transition transition = transitionWrite;
                        Modifier modifierComposed = ComposedModifierKt.composed(companion2, zIsDebugInspectorInfoEnabled ? new ScrollExtensionsKtanimateScrollBy2(transition, 1) : InspectableValueKt.getNoInspectorInfo(), new AndroidAutofill_androidKt(0, transition));
                        MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                        int iSerializer = SentryUUID.serializer(getpostalcode2);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierComposed);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
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
                        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        if (getpostalcode2.ComponentActivity) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                        } else {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode2.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                            }
                        }
                        AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, companion3.getSetModifier());
                        dragAndDropTargetModifierNode.invoke(androidFillableData, getpostalcode2, 6);
                        getpostalcode2.IconCompatParcelizer(true);
                    } else {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), tooltipStateImpl, companion, ExtrasKt.write(-23901870, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$wrappedContent$1
                /* JADX WARN: Code duplicated, block: B:21:0x00a1  */
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Modifier.Companion companion2 = Modifier.Companion;
                        Object objComponentActivity3 = getpostalcode2.ComponentActivity();
                        if (objComponentActivity3 == getCreditCardExpirationMonth.write) {
                            isDocked isdocked = new isDocked(3, populateViewStructure_androidKtpopulate7);
                            getpostalcode2.write(isdocked);
                            objComponentActivity3 = isdocked;
                        }
                        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3);
                        MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                        int iSerializer = SentryUUID.serializer(getpostalcode2);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierOnGloballyPositioned);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
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
                        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        if (getpostalcode2.ComponentActivity) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                        } else {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode2.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                            }
                        }
                        AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, companion3.getSetModifier());
                        dragAndDropTargetModifierNode2.invoke(getpostalcode2, 0);
                        getpostalcode2.IconCompatParcelizer(true);
                    } else {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), getpostalcode, (i3 & 14) | 100663344 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128));
            z2 = true;
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            z2 = z;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getAndroidType(popupPositionProvider, dragAndDropTargetModifierNode, tooltipStateImpl, modifier2, z2, dragAndDropTargetModifierNode2, i);
        }
    }

    static {
        float fM3673constructorimpl = Dp.m3673constructorimpl(4.0f);
        float fM3673constructorimpl2 = Dp.m3673constructorimpl(8.0f);
        serializer = new o.SwitchDefaults(fM3673constructorimpl2, fM3673constructorimpl, fM3673constructorimpl2, fM3673constructorimpl);
        c8$$ExternalSyntheticOutline0.m(16.0f, 28.0f, 24.0f, 16.0f, 36.0f);
        Dp.m3673constructorimpl(8.0f);
    }

    /* JADX INFO: renamed from: PlainTooltip-gv3ox5I, reason: not valid java name */
    public static final void m133PlainTooltipgv3ox5I(final AndroidFillableData androidFillableData, Modifier modifier, float f, Shape shape, long j, long j2, float f2, float f3, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        final Modifier modifier2;
        final float f4;
        final Shape shape2;
        final long j3;
        final long j4;
        final float f5;
        final float f6;
        Modifier modifier3;
        final float f7;
        Shape shape3;
        final long jWrite;
        int i3;
        float fM3673constructorimpl;
        float fM3673constructorimpl2;
        long j5;
        boolean zIconCompatParcelizer;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-343758958);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(androidFillableData);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(androidFillableData);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 3504;
        if ((i & 24576) == 0) {
            i4 = i2 | 11696;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= Fields.BlendMode;
        }
        int i5 = 113246208 | i4;
        if ((805306368 & i) == 0) {
            i5 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 536870912 : 268435456;
        }
        if (getpostalcode.write(i5 & 1, (306783379 & i5) != 306783378)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i3 = i5 & (-4186113);
                modifier3 = modifier;
                f7 = f;
                shape3 = shape;
                jWrite = j;
                j5 = j2;
                fM3673constructorimpl = f2;
                fM3673constructorimpl2 = f3;
            } else {
                modifier3 = Modifier.Companion;
                f7 = TooltipDefaults.RemoteActionCompatParcelizer;
                shape3 = setImeVisible.read(ContentDataType.RemoteActionCompatParcelizer, getpostalcode);
                jWrite = getWindowPosturem18o9QQ.write(ContentDataType.read, getpostalcode);
                long jWrite2 = getWindowPosturem18o9QQ.write(ContentDataType.IconCompatParcelizer, getpostalcode);
                i3 = i5 & (-4186113);
                fM3673constructorimpl = Dp.m3673constructorimpl(0.0f);
                fM3673constructorimpl2 = Dp.m3673constructorimpl(0.0f);
                j5 = jWrite2;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            getpostalcode.serializer(-1719831991);
            getpostalcode.IconCompatParcelizer(false);
            int i6 = i3 >> 9;
            SurfaceKt.m126SurfaceT9BRK9s(modifier3, shape3, j5, 0L, fM3673constructorimpl, fM3673constructorimpl2, null, ExtrasKt.write(-1573998995, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.TooltipKt$PlainTooltip$4
                /* JADX WARN: Code duplicated, block: B:18:0x0099  */
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Modifier modifierIconCompatParcelizer = PaddingKt.IconCompatParcelizer(SizeKt.read(Modifier.Companion, TooltipKt.write, TooltipKt.read, f7, 8), TooltipKt.serializer);
                        MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                        int iSerializer = SentryUUID.serializer(getpostalcode2);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierIconCompatParcelizer);
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
                        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        if (getpostalcode2.ComponentActivity) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                        } else {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode2.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                            }
                        }
                        AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, companion.getSetModifier());
                        AndroidContentCaptureManagerCompanion.IconCompatParcelizer(new hideTranslatedText[]{UiMediaScopeKeyboardKindCompanion.read.write(Color.m712boximpl(jWrite)), TextKt.IconCompatParcelizer.write(AndroidContentDataType.serializer(ContentDataType.write, getpostalcode2))}, dragAndDropTargetModifierNode, getpostalcode2, 8);
                        getpostalcode2.IconCompatParcelizer(true);
                    } else {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), getpostalcode, (57344 & i6) | 12582912 | (i6 & 458752), 72);
            modifier2 = modifier3;
            f4 = f7;
            j3 = jWrite;
            f5 = fM3673constructorimpl;
            f6 = fM3673constructorimpl2;
            shape2 = shape3;
            j4 = j5;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            f4 = f;
            shape2 = shape;
            j3 = j;
            j4 = j2;
            f5 = f2;
            f6 = f3;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getAndroidAutofillTypesannotations
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    androidx.compose.material3.TooltipKt.m133PlainTooltipgv3ox5I(androidFillableData, modifier2, f4, shape2, j3, j4, f5, f6, dragAndDropTargetModifierNode, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }
}
