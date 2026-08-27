package com.sentiance.sdk.tile.roaddirection.store;

import android.content.Context;
import android.database.Cursor;
import com.sentiance.core.model.tile.direction.DirectionTileV1;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.util.c;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.DataStoreProvidereaaa;
import o.DataStoreProviderf;
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
import o.r8lambdaEOFsOgwC2Lreu4qjeRYYWDUYqVo;
import o.r8lambdaG1LFBqyRo3zscbZCMaqLy52Kh14;
import o.r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.readandroid_sdk_base_release;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(cacheName = "ZippedRoadDirectionTileStore", componentName = "ZippedRoadDirectionTileStore")
public final class ZippedRoadDirectionTileStore extends DataStoreProviderhExternalSyntheticLambda0<r8lambdaG1LFBqyRo3zscbZCMaqLy52Kh14, DataStoreProviderf> {
    private final String MediaBrowserCompatMediaItem;
    private final String MediaDescriptionCompat;
    private final int MediaMetadataCompat;
    private final String MediaSessionCompatQueueItem;
    private final long RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;
    private final DataStoreProvidereaaa serializer;
    private final r8lambdaEOFsOgwC2Lreu4qjeRYYWDUYqVo write;

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
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.DataStoreProvideri
    public final DataStoreProviderp MediaMetadataCompat() {
        return this.serializer;
    }

    @Override // o.DataStoreProvideri
    public final String RatingCompat() {
        return this.MediaDescriptionCompat;
    }

    @Override // o.DataStoreProvideri
    public final int RemoteActionCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    @Override // o.DataStoreProvideri
    public final String read() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // o.DataStoreProvideri
    public final long write() {
        return this.RatingCompat;
    }

    @Override // o.DataStoreProviderhExternalSyntheticLambda0
    public final DataStoreProviderk a(String str, File file, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        DirectionTileV1 directionTileV1RemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(file, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        if (directionTileV1RemoteActionCompatParcelizer != null) {
            return new r8lambdaG1LFBqyRo3zscbZCMaqLy52Kh14(str, directionTileV1RemoteActionCompatParcelizer, new ZippedRoadDirectionTileStore$parseTile$1$1(1, 0, ZippedRoadDirectionTileStore.class, this, "updateTileAccessTime", "updateTileAccessTime(Ljava/lang/String;)V"));
        }
        return null;
    }

    static {
        new read(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZippedRoadDirectionTileStore(c cVar, Context context, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getCooldownEnterSeconds getcooldownenterseconds, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, ServerConfigDataStoreProviderCompanionExternalSyntheticLambda1 serverConfigDataStoreProviderCompanionExternalSyntheticLambda1, migrateBlocklistedListlambda1 migrateblocklistedlistlambda1, getConversationReplyPersonId getconversationreplypersonid, getVerticalAccuracy getverticalaccuracy, parseLonglambda0 parselonglambda0, r8lambdaEOFsOgwC2Lreu4qjeRYYWDUYqVo r8lambdaeofsogwc2lreu4qjeryywduyqvo) {
        super("sentiance-zipped-road-direction-tiles", 1, cVar, context, getanalyticsenabledenterannotations, readandroid_sdk_base_releaseVar, getcooldownenterseconds, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, serverConfigDataStoreProviderCompanionExternalSyntheticLambda1, migrateblocklistedlistlambda1, getconversationreplypersonid, getverticalaccuracy, parselonglambda0, r8lambdaeofsogwc2lreu4qjeryywduyqvo);
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
        r8lambdaeofsogwc2lreu4qjeryywduyqvo.getClass();
        this.read = parselonglambda0;
        this.write = r8lambdaeofsogwc2lreu4qjeryywduyqvo;
        this.RemoteActionCompatParcelizer = "RoadDirection";
        this.serializer = DataStoreProvidereaaa.read;
        this.MediaSessionCompatQueueItem = "ZippedRoadDirectionTileStore";
        this.MediaDescriptionCompat = "com.sentiance.sdk/ondevice/tiles/roaddirection/";
        this.MediaBrowserCompatMediaItem = "com.sentiance.sdk/ondevice/downloading_tiles/roaddirection/";
        this.MediaMetadataCompat = 1;
        this.RatingCompat = 10485760L;
    }

    @Override // o.DataStoreProvideri
    public final DataStoreProviderq write(String str, long j, long j2, long j3) {
        str.getClass();
        return new DataStoreProviderf(str, j, j2, j3);
    }

    @Override // o.DataStoreProvideri
    public final DataStoreProviderq write(Cursor cursor) {
        try {
            DataStoreProviderf.serializer.getClass();
            return DataStoreProviderf.read.write(cursor);
        } catch (Exception e) {
            this.read.IconCompatParcelizer(false, e, "Failed to create ZippedRoadDirectionTileInfoEntry from cursor", new Object[0]);
            return null;
        }
    }
}
