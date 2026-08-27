package o;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaXjeS_gq8hmJyKRkNmQwAUeFh2g implements ThreadFactory {
    public final /* synthetic */ int IconCompatParcelizer;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw r8lambdapcnaonpvjdeefm8z29s1izamzcw = new r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw(runnable);
            r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.serializer = r8lambdapcnaonpvjdeefm8z29s1izamzcw;
            r8lambdapcnaonpvjdeefm8z29s1izamzcw.setName("EventThread");
            r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.serializer.setDaemon(Thread.currentThread().isDaemon());
            return r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.serializer;
        }
        if (i == 1) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
        if (i == 2) {
            return new findFocusTargetNode(runnable);
        }
        Thread thread2 = new Thread(runnable, "engine.io-client.heartbeat-" + getCustomContentCardsViewBindingHandler.read.getAndIncrement());
        thread2.setDaemon(true);
        return thread2;
    }
}
