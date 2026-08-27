package o;

import androidx.compose.foundation.MutatorMutex$Mutator;
import androidx.compose.foundation.MutatorMutex$mutate$2;
import bo.app.af$$ExternalSyntheticOutline1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes.dex */
public final class awaitScrollDependencies {
    public final AtomicReference serializer = new AtomicReference(null);
    public final MutexImpl RemoteActionCompatParcelizer = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();

    public static final void serializer(awaitScrollDependencies awaitscrolldependencies, MutatorMutex$Mutator mutatorMutex$Mutator) {
        MutatorMutex$Mutator mutatorMutex$Mutator2;
        AtomicReference atomicReference = awaitscrolldependencies.serializer;
        do {
            mutatorMutex$Mutator2 = (MutatorMutex$Mutator) atomicReference.get();
            if (mutatorMutex$Mutator2 != null && !mutatorMutex$Mutator.write(mutatorMutex$Mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!af$$ExternalSyntheticOutline1.write(atomicReference, mutatorMutex$Mutator2, mutatorMutex$Mutator));
        if (mutatorMutex$Mutator2 != null) {
            mutatorMutex$Mutator2.write();
        }
    }

    public static Object write(awaitScrollDependencies awaitscrolldependencies, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, SuspendLambda suspendLambda) {
        applyMeasureResultfoundation applymeasureresultfoundation = applyMeasureResultfoundation.Default;
        awaitscrolldependencies.getClass();
        return YieldKt.coroutineScope(new MutatorMutex$mutate$2(applymeasureresultfoundation, (Object) awaitscrolldependencies, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (ShortNewsContentCardView) null, 0), suspendLambda);
    }
}
