package io.reactivex.disposables;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.OpenHashSet;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class CompositeDisposable implements Disposable, DisposableContainer {
    public OpenHashSet RemoteActionCompatParcelizer;
    public volatile boolean serializer;

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.serializer;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public final boolean IconCompatParcelizer(Disposable disposable) {
        Object obj;
        ObjectHelper.write(disposable, "disposables is null");
        if (this.serializer) {
            return false;
        }
        synchronized (this) {
            if (this.serializer) {
                return false;
            }
            OpenHashSet openHashSet = this.RemoteActionCompatParcelizer;
            if (openHashSet != null) {
                Object[] objArr = openHashSet.serializer;
                int i = openHashSet.RemoteActionCompatParcelizer;
                int iHashCode = disposable.hashCode() * (-1640531527);
                int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
                Object obj2 = objArr[i2];
                if (obj2 != null) {
                    if (obj2.equals(disposable)) {
                        openHashSet.serializer(i2, i, objArr);
                    } else {
                        do {
                            i2 = (i2 + 1) & i;
                            obj = objArr[i2];
                            if (obj == null) {
                            }
                        } while (!obj.equals(disposable));
                        openHashSet.serializer(i2, i, objArr);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public final boolean read(Disposable disposable) {
        ObjectHelper.write(disposable, "disposable is null");
        if (!this.serializer) {
            synchronized (this) {
                if (!this.serializer) {
                    OpenHashSet openHashSet = this.RemoteActionCompatParcelizer;
                    if (openHashSet == null) {
                        openHashSet = new OpenHashSet();
                        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                        openHashSet.RemoteActionCompatParcelizer = iNumberOfLeadingZeros - 1;
                        openHashSet.read = (int) (iNumberOfLeadingZeros * 0.75f);
                        openHashSet.serializer = new Object[iNumberOfLeadingZeros];
                        this.RemoteActionCompatParcelizer = openHashSet;
                    }
                    openHashSet.read(disposable);
                    return true;
                }
            }
        }
        disposable.dispose();
        return false;
    }

    public static void RemoteActionCompatParcelizer(OpenHashSet openHashSet) {
        if (openHashSet == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : openHashSet.serializer) {
            if (obj instanceof Disposable) {
                try {
                    ((Disposable) obj).dispose();
                } catch (Throwable th) {
                    Exceptions.read(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw ExceptionHelper.write((Throwable) arrayList.get(0));
            }
            throw new CompositeException(arrayList);
        }
    }

    public final void read() {
        if (this.serializer) {
            return;
        }
        synchronized (this) {
            if (this.serializer) {
                return;
            }
            OpenHashSet openHashSet = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = null;
            RemoteActionCompatParcelizer(openHashSet);
        }
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public final boolean serializer(Disposable disposable) {
        if (!IconCompatParcelizer(disposable)) {
            return false;
        }
        disposable.dispose();
        return true;
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
            OpenHashSet openHashSet = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = null;
            RemoteActionCompatParcelizer(openHashSet);
        }
    }
}
