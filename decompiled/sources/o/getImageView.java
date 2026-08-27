package o;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class getImageView extends IContentCardsUpdateHandler {
    public final Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ getImageView(int i, Object obj) {
        this.write = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.write;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            safeSetClipToOutline safesetcliptooutline = (safeSetClipToOutline) obj;
            safesetcliptooutline.getClass();
            return new CaptionedImageContentCardViewViewHolder(safesetcliptooutline, 0);
        }
        if (i != 1) {
            return new addInAppMessageViewToViewGrouplambda3((addInAppMessageViewToViewGrouplambda22) obj, 0);
        }
        r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ r8lambdayvdweaikwvq_ojtermd5bm8okkq = (r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ) obj;
        r8lambdayvdweaikwvq_ojtermd5bm8okkq.getClass();
        accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp[] accessgetshouldignoreopenandcloselifecyclecallbackspArr = new accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp[8];
        for (int i2 = 0; i2 < 8; i2++) {
            accessgetshouldignoreopenandcloselifecyclecallbackspArr[i2] = new addInAppMessageViewToViewGrouplambda1(0);
        }
        return new r8lambdar1BMe2b1xc9aBmY396IeUJsog1o(r8lambdayvdweaikwvq_ojtermd5bm8okkq, accessgetshouldignoreopenandcloselifecyclecallbackspArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.write;
        Object obj2 = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            safeSetClipToOutline safesetcliptooutline = (safeSetClipToOutline) obj2;
            safesetcliptooutline.read();
            int i2 = safesetcliptooutline.read(obj);
            if (i2 < 0) {
                return false;
            }
            safesetcliptooutline.IconCompatParcelizer(i2);
            return true;
        }
        if (i != 1) {
            addInAppMessageViewToViewGrouplambda22 addinappmessageviewtoviewgrouplambda22 = (addInAppMessageViewToViewGrouplambda22) obj2;
            if (!addinappmessageviewtoviewgrouplambda22.write.containsKey(obj)) {
                return false;
            }
            addinappmessageviewtoviewgrouplambda22.remove(obj);
            return true;
        }
        r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ r8lambdayvdweaikwvq_ojtermd5bm8okkq = (r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ) obj2;
        if (!r8lambdayvdweaikwvq_ojtermd5bm8okkq.containsKey(obj)) {
            return false;
        }
        r8lambdayvdweaikwvq_ojtermd5bm8okkq.remove(obj);
        return true;
    }

    @Override // o.IContentCardsUpdateHandler
    public final int RemoteActionCompatParcelizer() {
        int i = this.write;
        if (i != 0) {
            return i != 1 ? ((addInAppMessageViewToViewGrouplambda22) this.RemoteActionCompatParcelizer).read() : ((r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ) this.RemoteActionCompatParcelizer).read();
        }
        return ((safeSetClipToOutline) this.RemoteActionCompatParcelizer).PlaybackStateCompatCustomAction;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        if (this.write != 0) {
            return super.addAll(collection);
        }
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.write;
        if (i == 0) {
            ((safeSetClipToOutline) this.RemoteActionCompatParcelizer).clear();
        } else if (i != 1) {
            ((addInAppMessageViewToViewGrouplambda22) this.RemoteActionCompatParcelizer).clear();
        } else {
            ((r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ) this.RemoteActionCompatParcelizer).clear();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.write;
        if (i != 0) {
            return i != 1 ? ((addInAppMessageViewToViewGrouplambda22) this.RemoteActionCompatParcelizer).write.containsKey(obj) : ((r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ) this.RemoteActionCompatParcelizer).containsKey(obj);
        }
        return ((safeSetClipToOutline) this.RemoteActionCompatParcelizer).containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.write != 0 ? super.isEmpty() : ((safeSetClipToOutline) this.RemoteActionCompatParcelizer).isEmpty();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        if (this.write != 0) {
            return super.removeAll(collection);
        }
        collection.getClass();
        ((safeSetClipToOutline) this.RemoteActionCompatParcelizer).read();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        if (this.write != 0) {
            return super.retainAll(collection);
        }
        collection.getClass();
        ((safeSetClipToOutline) this.RemoteActionCompatParcelizer).read();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
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
