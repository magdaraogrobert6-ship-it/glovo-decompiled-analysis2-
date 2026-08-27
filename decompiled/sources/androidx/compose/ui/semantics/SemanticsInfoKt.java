package androidx.compose.ui.semantics;

import java.util.List;
import o.ContentInViewNode;

/* JADX INFO: loaded from: classes4.dex */
public final class SemanticsInfoKt {
    public static final SemanticsInfo findMergingSemanticsParent(SemanticsInfo semanticsInfo) {
        for (SemanticsInfo parentInfo = semanticsInfo.getParentInfo(); parentInfo != null; parentInfo = parentInfo.getParentInfo()) {
            SemanticsConfiguration semanticsConfiguration = parentInfo.getSemanticsConfiguration();
            if (semanticsConfiguration != null && semanticsConfiguration.isMergingSemanticsOfDescendants()) {
                return parentInfo;
            }
        }
        return null;
    }

    public static final SemanticsConfiguration mergedSemanticsConfiguration(SemanticsInfo semanticsInfo) {
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        if (semanticsConfiguration != null && semanticsConfiguration.isMergingSemanticsOfDescendants() && !semanticsConfiguration.isClearingSemantics()) {
            semanticsConfiguration = semanticsConfiguration.copy();
            ContentInViewNode contentInViewNode = new ContentInViewNode(semanticsInfo.getChildrenInfo().size());
            contentInViewNode.read((List) semanticsInfo.getChildrenInfo());
            while (contentInViewNode.RemoteActionCompatParcelizer()) {
                SemanticsInfo semanticsInfo2 = (SemanticsInfo) contentInViewNode.write(contentInViewNode.IconCompatParcelizer - 1);
                SemanticsConfiguration semanticsConfiguration2 = semanticsInfo2.getSemanticsConfiguration();
                if (semanticsConfiguration2 != null && !semanticsConfiguration2.isMergingSemanticsOfDescendants()) {
                    semanticsConfiguration.mergeChild$ui(semanticsConfiguration2);
                    if (!semanticsConfiguration2.isClearingSemantics()) {
                        contentInViewNode.read((List) semanticsInfo2.getChildrenInfo());
                    }
                }
            }
        }
        return semanticsConfiguration;
    }

    public static final SemanticsInfo nearestParentThatHasSemantics(SemanticsInfo semanticsInfo) {
        for (SemanticsInfo parentInfo = semanticsInfo.getParentInfo(); parentInfo != null; parentInfo = parentInfo.getParentInfo()) {
            if (parentInfo.getSemanticsConfiguration() != null) {
                return parentInfo;
            }
        }
        return null;
    }
}
