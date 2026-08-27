package o;

import com.sentiance.sdk.eventtimeline.timelines.stores.entries.WrongWayDrivingDetectionState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ implements migrateTriggersReeligibilityToJsonlambda0, r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    public static final read RemoteActionCompatParcelizer = new read(null);
    private WrongWayDrivingDetectionState IconCompatParcelizer;
    private List<r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ> read;

    public static final class read {
        public read(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ RemoteActionCompatParcelizer() {
            return new r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ(WrongWayDrivingDetectionState.NOT_ATTEMPTED, instance_delegatelambda0.write);
        }
    }

    public final List<r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ> RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final WrongWayDrivingDetectionState serializer() {
        return this.IconCompatParcelizer;
    }

    private static JSONArray RemoteActionCompatParcelizer(List list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ r8lambdaw2zgeworkx0mwnt812prufswtq = (r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("startTime", r8lambdaw2zgeworkx0mwnt812prufswtq.serializer());
            jSONObject.put("endTime", r8lambdaw2zgeworkx0mwnt812prufswtq.IconCompatParcelizer());
            List<handleLogClickdefault> listMediaDescriptionCompat = r8lambdaw2zgeworkx0mwnt812prufswtq.MediaDescriptionCompat();
            JSONArray jSONArray2 = new JSONArray();
            for (handleLogClickdefault handlelogclickdefault : listMediaDescriptionCompat) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("latitude", handlelogclickdefault.RemoteActionCompatParcelizer());
                jSONObject2.put("longitude", handlelogclickdefault.serializer());
                jSONObject2.put("timestamp", handlelogclickdefault.MediaDescriptionCompat());
                jSONObject2.put("isSynthetic", handlelogclickdefault.MediaSessionCompatResultReceiverWrapper());
                jSONArray2.put(jSONObject2);
            }
            jSONObject.put("waypoints", jSONArray2);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public final boolean read() {
        return this.IconCompatParcelizer == WrongWayDrivingDetectionState.NOT_ATTEMPTED;
    }

    public /* synthetic */ r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ(WrongWayDrivingDetectionState wrongWayDrivingDetectionState, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? WrongWayDrivingDetectionState.NOT_ATTEMPTED : wrongWayDrivingDetectionState, (i & 2) != 0 ? instance_delegatelambda0.write : list);
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        WrongWayDrivingDetectionState wrongWayDrivingDetectionState;
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            WrongWayDrivingDetectionState.IconCompatParcelizer iconCompatParcelizer = WrongWayDrivingDetectionState.Companion;
            int i = jSONObject.getInt("detectionState");
            iconCompatParcelizer.getClass();
            WrongWayDrivingDetectionState[] wrongWayDrivingDetectionStateArrValues = WrongWayDrivingDetectionState.values();
            int length = wrongWayDrivingDetectionStateArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    wrongWayDrivingDetectionState = null;
                    break;
                }
                wrongWayDrivingDetectionState = wrongWayDrivingDetectionStateArrValues[i2];
                if (wrongWayDrivingDetectionState.getIntValue() == i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (wrongWayDrivingDetectionState == null) {
                wrongWayDrivingDetectionState = WrongWayDrivingDetectionState.NOT_ATTEMPTED;
            }
            this.IconCompatParcelizer = wrongWayDrivingDetectionState;
            JSONArray jSONArray = jSONObject.getJSONArray("events");
            jSONArray.getClass();
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            for (int i3 = 0; i3 < length2; i3++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                long j = jSONObject2.getLong("startTime");
                long j2 = jSONObject2.getLong("endTime");
                JSONArray jSONArray2 = jSONObject2.getJSONArray("waypoints");
                jSONArray2.getClass();
                ArrayList arrayList2 = new ArrayList();
                int length3 = jSONArray2.length();
                for (int i4 = 0; i4 < length3; i4++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i4);
                    arrayList2.add(new handleLogClickdefault(jSONObject3.getLong("timestamp"), jSONObject3.getDouble("latitude"), jSONObject3.getDouble("longitude"), null, null, null, jSONObject3.getBoolean("isSynthetic")));
                }
                arrayList.add(new r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ(j, j2, arrayList2));
            }
            this.read = arrayList;
            return;
        }
        throw new JSONException("JSON string is null");
    }

    private r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ() {
        this.IconCompatParcelizer = WrongWayDrivingDetectionState.NOT_ATTEMPTED;
        this.read = instance_delegatelambda0.write;
    }

    public /* synthetic */ r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r8lambdaVofB8WwxNgIIXeLWle1yBluC3iQ(WrongWayDrivingDetectionState wrongWayDrivingDetectionState, List<r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ> list) {
        this();
        wrongWayDrivingDetectionState.getClass();
        list.getClass();
        this.IconCompatParcelizer = wrongWayDrivingDetectionState;
        this.read = list;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("detectionState", this.IconCompatParcelizer.getIntValue());
            jSONObject.put("events", RemoteActionCompatParcelizer(this.read));
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
