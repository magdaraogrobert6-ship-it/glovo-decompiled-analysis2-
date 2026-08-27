package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueSignificance;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueType;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class getCreated extends getViewedannotations<r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc> {
    final /* synthetic */ getOpenUriInWebViewannotations RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCreated(getOpenUriInWebViewannotations getopenuriinwebviewannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(getopenuriinwebviewannotations, readandroid_sdk_base_releaseVar);
        this.RemoteActionCompatParcelizer = getopenuriinwebviewannotations;
    }

    @Override // o.getViewedannotations
    public final List<getImageStyle> serializer(getLongitudeannotations<r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc> getlongitudeannotations) {
        VenueSignificance venueSignificance;
        r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc r8lambdagn7c5ha_lryxg0qpuqgwsic0hc = getlongitudeannotations.read();
        getOpenUriInWebViewannotations getopenuriinwebviewannotations = this.RemoteActionCompatParcelizer;
        r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ r8lambda59swxcybpdsiw8mt9h_rosbr8qq = getopenuriinwebviewannotations.read;
        Byte b = r8lambdagn7c5ha_lryxg0qpuqgwsic0hc.read;
        String str = r8lambdagn7c5ha_lryxg0qpuqgwsic0hc.serializer;
        byte bByteValue = b.byteValue();
        r8lambda59swxcybpdsiw8mt9h_rosbr8qq.getClass();
        if (bByteValue == 1) {
            venueSignificance = VenueSignificance.UNSET;
        } else if (bByteValue == 2) {
            venueSignificance = VenueSignificance.UNKNOWN_PROVISIONAL;
        } else if (bByteValue == 3) {
            venueSignificance = VenueSignificance.POI_PROVISIONAL;
        } else if (bByteValue == 4) {
            venueSignificance = VenueSignificance.HOME_PROVISIONAL;
        } else if (bByteValue == 5) {
            venueSignificance = VenueSignificance.WORK_PROVISIONAL;
        } else if (bByteValue == 6) {
            venueSignificance = VenueSignificance.UNKNOWN;
        } else if (bByteValue == 7) {
            venueSignificance = VenueSignificance.POI;
        } else if (bByteValue == 8) {
            venueSignificance = VenueSignificance.HOME;
        } else {
            if (bByteValue != 9) {
                MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(c8$$ExternalSyntheticOutline0.m(bByteValue, "Undefined venue significance thrift constant "));
                return null;
            }
            venueSignificance = VenueSignificance.WORK;
        }
        Short sh = r8lambdagn7c5ha_lryxg0qpuqgwsic0hc.RemoteActionCompatParcelizer;
        VenueType venueTypeFromThriftConstant = sh != null ? VenueType.fromThriftConstant(sh.shortValue()) : null;
        getopenuriinwebviewannotations.IconCompatParcelizer.IconCompatParcelizer("Update stationary venue, unique ID: %s, venue significance: %s, venue type: %s", str, venueSignificance, venueTypeFromThriftConstant);
        return getopenuriinwebviewannotations.PlaybackStateCompatCustomAction.read(str, venueSignificance, venueTypeFromThriftConstant);
    }
}
