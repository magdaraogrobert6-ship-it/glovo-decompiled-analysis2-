package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw extends r8lambdaQAShlesJf6NzG1CuBMO3e9m802I {
    private final parseLonglambda0 IconCompatParcelizer;
    private final retrieveRegisteredGeofencesFromLocalStoragelambda0 MediaBrowserCompatMediaItem;
    private final DataStoreProviderExternalSyntheticLambda7 MediaDescriptionCompat;
    private final LinkedList MediaMetadataCompat = new LinkedList();
    private final isGeofencesEnabledFromEnvironmentlambda1 MediaSessionCompatQueueItem;
    private r8lambdaCE_GWPYEoJlQPHqzu_0IXLVzJ48 PlaybackStateCompat;
    private final DataStoreProvideri RatingCompat;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 RemoteActionCompatParcelizer;
    private final deleteFileWithRetrydefault read;
    private final getLastKnownGpsLocationIfValidlambda0 serializer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI write;

    private void serializer() {
        synchronized (this) {
            r8lambdaCE_GWPYEoJlQPHqzu_0IXLVzJ48 r8lambdace_gwpyeojlqphqzu_0ixlvzj48 = (r8lambdaCE_GWPYEoJlQPHqzu_0IXLVzJ48) this.MediaMetadataCompat.poll();
            this.PlaybackStateCompat = r8lambdace_gwpyeojlqphqzu_0ixlvzj48;
            if (r8lambdace_gwpyeojlqphqzu_0ixlvzj48 == null) {
                return;
            }
            this.RemoteActionCompatParcelizer.read();
            this.read.write(this.PlaybackStateCompat.IconCompatParcelizer, this.PlaybackStateCompat.RatingCompat, this);
        }
    }

    public abstract boolean IconCompatParcelizer();

    public static class serializer {
        private final clearandroid_sdk_base_release IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private final String read;
        private final DataStoreProviderCompanion write;

        public serializer(String str, String str2, DataStoreProviderCompanion dataStoreProviderCompanion, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
            this.RemoteActionCompatParcelizer = str;
            this.read = str2;
            this.write = dataStoreProviderCompanion;
            this.IconCompatParcelizer = clearandroid_sdk_base_releaseVar;
        }

        public final String IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public final void RemoteActionCompatParcelizer(String str) {
        this.MediaDescriptionCompat.serializer(str);
        write(false, null);
    }

    public final void serializer(serializer serializerVar) {
        DataStoreProviderq dataStoreProviderqIconCompatParcelizer;
        r8lambdaCE_GWPYEoJlQPHqzu_0IXLVzJ48 r8lambdace_gwpyeojlqphqzu_0ixlvzj48 = new r8lambdaCE_GWPYEoJlQPHqzu_0IXLVzJ48(serializerVar.RemoteActionCompatParcelizer);
        r8lambdace_gwpyeojlqphqzu_0ixlvzj48.read(serializerVar);
        synchronized (this) {
            boolean z = false;
            if (IconCompatParcelizer()) {
                isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1 = this.MediaSessionCompatQueueItem;
                if ((isgeofencesenabledfromenvironmentlambda1.read() == 2 ? this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer() : isgeofencesenabledfromenvironmentlambda1.RatingCompat()) && this.MediaDescriptionCompat.write(serializerVar.RemoteActionCompatParcelizer)) {
                    r8lambdaCE_GWPYEoJlQPHqzu_0IXLVzJ48 r8lambdace_gwpyeojlqphqzu_0ixlvzj49 = read(serializerVar.RemoteActionCompatParcelizer);
                    if (r8lambdace_gwpyeojlqphqzu_0ixlvzj49 == null || r8lambdace_gwpyeojlqphqzu_0ixlvzj49.serializer) {
                        String str = serializerVar.RemoteActionCompatParcelizer;
                        DataStoreProvideri dataStoreProvideri = this.RatingCompat;
                        dataStoreProvideri.getClass();
                        str.getClass();
                        r8lambdace_gwpyeojlqphqzu_0ixlvzj48.RatingCompat = (dataStoreProvideri.write(str).exists() && (dataStoreProviderqIconCompatParcelizer = dataStoreProvideri.IconCompatParcelizer(str)) != null) ? Long.valueOf(dataStoreProviderqIconCompatParcelizer.MediaDescriptionCompat) : null;
                        this.MediaMetadataCompat.add(r8lambdace_gwpyeojlqphqzu_0ixlvzj48);
                    } else {
                        r8lambdace_gwpyeojlqphqzu_0ixlvzj49.read(serializerVar);
                    }
                    if (this.PlaybackStateCompat == null) {
                        this.PlaybackStateCompat = (r8lambdaCE_GWPYEoJlQPHqzu_0IXLVzJ48) this.MediaMetadataCompat.peek();
                        z = true;
                    }
                    if (z) {
                        serializer();
                        return;
                    }
                    return;
                }
            }
            r8lambdace_gwpyeojlqphqzu_0ixlvzj48.serializer(false, this.RemoteActionCompatParcelizer);
        }
    }

    public r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw(r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, parseLonglambda0 parselonglambda0, getLastKnownGpsLocationIfValidlambda0 getlastknowngpslocationifvalidlambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, deleteFileWithRetrydefault deletefilewithretrydefault, DataStoreProvideri dataStoreProvideri, DataStoreProviderExternalSyntheticLambda7 dataStoreProviderExternalSyntheticLambda7, isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1, retrieveRegisteredGeofencesFromLocalStoragelambda0 retrieveregisteredgeofencesfromlocalstoragelambda0) {
        this.RemoteActionCompatParcelizer = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.IconCompatParcelizer = parselonglambda0;
        this.serializer = getlastknowngpslocationifvalidlambda0;
        this.MediaSessionCompatQueueItem = isgeofencesenabledfromenvironmentlambda1;
        this.write = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.read = deletefilewithretrydefault;
        this.RatingCompat = dataStoreProvideri;
        this.MediaBrowserCompatMediaItem = retrieveregisteredgeofencesfromlocalstoragelambda0;
        this.MediaDescriptionCompat = dataStoreProviderExternalSyntheticLambda7;
    }

    private r8lambdaCE_GWPYEoJlQPHqzu_0IXLVzJ48 read(String str) {
        r8lambdaCE_GWPYEoJlQPHqzu_0IXLVzJ48 r8lambdace_gwpyeojlqphqzu_0ixlvzj48 = this.PlaybackStateCompat;
        if (r8lambdace_gwpyeojlqphqzu_0ixlvzj48 != null && r8lambdace_gwpyeojlqphqzu_0ixlvzj48.IconCompatParcelizer.equals(str)) {
            return this.PlaybackStateCompat;
        }
        for (r8lambdaCE_GWPYEoJlQPHqzu_0IXLVzJ48 r8lambdace_gwpyeojlqphqzu_0ixlvzj49 : new ArrayList(this.MediaMetadataCompat)) {
            if (r8lambdace_gwpyeojlqphqzu_0ixlvzj49.IconCompatParcelizer.equals(str)) {
                return r8lambdace_gwpyeojlqphqzu_0ixlvzj49;
            }
        }
        return null;
    }

    @Override // o.r8lambdaQAShlesJf6NzG1CuBMO3e9m802I
    public final void serializer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release) {
        Object[] objArr = {Integer.valueOf(setshouldpersistwebviewwhenbackgroundingapp.serializer), setshouldpersistwebviewwhenbackgroundingapp.read};
        parseLonglambda0 parselonglambda0 = this.IconCompatParcelizer;
        parselonglambda0.IconCompatParcelizer("onResponse: %d, %s", objArr);
        r8lambdaCE_GWPYEoJlQPHqzu_0IXLVzJ48 r8lambdace_gwpyeojlqphqzu_0ixlvzj48 = this.PlaybackStateCompat;
        boolean z = false;
        if (r8lambdace_gwpyeojlqphqzu_0ixlvzj48 == null) {
            write(false, null);
            return;
        }
        int i = setshouldpersistwebviewwhenbackgroundingapp.serializer;
        DataStoreProviderExternalSyntheticLambda7 dataStoreProviderExternalSyntheticLambda7 = this.MediaDescriptionCompat;
        if (i == 200) {
            if (setsmallnotificationiconnameandroid_sdk_base_release == null) {
                parselonglambda0.RemoteActionCompatParcelizer("Failed to save downloaded tile, response body null", new Object[0]);
            } else {
                parselonglambda0.IconCompatParcelizer("Saving tile: %s", r8lambdace_gwpyeojlqphqzu_0ixlvzj48.IconCompatParcelizer);
                DataStoreProvideri dataStoreProvideri = this.RatingCompat;
                File fileMediaBrowserCompatMediaItem = dataStoreProvideri.MediaBrowserCompatMediaItem();
                File file = new File(dataStoreProvideri.MediaSessionCompatQueueItem(), ff$$ExternalSyntheticOutline0.m(new StringBuilder(), r8lambdace_gwpyeojlqphqzu_0ixlvzj48.IconCompatParcelizer, ".zip"));
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(setsmallnotificationiconnameandroid_sdk_base_release.write());
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(fileMediaBrowserCompatMediaItem);
                        try {
                            migrateMetadataToJson.IconCompatParcelizer(bufferedInputStream, fileOutputStream);
                            fileOutputStream.close();
                            bufferedInputStream.close();
                            if (fileMediaBrowserCompatMediaItem.renameTo(file)) {
                                dataStoreProvideri.PlaybackStateCompat();
                                dataStoreProvideri.PlaybackStateCompatCustomAction();
                                z = true;
                            } else {
                                parselonglambda0.RemoteActionCompatParcelizer("Failed to rename tile file from %s to %s", fileMediaBrowserCompatMediaItem.getAbsolutePath(), file.getAbsolutePath());
                                dataStoreProvideri.PlaybackStateCompat();
                            }
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (IOException e) {
                    parselonglambda0.IconCompatParcelizer(false, e, "Failed to save zipped tile", new Object[0]);
                    dataStoreProvideri.PlaybackStateCompat();
                }
            }
            dataStoreProviderExternalSyntheticLambda7.serializer(r8lambdace_gwpyeojlqphqzu_0ixlvzj48.IconCompatParcelizer);
        } else {
            dataStoreProviderExternalSyntheticLambda7.write(r8lambdace_gwpyeojlqphqzu_0ixlvzj48.IconCompatParcelizer, 30000L);
        }
        write(z, null);
    }

    public final void IconCompatParcelizer(String str) {
        write(false, null);
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this) {
            this.MediaMetadataCompat.clear();
            this.read.write();
            r8lambdaCE_GWPYEoJlQPHqzu_0IXLVzJ48 r8lambdace_gwpyeojlqphqzu_0ixlvzj48 = this.PlaybackStateCompat;
            if (r8lambdace_gwpyeojlqphqzu_0ixlvzj48 != null && r8lambdace_gwpyeojlqphqzu_0ixlvzj48.RemoteActionCompatParcelizer != null) {
                this.PlaybackStateCompat.RemoteActionCompatParcelizer.serializer();
            }
        }
    }

    public final void read(serializer serializerVar) {
        synchronized (this) {
            r8lambdaCE_GWPYEoJlQPHqzu_0IXLVzJ48 r8lambdace_gwpyeojlqphqzu_0ixlvzj48 = read(serializerVar.RemoteActionCompatParcelizer);
            if (r8lambdace_gwpyeojlqphqzu_0ixlvzj48 == null) {
                return;
            }
            r8lambdace_gwpyeojlqphqzu_0ixlvzj48.serializer(serializerVar);
            if (r8lambdace_gwpyeojlqphqzu_0ixlvzj48.RemoteActionCompatParcelizer().isEmpty()) {
                this.MediaMetadataCompat.remove(r8lambdace_gwpyeojlqphqzu_0ixlvzj48);
            }
            if (this.PlaybackStateCompat == r8lambdace_gwpyeojlqphqzu_0ixlvzj48) {
                this.read.write();
                if (this.PlaybackStateCompat.RemoteActionCompatParcelizer != null) {
                    this.PlaybackStateCompat.RemoteActionCompatParcelizer.serializer();
                }
            }
        }
    }

    public final void read(long j, String str, String str2) {
        this.MediaDescriptionCompat.serializer(str);
        r8lambdaCE_GWPYEoJlQPHqzu_0IXLVzJ48 r8lambdace_gwpyeojlqphqzu_0ixlvzj48 = this.PlaybackStateCompat;
        if (r8lambdace_gwpyeojlqphqzu_0ixlvzj48 == null) {
            write(false, null);
            return;
        }
        long j2 = j * 1000;
        Long l = r8lambdace_gwpyeojlqphqzu_0ixlvzj48.RatingCompat;
        this.IconCompatParcelizer.IconCompatParcelizer("Tile %s last modified times, server: %s, existing: %s", str, com.sentiance.sdk.util.x.c(j2), l == null ? null : com.sentiance.sdk.util.x.c(l.longValue()));
        if (l == null || j2 > l.longValue()) {
            this.PlaybackStateCompat.write = j2;
            this.IconCompatParcelizer.IconCompatParcelizer("Downloading tile %s, URL: %s", str, str2);
            setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release = new setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release();
            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.RemoteActionCompatParcelizer(str2);
            r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38RemoteActionCompatParcelizer = this.serializer.RemoteActionCompatParcelizer(setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.write());
            synchronized (this) {
                r8lambdaCE_GWPYEoJlQPHqzu_0IXLVzJ48 r8lambdace_gwpyeojlqphqzu_0ixlvzj49 = this.PlaybackStateCompat;
                if (r8lambdace_gwpyeojlqphqzu_0ixlvzj49 != null) {
                    r8lambdace_gwpyeojlqphqzu_0ixlvzj49.RemoteActionCompatParcelizer = r8lambda4gsaww0uf5fhes0li0lym_jwy38RemoteActionCompatParcelizer;
                    r8lambda4gsaww0uf5fhes0li0lym_jwy38RemoteActionCompatParcelizer.serializer(this);
                } else {
                    r8lambda4gsaww0uf5fhes0li0lym_jwy38RemoteActionCompatParcelizer = null;
                }
            }
            if (r8lambda4gsaww0uf5fhes0li0lym_jwy38RemoteActionCompatParcelizer == null) {
                write(false, null);
                return;
            }
            return;
        }
        this.IconCompatParcelizer.IconCompatParcelizer("Tile %s is up to date, do not download", str);
        write(false, null);
    }

    public final void RemoteActionCompatParcelizer(String str, long j) {
        this.MediaDescriptionCompat.write(str, TimeUnit.SECONDS.toMillis(j));
        write(false, null);
    }

    public final void serializer(String str) {
        this.MediaDescriptionCompat.write(str, 30000L);
        write(false, null);
    }

    @Override // o.r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ
    public final void RemoteActionCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, IOException iOException) {
        write(false, iOException);
    }

    private void write(boolean z, IOException iOException) {
        r8lambdaCE_GWPYEoJlQPHqzu_0IXLVzJ48 r8lambdace_gwpyeojlqphqzu_0ixlvzj48;
        synchronized (this) {
            r8lambdace_gwpyeojlqphqzu_0ixlvzj48 = this.PlaybackStateCompat;
            if (r8lambdace_gwpyeojlqphqzu_0ixlvzj48 == null) {
                r8lambdace_gwpyeojlqphqzu_0ixlvzj48 = null;
            }
        }
        if (r8lambdace_gwpyeojlqphqzu_0ixlvzj48 == null) {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer("Could not download file, null request", new Object[0]);
            serializer();
            this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            return;
        }
        if (z) {
            this.write.getClass();
            this.RatingCompat.RemoteActionCompatParcelizer(System.currentTimeMillis(), r8lambdace_gwpyeojlqphqzu_0ixlvzj48.IconCompatParcelizer, r8lambdace_gwpyeojlqphqzu_0ixlvzj48.write);
        }
        parseLonglambda0 parselonglambda0 = this.IconCompatParcelizer;
        if (z) {
            parselonglambda0.IconCompatParcelizer("Tile %s downloaded successfully", r8lambdace_gwpyeojlqphqzu_0ixlvzj48.IconCompatParcelizer);
        } else if (iOException != null) {
            parselonglambda0.IconCompatParcelizer(false, iOException, "Failed to download tile %s", r8lambdace_gwpyeojlqphqzu_0ixlvzj48.IconCompatParcelizer);
        } else {
            parselonglambda0.RemoteActionCompatParcelizer("Failed to download tile %s", r8lambdace_gwpyeojlqphqzu_0ixlvzj48.IconCompatParcelizer);
        }
        synchronized (this) {
            r8lambdace_gwpyeojlqphqzu_0ixlvzj48.serializer(z, this.RemoteActionCompatParcelizer);
        }
        serializer();
        this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }
}
