package com.sentiance.sdk.tile.gis.store;

import android.content.Context;
import android.database.Cursor;
import com.sentiance.core.model.tile.gis.GisTileV1;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.util.c;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.DataStoreProviderb;
import o.DataStoreProviderhExternalSyntheticLambda0;
import o.DataStoreProviderk;
import o.DataStoreProviderp;
import o.DataStoreProviderq;
import o.ServerConfigDataStoreProviderCompanionExternalSyntheticLambda1;
import o.getAnalyticsEnabledEnterannotations;
import o.getConversationReplyPersonId;
import o.getCooldownEnterSeconds;
import o.getVerticalAccuracy;
import o.migrateBlocklistedListlambda1;
import o.parseLonglambda0;
import o.r8lambdaDXXsJV9_crFzZ2GMgkyKr1LEJTU;
import o.r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.readandroid_sdk_base_release;
import o.setEventPublisherandroid_sdk_base_release;
import o.shutdownAllDataStores;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(cacheName = "ZippedGisTileStore", componentName = "ZippedGisTileStore")
public final class ZippedGisTileStore extends DataStoreProviderhExternalSyntheticLambda0<setEventPublisherandroid_sdk_base_release, shutdownAllDataStores> {
    private final int MediaBrowserCompatMediaItem;
    private final String MediaDescriptionCompat;
    private final long MediaMetadataCompat;
    private final String MediaSessionCompatQueueItem;
    private final String RatingCompat;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final r8lambdaDXXsJV9_crFzZ2GMgkyKr1LEJTU read;
    private final DataStoreProviderb serializer;
    private final String write;

    public static final class read {
        public read(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // o.DataStoreProvideri
    public final String IconCompatParcelizer() {
        return this.MediaSessionCompatQueueItem;
    }

    @Override // o.DataStoreProviderhExternalSyntheticLambda0
    public final String MediaDescriptionCompat() {
        return this.write;
    }

    @Override // o.DataStoreProvideri
    public final DataStoreProviderp MediaMetadataCompat() {
        return this.read;
    }

    @Override // o.DataStoreProvideri
    public final String RatingCompat() {
        return this.RatingCompat;
    }

    @Override // o.DataStoreProvideri
    public final int RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // o.DataStoreProvideri
    public final String read() {
        return this.MediaDescriptionCompat;
    }

    @Override // o.DataStoreProvideri
    public final long write() {
        return this.MediaMetadataCompat;
    }

    @Override // o.DataStoreProviderhExternalSyntheticLambda0
    public final DataStoreProviderk a(String str, File file, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        GisTileV1 gisTileV1RemoteActionCompatParcelizer = this.serializer.RemoteActionCompatParcelizer(file, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        if (gisTileV1RemoteActionCompatParcelizer != null) {
            return new setEventPublisherandroid_sdk_base_release(str, gisTileV1RemoteActionCompatParcelizer, new ZippedGisTileStore$parseTile$1$1(1, 0, ZippedGisTileStore.class, this, "updateTileAccessTime", "updateTileAccessTime(Ljava/lang/String;)V"));
        }
        return null;
    }

    static {
        new read(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZippedGisTileStore(c cVar, Context context, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getCooldownEnterSeconds getcooldownenterseconds, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, ServerConfigDataStoreProviderCompanionExternalSyntheticLambda1 serverConfigDataStoreProviderCompanionExternalSyntheticLambda1, migrateBlocklistedListlambda1 migrateblocklistedlistlambda1, getConversationReplyPersonId getconversationreplypersonid, getVerticalAccuracy getverticalaccuracy, parseLonglambda0 parselonglambda0, DataStoreProviderb dataStoreProviderb) {
        super("sentiance-zipped-gis-tiles", 1, cVar, context, getanalyticsenabledenterannotations, readandroid_sdk_base_releaseVar, getcooldownenterseconds, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, serverConfigDataStoreProviderCompanionExternalSyntheticLambda1, migrateblocklistedlistlambda1, getconversationreplypersonid, getverticalaccuracy, parselonglambda0, dataStoreProviderb);
        cVar.getClass();
        context.getClass();
        getanalyticsenabledenterannotations.getClass();
        getcooldownenterseconds.getClass();
        readandroid_sdk_base_releaseVar.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        serverConfigDataStoreProviderCompanionExternalSyntheticLambda1.getClass();
        migrateblocklistedlistlambda1.getClass();
        getconversationreplypersonid.getClass();
        getverticalaccuracy.getClass();
        parselonglambda0.getClass();
        dataStoreProviderb.getClass();
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.serializer = dataStoreProviderb;
        this.write = "GIS";
        this.read = r8lambdaDXXsJV9_crFzZ2GMgkyKr1LEJTU.serializer;
        this.MediaSessionCompatQueueItem = "ZippedGisTileStore";
        this.RatingCompat = "com.sentiance.sdk/ondevice/tiles/gis/";
        this.MediaDescriptionCompat = "com.sentiance.sdk/ondevice/downloading_tiles/gis/";
        this.MediaBrowserCompatMediaItem = 1;
        this.MediaMetadataCompat = 42991616L;
    }

    @Override // o.DataStoreProvideri
    public final DataStoreProviderq write(String str, long j, long j2, long j3) {
        str.getClass();
        return new shutdownAllDataStores(str, j, j2, j3);
    }

    @Override // o.DataStoreProvideri
    public final DataStoreProviderq write(Cursor cursor) {
        try {
            shutdownAllDataStores.IconCompatParcelizer.getClass();
            return shutdownAllDataStores.write.IconCompatParcelizer(cursor);
        } catch (Exception e) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to create ZippedGisTileInfoEntry from cursor", new Object[0]);
            return null;
        }
    }
}
