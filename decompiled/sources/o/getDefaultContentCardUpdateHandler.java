package o;

import fwfd.com.fwfsdk.constant.FWFConstants;
import io.socket.client.Manager$1$2;
import io.socket.engineio.client.Socket$9;

/* JADX INFO: loaded from: classes4.dex */
public final class getDefaultContentCardUpdateHandler implements Runnable {
    public final /* synthetic */ getDefaultContentCardsViewBindingHandler IconCompatParcelizer;
    public final /* synthetic */ getNetworkUnavailableJob[] MediaDescriptionCompat;
    public final /* synthetic */ getCustomContentCardsViewBindingHandler RatingCompat;
    public final /* synthetic */ Socket$9 RemoteActionCompatParcelizer;
    public final /* synthetic */ Manager$1$2 read;
    public final /* synthetic */ getDefaultEmptyContentCardsAdapter serializer;
    public final /* synthetic */ getDefaultEmptyContentCardsAdapter write;

    public getDefaultContentCardUpdateHandler(getNetworkUnavailableJob[] getnetworkunavailablejobArr, getDefaultContentCardsViewBindingHandler getdefaultcontentcardsviewbindinghandler, Socket$9 socket$9, getDefaultEmptyContentCardsAdapter getdefaultemptycontentcardsadapter, getCustomContentCardsViewBindingHandler getcustomcontentcardsviewbindinghandler, getDefaultEmptyContentCardsAdapter getdefaultemptycontentcardsadapter2, Manager$1$2 manager$1$2) {
        this.MediaDescriptionCompat = getnetworkunavailablejobArr;
        this.IconCompatParcelizer = getdefaultcontentcardsviewbindinghandler;
        this.RemoteActionCompatParcelizer = socket$9;
        this.serializer = getdefaultemptycontentcardsadapter;
        this.RatingCompat = getcustomcontentcardsviewbindinghandler;
        this.write = getdefaultemptycontentcardsadapter2;
        this.read = manager$1$2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        getNetworkUnavailableJob[] getnetworkunavailablejobArr = this.MediaDescriptionCompat;
        getnetworkunavailablejobArr[0].RemoteActionCompatParcelizer("open", this.IconCompatParcelizer);
        getnetworkunavailablejobArr[0].RemoteActionCompatParcelizer(FWFConstants.EXPLANATION_TYPE_ERROR, this.RemoteActionCompatParcelizer);
        getnetworkunavailablejobArr[0].RemoteActionCompatParcelizer("close", this.serializer);
        getDefaultEmptyContentCardsAdapter getdefaultemptycontentcardsadapter = this.write;
        getCustomContentCardsViewBindingHandler getcustomcontentcardsviewbindinghandler = this.RatingCompat;
        getcustomcontentcardsviewbindinghandler.RemoteActionCompatParcelizer("close", getdefaultemptycontentcardsadapter);
        getcustomcontentcardsviewbindinghandler.RemoteActionCompatParcelizer("upgrading", this.read);
    }
}
