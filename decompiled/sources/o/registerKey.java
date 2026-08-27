package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public final class registerKey extends ListView implements handleMessage, onCreateSupportNavigateUpTaskStack, AdapterView.OnItemClickListener {
    public static final int[] serializer = {android.R.attr.background, android.R.attr.divider};
    public AlertControllerButtonHandler write;

    public int getWindowAnimations() {
        return 0;
    }

    @Override // o.onCreateSupportNavigateUpTaskStack
    public final void write(AlertControllerButtonHandler alertControllerButtonHandler) {
        this.write = alertControllerButtonHandler;
    }

    public registerKey(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        androidx.emoji2.text.EmojiProcessor emojiProcessorRemoteActionCompatParcelizer = androidx.emoji2.text.EmojiProcessor.RemoteActionCompatParcelizer(context, attributeSet, serializer, android.R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) emojiProcessorRemoteActionCompatParcelizer.read;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(emojiProcessorRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(emojiProcessorRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(1));
        }
        emojiProcessorRemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        serializer((Keep) getAdapter().getItem(i));
    }

    @Override // o.handleMessage
    public final boolean serializer(Keep keep) {
        return this.write.RemoteActionCompatParcelizer(keep, null, 0);
    }
}
