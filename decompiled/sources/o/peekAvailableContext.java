package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public class peekAvailableContext extends ListView {
    public final int RemoteActionCompatParcelizer;
    public final int write;

    public peekAvailableContext(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, onUserLeaveHint.RecycleListView);
        this.write = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
