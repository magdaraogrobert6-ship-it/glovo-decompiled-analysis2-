package com.mapbox.search.utils;

import androidx.constraintlayout.compose.ConstraintSetForInlineDsl$applyTo$1;
import com.incognia.internal.ZM$$ExternalSyntheticLambda0;
import com.mapbox.search.base.task.AsyncOperationTaskImpl;
import com.mapbox.search.common.CompletionCallback;
import com.mapbox.search.record.IndexableDataProviderEngineImpl;
import com.mapbox.search.record.LocalDataProviderImpl;
import com.sentiance.core.model.events.H$b;
import com.sentiance.sdk.tile.j$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class CompoundCompletionCallback implements CompletionCallback {
    public final /* synthetic */ int $r8$classId;
    public final Executor callbackExecutor;
    public final Object completions;
    public final AsyncOperationTaskImpl compoundTask;
    public final Object resultingCallback;
    public final Object tasks;

    public CompoundCompletionCallback(Executor executor, CompletionCallback completionCallback) {
        this.$r8$classId = 0;
        this.callbackExecutor = executor;
        this.resultingCallback = completionCallback;
        this.completions = new ArrayList();
        this.tasks = new ArrayList();
        this.compoundTask = new AsyncOperationTaskImpl();
    }

    @Override // com.mapbox.search.common.CompletionCallback
    public final void onComplete(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.completions;
        if (i != 0) {
            final IndexableDataProviderEngineImpl indexableDataProviderEngineImpl = (IndexableDataProviderEngineImpl) obj;
            indexableDataProviderEngineImpl.getClass();
            final H$b h$b = (H$b) this.resultingCallback;
            final LocalDataProviderImpl localDataProviderImpl = (LocalDataProviderImpl) obj2;
            final LoggingCompletionCallback loggingCompletionCallback = (LoggingCompletionCallback) this.tasks;
            final Executor executor = this.callbackExecutor;
            final AsyncOperationTaskImpl asyncOperationTaskImpl = this.compoundTask;
            asyncOperationTaskImpl.runIfNotCancelled(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.search.IndexableDataProvidersRegistryImpl$preregister$2$onComplete$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj3) {
                    ((AsyncOperationTaskImpl) obj3).getClass();
                    H$b h$b2 = h$b;
                    ConstraintSetForInlineDsl$applyTo$1 constraintSetForInlineDsl$applyTo$1 = new ConstraintSetForInlineDsl$applyTo$1(h$b2, localDataProviderImpl, indexableDataProviderEngineImpl, 8);
                    synchronized (h$b2) {
                        constraintSetForInlineDsl$applyTo$1.invoke();
                    }
                    executor.execute(new ZM$$ExternalSyntheticLambda0(asyncOperationTaskImpl, 11, loggingCompletionCallback));
                    return createFromParcel.INSTANCE;
                }
            });
            return;
        }
        ArrayList arrayList = (ArrayList) obj2;
        if (this.compoundTask.isCompleted()) {
            return;
        }
        arrayList.add(obj);
        if (arrayList.size() == 2) {
            this.callbackExecutor.execute(new ZM$$ExternalSyntheticLambda0(this, 22, obj));
        }
    }

    @Override // com.mapbox.search.common.CompletionCallback
    public final void onError(Exception exc) {
        int i = this.$r8$classId;
        Object obj = this.tasks;
        AsyncOperationTaskImpl asyncOperationTaskImpl = this.compoundTask;
        Executor executor = this.callbackExecutor;
        exc.getClass();
        if (i != 0) {
            executor.execute(new j$$ExternalSyntheticLambda1(asyncOperationTaskImpl, (LoggingCompletionCallback) obj, exc, 1));
        } else {
            if (asyncOperationTaskImpl.isCompleted()) {
                return;
            }
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                ((AsyncOperationTaskImpl) it.next()).cancel();
            }
            executor.execute(new ZM$$ExternalSyntheticLambda0(this, 23, exc));
        }
    }

    public CompoundCompletionCallback(AsyncOperationTaskImpl asyncOperationTaskImpl, H$b h$b, Executor executor, LocalDataProviderImpl localDataProviderImpl, LoggingCompletionCallback loggingCompletionCallback) {
        this.$r8$classId = 1;
        this.compoundTask = asyncOperationTaskImpl;
        this.resultingCallback = h$b;
        this.callbackExecutor = executor;
        this.completions = localDataProviderImpl;
        this.tasks = loggingCompletionCallback;
    }
}
