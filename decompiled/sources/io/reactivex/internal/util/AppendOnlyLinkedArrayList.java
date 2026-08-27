package io.reactivex.internal.util;

import io.reactivex.functions.Predicate;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;

/* JADX INFO: loaded from: classes4.dex */
public class AppendOnlyLinkedArrayList<T> {
    public final Object[] IconCompatParcelizer;
    public Object[] read;
    public int serializer;

    public interface NonThrowingPredicate<T> extends Predicate<T> {
    }

    public AppendOnlyLinkedArrayList() {
        Object[] objArr = new Object[5];
        this.IconCompatParcelizer = objArr;
        this.read = objArr;
    }

    public final void write(Object obj) {
        int i = this.serializer;
        if (i == 4) {
            Object[] objArr = new Object[5];
            this.read[4] = objArr;
            this.read = objArr;
            i = 0;
        }
        this.read[i] = obj;
        this.serializer = i + 1;
    }

    public final boolean RemoteActionCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        Object[] objArr;
        Object[] objArr2 = this.IconCompatParcelizer;
        while (true) {
            if (objArr2 == null) {
                return false;
            }
            for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                if (NotificationLite.acceptFull(objArr, fwFClientaddFeatureKeysfeaturesUpdated1)) {
                    return true;
                }
            }
            objArr2 = objArr2[4];
        }
    }

    public final void write(NonThrowingPredicate nonThrowingPredicate) {
        Object obj;
        for (Object[] objArr = this.IconCompatParcelizer; objArr != null; objArr = objArr[4]) {
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (nonThrowingPredicate.read(obj)) {
                    return;
                }
            }
        }
    }
}
