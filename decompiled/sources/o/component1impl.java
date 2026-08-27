package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class component1impl extends accessgetZerocp {
    @Override // o.accessgetZerocp
    public final List RemoteActionCompatParcelizer(long j, Object obj) {
        TwoDimensionalFocusSearchKtgenerateAndSearchChildren1 twoDimensionalFocusSearchKtgenerateAndSearchChildren1 = (TwoDimensionalFocusSearchKtgenerateAndSearchChildren1) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj);
        if (((searchChildren4C6V_qg) twoDimensionalFocusSearchKtgenerateAndSearchChildren1).read) {
            return twoDimensionalFocusSearchKtgenerateAndSearchChildren1;
        }
        int size = twoDimensionalFocusSearchKtgenerateAndSearchChildren1.size();
        TwoDimensionalFocusSearchKtgenerateAndSearchChildren1 twoDimensionalFocusSearchKtgenerateAndSearchChildren2 = twoDimensionalFocusSearchKtgenerateAndSearchChildren1.read(size == 0 ? 10 : size * 2);
        getUint64Low32annotations.serializer(j, obj, twoDimensionalFocusSearchKtgenerateAndSearchChildren2);
        return twoDimensionalFocusSearchKtgenerateAndSearchChildren2;
    }

    @Override // o.accessgetZerocp
    public final void read(long j, Object obj, Object obj2) {
        deflate deflateVar = getUint64Low32annotations.read;
        TwoDimensionalFocusSearchKtgenerateAndSearchChildren1 twoDimensionalFocusSearchKtgenerateAndSearchChildren1 = (TwoDimensionalFocusSearchKtgenerateAndSearchChildren1) deflateVar.MediaBrowserCompatMediaItem(j, obj);
        TwoDimensionalFocusSearchKtgenerateAndSearchChildren1 twoDimensionalFocusSearchKtgenerateAndSearchChildren2 = (TwoDimensionalFocusSearchKtgenerateAndSearchChildren1) deflateVar.MediaBrowserCompatMediaItem(j, obj2);
        int size = twoDimensionalFocusSearchKtgenerateAndSearchChildren1.size();
        int size2 = twoDimensionalFocusSearchKtgenerateAndSearchChildren2.size();
        if (size > 0 && size2 > 0) {
            if (!((searchChildren4C6V_qg) twoDimensionalFocusSearchKtgenerateAndSearchChildren1).read) {
                twoDimensionalFocusSearchKtgenerateAndSearchChildren1 = twoDimensionalFocusSearchKtgenerateAndSearchChildren1.read(size2 + size);
            }
            twoDimensionalFocusSearchKtgenerateAndSearchChildren1.addAll(twoDimensionalFocusSearchKtgenerateAndSearchChildren2);
        }
        if (size > 0) {
            twoDimensionalFocusSearchKtgenerateAndSearchChildren2 = twoDimensionalFocusSearchKtgenerateAndSearchChildren1;
        }
        getUint64Low32annotations.serializer(j, obj, twoDimensionalFocusSearchKtgenerateAndSearchChildren2);
    }

    @Override // o.accessgetZerocp
    public final void write(long j, Object obj) {
        ((searchChildren4C6V_qg) ((TwoDimensionalFocusSearchKtgenerateAndSearchChildren1) getUint64Low32annotations.read.MediaBrowserCompatMediaItem(j, obj))).read = false;
    }
}
