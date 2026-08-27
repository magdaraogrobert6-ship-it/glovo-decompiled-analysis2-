package com.sentiance.sdk.venuemapper;

import android.location.Location;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.tflitemodel.InferenceResult$Failure$InferenceError;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalDateTime$Companion;
import o.BrazeImageUtils;
import o.decodeSampledBitmapFromStream;
import o.deleteDataStoreFilelambda2;
import o.deleteSharedPreferencesFile;
import o.downloadFileToPathlambda4;
import o.downloadFileToPathlambda6;
import o.getAssetFileStringContents;
import o.getCieXyz;
import o.isRemoteUri;
import o.migrateTriggersStorageToJson;
import o.parseLonglambda0;
import o.populatePushStoryPage;
import o.r8lambda5TpT37vCBVAL7SY9hqiUVbjTZkY;
import o.r8lambda8ySpy9Wx6YDdbRlRNNOrt8CXa9g;
import o.r8lambdaAJg9XIh53OlvCMevohVD8beb9IY;
import o.r8lambdaSsCf132VhiMWNtAeD6ps3DRTWA;
import o.r8lambdaZX2xA8csSBSphMPsG20ZD182Io;
import o.r8lambdagzL4jp4oDuRXXeRCE9jPe7Cswjw;
import o.r8lambdamTNG9VMm6XpcY8TjXi2Y5NHPZfM;
import o.r8lambdasH2xGkoIMJfF_ZfqITpzqxAcDU;
import o.removeNodeAtDepth;
import o.setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release;
import o.setFirebaseCloudMessagingSenderIdKeyandroid_sdk_base_release;
import o.setGreatNetworkDataFlushInterval;
import o.setHandlePushDeepLinksAutomatically;
import o.setHandlePushDeepLinksAutomaticallyandroid_sdk_base_release;
import o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;
import o.setInAppMessageWebViewClientMaxOnPageFinishedWaitMs;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "VenueMapperModelExecutor")
public class w extends r8lambdagzL4jp4oDuRXXeRCE9jPe7Cswjw {
    private final deleteSharedPreferencesFile IconCompatParcelizer;
    private deleteDataStoreFilelambda2 MediaSessionCompatQueueItem;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final r8lambda5TpT37vCBVAL7SY9hqiUVbjTZkY read;
    private boolean serializer;
    private final BrazeImageUtils write;

    public final void serializer() {
        this.IconCompatParcelizer.ComponentActivity();
        this.read.ComponentActivity();
    }

    public w(parseLonglambda0 parselonglambda0, migrateTriggersStorageToJson migratetriggersstoragetojson, deleteSharedPreferencesFile deletesharedpreferencesfile, r8lambda5TpT37vCBVAL7SY9hqiUVbjTZkY r8lambda5tpt37vcbval7sy9hqiuvbjtzky) {
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.write = new BrazeImageUtils(migratetriggersstoragetojson, new r8lambda8ySpy9Wx6YDdbRlRNNOrt8CXa9g(parselonglambda0));
        this.IconCompatParcelizer = deletesharedpreferencesfile;
        this.read = r8lambda5tpt37vcbval7sy9hqiuvbjtzky;
    }

    public final void write() {
        if (this.serializer) {
            this.IconCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            this.read.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            this.serializer = false;
        }
    }

