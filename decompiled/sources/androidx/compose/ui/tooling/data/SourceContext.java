package androidx.compose.ui.tooling.data;

import androidx.compose.ui.unit.IntRect;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UiToolingDataApi
public interface SourceContext {
    IntRect getBounds();

    int getDepth();

    SourceLocation getLocation();

    String getName();

    List<ParameterInformation> getParameters();

    default boolean isInline() {
        return false;
    }
}
