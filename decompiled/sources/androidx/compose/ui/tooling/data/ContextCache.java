package androidx.compose.ui.tooling.data;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@UiToolingDataApi
public final class ContextCache {
    public static final int $stable = 8;
    private final Map<String, Object> contexts = new LinkedHashMap();

    public final Map<String, Object> getContexts$ui_tooling_data() {
        return this.contexts;
    }

    public final void clear() {
        this.contexts.clear();
    }
}
