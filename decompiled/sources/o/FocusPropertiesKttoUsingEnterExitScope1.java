package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FocusPropertiesKttoUsingEnterExitScope1 implements Iterator, displayInAppMessagelambda121 {
    public Iterator RemoteActionCompatParcelizer;
    public final ArrayList write = new ArrayList();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.RemoteActionCompatParcelizer.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.RemoteActionCompatParcelizer.next();
        View view = (View) next;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        EmptyContentCardsAdapterNetworkUnavailableViewHolder emptyContentCardsAdapterNetworkUnavailableViewHolder = viewGroup != null ? new EmptyContentCardsAdapterNetworkUnavailableViewHolder(2, viewGroup) : null;
        ArrayList arrayList = this.write;
        if (emptyContentCardsAdapterNetworkUnavailableViewHolder != null && emptyContentCardsAdapterNetworkUnavailableViewHolder.hasNext()) {
            arrayList.add(this.RemoteActionCompatParcelizer);
            this.RemoteActionCompatParcelizer = emptyContentCardsAdapterNetworkUnavailableViewHolder;
            return next;
        }
        while (!this.RemoteActionCompatParcelizer.hasNext() && !arrayList.isEmpty()) {
            this.RemoteActionCompatParcelizer = (Iterator) onContentCardDismissed.MediaDescriptionCompat((List) arrayList);
            onContentCardDismissed.MediaSessionCompatQueueItem((List) arrayList);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public FocusPropertiesKttoUsingEnterExitScope1(EmptyContentCardsAdapterNetworkUnavailableViewHolder emptyContentCardsAdapterNetworkUnavailableViewHolder) {
        this.RemoteActionCompatParcelizer = emptyContentCardsAdapterNetworkUnavailableViewHolder;
    }
}
