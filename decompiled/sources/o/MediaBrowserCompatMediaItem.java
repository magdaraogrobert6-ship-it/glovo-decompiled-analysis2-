package o;

import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes.dex */
@Serializable
public final class MediaBrowserCompatMediaItem {
    public final List hosts;
    public static final MediaDescriptionCompat Companion = new MediaDescriptionCompat();
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new RemoteActionCompatParcelizer(1))};

    public final int hashCode() {
        return this.hosts.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaBrowserCompatMediaItem)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hosts, ((MediaBrowserCompatMediaItem) obj).hosts}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return MediaSessionCompatQueueItem.read("NestResponse(hosts=", ")", this.hosts);
    }

    public /* synthetic */ MediaBrowserCompatMediaItem(int i, List list) {
        if (1 == (i & 1)) {
            this.hosts = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, RatingCompat.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }
}
