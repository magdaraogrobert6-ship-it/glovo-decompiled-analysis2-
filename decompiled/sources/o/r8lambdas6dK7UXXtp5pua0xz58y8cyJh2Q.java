package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdas6dK7UXXtp5pua0xz58y8cyJh2Q extends _set_shouldNextUnregisterBeSkipped_lambda0 {
    public final Runnable RemoteActionCompatParcelizer;

    @Override // java.lang.Runnable
    public final void run() {
        this.RemoteActionCompatParcelizer.run();
    }

    public r8lambdas6dK7UXXtp5pua0xz58y8cyJh2Q(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.RemoteActionCompatParcelizer = runnable;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.RemoteActionCompatParcelizer;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(RegexKt.IconCompatParcelizer(runnable));
        sb.append(", ");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", ");
        if (this.PlaybackStateCompat) {
            str = "Blocking";
        } else {
            str = "Non-blocking";
        }
        return ff$$ExternalSyntheticOutline0.m(sb, str, ']');
    }
}
