package fwfd.com.fwfsdk.util;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import fwfd.com.fwfsdk.model.dao.FWFDBDAO;
import o.clipRectmtrdDE;

/* JADX INFO: loaded from: classes5.dex */
public abstract class FWFDBRoom extends RoomDatabase {
    private static volatile FWFDBRoom INSTANCE;

    public abstract FWFDBDAO dao();

    public static FWFDBRoom getDatabase(Context context) {
        if (INSTANCE == null) {
            synchronized (FWFDBRoom.class) {
                if (INSTANCE == null) {
                    clipRectmtrdDE cliprectmtrddeRemoteActionCompatParcelizer = Room.RemoteActionCompatParcelizer(context.getApplicationContext(), FWFDBRoom.class, "FWF.db");
                    cliprectmtrddeRemoteActionCompatParcelizer.read();
                    INSTANCE = (FWFDBRoom) cliprectmtrddeRemoteActionCompatParcelizer.write();
                }
            }
        }
        return INSTANCE;
    }
}
