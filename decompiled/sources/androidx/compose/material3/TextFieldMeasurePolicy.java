package androidx.compose.material3;

import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda3;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.util.MathHelpersKt;
import io.sentry.android.replay.ComponentActivity;
import java.util.List;
import kotlin.math.MathKt;
import o.AndroidAutofillManager_androidKt;
import o.DrawableTransformation;
import o.accesstrimToSafeLength;
import o.createInAppMessageEventSubscriber;
import o.getCieXyz;
import o.notifyViewVisibilityChanged;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldMeasurePolicy implements MeasurePolicy {
    public final notifyViewVisibilityChanged IconCompatParcelizer;
    public final o.SwitchKt RemoteActionCompatParcelizer;
    public final float read;
    public final boolean serializer;
    public final AndroidAutofillManager_androidKt write;

    /* JADX INFO: renamed from: calculateHeight-mKXJcVc$1, reason: not valid java name */
    public final int m130calculateHeightmKXJcVc$1(IntrinsicMeasureScope intrinsicMeasureScope, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        o.SwitchKt switchKt = this.RemoteActionCompatParcelizer;
        int iMo42roundToPx0680j_4 = intrinsicMeasureScope.mo42roundToPx0680j_4(Dp.m3673constructorimpl(switchKt.RemoteActionCompatParcelizer() + switchKt.IconCompatParcelizer()));
        int[] iArr = {i7, i5, i6, MathHelpersKt.lerp(i2, 0, f)};
        for (int i9 = 0; i9 < 4; i9++) {
            i = Math.max(i, iArr[i9]);
        }
        return ConstraintsKt.m3642constrainHeightK40F9xA(j, Math.max(i3, Math.max(i4, iMo42roundToPx0680j_4 + (i2 > 0 ? Math.max(intrinsicMeasureScope.mo42roundToPx0680j_4(Dp.m3673constructorimpl(this.read * 2.0f)), MathHelpersKt.lerp(0, i2, accesstrimToSafeLength.serializer.transform(f))) : 0) + i)) + i8);
    }

    public TextFieldMeasurePolicy(boolean z, AndroidAutofillManager_androidKt androidAutofillManager_androidKt, notifyViewVisibilityChanged notifyviewvisibilitychanged, o.SwitchKt switchKt, float f) {
        this.serializer = z;
        this.write = androidAutofillManager_androidKt;
        this.IconCompatParcelizer = notifyviewvisibilitychanged;
        this.RemoteActionCompatParcelizer = switchKt;
        this.read = f;
    }

    public static final int read(TextFieldMeasurePolicy textFieldMeasurePolicy, int i, int i2, Placeable placeable) {
        return textFieldMeasurePolicy.serializer ? Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i) : i2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return intrinsicHeight$1(intrinsicMeasureScope, list, i, new ScrollState$$ExternalSyntheticLambda3(13));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return intrinsicWidth(list, i, new ScrollState$$ExternalSyntheticLambda3(11));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return intrinsicHeight$1(intrinsicMeasureScope, list, i, new ScrollState$$ExternalSyntheticLambda3(12));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return intrinsicWidth(list, i, new ScrollState$$ExternalSyntheticLambda3(10));
    }

    public static int intrinsicWidth(List list, int i, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        List list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ComponentActivity.read((IntrinsicMeasurable) obj7), "TextField"}, getCieXyz.write())).booleanValue()) {
                int iIntValue = ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i3);
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ComponentActivity.read((IntrinsicMeasurable) obj), "Label"}, getCieXyz.write())).booleanValue()) {
                        break;
                    }
                    i3++;
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj;
                int iIntValue2 = intrinsicMeasurable != null ? ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(intrinsicMeasurable, Integer.valueOf(i))).intValue() : 0;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i4);
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ComponentActivity.read((IntrinsicMeasurable) obj2), "Trailing"}, getCieXyz.write())).booleanValue()) {
                        break;
                    }
                    i4++;
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj2;
                int iIntValue3 = intrinsicMeasurable2 != null ? ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(intrinsicMeasurable2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i5);
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ComponentActivity.read((IntrinsicMeasurable) obj3), "Prefix"}, getCieXyz.write())).booleanValue()) {
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj3;
                int iIntValue4 = intrinsicMeasurable3 != null ? ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(intrinsicMeasurable3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i6);
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ComponentActivity.read((IntrinsicMeasurable) obj4), "Suffix"}, getCieXyz.write())).booleanValue()) {
                        break;
                    }
                    i6++;
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj4;
                int iIntValue5 = intrinsicMeasurable4 != null ? ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(intrinsicMeasurable4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list2.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i7);
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ComponentActivity.read((IntrinsicMeasurable) obj5), "Leading"}, getCieXyz.write())).booleanValue()) {
                        break;
                    }
                    i7++;
                }
                IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) obj5;
                int iIntValue6 = intrinsicMeasurable5 != null ? ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(intrinsicMeasurable5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list2.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i8);
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ComponentActivity.read((IntrinsicMeasurable) obj6), "Hint"}, getCieXyz.write())).booleanValue()) {
                        break;
                    }
                    i8++;
                }
                IntrinsicMeasurable intrinsicMeasurable6 = (IntrinsicMeasurable) obj6;
                int i9 = iIntValue4 + iIntValue5;
                return ConstraintsKt.m3643constrainWidthK40F9xA(ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), Math.max(iIntValue + i9, Math.max((intrinsicMeasurable6 != null ? ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(intrinsicMeasurable6, Integer.valueOf(i))).intValue() : 0) + i9, iIntValue2)) + iIntValue6 + iIntValue3);
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        DrawableTransformation.read();
        return 0;
    }

    public final int intrinsicHeight$1(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        Object obj;
        int i2;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i3;
        Object obj5;
        int i4;
        Object obj6;
        Object obj7;
        List list2 = list;
        int size = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ComponentActivity.read((IntrinsicMeasurable) obj), "Leading"}, getCieXyz.write())).booleanValue()) {
                break;
            }
            i5++;
        }
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj;
        if (intrinsicMeasurable != null) {
            i2 = ComponentActivity.read(i, intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue = ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(intrinsicMeasurable, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i6);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ComponentActivity.read((IntrinsicMeasurable) obj2), "Trailing"}, getCieXyz.write())).booleanValue()) {
                break;
            }
            i6++;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj2;
        if (intrinsicMeasurable2 != null) {
            i2 = ComponentActivity.read(i2, intrinsicMeasurable2.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue2 = ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(intrinsicMeasurable2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i7);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ComponentActivity.read((IntrinsicMeasurable) obj3), "Label"}, getCieXyz.write())).booleanValue()) {
                break;
            }
            i7++;
        }
        Object obj8 = (IntrinsicMeasurable) obj3;
        int iIntValue3 = obj8 != null ? ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj8, Integer.valueOf(i2))).intValue() : 0;
        int size4 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i8);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ComponentActivity.read((IntrinsicMeasurable) obj4), "Prefix"}, getCieXyz.write())).booleanValue()) {
                break;
            }
            i8++;
        }
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
        if (intrinsicMeasurable3 != null) {
            int iIntValue4 = ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(intrinsicMeasurable3, Integer.valueOf(i2))).intValue();
            i2 = ComponentActivity.read(i2, intrinsicMeasurable3.maxIntrinsicWidth(Integer.MAX_VALUE));
            i3 = iIntValue4;
        } else {
            i3 = 0;
        }
        int size5 = list2.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i9);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ComponentActivity.read((IntrinsicMeasurable) obj5), "Suffix"}, getCieXyz.write())).booleanValue()) {
                break;
            }
            i9++;
        }
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj5;
        if (intrinsicMeasurable4 != null) {
            int iIntValue5 = ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(intrinsicMeasurable4, Integer.valueOf(i2))).intValue();
            i2 = ComponentActivity.read(i2, intrinsicMeasurable4.maxIntrinsicWidth(Integer.MAX_VALUE));
            i4 = iIntValue5;
        } else {
            i4 = 0;
        }
        int size6 = list2.size();
        for (int i10 = 0; i10 < size6; i10++) {
            Object obj9 = list.get(i10);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ComponentActivity.read((IntrinsicMeasurable) obj9), "TextField"}, getCieXyz.write())).booleanValue()) {
                int iIntValue6 = ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj9, Integer.valueOf(i2))).intValue();
                int size7 = list2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i11);
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ComponentActivity.read((IntrinsicMeasurable) obj6), "Hint"}, getCieXyz.write())).booleanValue()) {
                        break;
                    }
                    i11++;
                }
                Object obj10 = (IntrinsicMeasurable) obj6;
                int iIntValue7 = obj10 != null ? ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj10, Integer.valueOf(i2))).intValue() : 0;
                int size8 = list2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i12);
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ComponentActivity.read((IntrinsicMeasurable) obj11), "Supporting"}, getCieXyz.write())).booleanValue()) {
                        obj7 = obj11;
                        break;
                    }
                    i12++;
                }
                Object obj12 = (IntrinsicMeasurable) obj7;
                return m130calculateHeightmKXJcVc$1(intrinsicMeasureScope, iIntValue6, iIntValue3, iIntValue, iIntValue2, i3, i4, iIntValue7, obj12 != null ? ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj12, Integer.valueOf(i))).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.IconCompatParcelizer.IconCompatParcelizer());
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        DrawableTransformation.read();
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo6measure3p2s80s(final MeasureScope measureScope, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        final float fIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer();
        o.SwitchKt switchKt = this.RemoteActionCompatParcelizer;
        final int iMo42roundToPx0680j_4 = measureScope.mo42roundToPx0680j_4(switchKt.IconCompatParcelizer());
        int iMo42roundToPx0680j_5 = measureScope.mo42roundToPx0680j_4(switchKt.RemoteActionCompatParcelizer());
        long jM3616copyZbe2FdA$default = Constraints.m3616copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        List list2 = list;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{LayoutIdKt.getLayoutId((Measurable) obj), "Leading"}, getCieXyz.write())).booleanValue()) {
                break;
            }
            i++;
        }
        Measurable measurable = (Measurable) obj;
        Placeable placeableMo2209measureBRTryo0 = measurable != null ? measurable.mo2209measureBRTryo0(jM3616copyZbe2FdA$default) : null;
        int iWrite = ComponentActivity.write(placeableMo2209measureBRTryo0);
        int iMax = Math.max(0, ComponentActivity.serializer(placeableMo2209measureBRTryo0));
        int size2 = list2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i2);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{LayoutIdKt.getLayoutId((Measurable) obj2), "Trailing"}, getCieXyz.write())).booleanValue()) {
                break;
            }
            i2++;
        }
        Measurable measurable2 = (Measurable) obj2;
        Placeable placeableMo2209measureBRTryo1 = measurable2 != null ? measurable2.mo2209measureBRTryo0(ConstraintsKt.m3646offsetNN6EwU$default(jM3616copyZbe2FdA$default, -iWrite, 0, 2, null)) : null;
        int iWrite2 = ComponentActivity.write(placeableMo2209measureBRTryo1) + iWrite;
        int iMax2 = Math.max(iMax, ComponentActivity.serializer(placeableMo2209measureBRTryo1));
        int size3 = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i3);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{LayoutIdKt.getLayoutId((Measurable) obj3), "Prefix"}, getCieXyz.write())).booleanValue()) {
                break;
            }
            i3++;
        }
        Measurable measurable3 = (Measurable) obj3;
        Placeable placeableMo2209measureBRTryo2 = measurable3 != null ? measurable3.mo2209measureBRTryo0(ConstraintsKt.m3646offsetNN6EwU$default(jM3616copyZbe2FdA$default, -iWrite2, 0, 2, null)) : null;
        int iWrite3 = ComponentActivity.write(placeableMo2209measureBRTryo2) + iWrite2;
        int iMax3 = Math.max(iMax2, ComponentActivity.serializer(placeableMo2209measureBRTryo2));
        int size4 = list2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i4);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{LayoutIdKt.getLayoutId((Measurable) obj4), "Suffix"}, getCieXyz.write())).booleanValue()) {
                break;
            }
            i4++;
        }
        Measurable measurable4 = (Measurable) obj4;
        Placeable placeableMo2209measureBRTryo3 = measurable4 != null ? measurable4.mo2209measureBRTryo0(ConstraintsKt.m3646offsetNN6EwU$default(jM3616copyZbe2FdA$default, -iWrite3, 0, 2, null)) : null;
        int iWrite4 = ComponentActivity.write(placeableMo2209measureBRTryo3);
        int iMax4 = Math.max(iMax3, ComponentActivity.serializer(placeableMo2209measureBRTryo3));
        int size5 = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i5);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{LayoutIdKt.getLayoutId((Measurable) obj5), "Label"}, getCieXyz.write())).booleanValue()) {
                break;
            }
            i5++;
        }
        Measurable measurable5 = (Measurable) obj5;
        final createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        int i6 = -(iWrite4 + iWrite3);
        createinappmessageeventsubscriber.IconCompatParcelizer = measurable5 != null ? measurable5.mo2209measureBRTryo0(ConstraintsKt.m3645offsetNN6EwU(jM3616copyZbe2FdA$default, i6, -iMo42roundToPx0680j_5)) : null;
        int size6 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list.get(i7);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{LayoutIdKt.getLayoutId((Measurable) obj6), "Supporting"}, getCieXyz.write())).booleanValue()) {
                break;
            }
            i7++;
        }
        Measurable measurable6 = (Measurable) obj6;
        int iMinIntrinsicHeight = measurable6 != null ? measurable6.minIntrinsicHeight(Constraints.m3628getMinWidthimpl(j)) : 0;
        int iSerializer = ComponentActivity.serializer((Placeable) createinappmessageeventsubscriber.IconCompatParcelizer) + iMo42roundToPx0680j_4;
        long jM3645offsetNN6EwU = ConstraintsKt.m3645offsetNN6EwU(Constraints.m3616copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null), i6, ((-iSerializer) - iMo42roundToPx0680j_5) - iMinIntrinsicHeight);
        int size7 = list2.size();
        int i8 = 0;
        while (i8 < size7) {
            Measurable measurable7 = (Measurable) list.get(i8);
            int i9 = size7;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{LayoutIdKt.getLayoutId(measurable7), "TextField"}, getCieXyz.write())).booleanValue()) {
                final Placeable placeableMo2209measureBRTryo4 = measurable7.mo2209measureBRTryo0(jM3645offsetNN6EwU);
                long jM3616copyZbe2FdA$default2 = Constraints.m3616copyZbe2FdA$default(jM3645offsetNN6EwU, 0, 0, 0, 0, 14, null);
                int size8 = list2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i10);
                    int i11 = size8;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{LayoutIdKt.getLayoutId((Measurable) obj7), "Hint"}, getCieXyz.write())).booleanValue()) {
                        break;
                    }
                    i10++;
                    size8 = i11;
                }
                Measurable measurable8 = (Measurable) obj7;
                Placeable placeableMo2209measureBRTryo5 = measurable8 != null ? measurable8.mo2209measureBRTryo0(jM3616copyZbe2FdA$default2) : null;
                int iMax5 = Math.max(iMax4, Math.max(ComponentActivity.serializer(placeableMo2209measureBRTryo4), ComponentActivity.serializer(placeableMo2209measureBRTryo5)) + iSerializer + iMo42roundToPx0680j_5);
                int iWrite5 = ComponentActivity.write(placeableMo2209measureBRTryo0);
                int iWrite6 = ComponentActivity.write(placeableMo2209measureBRTryo1);
                int iWrite7 = ComponentActivity.write(placeableMo2209measureBRTryo2) + ComponentActivity.write(placeableMo2209measureBRTryo3);
                final int iM3643constrainWidthK40F9xA = ConstraintsKt.m3643constrainWidthK40F9xA(j, Math.max(placeableMo2209measureBRTryo4.getWidth() + iWrite7, Math.max(ComponentActivity.write(placeableMo2209measureBRTryo5) + iWrite7, ComponentActivity.write((Placeable) createinappmessageeventsubscriber.IconCompatParcelizer))) + iWrite5 + iWrite6);
                Placeable placeableMo2209measureBRTryo6 = measurable6 != null ? measurable6.mo2209measureBRTryo0(Constraints.m3616copyZbe2FdA$default(ConstraintsKt.m3646offsetNN6EwU$default(jM3616copyZbe2FdA$default, 0, -iMax5, 1, null), 0, iM3643constrainWidthK40F9xA, 0, 0, 9, null)) : null;
                int iSerializer2 = ComponentActivity.serializer(placeableMo2209measureBRTryo6);
                final int iM130calculateHeightmKXJcVc$1 = m130calculateHeightmKXJcVc$1(measureScope, placeableMo2209measureBRTryo4.getHeight(), ComponentActivity.serializer((Placeable) createinappmessageeventsubscriber.IconCompatParcelizer), ComponentActivity.serializer(placeableMo2209measureBRTryo0), ComponentActivity.serializer(placeableMo2209measureBRTryo1), ComponentActivity.serializer(placeableMo2209measureBRTryo2), ComponentActivity.serializer(placeableMo2209measureBRTryo3), ComponentActivity.serializer(placeableMo2209measureBRTryo5), ComponentActivity.serializer(placeableMo2209measureBRTryo6), j, fIconCompatParcelizer);
                final int i12 = iM130calculateHeightmKXJcVc$1 - iSerializer2;
                int size9 = list2.size();
                for (int i13 = 0; i13 < size9; i13++) {
                    Measurable measurable9 = (Measurable) list.get(i13);
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{LayoutIdKt.getLayoutId(measurable9), "Container"}, getCieXyz.write())).booleanValue()) {
                        final Placeable placeableMo2209measureBRTryo7 = measurable9.mo2209measureBRTryo0(ConstraintsKt.Constraints(iM3643constrainWidthK40F9xA != Integer.MAX_VALUE ? iM3643constrainWidthK40F9xA : 0, iM3643constrainWidthK40F9xA, i12 != Integer.MAX_VALUE ? i12 : 0, i12));
                        final Placeable placeable = placeableMo2209measureBRTryo5;
                        final Placeable placeable2 = placeableMo2209measureBRTryo0;
                        final Placeable placeable3 = placeableMo2209measureBRTryo1;
                        final Placeable placeable4 = placeableMo2209measureBRTryo2;
                        final Placeable placeable5 = placeableMo2209measureBRTryo3;
                        final Placeable placeable6 = placeableMo2209measureBRTryo6;
                        return MeasureScope.layout$default(measureScope, iM3643constrainWidthK40F9xA, iM130calculateHeightmKXJcVc$1, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.isRelatedToAutofill
                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final Object invoke(Object obj8) {
                                int iMo42roundToPx0680j_6;
                                int iWrite8;
                                androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj8;
                                createInAppMessageEventSubscriber createinappmessageeventsubscriber2 = createinappmessageeventsubscriber;
                                Object obj9 = createinappmessageeventsubscriber2.IconCompatParcelizer;
                                androidx.compose.material3.TextFieldMeasurePolicy textFieldMeasurePolicy = this;
                                androidx.compose.ui.layout.MeasureScope measureScope2 = measureScope;
                                int i14 = iM3643constrainWidthK40F9xA;
                                int i15 = iM130calculateHeightmKXJcVc$1;
                                androidx.compose.ui.layout.Placeable placeable7 = placeableMo2209measureBRTryo4;
                                androidx.compose.ui.layout.Placeable placeable8 = placeable;
                                androidx.compose.ui.layout.Placeable placeable9 = placeable2;
                                androidx.compose.ui.layout.Placeable placeable10 = placeable3;
                                androidx.compose.ui.layout.Placeable placeable11 = placeable4;
                                androidx.compose.ui.layout.Placeable placeable12 = placeable5;
                                androidx.compose.ui.layout.Placeable placeable13 = placeableMo2209measureBRTryo7;
                                androidx.compose.ui.layout.Placeable placeable14 = placeable6;
                                if (obj9 != null) {
                                    boolean z = textFieldMeasurePolicy.serializer;
                                    int i16 = iMo42roundToPx0680j_4;
                                    if (z) {
                                        iMo42roundToPx0680j_6 = androidx.compose.ui.Alignment.Companion.getCenterVertically().align(((androidx.compose.ui.layout.Placeable) createinappmessageeventsubscriber2.IconCompatParcelizer).getHeight(), i12);
                                    } else {
                                        iMo42roundToPx0680j_6 = measureScope2.mo42roundToPx0680j_4(textFieldMeasurePolicy.read) + i16;
                                    }
                                    int i17 = iMo42roundToPx0680j_6;
                                    androidx.compose.ui.layout.Placeable placeable15 = (androidx.compose.ui.layout.Placeable) createinappmessageeventsubscriber2.IconCompatParcelizer;
                                    int height = placeable15.getHeight() + i16;
                                    androidx.compose.ui.unit.LayoutDirection layoutDirection = measureScope2.getLayoutDirection();
                                    AndroidAutofillManager_androidKt androidAutofillManager_androidKt = textFieldMeasurePolicy.write;
                                    androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable13, 0, 0, 0.0f, 4, null);
                                    int iSerializer3 = i15 - io.sentry.android.replay.ComponentActivity.serializer(placeable14);
                                    if (placeable9 != null) {
                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, androidx.compose.ui.Alignment.Companion.getCenterVertically().align(placeable9.getHeight(), iSerializer3), 0.0f, 4, null);
                                    }
                                    float f = fIconCompatParcelizer;
                                    int iLerp = androidx.compose.ui.util.MathHelpersKt.lerp(i17, i16, f);
                                    if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
                                        iWrite8 = io.sentry.android.replay.ComponentActivity.write(placeable9);
                                    } else {
                                        iWrite8 = io.sentry.android.replay.ComponentActivity.write(placeable10);
                                    }
                                    float f2 = androidx.compose.material3.internal.TextFieldImplKt.MediaSessionCompatQueueItem;
                                    androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable15, androidx.compose.ui.util.MathHelpersKt.lerp(androidAutofillManager_androidKt.IconCompatParcelizer.align(placeable15.getWidth(), (i14 - io.sentry.android.replay.ComponentActivity.write(placeable9)) - io.sentry.android.replay.ComponentActivity.write(placeable10), layoutDirection) + iWrite8, androidx.compose.material3.internal.TextFieldImplKt.write(androidAutofillManager_androidKt).align(placeable15.getWidth(), (i14 - io.sentry.android.replay.ComponentActivity.write(placeable9)) - io.sentry.android.replay.ComponentActivity.write(placeable10), layoutDirection) + iWrite8, f), iLerp, 0.0f, 4, null);
                                    if (placeable11 != null) {
                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable11, io.sentry.android.replay.ComponentActivity.write(placeable9), height, 0.0f, 4, null);
                                    }
                                    int iWrite9 = io.sentry.android.replay.ComponentActivity.write(placeable11) + io.sentry.android.replay.ComponentActivity.write(placeable9);
                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, iWrite9, height, 0.0f, 4, null);
                                    if (placeable8 != null) {
                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable8, iWrite9, height, 0.0f, 4, null);
                                    }
                                    if (placeable12 != null) {
                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable12, (i14 - io.sentry.android.replay.ComponentActivity.write(placeable10)) - placeable12.getWidth(), height, 0.0f, 4, null);
                                    }
                                    if (placeable10 != null) {
                                        int width = placeable10.getWidth();
                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable10, i14 - width, androidx.compose.ui.Alignment.Companion.getCenterVertically().align(placeable10.getHeight(), iSerializer3), 0.0f, 4, null);
                                    }
                                    if (placeable14 != 0) {
                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable14, 0, iSerializer3, 0.0f, 4, null);
                                    }
                                } else {
                                    float density = measureScope2.getDensity();
                                    androidx.compose.ui.layout.Placeable.PlacementScope.m2280place70tqf50$default(placementScope, placeable13, androidx.compose.ui.unit.IntOffset.Companion.m3812getZeronOccac(), 0.0f, 2, null);
                                    int iSerializer4 = i15 - io.sentry.android.replay.ComponentActivity.serializer(placeable14);
                                    int iWrite10 = MathKt.write(textFieldMeasurePolicy.RemoteActionCompatParcelizer.IconCompatParcelizer() * density);
                                    if (placeable9 != null) {
                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, androidx.compose.ui.Alignment.Companion.getCenterVertically().align(placeable9.getHeight(), iSerializer4), 0.0f, 4, null);
                                    }
                                    if (placeable11 != null) {
                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable11, io.sentry.android.replay.ComponentActivity.write(placeable9), androidx.compose.material3.TextFieldMeasurePolicy.read(textFieldMeasurePolicy, iSerializer4, iWrite10, placeable11), 0.0f, 4, null);
                                    }
                                    int iWrite11 = io.sentry.android.replay.ComponentActivity.write(placeable9) + io.sentry.android.replay.ComponentActivity.write(placeable11);
                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, iWrite11, androidx.compose.material3.TextFieldMeasurePolicy.read(textFieldMeasurePolicy, iSerializer4, iWrite10, placeable7), 0.0f, 4, null);
                                    if (placeable8 != null) {
                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable8, iWrite11, androidx.compose.material3.TextFieldMeasurePolicy.read(textFieldMeasurePolicy, iSerializer4, iWrite10, placeable8), 0.0f, 4, null);
                                    }
                                    if (placeable12 != null) {
                                        int iWrite12 = io.sentry.android.replay.ComponentActivity.write(placeable10);
                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable12, (i14 - iWrite12) - placeable12.getWidth(), androidx.compose.material3.TextFieldMeasurePolicy.read(textFieldMeasurePolicy, iSerializer4, iWrite10, placeable12), 0.0f, 4, null);
                                    }
                                    if (placeable10 != null) {
                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable10, i14 - placeable10.getWidth(), androidx.compose.ui.Alignment.Companion.getCenterVertically().align(placeable10.getHeight(), iSerializer4), 0.0f, 4, null);
                                    }
                                    if (placeable14 != null) {
                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable14, 0, iSerializer4, 0.0f, 4, null);
                                    }
                                }
                                return createFromParcel.INSTANCE;
                            }
                        }, 4, null);
                    }
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                DrawableTransformation.read();
                return null;
            }
            i8++;
            size7 = i9;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        DrawableTransformation.read();
        return null;
    }
}
