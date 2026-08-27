package o;

import coil3.RealImageLoader$execute$2$job$1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: classes.dex */
public final class getMax implements getMin {
    public final int IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final getColor write;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getMax(getColor getcolor, int i) {
        this(getcolor, (byte) 0, false);
        this.read = i;
        getcolor.getClass();
        if (i != 2) {
            this.IconCompatParcelizer = 6;
        } else {
            this(getcolor, (byte) 0, false);
            this.IconCompatParcelizer = 9;
        }
    }

    @Override // o.getMin
    public final boolean serializer(setFrom58bKbWc setfrom58bkbwc) {
        int i = this.read;
        if (i != 0) {
            return i != 1 ? setfrom58bkbwc.read.MediaBrowserCompatMediaItem : setfrom58bkbwc.read.MediaMetadataCompat;
        }
        return setfrom58bkbwc.read.RatingCompat;
    }

    @Override // o.getMin
    public final Flow serializer(toolingGraphicsLayer toolinggraphicslayer) {
        toolinggraphicslayer.getClass();
        return FlowKt.write(new RealImageLoader$execute$2$job$1(this, (ShortNewsContentCardView) null, 4));
    }

    public getMax(getColor getcolor, byte b, boolean z) {
        getcolor.getClass();
        this.write = getcolor;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getMax(getColor getcolor) {
        this(getcolor, (byte) 0, false);
        this.read = 0;
        getcolor.getClass();
        this.IconCompatParcelizer = 5;
    }
}
