package o;

import android.content.Context;
import android.location.Location;
import com.sentiance.core.model.thrift.E1$b;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.venuemapper.PointOfInterest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "VenueMapConfigurationManager")
public class migrateTriggersStorageToJsonlambda4 implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private static final List<accessgetUserCachep> serializer = Collections.EMPTY_LIST;
    private File IconCompatParcelizer;
    private removeFromCustomAttributeArraylambda0 RatingCompat;
    private final getVerticalAccuracy RemoteActionCompatParcelizer;
    private final Context read;
    private final parseLonglambda0 write;

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        synchronized (this) {
            RemoteActionCompatParcelizer().delete();
            E1$b e1$b = new E1$b();
            List<accessgetUserCachep> list = serializer;
            if (list == null) {
                throw new NullPointerException("Required field 'points_of_interest' cannot be null");
            }
            e1$b.serializer = list;
            this.RatingCompat = e1$b.write();
        }
    }

    public final void serializer(removeFromCustomAttributeArraylambda0 removefromcustomattributearraylambda0) {
        synchronized (this) {
            this.RatingCompat = removefromcustomattributearraylambda0;
            if (removefromcustomattributearraylambda0 != null) {
                this.RemoteActionCompatParcelizer.read(removeFromCustomAttributeArraylambda0.read, removefromcustomattributearraylambda0, RemoteActionCompatParcelizer(), false);
            }
            this.write.IconCompatParcelizer("VenueMap Configuration saved: %s", removefromcustomattributearraylambda0);
        }
    }

    public migrateTriggersStorageToJsonlambda4(parseLonglambda0 parselonglambda0, Context context, getVerticalAccuracy getverticalaccuracy) {
        removeFromCustomAttributeArraylambda0 removefromcustomattributearraylambda0Write;
        this.write = parselonglambda0;
        this.read = context;
        this.RemoteActionCompatParcelizer = getverticalaccuracy;
        this.IconCompatParcelizer = RemoteActionCompatParcelizer();
        File file = new File(context.getFilesDir(), "sentiance-venue-config");
        if (file.exists()) {
            try {
                migrateSealedSessionsMapToJsonlambda0.IconCompatParcelizer(file, new File(context.getNoBackupFilesDir(), "sentiance-venue-config"));
                file.delete();
            } catch (IOException unused) {
                this.write.RemoteActionCompatParcelizer("Failed to copy config file to no-backup dir", new Object[0]);
                this.IconCompatParcelizer = new File(this.read.getFilesDir(), "sentiance-venue-config");
            }
        }
        synchronized (this) {
            removefromcustomattributearraylambda0Write = this.RatingCompat;
            if (removefromcustomattributearraylambda0Write == null) {
                File fileRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                removefromcustomattributearraylambda0Write = fileRemoteActionCompatParcelizer.exists() ? (removeFromCustomAttributeArraylambda0) this.RemoteActionCompatParcelizer.write(removeFromCustomAttributeArraylambda0.read, fileRemoteActionCompatParcelizer).RemoteActionCompatParcelizer() : null;
                if (removefromcustomattributearraylambda0Write == null) {
                    E1$b e1$b = new E1$b();
                    List<accessgetUserCachep> list = serializer;
                    if (list == null) {
                        throw new NullPointerException("Required field 'points_of_interest' cannot be null");
                    }
                    e1$b.serializer = list;
                    removefromcustomattributearraylambda0Write = e1$b.write();
                }
            }
        }
        this.RatingCompat = removefromcustomattributearraylambda0Write;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.singletonList(RemoteActionCompatParcelizer());
    }

    public final ArrayList read(Location location) {
        ArrayList arrayList;
        if (location == null) {
            return new ArrayList();
        }
        synchronized (this) {
            arrayList = new ArrayList();
            Iterator it = this.RatingCompat.IconCompatParcelizer.iterator();
            while (it.hasNext()) {
                arrayList.add(PointOfInterest.fromThrift((accessgetUserCachep) it.next()));
            }
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return arrayList;
            }
            Location location2 = new Location("");
            Double latitude = ((PointOfInterest) arrayList.get(size)).getPoiLocation().getPoiPlace().getLatitude();
            Double longitude = ((PointOfInterest) arrayList.get(size)).getPoiLocation().getPoiPlace().getLongitude();
            if (latitude != null && longitude != null) {
                location2.setLatitude(latitude.doubleValue());
                location2.setLongitude(longitude.doubleValue());
                if (location.distanceTo(location2) > 100.0f) {
                    arrayList.remove(size);
                }
            } else {
                arrayList.remove(size);
            }
        }
    }

    public final boolean serializer() {
        return RemoteActionCompatParcelizer().exists();
    }

    private File RemoteActionCompatParcelizer() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new File(this.read.getNoBackupFilesDir(), "sentiance-venue-config");
        }
        return this.IconCompatParcelizer;
    }
}
