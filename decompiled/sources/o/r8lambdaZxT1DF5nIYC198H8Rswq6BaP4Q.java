package o;

import android.content.Context;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.api.requests.SdkInitConfigRequestReason;
import com.sentiance.sdk.crashloop.SdkInitConfigProvider$fetchInitActionInternal$1;
import com.sentiance.sdk.crashloop.SdkInitConfigProvider$fetchInitActionInternal$1$$ExternalSyntheticLambda0;
import com.sentiance.sdk.processguard.Guard$Type;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.migrateTriggersReeligibilityToJsonlambda1;
import o.migrateTriggersReeligibilityToJsonlambda4;
import o.r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q;
import o.r8lambdakDxe1DGrl5W1RX_YXRXHlRlsI;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "SdkInitConfigProvider", componentName = "SdkInitConfigProvider", guardType = Guard$Type.REFERENCE_COUNTED)
public final class r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final parseLonglambda0 IconCompatParcelizer;
    private final List<Long> MediaBrowserCompatMediaItem;
    private final Context MediaDescriptionCompat;
    private final long MediaMetadataCompat;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 MediaSessionCompatQueueItem;
    private final migrateTriggersStorageToJsonlambda0 MediaSessionCompatResultReceiverWrapper;
    private final int MediaSessionCompatToken;
    private final String ParcelableVolumeInfo;
    private final migrateTriggersReeligibilityToJsonlambda20 PlaybackStateCompat;
    private int PlaybackStateCompatCustomAction;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RatingCompat;
    private final com.sentiance.sdk.util.c RemoteActionCompatParcelizer;
    private final r8lambdarLM3a25JFHhmldwryG6FQri4B1g read;
    private final readStringlambda0 serializer;
    private final readandroid_sdk_base_release write;

    public static final class IconCompatParcelizer {
        public IconCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final long MediaMetadataCompat(r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q r8lambdazxt1df5niyc198h8rswq6bap4q) {
        List<Long> list = r8lambdazxt1df5niyc198h8rswq6bap4q.MediaBrowserCompatMediaItem;
        int i = r8lambdazxt1df5niyc198h8rswq6bap4q.PlaybackStateCompatCustomAction;
        return ((i < 0 || i > androidx.sqlite.SQLite.write((List) list)) ? Long.valueOf(((Number) onContentCardDismissed.MediaDescriptionCompat((List) list)).longValue()) : list.get(i)).longValue();
    }

    public static final void MediaSessionCompatQueueItem(r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q r8lambdazxt1df5niyc198h8rswq6bap4q) {
        r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = r8lambdazxt1df5niyc198h8rswq6bap4q.RatingCompat;
        long jCurrentTimeMillis = System.currentTimeMillis();
        r8lambdazxt1df5niyc198h8rswq6bap4q.RemoteActionCompatParcelizer.read(jCurrentTimeMillis, "last_successful_request_time");
        r8lambdazxt1df5niyc198h8rswq6bap4q.PlaybackStateCompat.read(Long.valueOf(jCurrentTimeMillis));
    }

    private final File serializer() {
        File file = new File(this.MediaDescriptionCompat.getNoBackupFilesDir(), "com.sentiance.sdk/");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, "sdk_init_config.json");
    }

    public static final r8lambdaeD9byxNVlFNFerv0pUjy_LuGI serializer(r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q r8lambdazxt1df5niyc198h8rswq6bap4q, r8lambdakDxe1DGrl5W1RX_YXRXHlRlsI r8lambdakdxe1dgrl5w1rx_yxrxhlrlsi) {
        Object next;
        r8lambdaninGD_558WEHro03VDYWZMuRZKQ r8lambdaningd_558wehro03vdywzmurzkq;
        r8lambdaueKwLz29fMfZ7fdYSaDi7bqYOfM r8lambdauekwlz29fmfz7fdysadi7bqyofmIconCompatParcelizer;
        String str = r8lambdazxt1df5niyc198h8rswq6bap4q.ParcelableVolumeInfo;
        str.getClass();
        r8lambdaueKwLz29fMfZ7fdYSaDi7bqYOfM r8lambdauekwlz29fmfz7fdysadi7bqyofmIconCompatParcelizer2 = migrateMetadataToJsonlambda0.IconCompatParcelizer(str);
        if (r8lambdauekwlz29fmfz7fdysadi7bqyofmIconCompatParcelizer2 != null) {
            Iterator<T> it = r8lambdakdxe1dgrl5w1rx_yxrxhlrlsi.serializer().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                r8lambdasGoPum83zClBOAx_s3voYxQS3k r8lambdasgopum83zclboax_s3voyxqs3kRemoteActionCompatParcelizer = ((r8lambdagnzQTYlH7GTe3VzlAdVC8k00Gg) next).RemoteActionCompatParcelizer();
                r8lambdaueKwLz29fMfZ7fdYSaDi7bqYOfM r8lambdauekwlz29fmfz7fdysadi7bqyofmIconCompatParcelizer3 = migrateMetadataToJsonlambda0.IconCompatParcelizer(r8lambdasgopum83zclboax_s3voyxqs3kRemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
                if (r8lambdauekwlz29fmfz7fdysadi7bqyofmIconCompatParcelizer3 != null && (r8lambdauekwlz29fmfz7fdysadi7bqyofmIconCompatParcelizer = migrateMetadataToJsonlambda0.IconCompatParcelizer(r8lambdasgopum83zclboax_s3voyxqs3kRemoteActionCompatParcelizer.IconCompatParcelizer())) != null) {
                    boolean zSerializer = r8lambdasgopum83zclboax_s3voyxqs3kRemoteActionCompatParcelizer.serializer();
                    int i = r8lambdauekwlz29fmfz7fdysadi7bqyofmIconCompatParcelizer2.compareTo(r8lambdauekwlz29fmfz7fdysadi7bqyofmIconCompatParcelizer3);
                    boolean z = false;
                    boolean z2 = !zSerializer ? i <= 0 : i < 0;
                    if (!r8lambdasgopum83zclboax_s3voyxqs3kRemoteActionCompatParcelizer.read() ? r8lambdauekwlz29fmfz7fdysadi7bqyofmIconCompatParcelizer2.compareTo(r8lambdauekwlz29fmfz7fdysadi7bqyofmIconCompatParcelizer) < 0 : r8lambdauekwlz29fmfz7fdysadi7bqyofmIconCompatParcelizer2.compareTo(r8lambdauekwlz29fmfz7fdysadi7bqyofmIconCompatParcelizer) <= 0) {
                        z = true;
                    }
                    if (z2 && z) {
                        break;
                    }
                }
            }
            r8lambdagnzQTYlH7GTe3VzlAdVC8k00Gg r8lambdagnzqtylh7gte3vzladvc8k00gg = (r8lambdagnzQTYlH7GTe3VzlAdVC8k00Gg) next;
            if (r8lambdagnzqtylh7gte3vzladvc8k00gg != null && (r8lambdaningd_558wehro03vdywzmurzkq = r8lambdagnzqtylh7gte3vzladvc8k00gg.read()) != null) {
                return r8lambdaningd_558wehro03vdywzmurzkq.RemoteActionCompatParcelizer();
            }
        }
        return null;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.RemoteActionCompatParcelizer.read();
        serializer().delete();
        this.MediaSessionCompatResultReceiverWrapper.write();
    }

    static {
        new IconCompatParcelizer(null);
    }

    public r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q(com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0, readStringlambda0 readstringlambda0, r8lambdarLM3a25JFHhmldwryG6FQri4B1g r8lambdarlm3a25jfhhmldwryg6fqri4b1g, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, Context context, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, GooglePlayLocationUtilsremoveGeofencesFromLocalStorageinlinedwriteList2 googlePlayLocationUtilsremoveGeofencesFromLocalStorageinlinedwriteList2) {
        cVar.getClass();
        parselonglambda0.getClass();
        readstringlambda0.getClass();
        r8lambdarlm3a25jfhhmldwryg6fqri4b1g.getClass();
        readandroid_sdk_base_releaseVar.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        context.getClass();
        r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4.getClass();
        googlePlayLocationUtilsremoveGeofencesFromLocalStorageinlinedwriteList2.getClass();
        this.RemoteActionCompatParcelizer = cVar;
        this.IconCompatParcelizer = parselonglambda0;
        this.serializer = readstringlambda0;
        this.read = r8lambdarlm3a25jfhhmldwryg6fqri4b1g;
        this.write = readandroid_sdk_base_releaseVar;
        this.RatingCompat = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaDescriptionCompat = context;
        this.MediaSessionCompatQueueItem = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        long jSerializer = r8lambda9zISiqWdkc3dd5mJTZ1F1xGFCGs.serializer(1);
        this.MediaMetadataCompat = jSerializer;
        this.MediaBrowserCompatMediaItem = androidx.sqlite.SQLite.read(0L, Long.valueOf(jSerializer), Long.valueOf(r8lambda9zISiqWdkc3dd5mJTZ1F1xGFCGs.serializer(2)), Long.valueOf(r8lambda9zISiqWdkc3dd5mJTZ1F1xGFCGs.serializer(5)), Long.valueOf(r8lambda9zISiqWdkc3dd5mJTZ1F1xGFCGs.serializer(10)));
        this.MediaSessionCompatToken = 3;
        this.PlaybackStateCompat = new migrateTriggersReeligibilityToJsonlambda20(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.crashloop.SdkInitConfigProvider$lastRequestTime$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                ((migrateTriggersReeligibilityToJsonlambda1) obj).getClass();
                return Long.valueOf(r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q.read(this.this$0));
            }

            {
                super(1);
            }
        });
        this.ParcelableVolumeInfo = "6.27.1";
        this.MediaSessionCompatResultReceiverWrapper = new migrateTriggersStorageToJsonlambda0(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.crashloop.SdkInitConfigProvider$cachedInitAction$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                ((migrateTriggersReeligibilityToJsonlambda4) obj).getClass();
                r8lambdakDxe1DGrl5W1RX_YXRXHlRlsI r8lambdakdxe1dgrl5w1rx_yxrxhlrlsiRemoteActionCompatParcelizer = r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q.RemoteActionCompatParcelizer(this.this$0);
                if (r8lambdakdxe1dgrl5w1rx_yxrxhlrlsiRemoteActionCompatParcelizer != null) {
                    return r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q.serializer(this.this$0, r8lambdakdxe1dgrl5w1rx_yxrxhlrlsiRemoteActionCompatParcelizer);
                }
                return null;
            }

            {
                super(1);
            }
        });
    }

    public static void RemoteActionCompatParcelizer(SdkInitConfigRequestReason sdkInitConfigRequestReason, r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q r8lambdazxt1df5niyc198h8rswq6bap4q, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z) {
        sdkInitConfigRequestReason.getClass();
        r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4 = r8lambdazxt1df5niyc198h8rswq6bap4q.MediaSessionCompatQueueItem;
        r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4.read();
        r8lambdazxt1df5niyc198h8rswq6bap4q.read.IconCompatParcelizer(sdkInitConfigRequestReason, r8lambdazxt1df5niyc198h8rswq6bap4q.write, new SdkInitConfigProvider$fetchInitActionInternal$1(sdkInitConfigRequestReason, r8lambdazxt1df5niyc198h8rswq6bap4q, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z));
        r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4.IconCompatParcelizer();
    }

    public static final r8lambdakDxe1DGrl5W1RX_YXRXHlRlsI RemoteActionCompatParcelizer(r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q r8lambdazxt1df5niyc198h8rswq6bap4q) {
        r8lambdazxt1df5niyc198h8rswq6bap4q.getClass();
        try {
            File fileSerializer = r8lambdazxt1df5niyc198h8rswq6bap4q.serializer();
            if (!fileSerializer.exists()) {
                fileSerializer = null;
            }
            if (fileSerializer != null) {
                String strWrite = r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ.write(fileSerializer, ensureSubscribedToInAppMessageEvents.write);
                if (strWrite.length() <= 0) {
                    strWrite = null;
                }
                if (strWrite != null) {
                    return (r8lambdakDxe1DGrl5W1RX_YXRXHlRlsI) r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.serializer(r8lambdakDxe1DGrl5W1RX_YXRXHlRlsI.class, strWrite);
                }
            }
            return null;
        } catch (Exception e) {
            r8lambdazxt1df5niyc198h8rswq6bap4q.IconCompatParcelizer.IconCompatParcelizer(false, e, MediaSessionCompatQueueItem.read(e, new StringBuilder("Failed to read cached SDK init config: ")), new Object[0]);
            return null;
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        Object[] objArr = {serializer()};
        int iSerializer = getQueryParameterslambda2.serializer();
        return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
    }

    public static final long read(r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q r8lambdazxt1df5niyc198h8rswq6bap4q) {
        return r8lambdazxt1df5niyc198h8rswq6bap4q.RemoteActionCompatParcelizer.IconCompatParcelizer("last_successful_request_time", 0L);
    }

    public final void IconCompatParcelizer(SdkInitConfigRequestReason sdkInitConfigRequestReason, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        sdkInitConfigRequestReason.getClass();
        long jLongValue = (((Number) this.PlaybackStateCompat.read()).longValue() + this.MediaMetadataCompat) - System.currentTimeMillis();
        if (jLongValue < 0) {
            jLongValue = 0;
        }
        if (jLongValue > 0) {
            this.IconCompatParcelizer.IconCompatParcelizer(m1$$ExternalSyntheticOutline0.m(jLongValue, "Delaying SDK init config fetch by ", "ms to respect minimum interval between requests"), new Object[0]);
        }
        this.MediaSessionCompatQueueItem.read();
        this.write.serializer(new CrossfadeKtCrossfade51(sdkInitConfigRequestReason, this, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z), jLongValue);
    }

    public static final void read(SdkInitConfigRequestReason sdkInitConfigRequestReason, r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q r8lambdazxt1df5niyc198h8rswq6bap4q, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z) {
        r8lambdazxt1df5niyc198h8rswq6bap4q.MediaSessionCompatQueueItem.read();
        r8lambdazxt1df5niyc198h8rswq6bap4q.read.IconCompatParcelizer(sdkInitConfigRequestReason, r8lambdazxt1df5niyc198h8rswq6bap4q.write, new SdkInitConfigProvider$fetchInitActionInternal$1(sdkInitConfigRequestReason, r8lambdazxt1df5niyc198h8rswq6bap4q, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z));
    }

    public final r8lambdaeD9byxNVlFNFerv0pUjy_LuGI read() {
        return (r8lambdaeD9byxNVlFNFerv0pUjy_LuGI) this.MediaSessionCompatResultReceiverWrapper.read();
    }

    public static final void IconCompatParcelizer(r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q r8lambdazxt1df5niyc198h8rswq6bap4q, r8lambdakDxe1DGrl5W1RX_YXRXHlRlsI r8lambdakdxe1dgrl5w1rx_yxrxhlrlsi, r8lambdaeD9byxNVlFNFerv0pUjy_LuGI r8lambdaed9byxnvlfnferv0pujy_lugi) {
        parseLonglambda0 parselonglambda0 = r8lambdazxt1df5niyc198h8rswq6bap4q.IconCompatParcelizer;
        try {
            r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ.write(r8lambdazxt1df5niyc198h8rswq6bap4q.serializer(), r8lambdakdxe1dgrl5w1rx_yxrxhlrlsi.write(), ensureSubscribedToInAppMessageEvents.write);
            r8lambdazxt1df5niyc198h8rswq6bap4q.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer(r8lambdaed9byxnvlfnferv0pujy_lugi);
        } catch (IOException e) {
            parselonglambda0.IconCompatParcelizer(false, e, "IOException while caching SDK init config action: " + e.getMessage(), new Object[0]);
        } catch (JSONException e2) {
            parselonglambda0.IconCompatParcelizer(false, e2, "JSONException while caching SDK init config action: " + e2.getMessage(), new Object[0]);
        }
    }

    public static final void RemoteActionCompatParcelizer(r8lambdaZxT1DF5nIYC198H8Rswq6BaP4Q r8lambdazxt1df5niyc198h8rswq6bap4q, long j, SdkInitConfigProvider$fetchInitActionInternal$1$$ExternalSyntheticLambda0 sdkInitConfigProvider$fetchInitActionInternal$1$$ExternalSyntheticLambda0) {
        readStringlambda0.write(r8lambdazxt1df5niyc198h8rswq6bap4q.serializer, r8lambdazxt1df5niyc198h8rswq6bap4q.write, j, "SdkInitConfigProvider", sdkInitConfigProvider$fetchInitActionInternal$1$$ExternalSyntheticLambda0, 4).serializer();
    }
}
