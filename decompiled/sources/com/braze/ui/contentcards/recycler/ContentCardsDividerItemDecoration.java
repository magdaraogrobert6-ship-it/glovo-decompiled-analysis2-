package com.braze.ui.contentcards.recycler;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.ui.R;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import o.getIntrinsicSizeNHjbRc;

/* JADX INFO: loaded from: classes.dex */
public class ContentCardsDividerItemDecoration extends RecyclerView.ItemDecoration {
    private final Context appContext;
    private final int contentCardsItemMaxWidth;
    private final int itemDividerHeight;

    public ContentCardsDividerItemDecoration(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.appContext = applicationContext;
        this.itemDividerHeight = applicationContext.getResources().getDimensionPixelSize(R.dimen.com_braze_content_cards_divider_height);
        this.contentCardsItemMaxWidth = applicationContext.getResources().getDimensionPixelSize(R.dimen.com_braze_content_cards_max_width);
    }

    private final int getSidePaddingValue(int i) {
        int i2 = (i - this.contentCardsItemMaxWidth) / 2;
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        boolean zIsControlCardAtPosition;
        rect.getClass();
        view.getClass();
        recyclerView.getClass();
        getintrinsicsizenhjbrc.getClass();
        super.getItemOffsets(rect, view, recyclerView, getintrinsicsizenhjbrc);
        RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        int absoluteAdapterPosition = childViewHolderInt != null ? childViewHolderInt.getAbsoluteAdapterPosition() : -1;
        if (recyclerView.getAdapter() instanceof ContentCardAdapter) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            adapter.getClass();
            zIsControlCardAtPosition = ((ContentCardAdapter) adapter).isControlCardAtPosition(absoluteAdapterPosition);
        } else {
            zIsControlCardAtPosition = false;
        }
        rect.top = absoluteAdapterPosition == 0 ? this.itemDividerHeight : 0;
        rect.bottom = zIsControlCardAtPosition ? 0 : this.itemDividerHeight;
        int sidePaddingValue = getSidePaddingValue(recyclerView.getWidth());
        rect.left = sidePaddingValue;
        rect.right = sidePaddingValue;
    }
}
