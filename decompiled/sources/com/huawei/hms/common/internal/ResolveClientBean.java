package com.huawei.hms.common.internal;

/* JADX INFO: loaded from: classes2.dex */
public class ResolveClientBean {
    private final int a;
    private final AnyClient b;
    private int c;

    public AnyClient getClient() {
        return this.b;
    }

    public int hashCode() {
        return this.a;
    }

    public void clientReconnect() {
        this.b.connect(this.c, true);
    }

    public ResolveClientBean(AnyClient anyClient, int i) {
        this.b = anyClient;
        this.a = Objects.hashCode(anyClient);
        this.c = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ResolveClientBean)) {
            return false;
        }
        return this.b.equals(((ResolveClientBean) obj).b);
    }
}
