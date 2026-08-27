package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ListIterator;
import kotlin.collections.AbstractList;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultContentCardsViewBindingHandlerCompanion extends r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44 implements ListIterator {
    public final /* synthetic */ AbstractList RemoteActionCompatParcelizer;

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.serializer > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.serializer;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.serializer - 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultContentCardsViewBindingHandlerCompanion(AbstractList abstractList, int i) {
        super(abstractList);
        this.RemoteActionCompatParcelizer = abstractList;
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
        int size = abstractList.size();
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.RemoteActionCompatParcelizer(i, size);
        this.serializer = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.serializer - 1;
        this.serializer = i;
        return this.RemoteActionCompatParcelizer.get(i);
    }
}
