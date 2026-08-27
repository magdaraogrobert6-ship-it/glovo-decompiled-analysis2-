package com.mapbox.navigation.utils.internal;

import kotlinx.coroutines.internal.ContextScope;
import o.onBackInvokedlambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class JobControl {
    public final onBackInvokedlambda0 job;
    public final ContextScope scope;

    public final int hashCode() {
        return this.scope.hashCode() + (this.job.hashCode() * 31);
    }

    public JobControl(onBackInvokedlambda0 onbackinvokedlambda0, ContextScope contextScope) {
        this.job = onbackinvokedlambda0;
        this.scope = contextScope;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobControl)) {
            return false;
        }
        JobControl jobControl = (JobControl) obj;
        return this.job == jobControl.job && this.scope == jobControl.scope;
    }

    public final String toString() {
        return "JobControl(job=" + this.job + ", scope=" + this.scope + ')';
    }
}
