package o;

import bo.app.wg$$ExternalSyntheticLambda0;
import com.sentiance.sdk.InjectUsing;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "ProcessedTimelineDataTracker", componentName = "ProcessedTimelineDataTracker")
public class CaptionedImageCard implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final com.sentiance.sdk.util.c RemoteActionCompatParcelizer;
    private final setHeaderTextColor read;

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.RemoteActionCompatParcelizer.read();
    }

    public CaptionedImageCard(com.sentiance.sdk.util.c cVar, setHeaderTextColor setheadertextcolor) {
        this.RemoteActionCompatParcelizer = cVar;
        this.read = setheadertextcolor;
    }

    public final <T extends r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE> List<T> IconCompatParcelizer(isPushPrimer<T> ispushprimer) {
        long jIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer("last_processed_".concat(ispushprimer.getClass().getName()), 0L);
        setHeaderTextColor setheadertextcolor = this.read;
        setheadertextcolor.getClass();
        List<T> list = (List) setheadertextcolor.serializer(Collections.EMPTY_LIST, new getNotificationResponsivenessMs(setheadertextcolor, jIconCompatParcelizer, ispushprimer));
        Collections.sort(list, new wg$$ExternalSyntheticLambda0(20));
        return list;
    }

    public final void read(List<? extends r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE> list) {
        if (list.isEmpty()) {
            return;
        }
        Collections.sort(list, new wg$$ExternalSyntheticLambda0(21));
        r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE r8lambdajpyyzonaiuxh7ebz6m40cuqfrme = list.get(0);
        if (r8lambdajpyyzonaiuxh7ebz6m40cuqfrme.write() instanceof isPushPrimer) {
            this.RemoteActionCompatParcelizer.read(r8lambdajpyyzonaiuxh7ebz6m40cuqfrme.ParcelableVolumeInfo(), "last_processed_".concat(((isPushPrimer) r8lambdajpyyzonaiuxh7ebz6m40cuqfrme.write()).getClass().getName()));
        }
    }
}
