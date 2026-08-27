package com.huawei.hms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.DrawableTransformation;

/* JADX INFO: loaded from: classes4.dex */
public class HMSCursorWrapper extends CursorWrapper implements CrossProcessCursor {
    private AbstractWindowedCursor a;

    @Override // android.database.CursorWrapper
    public Cursor getWrappedCursor() {
        return this.a;
    }

    @Override // android.database.CrossProcessCursor
    public void fillWindow(int i, CursorWindow cursorWindow) {
        this.a.fillWindow(i, cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    public CursorWindow getWindow() {
        return this.a.getWindow();
    }

    @Override // android.database.CrossProcessCursor
    public boolean onMove(int i, int i2) {
        return this.a.onMove(i, i2);
    }

    public void setWindow(CursorWindow cursorWindow) {
        this.a.setWindow(cursorWindow);
    }

    public HMSCursorWrapper(Cursor cursor) {
        super(cursor);
        if (cursor == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("cursor cannot be null");
            throw null;
        }
        if (!(cursor instanceof CursorWrapper)) {
            DrawableTransformation.IconCompatParcelizer("cursor:", cursor, " is not a subclass for CursorWrapper");
            throw null;
        }
        Cursor wrappedCursor = ((CursorWrapper) cursor).getWrappedCursor();
        if (wrappedCursor == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("getWrappedCursor cannot be null");
            throw null;
        }
        if (wrappedCursor instanceof AbstractWindowedCursor) {
            this.a = (AbstractWindowedCursor) wrappedCursor;
        } else {
            DrawableTransformation.IconCompatParcelizer("getWrappedCursor:", wrappedCursor, " is not a subclass for CursorWrapper");
            throw null;
        }
    }
}
