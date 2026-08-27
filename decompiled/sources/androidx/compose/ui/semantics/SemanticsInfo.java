package androidx.compose.ui.semantics;

import androidx.compose.ui.layout.LayoutInfo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface SemanticsInfo extends LayoutInfo {
    List<SemanticsInfo> getChildrenInfo();

    @Override // androidx.compose.ui.layout.LayoutInfo
    SemanticsInfo getParentInfo();

    SemanticsConfiguration getSemanticsConfiguration();

    boolean isTransparent();
}
