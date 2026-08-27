package o;

import androidx.activity.EdgeToEdge$$ExternalSyntheticLambda0;
import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.processguard.Guard$Type;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "DataSyncPayloadUploader", guardType = Guard$Type.REFERENCE_COUNTED)
public final class r8lambdaJFE_chLd2jQnyQVpk_1hYHN04 implements removeGeofencesRegisteredWithGeofencingClientlambda2, r8lambda82wFrWs2p1d2rHZgArdpjkmWRs {
    public static final /* synthetic */ int serializer = 0;
    private final getAnalyticsEnabledEnterannotations IconCompatParcelizer;
    private r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s MediaBrowserCompatMediaItem;
    private final r8lambdaGL9bCdVX_IVxogyf2yW8ooi6UCc MediaDescriptionCompat;
    private final LinkedList MediaSessionCompatQueueItem;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;
    private final readandroid_sdk_base_release write;

    public static final class serializer {
        public serializer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    private final void IconCompatParcelizer() {
        boolean z;
        r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s r8lambdaezb9gs4ufatot1smgrrnpet3m3s;
        synchronized (this) {
            if (this.MediaBrowserCompatMediaItem == null) {
                r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4 r8lambda8nvscop5x9zktelkhscw8l8y0f4 = (r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4) this.MediaSessionCompatQueueItem.poll();
                if (r8lambda8nvscop5x9zktelkhscw8l8y0f4 == null) {
                    return;
                }
                this.read.IconCompatParcelizer("Starting upload for %s", r8lambda8nvscop5x9zktelkhscw8l8y0f4.serializer());
                this.MediaBrowserCompatMediaItem = this.MediaDescriptionCompat.write(r8lambda8nvscop5x9zktelkhscw8l8y0f4, this);
                z = true;
            } else {
                z = false;
            }
            if (!z || (r8lambdaezb9gs4ufatot1smgrrnpet3m3s = this.MediaBrowserCompatMediaItem) == null) {
                return;
            }
            this.RemoteActionCompatParcelizer.read();
            r8lambdaezb9gs4ufatot1smgrrnpet3m3s.RemoteActionCompatParcelizer();
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            LinkedList<r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4> linkedList = this.MediaSessionCompatQueueItem;
            for (r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4 r8lambda8nvscop5x9zktelkhscw8l8y0f4 : linkedList) {
                r8lambda8nvscop5x9zktelkhscw8l8y0f4.getClass();
                serializer(r8lambda8nvscop5x9zktelkhscw8l8y0f4, false);
            }
            linkedList.clear();
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        r8lambdaF12Je7JWofMNMl_jFPI1Y2rvbGI r8lambdaf12je7jwofmnml_jfpi1y2rvbgi = new r8lambdaF12Je7JWofMNMl_jFPI1Y2rvbGI(this);
        ControlMessage controlMessage = ControlMessage.DATA_SYNC_PAYLOAD_AVAILABLE;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.IconCompatParcelizer;
        getanalyticsenabledenterannotations.read(controlMessage, r8lambdaf12je7jwofmnml_jfpi1y2rvbgi);
        getanalyticsenabledenterannotations.read(ControlMessage.DATA_SYNC_PAYLOAD_FORCE_SUBMISSION, r8lambdaf12je7jwofmnml_jfpi1y2rvbgi);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new r8lambdaIcXpMtiVQjSAeVM0SfESKeh7g(this));
    }

    public final void write(r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4 r8lambda8nvscop5x9zktelkhscw8l8y0f4) {
        this.read.IconCompatParcelizer("Upload request came in from %s", r8lambda8nvscop5x9zktelkhscw8l8y0f4.serializer());
        synchronized (this) {
            this.MediaSessionCompatQueueItem.add(r8lambda8nvscop5x9zktelkhscw8l8y0f4);
        }
        IconCompatParcelizer();
    }

    static {
        new serializer(null);
    }

