package androidx.compose.ui.layout;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import io.sentry.SentryUUID;
import java.util.List;
import o.AndroidContentCaptureManagerCompanion;
import o.ContentType_androidKt;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.onItemDismisslambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutKt {
    public static final int LargeDimension = 32767;

    public static final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 combineAsVirtualLayouts(final List<? extends r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0> list) {
        return new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.layout.LayoutKt.combineAsVirtualLayouts.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void invoke(getBirthDateFull getbirthdatefull, int i) {
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                if (getpostalcode.write(i & 1, (i & 3) != 2)) {
                    List<r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0> list2 = list;
                    int size = list2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = list2.get(i2);
                        int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 virtualConstructor = companion.getVirtualConstructor();
                        if (getpostalcode.read != null) {
                            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode.ComponentActivity) {
                                getpostalcode.serializer(virtualConstructor);
                            } else {
                                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
                            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getpostalcode, 0);
                            getpostalcode.IconCompatParcelizer(true);
                        } else {
                            SentryUUID.write();
                            throw null;
                        }
                    }
                    return;
                }
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                return createFromParcel.INSTANCE;
            }
        }, true, 1271844412);
    }

    @onItemDismisslambda0
    public static final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY materializerOf(final Modifier modifier) {
        return new DragAndDropTargetModifierNode(new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: androidx.compose.ui.layout.LayoutKt$materializerOfWithCompositionLocalInjection$1
            {
                super(3);
            }

            @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                throw c8$$ExternalSyntheticOutline0.m(obj);
            }

            /* JADX INFO: renamed from: invoke-Deg8D_g, reason: not valid java name */
            public final void m2234invokeDeg8D_g(getBirthDateFull getbirthdatefull, getBirthDateFull getbirthdatefull2, int i) {
                int iHashCode = Integer.hashCode(SentryUUID.serializer(getbirthdatefull2));
                Modifier modifierMaterializeWithCompositionLocalInjectionInternal = ComposedModifierKt.materializeWithCompositionLocalInjectionInternal(getbirthdatefull2, modifier);
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                getpostalcode.write(509942095);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeWithCompositionLocalInjectionInternal, companion.getSetModifier());
                AndroidContentCaptureManagerCompanion.write(getpostalcode, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
                getpostalcode.IconCompatParcelizer(false);
            }
        }, true, -2123382363);
    }

    public static final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY modifierMaterializerOf(final Modifier modifier) {
        return new DragAndDropTargetModifierNode(new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: androidx.compose.ui.layout.LayoutKt.materializerOf.1
            /* JADX INFO: renamed from: invoke-Deg8D_g, reason: not valid java name */
            public final void m2233invokeDeg8D_g(getBirthDateFull getbirthdatefull, getBirthDateFull getbirthdatefull2, int i) {
                int iHashCode = Long.hashCode(((getPostalCode) getbirthdatefull2).RatingCompat);
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getbirthdatefull2, modifier);
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                getpostalcode.write(509942095);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                AndroidContentCaptureManagerCompanion.write(getpostalcode, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
                getpostalcode.IconCompatParcelizer(false);
            }

            {
                super(3);
            }

            @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                throw c8$$ExternalSyntheticOutline0.m(obj);
            }
        }, true, -511438721);
    }

    @UiComposable
    public static final void Layout(List<? extends r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0> list, Modifier modifier, MultiContentMeasurePolicy multiContentMeasurePolicy, getBirthDateFull getbirthdatefull, int i, int i2) {
        if ((i2 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0CombineAsVirtualLayouts = combineAsVirtualLayouts(list);
        boolean z = (((i & 896) ^ 384) > 256 && ((getPostalCode) getbirthdatefull).read(multiContentMeasurePolicy)) || (i & 384) == 256;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if (z || objComponentActivity == getCreditCardExpirationMonth.write) {
            objComponentActivity = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
            getpostalcode.write(objComponentActivity);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) objComponentActivity;
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
            return;
        }
        SentryUUID.write();
        throw null;
    }

    @UiComposable
    @onItemDismisslambda0
    public static final void MultiMeasureLayout(Modifier modifier, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, final MeasurePolicy measurePolicy, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1663319424);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode.read(measurePolicy) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            int iHashCode = Integer.hashCode(SentryUUID.serializer(getpostalcode));
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor$ui = LayoutNode.Companion.getConstructor$ui();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor$ui);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.read(getpostalcode, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$1$1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LayoutNode) obj);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(LayoutNode layoutNode) {
                    layoutNode.setCanMultiMeasure$ui(true);
                }
            });
            AndroidContentCaptureManagerCompanion.write(getpostalcode, companion.getApplyOnDeactivatedNodeAssertion());
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
            AndroidContentCaptureManagerCompanion.write(getpostalcode, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getpostalcode, Integer.valueOf(((((i3 << 3) & 896) | 6) >> 6) & 14));
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        final Modifier modifier2 = modifier;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(getBirthDateFull getbirthdatefull2, int i5) {
                    LayoutKt.MultiMeasureLayout(modifier2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, measurePolicy, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    @UiComposable
    public static final void Layout(Modifier modifier, MeasurePolicy measurePolicy, getBirthDateFull getbirthdatefull, int i, int i2) {
        if ((i2 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getbirthdatefull, modifier);
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
        if (getpostalcode.read != null) {
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            AndroidContentCaptureManagerCompanion.write(getbirthdatefull, measurePolicy, companion.getSetMeasurePolicy());
            AndroidContentCaptureManagerCompanion.write(getbirthdatefull, dragAndDropNodestartDragAndDropTransfer1Serializer, companion.getSetResolvedCompositionLocals());
            AndroidContentCaptureManagerCompanion.write(getbirthdatefull, companion.getApplyOnDeactivatedNodeAssertion());
            AndroidContentCaptureManagerCompanion.write(getbirthdatefull, modifierMaterializeModifier, companion.getSetModifier());
            AndroidContentCaptureManagerCompanion.write(getbirthdatefull, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
            getpostalcode.IconCompatParcelizer(true);
            return;
        }
        SentryUUID.write();
        throw null;
    }

    @UiComposable
    public static final void Layout(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, MeasurePolicy measurePolicy, getBirthDateFull getbirthdatefull, int i, int i2) {
        if ((i2 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getbirthdatefull, modifier);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
        if (getpostalcode.read != null) {
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            AndroidContentCaptureManagerCompanion.write(getbirthdatefull, measurePolicy, companion.getSetMeasurePolicy());
            AndroidContentCaptureManagerCompanion.write(getbirthdatefull, dragAndDropNodestartDragAndDropTransfer1Serializer, companion.getSetResolvedCompositionLocals());
            AndroidContentCaptureManagerCompanion.write(getbirthdatefull, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
            AndroidContentCaptureManagerCompanion.write(getbirthdatefull, companion.getApplyOnDeactivatedNodeAssertion());
            AndroidContentCaptureManagerCompanion.write(getbirthdatefull, modifierMaterializeModifier, companion.getSetModifier());
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getbirthdatefull, Integer.valueOf(((((i << 6) & 896) | 6) >> 6) & 14));
            getpostalcode.IconCompatParcelizer(true);
            return;
        }
        SentryUUID.write();
        throw null;
    }
}
