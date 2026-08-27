package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class getCustomSelectionActionModeCallback extends setHasNonEmbeddedTabs {
    public onLayout MediaSessionCompatToken;
    public Keep PlaybackStateCompat;
    public final int PlaybackStateCompatCustomAction;
    public final int ResultReceiver;

    public void setHoverListener(onLayout onlayout) {
        this.MediaSessionCompatToken = onlayout;
    }

    @Override // o.setHasNonEmbeddedTabs, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }

    public getCustomSelectionActionModeCallback(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.PlaybackStateCompatCustomAction = 21;
            this.ResultReceiver = 22;
        } else {
            this.PlaybackStateCompatCustomAction = 22;
            this.ResultReceiver = 21;
        }
    }

    @Override // o.setHasNonEmbeddedTabs, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        onRestoreInstanceState onrestoreinstancestate;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.MediaSessionCompatToken != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                onrestoreinstancestate = (onRestoreInstanceState) headerViewListAdapter.getWrappedAdapter();
            } else {
                onrestoreinstancestate = (onRestoreInstanceState) adapter;
                headersCount = 0;
            }
            Keep keepWrite = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= onrestoreinstancestate.getCount()) ? null : onrestoreinstancestate.getItem(i);
            Keep keep = this.PlaybackStateCompat;
            if (keep != keepWrite) {
                AlertControllerButtonHandler alertControllerButtonHandler = onrestoreinstancestate.RemoteActionCompatParcelizer;
                if (keep != null) {
                    this.MediaSessionCompatToken.IconCompatParcelizer(alertControllerButtonHandler, keep);
                }
                this.PlaybackStateCompat = keepWrite;
                if (keepWrite != null) {
                    this.MediaSessionCompatToken.RemoteActionCompatParcelizer(alertControllerButtonHandler, keepWrite);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        onLaunch onlaunch = (onLaunch) getSelectedView();
        if (onlaunch != null && i == this.PlaybackStateCompatCustomAction) {
            if (onlaunch.isEnabled() && onlaunch.getItemData().hasSubMenu()) {
                performItemClick(onlaunch, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (onlaunch == null || i != this.ResultReceiver) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (onRestoreInstanceState) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (onRestoreInstanceState) adapter).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(false);
        return true;
    }
}
