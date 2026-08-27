package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;
import o.r8lambdahiM_4JAoe8VoNLZ8t21EAnaoFaA;
import o.r8lambdao4kSgm5gyXEmbXvxhWe2242W7QI;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable, AutoCloseable {
    public static final r8lambdao4kSgm5gyXEmbXvxhWe2242W7QI write = new r8lambdao4kSgm5gyXEmbXvxhWe2242W7QI(CoroutineDispatcher.read, new r8lambdahiM_4JAoe8VoNLZ8t21EAnaoFaA(4));

    public abstract Executor getExecutor();
}
