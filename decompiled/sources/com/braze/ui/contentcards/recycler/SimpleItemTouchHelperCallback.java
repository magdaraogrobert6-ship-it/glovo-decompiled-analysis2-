package com.braze.ui.contentcards.recycler;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class SimpleItemTouchHelperCallback extends ItemTouchHelper.Callback {
    private final ItemTouchHelperAdapter adapter;

    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    public boolean isLongPressDragEnabled() {
        return false;
    }

    public SimpleItemTouchHelperCallback(ItemTouchHelperAdapter itemTouchHelperAdapter) {
        itemTouchHelperAdapter.getClass();
        this.adapter = itemTouchHelperAdapter;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        recyclerView.getClass();
        viewHolder.getClass();
        return ItemTouchHelper.Callback.makeMovementFlags(0, this.adapter.isItemDismissable(viewHolder.getBindingAdapterPosition()) ? 16 : 0);
    }

    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        recyclerView.getClass();
        viewHolder.getClass();
        viewHolder2.getClass();
        return false;
    }

    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
        this.adapter.onItemDismiss(viewHolder.getBindingAdapterPosition());
    }
}
