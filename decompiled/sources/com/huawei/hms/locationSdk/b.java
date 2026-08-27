package com.huawei.hms.locationSdk;

import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.TaskApiCall;
import o.ViewLayerCompanionOutlineProvider1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<ClientT extends AnyClient, ResultT> extends TaskApiCall<ClientT, ResultT> {
    public final String a;
    protected boolean b;
    protected ViewLayerCompanionOutlineProvider1 c;

    public boolean a(int i) {
        return i >= 8 && ((i >> 3) & 1) == 1;
    }

    public b(String str, String str2, String str3) {
        super(str, str2);
        this.a = str3;
    }

    public b(String str, String str2, String str3, String str4) {
        super(str, str2, str4);
        this.a = str3;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public void a(ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1) {
        this.c = viewLayerCompanionOutlineProvider1;
    }
}
