package com.deliveryhero.fwf_cache;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface ICache {
    void delete(String str);

    byte[] get(String str);

    Map<String, byte[]> getAll(Set<String> set);

    void set(String str, byte[] bArr);

    void setAll(Map<String, byte[]> map);
}
