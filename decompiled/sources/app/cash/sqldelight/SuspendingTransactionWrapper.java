package app.cash.sqldelight;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
final class SuspendingTransactionWrapper<R> implements SuspendingTransactionWithoutReturn, SuspendingTransactionWithReturn<R> {
    private final Transacter.Transaction transaction;

    public final Transacter.Transaction getTransaction() {
        return this.transaction;
    }

    @Override // app.cash.sqldelight.SuspendingTransactionWithoutReturn
    public Void rollback() throws RollbackException {
        this.transaction.checkThreadConfinement$runtime();
        throw new RollbackException(null, 1, null);
    }

    @Override // app.cash.sqldelight.SuspendingTransactionWithReturn
    public <R> Object transaction(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<? super R> shortNewsContentCardView) {
        TransacterBase transacter$runtime = this.transaction.getTransacter$runtime();
        transacter$runtime.getClass();
        return ((SuspendingTransacter) transacter$runtime).transactionWithResult(false, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, shortNewsContentCardView);
    }

    @Override // app.cash.sqldelight.SuspendingTransactionWithoutReturn
    public Object transactionWithResult(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        TransacterBase transacter$runtime = this.transaction.getTransacter$runtime();
        transacter$runtime.getClass();
        Object objTransaction = ((SuspendingTransacter) transacter$runtime).transaction(false, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, shortNewsContentCardView);
        return objTransaction == CoroutineSingletons.COROUTINE_SUSPENDED ? objTransaction : createFromParcel.INSTANCE;
    }

    public SuspendingTransactionWrapper(Transacter.Transaction transaction) {
        transaction.getClass();
        this.transaction = transaction;
    }

    @Override // app.cash.sqldelight.TransactionCallbacks
    public void afterCommit(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        this.transaction.afterCommit(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    @Override // app.cash.sqldelight.TransactionCallbacks
    public void afterRollback(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        this.transaction.afterRollback(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    @Override // app.cash.sqldelight.SuspendingTransactionWithReturn
    public Void rollback(R r) throws RollbackException {
        this.transaction.checkThreadConfinement$runtime();
        throw new RollbackException(r);
    }
}
