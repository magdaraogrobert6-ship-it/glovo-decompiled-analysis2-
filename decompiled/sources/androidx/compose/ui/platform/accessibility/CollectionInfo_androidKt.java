package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.ArrayList;
import java.util.List;
import o.FocusRestorerKtsaveFocusedChild11;
import o.FocusRestorerNodeonExit1;
import o.getHasFocus;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final class CollectionInfo_androidKt {
    private static final boolean calculateIfHorizontallyStacked(List<SemanticsNode> list) {
        List list2;
        long jM487unboximpl;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            list2 = instance_delegatelambda0.write;
        } else {
            ArrayList arrayList = new ArrayList();
            SemanticsNode semanticsNode = list.get(0);
            int size = list.size();
            int i = 0;
            while (i < size - 1) {
                i++;
                SemanticsNode semanticsNode2 = list.get(i);
                SemanticsNode semanticsNode3 = semanticsNode2;
                SemanticsNode semanticsNode4 = semanticsNode;
                arrayList.add(Offset.m466boximpl(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (semanticsNode4.getBoundsInRoot().m507getCenterF1C5BW0() >> 32)) - Float.intBitsToFloat((int) (semanticsNode3.getBoundsInRoot().m507getCenterF1C5BW0() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (semanticsNode4.getBoundsInRoot().m507getCenterF1C5BW0() & 4294967295L)) - Float.intBitsToFloat((int) (semanticsNode3.getBoundsInRoot().m507getCenterF1C5BW0() & 4294967295L))))) & 4294967295L))));
                semanticsNode = semanticsNode2;
            }
            list2 = arrayList;
        }
        if (list2.size() == 1) {
            jM487unboximpl = ((Offset) onContentCardDismissed.read(list2)).m487unboximpl();
        } else {
            if (list2.isEmpty()) {
                ListUtilsKt.throwUnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object objM466boximpl = onContentCardDismissed.read(list2);
            int size2 = list2.size() - 1;
            if (1 <= size2) {
                int i2 = 1;
                while (true) {
                    objM466boximpl = Offset.m466boximpl(Offset.m482plusMKHz9U(((Offset) objM466boximpl).m487unboximpl(), ((Offset) list2.get(i2)).m487unboximpl()));
                    if (i2 == size2) {
                        break;
                    }
                    i2++;
                }
            }
            jM487unboximpl = ((Offset) objM466boximpl).m487unboximpl();
        }
        return Float.intBitsToFloat((int) (4294967295L & jM487unboximpl)) < Float.intBitsToFloat((int) (jM487unboximpl >> 32));
    }

    public static final boolean hasCollectionInfo(SemanticsNode semanticsNode) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo()) == null && SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelectableGroup()) == null) ? false : true;
    }

    public static final void setCollectionInfo(SemanticsNode semanticsNode, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo());
        if (collectionInfo != null) {
            focusRestorerKtsaveFocusedChild11.RemoteActionCompatParcelizer(toAccessibilityCollectionInfo(collectionInfo));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelectableGroup()) != null) {
            List<SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
            int size = replacedChildren$ui.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui.get(i);
                if (semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zCalculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
        focusRestorerKtsaveFocusedChild11.RemoteActionCompatParcelizer(getHasFocus.write(zCalculateIfHorizontallyStacked ? 1 : arrayList.size(), zCalculateIfHorizontallyStacked ? arrayList.size() : 1, 0));
    }

    public static final void setCollectionItemInfo(SemanticsNode semanticsNode, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionItemInfo collectionItemInfo = (CollectionItemInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionItemInfo());
        if (collectionItemInfo != null) {
            focusRestorerKtsaveFocusedChild11.IconCompatParcelizer(toAccessibilityCollectionItemInfo(collectionItemInfo, semanticsNode));
        }
        SemanticsNode parent = semanticsNode.getParent();
        if (parent == null || SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getSelectableGroup()) == null) {
            return;
        }
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getCollectionInfo());
        if ((collectionInfo == null || !isLazyCollection(collectionInfo)) && semanticsNode.getConfig().contains(semanticsProperties.getSelected())) {
            ArrayList arrayList = new ArrayList();
            List<SemanticsNode> replacedChildren$ui = parent.getReplacedChildren$ui();
            int size = replacedChildren$ui.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui.get(i2);
                if (semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                    if (semanticsNode2.getLayoutNode$ui().getPlaceOrder$ui() < semanticsNode.getLayoutNode$ui().getPlaceOrder$ui()) {
                        i++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean zCalculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
            focusRestorerKtsaveFocusedChild11.IconCompatParcelizer(FocusRestorerNodeonExit1.serializer(zCalculateIfHorizontallyStacked ? 0 : i, 1, zCalculateIfHorizontallyStacked ? i : 0, 1, ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Boolean invoke() {
                    return Boolean.FALSE;
                }
            })).booleanValue()));
        }
    }

    private static final getHasFocus toAccessibilityCollectionInfo(CollectionInfo collectionInfo) {
        return getHasFocus.write(collectionInfo.getRowCount(), collectionInfo.getColumnCount(), 0);
    }

    private static final FocusRestorerNodeonExit1 toAccessibilityCollectionItemInfo(CollectionItemInfo collectionItemInfo, SemanticsNode semanticsNode) {
        return FocusRestorerNodeonExit1.serializer(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt.toAccessibilityCollectionItemInfo.1
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue());
    }

    private static final boolean isLazyCollection(CollectionInfo collectionInfo) {
        return collectionInfo.getRowCount() < 0 || collectionInfo.getColumnCount() < 0;
    }
}
