package androidx.compose.ui.tooling.data;

import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.unit.IntRect;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UiToolingDataApi
public final class NodeGroup extends Group {
    public static final int $stable = 8;
    private final List<ModifierInfo> modifierInfo;
    private final Object node;

    @Override // androidx.compose.ui.tooling.data.Group
    public List<ModifierInfo> getModifierInfo() {
        return this.modifierInfo;
    }

    public final Object getNode() {
        return this.node;
    }

    public NodeGroup(Object obj, Object obj2, IntRect intRect, Collection<? extends Object> collection, List<ModifierInfo> list, Collection<? extends Group> collection2) {
        super(obj, null, null, null, intRect, collection, collection2, false, null);
        this.node = obj2;
        this.modifierInfo = list;
    }
}
