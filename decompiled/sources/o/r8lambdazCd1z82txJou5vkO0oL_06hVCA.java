package o;

import com.mapbox.navigation.ui.maps.util.LimitedQueue;
import java.util.Iterator;
import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdazCd1z82txJou5vkO0oL_06hVCA extends onCloseActionlambda1 {
    public final r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw IconCompatParcelizer;
    public final isAdapterPositionOnScreen read;

    public r8lambdazCd1z82txJou5vkO0oL_06hVCA(String str, int i) {
        super(str, null, i);
        this.IconCompatParcelizer = r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw.IconCompatParcelizer;
        this.read = new isAdapterPositionOnScreen(new createVerticalAnimation(i, str, this));
    }

    @Override // o.onCloseActionlambda1, o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final RegexKt RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.onCloseActionlambda1, o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA RemoteActionCompatParcelizer(int i) {
        return ((r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[]) this.read.MediaSessionCompatResultReceiverWrapper())[i];
    }

    @Override // o.onCloseActionlambda1
    public final int hashCode() {
        int iHashCode = this.ParcelableVolumeInfo.hashCode();
        Iterator it = new LimitedQueue(2, this).iterator();
        int iHashCode2 = 1;
        while (true) {
            EmptyContentCardsAdapterNetworkUnavailableViewHolder emptyContentCardsAdapterNetworkUnavailableViewHolder = (EmptyContentCardsAdapterNetworkUnavailableViewHolder) it;
            if (!emptyContentCardsAdapterNetworkUnavailableViewHolder.hasNext()) {
                return (iHashCode * 31) + iHashCode2;
            }
            String str = (String) emptyContentCardsAdapterNetworkUnavailableViewHolder.next();
            iHashCode2 = (iHashCode2 * 31) + (str != null ? str.hashCode() : 0);
        }
    }

    @Override // o.onCloseActionlambda1
    public final String toString() {
        return onContentCardDismissed.IconCompatParcelizer(new LimitedQueue(2, this), ", ", this.ParcelableVolumeInfo.concat("("), ")", null, 56);
    }

    @Override // o.onCloseActionlambda1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r8lambda92M0P9sIT5Uf70mvjF4RwMruDA)) {
            return false;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) obj;
        if (r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer() != r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw.IconCompatParcelizer || !this.ParcelableVolumeInfo.equals(r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer())) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambdafhYz7cFuDeJzdcQ1hWQAPMteho.serializer(this), r8lambdafhYz7cFuDeJzdcQ1hWQAPMteho.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda)}, getCieXyz.write())).booleanValue();
    }
}
