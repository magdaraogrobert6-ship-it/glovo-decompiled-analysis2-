package o;

import com.huawei.hmf.tasks.a.i$d;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class setPrecomputedText implements Runnable {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.navigation.NavArgsLazy write;

    public /* synthetic */ setPrecomputedText(androidx.navigation.NavArgsLazy navArgsLazy, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = navArgsLazy;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.RemoteActionCompatParcelizer;
        androidx.navigation.NavArgsLazy navArgsLazy = this.write;
        if (i == 0) {
            int i2 = 1;
            if (((AtomicBoolean) navArgsLazy.read).getAndSet(true)) {
                return;
            }
            ((androidx.camera.camera2.internal.Camera2CameraImpl) ((i$d) navArgsLazy.RatingCompat).read).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.execute(new setPrecomputedText(navArgsLazy, i2));
            return;
        }
        setTextFuture settextfuture = ((androidx.camera.camera2.internal.Camera2CameraImpl) ((i$d) navArgsLazy.RatingCompat).read)._init_lambda1;
        setTextFuture settextfuture2 = setTextFuture.OPENING;
        i$d i_d = (i$d) navArgsLazy.RatingCompat;
        if (settextfuture == settextfuture2) {
            ((androidx.camera.camera2.internal.Camera2CameraImpl) i_d.read).write("Camera onError timeout, reopen it.");
            ((androidx.camera.camera2.internal.Camera2CameraImpl) ((i$d) navArgsLazy.RatingCompat).read).read(setTextFuture.REOPENING);
            ((androidx.camera.camera2.internal.Camera2CameraImpl) ((i$d) navArgsLazy.RatingCompat).read)._init_lambda3.IconCompatParcelizer();
        } else {
            ((androidx.camera.camera2.internal.Camera2CameraImpl) i_d.read).write("Camera skip reopen at state: " + ((androidx.camera.camera2.internal.Camera2CameraImpl) ((i$d) navArgsLazy.RatingCompat).read)._init_lambda1);
        }
    }
}
