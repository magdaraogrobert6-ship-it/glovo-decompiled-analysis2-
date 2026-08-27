package androidx.compose.animation;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import o.MouseWheelScrollingLogic;
import o.createFromParcel;
import o.onShowTranslationui;
import o.positionChangeInternalwfG_k4k;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedContentMeasurePolicy implements MeasurePolicy {
    public final positionChangeInternalwfG_k4k RemoteActionCompatParcelizer;

    public AnimatedContentMeasurePolicy(positionChangeInternalwfG_k4k positionchangeinternalwfg_k4k) {
        this.RemoteActionCompatParcelizer = positionchangeinternalwfg_k4k;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List list, long j) {
        int i;
        Placeable placeable;
        final int width;
        int i2;
        Placeable placeable2;
        final int height;
        int size = list.size();
        final Placeable[] placeableArr = new Placeable[size];
        long jM3849getZeroYbymL2g = IntSize.Companion.m3849getZeroYbymL2g();
        List list2 = list;
        int size2 = list2.size();
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 >= size2) {
                break;
            }
            Measurable measurable = (Measurable) list.get(i3);
            Object parentData = measurable.getParentData();
            MouseWheelScrollingLogic mouseWheelScrollingLogic = parentData instanceof MouseWheelScrollingLogic ? (MouseWheelScrollingLogic) parentData : null;
            if (mouseWheelScrollingLogic != null && ((Boolean) ((onShowTranslationui) mouseWheelScrollingLogic.serializer).getValue()).booleanValue()) {
                Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(j);
                long jM3839constructorimpl = IntSize.m3839constructorimpl((((long) placeableMo2209measureBRTryo0.getHeight()) & 4294967295L) | (((long) placeableMo2209measureBRTryo0.getWidth()) << 32));
                placeableArr[i3] = placeableMo2209measureBRTryo0;
                jM3849getZeroYbymL2g = jM3839constructorimpl;
            }
            i3++;
            size2 = size2;
        }
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            Measurable measurable2 = (Measurable) list.get(i4);
            if (placeableArr[i4] == null) {
                placeableArr[i4] = measurable2.mo2209measureBRTryo0(j);
            }
        }
        if (measureScope.isLookingAhead()) {
            width = (int) (jM3849getZeroYbymL2g >> 32);
        } else {
            if (size != 0) {
                placeable = placeableArr[0];
                int i5 = size - 1;
                if (i5 != 0) {
                    int width2 = placeable != null ? placeable.getWidth() : 0;
                    if (1 <= i5) {
                        int i6 = 1;
                        while (true) {
                            Placeable placeable3 = placeableArr[i6];
                            int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                            if (width2 < width3) {
                                placeable = placeable3;
                                width2 = width3;
                            }
                            if (i6 == i5) {
                                break;
                            }
                            i6++;
                        }
                    }
                }
            } else {
                placeable = null;
            }
            width = placeable != null ? placeable.getWidth() : 0;
        }
        if (measureScope.isLookingAhead()) {
            height = (int) (jM3849getZeroYbymL2g & 4294967295L);
        } else {
            if (size == 0) {
                i2 = 0;
                placeable2 = null;
            } else {
                i2 = 0;
                Placeable placeable4 = placeableArr[0];
                int i7 = size - 1;
                if (i7 != 0) {
                    int height2 = placeable4 != null ? placeable4.getHeight() : 0;
                    if (1 <= i7) {
                        while (true) {
                            Placeable placeable5 = placeableArr[i];
                            int height3 = placeable5 != null ? placeable5.getHeight() : 0;
                            if (height2 < height3) {
                                placeable4 = placeable5;
                                height2 = height3;
                            }
                            if (i == i7) {
                                break;
                            }
                            i++;
                        }
                    }
                }
                placeable2 = placeable4;
            }
            height = placeable2 != null ? placeable2.getHeight() : i2;
        }
        if (!measureScope.isLookingAhead()) {
            ((onShowTranslationui) this.RemoteActionCompatParcelizer.write).setValue(IntSize.m3836boximpl(IntSize.m3839constructorimpl((((long) width) << 32) | (((long) height) & 4294967295L))));
        }
        return MeasureScope.layout$default(measureScope, width, height, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                Placeable[] placeableArr2 = placeableArr;
                int i8 = 0;
                for (int length = placeableArr2.length; i8 < length; length = length) {
                    Placeable placeable6 = placeableArr2[i8];
                    if (placeable6 != null) {
                        long jMo139alignKFBX0sM = this.RemoteActionCompatParcelizer.read.mo139alignKFBX0sM(IntSize.m3839constructorimpl((((long) placeable6.getWidth()) << 32) | (((long) placeable6.getHeight()) & 4294967295L)), IntSize.m3839constructorimpl((((long) width) << 32) | (((long) height) & 4294967295L)), LayoutDirection.Ltr);
                        Placeable.PlacementScope.place$default(placementScope, placeable6, IntOffset.m3801getXimpl(jMo139alignKFBX0sM), IntOffset.m3802getYimpl(jMo139alignKFBX0sM), 0.0f, 4, null);
                    }
                    i8++;
                    placeableArr2 = placeableArr2;
                }
                return createFromParcel.INSTANCE;
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).maxIntrinsicHeight(i));
            int size = list.size() - 1;
            int i2 = 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((IntrinsicMeasurable) list.get(i2)).maxIntrinsicHeight(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).maxIntrinsicWidth(i));
            int size = list.size() - 1;
            int i2 = 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((IntrinsicMeasurable) list.get(i2)).maxIntrinsicWidth(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).minIntrinsicHeight(i));
            int size = list.size() - 1;
            int i2 = 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((IntrinsicMeasurable) list.get(i2)).minIntrinsicHeight(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).minIntrinsicWidth(i));
            int size = list.size() - 1;
            int i2 = 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((IntrinsicMeasurable) list.get(i2)).minIntrinsicWidth(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
