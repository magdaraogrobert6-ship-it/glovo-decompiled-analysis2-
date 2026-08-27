package o;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class getExclusion0nO6VwU extends GestureDetector.SimpleOnGestureListener {
    public boolean IconCompatParcelizer = true;
    public final /* synthetic */ androidx.recyclerview.widget.ItemTouchHelper RemoteActionCompatParcelizer;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public getExclusion0nO6VwU(androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper) {
        this.RemoteActionCompatParcelizer = itemTouchHelper;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewFindChildView;
        androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolder;
        androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = this.RemoteActionCompatParcelizer;
        com.braze.ui.contentcards.recycler.SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = itemTouchHelper.serializer;
        if (this.IconCompatParcelizer && (viewFindChildView = itemTouchHelper.findChildView(motionEvent)) != null && (childViewHolder = itemTouchHelper.ComponentActivity.getChildViewHolder(viewFindChildView)) != null && simpleItemTouchHelperCallback.hasDragFlag(itemTouchHelper.ComponentActivity, childViewHolder)) {
            int pointerId = motionEvent.getPointerId(0);
            int i = itemTouchHelper.read;
            if (pointerId == i) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                itemTouchHelper.MediaDescriptionCompat = x;
                itemTouchHelper.RatingCompat = y;
                itemTouchHelper.MediaSessionCompatQueueItem = 0.0f;
                itemTouchHelper.MediaBrowserCompatMediaItem = 0.0f;
                if (simpleItemTouchHelperCallback.isLongPressDragEnabled()) {
                    itemTouchHelper.IconCompatParcelizer(childViewHolder, 2);
                }
            }
        }
    }
}
