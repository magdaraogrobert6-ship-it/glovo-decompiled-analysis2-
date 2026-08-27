package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import io.sentry.android.core.SentryLogcatAdapter;
import o.getIntrinsicSizeNHjbRc;

/* JADX INFO: loaded from: classes.dex */
public abstract class DividerItemDecoration extends RecyclerView.ItemDecoration {
    public static final int[] serializer = {R.attr.listDivider};
    public final Rect RemoteActionCompatParcelizer = new Rect();
    public final int read;
    public Drawable write;

    public final void write(Drawable drawable) {
        this.write = drawable;
    }

    public DividerItemDecoration(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(serializer);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.write = drawable;
        if (drawable == null) {
            SentryLogcatAdapter.IconCompatParcelizer("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        this.read = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null || this.write == null) {
            return;
        }
        int i = this.read;
        Rect rect = this.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (i == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i2 < childCount) {
                View childAt = recyclerView.getChildAt(i2);
                RecyclerView.getDecoratedBoundsWithMarginsInt(childAt, rect);
                int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.write.setBounds(paddingLeft, iRound - this.write.getIntrinsicHeight(), width, iRound);
                this.write.draw(canvas);
                i2++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i2 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i2);
            recyclerView.getLayoutManager().IconCompatParcelizer(childAt2, rect);
            int iRound2 = Math.round(childAt2.getTranslationX()) + rect.right;
            this.write.setBounds(iRound2 - this.write.getIntrinsicWidth(), paddingTop, iRound2, height);
            this.write.draw(canvas);
            i2++;
        }
        canvas.restore();
    }
}
