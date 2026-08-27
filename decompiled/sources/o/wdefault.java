package o;

import java.text.SimpleDateFormat;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wdefault {
    public LocalDate MediaMetadataCompat;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaSessionCompatQueueItem;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
    public final SimpleDateFormat write = new SimpleDateFormat("MMM yyyy", java.util.Locale.getDefault());

    public final LocalDate MediaDescriptionCompat() {
        return this.MediaMetadataCompat;
    }

    public abstract void RemoteActionCompatParcelizer();

    public abstract void RemoteActionCompatParcelizer(int i);

    public abstract void RemoteActionCompatParcelizer(LocalDate localDate);

    public abstract void read();

    public abstract void write();

    public boolean IconCompatParcelizer() {
        return !((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, serializer()}, getCieXyz.write())).booleanValue();
    }

    public String RatingCompat() {
        return "Today";
    }

    public static LocalDate serializer() {
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        return localDateNow;
    }

    public wdefault() {
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        this.MediaMetadataCompat = localDateNow;
        this.MediaSessionCompatQueueItem = new BrazeInAppMessageManagerExternalSyntheticLambda45(20);
        this.RemoteActionCompatParcelizer = new BrazeInAppMessageManagerExternalSyntheticLambda45(21);
    }
}
