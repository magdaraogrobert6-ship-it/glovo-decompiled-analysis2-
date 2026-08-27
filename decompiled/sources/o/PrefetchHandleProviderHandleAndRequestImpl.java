package o;

/* JADX INFO: loaded from: classes.dex */
public interface PrefetchHandleProviderHandleAndRequestImpl {
    default boolean isInterested(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        return false;
    }

    default boolean read(androidx.compose.ui.input.indirect.IndirectPointerInputChange indirectPointerInputChange) {
        return false;
    }
}
