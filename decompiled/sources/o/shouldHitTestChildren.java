package o;

import com.google.firestore.v1.Value;
import com.google.protobuf.Timestamp;

/* JADX INFO: loaded from: classes2.dex */
public abstract class shouldHitTestChildren {
    public static boolean read(Value value) {
        Value fieldsOrDefault = value != null ? value.getMapValue().getFieldsOrDefault("__type__", null) : null;
        return fieldsOrDefault != null && "server_timestamp".equals(fieldsOrDefault.getStringValue());
    }

    public static Timestamp IconCompatParcelizer(Value value) {
        return value.getMapValue().getFieldsOrThrow("__local_write_time__").getTimestampValue();
    }

    public static Value RemoteActionCompatParcelizer(Value value) {
        Value fieldsOrDefault = value.getMapValue().getFieldsOrDefault("__previous_value__", null);
        return read(fieldsOrDefault) ? RemoteActionCompatParcelizer(fieldsOrDefault) : fieldsOrDefault;
    }
}
