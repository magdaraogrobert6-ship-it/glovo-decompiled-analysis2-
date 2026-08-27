package app.cash.sqldelight.driver.android;

import android.database.AbstractWindowedCursor;
import android.database.CursorWindow;

/* JADX INFO: loaded from: classes.dex */
final class Api28Impl {
    public static final Api28Impl INSTANCE = new Api28Impl();

    private Api28Impl() {
    }

    public static final void setWindowSize(AbstractWindowedCursor abstractWindowedCursor, long j) {
        abstractWindowedCursor.getClass();
        abstractWindowedCursor.setWindow(new CursorWindow(null, j));
    }
}
