package com.roadrunner.rider.state.provider.database;

import androidx.room.RoomDatabase;
import com.roadrunner.rider.state.provider.database.dao.ShiftInfoDao;
import com.roadrunner.rider.state.provider.database.dao.WorkOpportunityDao;
import o.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class StatusDatabase extends RoomDatabase {
    public abstract WorkOpportunityDao read();

    public abstract Logger serializer();

    public abstract ShiftInfoDao write();
}
