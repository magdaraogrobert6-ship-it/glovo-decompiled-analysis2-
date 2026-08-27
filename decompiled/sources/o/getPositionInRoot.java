package o;

import androidx.cardview.widget.CardView$1;
import io.reactivex.subjects.BehaviorSubject;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class getPositionInRoot {
    public static final CardView$1 serializer(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        toAndroidDragEvent toandroiddragevent = new toAndroidDragEvent(0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        int iWrite = BehaviorSubject.BehaviorDisposable.write();
        int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
        pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{1, r8lambdaunavo3sxub_pc9xroryotnrlvsm}, BehaviorSubject.BehaviorDisposable.write(), iWrite, -722072991, 722072991, iWrite2);
        return new CardView$1(toandroiddragevent, 5, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public static FileOutputStream RemoteActionCompatParcelizer(FileOutputStream fileOutputStream, FileDescriptor fileDescriptor) {
        if (!internalHeightCallbacklambda0.IconCompatParcelizer().RemoteActionCompatParcelizer().isTracingEnabled()) {
            return fileOutputStream;
        }
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat = io.sentry.util.PlaybackStateCompatCustomAction.serializer ? internalHeightCallbacklambda0.IconCompatParcelizer().MediaMetadataCompat() : internalHeightCallbacklambda0.IconCompatParcelizer().read();
        return new io.sentry.instrumentation.file.serializer(new isContentCardsUnreadVisualIndicatorEnabled(null, r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat != null ? r8lambdareqvhj3p9oule_afn8an0r0tlg0MediaMetadataCompat.IconCompatParcelizer("file.write") : null, fileOutputStream, internalHeightCallbacklambda0.IconCompatParcelizer().RemoteActionCompatParcelizer(), 19), fileDescriptor);
    }

    public static FileOutputStream write(FileOutputStream fileOutputStream, File file) {
        return internalHeightCallbacklambda0.IconCompatParcelizer().RemoteActionCompatParcelizer().isTracingEnabled() ? new io.sentry.instrumentation.file.serializer(io.sentry.instrumentation.file.serializer.IconCompatParcelizer(file, fileOutputStream, false)) : fileOutputStream;
    }

    public static FileOutputStream IconCompatParcelizer(File file, FileOutputStream fileOutputStream, boolean z) {
        return internalHeightCallbacklambda0.IconCompatParcelizer().RemoteActionCompatParcelizer().isTracingEnabled() ? new io.sentry.instrumentation.file.serializer(io.sentry.instrumentation.file.serializer.IconCompatParcelizer(file, fileOutputStream, z)) : fileOutputStream;
    }

    public static FileOutputStream serializer(FileOutputStream fileOutputStream, String str) {
        if (internalHeightCallbacklambda0.IconCompatParcelizer().RemoteActionCompatParcelizer().isTracingEnabled()) {
            return new io.sentry.instrumentation.file.serializer(io.sentry.instrumentation.file.serializer.IconCompatParcelizer(str != null ? new File(str) : null, fileOutputStream, false));
        }
        return fileOutputStream;
    }
}
