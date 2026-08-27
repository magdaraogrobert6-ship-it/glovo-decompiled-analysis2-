package o;

import android.content.Context;
import android.widget.ArrayAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class registerForActivityResult extends ArrayAdapter {
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    public registerForActivityResult(Context context, int i, int i2, Object[] objArr) {
        super(context, i, i2, objArr);
    }
}
