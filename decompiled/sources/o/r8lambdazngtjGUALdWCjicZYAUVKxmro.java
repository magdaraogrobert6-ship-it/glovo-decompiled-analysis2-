package o;

import bo.app.wg$$ExternalSyntheticLambda0;
import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.uber.h3core.H3Core$$ExternalSyntheticLambda2;
import com.uber.h3core.H3Core$$ExternalSyntheticLambda3;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdazngtjGUALdWCjicZYAUVKxmro extends r8lambdagzL4jp4oDuRXXeRCE9jPe7Cswjw {
    private final ConfigurationManager RemoteActionCompatParcelizer;
    private final initializeGeofenceslambda1 write;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class write {
        public write(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public abstract long read();

    public abstract long serializer();

    public final int RatingCompat() {
        ConfigurationManager configurationManager = this.RemoteActionCompatParcelizer;
        configurationManager.getClass();
        short sShortValue = ((Short) Arrays.stream(DetectionTrigger.values()).map(new H3Core$$ExternalSyntheticLambda3(2, configurationManager)).flatMap(new H3Core$$ExternalSyntheticLambda2(4)).max(new wg$$ExternalSyntheticLambda0(18)).orElse((short) 0)).shortValue();
        return (int) (((long) Math.max(200, (int) sShortValue)) * Math.max(Math.max(30L, 120L), read() / 1000));
    }

    static {
        new write(null);
    }

    public r8lambdazngtjGUALdWCjicZYAUVKxmro(initializeGeofenceslambda1 initializegeofenceslambda1, ConfigurationManager configurationManager) {
        initializegeofenceslambda1.getClass();
        configurationManager.getClass();
        this.write = initializegeofenceslambda1;
        this.RemoteActionCompatParcelizer = configurationManager;
    }

    public final boolean IconCompatParcelizer(r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da, r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da2) {
        r8lambdacuje9gyuh58gabwrad8wwadt7da.getClass();
        r8lambdacuje9gyuh58gabwrad8wwadt7da2.getClass();
        if (!MediaMetadataCompat()) {
            return true;
        }
        if (r8lambdacuje9gyuh58gabwrad8wwadt7da2.RatingCompat() || r8lambdacuje9gyuh58gabwrad8wwadt7da.RatingCompat()) {
            return false;
        }
        int i = read(r8lambdacuje9gyuh58gabwrad8wwadt7da2.IconCompatParcelizer());
        int i2 = read(r8lambdacuje9gyuh58gabwrad8wwadt7da.IconCompatParcelizer());
        if (i == i2) {
            return true;
        }
        int iMax = Math.max(i, i2);
        long jSerializer = (read() * ((long) iMax)) + serializer();
        int iRemoteActionCompatParcelizer = r8lambdacuje9gyuh58gabwrad8wwadt7da2.RemoteActionCompatParcelizer(jSerializer);
        int iRemoteActionCompatParcelizer2 = r8lambdacuje9gyuh58gabwrad8wwadt7da.RemoteActionCompatParcelizer(jSerializer);
        r8lambdacuje9gyuh58gabwrad8wwadt7da2.IconCompatParcelizer(iRemoteActionCompatParcelizer);
        r8lambdacuje9gyuh58gabwrad8wwadt7da.IconCompatParcelizer(iRemoteActionCompatParcelizer2);
        return true;
    }

    public final boolean MediaMetadataCompat() {
        return this.write.write(4);
    }

    public final int read(long j) {
        return (int) ((j - serializer()) / read());
    }
}
