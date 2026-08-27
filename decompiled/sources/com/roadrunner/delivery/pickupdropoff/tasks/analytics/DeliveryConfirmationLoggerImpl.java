package com.roadrunner.delivery.pickupdropoff.tasks.analytics;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.TrackingEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.SimpleItemTouchHelperCallback;
import o.decode;
import o.getPositionannotations;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryConfirmationLoggerImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final decode write;

    public DeliveryConfirmationLoggerImpl(decode decodeVar) {
        decodeVar.getClass();
        this.write = decodeVar;
    }

    public static Map write(getPositionannotations getpositionannotations, String str) {
        Map mapRemoteActionCompatParcelizer;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 121;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (getpositionannotations != null) {
            mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("currentDeliveryId", getpositionannotations.currentDeliveryId), new onViewAttachedToWindowlambda0("deliveryState", getpositionannotations.deliveryState), new onViewAttachedToWindowlambda0("deliveryTasks", str), new onViewAttachedToWindowlambda0("isTaskMandatory", String.valueOf((Boolean) onContentCardDismissed.read(getpositionannotations.taskIds.indexOf(str), getpositionannotations.tasksRequired))));
            int i4 = IconCompatParcelizer + 65;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            mapRemoteActionCompatParcelizer = null;
        }
        if (mapRemoteActionCompatParcelizer == null) {
            mapRemoteActionCompatParcelizer = SimpleItemTouchHelperCallback.serializer;
        }
        int i6 = RemoteActionCompatParcelizer + 81;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return mapRemoteActionCompatParcelizer;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003f A[PHI: r1 r2
  0x003f: PHI (r1v10 com.roadrunner.delivery.state.TrackingEvent) = (r1v9 com.roadrunner.delivery.state.TrackingEvent), (r1v15 com.roadrunner.delivery.state.TrackingEvent) binds: [B:11:0x003d, B:8:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x003f: PHI (r2v3 java.util.Map) = (r2v2 java.util.Map), (r2v14 java.util.Map) binds: [B:11:0x003d, B:8:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0056 A[LOOP:1: B:13:0x0050->B:15:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:17:0x0078 A[PHI: r1
  0x0078: PHI (r1v13 com.roadrunner.delivery.state.TrackingEvent) = (r1v9 com.roadrunner.delivery.state.TrackingEvent), (r1v15 com.roadrunner.delivery.state.TrackingEvent) binds: [B:11:0x003d, B:8:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0083  */
    public final void read(List list) {
        TrackingEvent trackingEvent;
        Map map;
        ArrayList arrayList;
        Map mapSerializer;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 65;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i5 = IconCompatParcelizer + 107;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                trackingEvent = (TrackingEvent) it.next();
                map = trackingEvent.parameters;
                int i6 = 87 / 0;
                if (map != null) {
                    arrayList = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList.add(new onViewAttachedToWindowlambda0((String) entry.getKey(), entry.getValue().toString()));
                    }
                    mapSerializer = onMove.serializer(arrayList);
                } else {
                    i = RemoteActionCompatParcelizer + 103;
                    IconCompatParcelizer = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        int i7 = 5 / 3;
                    }
                    mapSerializer = null;
                }
            } else {
                trackingEvent = (TrackingEvent) it.next();
                map = trackingEvent.parameters;
                if (map != null) {
                    arrayList = new ArrayList(map.size());
                    while (r2.hasNext()) {
                        arrayList.add(new onViewAttachedToWindowlambda0((String) entry.getKey(), entry.getValue().toString()));
                    }
                    mapSerializer = onMove.serializer(arrayList);
                } else {
                    i = RemoteActionCompatParcelizer + 103;
                    IconCompatParcelizer = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        int i8 = 5 / 3;
                    }
                    mapSerializer = null;
                }
            }
            this.write.logEvent(trackingEvent.name, mapSerializer);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    public final void read(getPositionannotations getpositionannotations, String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        String str2 = null;
        if (i2 % 2 == 0) {
            str.getClass();
            throw null;
        }
        str.getClass();
        String str3 = getpositionannotations != null ? getpositionannotations.deliveryState : null;
        if (str3 == null) {
            Timber.RemoteActionCompatParcelizer.write(new Error(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid status for logging ", str3)));
        } else {
            int iHashCode = str3.hashCode();
            if (iHashCode != -988476804) {
                int i3 = RemoteActionCompatParcelizer;
                int i4 = i3 + 27;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                if (iHashCode != -934396624) {
                    if (iHashCode != 1925735456) {
                        int i6 = i3 + 91;
                        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                    } else if (str3.equals("dropoff")) {
                        int i8 = RemoteActionCompatParcelizer + 27;
                        IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        str2 = "deliveries_dropoff_ready";
                    } else {
                        int i10 = IconCompatParcelizer + 29;
                        RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                    }
                    Timber.RemoteActionCompatParcelizer.write(new Error(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid status for logging ", str3)));
                } else if (str3.equals("return")) {
                    str2 = "deliveries_return_ready";
                } else {
                    Timber.RemoteActionCompatParcelizer.write(new Error(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid status for logging ", str3)));
                }
            } else if (str3.equals("pickup")) {
                str2 = "deliveries_pickup_ready";
            } else {
                Timber.RemoteActionCompatParcelizer.write(new Error(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid status for logging ", str3)));
            }
        }
        if (str2 == null) {
            str2 = "";
        }
        this.write.logEvent(str2, write(getpositionannotations, str));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    public final void serializer(getPositionannotations getpositionannotations, String str) {
        String str2;
        int i = 2 % 2;
        str.getClass();
        Object obj = null;
        String str3 = getpositionannotations != null ? getpositionannotations.deliveryState : null;
        if (str3 == null) {
            Timber.RemoteActionCompatParcelizer.write(new Error(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid status for logging ", str3)));
            str2 = null;
        } else {
            int iHashCode = str3.hashCode();
            if (iHashCode != -988476804) {
                int i2 = IconCompatParcelizer + 39;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (iHashCode != -934396624) {
                    if (iHashCode == 1925735456 && str3.equals("dropoff")) {
                        str2 = "deliveries_dropoff_actions";
                    } else {
                        Timber.RemoteActionCompatParcelizer.write(new Error(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid status for logging ", str3)));
                        str2 = null;
                    }
                } else if (str3.equals("return")) {
                    str2 = "deliveries_return_actions";
                } else {
                    Timber.RemoteActionCompatParcelizer.write(new Error(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid status for logging ", str3)));
                    str2 = null;
                }
            } else if (str3.equals("pickup")) {
                int i3 = IconCompatParcelizer + 55;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                str2 = "deliveries_pickup_actions";
            } else {
                Timber.RemoteActionCompatParcelizer.write(new Error(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid status for logging ", str3)));
                str2 = null;
            }
        }
        if (str2 == null) {
            int i5 = IconCompatParcelizer + 85;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                throw null;
            }
            str2 = "";
        }
        this.write.logEvent(str2, write(getpositionannotations, str));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public final void write(getPositionannotations getpositionannotations) {
        String str;
        String str2;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 109;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 31 / 0;
            if (getpositionannotations != null) {
                str = getpositionannotations.deliveryState;
            } else {
                str = null;
            }
        } else if (getpositionannotations != null) {
            str = getpositionannotations.deliveryState;
        } else {
            str = null;
        }
        if (str == null) {
            Timber.RemoteActionCompatParcelizer.write(new Error(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid status for logging ", str)));
            str2 = null;
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != -988476804) {
                int i4 = RemoteActionCompatParcelizer + 31;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    throw null;
                }
                if (iHashCode != -934396624) {
                    if (iHashCode == 1925735456 && str.equals("dropoff")) {
                        str2 = "deliveries_dropoff_dialog_confirm";
                    } else {
                        Timber.RemoteActionCompatParcelizer.write(new Error(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid status for logging ", str)));
                        str2 = null;
                    }
                } else if (str.equals("return")) {
                    str2 = "deliveries_return_dialog_confirm";
                } else {
                    int i5 = IconCompatParcelizer + 43;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    Timber.RemoteActionCompatParcelizer.write(new Error(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid status for logging ", str)));
                    str2 = null;
                }
            } else if (str.equals("pickup")) {
                str2 = "deliveries_pickup_dialog_confirm";
            } else {
                Timber.RemoteActionCompatParcelizer.write(new Error(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid status for logging ", str)));
                str2 = null;
            }
        }
        if (str2 == null) {
            str2 = "";
        }
        Map mapSingletonMap = Collections.singletonMap("currentDeliveryId", String.valueOf(getpositionannotations != null ? getpositionannotations.currentDeliveryId : null));
        mapSingletonMap.getClass();
        this.write.logEvent(str2, mapSingletonMap);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    public final void serializer(getPositionannotations getpositionannotations, String str, boolean z) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 95;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        String str2 = null;
        Map mapRemoteActionCompatParcelizer = getpositionannotations != null ? onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("currentDeliveryId", getpositionannotations.currentDeliveryId), new onViewAttachedToWindowlambda0("deliveryState", getpositionannotations.deliveryState), new onViewAttachedToWindowlambda0("deliveryTasks", str), new onViewAttachedToWindowlambda0("isTaskMandatory", String.valueOf(z))) : null;
        if (mapRemoteActionCompatParcelizer == null) {
            mapRemoteActionCompatParcelizer = SimpleItemTouchHelperCallback.serializer;
        }
        String str3 = getpositionannotations != null ? getpositionannotations.deliveryState : null;
        if (str3 == null) {
            Timber.RemoteActionCompatParcelizer.write(new Error(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid status for logging ", str3)));
        } else {
            int iHashCode = str3.hashCode();
            if (iHashCode != -988476804) {
                int i4 = IconCompatParcelizer + 27;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                if (iHashCode != -934396624) {
                    if (iHashCode == 1925735456 && str3.equals("dropoff")) {
                        str2 = "deliveries_dropoff_task_success";
                    } else {
                        Timber.RemoteActionCompatParcelizer.write(new Error(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid status for logging ", str3)));
                    }
                } else if (str3.equals("return")) {
                    str2 = "deliveries_return_task_success";
                } else {
                    Timber.RemoteActionCompatParcelizer.write(new Error(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid status for logging ", str3)));
                }
            } else if (str3.equals("pickup")) {
                str2 = "deliveries_pickup_task_success";
            } else {
                Timber.RemoteActionCompatParcelizer.write(new Error(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid status for logging ", str3)));
            }
        }
        if (str2 == null) {
            int i6 = RemoteActionCompatParcelizer + 91;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            str2 = "";
        }
        this.write.logEvent(str2, mapRemoteActionCompatParcelizer);
    }
}
