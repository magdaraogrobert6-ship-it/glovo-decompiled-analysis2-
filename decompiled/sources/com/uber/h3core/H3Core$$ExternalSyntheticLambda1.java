package com.uber.h3core;

import android.location.Location;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class H3Core$$ExternalSyntheticLambda1 implements ToLongFunction {
    public final /* synthetic */ int $r8$classId;

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        int i = this.$r8$classId;
        if (i != 0) {
            return i != 1 ? ((Integer) obj).longValue() : ((Location) obj).getTime();
        }
        return ((Long) obj).longValue();
    }
}
