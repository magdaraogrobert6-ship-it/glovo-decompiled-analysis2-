package o;

import android.os.Looper;
import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public abstract class setLayoutPending {
    public static final ExecutorService write;

    public static void RemoteActionCompatParcelizer(Task task) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(write, new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(8, countDownLatch));
        Looper mainLooper = Looper.getMainLooper();
        Looper looperMyLooper = Looper.myLooper();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (mainLooper == looperMyLooper) {
            countDownLatch.await(ConstantsKt.DEFAULT_REQUEST_TIMEOUT, timeUnit);
        } else {
            countDownLatch.await(4000L, timeUnit);
        }
        if (task.isSuccessful()) {
            task.getResult();
        } else {
            if (!task.isCanceled()) {
                if (task.isComplete()) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(task.getException());
                    return;
                }
                throw new TimeoutException();
            }
            throw new CancellationException("Task is already canceled");
        }
    }

    static {
        getShiftLeftEK5gGoQ getshiftleftek5ggoq = new getShiftLeftEK5gGoQ(new AtomicLong(1L));
        ThreadPoolExecutor.DiscardPolicy discardPolicy = new ThreadPoolExecutor.DiscardPolicy();
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), getshiftleftek5ggoq, discardPolicy));
        Runtime.getRuntime().addShutdownHook(new Thread(new onBeforeLayoutChildren(executorServiceUnconfigurableExecutorService), "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
        write = executorServiceUnconfigurableExecutorService;
    }
}
