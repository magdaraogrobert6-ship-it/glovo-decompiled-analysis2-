package fwfd.com.fwfsdk.util;

/* JADX INFO: loaded from: classes5.dex */
public interface FWFResultCallback<T> {
    void onError(String str);

    void onResponse(T t);
}
