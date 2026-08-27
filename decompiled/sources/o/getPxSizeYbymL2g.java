package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getPxSizeYbymL2g {
    public static fromDpSizeitqla9I serializer(Object obj, Object obj2) {
        fromDpSizeitqla9I fromdpsizeitqla9iSerializer = (fromDpSizeitqla9I) obj;
        fromDpSizeitqla9I fromdpsizeitqla9i = (fromDpSizeitqla9I) obj2;
        if (!fromdpsizeitqla9i.isEmpty()) {
            if (!fromdpsizeitqla9iSerializer.RemoteActionCompatParcelizer) {
                fromdpsizeitqla9iSerializer = fromdpsizeitqla9iSerializer.serializer();
            }
            fromdpsizeitqla9iSerializer.RemoteActionCompatParcelizer();
            if (!fromdpsizeitqla9i.isEmpty()) {
                fromdpsizeitqla9iSerializer.putAll(fromdpsizeitqla9i);
            }
        }
        return fromdpsizeitqla9iSerializer;
    }
}
