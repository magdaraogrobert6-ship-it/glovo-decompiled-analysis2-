package io.reactivex.subjects;

import bo.app.af$$ExternalSyntheticOutline1;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.MediaSessionCompatQueueItem;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public final class BehaviorSubject<T> extends Subject<T> {
    public long IconCompatParcelizer;
    public final AtomicReference MediaDescriptionCompat;
    public final Lock MediaMetadataCompat;
    public final AtomicReference MediaSessionCompatQueueItem;
    public final AtomicReference RatingCompat;
    public final Lock write;
    public static final Object[] read = new Object[0];
    public static final BehaviorDisposable[] serializer = new BehaviorDisposable[0];
    public static final BehaviorDisposable[] RemoteActionCompatParcelizer = new BehaviorDisposable[0];

    public static final class BehaviorDisposable<T> implements Disposable, AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {
        public static int MediaMetadataCompat;
        public static int RatingCompat;
        public long IconCompatParcelizer;
        public final BehaviorSubject MediaBrowserCompatMediaItem;
        public AppendOnlyLinkedArrayList MediaDescriptionCompat;
        public boolean MediaSessionCompatQueueItem;
        public volatile boolean RemoteActionCompatParcelizer;
        public final Observer read;
        public boolean serializer;
        public boolean write;

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.RemoteActionCompatParcelizer;
        }

        public BehaviorDisposable(Observer observer, BehaviorSubject behaviorSubject) {
            this.read = observer;
            this.MediaBrowserCompatMediaItem = behaviorSubject;
        }

        @Override // io.reactivex.functions.Predicate
        public final boolean read(Object obj) {
            return this.RemoteActionCompatParcelizer || NotificationLite.accept(obj, this.read);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            this.MediaBrowserCompatMediaItem.write(this);
        }

        public final void read(long j, Object obj) {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            if (!this.write) {
                synchronized (this) {
                    if (this.RemoteActionCompatParcelizer) {
                        return;
                    }
                    if (this.IconCompatParcelizer == j) {
                        return;
                    }
                    if (this.serializer) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.MediaDescriptionCompat;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                            this.MediaDescriptionCompat = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.write(obj);
                        return;
                    }
                    this.MediaSessionCompatQueueItem = true;
                    this.write = true;
                }
            }
            read(obj);
        }

        public static int write() {
            int i = RatingCompat;
            int i2 = i % 5608661;
            RatingCompat = i + 1;
            if (i2 != 0) {
                return MediaMetadataCompat;
            }
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            MediaMetadataCompat = iFreeMemory;
            return iFreeMemory;
        }
    }

    public static BehaviorSubject IconCompatParcelizer(Object obj) {
        BehaviorSubject behaviorSubject = new BehaviorSubject();
        behaviorSubject.MediaSessionCompatQueueItem.lazySet(obj);
        return behaviorSubject;
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (getBitmapFromCache.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, ExceptionHelper.serializer)) {
            Object objComplete = NotificationLite.complete();
            AtomicReference atomicReference = this.RatingCompat;
            BehaviorDisposable[] behaviorDisposableArr = RemoteActionCompatParcelizer;
            BehaviorDisposable[] behaviorDisposableArr2 = (BehaviorDisposable[]) atomicReference.getAndSet(behaviorDisposableArr);
            if (behaviorDisposableArr2 != behaviorDisposableArr) {
                Lock lock = this.MediaMetadataCompat;
                lock.lock();
                this.IconCompatParcelizer++;
                this.MediaSessionCompatQueueItem.lazySet(objComplete);
                lock.unlock();
            }
            for (BehaviorDisposable behaviorDisposable : behaviorDisposableArr2) {
                behaviorDisposable.read(this.IconCompatParcelizer, objComplete);
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        if (this.MediaDescriptionCompat.get() != null) {
            disposable.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observable
    public final void read(Observer observer) {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        BehaviorDisposable behaviorDisposable = new BehaviorDisposable(observer, this);
        observer.onSubscribe(behaviorDisposable);
        AtomicReference atomicReference = this.RatingCompat;
        while (true) {
            BehaviorDisposable[] behaviorDisposableArr = (BehaviorDisposable[]) atomicReference.get();
            if (behaviorDisposableArr == RemoteActionCompatParcelizer) {
                Throwable th = (Throwable) this.MediaDescriptionCompat.get();
                if (th == ExceptionHelper.serializer) {
                    observer.onComplete();
                    return;
                } else {
                    observer.onError(th);
                    return;
                }
            }
            int length = behaviorDisposableArr.length;
            BehaviorDisposable[] behaviorDisposableArr2 = new BehaviorDisposable[length + 1];
            System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr2, 0, length);
            behaviorDisposableArr2[length] = behaviorDisposable;
            do {
                if (atomicReference.compareAndSet(behaviorDisposableArr, behaviorDisposableArr2)) {
                    if (behaviorDisposable.RemoteActionCompatParcelizer) {
                        write(behaviorDisposable);
                        return;
                    }
                    if (behaviorDisposable.RemoteActionCompatParcelizer) {
                        return;
                    }
                    synchronized (behaviorDisposable) {
                        if (behaviorDisposable.RemoteActionCompatParcelizer) {
                            return;
                        }
                        if (behaviorDisposable.MediaSessionCompatQueueItem) {
                            return;
                        }
                        BehaviorSubject behaviorSubject = behaviorDisposable.MediaBrowserCompatMediaItem;
                        Lock lock = behaviorSubject.write;
                        lock.lock();
                        behaviorDisposable.IconCompatParcelizer = behaviorSubject.IconCompatParcelizer;
                        Object obj = behaviorSubject.MediaSessionCompatQueueItem.get();
                        lock.unlock();
                        behaviorDisposable.serializer = obj != null;
                        behaviorDisposable.MediaSessionCompatQueueItem = true;
                        if (obj == null || behaviorDisposable.read(obj)) {
                            return;
                        }
                        while (!behaviorDisposable.RemoteActionCompatParcelizer) {
                            synchronized (behaviorDisposable) {
                                appendOnlyLinkedArrayList = behaviorDisposable.MediaDescriptionCompat;
                                if (appendOnlyLinkedArrayList == null) {
                                    behaviorDisposable.serializer = false;
                                    return;
                                }
                                behaviorDisposable.MediaDescriptionCompat = null;
                            }
                            appendOnlyLinkedArrayList.write((AppendOnlyLinkedArrayList.NonThrowingPredicate) behaviorDisposable);
                        }
                        return;
                    }
                }
            } while (atomicReference.get() == behaviorDisposableArr);
        }
    }

    public final void write(BehaviorDisposable behaviorDisposable) {
        AtomicReference atomicReference;
        BehaviorDisposable[] behaviorDisposableArr;
        BehaviorDisposable[] behaviorDisposableArr2;
        do {
            atomicReference = this.RatingCompat;
            behaviorDisposableArr = (BehaviorDisposable[]) atomicReference.get();
            int length = behaviorDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (behaviorDisposableArr[i] == behaviorDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                behaviorDisposableArr2 = serializer;
            } else {
                BehaviorDisposable[] behaviorDisposableArr3 = new BehaviorDisposable[length - 1];
                System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr3, 0, i);
                System.arraycopy(behaviorDisposableArr, i + 1, behaviorDisposableArr3, i, (length - i) - 1);
                behaviorDisposableArr2 = behaviorDisposableArr3;
            }
        } while (!af$$ExternalSyntheticOutline1.IconCompatParcelizer(atomicReference, behaviorDisposableArr, behaviorDisposableArr2));
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        ObjectHelper.write(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!MediaSessionCompatQueueItem.write(this.MediaDescriptionCompat, th)) {
            RxJavaPlugins.IconCompatParcelizer(th);
            return;
        }
        Object objError = NotificationLite.error(th);
        AtomicReference atomicReference = this.RatingCompat;
        BehaviorDisposable[] behaviorDisposableArr = RemoteActionCompatParcelizer;
        BehaviorDisposable[] behaviorDisposableArr2 = (BehaviorDisposable[]) atomicReference.getAndSet(behaviorDisposableArr);
        if (behaviorDisposableArr2 != behaviorDisposableArr) {
            Lock lock = this.MediaMetadataCompat;
            lock.lock();
            this.IconCompatParcelizer++;
            this.MediaSessionCompatQueueItem.lazySet(objError);
            lock.unlock();
        }
        for (BehaviorDisposable behaviorDisposable : behaviorDisposableArr2) {
            behaviorDisposable.read(this.IconCompatParcelizer, objError);
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        ObjectHelper.write(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.MediaDescriptionCompat.get() != null) {
            return;
        }
        Object next = NotificationLite.next(obj);
        Lock lock = this.MediaMetadataCompat;
        lock.lock();
        this.IconCompatParcelizer++;
        this.MediaSessionCompatQueueItem.lazySet(next);
        lock.unlock();
        for (BehaviorDisposable behaviorDisposable : (BehaviorDisposable[]) this.RatingCompat.get()) {
            behaviorDisposable.read(this.IconCompatParcelizer, next);
        }
    }

    public BehaviorSubject() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.write = reentrantReadWriteLock.readLock();
        this.MediaMetadataCompat = reentrantReadWriteLock.writeLock();
        this.RatingCompat = new AtomicReference(serializer);
        this.MediaSessionCompatQueueItem = new AtomicReference();
        this.MediaDescriptionCompat = new AtomicReference();
    }
}
