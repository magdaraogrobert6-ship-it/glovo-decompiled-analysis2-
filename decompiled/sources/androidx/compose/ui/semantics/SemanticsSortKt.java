package androidx.compose.ui.semantics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.sqlite.SQLite;
import com.incognia.internal.Q9$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import o.BrazeContentCardsManagerCompanion;
import o.StretchOverscrollNode;
import o.VerticalScrollableClipShape;
import o.animateToWithDecay;
import o.getQueryParameterslambda2;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setNativeShader;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsSortKt {
    private static final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 UnmergedConfigComparator;
    private static final Comparator<SemanticsNode>[] semanticComparators;

    static {
        Comparator<SemanticsNode>[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            final Comparator comparator = i == 0 ? RtlBoundsComparator.INSTANCE : LtrBoundsComparator.INSTANCE;
            final Comparator<LayoutNode> zComparator$ui = LayoutNode.Companion.getZComparator$ui();
            final Comparator comparator2 = new Comparator() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int iCompare = comparator.compare(t, t2);
                    return iCompare != 0 ? iCompare : zComparator$ui.compare(((SemanticsNode) t).getLayoutNode$ui(), ((SemanticsNode) t2).getLayoutNode$ui());
                }
            };
            comparatorArr[i] = new Comparator() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int iCompare = comparator2.compare(t, t2);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                    return setNativeShader.RemoteActionCompatParcelizer(Integer.valueOf(((SemanticsNode) t).getId()), Integer.valueOf(((SemanticsNode) t2).getId()));
                }
            };
            i++;
        }
        semanticComparators = comparatorArr;
        UnmergedConfigComparator = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Integer invoke(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
                SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
                SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                return Integer.valueOf(Float.compare(((Number) unmergedConfig$ui.getOrElse(semanticsProperties.getTraversalIndex(), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1.1
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                })).floatValue(), ((Number) semanticsNode2.getUnmergedConfig$ui().getOrElse(semanticsProperties.getTraversalIndex(), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1.2
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                })).floatValue()));
            }
        };
    }

    private static final void geometryDepthFirstSearch(SemanticsNode semanticsNode, ArrayList<SemanticsNode> arrayList, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, animateToWithDecay animatetowithdecay) {
        boolean zBooleanValue = ((Boolean) semanticsNode.getUnmergedConfig$ui().getOrElse(SemanticsProperties.INSTANCE.getIsTraversalGroup(), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$geometryDepthFirstSearch$isTraversalGroup$1
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue();
        if ((zBooleanValue || ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(semanticsNode)).booleanValue()) && ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(semanticsNode)).booleanValue()) {
            arrayList.add(semanticsNode);
        }
        if (zBooleanValue) {
            animatetowithdecay.IconCompatParcelizer(semanticsNode.getId(), subtreeSortedByGeometryGrouping(semanticsNode, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, semanticsNode.getChildren()));
            return;
        }
        List<SemanticsNode> children = semanticsNode.getChildren();
        int size = children.size();
        for (int i = 0; i < size; i++) {
            geometryDepthFirstSearch(children.get(i), arrayList, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, animatetowithdecay);
        }
    }

    private static final boolean placedEntryRowOverlaps(ArrayList<onViewAttachedToWindowlambda0> arrayList, SemanticsNode semanticsNode) {
        float top = semanticsNode.getBoundsInWindow().getTop();
        float bottom = semanticsNode.getBoundsInWindow().getBottom();
        boolean z = top >= bottom;
        int iWrite = SQLite.write((List) arrayList);
        if (iWrite >= 0) {
            int i = 0;
            while (true) {
                Rect rect = (Rect) arrayList.get(i).serializer;
                boolean z2 = rect.getTop() >= rect.getBottom();
                if (!z && !z2 && Math.max(top, rect.getTop()) < Math.min(bottom, rect.getBottom())) {
                    arrayList.set(i, new onViewAttachedToWindowlambda0(rect.intersect(0.0f, top, Float.POSITIVE_INFINITY, bottom), arrayList.get(i).write));
                    ((List) arrayList.get(i).write).add(semanticsNode);
                    return true;
                }
                if (i != iWrite) {
                    i++;
                }
            }
        }
        return false;
    }

    public static final List<SemanticsNode> sortByGeometryGroupings(SemanticsNode semanticsNode, List<SemanticsNode> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, StretchOverscrollNode stretchOverscrollNode) {
        int i = 1;
        int size = 0;
        char c = semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl ? (char) 1 : (char) 0;
        ArrayList arrayList = new ArrayList(list.size() / 2);
        int size2 = list.size() - 1;
        if (size2 >= 0) {
            int i2 = 0;
            while (true) {
                SemanticsNode semanticsNode2 = list.get(i2);
                if (i2 == 0 || !placedEntryRowOverlaps(arrayList, semanticsNode2)) {
                    arrayList.add(new onViewAttachedToWindowlambda0(semanticsNode2.getBoundsInWindow(), (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, new Object[]{new SemanticsNode[]{semanticsNode2}}, getQueryParameterslambda2.serializer(), 866125100, getQueryParameterslambda2.serializer())));
                }
                if (i2 == size2) {
                    break;
                }
                i2++;
            }
        }
        BrazeContentCardsManagerCompanion.write(arrayList, TopBottomBoundsComparator.INSTANCE);
        ArrayList arrayList2 = new ArrayList();
        Comparator<SemanticsNode> comparator = semanticComparators[c ^ 1];
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) arrayList.get(i3);
            BrazeContentCardsManagerCompanion.write((List) onviewattachedtowindowlambda0.write, comparator);
            arrayList2.addAll((Collection) onviewattachedtowindowlambda0.write);
        }
        BrazeContentCardsManagerCompanion.write(arrayList2, new Q9$$ExternalSyntheticLambda0(i, UnmergedConfigComparator));
        while (size <= arrayList2.size() - 1) {
            List list2 = (List) stretchOverscrollNode.serializer(((SemanticsNode) arrayList2.get(size)).getId());
            if (list2 != null) {
                if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(arrayList2.get(size))).booleanValue()) {
                    size++;
                } else {
                    arrayList2.remove(size);
                }
                arrayList2.addAll(size, list2);
                size += list2.size();
            } else {
                size++;
            }
        }
        return arrayList2;
    }

    public static List sortByGeometryGroupings$default(SemanticsNode semanticsNode, List list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, StretchOverscrollNode stretchOverscrollNode, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.semantics.SemanticsSortKt.sortByGeometryGroupings.1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Boolean invoke(SemanticsNode semanticsNode2) {
                    return Boolean.FALSE;
                }
            };
        }
        if ((i & 4) != 0) {
            stretchOverscrollNode = VerticalScrollableClipShape.IconCompatParcelizer;
            stretchOverscrollNode.getClass();
        }
        return sortByGeometryGroupings(semanticsNode, list, r8lambdaunavo3sxub_pc9xroryotnrlvsm, stretchOverscrollNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortByGeometryGroupings$lambda$1(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Object obj, Object obj2) {
        return ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj, obj2)).intValue();
    }

    public static final List<SemanticsNode> subtreeSortedByGeometryGrouping(SemanticsNode semanticsNode, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, List<SemanticsNode> list) {
        animateToWithDecay animatetowithdecay = VerticalScrollableClipShape.IconCompatParcelizer;
        animateToWithDecay animatetowithdecay2 = new animateToWithDecay();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            geometryDepthFirstSearch(list.get(i), arrayList, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, animatetowithdecay2);
        }
        return sortByGeometryGroupings(semanticsNode, arrayList, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, animatetowithdecay2);
    }
}
