package o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class ExecutableQuery implements Executor {
    private static int IconCompatParcelizer = 1;
    public static final ExecutableQuery RemoteActionCompatParcelizer = new ExecutableQuery();
    private static int read = 1;
    private static int serializer;
    private static int write;

    static {
        int i = read + 87;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = 2 % 2;
        int i2 = serializer + 33;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            runnable.getClass();
            runnable.run();
            throw null;
        }
        runnable.getClass();
        runnable.run();
        int i3 = IconCompatParcelizer + 113;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 13 / 0;
        }
    }
}
