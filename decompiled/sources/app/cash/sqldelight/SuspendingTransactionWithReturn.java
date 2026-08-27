package app.cash.sqldelight;

import o.ShortNewsContentCardView;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public interface SuspendingTransactionWithReturn<R> extends TransactionCallbacks {
    Void rollback(R r);

    <R> Object transaction(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<? super R> shortNewsContentCardView);
}
