package o;

import android.database.sqlite.SQLiteDatabase;
import bo.app.af$$ExternalSyntheticOutline0;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.util.BoundingBox;
import com.sentiance.sdk.util.database.WhereClause;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdayIxqFCqp5HXqcwSgBY71YAQtSs implements r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object write;

    public /* synthetic */ r8lambdayIxqFCqp5HXqcwSgBY71YAQtSs(Object obj, Object obj2, Object obj3, int i) {
        this.read = i;
        this.write = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.IconCompatParcelizer = obj3;
    }

    @Override // o.r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk
    public final Object serializer(SQLiteDatabase sQLiteDatabase) {
        int i = this.read;
        Object obj = this.IconCompatParcelizer;
        Object obj2 = this.RemoteActionCompatParcelizer;
        Object obj3 = this.write;
        if (i == 0) {
            ArrayList arrayList = (ArrayList) obj;
            DustDataStoreProviderCompanion.IconCompatParcelizer((DustDataStoreProviderCompanion) obj3, (BoundingBox) obj2, arrayList, sQLiteDatabase);
            return arrayList;
        }
        if (i == 1) {
            return setHeaderTextColor.read((setHeaderTextColor) obj3, (String) obj2, (r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs) obj, sQLiteDatabase);
        }
        if (i != 2) {
            r8lambda4uWA2XKn9m8LsqLzYSUJO6oiPxw r8lambda4uwa2xkn9m8lsqlzysujo6oipxw = (r8lambda4uWA2XKn9m8LsqLzYSUJO6oiPxw) obj3;
            r8lambda4uWA2XKn9m8LsqLzYSUJO6oiPxw.IconCompatParcelizer iconCompatParcelizer = (r8lambda4uWA2XKn9m8LsqLzYSUJO6oiPxw.IconCompatParcelizer) obj2;
            parseLonglambda0 parselonglambda0 = (parseLonglambda0) obj;
            r8lambdaSywuHIWfLiZV_fav810RJNKPOo.MediaBrowserCompatMediaItem().getClass();
            InAppMessageFull.read().getClass();
            ArrayList arrayList2 = new ArrayList();
            InAppMessageFull.read().getClass();
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add("id");
            arrayList3.add("unique_id");
            arrayList3.add("event_time");
            arrayList3.add("time_horizon");
            arrayList3.add("creation_time");
            arrayList3.add("update_time");
            arrayList3.addAll(Arrays.asList("type", "event_correlation_id", "is_provisional"));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.read((String) it.next(), com.braze.Constants.BRAZE_PUSH_TITLE_KEY));
            }
            r8lambdaSywuHIWfLiZV_fav810RJNKPOo.MediaBrowserCompatMediaItem().getClass();
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add("unique_id");
            arrayList4.addAll(Arrays.asList("latitude", "longitude", "accuracy", com.braze.models.IBrazeLocation.ALTITUDE, "wifi_info", "venue_significance", "venue_type"));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.read((String) it2.next(), "m"));
            }
            WhereClause whereClauseWrite = iconCompatParcelizer.IconCompatParcelizer("t.type").write(Integer.valueOf(TransportChangeType.STATIONARY.value));
            return r8lambda4uwa2xkn9m8lsqlzysujo6oipxw.read(sQLiteDatabase.rawQuery(af$$ExternalSyntheticOutline0.m("SELECT " + r8lambda5tLpxyx6nsiTnLY5GKIpCwhnz8M.RemoteActionCompatParcelizer(arrayList2, ", ") + " FROM transport_change as t INNER JOIN stationary_metadata as m ON t.unique_id = m.unique_id WHERE " + whereClauseWrite.IconCompatParcelizer(), " ORDER BY t.event_time ", "desc") + " LIMIT " + ((Object) 1), whereClauseWrite.RemoteActionCompatParcelizer()), parselonglambda0);
        }
        getMessageFields getmessagefields = (getMessageFields) obj3;
        getMessageFields.write writeVar = (getMessageFields.write) obj2;
        parseLonglambda0 parselonglambda1 = (parseLonglambda0) obj;
        handleLogClicklambda1.read().getClass();
        getInAppMessageDarkThemeWrapper.read().getClass();
        getJsonObject.read().getClass();
        r8lambdaXwOf7HXV9ovpySUfUYRlJ2kKy98.read().getClass();
        ArrayList arrayList5 = new ArrayList();
        r8lambdaXwOf7HXV9ovpySUfUYRlJ2kKy98.read().getClass();
        Iterator it3 = Arrays.asList("id", "stationary_id", "active_venue_row_id", "likelihood").iterator();
        while (it3.hasNext()) {
            arrayList5.add(r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.read((String) it3.next(), "sv"));
        }
        getInAppMessageDarkThemeWrapper.read().getClass();
        Iterator it4 = Arrays.asList("id", "venue_id", "latitude", "longitude").iterator();
        while (it4.hasNext()) {
            arrayList5.add(r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.read((String) it4.next(), "v"));
        }
        handleLogClicklambda1.read().getClass();
        Iterator it5 = Arrays.asList("id", "tag_key", "tag_value").iterator();
        while (it5.hasNext()) {
            arrayList5.add(r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs.read((String) it5.next(), com.braze.Constants.BRAZE_PUSH_TITLE_KEY));
        }
        return getmessagefields.read(sQLiteDatabase.rawQuery(("SELECT " + r8lambda5tLpxyx6nsiTnLY5GKIpCwhnz8M.RemoteActionCompatParcelizer(arrayList5, ", ") + " FROM stationary_venue as sv INNER JOIN active_venue as v ON sv.active_venue_row_id = v.id INNER JOIN active_venue_tag as vt ON v.venue_id = vt.venue_id INNER JOIN active_tag as t ON vt.tag_id = t.id WHERE " + writeVar.IconCompatParcelizer()).concat(" ORDER BY sv.stationary_id asc, sv.likelihood desc"), writeVar.RemoteActionCompatParcelizer()), parselonglambda1);
    }
}
