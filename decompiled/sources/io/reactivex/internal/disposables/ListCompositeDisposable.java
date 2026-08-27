package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public final class ListCompositeDisposable implements Disposable, DisposableContainer {
    public LinkedList IconCompatParcelizer;
    public volatile boolean serializer;

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.serializer;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public final boolean read(Disposable disposable) {
        if (!this.serializer) {
            synchronized (this) {
                if (!this.serializer) {
                    LinkedList linkedList = this.IconCompatParcelizer;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.IconCompatParcelizer = linkedList;
                    }
                    linkedList.add(disposable);
                    return true;
                }
            }
        }
        disposable.dispose();
        return false;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.serializer) {
            return;
        }
        synchronized (this) {
            if (this.serializer) {
                return;
            }
            this.serializer = true;
            LinkedList linkedList = this.IconCompatParcelizer;
            ArrayList arrayList = null;
            this.IconCompatParcelizer = null;
            if (linkedList == null) {
                return;
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                try {
                    ((Disposable) it.next()).dispose();
                } catch (Throwable th) {
                    Exceptions.read(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList != null) {
                if (arrayList.size() != 1) {
                    throw new CompositeException(arrayList);
                }
                throw ExceptionHelper.write((Throwable) arrayList.get(0));
            }
        }
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public final boolean IconCompatParcelizer(Disposable disposable) {
        if (this.serializer) {
            return false;
        }
        synchronized (this) {
            if (this.serializer) {
                return false;
            }
            LinkedList linkedList = this.IconCompatParcelizer;
            if (linkedList != null && linkedList.remove(disposable)) {
                return true;
            }
            return false;
        }
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public final boolean serializer(Disposable disposable) {
        if (!IconCompatParcelizer(disposable)) {
            return false;
        }
        ((ScheduledRunnable) disposable).dispose();
        return true;
    }
}
