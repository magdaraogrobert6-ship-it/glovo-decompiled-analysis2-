package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o.isActive;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ViewOffsetBehavior extends CoordinatorLayout.Behavior {
    public isActive MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken = 0;

    public void write(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.RemoteActionCompatParcelizer(i, view);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        write(coordinatorLayout, view, i);
        if (this.MediaSessionCompatResultReceiverWrapper == null) {
            this.MediaSessionCompatResultReceiverWrapper = new isActive(view);
        }
        isActive isactive = this.MediaSessionCompatResultReceiverWrapper;
        View view2 = (View) isactive.RemoteActionCompatParcelizer;
        isactive.write = view2.getTop();
        isactive.serializer = view2.getLeft();
        this.MediaSessionCompatResultReceiverWrapper.serializer();
        int i2 = this.MediaSessionCompatToken;
        if (i2 == 0) {
            return true;
        }
        isActive isactive2 = this.MediaSessionCompatResultReceiverWrapper;
        if (isactive2.read != i2) {
            isactive2.read = i2;
            isactive2.serializer();
        }
        this.MediaSessionCompatToken = 0;
        return true;
    }

    public ViewOffsetBehavior() {
    }

    public final int serializer() {
        isActive isactive = this.MediaSessionCompatResultReceiverWrapper;
        if (isactive != null) {
            return isactive.read;
        }
        return 0;
    }

    public ViewOffsetBehavior(int i) {
    }
}
