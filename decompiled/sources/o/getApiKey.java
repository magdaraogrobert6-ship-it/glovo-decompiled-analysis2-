package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.ondevice.api.GeoLocation;
import com.sentiance.sdk.ondevice.api.venue.Venue;
import com.sentiance.sdk.semantictime.api.SemanticTime;
import com.sentiance.sdk.usercontext.api.UserContext;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "UserContextCreator")
public class getApiKey {
    public static final r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ write = new r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ(new UserContext.Builder().build(), new UserContext.Builder().build());
    private final getDataStoremigrateGeofencesListToJson RemoteActionCompatParcelizer;

    public final LinkedHashMap serializer() {
        return this.RemoteActionCompatParcelizer.serializer();
    }

    public getApiKey(getDataStoremigrateGeofencesListToJson getdatastoremigrategeofenceslisttojson) {
        this.RemoteActionCompatParcelizer = getdatastoremigrategeofenceslisttojson;
    }

    public final r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ read(r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ r8lambdarsg9irie_nt_zbfpq8jag00_omq) {
        UserContext userContextIconCompatParcelizer = r8lambdarsg9irie_nt_zbfpq8jag00_omq.IconCompatParcelizer();
        UserContext userContextRemoteActionCompatParcelizer = r8lambdarsg9irie_nt_zbfpq8jag00_omq.RemoteActionCompatParcelizer();
        getDataStoremigrateGeofencesListToJson getdatastoremigrategeofenceslisttojson = this.RemoteActionCompatParcelizer;
        SemanticTime semanticTimeIconCompatParcelizer = getdatastoremigrategeofenceslisttojson.IconCompatParcelizer();
        GeoLocation geoLocation = getdatastoremigrategeofenceslisttojson.read();
        return new r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ(new UserContext.Builder().setActiveSegments(userContextIconCompatParcelizer.getActiveSegments()).setLastKnownLocation(geoLocation).setHome(userContextIconCompatParcelizer.getHome()).setWork(userContextIconCompatParcelizer.getWork()).setEvents(userContextIconCompatParcelizer.getEvents()).setSemanticTime(semanticTimeIconCompatParcelizer).build(), new UserContext.Builder().setActiveSegments(userContextRemoteActionCompatParcelizer.getActiveSegments()).setLastKnownLocation(geoLocation).setHome(userContextRemoteActionCompatParcelizer.getHome()).setWork(userContextRemoteActionCompatParcelizer.getWork()).setEvents(userContextRemoteActionCompatParcelizer.getEvents()).setSemanticTime(semanticTimeIconCompatParcelizer).build());
    }

    public final r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ read() {
        getDataStoremigrateGeofencesListToJson getdatastoremigrategeofenceslisttojson = this.RemoteActionCompatParcelizer;
        ArrayList arrayListWrite = getdatastoremigrategeofenceslisttojson.write();
        GeoLocation geoLocation = getdatastoremigrategeofenceslisttojson.read();
        Venue venueRemoteActionCompatParcelizer = getdatastoremigrategeofenceslisttojson.RemoteActionCompatParcelizer();
        Venue venueMediaDescriptionCompat = getdatastoremigrategeofenceslisttojson.MediaDescriptionCompat();
        SemanticTime semanticTimeIconCompatParcelizer = getdatastoremigrategeofenceslisttojson.IconCompatParcelizer();
        ArrayList arrayListRemoteActionCompatParcelizer = getdatastoremigrategeofenceslisttojson.RemoteActionCompatParcelizer(true);
        ArrayList arrayListRemoteActionCompatParcelizer2 = getdatastoremigrategeofenceslisttojson.RemoteActionCompatParcelizer(false);
        UserContext.Builder semanticTime = new UserContext.Builder().setActiveSegments(arrayListWrite).setLastKnownLocation(geoLocation).setHome(venueRemoteActionCompatParcelizer).setWork(venueMediaDescriptionCompat).setSemanticTime(semanticTimeIconCompatParcelizer);
        return new r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ(semanticTime.setEvents(arrayListRemoteActionCompatParcelizer).build(), semanticTime.setEvents(arrayListRemoteActionCompatParcelizer2).build());
    }
}