    public final decodeSampledBitmapFromStream read(Location location, boolean z, long j, long j2) {
        setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release;
        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release;
        float latitude = (float) location.getLatitude();
        float longitude = (float) location.getLongitude();
        Locale locale = Locale.US;
        String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale).format(new Date(j));
        LocalDateTime$Companion localDateTime$Companion = setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release.Companion;
        localDateTime$Companion.getClass();
        str.getClass();
        try {
            setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release2 = new setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release(LocalDateTime.parse(str));
            if (j2 == 0) {
                setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release = null;
            } else {
                String str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale).format(new Date(j2));
                localDateTime$Companion.getClass();
                str2.getClass();
                try {
                    setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release = new setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release(LocalDateTime.parse(str2));
                } catch (DateTimeParseException e) {
                    throw new DateTimeFormatException(e);
                }
            }
            r8lambdasH2xGkoIMJfF_ZfqITpzqxAcDU r8lambdash2xgkoimjff_zfqitpzqxacdu = new r8lambdasH2xGkoIMJfF_ZfqITpzqxAcDU(new r8lambdamTNG9VMm6XpcY8TjXi2Y5NHPZfM(z, new r8lambdaZX2xA8csSBSphMPsG20ZD182Io(latitude, longitude, setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release2, setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release)), this.MediaSessionCompatQueueItem.serializer());
            BrazeImageUtils brazeImageUtils = this.write;
            r8lambda8ySpy9Wx6YDdbRlRNNOrt8CXa9g r8lambda8yspy9wx6yddbrlrnnort8cxa9g = (r8lambda8ySpy9Wx6YDdbRlRNNOrt8CXa9g) brazeImageUtils.IconCompatParcelizer;
            if (brazeImageUtils.serializer) {
                try {
                    sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(0, brazeImageUtils.RemoteActionCompatParcelizer(r8lambdash2xgkoimjff_zfqitpzqxacdu));
                } catch (Exception e2) {
                    String str3 = "run() failed with exception: " + e2.getMessage() + ". ";
                    r8lambda8yspy9wx6yddbrlrnnort8cxa9g.RemoteActionCompatParcelizer(str3);
                    sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(0, new setFirebaseCloudMessagingSenderIdKeyandroid_sdk_base_release(e2, "[ERROR] ".concat(str3), new setHandlePushDeepLinksAutomatically()));
                }
            } else {
                r8lambda8yspy9wx6yddbrlrnnort8cxa9g.read();
                sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(0, new setGreatNetworkDataFlushInterval(new setInAppMessageWebViewClientMaxOnPageFinishedWaitMs((List) brazeImageUtils.MediaSessionCompatToken)));
            }
            setHandlePushDeepLinksAutomaticallyandroid_sdk_base_release sethandlepushdeeplinksautomaticallyandroid_sdk_base_release = (setHandlePushDeepLinksAutomaticallyandroid_sdk_base_release) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write;
            if (sethandlepushdeeplinksautomaticallyandroid_sdk_base_release instanceof r8lambdaSsCf132VhiMWNtAeD6ps3DRTWA) {
                return ((r8lambdaSsCf132VhiMWNtAeD6ps3DRTWA) sethandlepushdeeplinksautomaticallyandroid_sdk_base_release).RemoteActionCompatParcelizer;
            }
            return null;
        } catch (DateTimeParseException e3) {
            throw new DateTimeFormatException(e3);
        }
    }

    public final boolean read() {
        boolean z;
        if (this.serializer) {
            return true;
        }
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        parselonglambda0.IconCompatParcelizer("Starting VenueMapperModelWrapper", new Object[0]);
        deleteSharedPreferencesFile deletesharedpreferencesfile = this.IconCompatParcelizer;
        boolean zRatingCompat = deletesharedpreferencesfile.RatingCompat();
        r8lambda5TpT37vCBVAL7SY9hqiUVbjTZkY r8lambda5tpt37vcbval7sy9hqiuvbjtzky = this.read;
        boolean zRatingCompat2 = r8lambda5tpt37vcbval7sy9hqiuvbjtzky.RatingCompat();
        populatePushStoryPage populatepushstorypageParcelableVolumeInfo = deletesharedpreferencesfile.ParcelableVolumeInfo();
        populatePushStoryPage populatepushstorypageParcelableVolumeInfo2 = r8lambda5tpt37vcbval7sy9hqiuvbjtzky.ParcelableVolumeInfo();
        if (!zRatingCompat || !zRatingCompat2 || populatepushstorypageParcelableVolumeInfo == null || populatepushstorypageParcelableVolumeInfo2 == null) {
            deletesharedpreferencesfile.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            r8lambda5tpt37vcbval7sy9hqiuvbjtzky.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            parselonglambda0.RemoteActionCompatParcelizer("Not all models loaded successfully.", new Object[0]);
            return false;
        }
        this.MediaSessionCompatQueueItem = new deleteDataStoreFilelambda2(deletesharedpreferencesfile, populatepushstorypageParcelableVolumeInfo);
        List<getAssetFileStringContents> listAsList = Arrays.asList(this.MediaSessionCompatQueueItem, new r8lambdaAJg9XIh53OlvCMevohVD8beb9IY(r8lambda5tpt37vcbval7sy9hqiuvbjtzky, populatepushstorypageParcelableVolumeInfo2));
        BrazeImageUtils brazeImageUtils = this.write;
        r8lambda8ySpy9Wx6YDdbRlRNNOrt8CXa9g r8lambda8yspy9wx6yddbrlrnnort8cxa9g = (r8lambda8ySpy9Wx6YDdbRlRNNOrt8CXa9g) brazeImageUtils.IconCompatParcelizer;
        LinkedHashMap linkedHashMap = (LinkedHashMap) brazeImageUtils.read;
        listAsList.getClass();
        for (isRemoteUri isremoteuri : (List) brazeImageUtils.MediaSessionCompatToken) {
            String str = isremoteuri.a;
            downloadFileToPathlambda4 downloadfiletopathlambda4 = new downloadFileToPathlambda4(isremoteuri);
            downloadfiletopathlambda4.RemoteActionCompatParcelizer = new downloadFileToPathlambda6(InferenceResult$Failure$InferenceError.GENERIC);
            linkedHashMap.put(str, downloadfiletopathlambda4);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (getAssetFileStringContents getassetfilestringcontents : listAsList) {
            if (linkedHashMap.containsKey(getassetfilestringcontents.IconCompatParcelizer().a)) {
                isRemoteUri isremoteuriIconCompatParcelizer = getassetfilestringcontents.IconCompatParcelizer();
                getAssetFileStringContents getassetfilestringcontents2 = (getAssetFileStringContents) linkedHashMap.get(getassetfilestringcontents.IconCompatParcelizer().a);
                if (isremoteuriIconCompatParcelizer.equals(getassetfilestringcontents2 != null ? getassetfilestringcontents2.IconCompatParcelizer() : null)) {
                    r8lambda8yspy9wx6yddbrlrnnort8cxa9g.read("Model validation successful for model `" + getassetfilestringcontents.IconCompatParcelizer().a + "`.");
                    linkedHashMap.put(getassetfilestringcontents.IconCompatParcelizer().a, getassetfilestringcontents);
                    linkedHashSet.add(getassetfilestringcontents.IconCompatParcelizer().a);
                } else {
                    StringBuilder sb = new StringBuilder("Model validation failed. Expected `");
                    getAssetFileStringContents getassetfilestringcontents3 = (getAssetFileStringContents) linkedHashMap.get(getassetfilestringcontents.IconCompatParcelizer().a);
                    sb.append(getassetfilestringcontents3 != null ? getassetfilestringcontents3.IconCompatParcelizer() : null);
                    sb.append("` != Actual `");
                    sb.append(getassetfilestringcontents.IconCompatParcelizer());
                    sb.append("`.");
                    r8lambda8yspy9wx6yddbrlrnnort8cxa9g.RemoteActionCompatParcelizer(sb.toString());
                }
            }
        }
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{linkedHashMap.keySet(), linkedHashSet}, getCieXyz.write())).booleanValue();
        if (!zBooleanValue) {
            r8lambda8yspy9wx6yddbrlrnnort8cxa9g.RemoteActionCompatParcelizer("Model validation failed. Expected Models " + linkedHashMap.keySet() + " ~ Received Models " + linkedHashSet + '.');
        }
        if (zBooleanValue) {
            brazeImageUtils.serializer = true;
            r8lambda8yspy9wx6yddbrlrnnort8cxa9g.read("Call to initModels(). Initializing models.");
            getAssetFileStringContents getassetfilestringcontents4 = (getAssetFileStringContents) linkedHashMap.get((String) brazeImageUtils.MediaSessionCompatQueueItem);
            if (getassetfilestringcontents4 != null) {
                brazeImageUtils.MediaDescriptionCompat = new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(11, getassetfilestringcontents4);
            }
            getAssetFileStringContents getassetfilestringcontents5 = (getAssetFileStringContents) linkedHashMap.get((String) brazeImageUtils.MediaMetadataCompat);
            if (getassetfilestringcontents5 != null) {
                brazeImageUtils.RatingCompat = getassetfilestringcontents5;
            }
            z = brazeImageUtils.serializer;
        } else {
            brazeImageUtils.serializer = false;
            r8lambda8yspy9wx6yddbrlrnnort8cxa9g.RemoteActionCompatParcelizer("Required models are not available");
            z = brazeImageUtils.serializer;
        }
        if (z) {
            this.serializer = true;
            return true;
        }
        parselonglambda0.RemoteActionCompatParcelizer("Visit Essentials class failed to load the models", new Object[0]);
        deletesharedpreferencesfile.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        r8lambda5tpt37vcbval7sy9hqiuvbjtzky.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        return false;
    }
}
