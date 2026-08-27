package com.sentiance.protobuf;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 {
    public static MapFieldLite RemoteActionCompatParcelizer(Object obj, Object obj2) {
        MapFieldLite mapFieldLiteIconCompatParcelizer = (MapFieldLite) obj;
        MapFieldLite mapFieldLite = (MapFieldLite) obj2;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteIconCompatParcelizer.write()) {
                mapFieldLiteIconCompatParcelizer = mapFieldLiteIconCompatParcelizer.IconCompatParcelizer();
            }
            mapFieldLiteIconCompatParcelizer.serializer();
            if (!mapFieldLite.isEmpty()) {
                mapFieldLiteIconCompatParcelizer.putAll(mapFieldLite);
            }
        }
        return mapFieldLiteIconCompatParcelizer;
    }
}
