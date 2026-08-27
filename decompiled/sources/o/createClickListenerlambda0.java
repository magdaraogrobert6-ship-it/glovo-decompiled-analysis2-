package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public final class createClickListenerlambda0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater RemoteActionCompatParcelizer = AtomicIntegerFieldUpdater.newUpdater(createClickListenerlambda0.class, "notCompletedCount$volatile");
    public final getOpeningAnimation[] IconCompatParcelizer;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public createClickListenerlambda0(getOpeningAnimation[] getopeninganimationArr) {
        this.IconCompatParcelizer = getopeninganimationArr;
        this.notCompletedCount$volatile = getopeninganimationArr.length;
    }
}
