package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.perseus.logger.PerseusLogger;
import com.google.gson.JsonSyntaxException;
import fwfd.com.fwfsdk.constant.FWFConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getArcStartX {
    public static final PerseusLogger read = new PerseusLogger();

    public static String RemoteActionCompatParcelizer(Map map) {
        map.getClass();
        try {
            String json = updateRenderPath.serializer().toJson(map);
            json.getClass();
            return json;
        } catch (JsonSyntaxException e) {
            getAnyMovementConsumedimpl.RemoteActionCompatParcelizer(read, "Failed to serialize EventVariables to JSON", map, e);
            throw e;
        }
    }

    public static Map serializer(String str) {
        str.getClass();
        int length = str.length();
        PerseusLogger perseusLogger = read;
        if (length == 0) {
            perseusLogger.write("JSON string is null or empty", null);
        }
        try {
            Object objFromJson = updateRenderPath.serializer().fromJson(str, new PathNodeArcTo().getType());
            objFromJson.getClass();
            return (Map) objFromJson;
        } catch (JsonSyntaxException e) {
            getAnyMovementConsumedimpl.RemoteActionCompatParcelizer(perseusLogger, "Failed to parse JSON for EventVariables", str, e);
            return onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0(FWFConstants.EXPLANATION_TYPE_ERROR, "Failed to parse JSON for EventVariables"), new onViewAttachedToWindowlambda0("rawData", str), new onViewAttachedToWindowlambda0("errorDetails", af$$ExternalSyntheticOutline0.m("Error: ", e.getMessage(), " - Stack trace: ", markOnScreenCardsAsReadlambda1.RemoteActionCompatParcelizer(e))));
        }
    }
}
