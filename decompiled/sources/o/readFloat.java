package o;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
final class readFloat implements Runnable {
    final /* synthetic */ CountDownLatch read;
    final /* synthetic */ containsandroid_sdk_base_release serializer;

    @Override // java.lang.Runnable
    public final void run() {
        containsandroid_sdk_base_release containsandroid_sdk_base_releaseVar = this.serializer;
        containsandroid_sdk_base_releaseVar.read();
        containsandroid_sdk_base_releaseVar.write();
        this.read.countDown();
    }

    public readFloat(readList readlist, containsandroid_sdk_base_release containsandroid_sdk_base_releaseVar, CountDownLatch countDownLatch) {
        this.serializer = containsandroid_sdk_base_releaseVar;
        this.read = countDownLatch;
    }
}
