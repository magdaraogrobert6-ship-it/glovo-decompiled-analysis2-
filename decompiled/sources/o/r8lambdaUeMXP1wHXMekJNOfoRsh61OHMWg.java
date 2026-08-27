package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg extends getContentCardsViewFromCache implements r8lambdaKGJqwjLmUs58_kpRh__GGuNRqTQ {
    public static final r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg serializer = new r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg(r8lambdazCa9f5hibLISCeY3u5lKyCauzY.read, 0);
    public final r8lambdazCa9f5hibLISCeY3u5lKyCauzY IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;

    @Override // o.getContentCardsViewFromCache
    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg(r8lambdazCa9f5hibLISCeY3u5lKyCauzY r8lambdazca9f5hibliscey3u5lkycauzy, int i) {
        r8lambdazca9f5hibliscey3u5lkycauzy.getClass();
        this.IconCompatParcelizer = r8lambdazca9f5hibliscey3u5lkycauzy;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.getContentCardsViewFromCache
    public final Collection MediaSessionCompatQueueItem() {
        return new addInAppMessageViewToViewGrouplambda0(this, 0);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.IconCompatParcelizer.read(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.IconCompatParcelizer.serializer(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // o.getContentCardsViewFromCache
    public final Set read() {
        return new r8lambdakqgvnFv0Rn5v7JwbIe6ECY7W9So(this, 0);
    }

    @Override // o.getContentCardsViewFromCache
    public final Set write() {
        return new r8lambdakqgvnFv0Rn5v7JwbIe6ECY7W9So(this, 1);
    }

    @Override // o.getContentCardsViewFromCache, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        boolean z = map instanceof addInAppMessageViewToViewGrouplambda20;
        r8lambdazCa9f5hibLISCeY3u5lKyCauzY r8lambdazca9f5hibliscey3u5lkycauzy = this.IconCompatParcelizer;
        if (z) {
            return r8lambdazca9f5hibliscey3u5lkycauzy.serializer(((addInAppMessageViewToViewGrouplambda20) obj).IconCompatParcelizer().IconCompatParcelizer, r8lambdaav0Sv9dC1kL2V30Vf78477IzrQ.serializer);
        }
        if (map instanceof addInAppMessageViewToViewGrouplambda22) {
            return r8lambdazca9f5hibliscey3u5lkycauzy.serializer(((addInAppMessageViewToViewGrouplambda22) obj).IconCompatParcelizer().MediaBrowserCompatMediaItem(), r8lambdaav0Sv9dC1kL2V30Vf78477IzrQ.RemoteActionCompatParcelizer);
        }
        if (map instanceof r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg) {
            return r8lambdazca9f5hibliscey3u5lkycauzy.serializer(((r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg) obj).IconCompatParcelizer, r8lambdaav0Sv9dC1kL2V30Vf78477IzrQ.IconCompatParcelizer);
        }
        if (map instanceof r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ) {
            return r8lambdazca9f5hibliscey3u5lkycauzy.serializer(((r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ) obj).MediaBrowserCompatMediaItem(), r8lambdaav0Sv9dC1kL2V30Vf78477IzrQ.read);
        }
        return super.equals(obj);
    }
}
