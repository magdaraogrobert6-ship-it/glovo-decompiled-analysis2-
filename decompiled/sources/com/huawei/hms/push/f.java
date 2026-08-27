package com.huawei.hms.push;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class f extends Handler {
    private WeakReference<a> a;

    public interface a {
        void a(Message message);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        a aVar = this.a.get();
        if (aVar != null) {
            aVar.a(message);
        }
    }

    public f(a aVar) {
        this.a = new WeakReference<>(aVar);
    }
}
