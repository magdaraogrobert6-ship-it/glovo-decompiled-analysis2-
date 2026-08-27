package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import kotlinx.coroutines.internal.ContextScope;
import o.isRoot;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ a$$ExternalSyntheticLambda0(Object obj, int i, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                return a.a((Context) obj2, (a) obj);
            case 1:
                return DataStoreProvider.n.a(obj2, (isRoot) obj);
            case 2:
                return DataStoreProvider.readInt$lambda$0((DataStoreKey) obj2, (Integer) obj);
            case 3:
                return DataStoreProvider.readBoolean$lambda$0((DataStoreKey) obj2, (Boolean) obj);
            case 4:
                return DataStoreProvider.readString$lambda$0((DataStoreKey) obj2, (String) obj);
            case 5:
                return DataStoreProvider.readFloat$lambda$0((DataStoreKey) obj2, (Float) obj);
            case 6:
                return DataStoreProvider.createOrGetDataStore$lambda$0$0((DataStoreProvider) obj2, (String) obj);
            case 7:
                return DataStoreProvider.readLong$lambda$0((DataStoreKey) obj2, (Long) obj);
            case 8:
                return DataStoreProvider.Companion.getOrCreateScopeForKey$lambda$1$1((String) obj2, (ContextScope) obj);
            case 9:
                return b.a((Context) obj2, (b) obj);
            case 10:
                return d.a((Context) obj2, (d) obj);
            case 11:
                return g.a((Context) obj2, (g) obj);
            case 12:
                return h.a((Context) obj2, (h) obj);
            case 13:
                return j.a((Context) obj2, (j) obj);
            case 14:
                return k.a((Context) obj2, (k) obj);
            case 15:
                return l.a((Context) obj2, (l) obj);
            case 16:
                return n.a((Context) obj2, (n) obj);
            case 17:
                return o.a((Context) obj2, (o) obj);
            case 18:
                return q.a((Context) obj2, (q) obj);
            default:
                return t.a((Context) obj2, (t) obj);
        }
    }
}
