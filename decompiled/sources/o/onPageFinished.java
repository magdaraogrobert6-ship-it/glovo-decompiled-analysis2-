package o;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class onPageFinished implements Executor {
    public static final java.util.logging.Logger write = java.util.logging.Logger.getLogger(onPageFinished.class.getName());
    public ArrayDeque IconCompatParcelizer;
    public boolean read;

    public final void serializer() {
        while (true) {
            Runnable runnable = (Runnable) this.IconCompatParcelizer.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                write.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        TextStreamsKt.serializer(runnable, "'task' must not be null.");
        if (!this.read) {
            this.read = true;
            try {
                runnable.run();
                if (this.IconCompatParcelizer != null) {
                    serializer();
                }
                this.read = false;
                return;
            } catch (Throwable th) {
                try {
                    write.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
                    return;
                } finally {
                    if (this.IconCompatParcelizer != null) {
                        serializer();
                    }
                    this.read = false;
                }
            }
        }
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new ArrayDeque(4);
        }
        this.IconCompatParcelizer.add(runnable);
    }
}
