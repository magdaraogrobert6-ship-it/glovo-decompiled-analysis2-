package app.cash.sqldelight;

import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SuspendingTransacterImpl extends BaseTransacterImpl implements SuspendingTransacter {

    /* JADX INFO: renamed from: app.cash.sqldelight.SuspendingTransacterImpl$transactionWithWrapper$1, reason: invalid class name */
    public static final class AnonymousClass1<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SuspendingTransacterImpl.this.transactionWithWrapper(false, null, this);
        }
    }

    @Override // app.cash.sqldelight.SuspendingTransacter
    public Object transaction(boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        return transaction$suspendImpl(this, z, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, shortNewsContentCardView);
    }

    @Override // app.cash.sqldelight.SuspendingTransacter
    public <R> Object transactionWithResult(boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<? super R> shortNewsContentCardView) {
        return transactionWithWrapper(z, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, shortNewsContentCardView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingTransacterImpl(SqlDriver sqlDriver) {
        super(sqlDriver);
        sqlDriver.getClass();
    }

    public static Object transaction$suspendImpl(SuspendingTransacterImpl suspendingTransacterImpl, boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        Object objTransactionWithWrapper = suspendingTransacterImpl.transactionWithWrapper(z, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, shortNewsContentCardView);
        return objTransactionWithWrapper == CoroutineSingletons.COROUTINE_SUSPENDED ? objTransactionWithWrapper : createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0125  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Object transactionWithWrapper(boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView<? super R> shortNewsContentCardView) {
        AnonymousClass1 anonymousClass1;
        SuspendingTransacterImpl suspendingTransacterImpl;
        Transacter.Transaction transaction;
        Throwable th;
        Transacter.Transaction transaction2;
        Transacter.Transaction transaction3;
        Transacter.Transaction transaction4;
        QueryResult<createFromParcel> queryResultEndTransaction$runtime;
        Transacter.Transaction transaction5;
        SuspendingTransacterImpl suspendingTransacterImpl2;
        Object obj;
        Transacter.Transaction transaction6;
        Transacter.Transaction transaction7;
        QueryResult<createFromParcel> queryResultEndTransaction$runtime2;
        Transacter.Transaction transaction8;
        Object obj2;
        SuspendingTransacterImpl suspendingTransacterImpl3;
        if (shortNewsContentCardView instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) shortNewsContentCardView;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
        }
        Object objAwait = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        Object obj3 = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objAwait);
            QueryResult<Transacter.Transaction> queryResultNewTransaction = getDriver().newTransaction();
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
            anonymousClass1.Z$0 = z;
            anonymousClass1.label = 1;
            objAwait = queryResultNewTransaction.await(anonymousClass1);
            if (objAwait != coroutineSingletons) {
                suspendingTransacterImpl = this;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                transaction2 = (Transacter.Transaction) anonymousClass1.L$2;
                Transacter.Transaction transaction9 = (Transacter.Transaction) anonymousClass1.L$1;
                suspendingTransacterImpl = (SuspendingTransacterImpl) anonymousClass1.L$0;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(objAwait);
                    transaction4 = transaction9;
                    transaction3 = transaction2;
                    transaction7 = transaction4;
                    try {
                        transaction7.setSuccessful$runtime(true);
                        queryResultEndTransaction$runtime2 = transaction7.endTransaction$runtime();
                        anonymousClass1.L$0 = suspendingTransacterImpl;
                        anonymousClass1.L$1 = transaction7;
                        anonymousClass1.L$2 = transaction3;
                        anonymousClass1.L$3 = objAwait;
                        anonymousClass1.label = 3;
                        if (queryResultEndTransaction$runtime2.await(anonymousClass1) != coroutineSingletons) {
                            transaction8 = transaction7;
                            obj2 = objAwait;
                            suspendingTransacterImpl3 = suspendingTransacterImpl;
                        }
                    } catch (Throwable th2) {
                        obj3 = objAwait;
                        transaction = transaction7;
                        transaction2 = transaction3;
                        th = th2;
                        queryResultEndTransaction$runtime = transaction.endTransaction$runtime();
                        anonymousClass1.L$0 = suspendingTransacterImpl;
                        anonymousClass1.L$1 = transaction;
                        anonymousClass1.L$2 = transaction2;
                        anonymousClass1.L$3 = th;
                        anonymousClass1.L$4 = obj3;
                        anonymousClass1.label = 4;
                        if (queryResultEndTransaction$runtime.await(anonymousClass1) != coroutineSingletons) {
                            transaction5 = transaction2;
                            suspendingTransacterImpl2 = suspendingTransacterImpl;
                            obj = obj3;
                            transaction6 = transaction;
                            return suspendingTransacterImpl2.postTransactionCleanup(transaction6, transaction5, th, obj);
                        }
                    }
                } catch (Throwable th3) {
                    transaction = transaction9;
                    th = th3;
                    queryResultEndTransaction$runtime = transaction.endTransaction$runtime();
                    anonymousClass1.L$0 = suspendingTransacterImpl;
                    anonymousClass1.L$1 = transaction;
                    anonymousClass1.L$2 = transaction2;
                    anonymousClass1.L$3 = th;
                    anonymousClass1.L$4 = obj3;
                    anonymousClass1.label = 4;
                    if (queryResultEndTransaction$runtime.await(anonymousClass1) != coroutineSingletons) {
                        transaction5 = transaction2;
                        suspendingTransacterImpl2 = suspendingTransacterImpl;
                        obj = obj3;
                        transaction6 = transaction;
                        return suspendingTransacterImpl2.postTransactionCleanup(transaction6, transaction5, th, obj);
                    }
                    return coroutineSingletons;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    obj = anonymousClass1.L$4;
                    th = (Throwable) anonymousClass1.L$3;
                    transaction5 = (Transacter.Transaction) anonymousClass1.L$2;
                    transaction6 = (Transacter.Transaction) anonymousClass1.L$1;
                    SuspendingTransacterImpl suspendingTransacterImpl4 = (SuspendingTransacterImpl) anonymousClass1.L$0;
                    ExtrasKt.RemoteActionCompatParcelizer(objAwait);
                    suspendingTransacterImpl2 = suspendingTransacterImpl4;
                    return suspendingTransacterImpl2.postTransactionCleanup(transaction6, transaction5, th, obj);
                }
                if (i2 != 5) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj4 = anonymousClass1.L$3;
                Transacter.Transaction transaction10 = (Transacter.Transaction) anonymousClass1.L$2;
                Transacter.Transaction transaction11 = (Transacter.Transaction) anonymousClass1.L$1;
                SuspendingTransacterImpl suspendingTransacterImpl5 = (SuspendingTransacterImpl) anonymousClass1.L$0;
                ExtrasKt.RemoteActionCompatParcelizer(objAwait);
                return suspendingTransacterImpl5.postTransactionCleanup(transaction11, transaction10, null, obj4);
            }
            obj2 = anonymousClass1.L$3;
            transaction3 = (Transacter.Transaction) anonymousClass1.L$2;
            transaction8 = (Transacter.Transaction) anonymousClass1.L$1;
            SuspendingTransacterImpl suspendingTransacterImpl6 = (SuspendingTransacterImpl) anonymousClass1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(objAwait);
            suspendingTransacterImpl3 = suspendingTransacterImpl6;
            return suspendingTransacterImpl3.postTransactionCleanup(transaction8, transaction3, null, obj2);
        }
        z = anonymousClass1.Z$0;
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) anonymousClass1.L$1;
        suspendingTransacterImpl = (SuspendingTransacterImpl) anonymousClass1.L$0;
        ExtrasKt.RemoteActionCompatParcelizer(objAwait);
        transaction = (Transacter.Transaction) objAwait;
        Transacter.Transaction transactionEnclosingTransaction$runtime = transaction.enclosingTransaction$runtime();
        if (transactionEnclosingTransaction$runtime != null && z) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Already in a transaction");
            return null;
        }
        try {
            transaction.setTransacter$runtime(suspendingTransacterImpl);
            SuspendingTransactionWrapper suspendingTransactionWrapper = new SuspendingTransactionWrapper(transaction);
            anonymousClass1.L$0 = suspendingTransacterImpl;
            anonymousClass1.L$1 = transaction;
            anonymousClass1.L$2 = transactionEnclosingTransaction$runtime;
            anonymousClass1.label = 2;
            Object objInvoke = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(suspendingTransactionWrapper, anonymousClass1);
            if (objInvoke != coroutineSingletons) {
                transaction3 = transactionEnclosingTransaction$runtime;
                transaction4 = transaction;
                objAwait = objInvoke;
                transaction7 = transaction4;
                transaction7.setSuccessful$runtime(true);
                queryResultEndTransaction$runtime2 = transaction7.endTransaction$runtime();
                anonymousClass1.L$0 = suspendingTransacterImpl;
                anonymousClass1.L$1 = transaction7;
                anonymousClass1.L$2 = transaction3;
                anonymousClass1.L$3 = objAwait;
                anonymousClass1.label = 3;
                if (queryResultEndTransaction$runtime2.await(anonymousClass1) != coroutineSingletons) {
                    transaction8 = transaction7;
                    obj2 = objAwait;
                    suspendingTransacterImpl3 = suspendingTransacterImpl;
                    return suspendingTransacterImpl3.postTransactionCleanup(transaction8, transaction3, null, obj2);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            transaction2 = transactionEnclosingTransaction$runtime;
            queryResultEndTransaction$runtime = transaction.endTransaction$runtime();
            anonymousClass1.L$0 = suspendingTransacterImpl;
            anonymousClass1.L$1 = transaction;
            anonymousClass1.L$2 = transaction2;
            anonymousClass1.L$3 = th;
            anonymousClass1.L$4 = obj3;
            anonymousClass1.label = 4;
            if (queryResultEndTransaction$runtime.await(anonymousClass1) != coroutineSingletons) {
                transaction5 = transaction2;
                suspendingTransacterImpl2 = suspendingTransacterImpl;
                obj = obj3;
                transaction6 = transaction;
                return suspendingTransacterImpl2.postTransactionCleanup(transaction6, transaction5, th, obj);
            }
            return coroutineSingletons;
        }
        return coroutineSingletons;
    }
}
