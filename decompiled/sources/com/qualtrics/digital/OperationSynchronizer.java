package com.qualtrics.digital;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
class OperationSynchronizer {
    private final ConcurrentMap<SupportedOperation, CountDownLatch> ongoingOperations = new ConcurrentHashMap();

    public enum SupportedOperation {
        INITIALIZE_PROJECT
    }

    public boolean isOperationRunning(SupportedOperation supportedOperation) {
        return this.ongoingOperations.containsKey(supportedOperation);
    }

    public void removeFromOngoingOperations(SupportedOperation supportedOperation) {
        CountDownLatch countDownLatch = this.ongoingOperations.get(supportedOperation);
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.ongoingOperations.remove(supportedOperation);
        }
    }

    public boolean waitForOngoingOperation(SupportedOperation supportedOperation, int i) {
        String str;
        CountDownLatch countDownLatch = this.ongoingOperations.get(supportedOperation);
        if (countDownLatch == null) {
            return true;
        }
        if (i < 0) {
            i = 0;
        }
        try {
            if (countDownLatch.await(i, TimeUnit.SECONDS)) {
                str = null;
            } else {
                str = "Operation timed out after " + i + " seconds for operation: " + supportedOperation;
            }
        } catch (InterruptedException unused) {
            str = "Waiting for operation was interrupted for operation: " + supportedOperation;
        } catch (Exception unused2) {
            str = "An unexpected error occurred while waiting for operation: " + supportedOperation;
        }
        if (str == null) {
            return true;
        }
        QualtricsLog.logError(str);
        return false;
    }

    public void addToOngoingOperations(SupportedOperation supportedOperation) {
        if (isOperationRunning(supportedOperation)) {
            return;
        }
        this.ongoingOperations.put(supportedOperation, new CountDownLatch(1));
    }
}
