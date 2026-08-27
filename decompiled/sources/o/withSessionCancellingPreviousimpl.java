package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class withSessionCancellingPreviousimpl {
    public static SessionMutex serializer(getViewingDistancetKroMQ getviewingdistancetkromq) {
        SessionMutex sessionMutex = getviewingdistancetkromq.RemoteActionCompatParcelizer;
        if (sessionMutex != null) {
            return sessionMutex;
        }
        getChildren getchildren = androidx.compose.material3.tokens.FilledCardTokens.serializer;
        SessionMutex sessionMutex2 = new SessionMutex(getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren), getWindowPosturem18o9QQ.RemoteActionCompatParcelizer(getviewingdistancetkromq, getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren)), androidx.compose.ui.graphics.ColorKt.m767compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, androidx.compose.material3.tokens.FilledCardTokens.write), androidx.compose.material3.tokens.FilledCardTokens.MediaBrowserCompatMediaItem, 0.0f, 0.0f, 0.0f, 14, null), getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren)), androidx.compose.ui.graphics.Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.RemoteActionCompatParcelizer(getviewingdistancetkromq, getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren)), 0.38f, 0.0f, 0.0f, 0.0f, 14, null));
        getviewingdistancetkromq.RemoteActionCompatParcelizer = sessionMutex2;
        return sessionMutex2;
    }

    public static SessionMutexSession RemoteActionCompatParcelizer(float f, int i) {
        if ((i & 1) != 0) {
            f = androidx.compose.material3.tokens.FilledCardTokens.IconCompatParcelizer;
        }
        return new SessionMutexSession(f, androidx.compose.material3.tokens.FilledCardTokens.MediaMetadataCompat, androidx.compose.material3.tokens.FilledCardTokens.RatingCompat, androidx.compose.material3.tokens.FilledCardTokens.MediaSessionCompatQueueItem, androidx.compose.material3.tokens.FilledCardTokens.MediaDescriptionCompat, androidx.compose.material3.tokens.FilledCardTokens.read);
    }

    public static SessionMutex serializer(long j, getBirthDateFull getbirthdatefull, int i) {
        long jIconCompatParcelizer = getWindowPosturem18o9QQ.IconCompatParcelizer(j, getbirthdatefull);
        long jM758getUnspecified0d7_KjU = androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU();
        long jM721copywmQWz5c$default = androidx.compose.ui.graphics.Color.m721copywmQWz5c$default(jIconCompatParcelizer, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        SessionMutex sessionMutexSerializer = serializer((getViewingDistancetKroMQ) ((getPostalCode) getbirthdatefull).write((getNewPassword) getWindowPosturem18o9QQ.serializer));
        long j2 = j != 16 ? j : sessionMutexSerializer.read;
        if (jIconCompatParcelizer == 16) {
            jIconCompatParcelizer = sessionMutexSerializer.serializer;
        }
        long j3 = jIconCompatParcelizer;
        if (jM758getUnspecified0d7_KjU == 16) {
            jM758getUnspecified0d7_KjU = sessionMutexSerializer.RemoteActionCompatParcelizer;
        }
        long j4 = jM758getUnspecified0d7_KjU;
        if (jM721copywmQWz5c$default == 16) {
            jM721copywmQWz5c$default = sessionMutexSerializer.write;
        }
        return new SessionMutex(j2, j3, j4, jM721copywmQWz5c$default);
    }
}
