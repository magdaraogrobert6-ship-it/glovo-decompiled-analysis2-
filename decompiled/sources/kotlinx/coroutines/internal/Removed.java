package kotlinx.coroutines.internal;

/* JADX INFO: loaded from: classes4.dex */
final class Removed {
    public final LockFreeLinkedListNode read;

    public Removed(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.read = lockFreeLinkedListNode;
    }

    public final String toString() {
        return "Removed[" + this.read + ']';
    }
}
