package kotlinx.coroutines.internal;

/* JADX INFO: loaded from: classes4.dex */
final class ListClosed extends LockFreeLinkedListNode {
    public final int read;

    public ListClosed(int i) {
        this.read = i;
    }
}
