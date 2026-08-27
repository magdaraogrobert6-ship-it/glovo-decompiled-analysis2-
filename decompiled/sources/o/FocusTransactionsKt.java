package o;

import android.content.Context;
import androidx.datastore.core.SimpleActor$offer$2;
import androidx.datastore.core.SingleProcessDataStore$file$2;
import java.util.List;
import org.koin.core.instance.SingleInstanceFactory$get$1;

/* JADX INFO: loaded from: classes.dex */
public final class FocusTransactionsKt implements displayInAppMessagelambda13 {
    public final getContentViewGroupParentLayout MediaBrowserCompatMediaItem;
    public final Object MediaMetadataCompat;
    public volatile performCustomExitMxy_nc0 RemoteActionCompatParcelizer;
    public final String read;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public final Object write = new Object();

    public FocusTransactionsKt(String str, performRequestFocus performrequestfocus, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.read = str;
        this.MediaMetadataCompat = performrequestfocus;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaBrowserCompatMediaItem = getcontentviewgroupparentlayout;
    }

    @Override // o.displayInAppMessagelambda13
    public final Object getValue(Object obj, registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2) {
        androidx.datastore.core.SingleProcessDataStore singleProcessDataStore;
        pickChildForBackwardSearch pickchildforbackwardsearch;
        int i = 3;
        if (this.IconCompatParcelizer == 0) {
            Context context = (Context) obj;
            registerinappmessagemanagerlambda2.getClass();
            androidx.datastore.core.SingleProcessDataStore singleProcessDataStore2 = (androidx.datastore.core.SingleProcessDataStore) this.RemoteActionCompatParcelizer;
            if (singleProcessDataStore2 != null) {
                return singleProcessDataStore2;
            }
            synchronized (this.write) {
                if (((androidx.datastore.core.SingleProcessDataStore) this.RemoteActionCompatParcelizer) == null) {
                    Context applicationContext = context.getApplicationContext();
                    performRequestFocus performrequestfocus = (performRequestFocus) this.MediaMetadataCompat;
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.serializer;
                    applicationContext.getClass();
                    List list = (List) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(applicationContext);
                    getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.MediaBrowserCompatMediaItem;
                    SingleInstanceFactory$get$1 singleInstanceFactory$get$1 = new SingleInstanceFactory$get$1(applicationContext, 1, this);
                    list.getClass();
                    speculativeHit speculativehit = new speculativeHit(3);
                    Object[] objArr = {new SimpleActor$offer$2(list, (ShortNewsContentCardView) null, 4)};
                    int iSerializer = getQueryParameterslambda2.serializer();
                    this.RemoteActionCompatParcelizer = new androidx.datastore.core.SingleProcessDataStore(singleInstanceFactory$get$1, performrequestfocus, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer), speculativehit, getcontentviewgroupparentlayout);
                }
                singleProcessDataStore = (androidx.datastore.core.SingleProcessDataStore) this.RemoteActionCompatParcelizer;
                singleProcessDataStore.getClass();
            }
            return singleProcessDataStore;
        }
        Context context2 = (Context) obj;
        context2.getClass();
        registerinappmessagemanagerlambda2.getClass();
        pickChildForBackwardSearch pickchildforbackwardsearch2 = (pickChildForBackwardSearch) this.RemoteActionCompatParcelizer;
        if (pickchildforbackwardsearch2 != null) {
            return pickchildforbackwardsearch2;
        }
        synchronized (this.write) {
            if (((pickChildForBackwardSearch) this.RemoteActionCompatParcelizer) == null) {
                Context applicationContext2 = context2.getApplicationContext();
                accessgetAlwayscp accessgetalwayscp = (accessgetAlwayscp) this.MediaMetadataCompat;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = this.serializer;
                applicationContext2.getClass();
                List list2 = (List) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(applicationContext2);
                getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = this.MediaBrowserCompatMediaItem;
                SingleInstanceFactory$get$1 singleInstanceFactory$get$2 = new SingleInstanceFactory$get$1(applicationContext2, i, this);
                list2.getClass();
                Object[] objArr2 = {accessgetalwayscp, list2, getcontentviewgroupparentlayout2, new SingleProcessDataStore$file$2(2, singleInstanceFactory$get$2)};
                this.RemoteActionCompatParcelizer = new pickChildForBackwardSearch((androidx.datastore.core.SingleProcessDataStore) r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(-756067223, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), 756067223, sourceInformationContextOfdefault.read(), objArr2, sourceInformationContextOfdefault.read()));
            }
            pickchildforbackwardsearch = (pickChildForBackwardSearch) this.RemoteActionCompatParcelizer;
            pickchildforbackwardsearch.getClass();
        }
        return pickchildforbackwardsearch;
    }

    public FocusTransactionsKt(String str, accessgetAlwayscp accessgetalwayscp, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.read = str;
        this.MediaMetadataCompat = accessgetalwayscp;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaBrowserCompatMediaItem = getcontentviewgroupparentlayout;
    }
}
