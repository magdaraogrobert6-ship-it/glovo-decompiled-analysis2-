package o;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class onPreFlingQWom1Mo implements Comparator {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ down write;

    public /* synthetic */ onPreFlingQWom1Mo(down downVar, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = downVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.RemoteActionCompatParcelizer;
        down downVar = this.write;
        if (i == 0) {
            return setNativeShader.RemoteActionCompatParcelizer(Integer.valueOf(downVar.RemoteActionCompatParcelizer(((androidx.compose.foundation.lazy.LazyListMeasuredItem) ((FabBaselineTokens) obj)).MediaDescriptionCompat)), Integer.valueOf(downVar.RemoteActionCompatParcelizer(((androidx.compose.foundation.lazy.LazyListMeasuredItem) ((FabBaselineTokens) obj2)).MediaDescriptionCompat)));
        }
        if (i == 1) {
            return setNativeShader.RemoteActionCompatParcelizer(Integer.valueOf(downVar.RemoteActionCompatParcelizer(((androidx.compose.foundation.lazy.LazyListMeasuredItem) ((FabBaselineTokens) obj)).MediaDescriptionCompat)), Integer.valueOf(downVar.RemoteActionCompatParcelizer(((androidx.compose.foundation.lazy.LazyListMeasuredItem) ((FabBaselineTokens) obj2)).MediaDescriptionCompat)));
        }
        if (i != 2) {
            return setNativeShader.RemoteActionCompatParcelizer(Integer.valueOf(downVar.RemoteActionCompatParcelizer(((androidx.compose.foundation.lazy.LazyListMeasuredItem) ((FabBaselineTokens) obj2)).MediaDescriptionCompat)), Integer.valueOf(downVar.RemoteActionCompatParcelizer(((androidx.compose.foundation.lazy.LazyListMeasuredItem) ((FabBaselineTokens) obj)).MediaDescriptionCompat)));
        }
        return setNativeShader.RemoteActionCompatParcelizer(Integer.valueOf(downVar.RemoteActionCompatParcelizer(((androidx.compose.foundation.lazy.LazyListMeasuredItem) ((FabBaselineTokens) obj2)).MediaDescriptionCompat)), Integer.valueOf(downVar.RemoteActionCompatParcelizer(((androidx.compose.foundation.lazy.LazyListMeasuredItem) ((FabBaselineTokens) obj)).MediaDescriptionCompat)));
    }
}
