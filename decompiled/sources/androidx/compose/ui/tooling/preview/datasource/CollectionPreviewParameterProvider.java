package androidx.compose.ui.tooling.preview.datasource;

import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import java.util.Collection;
import o.onContentCardDismissed;
import o.resumeWebviewIfNecessarylambda0;

/* JADX INFO: loaded from: classes4.dex */
public class CollectionPreviewParameterProvider<T> implements PreviewParameterProvider<T> {
    public static final int $stable = 8;
    private final Collection<T> collection;

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public resumeWebviewIfNecessarylambda0 getValues() {
        return onContentCardDismissed.read((Iterable) this.collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionPreviewParameterProvider(Collection<? extends T> collection) {
        this.collection = collection;
    }
}
