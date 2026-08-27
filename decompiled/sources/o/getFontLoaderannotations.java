package o;

import io.sentry.HostnameCache$$ExternalSyntheticLambda1;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class getFontLoaderannotations implements Runnable {
    public final /* synthetic */ r8lambdaYT7KkhvXyPX5qC1jtJtr5iFnrzo RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.lifecycle.BlockRunner read;
    public final /* synthetic */ int write;

    public /* synthetic */ getFontLoaderannotations(androidx.lifecycle.BlockRunner blockRunner, r8lambdaYT7KkhvXyPX5qC1jtJtr5iFnrzo r8lambdayt7kkhvxypx5qc1jtjtr5ifnrzo, int i) {
        this.write = i;
        this.read = blockRunner;
        this.RemoteActionCompatParcelizer = r8lambdayt7kkhvxypx5qc1jtjtr5ifnrzo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.write;
        r8lambdaYT7KkhvXyPX5qC1jtJtr5iFnrzo r8lambdayt7kkhvxypx5qc1jtjtr5ifnrzo = this.RemoteActionCompatParcelizer;
        androidx.lifecycle.BlockRunner blockRunner = this.read;
        if (i == 0) {
            blockRunner.read(r8lambdayt7kkhvxypx5qc1jtjtr5ifnrzo);
            return;
        }
        if (i == 1) {
            onEndApplyChanges.read("GrpcCallProvider", "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
            if (((com.huawei.wisesecurity.ucs_credential.x) blockRunner.write) != null) {
                onEndApplyChanges.read("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
                ((com.huawei.wisesecurity.ucs_credential.x) blockRunner.write).cancel();
                blockRunner.write = null;
            }
            ((getTextInputService) blockRunner.serializer).RemoteActionCompatParcelizer(new getFontLoaderannotations(blockRunner, r8lambdayt7kkhvxypx5qc1jtjtr5ifnrzo, 4));
            return;
        }
        int i2 = 3;
        if (i == 2) {
            ((getTextInputService) blockRunner.serializer).RemoteActionCompatParcelizer(new getFontLoaderannotations(blockRunner, r8lambdayt7kkhvxypx5qc1jtjtr5ifnrzo, i2));
        } else if (i == 3) {
            blockRunner.read(r8lambdayt7kkhvxypx5qc1jtjtr5ifnrzo);
        } else {
            r8lambdayt7kkhvxypx5qc1jtjtr5ifnrzo.RemoteActionCompatParcelizer();
            blockRunner.read = LazyKt__LazyJVMKt.write(onLayoutNodeDeactivated.serializer, new HostnameCache$$ExternalSyntheticLambda1(i2, blockRunner));
        }
    }
}
