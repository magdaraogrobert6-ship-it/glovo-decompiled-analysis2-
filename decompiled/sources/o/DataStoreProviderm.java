package o;

import android.content.Context;
import android.database.Cursor;
import android.location.Location;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueSignificance;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "ZippedTileStore", componentName = "ZippedVenueTileStore")
public class DataStoreProviderm extends DataStoreProvideri<r8lambdaYpjpX6UFmLqQOe26pN5Y9DtSI4> {
    public static final int write;
    private final parseLonglambda0 MediaBrowserCompatMediaItem;
    private final r8lambda3YrtAT1KG4P0WwuSh0oKlbt6ks MediaDescriptionCompat;
    private final long MediaMetadataCompat;
    private final Context MediaSessionCompatQueueItem;
    private final String MediaSessionCompatToken;
    private final r8lambdaLD6VIt3lDGPHJe4UaQvQiu81jjo PlaybackStateCompatCustomAction;
    private final setHeaderTextColor RatingCompat;
    private final int RemoteActionCompatParcelizer;
    private final String read;
    private final String serializer;

    public static final class RemoteActionCompatParcelizer {
        public RemoteActionCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // o.DataStoreProvideri
    public final String IconCompatParcelizer() {
        return this.MediaSessionCompatToken;
    }

    @Override // o.DataStoreProvideri
    public final DataStoreProviderp MediaMetadataCompat() {
        return this.PlaybackStateCompatCustomAction;
    }

    @Override // o.DataStoreProvideri
    public final String RatingCompat() {
        return this.read;
    }

    @Override // o.DataStoreProvideri
    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.DataStoreProvideri
    public final String read() {
        return this.serializer;
    }

    @Override // o.DataStoreProvideri
    public final long write() {
        return this.MediaMetadataCompat;
    }

    private final String IconCompatParcelizer(List<Integer> list) {
        r8lambda4uWA2XKn9m8LsqLzYSUJO6oiPxw.IconCompatParcelizer iconCompatParcelizer = new r8lambda4uWA2XKn9m8LsqLzYSUJO6oiPxw.IconCompatParcelizer();
        iconCompatParcelizer.IconCompatParcelizer("m.venue_significance").read(list);
        r8lambda4uWA2XKn9m8LsqLzYSUJO6oiPxw r8lambda4uwa2xkn9m8lsqlzysujo6oipxw = new r8lambda4uWA2XKn9m8LsqLzYSUJO6oiPxw();
        List list2 = (List) this.RatingCompat.serializer(Collections.EMPTY_LIST, new r8lambdayIxqFCqp5HXqcwSgBY71YAQtSs(r8lambda4uwa2xkn9m8lsqlzysujo6oipxw, iconCompatParcelizer, this.MediaBrowserCompatMediaItem, 3));
        if (list2.isEmpty()) {
            return null;
        }
        _set_durationInMilliseconds_lambda0 _set_durationinmilliseconds_lambda0 = ((setMessageFields) list2.get(0)).read();
        Location location = new Location("");
        location.setLatitude(_set_durationinmilliseconds_lambda0.MediaMetadataCompat());
        location.setLongitude(_set_durationinmilliseconds_lambda0.MediaDescriptionCompat());
        return shutdownAllDataStoresdefault.RemoteActionCompatParcelizer(shutdownAllDataStoresdefault.write(location.getLatitude(), location.getLongitude(), write));
    }

