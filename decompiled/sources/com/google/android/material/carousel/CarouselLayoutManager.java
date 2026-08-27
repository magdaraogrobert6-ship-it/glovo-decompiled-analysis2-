package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.ui.common.widget.VerticalDividerItemDecoration;
import o.BlockGraphicsLayerElement;
import o.Remeasurement;
import o.RemeasurementModifier;
import o.applyToPq9zytI;
import o.getIntrinsicSizeNHjbRc;

/* JADX INFO: loaded from: classes2.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager implements applyToPq9zytI {
    public Remeasurement IconCompatParcelizer;
    public int write;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int IconCompatParcelizer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return this.write;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean MediaBrowserCompatMediaItem() {
        return !RemoteActionCompatParcelizer();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int MediaDescriptionCompat(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        throw null;
    }

    @Override // o.applyToPq9zytI
    public final PointF MediaMetadataCompat(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int MediaSessionCompatQueueItem(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void RatingCompat(int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean RatingCompat() {
        return RemoteActionCompatParcelizer();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int read(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int serializer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int write(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return this.write;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void IconCompatParcelizer(RecyclerView recyclerView, int i) {
        RemeasurementModifier remeasurementModifier = new RemeasurementModifier(this, recyclerView.getContext());
        remeasurementModifier.MediaSessionCompatResultReceiverWrapper = i;
        write(remeasurementModifier);
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final BlockGraphicsLayerElement IconCompatParcelizer() {
        return new BlockGraphicsLayerElement(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void IconCompatParcelizer(View view, Rect rect) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        rect.centerX();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void read(AccessibilityEvent accessibilityEvent) {
        super.read(accessibilityEvent);
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() > 0) {
            accessibilityEvent.setFromIndex(RecyclerView.LayoutManager.RemoteActionCompatParcelizer(MediaSessionCompatResultReceiverWrapper(0)));
            accessibilityEvent.setToIndex(RecyclerView.LayoutManager.RemoteActionCompatParcelizer(MediaSessionCompatResultReceiverWrapper(r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() - 1)));
        }
    }

    @SuppressLint
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new VerticalDividerItemDecoration();
        write(RecyclerView.LayoutManager.read(context, attributeSet, i, i2).IconCompatParcelizer);
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void read(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (getintrinsicsizenhjbrc.serializer() <= 0) {
            write(recycler);
            return;
        }
        serializer();
        View view = recycler.tryGetViewHolderForPositionByDeadline(0, Long.MAX_VALUE).MediaSessionCompatQueueItem;
        ScreenStartObserver$$ExternalSyntheticLambda0.write("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final boolean serializer() {
        return RemoteActionCompatParcelizer() && this.ensureViewModelStore.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int RemoteActionCompatParcelizer(int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (!MediaBrowserCompatMediaItem()) {
            return 0;
        }
        read(i, recycler, getintrinsicsizenhjbrc);
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int serializer(int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (!RemoteActionCompatParcelizer()) {
            return 0;
        }
        read(i, recycler, getintrinsicsizenhjbrc);
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void RemoteActionCompatParcelizer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0) {
            return;
        }
        RecyclerView.LayoutManager.RemoteActionCompatParcelizer(MediaSessionCompatResultReceiverWrapper(0));
    }

    public final void write(int i) {
        Remeasurement remeasurement;
        if (i != 0 && i != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "invalid orientation:"));
            return;
        }
        read((String) null);
        Remeasurement remeasurement2 = this.IconCompatParcelizer;
        if (remeasurement2 == null || i != remeasurement2.RemoteActionCompatParcelizer) {
            if (i == 0) {
                remeasurement = new Remeasurement(this, 1);
            } else if (i == 1) {
                remeasurement = new Remeasurement(this, 0);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("invalid orientation");
                return;
            }
            this.IconCompatParcelizer = remeasurement;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        }
    }

    public final int read(int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0 || i == 0) {
            return 0;
        }
        int i2 = this.write;
        int i3 = i2 + i;
        if (i3 < 0 || i3 > 0) {
            i = 0 - i2;
        }
        this.write = i2 + i;
        serializer();
        throw null;
    }

    public CarouselLayoutManager() {
        new VerticalDividerItemDecoration();
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        write(0);
    }
}
