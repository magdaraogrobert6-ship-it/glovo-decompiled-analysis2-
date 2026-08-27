package io.sentry.android.core.performance;

import android.os.Looper;
import io.sentry.android.core.internal.util.MediaMetadataCompat;
import o.ContainerStepgetChildStepIteratorinlinediterator2;
import o.createBannerWebViewClientListenerandroid_sdk_ui_release;
import o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0;

/* JADX INFO: loaded from: classes4.dex */
public final class IconCompatParcelizer {
    public final String RemoteActionCompatParcelizer;
    public createBannerWebViewClientListenerandroid_sdk_ui_release read = null;
    public createBannerWebViewClientListenerandroid_sdk_ui_release write = null;
    public r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 serializer = null;
    public r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 IconCompatParcelizer = null;

    public static r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 write(r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0, String str, createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release) {
        r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg1 = r8lambdareqvhj3p9oule_afn8an0r0tlg0.read("activity.load", str, createbannerwebviewclientlistenerandroid_sdk_ui_release, ContainerStepgetChildStepIteratorinlinediterator2.SENTRY);
        r8lambdareqvhj3p9oule_afn8an0r0tlg1.read(Long.valueOf(MediaMetadataCompat.serializer(Looper.getMainLooper().getThread())), "thread.id");
        r8lambdareqvhj3p9oule_afn8an0r0tlg1.read("main", "thread.name");
        Boolean bool = Boolean.TRUE;
        r8lambdareqvhj3p9oule_afn8an0r0tlg1.read(bool, "ui.contributes_to_ttid");
        r8lambdareqvhj3p9oule_afn8an0r0tlg1.read(bool, "ui.contributes_to_ttfd");
        return r8lambdareqvhj3p9oule_afn8an0r0tlg1;
    }

    public IconCompatParcelizer(String str) {
        this.RemoteActionCompatParcelizer = str;
    }
}
