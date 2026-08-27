package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import io.sentry.SentryUUID;
import o.AndroidAutofillManager_androidKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DefaultLazyKey;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ZIndexNode;
import o.accessisAutofillable;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getFartKroMQ;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.notifyViewVisibilityChanged;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public abstract class TextFieldKt {
    static {
        Dp.m3673constructorimpl(8.0f);
    }

    /* JADX WARN: Code duplicated, block: B:151:0x0244  */
    /* JADX WARN: Code duplicated, block: B:162:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:174:0x036f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0456  */
    /* JADX WARN: Code duplicated, block: B:210:0x0509  */
    /* JADX WARN: Code duplicated, block: B:228:0x057f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:231:0x0584  */
    /* JADX WARN: Code duplicated, block: B:234:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:235:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:238:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:240:0x0604  */
    /* JADX WARN: Code duplicated, block: B:264:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:277:0x079c  */
    public static final void TextFieldLayout(final Modifier modifier, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde4, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde5, final boolean z, final AndroidAutofillManager_androidKt androidAutofillManager_androidKt, final notifyViewVisibilityChanged notifyviewvisibilitychanged, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde6, final o.SwitchKt switchKt, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        int i4;
        getPostalCode getpostalcode;
        boolean z2;
        boolean z3;
        notifyViewVisibilityChanged notifyviewvisibilitychanged2;
        AndroidContentCaptureManager androidContentCaptureManager;
        boolean z4;
        Object objComponentActivity;
        int iSerializer;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M;
        boolean zIconCompatParcelizer;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1086465551);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            i3 = i | (getpostalcode2.read(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        int i5 = i & 384;
        int i6 = Fields.RotationX;
        if (i5 == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) ? 256 : 128;
        }
        int i7 = i & 3072;
        int i8 = Fields.RotationZ;
        if (i7 == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? Fields.CameraDistance : 1024;
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
            i4 |= getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (!getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde6)) {
                i6 = 128;
            }
            i4 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (getpostalcode2.read(switchKt)) {
                i8 = Fields.CameraDistance;
            }
            i4 |= i8;
        }
        int i9 = i4;
        if (getpostalcode2.write(i3 & 1, ((i3 & 306783379) == 306783378 && (i9 & 1171) == 1170) ? false : true)) {
            float fMinimizedLabelHalfHeight = TextFieldImplKt.minimizedLabelHalfHeight(getpostalcode2);
            boolean z5 = (i3 & 234881024) == 67108864;
            boolean z6 = (i3 & 1879048192) == 536870912;
            int i10 = i9 & 14;
            boolean z7 = i10 == 4 || ((i9 & 8) != 0 && getpostalcode2.read(notifyviewvisibilitychanged));
            boolean z8 = (i9 & 7168) == 2048;
            boolean zSerializer = getpostalcode2.serializer(fMinimizedLabelHalfHeight);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
            if (((z5 | z6 | z7 | z8) || zSerializer) || objComponentActivity2 == androidContentCaptureManager2) {
                getpostalcode = getpostalcode2;
                TextFieldMeasurePolicy textFieldMeasurePolicy = new TextFieldMeasurePolicy(z, androidAutofillManager_androidKt, notifyviewvisibilitychanged, switchKt, fMinimizedLabelHalfHeight);
                getpostalcode.write(textFieldMeasurePolicy);
                objComponentActivity2 = textFieldMeasurePolicy;
            } else {
                getpostalcode = getpostalcode2;
            }
            TextFieldMeasurePolicy textFieldMeasurePolicy2 = (TextFieldMeasurePolicy) objComponentActivity2;
            LayoutDirection layoutDirection = (LayoutDirection) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalLayoutDirection());
            int iSerializer2 = SentryUUID.serializer(getpostalcode);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion.getConstructor();
            if (r53 != 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                AndroidContentCaptureManagerCompanion.write(getpostalcode, textFieldMeasurePolicy2, companion.getSetMeasurePolicy());
                AndroidContentCaptureManagerCompanion.write(getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer, companion.getSetResolvedCompositionLocals());
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (getpostalcode.ComponentActivity) {
                    c8$$ExternalSyntheticOutline0.m(iSerializer2, getpostalcode, iSerializer2, setCompositeKeyHash);
                } else {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer2)}, getCieXyz.write())).booleanValue()) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer2, getpostalcode, iSerializer2, setCompositeKeyHash);
                    }
                }
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf((i9 >> 3) & 14));
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 != null) {
                    getpostalcode.serializer(-1445181094);
                    Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, "Leading");
                    HorizontalAlignmentLine horizontalAlignmentLine = getFartKroMQ.IconCompatParcelizer;
                    Modifier modifierThen = modifierLayoutId.then(ZIndexNode.serializer);
                    MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getCenter(), false);
                    int iSerializer3 = SentryUUID.serializer(getpostalcode);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor3);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M2 = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                    if (getpostalcode.ComponentActivity) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer3, getpostalcode, iSerializer3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M2);
                    } else {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer3)}, getCieXyz.write())).booleanValue()) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer3, getpostalcode, iSerializer3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M2);
                        }
                    }
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, companion.getSetModifier());
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde2.invoke(getpostalcode, Integer.valueOf((i3 >> 12) & 14));
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-1444935078);
                    getpostalcode.IconCompatParcelizer(false);
                }
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 != null) {
                    getpostalcode.serializer(-1444892360);
                    Modifier modifierLayoutId2 = LayoutIdKt.layoutId(Modifier.Companion, "Trailing");
                    HorizontalAlignmentLine horizontalAlignmentLine2 = getFartKroMQ.IconCompatParcelizer;
                    Modifier modifierThen2 = modifierLayoutId2.then(ZIndexNode.serializer);
                    MeasurePolicy measurePolicy2 = BoxKt.read(Alignment.Companion.getCenter(), false);
                    int iSerializer4 = SentryUUID.serializer(getpostalcode);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen2);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor4);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M3 = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                    if (getpostalcode.ComponentActivity) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer4, getpostalcode, iSerializer4, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M3);
                    } else {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer4)}, getCieXyz.write())).booleanValue()) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer4, getpostalcode, iSerializer4, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M3);
                        }
                    }
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, companion.getSetModifier());
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde3.invoke(getpostalcode, Integer.valueOf((i3 >> 15) & 14));
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-1444644422);
                    getpostalcode.IconCompatParcelizer(false);
                }
                float fSerializer = PaddingKt.serializer(switchKt, layoutDirection);
                float fIconCompatParcelizer = PaddingKt.IconCompatParcelizer(switchKt, layoutDirection);
                float fTextFieldHorizontalIconPadding = TextFieldImplKt.textFieldHorizontalIconPadding(getpostalcode);
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 != null) {
                    float fM3673constructorimpl = Dp.m3673constructorimpl(fSerializer - fTextFieldHorizontalIconPadding);
                    float fM3673constructorimpl2 = Dp.m3673constructorimpl(0.0f);
                    if (fM3673constructorimpl < fM3673constructorimpl2) {
                        fM3673constructorimpl = fM3673constructorimpl2;
                    }
                    fSerializer = Dp.m3673constructorimpl(fM3673constructorimpl);
                }
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 != null) {
                    float fM3673constructorimpl3 = Dp.m3673constructorimpl(fIconCompatParcelizer - fTextFieldHorizontalIconPadding);
                    float fM3673constructorimpl4 = Dp.m3673constructorimpl(0.0f);
                    if (fM3673constructorimpl3 < fM3673constructorimpl4) {
                        fM3673constructorimpl3 = fM3673constructorimpl4;
                    }
                    fIconCompatParcelizer = Dp.m3673constructorimpl(fM3673constructorimpl3);
                }
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde4 != null) {
                    getpostalcode.serializer(-1443868027);
                    Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(SizeKt.serializer(SizeKt.m76heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "Prefix"), TextFieldImplKt.write, 0.0f, 2), (Alignment.Vertical) null, 3), fSerializer, 0.0f, TextFieldImplKt.read, 0.0f, 10);
                    MeasurePolicy measurePolicy3 = BoxKt.read(Alignment.Companion.getTopStart(), false);
                    int iSerializer5 = SentryUUID.serializer(getpostalcode);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor5 = companion.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor5);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M4 = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy3, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                    if (getpostalcode.ComponentActivity) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer5, getpostalcode, iSerializer5, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M4);
                    } else {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer5)}, getCieXyz.write())).booleanValue()) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer5, getpostalcode, iSerializer5, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M4);
                        }
                    }
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, companion.getSetModifier());
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde4.invoke(getpostalcode, Integer.valueOf((i3 >> 18) & 14));
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-1443540326);
                    getpostalcode.IconCompatParcelizer(false);
                }
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde5 != null) {
                    getpostalcode.serializer(-1443497081);
                    Modifier modifierM74paddingqDBjuR0$default2 = PaddingKt.m74paddingqDBjuR0$default(SizeKt.serializer(SizeKt.m76heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "Suffix"), TextFieldImplKt.write, 0.0f, 2), (Alignment.Vertical) null, 3), TextFieldImplKt.read, 0.0f, fIconCompatParcelizer, 0.0f, 10);
                    MeasurePolicy measurePolicy4 = BoxKt.read(Alignment.Companion.getTopStart(), false);
                    int iSerializer6 = SentryUUID.serializer(getpostalcode);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer5 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default2);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor6 = companion.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor6);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M5 = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy4, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer5);
                    if (getpostalcode.ComponentActivity) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer6, getpostalcode, iSerializer6, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M5);
                    } else {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer6)}, getCieXyz.write())).booleanValue()) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer6, getpostalcode, iSerializer6, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M5);
                        }
                    }
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier5, companion.getSetModifier());
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde5.invoke(getpostalcode, Integer.valueOf((i3 >> 21) & 14));
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-1443171302);
                    getpostalcode.IconCompatParcelizer(false);
                }
                Modifier.Companion companion2 = Modifier.Companion;
                Modifier modifierM74paddingqDBjuR0$default3 = PaddingKt.m74paddingqDBjuR0$default(companion2, fSerializer, 0.0f, fIconCompatParcelizer, 0.0f, 10);
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 != null) {
                    getpostalcode.serializer(-1442671489);
                    Modifier modifierLayoutId3 = LayoutIdKt.layoutId(companion2, "Label");
                    if (i10 != 4) {
                        if ((i9 & 8) != 0) {
                            notifyviewvisibilitychanged2 = notifyviewvisibilitychanged;
                            androidContentCaptureManager = androidContentCaptureManager2;
                            if (getpostalcode.IconCompatParcelizer(notifyviewvisibilitychanged2)) {
                            }
                            objComponentActivity = getpostalcode.ComponentActivity();
                            if (!z4 || objComponentActivity == androidContentCaptureManager) {
                                objComponentActivity = new accessisAutofillable(notifyviewvisibilitychanged2, 0);
                                getpostalcode.write(objComponentActivity);
                            }
                            Modifier modifierThen3 = SizeKt.serializer(LayoutModifierKt.layout(modifierLayoutId3, new DefaultLazyKey(1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity)), (Alignment.Vertical) null, 3).then(modifierM74paddingqDBjuR0$default3);
                            MeasurePolicy measurePolicy5 = BoxKt.read(Alignment.Companion.getTopStart(), false);
                            iSerializer = SentryUUID.serializer(getpostalcode);
                            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer6 = getpostalcode.serializer();
                            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen3);
                            constructor = companion.getConstructor();
                            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode.ComponentActivity) {
                                getpostalcode.serializer(constructor);
                            } else {
                                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy5, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer6);
                            if (getpostalcode.ComponentActivity) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                            } else {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                }
                            }
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier6, companion.getSetModifier());
                            r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(getpostalcode, Integer.valueOf((i3 >> 6) & 14));
                            z2 = true;
                            getpostalcode.IconCompatParcelizer(true);
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            notifyviewvisibilitychanged2 = notifyviewvisibilitychanged;
                            androidContentCaptureManager = androidContentCaptureManager2;
                        }
                        z4 = false;
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (!z4) {
                            objComponentActivity = new accessisAutofillable(notifyviewvisibilitychanged2, 0);
                            getpostalcode.write(objComponentActivity);
                        } else {
                            objComponentActivity = new accessisAutofillable(notifyviewvisibilitychanged2, 0);
                            getpostalcode.write(objComponentActivity);
                        }
                        Modifier modifierThen4 = SizeKt.serializer(LayoutModifierKt.layout(modifierLayoutId3, new DefaultLazyKey(1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity)), (Alignment.Vertical) null, 3).then(modifierM74paddingqDBjuR0$default3);
                        MeasurePolicy measurePolicy6 = BoxKt.read(Alignment.Companion.getTopStart(), false);
                        iSerializer = SentryUUID.serializer(getpostalcode);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer7 = getpostalcode.serializer();
                        Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen4);
                        constructor = companion.getConstructor();
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode.ComponentActivity) {
                            getpostalcode.serializer(constructor);
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy6, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer7);
                        if (getpostalcode.ComponentActivity) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                            }
                        } else {
                            c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                        }
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier7, companion.getSetModifier());
                        r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(getpostalcode, Integer.valueOf((i3 >> 6) & 14));
                        z2 = true;
                        getpostalcode.IconCompatParcelizer(true);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        notifyviewvisibilitychanged2 = notifyviewvisibilitychanged;
                        androidContentCaptureManager = androidContentCaptureManager2;
                    }
                    z4 = true;
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (!z4) {
                        objComponentActivity = new accessisAutofillable(notifyviewvisibilitychanged2, 0);
                        getpostalcode.write(objComponentActivity);
                    } else {
                        objComponentActivity = new accessisAutofillable(notifyviewvisibilitychanged2, 0);
                        getpostalcode.write(objComponentActivity);
                    }
                    Modifier modifierThen5 = SizeKt.serializer(LayoutModifierKt.layout(modifierLayoutId3, new DefaultLazyKey(1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity)), (Alignment.Vertical) null, 3).then(modifierM74paddingqDBjuR0$default3);
                    MeasurePolicy measurePolicy7 = BoxKt.read(Alignment.Companion.getTopStart(), false);
                    iSerializer = SentryUUID.serializer(getpostalcode);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer8 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen5);
                    constructor = companion.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy7, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer8);
                    if (getpostalcode.ComponentActivity) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                        }
                    } else {
                        c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                    }
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier8, companion.getSetModifier());
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(getpostalcode, Integer.valueOf((i3 >> 6) & 14));
                    z2 = true;
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    fSerializer = fSerializer;
                    z2 = true;
                    getpostalcode.serializer(-1442276518);
                    getpostalcode.IconCompatParcelizer(false);
                }
                Modifier modifierM74paddingqDBjuR0$default4 = PaddingKt.m74paddingqDBjuR0$default(SizeKt.serializer(SizeKt.m76heightInVpY3zN4$default(companion2, TextFieldImplKt.write, 0.0f, 2), (Alignment.Vertical) null, 3), r8lambdaa6_tctqmksh3fk6hjgcbkuvde4 == null ? fSerializer : Dp.m3673constructorimpl(0.0f), 0.0f, r8lambdaa6_tctqmksh3fk6hjgcbkuvde5 == null ? fIconCompatParcelizer : Dp.m3673constructorimpl(0.0f), 0.0f, 10);
                if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry != null) {
                    getpostalcode.serializer(-1441906533);
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(modifierM74paddingqDBjuR0$default4), getpostalcode, Integer.valueOf((i3 >> 6) & 112));
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-1441815238);
                    getpostalcode.IconCompatParcelizer(false);
                }
                Modifier modifierThen6 = LayoutIdKt.layoutId(companion2, "TextField").then(modifierM74paddingqDBjuR0$default4);
                Alignment.Companion companion3 = Alignment.Companion;
                MeasurePolicy measurePolicy8 = BoxKt.read(companion3.getTopStart(), z2);
                int iSerializer7 = SentryUUID.serializer(getpostalcode);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer9 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen6);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor7 = companion.getConstructor();
                if (r53 != 0) {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor7);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M6 = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy8, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer9);
                    if (getpostalcode.ComponentActivity) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer7, getpostalcode, iSerializer7, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M6);
                    } else {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer7)}, getCieXyz.write())).booleanValue()) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer7, getpostalcode, iSerializer7, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M6);
                        }
                    }
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier9, companion.getSetModifier());
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getpostalcode, Integer.valueOf((i3 >> 3) & 14));
                    getpostalcode.IconCompatParcelizer(true);
                    if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde6 != null) {
                        getpostalcode.serializer(-1441566587);
                        Modifier modifierSerializer = SizeKt.serializer(SizeKt.m76heightInVpY3zN4$default(LayoutIdKt.layoutId(companion2, "Supporting"), TextFieldImplKt.serializer, 0.0f, 2), (Alignment.Vertical) null, 3);
                        int i11 = TextFieldDefaults.serializer;
                        Modifier modifierIconCompatParcelizer = PaddingKt.IconCompatParcelizer(modifierSerializer, TextFieldDefaults.m129supportingTextPaddinga9UjIt4$material3$default());
                        MeasurePolicy measurePolicy9 = BoxKt.read(companion3.getTopStart(), false);
                        int iSerializer8 = SentryUUID.serializer(getpostalcode);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer10 = getpostalcode.serializer();
                        Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(getpostalcode, modifierIconCompatParcelizer);
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor8 = companion.getConstructor();
                        if (getaddresscountry != null) {
                            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode.ComponentActivity) {
                                getpostalcode.serializer(constructor8);
                            } else {
                                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M7 = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy9, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer10);
                            if (getpostalcode.ComponentActivity) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer8, getpostalcode, iSerializer8, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M7);
                            } else {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer8)}, getCieXyz.write())).booleanValue()) {
                                    c8$$ExternalSyntheticOutline0.m(iSerializer8, getpostalcode, iSerializer8, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M7);
                                }
                            }
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier10, companion.getSetModifier());
                            r8lambdaa6_tctqmksh3fk6hjgcbkuvde6.invoke(getpostalcode, Integer.valueOf((i9 >> 6) & 14));
                            z3 = true;
                            getpostalcode.IconCompatParcelizer(true);
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            SentryUUID.write();
                            throw null;
                        }
                    } else {
                        z3 = true;
                        getpostalcode.serializer(-1441177382);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(z3);
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.AndroidAutofillManagerWhenMappings
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                    androidx.compose.material3.TextFieldKt.TextFieldLayout(modifier, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde4, r8lambdaa6_tctqmksh3fk6hjgcbkuvde5, z, androidAutofillManager_androidKt, notifyviewvisibilitychanged, dragAndDropTargetModifierNode, r8lambdaa6_tctqmksh3fk6hjgcbkuvde6, switchKt, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }
}
