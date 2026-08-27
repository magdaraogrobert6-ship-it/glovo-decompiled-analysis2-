package o;

import android.app.Application;
import android.view.LayoutInflater;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getEndimpl implements onUncaughtException {
    public final androidx.navigation.NavArgsLazy IconCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ getEndimpl(androidx.navigation.NavArgsLazy navArgsLazy, int i) {
        this.write = i;
        this.IconCompatParcelizer = navArgsLazy;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.write;
        androidx.navigation.NavArgsLazy navArgsLazy = this.IconCompatParcelizer;
        if (i == 0) {
            internalOnMeasureui internalonmeasureui = (internalOnMeasureui) navArgsLazy.MediaSessionCompatQueueItem;
            RangesKt.serializer(internalonmeasureui);
            return internalonmeasureui;
        }
        if (i != 1) {
            LayoutInflater layoutInflater = (LayoutInflater) ((Application) navArgsLazy.RatingCompat).getSystemService("layout_inflater");
            RangesKt.serializer(layoutInflater);
            return layoutInflater;
        }
        getDiagonalSizeimpl getdiagonalsizeimpl = (getDiagonalSizeimpl) navArgsLazy.read;
        RangesKt.serializer(getdiagonalsizeimpl);
        return getdiagonalsizeimpl;
    }
}
