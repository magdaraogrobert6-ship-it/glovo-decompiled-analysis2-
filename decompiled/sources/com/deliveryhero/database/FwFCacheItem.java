package com.deliveryhero.database;

import java.util.Arrays;
import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFCacheItem {
    private final String key;
    private final byte[] structure;

    public final String component1() {
        return this.key;
    }

    public final byte[] component2() {
        return this.structure;
    }

    public final String getKey() {
        return this.key;
    }

    public final byte[] getStructure() {
        return this.structure;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode();
        byte[] bArr = this.structure;
        return (iHashCode * 31) + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    public String toString() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("FwFCacheItem(key=", this.key, ", structure=", Arrays.toString(this.structure), ")");
    }

    public FwFCacheItem(String str, byte[] bArr) {
        str.getClass();
        this.key = str;
        this.structure = bArr;
    }

    public static /* synthetic */ FwFCacheItem copy$default(FwFCacheItem fwFCacheItem, String str, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fwFCacheItem.key;
        }
        if ((i & 2) != 0) {
            bArr = fwFCacheItem.structure;
        }
        return fwFCacheItem.copy(str, bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FwFCacheItem)) {
            return false;
        }
        FwFCacheItem fwFCacheItem = (FwFCacheItem) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key, fwFCacheItem.key}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.structure, fwFCacheItem.structure}, getCieXyz.write())).booleanValue();
    }

    public final FwFCacheItem copy(String str, byte[] bArr) {
        str.getClass();
        return new FwFCacheItem(str, bArr);
    }
}
