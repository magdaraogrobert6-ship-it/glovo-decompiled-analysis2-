package com.mapbox.navigation.core.routerefresh;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class ExpiringDataRemover$removeExpiringDataFromRoute$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final ExpiringDataRemover$removeExpiringDataFromRoute$1 INSTANCE;
    public static final ExpiringDataRemover$removeExpiringDataFromRoute$1 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExpiringDataRemover$removeExpiringDataFromRoute$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    static {
        int i = 1;
        INSTANCE = new ExpiringDataRemover$removeExpiringDataFromRoute$1(i, 0);
        INSTANCE$1 = new ExpiringDataRemover$removeExpiringDataFromRoute$1(i, i);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        if (this.$r8$classId == 0) {
            return (List) obj;
        }
        String str = (String) obj;
        str.getClass();
        return "\"" + str + '\"';
    }
}
