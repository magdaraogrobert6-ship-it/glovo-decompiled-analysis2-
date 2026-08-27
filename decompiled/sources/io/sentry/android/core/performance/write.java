package io.sentry.android.core.performance;

import android.view.Window;
import androidx.work.impl.Schedulers$$ExternalSyntheticLambda1;
import io.sentry.android.core.internal.gestures.RatingCompat;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class write extends RatingCompat {
    public final Schedulers$$ExternalSyntheticLambda1 write;

    public write(Window.Callback callback, Schedulers$$ExternalSyntheticLambda1 schedulers$$ExternalSyntheticLambda1) {
        super(callback);
        this.write = schedulers$$ExternalSyntheticLambda1;
    }

    @Override // io.sentry.android.core.internal.gestures.RatingCompat, android.view.Window.Callback
    public final void onContentChanged() throws JSONException {
        super.onContentChanged();
        this.write.run();
    }
}
