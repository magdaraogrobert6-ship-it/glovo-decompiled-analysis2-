package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.tooling.animation.states.TargetState;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import androidx.sqlite.SQLite;
import com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda11;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import o.BlockDropShadowNodeobtainPainter1;
import o.BoxScopeInstance;
import o.FlowLayoutBuildingBlocksWrapInfo;
import o.SizeNode;
import o.TrackpadScrollingLogic;
import o.TransformGestureDetectorKtdetectTransformGestures2;
import o.aspectRatiodefault;
import o.getQueryParameterslambda2;
import o.isAdapterPositionOnScreen;
import o.onContentCardDismissed;
import o.onPan;
import o.onViewDetachedFromWindowlambda1;
import o.placeSpaceBetweenfoundation_layout;
import o.placeSpaceEvenlyfoundation_layout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.requiredSize3ABfNKs;
import o.requiredWidthInVpY3zN4default;

/* JADX INFO: loaded from: classes.dex */
public final class Utils_androidKt {
    private static final List<String> IGNORE_TRANSITIONS;

    public static final List<String> getIGNORE_TRANSITIONS() {
        return IGNORE_TRANSITIONS;
    }

    public static final long millisToNanos(long j) {
        return j * 1000000;
    }

    static {
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        IGNORE_TRANSITIONS = (List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{"TransformOriginInterruptionHandling"}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map createTransitionInfo$lambda$2(onPan onpan, long j, long j2, onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jCreateTransitionInfo$lambda$1 = createTransitionInfo$lambda$1(onviewdetachedfromwindowlambda1);
        linkedHashMap.put(Long.valueOf(jCreateTransitionInfo$lambda$1), onpan.RemoteActionCompatParcelizer(millisToNanos(createTransitionInfo$lambda$1(onviewdetachedfromwindowlambda1))));
        linkedHashMap.put(Long.valueOf(j), onpan.RemoteActionCompatParcelizer(millisToNanos(j)));
        long jCreateTransitionInfo$lambda$2 = createTransitionInfo$lambda$1(onviewdetachedfromwindowlambda1);
        while (jCreateTransitionInfo$lambda$2 <= j) {
            linkedHashMap.put(Long.valueOf(jCreateTransitionInfo$lambda$2), onpan.RemoteActionCompatParcelizer(millisToNanos(jCreateTransitionInfo$lambda$2)));
            jCreateTransitionInfo$lambda$2 += j2;
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map createTransitionInfo$lambda$4(long j, placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layout, long j2, long j3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Long.valueOf(j), placespacebetweenfoundation_layout.write.RemoteActionCompatParcelizer(millisToNanos(j)));
        linkedHashMap.put(Long.valueOf(j2), placespacebetweenfoundation_layout.write.RemoteActionCompatParcelizer(millisToNanos(j2)));
        while (j <= j2) {
            linkedHashMap.put(Long.valueOf(j), placespacebetweenfoundation_layout.write.RemoteActionCompatParcelizer(millisToNanos(j)));
            j += j3;
        }
        return linkedHashMap;
    }

    public static final List<requiredSize3ABfNKs> allAnimations(Transition transition) {
        SnapshotStateList snapshotStateList = transition.read;
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = snapshotStateList.listIterator();
        while (true) {
            BlockDropShadowNodeobtainPainter1 blockDropShadowNodeobtainPainter1 = (BlockDropShadowNodeobtainPainter1) listIterator;
            if (!blockDropShadowNodeobtainPainter1.hasNext()) {
                return onContentCardDismissed.IconCompatParcelizer(arrayList, transition.RemoteActionCompatParcelizer);
            }
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) allAnimations((Transition) blockDropShadowNodeobtainPainter1.next()), (Collection) arrayList);
        }
    }

    public static final <T, V extends TransformGestureDetectorKtdetectTransformGestures2> TransitionInfo createTransitionInfo(final onPan onpan, String str, TrackpadScrollingLogic trackpadScrollingLogic, final long j) {
        final long jNanosToMillis = nanosToMillis(onpan.serializer());
        final isAdapterPositionOnScreen isadapterpositiononscreen = new isAdapterPositionOnScreen(new CoroutineLiveData$$ExternalSyntheticLambda0(26, trackpadScrollingLogic));
        return new TransitionInfo(str, trackpadScrollingLogic.getClass().getName(), createTransitionInfo$lambda$1(isadapterpositiononscreen), jNanosToMillis, createTransitionInfo$lambda$3(new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.tooling.animation.clock.Utils_androidKt$$ExternalSyntheticLambda2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                return Utils_androidKt.createTransitionInfo$lambda$2(onpan, jNanosToMillis, j, isadapterpositiononscreen);
            }
        })));
    }

    private static final long createTransitionInfo$lambda$1(onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1) {
        return ((Number) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper()).longValue();
    }

    private static final <T> Map<Long, T> createTransitionInfo$lambda$3(onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1) {
        return (Map) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper();
    }

    private static final <T> Map<Long, T> createTransitionInfo$lambda$5(onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1) {
        return (Map) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper();
    }

    private static final boolean parseParametersToValue$parametersAreValid(Object obj, Object obj2) {
        return (obj == null || obj2 == null || obj.getClass() != obj2.getClass()) ? false : true;
    }

    private static final boolean parseParametersToValue$parametersHasTheSameType(Object obj, Object obj2, Object obj3) {
        return obj.getClass() == obj2.getClass() && obj.getClass() == obj3.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long createTransitionInfo$lambda$0(TrackpadScrollingLogic trackpadScrollingLogic) {
        boolean z;
        Number numberValueOf = 0L;
        if (trackpadScrollingLogic instanceof requiredWidthInVpY3zN4default) {
            numberValueOf = Integer.valueOf(((requiredWidthInVpY3zN4default) trackpadScrollingLogic).write);
        } else if (trackpadScrollingLogic instanceof FlowLayoutBuildingBlocksWrapInfo) {
            numberValueOf = Integer.valueOf(((FlowLayoutBuildingBlocksWrapInfo) trackpadScrollingLogic).read);
        } else {
            if (trackpadScrollingLogic instanceof aspectRatiodefault) {
                numberValueOf = 0;
            } else if (trackpadScrollingLogic instanceof BoxScopeInstance) {
                long j = ((BoxScopeInstance) trackpadScrollingLogic).IconCompatParcelizer;
                z = j > 0;
                if (!z) {
                    if (!z) {
                        numberValueOf = Integer.valueOf(Math.abs((int) j));
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return 0L;
                    }
                }
            } else if (trackpadScrollingLogic instanceof placeSpaceEvenlyfoundation_layout) {
                long j2 = ((placeSpaceEvenlyfoundation_layout) trackpadScrollingLogic).write;
                z = j2 > 0;
                if (!z) {
                    if (!z) {
                        numberValueOf = Integer.valueOf(Math.abs((int) j2));
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return 0L;
                    }
                }
            } else if (trackpadScrollingLogic instanceof SizeNode) {
                numberValueOf = Integer.valueOf(((SizeNode) trackpadScrollingLogic).IconCompatParcelizer());
            }
        }
        return numberValueOf.longValue();
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(requiredSize3ABfNKs requiredsize3abfnks, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1;
        }
        return createTransitionInfo(requiredsize3abfnks, j);
    }

    private static final Dp parseParametersToValue$getDp(Object obj) {
        Dp dpM3671boximpl = obj instanceof Dp ? (Dp) obj : null;
        if (dpM3671boximpl == null) {
            Float f = obj instanceof Float ? (Float) obj : null;
            dpM3671boximpl = f != null ? Dp.m3671boximpl(Dp.m3673constructorimpl(f.floatValue())) : null;
            if (dpM3671boximpl == null) {
                Double d = obj instanceof Double ? (Double) obj : null;
                dpM3671boximpl = d != null ? Dp.m3671boximpl(Dp.m3673constructorimpl((float) d.doubleValue())) : null;
                if (dpM3671boximpl == null) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    if (num != null) {
                        return Dp.m3671boximpl(Dp.m3673constructorimpl(num.intValue()));
                    }
                    return null;
                }
            }
        }
        return dpM3671boximpl;
    }

    public static final long nanosToMillis(long j) {
        return (j + 999999) / 1000000;
    }

    private static final <T> TargetState<Dp> parseParametersToValue$parseDp(T t, Object obj, Object obj2) {
        if (!(t instanceof Dp) || obj2 == null) {
            return null;
        }
        if ((obj instanceof Dp) && (obj2 instanceof Dp)) {
            return new TargetState<>(obj, obj2);
        }
        Dp parametersToValue$getDp = parseParametersToValue$getDp(obj);
        Dp parametersToValue$getDp2 = parseParametersToValue$getDp(obj2);
        if (parametersToValue$getDp == null || parametersToValue$getDp2 == null) {
            return null;
        }
        return new TargetState<>(parametersToValue$getDp, parametersToValue$getDp2);
    }

    public static final <T> TargetState<T> parseParametersToValue(T t, Object obj, Object obj2) {
        TargetState targetState;
        TargetState parametersToValue$parseDp;
        if (t == null) {
            return null;
        }
        TargetState<T> targetState2 = (TargetState<T>) parseParametersToValue$parseDp(t, obj, obj2);
        if (targetState2 != null) {
            return targetState2;
        }
        if (!parseParametersToValue$parametersAreValid(obj, obj2)) {
            return null;
        }
        obj2.getClass();
        if (parseParametersToValue$parametersHasTheSameType(t, obj, obj2)) {
            return new TargetState<>(obj, obj2);
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            try {
                if (t instanceof IntSize) {
                    Object obj3 = ((List) obj).get(0);
                    obj3.getClass();
                    int iIntValue = ((Integer) obj3).intValue();
                    Object obj4 = ((List) obj).get(1);
                    obj4.getClass();
                    IntSize intSizeM3836boximpl = IntSize.m3836boximpl(IntSize.m3839constructorimpl((((long) iIntValue) << 32) | (((long) ((Integer) obj4).intValue()) & 4294967295L)));
                    Object obj5 = ((List) obj2).get(0);
                    obj5.getClass();
                    int iIntValue2 = ((Integer) obj5).intValue();
                    Object obj6 = ((List) obj2).get(1);
                    obj6.getClass();
                    parametersToValue$parseDp = new TargetState(intSizeM3836boximpl, IntSize.m3836boximpl(IntSize.m3839constructorimpl((((long) ((Integer) obj6).intValue()) & 4294967295L) | (((long) iIntValue2) << 32))));
                } else {
                    if (t instanceof IntOffset) {
                        Object obj7 = ((List) obj).get(0);
                        obj7.getClass();
                        int iIntValue3 = ((Integer) obj7).intValue();
                        Object obj8 = ((List) obj).get(1);
                        obj8.getClass();
                        IntOffset intOffsetM3792boximpl = IntOffset.m3792boximpl(IntOffset.m3795constructorimpl((((long) ((Integer) obj8).intValue()) & 4294967295L) | (iIntValue3 << 32)));
                        Object obj9 = ((List) obj2).get(0);
                        obj9.getClass();
                        int iIntValue4 = ((Integer) obj9).intValue();
                        Object obj10 = ((List) obj2).get(1);
                        obj10.getClass();
                        targetState = new TargetState(intOffsetM3792boximpl, IntOffset.m3792boximpl(IntOffset.m3795constructorimpl((((long) ((Integer) obj10).intValue()) & 4294967295L) | (((long) iIntValue4) << 32))));
                    } else if (t instanceof Size) {
                        Object obj11 = ((List) obj).get(0);
                        obj11.getClass();
                        float fFloatValue = ((Float) obj11).floatValue();
                        Object obj12 = ((List) obj).get(1);
                        obj12.getClass();
                        Size sizeM534boximpl = Size.m534boximpl(Size.m537constructorimpl((((long) Float.floatToRawIntBits(((Float) obj12).floatValue())) & 4294967295L) | (Float.floatToRawIntBits(fFloatValue) << 32)));
                        Object obj13 = ((List) obj2).get(0);
                        obj13.getClass();
                        float fFloatValue2 = ((Float) obj13).floatValue();
                        Object obj14 = ((List) obj2).get(1);
                        obj14.getClass();
                        targetState = new TargetState(sizeM534boximpl, Size.m534boximpl(Size.m537constructorimpl((((long) Float.floatToRawIntBits(((Float) obj14).floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue2)) << 32))));
                    } else if (t instanceof Offset) {
                        Object obj15 = ((List) obj).get(0);
                        obj15.getClass();
                        float fFloatValue3 = ((Float) obj15).floatValue();
                        Object obj16 = ((List) obj).get(1);
                        obj16.getClass();
                        Offset offsetM466boximpl = Offset.m466boximpl(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(((Float) obj16).floatValue())) & 4294967295L) | (Float.floatToRawIntBits(fFloatValue3) << 32)));
                        Object obj17 = ((List) obj2).get(0);
                        obj17.getClass();
                        float fFloatValue4 = ((Float) obj17).floatValue();
                        Object obj18 = ((List) obj2).get(1);
                        obj18.getClass();
                        targetState = new TargetState(offsetM466boximpl, Offset.m466boximpl(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(((Float) obj18).floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue4)) << 32))));
                    } else if (t instanceof Rect) {
                        Object obj19 = ((List) obj).get(0);
                        obj19.getClass();
                        float fFloatValue5 = ((Float) obj19).floatValue();
                        Object obj20 = ((List) obj).get(1);
                        obj20.getClass();
                        float fFloatValue6 = ((Float) obj20).floatValue();
                        Object obj21 = ((List) obj).get(2);
                        obj21.getClass();
                        float fFloatValue7 = ((Float) obj21).floatValue();
                        Object obj22 = ((List) obj).get(3);
                        obj22.getClass();
                        Rect rect = new Rect(fFloatValue5, fFloatValue6, fFloatValue7, ((Float) obj22).floatValue());
                        Object obj23 = ((List) obj2).get(0);
                        obj23.getClass();
                        float fFloatValue8 = ((Float) obj23).floatValue();
                        Object obj24 = ((List) obj2).get(1);
                        obj24.getClass();
                        float fFloatValue9 = ((Float) obj24).floatValue();
                        Object obj25 = ((List) obj2).get(2);
                        obj25.getClass();
                        float fFloatValue10 = ((Float) obj25).floatValue();
                        Object obj26 = ((List) obj2).get(3);
                        obj26.getClass();
                        targetState = new TargetState(rect, new Rect(fFloatValue8, fFloatValue9, fFloatValue10, ((Float) obj26).floatValue()));
                    } else if (t instanceof Color) {
                        Object obj27 = ((List) obj).get(0);
                        obj27.getClass();
                        float fFloatValue11 = ((Float) obj27).floatValue();
                        Object obj28 = ((List) obj).get(1);
                        obj28.getClass();
                        float fFloatValue12 = ((Float) obj28).floatValue();
                        Object obj29 = ((List) obj).get(2);
                        obj29.getClass();
                        float fFloatValue13 = ((Float) obj29).floatValue();
                        Object obj30 = ((List) obj).get(3);
                        obj30.getClass();
                        Color colorM712boximpl = Color.m712boximpl(ColorKt.Color$default(fFloatValue11, fFloatValue12, fFloatValue13, ((Float) obj30).floatValue(), null, 16, null));
                        Object obj31 = ((List) obj2).get(0);
                        obj31.getClass();
                        float fFloatValue14 = ((Float) obj31).floatValue();
                        Object obj32 = ((List) obj2).get(1);
                        obj32.getClass();
                        float fFloatValue15 = ((Float) obj32).floatValue();
                        Object obj33 = ((List) obj2).get(2);
                        obj33.getClass();
                        float fFloatValue16 = ((Float) obj33).floatValue();
                        Object obj34 = ((List) obj2).get(3);
                        obj34.getClass();
                        targetState = new TargetState(colorM712boximpl, Color.m712boximpl(ColorKt.Color$default(fFloatValue14, fFloatValue15, fFloatValue16, ((Float) obj34).floatValue(), null, 16, null)));
                    } else if (t instanceof Dp) {
                        Object obj35 = ((List) obj).get(0);
                        obj35.getClass();
                        Object obj36 = ((List) obj2).get(0);
                        obj36.getClass();
                        parametersToValue$parseDp = parseParametersToValue$parseDp(t, obj35, obj36);
                    } else if (parseParametersToValue$parametersAreValid(((List) obj).get(0), ((List) obj2).get(0))) {
                        Object obj37 = ((List) obj).get(0);
                        obj37.getClass();
                        Object obj38 = ((List) obj2).get(0);
                        obj38.getClass();
                        if (parseParametersToValue$parametersHasTheSameType(t, obj37, obj38)) {
                            targetState = new TargetState(((List) obj).get(0), ((List) obj2).get(0));
                        }
                    }
                    parametersToValue$parseDp = targetState;
                }
                parametersToValue$parseDp.getClass();
                return parametersToValue$parseDp;
            } catch (ClassCastException | IllegalArgumentException | IndexOutOfBoundsException | NullPointerException unused) {
            }
        }
        return null;
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(onPan onpan, String str, TrackpadScrollingLogic trackpadScrollingLogic, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 1;
        }
        return createTransitionInfo(onpan, str, trackpadScrollingLogic, j);
    }

    public static /* synthetic */ TransitionInfo createTransitionInfo$default(placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layout, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1;
        }
        return createTransitionInfo(placespacebetweenfoundation_layout, j, j2);
    }

    public static final <T, V extends TransformGestureDetectorKtdetectTransformGestures2, S> TransitionInfo createTransitionInfo(requiredSize3ABfNKs requiredsize3abfnks, long j) {
        return createTransitionInfo(requiredsize3abfnks.IconCompatParcelizer(), requiredsize3abfnks.MediaMetadataCompat, requiredsize3abfnks.serializer(), j);
    }

    public static final <T, V extends TransformGestureDetectorKtdetectTransformGestures2> TransitionInfo createTransitionInfo(placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layout, long j, long j2) {
        return new TransitionInfo(placespacebetweenfoundation_layout.IconCompatParcelizer, placespacebetweenfoundation_layout.serializer.getClass().getName(), 0L, j2, createTransitionInfo$lambda$5(new isAdapterPositionOnScreen(new BrazeImageUtils$$ExternalSyntheticLambda11(placespacebetweenfoundation_layout, j2, j, 1))));
    }
}
