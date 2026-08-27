package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import bo.app.b8$$ExternalSyntheticLambda4;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.UiMediaScopeKeyboardKindCompanion;
import o.UiMediaScopeViewingDistance;
import o.ZIndexNode;
import o.accessisRelatedToAutoCommit;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getFartKroMQ;
import o.getNewPassword;
import o.getPhoneNumber;
import o.getPostalCode;
import o.getViewingDistancetKroMQ;
import o.getWindowPosturem18o9QQ;
import o.hideTranslatedText;
import o.isDate;
import o.onReceive;
import o.position;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setPlatformAutofillManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class SurfaceKt {
    public static final getPhoneNumber IconCompatParcelizer = new getPhoneNumber(new b8$$ExternalSyntheticLambda4(10));

    public static final long write(long j, float f, getPostalCode getpostalcode) {
        getViewingDistancetKroMQ getviewingdistancetkromq = (getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer);
        boolean zBooleanValue = ((Boolean) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.RemoteActionCompatParcelizer)).booleanValue();
        long j2 = getviewingdistancetkromq.menuHostHelperlambda0;
        if (!Color.m723equalsimpl0(j, j2) || !zBooleanValue) {
            return j;
        }
        if (Dp.m3678equalsimpl0(f, Dp.m3673constructorimpl(0.0f))) {
            return j2;
        }
        return ColorKt.m767compositeOverOWjLjI(Color.m721copywmQWz5c$default(getviewingdistancetkromq.addOnConfigurationChangedListener, ((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), j2);
    }

    /* JADX INFO: renamed from: Surface-T9BRK9s, reason: not valid java name */
    public static final void m126SurfaceT9BRK9s(Modifier modifier, Shape shape, final long j, long j2, float f, float f2, position positionVar, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i, int i2) {
        final Modifier modifier2 = (i2 & 1) != 0 ? Modifier.Companion : modifier;
        final Shape rectangleShape = (i2 & 2) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long jIconCompatParcelizer = (i2 & 8) != 0 ? getWindowPosturem18o9QQ.IconCompatParcelizer(j, getbirthdatefull) : j2;
        float fM3673constructorimpl = (i2 & 16) != 0 ? Dp.m3673constructorimpl(0.0f) : f;
        final float fM3673constructorimpl2 = (i2 & 32) != 0 ? Dp.m3673constructorimpl(0.0f) : f2;
        final position positionVar2 = (i2 & 64) != 0 ? null : positionVar;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getPhoneNumber getphonenumber = IconCompatParcelizer;
        final float fM3673constructorimpl3 = Dp.m3673constructorimpl(((Dp) getpostalcode.write((getNewPassword) getphonenumber)).m3687unboximpl() + fM3673constructorimpl);
        AndroidContentCaptureManagerCompanion.IconCompatParcelizer(new hideTranslatedText[]{UiMediaScopeKeyboardKindCompanion.read.write(Color.m712boximpl(jIconCompatParcelizer)), getphonenumber.write(Dp.m3671boximpl(fM3673constructorimpl3))}, ExtrasKt.write(421772006, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.SurfaceKt$Surface$1
            /* JADX WARN: Code duplicated, block: B:24:0x00d2  */
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(Object obj, Object obj2) {
                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                int iIntValue = ((Number) obj2).intValue();
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                boolean zWrite = getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2);
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                if (!zWrite) {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    return createfromparcel;
                }
                Modifier modifierSerializer = SurfaceKt.serializer(modifier2, rectangleShape, SurfaceKt.write(j, fM3673constructorimpl3, getpostalcode2), positionVar2, ((Density) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalDensity())).mo48toPx0680j_4(fM3673constructorimpl2));
                Object objComponentActivity = getpostalcode2.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new UiMediaScopeViewingDistance(15);
                    getpostalcode2.write(objComponentActivity);
                }
                Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierSerializer, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity);
                Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = setPlatformAutofillManager.RemoteActionCompatParcelizer;
                    getpostalcode2.write(objComponentActivity2);
                }
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierSemantics, createfromparcel, (PointerInputEventHandler) objComponentActivity2);
                MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), true);
                int iSerializer = SentryUUID.serializer(getpostalcode2);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierPointerInput);
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
                dragAndDropTargetModifierNode.invoke(getpostalcode2, 0);
                getpostalcode2.IconCompatParcelizer(true);
                return createfromparcel;
            }
        }, getpostalcode), getpostalcode, 56);
    }

    public static final Modifier serializer(Modifier modifier, Shape shape, long j, position positionVar, float f) {
        Modifier modifierM887graphicsLayerAp8cVGQ;
        Shape shape2;
        Modifier modifierWrite;
        if (f <= 0.0f) {
            modifierM887graphicsLayerAp8cVGQ = Modifier.Companion;
        } else {
            modifierM887graphicsLayerAp8cVGQ = GraphicsLayerModifierKt.m887graphicsLayerAp8cVGQ(Modifier.Companion, (124895 & 1) != 0 ? 1.0f : 0.0f, (124895 & 2) != 0 ? 1.0f : 0.0f, (124895 & 4) == 0 ? 0.0f : 1.0f, (124895 & 8) != 0 ? 0.0f : 0.0f, (124895 & 16) != 0 ? 0.0f : 0.0f, (124895 & 32) != 0 ? 0.0f : f, (124895 & 64) != 0 ? 0.0f : 0.0f, (124895 & Fields.SpotShadowColor) != 0 ? 0.0f : 0.0f, (124895 & Fields.RotationX) == 0 ? 0.0f : 0.0f, (124895 & Fields.RotationY) != 0 ? 8.0f : 0.0f, (124895 & Fields.RotationZ) != 0 ? TransformOrigin.Companion.m1138getCenterSzJe1aQ() : 0L, (124895 & Fields.CameraDistance) != 0 ? RectangleShapeKt.getRectangleShape() : shape, (124895 & Fields.TransformOrigin) != 0 ? false : false, (124895 & 8192) != 0 ? null : null, (124895 & Fields.Clip) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (124895 & Fields.CompositingStrategy) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (124895 & 65536) != 0 ? CompositingStrategy.Companion.m814getAutoNrFUSI() : 0);
        }
        Modifier modifierThen = modifier.then(modifierM887graphicsLayerAp8cVGQ);
        if (positionVar != null) {
            shape2 = shape;
            modifierWrite = BorderKt.write(Modifier.Companion, positionVar.read, positionVar.IconCompatParcelizer, shape2);
        } else {
            shape2 = shape;
            modifierWrite = Modifier.Companion;
        }
        return ClipKt.clip(BackgroundKt.m20backgroundbw27NRU(modifierThen.then(modifierWrite), j, shape2), shape2);
    }

    /* JADX INFO: renamed from: Surface-o_FOJdg, reason: not valid java name */
    public static final void m127Surfaceo_FOJdg(final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final Modifier modifier, boolean z, final Shape shape, final long j, long j2, float f, float f2, position positionVar, MutableInteractionSourceImpl mutableInteractionSourceImpl, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i, int i2) {
        final MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        final boolean z2 = (i2 & 4) != 0 ? true : z;
        long jIconCompatParcelizer = (i2 & 32) != 0 ? getWindowPosturem18o9QQ.IconCompatParcelizer(j, getbirthdatefull) : j2;
        float fM3673constructorimpl = (i2 & 64) != 0 ? Dp.m3673constructorimpl(0.0f) : f;
        final float fM3673constructorimpl2 = (i2 & Fields.SpotShadowColor) != 0 ? Dp.m3673constructorimpl(0.0f) : f2;
        final position positionVar2 = (i2 & Fields.RotationX) != 0 ? null : positionVar;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3 = (i2 & Fields.RotationY) == 0 ? mutableInteractionSourceImpl : null;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (mutableInteractionSourceImpl3 == null) {
            getpostalcode.serializer(-1701037204);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = c8$$ExternalSyntheticOutline0.m(getpostalcode);
            }
            mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) objComponentActivity;
        } else {
            getpostalcode.serializer(2023337163);
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl3;
        }
        getpostalcode.IconCompatParcelizer(false);
        getPhoneNumber getphonenumber = IconCompatParcelizer;
        final float fM3673constructorimpl3 = Dp.m3673constructorimpl(((Dp) getpostalcode.write((getNewPassword) getphonenumber)).m3687unboximpl() + fM3673constructorimpl);
        AndroidContentCaptureManagerCompanion.IconCompatParcelizer(new hideTranslatedText[]{UiMediaScopeKeyboardKindCompanion.read.write(Color.m712boximpl(jIconCompatParcelizer)), getphonenumber.write(Dp.m3671boximpl(fM3673constructorimpl3))}, ExtrasKt.write(849208527, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.SurfaceKt$Surface$2
            /* JADX WARN: Code duplicated, block: B:18:0x00d9  */
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(Object obj, Object obj2) {
                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                int iIntValue = ((Number) obj2).intValue();
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                if (getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                    HorizontalAlignmentLine horizontalAlignmentLine = getFartKroMQ.IconCompatParcelizer;
                    Modifier modifierThen = ClickableKt.serializer(SurfaceKt.serializer(modifier.then(ZIndexNode.serializer), shape, SurfaceKt.write(j, fM3673constructorimpl3, getpostalcode2), positionVar2, ((Density) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalDensity())).mo48toPx0680j_4(fM3673constructorimpl2)), mutableInteractionSourceImpl2, onReceive.serializer(0.0f, 0L, 7), z2, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 24).then(new isDate(new accessisRelatedToAutoCommit(26)));
                    MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), true);
                    int iSerializer = SentryUUID.serializer(getpostalcode2);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen);
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
                    if (getpostalcode2.read != null) {
                        getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode2.ComponentActivity) {
                            getpostalcode2.serializer(constructor);
                        } else {
                            getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        if (!getpostalcode2.ComponentActivity) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode2.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                            }
                        } else {
                            c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                        }
                        AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, companion.getSetModifier());
                        dragAndDropTargetModifierNode.invoke(getpostalcode2, 0);
                        getpostalcode2.IconCompatParcelizer(true);
                    } else {
                        SentryUUID.write();
                        throw null;
                    }
                } else {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createFromParcel.INSTANCE;
            }
        }, getpostalcode), getpostalcode, 56);
    }
}
