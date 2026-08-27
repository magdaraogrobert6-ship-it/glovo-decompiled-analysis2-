package com.incognia.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class Vi2 {
    public final TEI BGx(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return new TEI();
        }
        try {
            try {
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                TextStreamsKt.RemoteActionCompatParcelizer(new BufferedReader(new InputStreamReader(inputStream)), new hm7(arrayList, this, linkedHashMap));
                TEI tei = new TEI(arrayList, linkedHashMap);
                inputStream.close();
                return tei;
            } finally {
                inputStream.close();
            }
        } catch (Throwable unused) {
            return new TEI();
        }
    }
}
