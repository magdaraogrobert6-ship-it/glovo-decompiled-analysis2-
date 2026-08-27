package com.uber.h3core;

import androidx.sqlite.SQLite;
import com.sentiance.core.model.thrift.TimeSeriesType;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.exception.NativeExceptionHandler;
import com.sentiance.sdk.sensorstream.SensorType;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import o.PushDataType;
import o.createNotification;
import o.instance_delegatelambda0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class H3Core$$ExternalSyntheticLambda2 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ H3Core$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    public /* synthetic */ H3Core$$ExternalSyntheticLambda2(int i, Object obj) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [o.instance_delegatelambda0] */
    /* JADX WARN: Type inference failed for: r9v30, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v45 */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        float f;
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                return Long.valueOf(Long.parseUnsignedLong((String) obj, 16));
            case 1:
                return SensorType.fromTimeSeriesType((TimeSeriesType) obj);
            case 2:
                int i2 = ConfigurationManager.RemoteActionCompatParcelizer;
                return SensorType.fromEvenTypeConstant(((Byte) ((Map.Entry) obj).getKey()).byteValue());
            case 3:
                return (Short) ((Map.Entry) obj).getValue();
            case 4:
                return ((Collection) obj).stream();
            case 5:
                int i3 = ConfigurationManager.RemoteActionCompatParcelizer;
                return SensorType.fromEvenTypeConstant(((Byte) ((Map.Entry) obj).getKey()).byteValue());
            case 6:
                return Long.valueOf(((File) obj).lastModified());
            case 7:
                return Long.valueOf(((NativeExceptionHandler.write) obj).RemoteActionCompatParcelizer());
            case 8:
                String str = (String) obj;
                int iLastIndexOf = str.lastIndexOf(" (BuildId");
                return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
            case 9:
                return ((createNotification) obj).read;
            case 10:
                createNotification createnotification = (createNotification) obj;
                createnotification.getClass();
                List list = createnotification.RemoteActionCompatParcelizer;
                ?? arrayList = instance_delegatelambda0.write;
                ?? r9 = list;
                if (list == null) {
                    r9 = arrayList;
                }
                if (r9.size() < 2) {
                    f = 0.0f;
                } else {
                    Iterator it = r9.iterator();
                    if (it.hasNext()) {
                        arrayList = new ArrayList();
                        Object next = it.next();
                        while (it.hasNext()) {
                            Object next2 = it.next();
                            Integer num = (Integer) next;
                            int iIntValue = ((Integer) next2).intValue();
                            num.getClass();
                            arrayList.add(Integer.valueOf(iIntValue - num.intValue()));
                            next = next2;
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (((Number) obj2).intValue() > 0) {
                            arrayList2.add(obj2);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        f = 0.0f;
                    } else {
                        Iterator it2 = arrayList2.iterator();
                        double dIntValue = 0.0d;
                        while (it2.hasNext()) {
                            dIntValue += (double) ((Number) it2.next()).intValue();
                            i++;
                            if (i < 0) {
                                SQLite.RemoteActionCompatParcelizer();
                                throw null;
                            }
                        }
                        double d = i == 0 ? Double.NaN : dIntValue / ((double) i);
                        if (d <= 0.0d) {
                            f = 0.0f;
                        } else {
                            f = (float) (1000.0d / d);
                        }
                    }
                }
                return Float.valueOf(f);
            case 11:
                return String.valueOf((Byte) obj);
            default:
                return new PushDataType();
        }
    }
}
