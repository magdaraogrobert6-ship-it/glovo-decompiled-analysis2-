package o;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class beamBeats_I7lrPNgisInDirectionOfSearch {
    public static final beamBeats_I7lrPNgisInDirectionOfSearch RemoteActionCompatParcelizer;
    public static volatile beamBeats_I7lrPNgisInDirectionOfSearch read;

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        beamBeats_I7lrPNgisInDirectionOfSearch beambeats_i7lrpngisindirectionofsearch = new beamBeats_I7lrPNgisInDirectionOfSearch();
        Map map = Collections.EMPTY_MAP;
        RemoteActionCompatParcelizer = beambeats_i7lrpngisindirectionofsearch;
    }

    public static beamBeats_I7lrPNgisInDirectionOfSearch IconCompatParcelizer() {
        beamBeats_I7lrPNgisInDirectionOfSearch beambeats_i7lrpngisindirectionofsearch;
        beamBeats_I7lrPNgisInDirectionOfSearch beambeats_i7lrpngisindirectionofsearch2 = read;
        if (beambeats_i7lrpngisindirectionofsearch2 != null) {
            return beambeats_i7lrpngisindirectionofsearch2;
        }
        synchronized (beamBeats_I7lrPNgisInDirectionOfSearch.class) {
            beambeats_i7lrpngisindirectionofsearch = read;
            if (beambeats_i7lrpngisindirectionofsearch == null) {
                Class cls = beamBeats_I7lrPNgmajorAxisDistance.write;
                if (cls != null) {
                    try {
                        beambeats_i7lrpngisindirectionofsearch = (beamBeats_I7lrPNgisInDirectionOfSearch) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                    } catch (Exception unused) {
                        beambeats_i7lrpngisindirectionofsearch = RemoteActionCompatParcelizer;
                    }
                } else {
                    beambeats_i7lrpngisindirectionofsearch = RemoteActionCompatParcelizer;
                }
                read = beambeats_i7lrpngisindirectionofsearch;
            }
        }
        return beambeats_i7lrpngisindirectionofsearch;
    }
}
