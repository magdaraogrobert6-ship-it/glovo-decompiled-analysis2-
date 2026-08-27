package app.cash.sqldelight;

import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.internal.CurrentThreadIdKt;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public interface Transacter extends TransacterBase {

    public static abstract class Transaction implements TransactionCallbacks {
        private boolean successful;
        private TransacterBase transacter;
        private final long ownerThreadId = CurrentThreadIdKt.currentThreadId();
        private final List<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0> postCommitHooks = new ArrayList();
        private final List<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0> postRollbackHooks = new ArrayList();
        private final Set<Integer> registeredQueries = new LinkedHashSet();
        private final Set<String> pendingTables = new LinkedHashSet();
        private boolean childrenSuccessful = true;

        public final Transaction enclosingTransaction$runtime() {
            return getEnclosingTransaction();
        }

        public abstract QueryResult<createFromParcel> endTransaction(boolean z);

        public final boolean getChildrenSuccessful$runtime() {
            return this.childrenSuccessful;
        }

        public abstract Transaction getEnclosingTransaction();

        public final Set<String> getPendingTables$runtime() {
            return this.pendingTables;
        }

        public final List<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0> getPostCommitHooks$runtime() {
            return this.postCommitHooks;
        }

        public final List<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0> getPostRollbackHooks$runtime() {
            return this.postRollbackHooks;
        }

        public final Set<Integer> getRegisteredQueries$runtime() {
            return this.registeredQueries;
        }

        public final boolean getSuccessful$runtime() {
            return this.successful;
        }

        public final TransacterBase getTransacter$runtime() {
            return this.transacter;
        }

        public final void setChildrenSuccessful$runtime(boolean z) {
            this.childrenSuccessful = z;
        }

        public final void setSuccessful$runtime(boolean z) {
            this.successful = z;
        }

        public final void setTransacter$runtime(TransacterBase transacterBase) {
            this.transacter = transacterBase;
        }

        public final void checkThreadConfinement$runtime() {
            if (this.ownerThreadId == CurrentThreadIdKt.currentThreadId()) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Transaction objects (`TransactionWithReturn` and `TransactionWithoutReturn`) must be used\nonly within the transaction lambda scope.");
        }

        @Override // app.cash.sqldelight.TransactionCallbacks
        public void afterCommit(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            checkThreadConfinement$runtime();
            this.postCommitHooks.add(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }

        @Override // app.cash.sqldelight.TransactionCallbacks
        public void afterRollback(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            checkThreadConfinement$runtime();
            this.postRollbackHooks.add(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }

        public final QueryResult<createFromParcel> endTransaction$runtime() {
            checkThreadConfinement$runtime();
            return endTransaction(this.successful && this.childrenSuccessful);
        }
    }

    void transaction(boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm);

    <R> R transactionWithResult(boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm);

    public static final class DefaultImpls {
        public static /* synthetic */ void transaction$default(Transacter transacter, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                transacter.transaction(z, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                return;
            }
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: transaction");
        }

        public static /* synthetic */ Object transactionWithResult$default(Transacter transacter, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return transacter.transactionWithResult(z, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            }
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: transactionWithResult");
            return null;
        }
    }
}
