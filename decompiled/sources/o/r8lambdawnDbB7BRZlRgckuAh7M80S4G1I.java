package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdawnDbB7BRZlRgckuAh7M80S4G1I extends newArray {
    public final DefaultContentCardsViewBindingHandlerWhenMappings serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ r8lambdawnDbB7BRZlRgckuAh7M80S4G1I(DefaultContentCardsViewBindingHandlerWhenMappings defaultContentCardsViewBindingHandlerWhenMappings, int i) {
        this.write = i;
        this.serializer = defaultContentCardsViewBindingHandlerWhenMappings;
    }

    @Override // o.newArray
    public final int RemoteActionCompatParcelizer() {
        int i = this.write;
        if (i != 0) {
            return i != 1 ? ((addInAppMessageViewToViewGrouplambda22) this.serializer).read() : ((onEntered) this.serializer).read();
        }
        return ((r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ) this.serializer).read();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.write;
        if (i == 0) {
            ((r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ) this.serializer).clear();
        } else if (i != 1) {
            ((addInAppMessageViewToViewGrouplambda22) this.serializer).clear();
        } else {
            ((onEntered) this.serializer).clear();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.write;
        if (i != 0) {
            return i != 1 ? ((addInAppMessageViewToViewGrouplambda22) this.serializer).containsValue(obj) : ((onEntered) this.serializer).containsValue(obj);
        }
        return ((r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ) this.serializer).containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.write;
        DefaultContentCardsViewBindingHandlerWhenMappings defaultContentCardsViewBindingHandlerWhenMappings = this.serializer;
        int i2 = 0;
        if (i == 0) {
            r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ r8lambdayvdweaikwvq_ojtermd5bm8okkq = (r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ) defaultContentCardsViewBindingHandlerWhenMappings;
            r8lambdayvdweaikwvq_ojtermd5bm8okkq.getClass();
            accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp[] accessgetshouldignoreopenandcloselifecyclecallbackspArr = new accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp[8];
            while (i2 < 8) {
                accessgetshouldignoreopenandcloselifecyclecallbackspArr[i2] = new addInAppMessageViewToViewGrouplambda1(2);
                i2++;
            }
            return new r8lambdar1BMe2b1xc9aBmY396IeUJsog1o(r8lambdayvdweaikwvq_ojtermd5bm8okkq, accessgetshouldignoreopenandcloselifecyclecallbackspArr);
        }
        if (i != 1) {
            return new addInAppMessageViewToViewGrouplambda3((addInAppMessageViewToViewGrouplambda22) defaultContentCardsViewBindingHandlerWhenMappings, 2);
        }
        onEntered onentered = (onEntered) defaultContentCardsViewBindingHandlerWhenMappings;
        startDragAndDropTransferd4ec7I[] startdraganddroptransferd4ec7iArr = new startDragAndDropTransferd4ec7I[8];
        while (i2 < 8) {
            startdraganddroptransferd4ec7iArr[i2] = new DragAndDropNodeCompanion(2);
            i2++;
        }
        return new onEnded(onentered, startdraganddroptransferd4ec7iArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.write;
        if (i == 0) {
            throw new UnsupportedOperationException();
        }
        if (i != 1) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }
}
