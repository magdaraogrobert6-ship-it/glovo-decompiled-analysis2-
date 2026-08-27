package o;

import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class getHardlight0nO6VwU implements BlendModeColorFilterHelperExternalSyntheticApiModelOutline1 {
    public final /* synthetic */ androidx.recyclerview.widget.ItemTouchHelper IconCompatParcelizer;

    @Override // o.BlendModeColorFilterHelperExternalSyntheticApiModelOutline1
    public final void serializer(MotionEvent motionEvent) {
        androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = this.IconCompatParcelizer;
        getDstIn0nO6VwU getdstin0no6vwu = itemTouchHelper.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        itemTouchHelper.MediaMetadataCompat.onTouchEvent(motionEvent);
        android.view.VelocityTracker velocityTracker = itemTouchHelper.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (itemTouchHelper.read == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(itemTouchHelper.read);
        if (iFindPointerIndex >= 0) {
            itemTouchHelper.RemoteActionCompatParcelizer(actionMasked, iFindPointerIndex, motionEvent);
        }
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = itemTouchHelper.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (viewHolder == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    itemTouchHelper.write(itemTouchHelper.ResultReceiver, iFindPointerIndex, motionEvent);
                    itemTouchHelper.serializer(viewHolder);
                    itemTouchHelper.ComponentActivity.removeCallbacks(getdstin0no6vwu);
                    getdstin0no6vwu.run();
                    itemTouchHelper.ComponentActivity.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == itemTouchHelper.read) {
                    itemTouchHelper.read = motionEvent.getPointerId(actionIndex != 0 ? 0 : 1);
                    itemTouchHelper.write(itemTouchHelper.ResultReceiver, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            android.view.VelocityTracker velocityTracker2 = itemTouchHelper.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        itemTouchHelper.IconCompatParcelizer(null, 0);
        itemTouchHelper.read = -1;
    }

    @Override // o.BlendModeColorFilterHelperExternalSyntheticApiModelOutline1
    public final boolean write(MotionEvent motionEvent) {
        int iFindPointerIndex;
        androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = this.IconCompatParcelizer;
        itemTouchHelper.MediaMetadataCompat.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        getDstOut0nO6VwU getdstout0no6vwu = null;
        if (actionMasked == 0) {
            itemTouchHelper.read = motionEvent.getPointerId(0);
            itemTouchHelper.MediaDescriptionCompat = motionEvent.getX();
            itemTouchHelper.RatingCompat = motionEvent.getY();
            android.view.VelocityTracker velocityTracker = itemTouchHelper.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            itemTouchHelper.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = android.view.VelocityTracker.obtain();
            if (itemTouchHelper.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null) {
                ArrayList arrayList = itemTouchHelper.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                if (!arrayList.isEmpty()) {
                    View viewFindChildView = itemTouchHelper.findChildView(motionEvent);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        getDstOut0nO6VwU getdstout0no6vwu2 = (getDstOut0nO6VwU) arrayList.get(size);
                        if (getdstout0no6vwu2.PlaybackStateCompat.MediaSessionCompatQueueItem == viewFindChildView) {
                            getdstout0no6vwu = getdstout0no6vwu2;
                            break;
                        }
                    }
                }
                if (getdstout0no6vwu != null) {
                    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = getdstout0no6vwu.PlaybackStateCompat;
                    itemTouchHelper.MediaDescriptionCompat -= getdstout0no6vwu.MediaSessionCompatResultReceiverWrapper;
                    itemTouchHelper.RatingCompat -= getdstout0no6vwu.MediaSessionCompatToken;
                    itemTouchHelper.read(viewHolder, true);
                    if (itemTouchHelper.MediaSessionCompatToken.remove(viewHolder.MediaSessionCompatQueueItem)) {
                        itemTouchHelper.serializer.clearView(itemTouchHelper.ComponentActivity, viewHolder);
                    }
                    itemTouchHelper.IconCompatParcelizer(viewHolder, getdstout0no6vwu.read);
                    itemTouchHelper.write(itemTouchHelper.ResultReceiver, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            itemTouchHelper.read = -1;
            itemTouchHelper.IconCompatParcelizer(null, 0);
        } else {
            int i = itemTouchHelper.read;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                itemTouchHelper.RemoteActionCompatParcelizer(actionMasked, iFindPointerIndex, motionEvent);
            }
        }
        android.view.VelocityTracker velocityTracker2 = itemTouchHelper.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return itemTouchHelper.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null;
    }

    public getHardlight0nO6VwU(androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper) {
        this.IconCompatParcelizer = itemTouchHelper;
    }

    @Override // o.BlendModeColorFilterHelperExternalSyntheticApiModelOutline1
    public final void RemoteActionCompatParcelizer(boolean z) {
        if (z) {
            this.IconCompatParcelizer.IconCompatParcelizer(null, 0);
        }
    }
}