    public r8lambdaJFE_chLd2jQnyQVpk_1hYHN04(readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, parseLonglambda0 parselonglambda0, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, r8lambdaGL9bCdVX_IVxogyf2yW8ooi6UCc r8lambdagl9bcdvx_ivxogyf2yw8ooi6ucc) {
        readandroid_sdk_base_releaseVar.getClass();
        getanalyticsenabledenterannotations.getClass();
        parselonglambda0.getClass();
        r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4.getClass();
        r8lambdagl9bcdvx_ivxogyf2yw8ooi6ucc.getClass();
        this.write = readandroid_sdk_base_releaseVar;
        this.IconCompatParcelizer = getanalyticsenabledenterannotations;
        this.read = parselonglambda0;
        this.RemoteActionCompatParcelizer = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.MediaDescriptionCompat = r8lambdagl9bcdvx_ivxogyf2yw8ooi6ucc;
        this.MediaSessionCompatQueueItem = new LinkedList();
    }

    public static void IconCompatParcelizer(r8lambdaJFE_chLd2jQnyQVpk_1hYHN04 r8lambdajfe_chld2jqnyqvpk_1hyhn04) {
        r8lambdajfe_chld2jqnyqvpk_1hyhn04.IconCompatParcelizer();
        r8lambdajfe_chld2jqnyqvpk_1hyhn04.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    public static void serializer(r8lambdaJFE_chLd2jQnyQVpk_1hYHN04 r8lambdajfe_chld2jqnyqvpk_1hyhn04, String str, String str2, r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s r8lambdaezb9gs4ufatot1smgrrnpet3m3s, r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4 r8lambda8nvscop5x9zktelkhscw8l8y0f4) {
        str.getClass();
        str2.getClass();
        r8lambdajfe_chld2jqnyqvpk_1hyhn04.read.serializer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Request ", str, " with tag '", str2, "' was successful."), new Object[0]);
        if (r8lambdaezb9gs4ufatot1smgrrnpet3m3s == r8lambdajfe_chld2jqnyqvpk_1hyhn04.MediaBrowserCompatMediaItem) {
            r8lambdajfe_chld2jqnyqvpk_1hyhn04.MediaBrowserCompatMediaItem = null;
            r8lambdajfe_chld2jqnyqvpk_1hyhn04.IconCompatParcelizer.IconCompatParcelizer(ControlMessage.PAYLOAD_SUBMISSION_RESULT, new BannerPendingDismissal("DataSyncPayloadUploader", r8lambda8nvscop5x9zktelkhscw8l8y0f4.write(), r8lambda8nvscop5x9zktelkhscw8l8y0f4.IconCompatParcelizer(), true));
            r8lambdajfe_chld2jqnyqvpk_1hyhn04.IconCompatParcelizer();
        }
        r8lambdajfe_chld2jqnyqvpk_1hyhn04.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    public static void RemoteActionCompatParcelizer(Exception exc, r8lambdaJFE_chLd2jQnyQVpk_1hYHN04 r8lambdajfe_chld2jqnyqvpk_1hyhn04, String str, r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s r8lambdaezb9gs4ufatot1smgrrnpet3m3s, r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4 r8lambda8nvscop5x9zktelkhscw8l8y0f4) {
        parseLonglambda0 parselonglambda0 = r8lambdajfe_chld2jqnyqvpk_1hyhn04.read;
        if (exc == null) {
            parselonglambda0.RemoteActionCompatParcelizer(str, new Object[0]);
        } else {
            parselonglambda0.IconCompatParcelizer(false, exc, str, new Object[0]);
        }
        if (r8lambdaezb9gs4ufatot1smgrrnpet3m3s == r8lambdajfe_chld2jqnyqvpk_1hyhn04.MediaBrowserCompatMediaItem) {
            r8lambdajfe_chld2jqnyqvpk_1hyhn04.MediaBrowserCompatMediaItem = null;
            r8lambdajfe_chld2jqnyqvpk_1hyhn04.IconCompatParcelizer.IconCompatParcelizer(ControlMessage.PAYLOAD_SUBMISSION_RESULT, new BannerPendingDismissal("DataSyncPayloadUploader", r8lambda8nvscop5x9zktelkhscw8l8y0f4.write(), r8lambda8nvscop5x9zktelkhscw8l8y0f4.IconCompatParcelizer(), false));
            r8lambdajfe_chld2jqnyqvpk_1hyhn04.IconCompatParcelizer();
        }
        r8lambdajfe_chld2jqnyqvpk_1hyhn04.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    private final void serializer(r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4 r8lambda8nvscop5x9zktelkhscw8l8y0f4, boolean z) {
        this.read.serializer("Cancelling request: " + r8lambda8nvscop5x9zktelkhscw8l8y0f4, new Object[0]);
        synchronized (this) {
            r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s r8lambdaezb9gs4ufatot1smgrrnpet3m3s = this.MediaBrowserCompatMediaItem;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambdaezb9gs4ufatot1smgrrnpet3m3s != null ? r8lambdaezb9gs4ufatot1smgrrnpet3m3s.IconCompatParcelizer().write() : null, r8lambda8nvscop5x9zktelkhscw8l8y0f4.write()}, getCieXyz.write())).booleanValue()) {
                r8lambda8nvscop5x9zktelkhscw8l8y0f4.RemoteActionCompatParcelizer();
                this.MediaBrowserCompatMediaItem = null;
                if (z) {
                    this.RemoteActionCompatParcelizer.read();
                    this.write.RemoteActionCompatParcelizer(new ZM$$ExternalSyntheticLambda2(29, this));
                }
            } else if (this.MediaSessionCompatQueueItem.remove(r8lambda8nvscop5x9zktelkhscw8l8y0f4)) {
                r8lambda8nvscop5x9zktelkhscw8l8y0f4.RemoteActionCompatParcelizer();
            }
        }
    }

