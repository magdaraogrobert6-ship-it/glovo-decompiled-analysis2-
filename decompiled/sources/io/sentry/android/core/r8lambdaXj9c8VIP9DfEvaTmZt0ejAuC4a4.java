package io.sentry.android.core;

import android.os.Handler;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import java.io.Closeable;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.UriActionExternalSyntheticLambda4;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaea88sc6bNzdkREmuTaOF4vcCHI;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 implements Closeable {
    public static final r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 serializer = new r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
    public volatile r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg IconCompatParcelizer;
    public final io.sentry.util.RemoteActionCompatParcelizer write = new io.sentry.util.RemoteActionCompatParcelizer();
    public final r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ RemoteActionCompatParcelizer = new r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
    public volatile Boolean read = null;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        serializer();
    }

    public final void RemoteActionCompatParcelizer(r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.write.serializer();
        try {
            if (this.IconCompatParcelizer != null) {
                this.IconCompatParcelizer.serializer.remove(r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8);
            }
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void serializer(r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.write.serializer();
        try {
            IconCompatParcelizer(r8lambdaea88sc6bNzdkREmuTaOF4vcCHI.IconCompatParcelizer);
            if (this.IconCompatParcelizer != null) {
                this.IconCompatParcelizer.serializer.add(r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8);
            }
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void RemoteActionCompatParcelizer(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = this.IconCompatParcelizer;
        if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg != null) {
            try {
                ProcessLifecycleOwner.IconCompatParcelizer.RatingCompat.IconCompatParcelizer(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
            } catch (Throwable th) {
                this.IconCompatParcelizer = null;
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th);
            }
        }
    }

    public final void serializer() {
        if (this.IconCompatParcelizer == null) {
            return;
        }
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.write.serializer();
        try {
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = this.IconCompatParcelizer;
            this.IconCompatParcelizer.serializer.clear();
            this.IconCompatParcelizer = null;
            uriActionExternalSyntheticLambda4Serializer.close();
            if (io.sentry.android.core.internal.util.MediaMetadataCompat.read.IconCompatParcelizer()) {
                if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg != null) {
                    ProcessLifecycleOwner.IconCompatParcelizer.RatingCompat.read(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
                }
            } else {
                r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = this.RemoteActionCompatParcelizer;
                ((Handler) r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.write).post(new e$$ExternalSyntheticLambda0(this, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg));
            }
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void IconCompatParcelizer(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        if (this.IconCompatParcelizer != null) {
            return;
        }
        int i = 0;
        try {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.IconCompatParcelizer;
            this.IconCompatParcelizer = new r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(this);
            if (io.sentry.android.core.internal.util.MediaMetadataCompat.read.IconCompatParcelizer()) {
                RemoteActionCompatParcelizer(brazeActionParserExternalSyntheticLambda0);
                return;
            }
            r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = this.RemoteActionCompatParcelizer;
            ((Handler) r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.write).post(new AppState$$ExternalSyntheticLambda0(this, i, brazeActionParserExternalSyntheticLambda0));
        } catch (ClassNotFoundException unused) {
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        } catch (Throwable th) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "AppState could not register lifecycle observer", th);
        }
    }
}
