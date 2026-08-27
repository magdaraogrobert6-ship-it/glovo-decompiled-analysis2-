package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import bo.app.wg$$ExternalSyntheticLambda0;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.processguard.Guard$Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "ActivityRecognitionAPI", guardType = Guard$Type.REFERENCE_COUNTED)
public class getTotalDiscounts {
    private final ServerConfigDataStoreProviderCompanion IconCompatParcelizer;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 MediaBrowserCompatMediaItem;
    private final ArrayList MediaDescriptionCompat = new ArrayList();
    private final r8lambdaEPgoZ_b4yaunNACjVUptzhsYstc MediaMetadataCompat;
    private BrazeFirebaseMessagingService MediaSessionCompatQueueItem;
    private serializer RatingCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RemoteActionCompatParcelizer;
    private final Context read;
    private final parseLonglambda0 serializer;
    private final onLocationRequestCompletelambda1 write;

    public static int IconCompatParcelizer(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 5;
                    if (i != 5) {
                        i2 = 7;
                        if (i != 7) {
                            i2 = 8;
                            if (i != 8) {
                                return 4;
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    public final void IconCompatParcelizer(Intent intent) {
        synchronized (this) {
            ActivityRecognitionResult activityRecognitionResultExtractResult = ActivityRecognitionResult.extractResult(intent);
            if (activityRecognitionResultExtractResult == null) {
                this.serializer.IconCompatParcelizer("Could not extract result from intent", new Object[0]);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (DetectedActivity detectedActivity : activityRecognitionResultExtractResult.getProbableActivities()) {
                arrayList.add(detectedActivity.getType() + ":" + detectedActivity.getConfidence());
            }
            String strRemoteActionCompatParcelizer = r8lambda5tLpxyx6nsiTnLY5GKIpCwhnz8M.RemoteActionCompatParcelizer(arrayList, ", ");
            this.serializer.serializer("Google Activity: " + strRemoteActionCompatParcelizer, new Object[0]);
            long time = activityRecognitionResultExtractResult.getTime();
            this.RemoteActionCompatParcelizer.getClass();
            long jMin = Math.min(time, System.currentTimeMillis());
            BrazeFirebaseMessagingService brazeFirebaseMessagingServiceIconCompatParcelizer = IconCompatParcelizer(activityRecognitionResultExtractResult, jMin);
            BrazeFirebaseMessagingService brazeFirebaseMessagingService = this.MediaSessionCompatQueueItem;
            this.MediaSessionCompatQueueItem = brazeFirebaseMessagingServiceIconCompatParcelizer;
            if (brazeFirebaseMessagingService != null && brazeFirebaseMessagingService.equals(brazeFirebaseMessagingServiceIconCompatParcelizer)) {
                this.serializer.IconCompatParcelizer("Detected a duplicate motion activity, ignoring", new Object[0]);
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (DetectedActivity detectedActivity2 : activityRecognitionResultExtractResult.getProbableActivities()) {
                arrayList2.add(new BrazeFirebaseMessagingService(IconCompatParcelizer(detectedActivity2.getType()), detectedActivity2.getConfidence(), jMin));
            }
            RemoteActionCompatParcelizer(arrayList2, brazeFirebaseMessagingServiceIconCompatParcelizer);
        }
    }

    public static class serializer {
        private final long IconCompatParcelizer;
        private final BrazeAmazonDeviceMessagingReceiver RemoteActionCompatParcelizer;
        private final clearandroid_sdk_base_release serializer;

        public final clearandroid_sdk_base_release read() {
            return this.serializer;
        }

        public final BrazeAmazonDeviceMessagingReceiver serializer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final long write() {
            return this.IconCompatParcelizer;
        }

        public serializer(long j, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar, BrazeAmazonDeviceMessagingReceiver brazeAmazonDeviceMessagingReceiver) {
            this.IconCompatParcelizer = j;
            this.serializer = clearandroid_sdk_base_releaseVar;
            this.RemoteActionCompatParcelizer = brazeAmazonDeviceMessagingReceiver;
        }
    }

    public getTotalDiscounts(Context context, parseLonglambda0 parselonglambda0, onLocationRequestCompletelambda1 onlocationrequestcompletelambda1, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, ServerConfigDataStoreProviderCompanion serverConfigDataStoreProviderCompanion, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, r8lambdaEPgoZ_b4yaunNACjVUptzhsYstc r8lambdaepgoz_b4yaunnacjvuptzhsystc) {
        this.read = context;
        this.serializer = parselonglambda0;
        this.write = onlocationrequestcompletelambda1;
        this.RemoteActionCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.IconCompatParcelizer = serverConfigDataStoreProviderCompanion;
        this.MediaMetadataCompat = r8lambdaepgoz_b4yaunnacjvuptzhsystc;
        this.MediaBrowserCompatMediaItem = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
    }

    public static void read(getTotalDiscounts gettotaldiscounts, Exception exc) {
        gettotaldiscounts.serializer.IconCompatParcelizer(false, exc, "Failed to remove activity updates", new Object[0]);
    }

    public static void write(getTotalDiscounts gettotaldiscounts, Exception exc) {
        gettotaldiscounts.serializer.IconCompatParcelizer(false, exc, "Failed to request activity updates", new Object[0]);
    }

    private static BrazeFirebaseMessagingService IconCompatParcelizer(ActivityRecognitionResult activityRecognitionResult, long j) {
        DetectedActivity mostProbableActivity = activityRecognitionResult.getMostProbableActivity();
        if (mostProbableActivity.getType() != 2) {
            return new BrazeFirebaseMessagingService(mostProbableActivity.getType(), mostProbableActivity.getConfidence(), j);
        }
        List listAsList = Arrays.asList(7, 8);
        int confidence = 0;
        DetectedActivity detectedActivity = null;
        for (DetectedActivity detectedActivity2 : activityRecognitionResult.getProbableActivities()) {
            if (listAsList.contains(Integer.valueOf(detectedActivity2.getType())) && detectedActivity2.getConfidence() > confidence) {
                confidence = detectedActivity2.getConfidence();
                detectedActivity = detectedActivity2;
            }
        }
        return detectedActivity == null ? new BrazeFirebaseMessagingService(IconCompatParcelizer(mostProbableActivity.getType()), mostProbableActivity.getConfidence(), j) : new BrazeFirebaseMessagingService(IconCompatParcelizer(detectedActivity.getType()), detectedActivity.getConfidence(), j);
    }

    private serializer write() {
        synchronized (this) {
            if (this.MediaDescriptionCompat.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(this.MediaDescriptionCompat);
            Collections.sort(arrayList, new wg$$ExternalSyntheticLambda0(24));
            return (serializer) arrayList.get(0);
        }
    }

    public final void serializer(serializer serializerVar) {
        synchronized (this) {
            if (this.write.serializer()) {
                this.MediaDescriptionCompat.add(serializerVar);
                if (this.RatingCompat == null || serializerVar.write() < this.RatingCompat.write()) {
                    this.RatingCompat = serializerVar;
                    long jWrite = serializerVar.write();
                    r8lambdaEPgoZ_b4yaunNACjVUptzhsYstc r8lambdaepgoz_b4yaunnacjvuptzhsystc = this.MediaMetadataCompat;
                    String str = this.IconCompatParcelizer.read();
                    Context context = this.read;
                    r8lambdaepgoz_b4yaunnacjvuptzhsystc.IconCompatParcelizer(jWrite, PendingIntent.getBroadcast(context, 0, new Intent(str, null, context, getProductUrl.class), r8lambdaFCWpTejCW5kVaf7ggoc6ZelEIk.IconCompatParcelizer(0))).addOnFailureListener(new getDiscounts(this, 1));
                }
            }
        }
    }

    public final void write(serializer serializerVar) {
        boolean z;
        int iIconCompatParcelizer = r8lambdaFCWpTejCW5kVaf7ggoc6ZelEIk.IconCompatParcelizer(0);
        synchronized (this) {
            if (this.write.serializer()) {
                this.MediaDescriptionCompat.remove(serializerVar);
                serializer serializerVar2 = this.RatingCompat;
                if (serializerVar2 == null || serializerVar != serializerVar2) {
                    z = false;
                } else {
                    serializer serializerVarWrite = write();
                    z = (serializerVarWrite == null || serializerVarWrite.write() == this.RatingCompat.write()) ? false : true;
                    this.RatingCompat = serializerVarWrite;
                }
                serializer serializerVar3 = this.RatingCompat;
                if (serializerVar3 == null) {
                    r8lambdaEPgoZ_b4yaunNACjVUptzhsYstc r8lambdaepgoz_b4yaunnacjvuptzhsystc = this.MediaMetadataCompat;
                    String str = this.IconCompatParcelizer.read();
                    Context context = this.read;
                    r8lambdaepgoz_b4yaunnacjvuptzhsystc.serializer(PendingIntent.getBroadcast(context, 0, new Intent(str, null, context, getProductUrl.class), iIconCompatParcelizer)).addOnFailureListener(new getDiscounts(this, 0));
                } else if (z) {
                    long jWrite = serializerVar3.write();
                    r8lambdaEPgoZ_b4yaunNACjVUptzhsYstc r8lambdaepgoz_b4yaunnacjvuptzhsystc2 = this.MediaMetadataCompat;
                    String str2 = this.IconCompatParcelizer.read();
                    Context context2 = this.read;
                    r8lambdaepgoz_b4yaunnacjvuptzhsystc2.IconCompatParcelizer(jWrite, PendingIntent.getBroadcast(context2, 0, new Intent(str2, null, context2, getProductUrl.class), iIconCompatParcelizer)).addOnFailureListener(new getDiscounts(this, 1));
                }
            }
        }
    }

    private void RemoteActionCompatParcelizer(ArrayList arrayList, BrazeFirebaseMessagingService brazeFirebaseMessagingService) {
        ArrayList<serializer> arrayList2;
        synchronized (this) {
            arrayList2 = new ArrayList(this.MediaDescriptionCompat);
        }
        for (serializer serializerVar : arrayList2) {
            this.MediaBrowserCompatMediaItem.read();
            serializerVar.read().RemoteActionCompatParcelizer(new ProductViewedEvent(this, serializerVar, arrayList, brazeFirebaseMessagingService), this.MediaBrowserCompatMediaItem.serializer());
        }
    }
}
