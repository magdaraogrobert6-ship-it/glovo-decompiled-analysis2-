package io.sentry.util;

import io.sentry.JsonObjectSerializer;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import o.getConfigfwf_client_release;
import o.getTrackingServicefwf_client_release;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes4.dex */
public final class ComponentActivity {
    public final Object read;
    public final Object serializer;
    public final Object write;

    public ComponentActivity(getConfigfwf_client_release getconfigfwf_client_release) {
        this.serializer = getconfigfwf_client_release;
        this.write = new ConcurrentHashMap();
        this.read = new HashMap();
    }

    public ComponentActivity(JsonObjectSerializer jsonObjectSerializer, Scope scope, getTrackingServicefwf_client_release gettrackingservicefwf_client_release) {
        jsonObjectSerializer.getClass();
        scope.getClass();
        this.serializer = jsonObjectSerializer;
        this.write = scope;
        this.read = gettrackingservicefwf_client_release;
    }

    public ComponentActivity(String str, String str2, String str3) {
        this.serializer = str;
        this.write = str2;
        this.read = str3;
    }
}
