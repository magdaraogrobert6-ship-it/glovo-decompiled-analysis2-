package o;

import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.ondevice.timeline.TimelineTransportType;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaFFntGI86VJ4J7lg1XElfn0Y9xbg {
    private final ConfigurationManager serializer;
    private final r8lambdaVwVjafNQP84EMLRdaiP4PpcyzXk write;

    public final boolean IconCompatParcelizer() {
        if (this.serializer.addOnContextAvailableListener()) {
            return androidx.sqlite.SQLite.read(null, TimelineTransportType.MOTORCYCLE, TimelineTransportType.BIKE).contains(this.write.write().read(r8lambdaFVBkuEGcgKAtbTpeyOsyfECOmSA.read));
        }
        return false;
    }

    public final boolean RemoteActionCompatParcelizer() {
        if (this.serializer.addOnContextAvailableListener()) {
            return this.write.write().read(r8lambdaFVBkuEGcgKAtbTpeyOsyfECOmSA.read) == TimelineTransportType.CAR;
        }
        return true;
    }

    public r8lambdaFFntGI86VJ4J7lg1XElfn0Y9xbg(ConfigurationManager configurationManager, r8lambdaVwVjafNQP84EMLRdaiP4PpcyzXk r8lambdavwvjafnqp84emlrdaip4ppcyzxk) {
        configurationManager.getClass();
        r8lambdavwvjafnqp84emlrdaip4ppcyzxk.getClass();
        this.serializer = configurationManager;
        this.write = r8lambdavwvjafnqp84emlrdaip4ppcyzxk;
    }
}
