package o;

/* JADX INFO: loaded from: classes.dex */
public final class getPlus0nO6VwU implements getScreen0nO6VwU {
    public final Object write;

    public /* synthetic */ getPlus0nO6VwU(Object obj) {
        this.write = obj;
    }

    @Override // o.getScreen0nO6VwU
    public void IconCompatParcelizer(int i, int i2) {
        ((androidx.recyclerview.widget.RecyclerView.Adapter) this.write).notifyItemRangeRemoved(i, i2);
    }

    @Override // o.getScreen0nO6VwU
    public void IconCompatParcelizer(int i, int i2, Object obj) {
        ((androidx.recyclerview.widget.RecyclerView.Adapter) this.write).notifyItemRangeChanged(i, i2, obj);
    }

    @Override // o.getScreen0nO6VwU
    public void read(int i, int i2) {
        ((androidx.recyclerview.widget.RecyclerView.Adapter) this.write).notifyItemMoved(i, i2);
    }

    @Override // o.getScreen0nO6VwU
    public void write(int i, int i2) {
        ((androidx.recyclerview.widget.RecyclerView.Adapter) this.write).notifyItemRangeInserted(i, i2);
    }
}
