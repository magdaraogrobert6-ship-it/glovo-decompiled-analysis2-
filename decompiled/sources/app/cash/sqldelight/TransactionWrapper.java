package app.cash.sqldelight;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
final class TransactionWrapper<R> implements TransactionWithoutReturn, TransactionWithReturn<R> {
    private final Transacter.Transaction transaction;

    public final Transacter.Transaction getTransaction() {
        return this.transaction;
    }

    @Override // app.cash.sqldelight.TransactionWithoutReturn
    public Void rollback() throws RollbackException {
        this.transaction.checkThreadConfinement$runtime();
        throw new RollbackException(null, 1, null);
    }

    public TransactionWrapper(Transacter.Transaction transaction) {
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

    @Override // app.cash.sqldelight.TransactionWithReturn
    public <R> R transaction(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        TransacterBase transacter$runtime = this.transaction.getTransacter$runtime();
        transacter$runtime.getClass();
        return (R) ((Transacter) transacter$runtime).transactionWithResult(false, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    @Override // app.cash.sqldelight.TransactionWithReturn
    public Void rollback(R r) throws RollbackException {
        this.transaction.checkThreadConfinement$runtime();
        throw new RollbackException(r);
    }

    @Override // app.cash.sqldelight.TransactionWithoutReturn
    /* JADX INFO: renamed from: transaction, reason: collision with other method in class */
    public void mo3953transaction(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        TransacterBase transacter$runtime = this.transaction.getTransacter$runtime();
        transacter$runtime.getClass();
        ((Transacter) transacter$runtime).transaction(false, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
