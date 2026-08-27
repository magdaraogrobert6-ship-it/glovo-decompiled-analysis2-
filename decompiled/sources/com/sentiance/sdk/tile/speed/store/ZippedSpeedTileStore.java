package com.sentiance.sdk.tile.speed.store;

import android.content.Context;
import android.database.Cursor;
import com.sentiance.core.model.tile.speed.SpeedTileV1;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.util.c;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.DataStoreProviderh;
import o.DataStoreProviderhExternalSyntheticLambda0;
import o.DataStoreProviderj;
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
import o.r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdatxCN7zCQDZHGAvA5P7NU5F1IpG0;
import o.r8lambdaxwTLUghkFTGYkRle075LMUyLzI;
import o.readandroid_sdk_base_release;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(cacheName = "ZippedSpeedTileStore", componentName = "ZippedSpeedTileStore")
public final class ZippedSpeedTileStore extends DataStoreProviderhExternalSyntheticLambda0<DataStoreProviderh, DataStoreProviderj> {
    private final int MediaBrowserCompatMediaItem;
    private final String MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final long MediaSessionCompatQueueItem;
    private final String RatingCompat;
    private final r8lambdatxCN7zCQDZHGAvA5P7NU5F1IpG0 RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;
    private final String serializer;
    private final r8lambdaxwTLUghkFTGYkRle075LMUyLzI write;

    public static final class write {
        public write(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // o.DataStoreProvideri
    public final String IconCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    @Override // o.DataStoreProviderhExternalSyntheticLambda0
    public final String MediaDescriptionCompat() {
        return this.serializer;
    }

    @Override // o.DataStoreProvideri
    public final DataStoreProviderp MediaMetadataCompat() {
        return this.write;
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
        return this.MediaSessionCompatQueueItem;
    }

    @Override // o.DataStoreProviderhExternalSyntheticLambda0
    public final DataStoreProviderk a(String str, File file, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        SpeedTileV1 speedTileV1RemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(file, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        if (speedTileV1RemoteActionCompatParcelizer != null) {
            return new DataStoreProviderh(str, speedTileV1RemoteActionCompatParcelizer, new ZippedSpeedTileStore$parseTile$1$1(1, 0, ZippedSpeedTileStore.class, this, "updateTileAccessTime", "updateTileAccessTime(Ljava/lang/String;)V"));
        }
        return null;
    }

    static {
        new write(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZippedSpeedTileStore(c cVar, Context context, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getCooldownEnterSeconds getcooldownenterseconds, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, ServerConfigDataStoreProviderCompanionExternalSyntheticLambda1 serverConfigDataStoreProviderCompanionExternalSyntheticLambda1, migrateBlocklistedListlambda1 migrateblocklistedlistlambda1, getConversationReplyPersonId getconversationreplypersonid, getVerticalAccuracy getverticalaccuracy, parseLonglambda0 parselonglambda0, r8lambdatxCN7zCQDZHGAvA5P7NU5F1IpG0 r8lambdatxcn7zcqdzhgava5p7nu5f1ipg0) {
        super("sentiance-zipped-speed-tiles", 1, cVar, context, getanalyticsenabledenterannotations, readandroid_sdk_base_releaseVar, getcooldownenterseconds, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, serverConfigDataStoreProviderCompanionExternalSyntheticLambda1, migrateblocklistedlistlambda1, getconversationreplypersonid, getverticalaccuracy, parselonglambda0, r8lambdatxcn7zcqdzhgava5p7nu5f1ipg0);
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
        r8lambdatxcn7zcqdzhgava5p7nu5f1ipg0.getClass();
        this.read = parselonglambda0;
        this.RemoteActionCompatParcelizer = r8lambdatxcn7zcqdzhgava5p7nu5f1ipg0;
        this.serializer = "SpeedLimit";
        this.write = r8lambdaxwTLUghkFTGYkRle075LMUyLzI.read;
        this.MediaMetadataCompat = "ZippedSpeedTileStore";
        this.RatingCompat = "com.sentiance.sdk/ondevice/tiles/speed/";
        this.MediaDescriptionCompat = "com.sentiance.sdk/ondevice/downloading_tiles/speed/";
        this.MediaBrowserCompatMediaItem = 1;
        this.MediaSessionCompatQueueItem = 42991616L;
    }

    @Override // o.DataStoreProvideri
    public final DataStoreProviderq write(String str, long j, long j2, long j3) {
        str.getClass();
        return new DataStoreProviderj(str, j, j2, j3);
    }

    @Override // o.DataStoreProvideri
    public final DataStoreProviderq write(Cursor cursor) {
        try {
            DataStoreProviderj.IconCompatParcelizer.getClass();
            return DataStoreProviderj.RemoteActionCompatParcelizer.IconCompatParcelizer(cursor);
        } catch (Exception e) {
            this.read.IconCompatParcelizer(false, e, "Failed to create ZippedSpeedTileInfoEntry from cursor", new Object[0]);
            return null;
        }
    }
}
