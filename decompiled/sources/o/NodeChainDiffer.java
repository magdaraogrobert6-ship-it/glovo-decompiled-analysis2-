package o;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firestore.v1.ArrayValue;
import com.google.firestore.v1.Value;
import com.google.protobuf.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class NodeChainDiffer {
    public final isUpdatingui serializer;
    public final FirebaseFirestore write;

    public final HashMap write(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((String) entry.getKey(), serializer((Value) entry.getValue()));
        }
        return map2;
    }

    public NodeChainDiffer(FirebaseFirestore firebaseFirestore, isUpdatingui isupdatingui) {
        this.write = firebaseFirestore;
        this.serializer = isupdatingui;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Object serializer(Value value) {
        boolean z = false;
        z = false;
        z = false;
        switch (NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer(value)) {
            case 0:
                return null;
            case 1:
            case 9:
            case 11:
            case 12:
            case 14:
            default:
                getRectManager.write("Unknown value type: " + value.getValueTypeCase(), new Object[0]);
                throw null;
            case 2:
                return Boolean.valueOf(value.getBooleanValue());
            case 3:
            case 4:
                return value.hasIntegerValue() ? Long.valueOf(value.getIntegerValue()) : Double.valueOf(value.getDoubleValue());
            case 5:
                Timestamp timestampValue = value.getTimestampValue();
                return new com.google.firebase.Timestamp(timestampValue.getSeconds(), timestampValue.getNanos());
            case 6:
                int i = getAfter.IconCompatParcelizer[this.serializer.ordinal()];
                if (i == 1) {
                    Value valueRemoteActionCompatParcelizer = shouldHitTestChildren.RemoteActionCompatParcelizer(value);
                    if (valueRemoteActionCompatParcelizer != null) {
                        return serializer(valueRemoteActionCompatParcelizer);
                    }
                } else if (i == 2) {
                    Timestamp timestampIconCompatParcelizer = shouldHitTestChildren.IconCompatParcelizer(value);
                    return new com.google.firebase.Timestamp(timestampIconCompatParcelizer.getSeconds(), timestampIconCompatParcelizer.getNanos());
                }
                return null;
            case 7:
                return value.getStringValue();
            case 8:
                getClipMetadata bytesValue = value.getBytesValue();
                onPreAttach.serializer(bytesValue, "Provided ByteString must not be null.");
                return new hasH91voCIui(bytesValue);
            case 10:
                shareWithSiblings sharewithsiblingsIconCompatParcelizer = shareWithSiblings.IconCompatParcelizer(value.getReferenceValue());
                if (sharewithsiblingsIconCompatParcelizer.IconCompatParcelizer.size() > 3 && sharewithsiblingsIconCompatParcelizer.RemoteActionCompatParcelizer(0).equals("projects") && sharewithsiblingsIconCompatParcelizer.RemoteActionCompatParcelizer(2).equals("databases")) {
                    z = true;
                }
                getRectManager.RemoteActionCompatParcelizer(z, "Tried to parse an invalid resource name: %s", sharewithsiblingsIconCompatParcelizer);
                String strRemoteActionCompatParcelizer = sharewithsiblingsIconCompatParcelizer.RemoteActionCompatParcelizer(1);
                String strRemoteActionCompatParcelizer2 = sharewithsiblingsIconCompatParcelizer.RemoteActionCompatParcelizer(3);
                visitNodesaLcG6gQ visitnodesalcg6gq = new visitNodesaLcG6gQ(strRemoteActionCompatParcelizer, strRemoteActionCompatParcelizer2);
                visitNodes visitnodesIconCompatParcelizer = visitNodes.IconCompatParcelizer(value.getReferenceValue());
                FirebaseFirestore firebaseFirestore = this.write;
                visitNodesaLcG6gQ visitnodesalcg6gq2 = firebaseFirestore.MediaMetadataCompat;
                if (!visitnodesalcg6gq.equals(visitnodesalcg6gq2)) {
                    onEndApplyChanges.RemoteActionCompatParcelizer("DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", visitnodesIconCompatParcelizer.RemoteActionCompatParcelizer, strRemoteActionCompatParcelizer, strRemoteActionCompatParcelizer2, visitnodesalcg6gq2.write, visitnodesalcg6gq2.serializer);
                }
                return new headToTailui(visitnodesIconCompatParcelizer, firebaseFirestore);
            case 13:
                return new tailToHeadui(value.getGeoPointValue().getLatitude(), value.getGeoPointValue().getLongitude());
            case 15:
                ArrayValue arrayValue = value.getArrayValue();
                ArrayList arrayList = new ArrayList(arrayValue.getValuesCount());
                Iterator<Value> it = arrayValue.getValuesList().iterator();
                while (it.hasNext()) {
                    arrayList.add(serializer(it.next()));
                }
                return arrayList;
            case 16:
                List<Value> valuesList = value.getMapValue().getFieldsMap().get("value").getArrayValue().getValuesList();
                double[] dArr = new double[valuesList.size()];
                for (int i2 = 0; i2 < valuesList.size(); i2++) {
                    dArr[i2] = valuesList.get(i2).getDoubleValue();
                }
                return new getOffset(dArr);
            case 17:
                return write(value.getMapValue().getFieldsMap());
        }
    }
}
