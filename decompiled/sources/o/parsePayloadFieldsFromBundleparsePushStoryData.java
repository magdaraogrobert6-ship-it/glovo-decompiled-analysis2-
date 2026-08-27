package o;

import android.content.Context;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.tile.j$$ExternalSyntheticLambda1;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "TransportTagsProvider")
public final class parsePayloadFieldsFromBundleparsePushStoryData implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final readandroid_sdk_base_release IconCompatParcelizer;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final Context read;
    private final serializer write;

    public static final class IconCompatParcelizer {
        public IconCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final class serializer extends migrateTriggersReeligibilityToJsonlambda1<List<parseString>> {
        public serializer() {
        }

        @Override // o.migrateTriggersReeligibilityToJsonlambda1
        public final List<parseString> RemoteActionCompatParcelizer() {
            final parsePayloadFieldsFromBundleparsePushStoryData parsepayloadfieldsfrombundleparsepushstorydata = parsePayloadFieldsFromBundleparsePushStoryData.this;
            List<parseString> list = parsepayloadfieldsfrombundleparsepushstorydata.read();
            parsepayloadfieldsfrombundleparsepushstorydata.IconCompatParcelizer().IconCompatParcelizer("Loaded %d transport tag sets.", Integer.valueOf(list.size()));
            if (list.isEmpty()) {
                return new ArrayList();
            }
            List listRemoteActionCompatParcelizer = parsepayloadfieldsfrombundleparsepushstorydata.RemoteActionCompatParcelizer(list);
            if (listRemoteActionCompatParcelizer.size() != list.size()) {
                parsePayloadFieldsFromBundleparsePushStoryData.IconCompatParcelizer(parsepayloadfieldsfrombundleparsepushstorydata, listRemoteActionCompatParcelizer, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.sentiance.sdk.eventtimeline.transporttags.TransportTagsProvider$LazyTransportTagsList$initialize$1
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        parsepayloadfieldsfrombundleparsepushstorydata.IconCompatParcelizer().IconCompatParcelizer("Transport tags cleanup done.", new Object[0]);
                        return createFromParcel.INSTANCE;
                    }

                    {
                        super(0);
                    }
                });
            }
            ArrayList arrayList = new ArrayList(listRemoteActionCompatParcelizer);
            parsepayloadfieldsfrombundleparsepushstorydata.IconCompatParcelizer().IconCompatParcelizer("Retrieved %d transport tag sets post cleanup.", Integer.valueOf(listRemoteActionCompatParcelizer.size()));
            return arrayList;
        }
    }

    public final parseLonglambda0 IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
    }

    public static void serializer(parsePayloadFieldsFromBundleparsePushStoryData parsepayloadfieldsfrombundleparsepushstorydata, List list, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        parseLonglambda0 parselonglambda0 = parsepayloadfieldsfrombundleparsepushstorydata.RemoteActionCompatParcelizer;
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = parsepayloadfieldsfrombundleparsepushstorydata.read.openFileOutput("transport_tags.gz", 0);
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(fileOutputStreamOpenFileOutput);
                try {
                    byte[] bytes = r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.write(list).getBytes(ensureSubscribedToInAppMessageEvents.write);
                    bytes.getClass();
                    gZIPOutputStream.write(bytes);
                    gZIPOutputStream.close();
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileOutputStreamOpenFileOutput, null}, sourceInformationContextOfdefault.read());
                    parselonglambda0.IconCompatParcelizer("%d transport tag sets have been written to disk.", Integer.valueOf(list.size()));
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{gZIPOutputStream, th}, sourceInformationContextOfdefault.read());
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileOutputStreamOpenFileOutput, th3}, sourceInformationContextOfdefault.read());
                    throw th4;
                }
            }
        } catch (IOException e) {
            parselonglambda0.IconCompatParcelizer(false, e, "Failed to save tags", new Object[0]);
        } catch (JSONException e2) {
            parselonglambda0.IconCompatParcelizer(false, e2, "Failed to save tags", new Object[0]);
        }
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.write.write();
        boolean zDeleteFile = this.read.deleteFile("transport_tags.gz");
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        if (zDeleteFile) {
            parselonglambda0.IconCompatParcelizer("Transport tags have been removed from disk.", new Object[0]);
        } else {
            parselonglambda0.IconCompatParcelizer("Failed to remove transport tags from disk.", new Object[0]);
        }
    }

    static {
        new IconCompatParcelizer(null);
    }

    public parsePayloadFieldsFromBundleparsePushStoryData(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, Context context, parseLonglambda0 parselonglambda0, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        context.getClass();
        parselonglambda0.getClass();
        readandroid_sdk_base_releaseVar.getClass();
        this.read = context;
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.IconCompatParcelizer = readandroid_sdk_base_releaseVar;
        this.write = new serializer();
    }

    public final List<parseString> read() {
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        try {
            FileInputStream fileInputStreamOpenFileInput = this.read.openFileInput("transport_tags.gz");
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(fileInputStreamOpenFileInput);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, ensureSubscribedToInAppMessageEvents.write), 8192);
                    try {
                        String strIconCompatParcelizer = TextStreamsKt.IconCompatParcelizer(bufferedReader);
                        bufferedReader.close();
                        gZIPInputStream.close();
                        int i = sourceInformationContextOfdefault.read();
                        int i2 = sourceInformationContextOfdefault.read();
                        int i3 = sourceInformationContextOfdefault.read();
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileInputStreamOpenFileInput, null}, i3);
                        return r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.RemoteActionCompatParcelizer(parseString.class, strIconCompatParcelizer, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            int i4 = sourceInformationContextOfdefault.read();
                            int i5 = sourceInformationContextOfdefault.read();
                            int i6 = sourceInformationContextOfdefault.read();
                            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i4, i5, -871780639, sourceInformationContextOfdefault.read(), new Object[]{bufferedReader, th}, i6);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        int i7 = sourceInformationContextOfdefault.read();
                        int i8 = sourceInformationContextOfdefault.read();
                        int i9 = sourceInformationContextOfdefault.read();
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i7, i8, -871780639, sourceInformationContextOfdefault.read(), new Object[]{gZIPInputStream, th3}, i9);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    int i10 = sourceInformationContextOfdefault.read();
                    int i11 = sourceInformationContextOfdefault.read();
                    int i12 = sourceInformationContextOfdefault.read();
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i10, i11, -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileInputStreamOpenFileInput, th5}, i12);
                    throw th6;
                }
            }
        } catch (FileNotFoundException e) {
            parselonglambda0.IconCompatParcelizer(false, e, "Cannot locate transport tags file", new Object[0]);
            return instance_delegatelambda0.write;
        } catch (IOException e2) {
            parselonglambda0.IconCompatParcelizer(false, e2, "an IO error has occurred", new Object[0]);
            return instance_delegatelambda0.write;
        } catch (JSONException e3) {
            parselonglambda0.IconCompatParcelizer(false, e3, "Failed to serialize transport tags", new Object[0]);
            return instance_delegatelambda0.write;
        }
    }

    public final void read(final Map<String, String> map) throws IllegalArgumentException {
        boolean z;
        List listPlaybackStateCompat;
        map.getClass();
        if (map.isEmpty()) {
            z = false;
        } else {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry<String, String> next = it.next();
                    String key = next.getKey();
                    String value = next.getValue();
                    if (key.length() > 256 || value.length() > 256) {
                        z = true;
                    }
                } else {
                    z = false;
                }
            }
        }
        boolean z2 = map.size() > 6;
        if (z) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("A tag's key or value exceeds the maximum allowed number of characters.");
            return;
        }
        if (z2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(map.size(), "The number of tags provided (", ") exceeds the maximum allowed number of tags (6).");
            return;
        }
        parseString parsestring = new parseString();
        parsestring.RemoteActionCompatParcelizer(System.currentTimeMillis());
        parsestring.RemoteActionCompatParcelizer(map);
        final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.sentiance.sdk.eventtimeline.transporttags.TransportTagsProvider$storeTags$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                this.this$0.IconCompatParcelizer().IconCompatParcelizer("%d transport tag(s) have been set.", Integer.valueOf(map.size()));
                return createFromParcel.INSTANCE;
            }
        };
        synchronized (this.write) {
            List<parseString> list = this.write.read();
            List<parseString> list2 = list;
            list2.add(parsestring);
            List<parseString> listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(list2);
            list2.clear();
            list2.addAll(listRemoteActionCompatParcelizer);
            listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(list2);
        }
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(new j$$ExternalSyntheticLambda1(this, listPlaybackStateCompat, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.sentiance.sdk.eventtimeline.transporttags.TransportTagsProvider$appendTransportTags$3
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                return createFromParcel.INSTANCE;
            }

            {
                super(0);
            }
        }, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x003d A[EDGE_INSN: B:13:0x003d->B:19:0x0056 BREAK  A[LOOP:0: B:6:0x0015->B:29:?]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection, java.util.List<o.parseString>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    public final List<parseString> RemoteActionCompatParcelizer(List<parseString> list) {
        ?? PlaybackStateCompat;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zIsEmpty = list.isEmpty();
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if (!zIsEmpty) {
            ListIterator<parseString> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    PlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(list);
                    break;
                }
                if (listIterator.previous().IconCompatParcelizer() < jCurrentTimeMillis - CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL) {
                    listIterator.next();
                    int size = list.size() - listIterator.nextIndex();
                    if (size != 0) {
                        PlaybackStateCompat = new ArrayList(size);
                        while (listIterator.hasNext()) {
                            PlaybackStateCompat.add(listIterator.next());
                        }
                        break;
                    }
                    PlaybackStateCompat = instance_delegatelambda0Var;
                    break;
                }
            }
        } else {
            PlaybackStateCompat = instance_delegatelambda0Var;
            break;
        }
        if (!PlaybackStateCompat.isEmpty()) {
            return PlaybackStateCompat;
        }
        parseString parsestring = (parseString) onContentCardDismissed.MediaBrowserCompatMediaItem((List) list);
        if (parsestring == null) {
            return instance_delegatelambda0Var;
        }
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{parsestring}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
    }

    public final parseString read(long j) {
        Object obj;
        parseString parsestring;
        synchronized (this.write) {
            List<parseString> list = this.write.read();
            list.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((parseString) obj2).IconCompatParcelizer() < j) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    long jIconCompatParcelizer = ((parseString) next).IconCompatParcelizer();
                    do {
                        Object next2 = it.next();
                        long jIconCompatParcelizer2 = ((parseString) next2).IconCompatParcelizer();
                        if (jIconCompatParcelizer < jIconCompatParcelizer2) {
                            next = next2;
                            jIconCompatParcelizer = jIconCompatParcelizer2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            parsestring = (parseString) obj;
        }
        return parsestring;
    }

    public static final void IconCompatParcelizer(parsePayloadFieldsFromBundleparsePushStoryData parsepayloadfieldsfrombundleparsepushstorydata, List list, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        parsepayloadfieldsfrombundleparsepushstorydata.IconCompatParcelizer.RemoteActionCompatParcelizer(new j$$ExternalSyntheticLambda1(parsepayloadfieldsfrombundleparsepushstorydata, list, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 9));
    }
}
