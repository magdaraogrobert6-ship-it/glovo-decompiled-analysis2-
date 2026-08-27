package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.TransmittableDataType;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "user-configuration-manager", componentName = "UserConfigurationManager")
public class retrieveRegisteredGeofencesFromLocalStoragelambda0 implements removeGeofencesRegisteredWithGeofencingClientlambda2, r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final migrateTriggersReeligibilityToJsonlambda1<Set<TransmittableDataType>> IconCompatParcelizer = new GooglePlayLocationUtilsExternalSyntheticLambda16(this);
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final com.sentiance.sdk.util.c read;

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            this.IconCompatParcelizer.write();
        }
    }

    public final void read(Set<TransmittableDataType> set) {
        synchronized (this) {
            HashSet hashSet = new HashSet();
            Iterator<TransmittableDataType> it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().name());
            }
            this.read.serializer("sentiance-transmittable-data-types", hashSet);
            this.IconCompatParcelizer.read(set);
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.read.read();
    }

    public retrieveRegisteredGeofencesFromLocalStoragelambda0(com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0) {
        this.read = cVar;
        this.RemoteActionCompatParcelizer = parselonglambda0;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.read.read("sentiance-is-allowed-to-use-mobile-data", true);
    }

    public final Set<TransmittableDataType> IconCompatParcelizer() {
        Set<TransmittableDataType> set;
        synchronized (this) {
            set = this.IconCompatParcelizer.read();
        }
        return set;
    }

    public final void IconCompatParcelizer(boolean z) {
        this.read.IconCompatParcelizer("sentiance-is-allowed-to-use-mobile-data", z);
    }
}
