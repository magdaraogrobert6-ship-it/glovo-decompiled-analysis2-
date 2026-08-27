package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.TransmittableDataType;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.payload.submission.SubmissionEvaluationConfig;
import com.sentiance.sdk.util.Optional;
import com.sentiance.sdk.util.database.WhereClause;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "PayloadSubmissionEvaluator")
public class BrazeNotificationUtilsExternalSyntheticLambda0 {
    private final wakeScreenIfAppropriatelambda3 IconCompatParcelizer;
    private final retrieveRegisteredGeofencesFromLocalStoragelambda0 MediaBrowserCompatMediaItem;
    private final isGeofencesEnabledFromEnvironmentlambda1 MediaDescriptionCompat;
    private final ConfigurationManager RemoteActionCompatParcelizer;
    private final BrazeNotificationUtilsExternalSyntheticLambda1 read;
    private final SubmissionEvaluationConfig serializer;
    private final parseLonglambda0 write;

    public final void IconCompatParcelizer(List<wakeScreenIfAppropriatelambda3.serializer> list) {
        List<String> list2 = (List) this.serializer.RemoteActionCompatParcelizer().get(SubmissionEvaluationConfig.Category.REALTIME_ONLY);
        if (list2 == null) {
            list2 = Collections.EMPTY_LIST;
        }
        wakeScreenIfAppropriatelambda3 wakescreenifappropriatelambda3 = this.IconCompatParcelizer;
        List<wakeScreenIfAppropriatelambda3.serializer> list3 = wakescreenifappropriatelambda3.read(wakescreenifappropriatelambda3.IconCompatParcelizer(list2));
        HashSet hashSet = new HashSet(list);
        for (wakeScreenIfAppropriatelambda3.serializer serializerVar : list3) {
            if (!hashSet.contains(serializerVar)) {
                wakescreenifappropriatelambda3.serializer(serializerVar.IconCompatParcelizer);
            }
        }
    }

    public final void serializer(List<wakeScreenIfAppropriatelambda3.serializer> list) {
        Set<TransmittableDataType> setResultReceiver = this.RemoteActionCompatParcelizer.ResultReceiver();
        if (setResultReceiver.contains(TransmittableDataType.ALL)) {
            return;
        }
        HashSet hashSetWrite = this.read.write(setResultReceiver);
        Iterator<wakeScreenIfAppropriatelambda3.serializer> it = list.iterator();
        while (it.hasNext()) {
            wakeScreenIfAppropriatelambda3.serializer next = it.next();
            if (!hashSetWrite.contains(next.write)) {
                this.IconCompatParcelizer.serializer(next.IconCompatParcelizer);
                it.remove();
                this.write.IconCompatParcelizer("Removing %s payload because not allowed to submit", next.write);
            }
        }
    }

    public final List<wakeScreenIfAppropriatelambda3.serializer> write(List<wakeScreenIfAppropriatelambda3.serializer> list) {
        List<String> list2 = (List) this.serializer.RemoteActionCompatParcelizer().get(SubmissionEvaluationConfig.Category.REALTIME_PREFERRED);
        if (list2 == null) {
            list2 = Collections.EMPTY_LIST;
        }
        wakeScreenIfAppropriatelambda3 wakescreenifappropriatelambda3 = this.IconCompatParcelizer;
        List<wakeScreenIfAppropriatelambda3.serializer> list3 = wakescreenifappropriatelambda3.read(wakescreenifappropriatelambda3.IconCompatParcelizer(list2));
        Iterator<wakeScreenIfAppropriatelambda3.serializer> it = list.iterator();
        while (it.hasNext()) {
            list3.remove(it.next());
        }
        Long lValueOf = list3.isEmpty() ? null : Long.valueOf(list3.get(0).RatingCompat);
        if (lValueOf == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (wakeScreenIfAppropriatelambda3.serializer serializerVar : list) {
            if (serializerVar.RatingCompat > lValueOf.longValue()) {
                break;
            }
            arrayList.add(serializerVar);
        }
        return arrayList;
    }

    public BrazeNotificationUtilsExternalSyntheticLambda0(SubmissionEvaluationConfig submissionEvaluationConfig, wakeScreenIfAppropriatelambda3 wakescreenifappropriatelambda3, ConfigurationManager configurationManager, parseLonglambda0 parselonglambda0, BrazeNotificationUtilsExternalSyntheticLambda1 brazeNotificationUtilsExternalSyntheticLambda1, retrieveRegisteredGeofencesFromLocalStoragelambda0 retrieveregisteredgeofencesfromlocalstoragelambda0, isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1) {
        this.serializer = submissionEvaluationConfig;
        this.IconCompatParcelizer = wakescreenifappropriatelambda3;
        this.RemoteActionCompatParcelizer = configurationManager;
        this.write = parselonglambda0;
        this.read = brazeNotificationUtilsExternalSyntheticLambda1;
        this.MediaBrowserCompatMediaItem = retrieveregisteredgeofencesfromlocalstoragelambda0;
        this.MediaDescriptionCompat = isgeofencesenabledfromenvironmentlambda1;
    }

    public final boolean read(String str) {
        return this.serializer.write(str) != SubmissionEvaluationConfig.Category.REALTIME_ONLY;
    }

    public final boolean IconCompatParcelizer(String str) {
        return this.serializer.write(str) != SubmissionEvaluationConfig.Category.REALTIME_PREFERRED;
    }

    public final Optional<WhereClause> read() {
        List<String> listIconCompatParcelizer = this.serializer.IconCompatParcelizer();
        if (listIconCompatParcelizer.isEmpty()) {
            return Optional.MediaSessionCompatQueueItem();
        }
        return Optional.RemoteActionCompatParcelizer(this.IconCompatParcelizer.IconCompatParcelizer(listIconCompatParcelizer));
    }

    public final boolean RemoteActionCompatParcelizer(String str) {
        SubmissionEvaluationConfig submissionEvaluationConfig = this.serializer;
        if (!submissionEvaluationConfig.IconCompatParcelizer().contains(str)) {
            return false;
        }
        if (!submissionEvaluationConfig.write().contains(str) && this.MediaDescriptionCompat.read() == 2) {
            return this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
        }
        return true;
    }
}
