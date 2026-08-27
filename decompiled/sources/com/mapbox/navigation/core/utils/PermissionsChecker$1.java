package com.mapbox.navigation.core.utils;

import android.os.Build;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes5.dex */
public final class PermissionsChecker$1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final PermissionsChecker$1 INSTANCE = new PermissionsChecker$1(0);

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        return Integer.valueOf(Build.VERSION.SDK_INT);
    }

    public PermissionsChecker$1(int i) {
        super(i);
    }
}
