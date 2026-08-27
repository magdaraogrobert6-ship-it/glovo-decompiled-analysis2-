package o;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentCardsDividerItemDecoration implements Iterator, displayInAppMessagelambda121 {
    public final Object read;
    public final /* synthetic */ int serializer = 0;

    public ContentCardsDividerItemDecoration(r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ r8lambdayvdweaikwvq_ojtermd5bm8okkq) {
        r8lambdayvdweaikwvq_ojtermd5bm8okkq.getClass();
        accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp[] accessgetshouldignoreopenandcloselifecyclecallbackspArr = new accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp[8];
        for (int i = 0; i < 8; i++) {
            accessgetshouldignoreopenandcloselifecyclecallbackspArr[i] = new addInAppMessageViewToViewGrouplambda23(this);
        }
        this.read = new r8lambdaotS9jB7634FKsznRjR0YfctBM(r8lambdayvdweaikwvq_ojtermd5bm8okkq, accessgetshouldignoreopenandcloselifecyclecallbackspArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.serializer;
        if (i != 0) {
            return i != 1 ? ((r8lambdaotS9jB7634FKsznRjR0YfctBM) this.read).write : ((onExited) this.read).serializer;
        }
        return ((Enumeration) this.read).hasMoreElements();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.serializer;
        if (i != 0) {
            return i != 1 ? (Map.Entry) ((r8lambdaotS9jB7634FKsznRjR0YfctBM) this.read).next() : (Map.Entry) ((onExited) this.read).next();
        }
        return ((Enumeration) this.read).nextElement();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.serializer;
        if (i == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        if (i != 1) {
            ((r8lambdaotS9jB7634FKsznRjR0YfctBM) this.read).remove();
        } else {
            ((onExited) this.read).remove();
        }
    }

    public ContentCardsDividerItemDecoration(onEntered onentered) {
        startDragAndDropTransferd4ec7I[] startdraganddroptransferd4ec7iArr = new startDragAndDropTransferd4ec7I[8];
        for (int i = 0; i < 8; i++) {
            startdraganddroptransferd4ec7iArr[i] = new DragAndDropNodeCompanionDragAndDropTraversableKey(this);
        }
        this.read = new onExited(onentered, startdraganddroptransferd4ec7iArr);
    }

    public ContentCardsDividerItemDecoration(Enumeration enumeration) {
        this.read = enumeration;
    }
}
