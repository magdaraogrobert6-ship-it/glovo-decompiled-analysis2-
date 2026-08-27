package com.incognia.internal;

import androidx.compose.ui.semantics.SemanticsSortKt;
import java.util.Comparator;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Q9$$ExternalSyntheticLambda0 implements Comparator {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 f$0;

    public /* synthetic */ Q9$$ExternalSyntheticLambda0(int i, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.$r8$classId = i;
        this.f$0 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.$r8$classId;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.f$0;
        return i != 0 ? SemanticsSortKt.sortByGeometryGroupings$lambda$1(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, obj, obj2) : Q9.BGx(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, obj, obj2);
    }
}
