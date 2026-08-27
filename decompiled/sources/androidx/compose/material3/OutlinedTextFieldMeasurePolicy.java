package androidx.compose.material3;

import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda3;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Size;
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
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.util.MathHelpersKt;
import io.sentry.android.replay.ComponentActivity;
import java.util.List;
import kotlin.math.MathKt;
import o.AndroidAutofillManager_androidKt;
import o.DrawableTransformation;
import o.createInAppMessageEventSubscriber;
import o.getCieXyz;
import o.notifyViewVisibilityChanged;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final boolean MediaSessionCompatQueueItem;
    public final notifyViewVisibilityChanged RemoteActionCompatParcelizer;
    public final AndroidAutofillManager_androidKt read;
    public final float serializer;
    public final o.SwitchKt write;

    public final int RemoteActionCompatParcelizer(IntrinsicMeasureScope intrinsicMeasureScope, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int[] iArr = {i7, i3, i4, MathHelpersKt.lerp(i6, 0, f)};
        for (int i9 = 0; i9 < 4; i9++) {
            i5 = Math.max(i5, iArr[i9]);
        }
        o.SwitchKt switchKt = this.write;
        float fMo48toPx0680j_4 = intrinsicMeasureScope.mo48toPx0680j_4(switchKt.IconCompatParcelizer());
        return ConstraintsKt.m3642constrainHeightK40F9xA(j, Math.max(i, Math.max(i2, MathKt.write(MathHelpersKt.lerp(fMo48toPx0680j_4, Math.max(fMo48toPx0680j_4, i6 / 2.0f), f) + i5 + intrinsicMeasureScope.mo48toPx0680j_4(switchKt.RemoteActionCompatParcelizer())))) + i8);
    }

    public OutlinedTextFieldMeasurePolicy(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z, AndroidAutofillManager_androidKt androidAutofillManager_androidKt, notifyViewVisibilityChanged notifyviewvisibilitychanged, o.SwitchKt switchKt, float f) {
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaSessionCompatQueueItem = z;
        this.read = androidAutofillManager_androidKt;
        this.RemoteActionCompatParcelizer = notifyviewvisibilitychanged;
        this.write = switchKt;
        this.serializer = f;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new ScrollState$$ExternalSyntheticLambda3(7));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return intrinsicWidth(intrinsicMeasureScope, list, i, new ScrollState$$ExternalSyntheticLambda3(6));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new ScrollState$$ExternalSyntheticLambda3(5));
    }

    public static final int read(int i, OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, int i2, int i3, Placeable placeable, Placeable placeable2) {
        if (outlinedTextFieldMeasurePolicy.MediaSessionCompatQueueItem) {
            i3 = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i2);
        }
        return Math.max(i + i3, ComponentActivity.serializer(placeable) / 2);
    }

    /* JADX INFO: renamed from: calculateWidth-IzADHW4, reason: not valid java name */
    public final int m120calculateWidthIzADHW4(IntrinsicMeasureScope intrinsicMeasureScope, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, MathHelpersKt.lerp(i6, 0, f)));
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        o.SwitchKt switchKt = this.write;
        return ConstraintsKt.m3643constrainWidthK40F9xA(j, Math.max(iMax + i + i2, MathKt.write((i6 + intrinsicMeasureScope.mo48toPx0680j_4(Dp.m3673constructorimpl(switchKt.write(layoutDirection) + switchKt.read(layoutDirection)))) * f)));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return intrinsicWidth(intrinsicMeasureScope, list, i, new ScrollState$$ExternalSyntheticLambda3(8));
    }

    public final int intrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
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
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ComponentActivity.read((IntrinsicMeasurable) obj3), "Leading"}, getCieXyz.write())).booleanValue()) {
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
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ComponentActivity.read((IntrinsicMeasurable) obj4), "Prefix"}, getCieXyz.write())).booleanValue()) {
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
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ComponentActivity.read((IntrinsicMeasurable) obj5), "Suffix"}, getCieXyz.write())).booleanValue()) {
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
                return m120calculateWidthIzADHW4(intrinsicMeasureScope, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, intrinsicMeasurable6 != null ? ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(intrinsicMeasurable6, Integer.valueOf(i))).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.RemoteActionCompatParcelizer.IconCompatParcelizer());
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
        long jM555getZeroNHjbRc;
        Object obj6;
        Object obj7;
        final float fIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        o.SwitchKt switchKt = this.write;
        int iMo42roundToPx0680j_4 = measureScope.mo42roundToPx0680j_4(switchKt.RemoteActionCompatParcelizer());
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
        int iWrite2 = iWrite + ComponentActivity.write(placeableMo2209measureBRTryo1);
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
        int iWrite4 = ComponentActivity.write(placeableMo2209measureBRTryo3) + iWrite3;
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
        int iMo42roundToPx0680j_5 = measureScope.mo42roundToPx0680j_4(switchKt.write(measureScope.getLayoutDirection())) + measureScope.mo42roundToPx0680j_4(switchKt.read(measureScope.getLayoutDirection()));
        int i6 = -MathHelpersKt.lerp(iWrite4 + iMo42roundToPx0680j_5, iMo42roundToPx0680j_5, fIconCompatParcelizer);
        int i7 = -iMo42roundToPx0680j_4;
        Placeable placeableMo2209measureBRTryo4 = measurable5 != null ? measurable5.mo2209measureBRTryo0(ConstraintsKt.m3645offsetNN6EwU(jM3616copyZbe2FdA$default, i6, i7)) : null;
        createinappmessageeventsubscriber.IconCompatParcelizer = placeableMo2209measureBRTryo4;
        if (placeableMo2209measureBRTryo4 != null) {
            jM555getZeroNHjbRc = Size.m537constructorimpl((((long) Float.floatToRawIntBits(placeableMo2209measureBRTryo4.getWidth())) << 32) | (((long) Float.floatToRawIntBits(placeableMo2209measureBRTryo4.getHeight())) & 4294967295L));
        } else {
            jM555getZeroNHjbRc = Size.Companion.m555getZeroNHjbRc();
        }
        this.IconCompatParcelizer.invoke(Size.m534boximpl(jM555getZeroNHjbRc));
        int size6 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list.get(i8);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{LayoutIdKt.getLayoutId((Measurable) obj6), "Supporting"}, getCieXyz.write())).booleanValue()) {
                break;
            }
            i8++;
        }
        Measurable measurable6 = (Measurable) obj6;
        int iMinIntrinsicHeight = measurable6 != null ? measurable6.minIntrinsicHeight(Constraints.m3628getMinWidthimpl(j)) : 0;
        int iMax5 = Math.max(ComponentActivity.serializer((Placeable) createinappmessageeventsubscriber.IconCompatParcelizer) / 2, measureScope.mo42roundToPx0680j_4(switchKt.IconCompatParcelizer()));
        long jM3616copyZbe2FdA$default2 = Constraints.m3616copyZbe2FdA$default(ConstraintsKt.m3645offsetNN6EwU(j, -iWrite4, (i7 - iMax5) - iMinIntrinsicHeight), 0, 0, 0, 0, 11, null);
        int size7 = list2.size();
        int i9 = 0;
        while (i9 < size7) {
            int i10 = size7;
            Measurable measurable7 = (Measurable) list.get(i9);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{LayoutIdKt.getLayoutId(measurable7), "TextField"}, getCieXyz.write())).booleanValue()) {
                final Placeable placeableMo2209measureBRTryo5 = measurable7.mo2209measureBRTryo0(jM3616copyZbe2FdA$default2);
                long jM3616copyZbe2FdA$default3 = Constraints.m3616copyZbe2FdA$default(jM3616copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                int size8 = list2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i11);
                    int i12 = size8;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{LayoutIdKt.getLayoutId((Measurable) obj7), "Hint"}, getCieXyz.write())).booleanValue()) {
                        break;
                    }
                    i11++;
                    size8 = i12;
                }
                Measurable measurable8 = (Measurable) obj7;
                Placeable placeableMo2209measureBRTryo6 = measurable8 != null ? measurable8.mo2209measureBRTryo0(jM3616copyZbe2FdA$default3) : null;
                int iMax6 = Math.max(iMax4, Math.max(ComponentActivity.serializer(placeableMo2209measureBRTryo5), ComponentActivity.serializer(placeableMo2209measureBRTryo6)) + iMax5 + iMo42roundToPx0680j_4);
                final int iM120calculateWidthIzADHW4 = m120calculateWidthIzADHW4(measureScope, ComponentActivity.write(placeableMo2209measureBRTryo0), ComponentActivity.write(placeableMo2209measureBRTryo1), ComponentActivity.write(placeableMo2209measureBRTryo2), ComponentActivity.write(placeableMo2209measureBRTryo3), placeableMo2209measureBRTryo5.getWidth(), ComponentActivity.write((Placeable) createinappmessageeventsubscriber.IconCompatParcelizer), ComponentActivity.write(placeableMo2209measureBRTryo6), j, fIconCompatParcelizer);
                Placeable placeableMo2209measureBRTryo7 = measurable6 != null ? measurable6.mo2209measureBRTryo0(Constraints.m3616copyZbe2FdA$default(ConstraintsKt.m3646offsetNN6EwU$default(jM3616copyZbe2FdA$default, 0, -iMax6, 1, null), 0, iM120calculateWidthIzADHW4, 0, 0, 9, null)) : null;
                int iSerializer = ComponentActivity.serializer(placeableMo2209measureBRTryo7);
                final Placeable placeable = placeableMo2209measureBRTryo7;
                final int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(measureScope, ComponentActivity.serializer(placeableMo2209measureBRTryo0), ComponentActivity.serializer(placeableMo2209measureBRTryo1), ComponentActivity.serializer(placeableMo2209measureBRTryo2), ComponentActivity.serializer(placeableMo2209measureBRTryo3), placeableMo2209measureBRTryo5.getHeight(), ComponentActivity.serializer((Placeable) createinappmessageeventsubscriber.IconCompatParcelizer), ComponentActivity.serializer(placeableMo2209measureBRTryo6), ComponentActivity.serializer(placeableMo2209measureBRTryo7), j, fIconCompatParcelizer);
                int i13 = iRemoteActionCompatParcelizer - iSerializer;
                int size9 = list2.size();
                for (int i14 = 0; i14 < size9; i14++) {
                    Measurable measurable9 = (Measurable) list.get(i14);
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{LayoutIdKt.getLayoutId(measurable9), "Container"}, getCieXyz.write())).booleanValue()) {
                        final Placeable placeableMo2209measureBRTryo8 = measurable9.mo2209measureBRTryo0(ConstraintsKt.Constraints(iM120calculateWidthIzADHW4 != Integer.MAX_VALUE ? iM120calculateWidthIzADHW4 : 0, iM120calculateWidthIzADHW4, i13 != Integer.MAX_VALUE ? i13 : 0, i13));
                        final Placeable placeable2 = placeableMo2209measureBRTryo0;
                        final Placeable placeable3 = placeableMo2209measureBRTryo1;
                        final Placeable placeable4 = placeableMo2209measureBRTryo2;
                        final Placeable placeable5 = placeableMo2209measureBRTryo3;
                        final Placeable placeable6 = placeableMo2209measureBRTryo6;
                        return MeasureScope.layout$default(measureScope, iM120calculateWidthIzADHW4, iRemoteActionCompatParcelizer, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.onInputDeviceRemoved
                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final Object invoke(Object obj8) {
                                androidx.compose.ui.layout.Placeable placeable7;
                                int i15;
                                int i16;
                                int iAlign;
                                float f;
                                float width;
                                androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj8;
                                androidx.compose.ui.layout.Placeable placeable8 = (androidx.compose.ui.layout.Placeable) createinappmessageeventsubscriber.IconCompatParcelizer;
                                androidx.compose.ui.layout.MeasureScope measureScope2 = measureScope;
                                float density = measureScope2.getDensity();
                                androidx.compose.ui.unit.LayoutDirection layoutDirection = measureScope2.getLayoutDirection();
                                androidx.compose.material3.OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = this.serializer;
                                float fMo48toPx0680j_4 = measureScope2.mo48toPx0680j_4(outlinedTextFieldMeasurePolicy.serializer);
                                AndroidAutofillManager_androidKt androidAutofillManager_androidKt = outlinedTextFieldMeasurePolicy.read;
                                SwitchKt switchKt2 = outlinedTextFieldMeasurePolicy.write;
                                androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeableMo2209measureBRTryo8, 0, 0, 0.0f, 4, null);
                                androidx.compose.ui.layout.Placeable placeable9 = placeable;
                                int iSerializer2 = iRemoteActionCompatParcelizer - io.sentry.android.replay.ComponentActivity.serializer(placeable9);
                                int iWrite5 = MathKt.write(switchKt2.IconCompatParcelizer() * density);
                                androidx.compose.ui.layout.Placeable placeable10 = placeable2;
                                if (placeable10 != null) {
                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable10, 0, androidx.compose.ui.Alignment.Companion.getCenterVertically().align(placeable10.getHeight(), iSerializer2), 0.0f, 4, null);
                                }
                                int i17 = iM120calculateWidthIzADHW4;
                                androidx.compose.ui.layout.Placeable placeable11 = placeable3;
                                if (placeable8 != null) {
                                    if (outlinedTextFieldMeasurePolicy.MediaSessionCompatQueueItem) {
                                        i16 = iSerializer2;
                                        iAlign = androidx.compose.ui.Alignment.Companion.getCenterVertically().align(placeable8.getHeight(), i16);
                                    } else {
                                        i16 = iSerializer2;
                                        iAlign = iWrite5;
                                    }
                                    int i18 = -(placeable8.getHeight() / 2);
                                    float f2 = fIconCompatParcelizer;
                                    int iLerp = androidx.compose.ui.util.MathHelpersKt.lerp(iAlign, i18, f2);
                                    float fSerializer = androidx.compose.foundation.layout.PaddingKt.serializer(switchKt2, layoutDirection) * density;
                                    float fIconCompatParcelizer2 = androidx.compose.foundation.layout.PaddingKt.IconCompatParcelizer(switchKt2, layoutDirection) * density;
                                    if (placeable10 == 0) {
                                        f = fSerializer;
                                    } else {
                                        float width2 = placeable10.getWidth();
                                        float f3 = fSerializer - fMo48toPx0680j_4;
                                        if (f3 < 0.0f) {
                                            f3 = 0.0f;
                                        }
                                        f = width2 + f3;
                                    }
                                    if (placeable11 == null) {
                                        width = fIconCompatParcelizer2;
                                    } else {
                                        float f4 = fIconCompatParcelizer2 - fMo48toPx0680j_4;
                                        width = placeable11.getWidth() + (f4 >= 0.0f ? f4 : 0.0f);
                                    }
                                    androidx.compose.ui.unit.LayoutDirection layoutDirection2 = androidx.compose.ui.unit.LayoutDirection.Ltr;
                                    float f5 = layoutDirection == layoutDirection2 ? fSerializer : fIconCompatParcelizer2;
                                    float f6 = layoutDirection == layoutDirection2 ? f : width;
                                    float f7 = androidx.compose.material3.internal.TextFieldImplKt.MediaSessionCompatQueueItem;
                                    int iWrite6 = MathKt.write(androidx.compose.ui.util.MathHelpersKt.lerp(androidAutofillManager_androidKt.IconCompatParcelizer.align(placeable8.getWidth(), i17 - MathKt.write(f + width), layoutDirection) + f6, androidx.compose.material3.internal.TextFieldImplKt.write(androidAutofillManager_androidKt).align(placeable8.getWidth(), i17 - MathKt.write(fSerializer + fIconCompatParcelizer2), layoutDirection) + f5, f2));
                                    i15 = i16;
                                    placeable7 = placeable11;
                                    androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable8, iWrite6, iLerp, 0.0f, 4, null);
                                } else {
                                    placeable7 = placeable11;
                                    i15 = iSerializer2;
                                }
                                androidx.compose.ui.layout.Placeable placeable12 = placeable4;
                                if (placeable12 != null) {
                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable12, io.sentry.android.replay.ComponentActivity.write(placeable10), androidx.compose.material3.OutlinedTextFieldMeasurePolicy.read(0, outlinedTextFieldMeasurePolicy, i15, iWrite5, placeable8, placeable12), 0.0f, 4, null);
                                }
                                int iWrite7 = io.sentry.android.replay.ComponentActivity.write(placeable12) + io.sentry.android.replay.ComponentActivity.write(placeable10);
                                androidx.compose.ui.layout.Placeable placeable13 = placeableMo2209measureBRTryo5;
                                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable13, iWrite7, androidx.compose.material3.OutlinedTextFieldMeasurePolicy.read(0, outlinedTextFieldMeasurePolicy, i15, iWrite5, placeable8, placeable13), 0.0f, 4, null);
                                androidx.compose.ui.layout.Placeable placeable14 = placeable6;
                                if (placeable14 != null) {
                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable14, iWrite7, androidx.compose.material3.OutlinedTextFieldMeasurePolicy.read(0, outlinedTextFieldMeasurePolicy, i15, iWrite5, placeable8, placeable14), 0.0f, 4, null);
                                }
                                androidx.compose.ui.layout.Placeable placeable15 = placeable5;
                                if (placeable15 != null) {
                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable15, (i17 - io.sentry.android.replay.ComponentActivity.write(placeable7)) - placeable15.getWidth(), androidx.compose.material3.OutlinedTextFieldMeasurePolicy.read(0, outlinedTextFieldMeasurePolicy, i15, iWrite5, placeable8, placeable15), 0.0f, 4, null);
                                }
                                if (placeable7 != null) {
                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, i17 - placeable7.getWidth(), androidx.compose.ui.Alignment.Companion.getCenterVertically().align(placeable7.getHeight(), i15), 0.0f, 4, null);
                                }
                                if (placeable9 != 0) {
                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, i15, 0.0f, 4, null);
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
            i9++;
            size7 = i10;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        DrawableTransformation.read();
        return null;
    }

    public final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        Object obj;
        int i2;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int i3;
        int i4;
        Object obj6;
        Object obj7;
        float fIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
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
        int iIntValue4 = obj8 != null ? ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj8, Integer.valueOf(MathHelpersKt.lerp(i2, i, fIconCompatParcelizer)))).intValue() : 0;
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
            iIntValue3 = ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(intrinsicMeasurable3, Integer.valueOf(i2))).intValue();
            i2 = ComponentActivity.read(i2, intrinsicMeasurable3.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
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
            int i10 = ComponentActivity.read(i2, intrinsicMeasurable4.maxIntrinsicWidth(Integer.MAX_VALUE));
            i4 = iIntValue5;
            i3 = i10;
        } else {
            i3 = i2;
            i4 = 0;
        }
        int size6 = list2.size();
        for (int i11 = 0; i11 < size6; i11++) {
            Object obj9 = list.get(i11);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ComponentActivity.read((IntrinsicMeasurable) obj9), "TextField"}, getCieXyz.write())).booleanValue()) {
                int iIntValue6 = ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj9, Integer.valueOf(i3))).intValue();
                int size7 = list2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i12);
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ComponentActivity.read((IntrinsicMeasurable) obj6), "Hint"}, getCieXyz.write())).booleanValue()) {
                        break;
                    }
                    i12++;
                }
                Object obj10 = (IntrinsicMeasurable) obj6;
                int iIntValue7 = obj10 != null ? ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj10, Integer.valueOf(i3))).intValue() : 0;
                int size8 = list2.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i13);
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ComponentActivity.read((IntrinsicMeasurable) obj11), "Supporting"}, getCieXyz.write())).booleanValue()) {
                        obj7 = obj11;
                        break;
                    }
                    i13++;
                }
                Object obj12 = (IntrinsicMeasurable) obj7;
                return RemoteActionCompatParcelizer(intrinsicMeasureScope, iIntValue, iIntValue2, iIntValue3, i4, iIntValue6, iIntValue4, iIntValue7, obj12 != null ? ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj12, Integer.valueOf(i))).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), fIconCompatParcelizer);
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        DrawableTransformation.read();
        return 0;
    }
}
