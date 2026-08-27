package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class accessstartTrackingTable extends Throwable {
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessstartTrackingTable(List list) {
        super(isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem("\n    Previously tried to send a perseus event: " + onContentCardDismissed.IconCompatParcelizer(list, null, null, null, new invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(25), 31) + " before GEID is set.\n    Now, it has been initalized and successfully sent " + list.size() + " events after initialization\n"));
        this.write = 8;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        int i = this.write;
        if (i == 1) {
            synchronized (this) {
            }
            return this;
        }
        if (i == 2) {
            synchronized (this) {
            }
            return this;
        }
        if (i != 3) {
            return super.fillInStackTrace();
        }
        synchronized (this) {
        }
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ accessstartTrackingTable(String str, int i) {
        super(str);
        this.write = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ accessstartTrackingTable(String str, Throwable th, int i) {
        super(str, th);
        this.write = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ accessstartTrackingTable(int i, boolean z) {
        super("Failure occurred while trying to finish a future.");
        this.write = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessstartTrackingTable(int i) {
        super("Analytics tracking request failed.", null);
        this.write = i;
        if (i != 7) {
        } else {
            super("Home API failed to load");
        }
    }
}
