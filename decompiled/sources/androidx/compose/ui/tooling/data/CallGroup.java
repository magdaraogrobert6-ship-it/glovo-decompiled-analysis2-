package androidx.compose.ui.tooling.data;

import androidx.compose.ui.unit.IntRect;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UiToolingDataApi
public final class CallGroup extends Group {
    public static final int $stable = 8;
    private final List<ParameterInformation> parameters;

    @Override // androidx.compose.ui.tooling.data.Group
    public List<ParameterInformation> getParameters() {
        return this.parameters;
    }

    public CallGroup(Object obj, String str, IntRect intRect, SourceLocation sourceLocation, Object obj2, List<ParameterInformation> list, Collection<? extends Object> collection, Collection<? extends Group> collection2, boolean z) {
        super(obj, str, sourceLocation, obj2, intRect, collection, collection2, z, null);
        this.parameters = list;
    }
}
