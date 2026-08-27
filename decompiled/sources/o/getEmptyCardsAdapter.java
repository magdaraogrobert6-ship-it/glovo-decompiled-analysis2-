package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getEmptyCardsAdapter implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ getNetworkUnavailableJob serializer;

    public /* synthetic */ getEmptyCardsAdapter(getNetworkUnavailableJob getnetworkunavailablejob, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = getnetworkunavailablejob;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        getNetworkUnavailableJob getnetworkunavailablejob = this.serializer;
        if (i == 0) {
            onRefresh onrefresh = getnetworkunavailablejob.RatingCompat;
            if (onrefresh == onRefresh.CLOSED || onrefresh == null) {
                getnetworkunavailablejob.RatingCompat = onRefresh.OPENING;
                getnetworkunavailablejob.write();
                return;
            }
            return;
        }
        onRefresh onrefresh2 = getnetworkunavailablejob.RatingCompat;
        if (onrefresh2 == onRefresh.OPENING || onrefresh2 == onRefresh.OPEN) {
            getnetworkunavailablejob.serializer();
            getnetworkunavailablejob.RatingCompat = onRefresh.CLOSED;
            getnetworkunavailablejob.write("close", new Object[0]);
        }
    }
}