    public final void IconCompatParcelizer(r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4 r8lambda8nvscop5x9zktelkhscw8l8y0f4) {
        r8lambda8nvscop5x9zktelkhscw8l8y0f4.getClass();
        serializer(r8lambda8nvscop5x9zktelkhscw8l8y0f4, true);
    }

    public final void read(r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s r8lambdaezb9gs4ufatot1smgrrnpet3m3s) {
        r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4 r8lambda8nvscop5x9zktelkhscw8l8y0f4IconCompatParcelizer = r8lambdaezb9gs4ufatot1smgrrnpet3m3s.IconCompatParcelizer();
        String strSerializer = r8lambda8nvscop5x9zktelkhscw8l8y0f4IconCompatParcelizer.serializer();
        this.write.RemoteActionCompatParcelizer(new EdgeToEdge$$ExternalSyntheticLambda0(this, r8lambda8nvscop5x9zktelkhscw8l8y0f4IconCompatParcelizer.write(), strSerializer, r8lambdaezb9gs4ufatot1smgrrnpet3m3s, r8lambda8nvscop5x9zktelkhscw8l8y0f4IconCompatParcelizer, 6), strSerializer);
    }

    public final void RemoteActionCompatParcelizer(r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s r8lambdaezb9gs4ufatot1smgrrnpet3m3s, String str, Exception exc) {
        r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4 r8lambda8nvscop5x9zktelkhscw8l8y0f4IconCompatParcelizer = r8lambdaezb9gs4ufatot1smgrrnpet3m3s.IconCompatParcelizer();
        String strSerializer = r8lambda8nvscop5x9zktelkhscw8l8y0f4IconCompatParcelizer.serializer();
        this.write.RemoteActionCompatParcelizer(new EdgeToEdge$$ExternalSyntheticLambda0(exc, this, str, r8lambdaezb9gs4ufatot1smgrrnpet3m3s, r8lambda8nvscop5x9zktelkhscw8l8y0f4IconCompatParcelizer, 5), strSerializer);
    }
}
