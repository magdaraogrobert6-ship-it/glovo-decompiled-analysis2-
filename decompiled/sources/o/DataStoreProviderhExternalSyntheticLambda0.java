package o;

import android.content.Context;
import com.sentiance.sdk.memory.MemoryDecisionReason;
import com.sentiance.sdk.tile.store.ZippedByteStringTileStore$loadTile$result$1;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.DataStoreProviderk;
import o.DataStoreProviderq;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DataStoreProviderhExternalSyntheticLambda0<T extends DataStoreProviderk, E extends DataStoreProviderq> extends DataStoreProvideri<E> {
    private final parseLonglambda0 MediaBrowserCompatMediaItem;
    private long MediaDescriptionCompat;
    private final getVerticalAccuracy MediaSessionCompatQueueItem;
    private final r8lambda6QsLO0kJ0Pj6G2mOIbo3MA1FI<?> RatingCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RemoteActionCompatParcelizer;
    private MemoryDecisionReason read;
    private final getCooldownEnterSeconds serializer;
    private int write;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class read {
        public read(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public abstract String MediaDescriptionCompat();

    public abstract T a(String str, File file, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm);

    /* JADX INFO: Access modifiers changed from: private */
    public final void serializer(String str, setSubtitleGravity setsubtitlegravity, boolean z) {
        String str2;
        synchronized (this) {
            this.RemoteActionCompatParcelizer.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z2 = setsubtitlegravity.IconCompatParcelizer() != this.read;
            boolean z3 = jCurrentTimeMillis - this.MediaDescriptionCompat >= 30000;
            if (!z2 && !z3) {
                this.write++;
                return;
            }
            if (this.write > 0) {
                str2 = " Suppressed " + this.write + " similar messages.";
            } else {
                str2 = "";
            }
            String str3 = z ? String.format(java.util.Locale.US, "Tile load for quadKey %s resulted in OutOfMemoryError.", Arrays.copyOf(new Object[]{str}, 1)) : String.format(java.util.Locale.US, "Skipping tile load for quadKey %s due to memory constraints: %s (available=%d bytes; req=%d bytes).%s", Arrays.copyOf(new Object[]{str, setsubtitlegravity.IconCompatParcelizer().getDescription(), Long.valueOf(setsubtitlegravity.serializer()), Long.valueOf(setsubtitlegravity.read()), str2}, 5));
            this.MediaBrowserCompatMediaItem.write(str3, new Object[0]);
            getCooldownEnterSeconds getcooldownenterseconds = this.serializer;
            getVerticalAccuracy getverticalaccuracy = this.MediaSessionCompatQueueItem;
            this.RemoteActionCompatParcelizer.getClass();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            String strMediaDescriptionCompat = MediaDescriptionCompat();
            getverticalaccuracy.getClass();
            HashMap map = new HashMap();
            map.put("tile_type", strMediaDescriptionCompat);
            map.put("quad_key", str);
            getcooldownenterseconds.IconCompatParcelizer(getVerticalAccuracy.RemoteActionCompatParcelizer("tile_parsing_error", (byte) 1, map, str3, jCurrentTimeMillis2));
            this.write = 0;
            this.read = setsubtitlegravity.IconCompatParcelizer();
            this.MediaDescriptionCompat = jCurrentTimeMillis;
        }
    }

    static {
        new read(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreProviderhExternalSyntheticLambda0(String str, int i, com.sentiance.sdk.util.c cVar, Context context, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getCooldownEnterSeconds getcooldownenterseconds, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, ServerConfigDataStoreProviderCompanionExternalSyntheticLambda1 serverConfigDataStoreProviderCompanionExternalSyntheticLambda1, migrateBlocklistedListlambda1 migrateblocklistedlistlambda1, getConversationReplyPersonId getconversationreplypersonid, getVerticalAccuracy getverticalaccuracy, parseLonglambda0 parselonglambda0, r8lambda6QsLO0kJ0Pj6G2mOIbo3MA1FI<?> r8lambda6qslo0kj0pj6g2moibo3ma1fi) {
        super(str, i, cVar, parselonglambda0, context, getanalyticsenabledenterannotations, readandroid_sdk_base_releaseVar, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, serverConfigDataStoreProviderCompanionExternalSyntheticLambda1, migrateblocklistedlistlambda1, getverticalaccuracy, getconversationreplypersonid);
        str.getClass();
        cVar.getClass();
        context.getClass();
        getanalyticsenabledenterannotations.getClass();
        readandroid_sdk_base_releaseVar.getClass();
        getcooldownenterseconds.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        serverConfigDataStoreProviderCompanionExternalSyntheticLambda1.getClass();
        migrateblocklistedlistlambda1.getClass();
        getconversationreplypersonid.getClass();
        getverticalaccuracy.getClass();
        parselonglambda0.getClass();
        r8lambda6qslo0kj0pj6g2moibo3ma1fi.getClass();
        this.serializer = getcooldownenterseconds;
        this.RemoteActionCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaSessionCompatQueueItem = getverticalaccuracy;
        this.MediaBrowserCompatMediaItem = parselonglambda0;
        this.RatingCompat = r8lambda6qslo0kj0pj6g2moibo3ma1fi;
    }

    public final T serializer(String str) {
        File fileWrite = write(str);
        boolean zExists = fileWrite.exists();
        parseLonglambda0 parselonglambda0 = this.MediaBrowserCompatMediaItem;
        if (!zExists) {
            parselonglambda0.RemoteActionCompatParcelizer("Cannot parse tile, file %s does not exist.", fileWrite.getName());
            return null;
        }
        E eIconCompatParcelizer = IconCompatParcelizer(str);
        if (eIconCompatParcelizer == null) {
            parselonglambda0.RemoteActionCompatParcelizer("Cannot parse tile, quadKey: %s. Zipped tile info do not exist", str);
            return null;
        }
        setSubtitleGravity setsubtitlegravityIconCompatParcelizer = this.RatingCompat.IconCompatParcelizer(fileWrite);
        if (!setsubtitlegravityIconCompatParcelizer.RemoteActionCompatParcelizer()) {
            serializer(str, setsubtitlegravityIconCompatParcelizer, false);
            return null;
        }
        RemoteActionCompatParcelizer(str);
        T t = (T) a(eIconCompatParcelizer.RemoteActionCompatParcelizer, fileWrite, new ZippedByteStringTileStore$loadTile$result$1(this, str));
        if (t != null) {
            RatingCompat(str);
        }
        RemoteActionCompatParcelizer((String) null);
        return t;
    }
}
