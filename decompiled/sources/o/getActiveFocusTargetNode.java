package o;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class getActiveFocusTargetNode {
    public static int RemoteActionCompatParcelizer(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static FileInputStream serializer(FileInputStream fileInputStream, FileDescriptor fileDescriptor) {
        if (!internalHeightCallbacklambda0.IconCompatParcelizer().RemoteActionCompatParcelizer().isTracingEnabled()) {
            return fileInputStream;
        }
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat = io.sentry.util.PlaybackStateCompatCustomAction.serializer ? internalHeightCallbacklambda0.IconCompatParcelizer().MediaMetadataCompat() : internalHeightCallbacklambda0.IconCompatParcelizer().read();
        return new io.sentry.instrumentation.file.write(new isContentCardsUnreadVisualIndicatorEnabled(null, r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat != null ? r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat.IconCompatParcelizer("file.read") : null, fileInputStream, internalHeightCallbacklambda0.IconCompatParcelizer().RemoteActionCompatParcelizer(), 18), fileDescriptor);
    }

    public static FileInputStream write(File file, FileInputStream fileInputStream) {
        return internalHeightCallbacklambda0.IconCompatParcelizer().RemoteActionCompatParcelizer().isTracingEnabled() ? new io.sentry.instrumentation.file.write(io.sentry.instrumentation.file.write.write(file, fileInputStream)) : fileInputStream;
    }

    public static FileInputStream RemoteActionCompatParcelizer(FileInputStream fileInputStream, String str) {
        if (internalHeightCallbacklambda0.IconCompatParcelizer().RemoteActionCompatParcelizer().isTracingEnabled()) {
            return new io.sentry.instrumentation.file.write(io.sentry.instrumentation.file.write.write(str != null ? new File(str) : null, fileInputStream));
        }
        return fileInputStream;
    }
}
