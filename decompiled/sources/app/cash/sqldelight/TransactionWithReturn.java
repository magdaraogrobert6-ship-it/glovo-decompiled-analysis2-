package app.cash.sqldelight;

import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public interface TransactionWithReturn<R> extends TransactionCallbacks {
    Void rollback(R r);

    <R> R transaction(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm);
}
