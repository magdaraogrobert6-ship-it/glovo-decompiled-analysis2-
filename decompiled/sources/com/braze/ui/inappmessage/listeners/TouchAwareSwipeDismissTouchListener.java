package com.braze.ui.inappmessage.listeners;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class TouchAwareSwipeDismissTouchListener extends SwipeDismissTouchListener {
    private ITouchListener touchListener;

    public interface ITouchListener {
        void onTouchEnded();

        void onTouchStartedOrContinued();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TouchAwareSwipeDismissTouchListener(View view, SwipeDismissTouchListener.DismissCallbacks dismissCallbacks, SwipeDismissTouchListener.VerticalDismissDirection verticalDismissDirection) {
        this(view, null, dismissCallbacks, verticalDismissDirection);
        view.getClass();
        verticalDismissDirection.getClass();
    }

    @Override // com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        ITouchListener iTouchListener;
        view.getClass();
        motionEvent.getClass();
        int action = motionEvent.getAction();
        if (action == 0) {
            ITouchListener iTouchListener2 = this.touchListener;
            if (iTouchListener2 != null) {
                iTouchListener2.onTouchStartedOrContinued();
            }
        } else if ((action == 1 || action == 3) && (iTouchListener = this.touchListener) != null) {
            iTouchListener.onTouchEnded();
        }
        return super.onTouch(view, motionEvent);
    }

    public final void setTouchListener(ITouchListener iTouchListener) {
        iTouchListener.getClass();
        this.touchListener = iTouchListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TouchAwareSwipeDismissTouchListener(View view, Object obj, SwipeDismissTouchListener.DismissCallbacks dismissCallbacks) {
        this(view, obj, dismissCallbacks, SwipeDismissTouchListener.VerticalDismissDirection.NONE);
        view.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TouchAwareSwipeDismissTouchListener(View view, SwipeDismissTouchListener.DismissCallbacks dismissCallbacks) {
        this(view, null, dismissCallbacks, SwipeDismissTouchListener.VerticalDismissDirection.NONE);
        view.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchAwareSwipeDismissTouchListener(View view, Object obj, SwipeDismissTouchListener.DismissCallbacks dismissCallbacks, SwipeDismissTouchListener.VerticalDismissDirection verticalDismissDirection) {
        super(view, obj, dismissCallbacks, verticalDismissDirection);
        view.getClass();
        verticalDismissDirection.getClass();
    }
}
