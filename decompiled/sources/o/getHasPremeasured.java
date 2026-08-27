package o;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getHasPremeasured extends getSizeYEO4UFw {
    public final ImageKt RemoteActionCompatParcelizer;
    public long read;
    public final ImageKt write;

    public final void IconCompatParcelizer(long j, getViewportBounds getviewportbounds) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (getviewportbounds == null) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.PlaybackStateCompat.serializer(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            onLayoutRectChangeddefault.IconCompatParcelizer(getviewportbounds, bundle, true);
            NoWindowInsetsAnimation noWindowInsetsAnimation = lookaheadScopeKtLookaheadScope221.ComponentActivity;
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
            noWindowInsetsAnimation.RemoteActionCompatParcelizer("am", "_xa", bundle);
        }
    }

    public final void RemoteActionCompatParcelizer(long j) {
        ImageKt imageKt = this.write;
        Iterator it = ((Image) imageKt.keySet()).iterator();
        while (it.hasNext()) {
            imageKt.put((String) it.next(), Long.valueOf(j));
        }
        if (imageKt.isEmpty()) {
            return;
        }
        this.read = j;
    }

    public final void RemoteActionCompatParcelizer(String str, long j, getViewportBounds getviewportbounds) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (getviewportbounds == null) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                getlookaheaddelegate2.PlaybackStateCompat.serializer(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            onLayoutRectChangeddefault.IconCompatParcelizer(getviewportbounds, bundle, true);
            NoWindowInsetsAnimation noWindowInsetsAnimation = lookaheadScopeKtLookaheadScope221.ComponentActivity;
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation);
            noWindowInsetsAnimation.RemoteActionCompatParcelizer("am", "_xu", bundle);
        }
    }

    public final void read(long j) {
        OnFirstVisibleNode onFirstVisibleNode = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ResultReceiver;
        LookaheadScopeKtLookaheadScope221.serializer(onFirstVisibleNode);
        getViewportBounds getviewportboundsIconCompatParcelizer = onFirstVisibleNode.IconCompatParcelizer(false);
        ImageKt imageKt = this.write;
        for (String str : (Image) imageKt.keySet()) {
            RemoteActionCompatParcelizer(str, j - ((Long) imageKt.get(str)).longValue(), getviewportboundsIconCompatParcelizer);
        }
        if (!imageKt.isEmpty()) {
            IconCompatParcelizer(j - this.read, getviewportboundsIconCompatParcelizer);
        }
        RemoteActionCompatParcelizer(j);
    }

    public final void serializer(long j, String str) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (str == null || str.length() == 0) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Ad unit id must be a non-empty string");
        } else {
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
            lookaheadScopeKtLookaheadScope4.write((Runnable) new setComposition(this, str, j, 0));
        }
    }

    public final void write(long j, String str) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (str == null || str.length() == 0) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Ad unit id must be a non-empty string");
        } else {
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
            lookaheadScopeKtLookaheadScope4.write((Runnable) new setComposition(this, str, j, 1));
        }
    }

    public getHasPremeasured(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        super(lookaheadScopeKtLookaheadScope221);
        this.RemoteActionCompatParcelizer = new ImageKt(0);
        this.write = new ImageKt(0);
    }
}
