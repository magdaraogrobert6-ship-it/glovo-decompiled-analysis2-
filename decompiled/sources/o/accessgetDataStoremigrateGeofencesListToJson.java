package o;

import com.sentiance.sdk.events.eventextras.TimelineUpdateDetails;
import com.sentiance.sdk.usercontext.UserContextProvider;
import com.sentiance.sdk.usercontext.api.UserContextUpdateCriteria;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetDataStoremigrateGeofencesListToJson extends getLatitudeannotations<r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog> {
    final /* synthetic */ UserContextProvider IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetDataStoremigrateGeofencesListToJson(UserContextProvider userContextProvider, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "UserContextProvider");
        this.IconCompatParcelizer = userContextProvider;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog> getlongitudeannotations) {
        UserContextUpdateCriteria userContextUpdateCriteria;
        r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog r8lambdaqoukgs6h1gfby4ttokxnao8yog = getlongitudeannotations.read();
        r8lambdaqoukgs6h1gfby4ttokxnao8yog.getClass();
        List<Byte> list = r8lambdaqoukgs6h1gfby4ttokxnao8yog.write;
        list.getClass();
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        for (Byte b : list) {
            byte[] bArr = UserContextProvider.RemoteActionCompatParcelizer;
            b.getClass();
            if (onContentCardClicked.read(bArr, b.byteValue())) {
                Object objRemoteActionCompatParcelizer = getlongitudeannotations.RemoteActionCompatParcelizer();
                TimelineUpdateDetails timelineUpdateDetails = objRemoteActionCompatParcelizer instanceof TimelineUpdateDetails ? (TimelineUpdateDetails) objRemoteActionCompatParcelizer : null;
                UserContextProvider userContextProvider = this.IconCompatParcelizer;
                if (timelineUpdateDetails == null) {
                    userContextProvider.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Received TimelineUpdateEvent with no TimelineUpdateDetails", new Object[0]);
                    return;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (TimelineUpdateDetails.UpdatedDataType updatedDataType : timelineUpdateDetails.RemoteActionCompatParcelizer().keySet()) {
                    updatedDataType.getClass();
                    int i = accessgetDataStoremigrateRegisteredGeofencesListToJson.write[updatedDataType.ordinal()];
                    if (i == 1) {
                        userContextUpdateCriteria = UserContextUpdateCriteria.VISITED_VENUES;
                    } else if (i != 2) {
                        userContextUpdateCriteria = i != 3 ? null : UserContextUpdateCriteria.ACTIVE_SEGMENTS;
                    } else {
                        userContextUpdateCriteria = UserContextUpdateCriteria.CURRENT_EVENT;
                    }
                    if (userContextUpdateCriteria != null) {
                        linkedHashSet.add(userContextUpdateCriteria);
                    }
                }
                UserContextProvider.RemoteActionCompatParcelizer(userContextProvider, onContentCardDismissed.PlaybackStateCompat(linkedHashSet));
                return;
            }
        }
    }
}
