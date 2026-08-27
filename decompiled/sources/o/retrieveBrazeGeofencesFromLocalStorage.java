package o;

import com.sentiance.sdk.drivinginsights.api.DrivingInsights;
import com.sentiance.sdk.drivinginsights.api.PhoneUsageEvent;
import com.sentiance.sdk.drivinginsights.api.SafetyScores;
import com.sentiance.sdk.events.eventextras.TimelineUpdateDetails;
import com.sentiance.sdk.util.DateTime;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class retrieveBrazeGeofencesFromLocalStorage extends getLatitudeannotations<r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog> {
    final /* synthetic */ onLocationRequestComplete RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public retrieveBrazeGeofencesFromLocalStorage(onLocationRequestComplete onlocationrequestcomplete, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "HarshDrivingEventProvider");
        this.RemoteActionCompatParcelizer = onlocationrequestcomplete;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog> getlongitudeannotations) {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        r8lambda92cmOJndUFWJcG9v70hQ0grNTsw r8lambda92cmojndufwjcg9v70hq0grntsw;
        List<String> list;
        TimelineUpdateDetails timelineUpdateDetails = (TimelineUpdateDetails) getlongitudeannotations.RemoteActionCompatParcelizer();
        boolean zContains = timelineUpdateDetails != null ? timelineUpdateDetails.RemoteActionCompatParcelizer().keySet().contains(onLocationRequestComplete.serializer) : false;
        onLocationRequestComplete onlocationrequestcomplete = this.RemoteActionCompatParcelizer;
        if (!zContains) {
            List list2 = getlongitudeannotations.read().write;
            InAppMessageControl.read().getClass();
            if (!list2.contains((byte) 7) || (r8lambdaunavo3sxub_pc9xroryotnrlvsm = onlocationrequestcomplete.ParcelableVolumeInfo) == null || (r8lambda92cmojndufwjcg9v70hq0grntsw = (r8lambda92cmOJndUFWJcG9v70hQ0grNTsw) onlocationrequestcomplete.read.serializer(InAppMessageControl.read())) == null || !r8lambda92cmojndufwjcg9v70hq0grntsw.serializer()) {
                return;
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new PhoneUsageEvent(DateTime.fromMillis(r8lambda92cmojndufwjcg9v70hq0grntsw.PlaybackStateCompatCustomAction()), DateTime.fromMillis(r8lambda92cmojndufwjcg9v70hq0grntsw.PlaybackStateCompatCustomAction() + ((long) r8lambda92cmojndufwjcg9v70hq0grntsw.read())), instance_delegatelambda0.write, PhoneUsageEvent.CallState.UNAVAILABLE));
            return;
        }
        TimelineUpdateDetails timelineUpdateDetails2 = (TimelineUpdateDetails) getlongitudeannotations.RemoteActionCompatParcelizer();
        String str = null;
        Map<TimelineUpdateDetails.UpdatedDataType, List<String>> mapRemoteActionCompatParcelizer = timelineUpdateDetails2 == null ? null : timelineUpdateDetails2.RemoteActionCompatParcelizer();
        if (mapRemoteActionCompatParcelizer != null && (list = mapRemoteActionCompatParcelizer.get(onLocationRequestComplete.serializer)) != null && !list.isEmpty()) {
            str = list.get(0);
        }
        if (str != null) {
            DrivingInsights drivingInsights = onLocationRequestComplete.read(onlocationrequestcomplete, str);
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = onlocationrequestcomplete.PlaybackStateCompatCustomAction;
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm2 == null || drivingInsights == null) {
                return;
            }
            SafetyScores safetyScores = drivingInsights.getSafetyScores();
            safetyScores.getClass();
            if (safetyScores.getSmoothScore() == null && safetyScores.getFocusScore() == null && safetyScores.getCallWhileMovingScore() == null && safetyScores.getLegalScore() == null && safetyScores.getOverallScore() == null) {
                return;
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(drivingInsights);
        }
    }
}
