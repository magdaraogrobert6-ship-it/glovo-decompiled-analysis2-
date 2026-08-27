package o;

import android.content.Context;
import android.os.Build;
import bo.app.d$$ExternalSyntheticOutline0;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.ondevicecommon.TFLiteException;
import com.sentiance.sdk.ondevicecommon.TfliteModelWrapper$ModelCrashCallback$ModelCrashResult;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY;
import o.r8lambdamX_xXZGUlojGjTf7UaBDPxnQsk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA<T1 extends r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY, T2 extends r8lambdamX_xXZGUlojGjTf7UaBDPxnQsk> {
    private final parseObjectAsIntegerlambda1 IconCompatParcelizer;
    private final r8lambdarEMgmQ_NnaN8KcZVRHpi3ubvPIA MediaMetadataCompat;
    private final getGeofenceRequestLocationannotations MediaSessionCompatQueueItem;
    private r8lambdapgvIkXjjYQob29qCPGjcmb0xlX8 PlaybackStateCompatCustomAction;
    private final getNotificationIdlambda0 RatingCompat;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final r8lambdat75EosP28hUrWqv7WpBxuG4oxpM read;
    private final cancelNotification serializer;
    private final ConfigurationManager write;
    private populatePushStoryPage MediaDescriptionCompat = null;
    private FwFClientsyncClientsyncResult1 MediaBrowserCompatMediaItem = null;

    public abstract T2 IconCompatParcelizer();

    public abstract int MediaBrowserCompatMediaItem();

    public abstract byte MediaDescriptionCompat();

    public abstract String MediaMetadataCompat();

    public abstract r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] MediaSessionCompatQueueItem();

    public abstract void MediaSessionCompatResultReceiverWrapper();

    public final FwFClientsyncClientsyncResult1 PlaybackStateCompat() {
        return this.MediaBrowserCompatMediaItem;
    }

    public boolean PlaybackStateCompatCustomAction() {
        return this instanceof isValidKey;
    }

    public boolean RatingCompat() {
        synchronized (this) {
            this.MediaSessionCompatQueueItem.getClass();
            String str = Build.CPU_ABI;
            if (str != null && str.equals("armeabi-v7a") && this.write._init_lambda3().contains(Byte.valueOf(MediaDescriptionCompat()))) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer("Model %s is blocked on armv7a devices as per configuration", MediaMetadataCompat());
                return false;
            }
            if (this.MediaBrowserCompatMediaItem != null) {
                return false;
            }
            populatePushStoryPage populatepushstorypageWrite = this.serializer.write(MediaMetadataCompat());
            if (populatepushstorypageWrite != null && populatepushstorypageWrite.RemoteActionCompatParcelizer().exists()) {
                boolean zWrite = this.MediaMetadataCompat.write(this, populatepushstorypageWrite);
                parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
                if (!zWrite) {
                    parselonglambda0.IconCompatParcelizer("%s model is not compatible with wrapper", populatepushstorypageWrite.MediaSessionCompatQueueItem());
                    return false;
                }
                parselonglambda0.IconCompatParcelizer("Loading model %s", populatepushstorypageWrite.serializer());
                File fileRemoteActionCompatParcelizer = populatepushstorypageWrite.RemoteActionCompatParcelizer();
                getNotificationIdlambda0 getnotificationidlambda0 = this.RatingCompat;
                FwFClientstartUpdater1 fwFClientstartUpdater1 = new FwFClientstartUpdater1();
                fwFClientstartUpdater1.read = 1;
                parseLonglambda0 parselonglambda1 = this.RemoteActionCompatParcelizer;
                getnotificationidlambda0.getClass();
                FwFClientsyncClientsyncResult1 fwFClientsyncClientsyncResult1Write = getNotificationIdlambda0.write(fileRemoteActionCompatParcelizer, fwFClientstartUpdater1, parselonglambda1);
                this.MediaBrowserCompatMediaItem = fwFClientsyncClientsyncResult1Write;
                if (fwFClientsyncClientsyncResult1Write == null) {
                    this.RemoteActionCompatParcelizer.IconCompatParcelizer("Failed to create the interpreter", new Object[0]);
                    return false;
                }
                this.read.write();
                this.MediaDescriptionCompat = populatepushstorypageWrite;
                if (this.write.MediaDescriptionCompat(MediaDescriptionCompat())) {
                    this.IconCompatParcelizer.RemoteActionCompatParcelizer(populatepushstorypageWrite.serializer());
                }
                return true;
            }
            this.RemoteActionCompatParcelizer.IconCompatParcelizer("Model does not exist", new Object[0]);
            return false;
        }
    }

    public abstract Integer RemoteActionCompatParcelizer();

    public final void r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        synchronized (this) {
            if (this.MediaBrowserCompatMediaItem == null) {
                return;
            }
            this.IconCompatParcelizer.write();
            populatePushStoryPage populatepushstorypage = this.MediaDescriptionCompat;
            if (populatepushstorypage != null) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer("Unloading model %s", populatepushstorypage.serializer());
            }
            try {
                this.MediaBrowserCompatMediaItem.close();
                this.MediaBrowserCompatMediaItem = null;
                this.MediaDescriptionCompat = null;
            } catch (Exception e) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to close interpreter", new Object[0]);
            }
        }
    }

    public abstract int read();

    public abstract r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM[] serializer();

    public abstract HashMap write();

    public abstract ByteBuffer[] write(T1 t1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    private void serializer(Object[] objArr, Map<Integer, Object> map) {
        parseLonglambda0 parselonglambda0;
        if (map == null || !this.write.MediaDescriptionCompat(MediaDescriptionCompat())) {
            return;
        }
        r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = objArr.length;
            parselonglambda0 = this.RemoteActionCompatParcelizer;
            if (i >= length) {
                break;
            }
            Integer numRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (numRemoteActionCompatParcelizer == null || i != numRemoteActionCompatParcelizer.intValue()) {
                Object obj = objArr[i];
                if (obj instanceof ByteBuffer) {
                    arrayList.add(r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.serializer((ByteBuffer) obj));
                } else {
                    parselonglambda0.RemoteActionCompatParcelizer("input is not a ByteBuffer", new Object[0]);
                }
            }
            i++;
        }
        r8lambda1mnczrzuv4owduwgkg6cjtsws.write = arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<Integer, Object> entry : map.entrySet()) {
            if (entry.getValue() instanceof ByteBuffer) {
                r8lambdaWTRzZ47ALm_PiHKY7ggOtpArXM r8lambdawtrzz47alm_pihky7ggotparxm = MediaSessionCompatQueueItem()[entry.getKey().intValue()];
                ?? arrayList3 = Collections.EMPTY_LIST;
                FwFClientcache2 fwFClientcache2 = r8lambdawtrzz47alm_pihky7ggotparxm.RemoteActionCompatParcelizer;
                if (fwFClientcache2 == FwFClientcache2.FLOAT32) {
                    arrayList3 = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.serializer((ByteBuffer) entry.getValue());
                } else if (fwFClientcache2 == FwFClientcache2.INT32) {
                    int[] iArrRemoteActionCompatParcelizer = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.RemoteActionCompatParcelizer(new int[0], (ByteBuffer) entry.getValue());
                    arrayList3 = new ArrayList();
                    for (int i2 : iArrRemoteActionCompatParcelizer) {
                        arrayList3.add(Double.valueOf(i2));
                    }
                }
                arrayList2.add(arrayList3);
            } else {
                parselonglambda0.RemoteActionCompatParcelizer("output is not a ByteBuffer", new Object[0]);
            }
        }
        r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer = arrayList2;
        this.IconCompatParcelizer.read(r8lambda1mnczrzuv4owduwgkg6cjtsws.RemoteActionCompatParcelizer());
    }

    public final void ComponentActivity() {
        this.read.IconCompatParcelizer();
    }

    public final ByteBuffer MediaSessionCompatToken() {
        r8lambdat75EosP28hUrWqv7WpBxuG4oxpM r8lambdat75eosp28hurwqv7wpbxug4oxpm = this.read;
        ByteBuffer byteBufferRemoteActionCompatParcelizer = r8lambdat75eosp28hurwqv7wpbxug4oxpm.RemoteActionCompatParcelizer();
        return byteBufferRemoteActionCompatParcelizer == null ? r8lambdat75eosp28hurwqv7wpbxug4oxpm.IconCompatParcelizer() : byteBufferRemoteActionCompatParcelizer;
    }

    public final void ResultReceiver() {
        this.read.read();
    }

    public r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA(Context context, parseLonglambda0 parselonglambda0, cancelNotification cancelnotification, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, ConfigurationManager configurationManager, parseObjectAsIntegerlambda1 parseobjectasintegerlambda1, r8lambdarEMgmQ_NnaN8KcZVRHpi3ubvPIA r8lambdaremgmq_nnan8kczvrhpi3ubvpia, getGeofenceRequestLocationannotations getgeofencerequestlocationannotations, getNotificationIdlambda0 getnotificationidlambda0) {
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.serializer = cancelnotification;
        this.write = configurationManager;
        this.IconCompatParcelizer = parseobjectasintegerlambda1;
        this.MediaMetadataCompat = r8lambdaremgmq_nnan8kczvrhpi3ubvpia;
        this.MediaSessionCompatQueueItem = getgeofencerequestlocationannotations;
        this.RatingCompat = getnotificationidlambda0;
        this.read = new r8lambdat75EosP28hUrWqv7WpBxuG4oxpM(context, parselonglambda0, MediaBrowserCompatMediaItem(), -1.0f, PlaybackStateCompatCustomAction(), MediaMetadataCompat());
        populatePushStoryPagelambda0 populatepushstorypagelambda0Write = cancelnotification.write();
        r8lambdapgvIkXjjYQob29qCPGjcmb0xlX8 r8lambdapgvikxjjyqob29qcpgjcmb0xlx8 = populatepushstorypagelambda0Write instanceof r8lambdapgvIkXjjYQob29qCPGjcmb0xlX8 ? (r8lambdapgvIkXjjYQob29qCPGjcmb0xlX8) populatepushstorypagelambda0Write : null;
        if (r8lambdapgvikxjjyqob29qcpgjcmb0xlx8 != null) {
            this.PlaybackStateCompatCustomAction = r8lambdapgvikxjjyqob29qcpgjcmb0xlx8;
        }
    }

    public final Map<Integer, Object> IconCompatParcelizer(Object[] objArr) throws TFLiteException {
        String string;
        FwFClientsyncClientsyncResult1 fwFClientsyncClientsyncResult1 = this.MediaBrowserCompatMediaItem;
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        if (fwFClientsyncClientsyncResult1 == null) {
            parselonglambda0.RemoteActionCompatParcelizer("Attempting to run a null interpreter", new Object[0]);
            return null;
        }
        HashMap mapWrite = write();
        try {
            fwFClientsyncClientsyncResult1.read(objArr, mapWrite);
            this.read.serializer();
            return mapWrite;
        } catch (Exception e) {
            String message = e.getMessage();
            if (this.MediaDescriptionCompat != null) {
                StringBuilder sbM = d$$ExternalSyntheticOutline0.m(message);
                java.util.Locale locale = java.util.Locale.ENGLISH;
                sbM.append(" || Model ".concat(this.MediaDescriptionCompat.serializer()));
                string = sbM.toString();
            } else {
                string = "";
            }
            TFLiteException tFLiteException = new TFLiteException(string);
            tFLiteException.setStackTrace(e.getStackTrace());
            parselonglambda0.IconCompatParcelizer(false, tFLiteException, "Error while running model", new Object[0]);
            throw tFLiteException;
        }
    }

    public T2 serializer(T1 t1) {
        if (this.MediaBrowserCompatMediaItem == null) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Attempting to run a null interpreter", new Object[0]);
            return null;
        }
        ByteBuffer[] byteBufferArrWrite = write(t1);
        try {
            serializer(byteBufferArrWrite, IconCompatParcelizer(byteBufferArrWrite));
            return (T2) IconCompatParcelizer();
        } catch (TFLiteException e) {
            write(e, false);
            return null;
        }
    }

    public final populatePushStoryPage ParcelableVolumeInfo() {
        return this.MediaDescriptionCompat;
    }

    public final boolean RemoteActionCompatParcelizer(populatePushStoryPage populatepushstorypage) {
        return this.MediaMetadataCompat.write(this, populatepushstorypage);
    }

    public final void write(TFLiteException tFLiteException, boolean z) {
        populatePushStoryPage populatepushstorypage;
        r8lambdapgvIkXjjYQob29qCPGjcmb0xlX8 r8lambdapgvikxjjyqob29qcpgjcmb0xlx8 = this.PlaybackStateCompatCustomAction;
        if (r8lambdapgvikxjjyqob29qcpgjcmb0xlx8 == null || (populatepushstorypage = this.MediaDescriptionCompat) == null) {
            return;
        }
        TfliteModelWrapper$ModelCrashCallback$ModelCrashResult tfliteModelWrapper$ModelCrashCallback$ModelCrashResultRemoteActionCompatParcelizer = r8lambdapgvikxjjyqob29qcpgjcmb0xlx8.RemoteActionCompatParcelizer(this, populatepushstorypage, tFLiteException, z);
        if (tfliteModelWrapper$ModelCrashCallback$ModelCrashResultRemoteActionCompatParcelizer == TfliteModelWrapper$ModelCrashCallback$ModelCrashResult.UNLOAD_MODEL) {
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        } else if (tfliteModelWrapper$ModelCrashCallback$ModelCrashResultRemoteActionCompatParcelizer == TfliteModelWrapper$ModelCrashCallback$ModelCrashResult.MODEL_REPLACED) {
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            RatingCompat();
        }
    }
}
