package com.qualtrics.digital;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class BackOffRetrier {
    private String retrierName;
    private IBackOffRetrierFormulaCallback retryBackOffFormula;
    int retryCount = 0;
    public int retryLimit;

    public int getRetryCount() {
        return this.retryCount;
    }

    public void resetRetryCount() {
        this.retryCount = 0;
    }

    public void backOffAndRetry(Runnable runnable, Runnable runnable2, ScheduledExecutorService scheduledExecutorService) {
        int i = this.retryCount;
        if (i >= this.retryLimit) {
            StringBuilder sb = new StringBuilder("Retrier for ");
            sb.append(this.retrierName);
            sb.append(" - Exceeded retry limit of ");
            QualtricsLog.logInfo(af$$ExternalSyntheticOutline0.m(this.retryLimit, "; No longer retrying", sb));
            this.retryCount = 0;
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        int i2 = i + 1;
        this.retryCount = i2;
        int backOffDelayInMilliseconds = this.retryBackOffFormula.getBackOffDelayInMilliseconds(i2);
        QualtricsLog.logInfo("Retrying " + this.retrierName + " after " + backOffDelayInMilliseconds + " seconds");
        scheduledExecutorService.schedule(runnable, (long) backOffDelayInMilliseconds, TimeUnit.MILLISECONDS);
    }

    public BackOffRetrier(String str, int i, IBackOffRetrierFormulaCallback iBackOffRetrierFormulaCallback) {
        this.retrierName = str;
        this.retryLimit = i;
        this.retryBackOffFormula = iBackOffRetrierFormulaCallback;
    }

    public void backOffAndRetry(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        backOffAndRetry(runnable, null, scheduledExecutorService);
    }
}
