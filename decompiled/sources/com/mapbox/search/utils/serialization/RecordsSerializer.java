package com.mapbox.search.utils.serialization;

import bo.app.d$$ExternalSyntheticOutline0;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mapbox.geojson.Point;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RecordsSerializer {
    public final Object gson;

    public interface RecordsData {
        List getRecords();

        int getVersion();
    }

    public abstract RecordsData restoreRecord(String str);

    public RecordsSerializer(int i) {
        if (i != 1) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(Point.class, new PointTypeAdapter().nullSafe());
            Gson gsonCreate = gsonBuilder.create();
            gsonCreate.getClass();
            this.gson = gsonCreate;
            return;
        }
        this.gson = d$$ExternalSyntheticOutline0.m();
    }
}
