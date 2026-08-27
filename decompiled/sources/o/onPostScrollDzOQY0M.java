package o;

/* JADX INFO: loaded from: classes.dex */
public final class onPostScrollDzOQY0M extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.TraversableNode {
    public static final executeRequest serializer = new executeRequest();
    public final PrefetchHandleProviderHandleAndRequestImpl RemoteActionCompatParcelizer;

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object getTraverseKey() {
        return serializer;
    }

    public onPostScrollDzOQY0M(PrefetchHandleProviderHandleAndRequestImpl prefetchHandleProviderHandleAndRequestImpl) {
        this.RemoteActionCompatParcelizer = prefetchHandleProviderHandleAndRequestImpl;
    }
}
