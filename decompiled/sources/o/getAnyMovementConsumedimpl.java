package o;

import com.deliveryhero.perseus.logger.PerseusLogger;
import com.google.gson.JsonSyntaxException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getAnyMovementConsumedimpl {
    public static final void RemoteActionCompatParcelizer(PerseusLogger perseusLogger, String str, Object obj, JsonSyntaxException jsonSyntaxException) {
        perseusLogger.RemoteActionCompatParcelizer(str + ": " + jsonSyntaxException.getMessage() + ". Data: " + obj, null);
    }
}
