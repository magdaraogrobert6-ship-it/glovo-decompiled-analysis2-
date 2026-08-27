package com.deliveryhero;

import app.cash.sqldelight.Transacter;
import com.deliveryhero.database.FwFDataQueries;
import o.GraphicsLayerdrawBlock1;

/* JADX INFO: loaded from: classes2.dex */
public interface FwFClientDB extends Transacter {
    public static final GraphicsLayerdrawBlock1 Companion = GraphicsLayerdrawBlock1.write;

    FwFDataQueries getFwFDataQueries();
}
