package o;

import android.content.SharedPreferences;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.settings.data.PreferencesRepository$observeStringPreference$1;
import com.roadrunner.settings.subscreens.navigation.NavigationSettingsViewModel$1;
import com.sentiance.core.model.thrift.O$b;
import io.sentry.util.network.NetworkBody;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94 extends androidx.lifecycle.ViewModel {
    private static int MediaSessionCompatToken = 0;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final Flow MediaBrowserCompatMediaItem;
    public final Flow MediaDescriptionCompat;
    public final accessgetProportionalcp MediaMetadataCompat;
    public final NetworkBody MediaSessionCompatQueueItem;
    public final StateFlow MediaSessionCompatResultReceiverWrapper;
    public final getQueryContext ParcelableVolumeInfo;
    public final setTransactionSuccessful PlaybackStateCompat;
    public final r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds PlaybackStateCompatCustomAction;
    public final Flow RatingCompat;
    public final r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns RemoteActionCompatParcelizer;
    public final Flow read;
    public final O$b serializer;
    public final Flow write;

    public r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94(setTransactionSuccessful settransactionsuccessful, O$b o$b, r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds r8lambdah04qyyeozrxd4cfrstnkpb99_ds, NetworkBody networkBody, r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, getQueryContext getquerycontext, accessgetProportionalcp accessgetproportionalcp) {
        settransactionsuccessful.getClass();
        o$b.getClass();
        r8lambdah04qyyeozrxd4cfrstnkpb99_ds.getClass();
        networkBody.getClass();
        r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns.getClass();
        getquerycontext.getClass();
        accessgetproportionalcp.getClass();
        this.PlaybackStateCompat = settransactionsuccessful;
        this.serializer = o$b;
        this.PlaybackStateCompatCustomAction = r8lambdah04qyyeozrxd4cfrstnkpb99_ds;
        this.MediaSessionCompatQueueItem = networkBody;
        this.RemoteActionCompatParcelizer = r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns;
        this.ParcelableVolumeInfo = getquerycontext;
        this.MediaMetadataCompat = accessgetproportionalcp;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i = 1;
        this.MediaBrowserCompatMediaItem = FlowKt.write(new PreferencesRepository$observeStringPreference$1(r8lambdah04qyyeozrxd4cfrstnkpb99_ds, settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.preference_map_metrics), shortNewsContentCardView, i));
        int i2 = 0;
        this.RatingCompat = FlowKt.write(new PreferencesRepository$observeStringPreference$1(r8lambdah04qyyeozrxd4cfrstnkpb99_ds, settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.preference_turn_by_turn), shortNewsContentCardView, i2));
        this.read = FlowKt.write(new PreferencesRepository$observeStringPreference$1(r8lambdah04qyyeozrxd4cfrstnkpb99_ds, settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.preference_avoid_highways), shortNewsContentCardView, i));
        this.write = FlowKt.write(new PreferencesRepository$observeStringPreference$1(r8lambdah04qyyeozrxd4cfrstnkpb99_ds, settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.preference_avoid_tolls), shortNewsContentCardView, i));
        this.MediaDescriptionCompat = FlowKt.write(new PreferencesRepository$observeStringPreference$1(r8lambdah04qyyeozrxd4cfrstnkpb99_ds, settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.preference_naver_route_preview), shortNewsContentCardView, i));
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o(accessgetStrictcp.IN_APP, null, null, null));
        this.IconCompatParcelizer = mutableStateFlow;
        this.MediaSessionCompatResultReceiverWrapper = mutableStateFlow;
        ((decode) networkBody.IconCompatParcelizer).logEvent("choose_navigation_app", null);
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new NavigationSettingsViewModel$1(this, shortNewsContentCardView, i2), 3);
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new NavigationSettingsViewModel$1(this, shortNewsContentCardView, i), 3);
    }

    public final void read(boolean z) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 119;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StateFlow stateFlow = this.MediaSessionCompatResultReceiverWrapper;
        r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI r8lambdav9hvubmv32qeolrxalsjens1hri = ((r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o) stateFlow.read()).write;
        if (r8lambdav9hvubmv32qeolrxalsjens1hri != null) {
            r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o r8lambdavvrejdwf2brhzpg2b8cht1nsk8o = (r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o) stateFlow.read();
            r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c = r8lambdav9hvubmv32qeolrxalsjens1hri.MediaSessionCompatQueueItem;
            String str = r8lambdav9hvubmv32qeolrxalsjens1hri.IconCompatParcelizer;
            String str2 = r8lambdav9hvubmv32qeolrxalsjens1hri.serializer;
            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = r8lambdav9hvubmv32qeolrxalsjens1hri.RemoteActionCompatParcelizer;
            String str3 = r8lambdav9hvubmv32qeolrxalsjens1hri.read;
            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
            r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI r8lambdav9hvubmv32qeolrxalsjens1hri2 = new r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI(r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c, str, str2, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, str3, z);
            accessgetStrictcp accessgetstrictcp = r8lambdavvrejdwf2brhzpg2b8cht1nsk8o.IconCompatParcelizer;
            List list = r8lambdavvrejdwf2brhzpg2b8cht1nsk8o.serializer;
            r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c2 = r8lambdavvrejdwf2brhzpg2b8cht1nsk8o.RemoteActionCompatParcelizer;
            accessgetstrictcp.getClass();
            this.IconCompatParcelizer.IconCompatParcelizer(new r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o(accessgetstrictcp, list, r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c2, r8lambdav9hvubmv32qeolrxalsjens1hri2));
            int i4 = MediaSessionCompatToken + 83;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }

    public final void RemoteActionCompatParcelizer(accessgetStrictcp accessgetstrictcp) {
        String strIconCompatParcelizer;
        int i = 2 % 2;
        accessgetstrictcp.getClass();
        accessgetStrictcp accessgetstrictcp2 = ((r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o) this.MediaSessionCompatResultReceiverWrapper.read()).IconCompatParcelizer;
        NetworkBody networkBody = this.MediaSessionCompatQueueItem;
        networkBody.getClass();
        accessgetstrictcp2.getClass();
        getLooseusljTpc getlooseusljtpc = (getLooseusljTpc) networkBody.RemoteActionCompatParcelizer;
        getlooseusljtpc.getClass();
        getUnspecifiedusljTpc getunspecifiedusljtpc = getlooseusljtpc.write;
        getunspecifiedusljtpc.serializer.logEvent("navigation_type_submit", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("new_navigation_mode", accessgetstrictcp.getValue()), new onViewAttachedToWindowlambda0("old_navigation_mode", accessgetstrictcp2.getValue()), new onViewAttachedToWindowlambda0("new_navigation_app", getunspecifiedusljtpc.IconCompatParcelizer(accessgetstrictcp)), new onViewAttachedToWindowlambda0("old_navigation_app", getunspecifiedusljtpc.IconCompatParcelizer(accessgetstrictcp2))));
        setTransactionSuccessful settransactionsuccessful = this.PlaybackStateCompat;
        String strIconCompatParcelizer2 = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.preference_turn_by_turn);
        int i2 = r8lambdaWGy3_366U8FSuLZ9uzjXv9xTUfo.IconCompatParcelizer[accessgetstrictcp.ordinal()];
        if (i2 == 1) {
            strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.preference_turn_by_turn_in_app);
            int i3 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 19;
            MediaSessionCompatToken = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 4 / 2;
            }
        } else {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.preference_turn_by_turn_external_app);
        }
        r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds r8lambdah04qyyeozrxd4cfrstnkpb99_ds = this.PlaybackStateCompatCustomAction;
        r8lambdah04qyyeozrxd4cfrstnkpb99_ds.getClass();
        SharedPreferences.Editor editorEdit = r8lambdah04qyyeozrxd4cfrstnkpb99_ds.IconCompatParcelizer.edit();
        editorEdit.putString(strIconCompatParcelizer2, strIconCompatParcelizer);
        editorEdit.apply();
        int i5 = MediaSessionCompatToken + 55;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
