package com.google.android.gms.internal.gtm;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.measurement.internal.zzbe;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import o.executeDiff;
import o.fillSnake;
import o.getInfoEK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkh implements Iterator {
    public Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public zzkh(fillSnake fillsnake, Object obj, Comparator comparator) {
        this.serializer = 8;
        this.RemoteActionCompatParcelizer = new ArrayDeque();
        while (!fillsnake.RatingCompat()) {
            int iCompare = obj != null ? comparator.compare(fillsnake.RemoteActionCompatParcelizer(), obj) : 1;
            if (iCompare < 0) {
                fillsnake = fillsnake.MediaDescriptionCompat();
            } else {
                ArrayDeque arrayDeque = (ArrayDeque) this.RemoteActionCompatParcelizer;
                if (iCompare == 0) {
                    arrayDeque.push((executeDiff) fillsnake);
                    return;
                } else {
                    arrayDeque.push((executeDiff) fillsnake);
                    fillsnake = fillsnake.s_();
                }
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.serializer) {
            case 0:
                return ((Iterator) this.RemoteActionCompatParcelizer).hasNext();
            case 1:
                return ((Iterator) this.RemoteActionCompatParcelizer).hasNext();
            case 2:
                return ((Iterator) this.RemoteActionCompatParcelizer).hasNext();
            case 3:
                return ((Iterator) this.RemoteActionCompatParcelizer).hasNext();
            case 4:
                return ((Iterator) this.RemoteActionCompatParcelizer).hasNext();
            case 5:
                return ((Iterator) this.RemoteActionCompatParcelizer).hasNext();
            case 6:
                return ((Iterator) this.RemoteActionCompatParcelizer).hasNext();
            case 7:
                return ((Iterator) this.RemoteActionCompatParcelizer).hasNext();
            default:
                return ((ArrayDeque) this.RemoteActionCompatParcelizer).size() > 0;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.serializer) {
            case 0:
                return new getInfoEK5gGoQ((String) ((Iterator) this.RemoteActionCompatParcelizer).next());
            case 1:
                return (String) ((Iterator) this.RemoteActionCompatParcelizer).next();
            case 2:
                return ((Map.Entry) ((Iterator) this.RemoteActionCompatParcelizer).next()).getValue();
            case 3:
                return ((Map.Entry) ((Iterator) this.RemoteActionCompatParcelizer).next()).getValue();
            case 4:
                return (String) ((Iterator) this.RemoteActionCompatParcelizer).next();
            case 5:
                return (String) ((Iterator) this.RemoteActionCompatParcelizer).next();
            case 6:
                return ((Map.Entry) ((Iterator) this.RemoteActionCompatParcelizer).next()).getKey();
            case 7:
                return (String) ((Iterator) this.RemoteActionCompatParcelizer).next();
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.RemoteActionCompatParcelizer;
                try {
                    executeDiff executediff = (executeDiff) arrayDeque.pop();
                    AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(executediff.IconCompatParcelizer, executediff.serializer);
                    for (fillSnake fillsnakeS_ = executediff.read; !fillsnakeS_.RatingCompat(); fillsnakeS_ = fillsnakeS_.s_()) {
                        arrayDeque.push((executeDiff) fillsnakeS_);
                    }
                    return simpleEntry;
                } catch (EmptyStackException unused) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.read();
                    return null;
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.serializer) {
            case 0:
                ((Iterator) this.RemoteActionCompatParcelizer).remove();
                return;
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                ((Iterator) this.RemoteActionCompatParcelizer).remove();
                return;
            case 3:
                ((Iterator) this.RemoteActionCompatParcelizer).remove();
                return;
            case 4:
                throw new UnsupportedOperationException("Remove not supported");
            case 5:
                throw new UnsupportedOperationException();
            case 6:
                ((Iterator) this.RemoteActionCompatParcelizer).remove();
                return;
            case 7:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("remove called on immutable collection");
        }
    }

    public /* synthetic */ zzkh(Iterator it, int i, boolean z) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = it;
    }

    public zzkh(zzbe zzbeVar) {
        this.serializer = 4;
        this.RemoteActionCompatParcelizer = zzbeVar.read.keySet().iterator();
    }

    public zzkh(Iterator it, int i) {
        this.serializer = i;
        if (i != 3) {
            it.getClass();
            this.RemoteActionCompatParcelizer = it;
        } else {
            it.getClass();
            this.RemoteActionCompatParcelizer = it;
        }
    }

    public /* synthetic */ zzkh(int i) {
        this.serializer = i;
    }
}
