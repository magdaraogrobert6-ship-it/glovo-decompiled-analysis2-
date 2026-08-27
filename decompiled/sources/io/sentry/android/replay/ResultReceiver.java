package io.sentry.android.replay;

import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;
import o.UriActionExternalSyntheticLambda4;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final class ResultReceiver extends CopyOnWriteArrayList {
    public final /* synthetic */ r8lambda7IJBVrN0sHyidCAZufWEJFc7yY serializer;

    public ResultReceiver(r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7ijbvrn0shyidcazufwejfc7yy) {
        this.serializer = r8lambda7ijbvrn0shyidcazufwejfc7yy;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        write writeVar = (write) obj;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7ijbvrn0shyidcazufwejfc7yy = this.serializer;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = r8lambda7ijbvrn0shyidcazufwejfc7yy.read.serializer();
        try {
            for (View view : r8lambda7ijbvrn0shyidcazufwejfc7yy.RemoteActionCompatParcelizer) {
                if (writeVar != null) {
                    writeVar.IconCompatParcelizer(view, true);
                }
            }
            Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
            return super.add(writeVar);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th);
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof write)) {
            return super.contains((write) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null || (obj instanceof write)) {
            return super.indexOf((write) obj);
        }
        return -1;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null || (obj instanceof write)) {
            return super.lastIndexOf((write) obj);
        }
        return -1;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof write)) {
            return super.remove((write) obj);
        }
        return false;
    }
}
