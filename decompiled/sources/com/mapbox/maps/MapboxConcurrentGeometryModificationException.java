package com.mapbox.maps;

import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes5.dex */
public final class MapboxConcurrentGeometryModificationException extends ConcurrentModificationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxConcurrentGeometryModificationException(String str, String str2) {
        super(str);
        str.getClass();
        str2.getClass();
    }
}