    @Override // o.DataStoreProvideri
    public final void ParcelableVolumeInfo() {
        Context context = this.MediaSessionCompatQueueItem;
        File file = new File(context.getNoBackupFilesDir(), "com.sentiance.sdk/ondevice/tiles/");
        File file2 = new File(context.getNoBackupFilesDir(), this.read);
        file2.mkdirs();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            ArrayList<File> arrayList = new ArrayList();
            for (File file3 : fileArrListFiles) {
                if (file3.isFile()) {
                    arrayList.add(file3);
                }
            }
            for (File file4 : arrayList) {
                file4.renameTo(new File(file2, file4.getName()));
            }
        }
        File[] fileArrListFiles2 = new File(context.getNoBackupFilesDir(), "com.sentiance.sdk/ondevice/downloading_tiles/").listFiles();
        if (fileArrListFiles2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (File file5 : fileArrListFiles2) {
                if (file5.isFile()) {
                    arrayList2.add(file5);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
        }
        super.ParcelableVolumeInfo();
    }

    static {
        new RemoteActionCompatParcelizer(null);
        write = 10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreProviderm(com.sentiance.sdk.util.c cVar, Context context, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, ServerConfigDataStoreProviderCompanionExternalSyntheticLambda1 serverConfigDataStoreProviderCompanionExternalSyntheticLambda1, migrateBlocklistedListlambda1 migrateblocklistedlistlambda1, getConversationReplyPersonId getconversationreplypersonid, getVerticalAccuracy getverticalaccuracy, parseLonglambda0 parselonglambda0, r8lambda3YrtAT1KG4P0WwuSh0oKlbt6ks r8lambda3yrtat1kg4p0wwush0oklbt6ks, setHeaderTextColor setheadertextcolor) {
        super("sentiance-zipped-tiles", 1, cVar, parselonglambda0, context, getanalyticsenabledenterannotations, readandroid_sdk_base_releaseVar, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, serverConfigDataStoreProviderCompanionExternalSyntheticLambda1, migrateblocklistedlistlambda1, getverticalaccuracy, getconversationreplypersonid);
        cVar.getClass();
        context.getClass();
        getanalyticsenabledenterannotations.getClass();
        readandroid_sdk_base_releaseVar.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        serverConfigDataStoreProviderCompanionExternalSyntheticLambda1.getClass();
        migrateblocklistedlistlambda1.getClass();
        getconversationreplypersonid.getClass();
        getverticalaccuracy.getClass();
        parselonglambda0.getClass();
        r8lambda3yrtat1kg4p0wwush0oklbt6ks.getClass();
        setheadertextcolor.getClass();
        this.MediaSessionCompatQueueItem = context;
        this.MediaBrowserCompatMediaItem = parselonglambda0;
        this.MediaDescriptionCompat = r8lambda3yrtat1kg4p0wwush0oklbt6ks;
        this.RatingCompat = setheadertextcolor;
        this.PlaybackStateCompatCustomAction = r8lambdaLD6VIt3lDGPHJe4UaQvQiu81jjo.write;
        this.MediaSessionCompatToken = "ZippedVenueTileStore";
        this.read = "com.sentiance.sdk/ondevice/tiles/venues/";
        this.serializer = "com.sentiance.sdk/ondevice/downloading_tiles/venues/";
        this.RemoteActionCompatParcelizer = 3;
        this.MediaMetadataCompat = 104857600L;
    }

    public final boolean serializer(String str, String str2, DustDataStoreProviderCompanion dustDataStoreProviderCompanion) {
        InputStream inputStream;
        str2.getClass();
        File fileWrite = write(str);
        boolean zExists = fileWrite.exists();
        parseLonglambda0 parselonglambda0 = this.MediaBrowserCompatMediaItem;
        boolean z = false;
        if (!zExists) {
            parselonglambda0.RemoteActionCompatParcelizer("Cannot parse tile, file %s does not exist.", fileWrite.getName());
            return false;
        }
        r8lambdaYpjpX6UFmLqQOe26pN5Y9DtSI4 r8lambdaypjpx6ufmlqqoe26pn5y9dtsi4IconCompatParcelizer = IconCompatParcelizer(str);
        if (r8lambdaypjpx6ufmlqqoe26pn5y9dtsi4IconCompatParcelizer == null) {
            parselonglambda0.RemoteActionCompatParcelizer("Cannot parse tile, quadKey: %s. Zipped tile info do not exist", str);
            return false;
        }
        RemoteActionCompatParcelizer(str);
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.tile.store.ZippedVenueTileStore$loadTile$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                Exception exc = (Exception) obj;
                exc.getClass();
                this.this$0.RemoteActionCompatParcelizer(exc);
                return createFromParcel.INSTANCE;
            }

            {
                super(1);
            }
        };
        try {
            String strConcat = str2.concat(".proto");
            long j = r8lambdaypjpx6ufmlqqoe26pn5y9dtsi4IconCompatParcelizer.MediaDescriptionCompat;
            ZipFile zipFile = new ZipFile(fileWrite);
            try {
                ZipEntry entry = zipFile.getEntry(strConcat);
                if (entry != null && (inputStream = zipFile.getInputStream(entry)) != null) {
                    try {
                        this.MediaDescriptionCompat.getClass();
                        r8lambda3YrtAT1KG4P0WwuSh0oKlbt6ks.IconCompatParcelizer(inputStream, dustDataStoreProviderCompanion, str2, j);
                        inputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{inputStream, th}, sourceInformationContextOfdefault.read());
                            throw th2;
                        }
                    }
                }
                zipFile.close();
                z = true;
                RemoteActionCompatParcelizer((String) null);
                RatingCompat(str);
                return z;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{zipFile, th3}, sourceInformationContextOfdefault.read());
                    throw th4;
                }
            }
        } catch (Exception e) {
            parselonglambda0.IconCompatParcelizer(false, e, "Failed to extract tile with quad key %s, or parse the zipped tile.", str2);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(e);
        }
    }

    @Override // o.DataStoreProvideri
    public final DataStoreProviderq write(Cursor cursor) {
        try {
            r8lambdaYpjpX6UFmLqQOe26pN5Y9DtSI4.IconCompatParcelizer.getClass();
            return r8lambdaYpjpX6UFmLqQOe26pN5Y9DtSI4.serializer.RemoteActionCompatParcelizer(cursor);
        } catch (Exception e) {
            this.MediaBrowserCompatMediaItem.IconCompatParcelizer(false, e, "Failed to create ZippedVenueTileInfoEntry from cursor", new Object[0]);
            return null;
        }
    }

    @Override // o.DataStoreProvideri
    public final DataStoreProviderq write(String str, long j, long j2, long j3) {
        str.getClass();
        return new r8lambdaYpjpX6UFmLqQOe26pN5Y9DtSI4(str, j, j2, j3);
    }

    @Override // o.DataStoreProvideri
    public final Set<String> read(List<r8lambdaYpjpX6UFmLqQOe26pN5Y9DtSI4> list) {
        list.getClass();
        Set<String> setParcelableVolumeInfo = onContentCardDismissed.ParcelableVolumeInfo(super.read(list));
        String strIconCompatParcelizer = IconCompatParcelizer(androidx.sqlite.SQLite.read(Integer.valueOf(VenueSignificance.HOME.value), Integer.valueOf(VenueSignificance.HOME_PROVISIONAL.value)));
        if (strIconCompatParcelizer != null) {
            setParcelableVolumeInfo.add(strIconCompatParcelizer);
        }
        String strIconCompatParcelizer2 = IconCompatParcelizer(androidx.sqlite.SQLite.read(Integer.valueOf(VenueSignificance.WORK.value), Integer.valueOf(VenueSignificance.WORK_PROVISIONAL.value)));
        if (strIconCompatParcelizer2 != null) {
            setParcelableVolumeInfo.add(strIconCompatParcelizer2);
        }
        return setParcelableVolumeInfo;
    }
}
