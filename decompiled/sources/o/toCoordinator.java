package o;

import com.google.firestore.v1.ArrayValue;
import com.google.firestore.v1.MapValue;
import com.google.firestore.v1.Value;
import com.google.protobuf.Timestamp;
import com.google.type.LatLng;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class toCoordinator {
    public static void write(Value value, transformFromAncestorEL8BTi8 transformfromancestorel8bti8) {
        switch (updateLayerBlockdefault.read[value.getValueTypeCase().ordinal()]) {
            case 1:
                transformfromancestorel8bti8.write(5L);
                break;
            case 2:
                transformfromancestorel8bti8.write(10L);
                transformfromancestorel8bti8.write(value.getBooleanValue() ? 1L : 0L);
                break;
            case 3:
                double doubleValue = value.getDoubleValue();
                if (Double.isNaN(doubleValue)) {
                    transformfromancestorel8bti8.write(13L);
                } else {
                    transformfromancestorel8bti8.write(15L);
                    if (doubleValue == 0.0d) {
                        transformfromancestorel8bti8.RemoteActionCompatParcelizer(0.0d);
                    } else {
                        transformfromancestorel8bti8.RemoteActionCompatParcelizer(doubleValue);
                    }
                }
                break;
            case 4:
                transformfromancestorel8bti8.write(15L);
                transformfromancestorel8bti8.RemoteActionCompatParcelizer(value.getIntegerValue());
                break;
            case 5:
                Timestamp timestampValue = value.getTimestampValue();
                transformfromancestorel8bti8.write(20L);
                transformfromancestorel8bti8.write(timestampValue.getSeconds());
                transformfromancestorel8bti8.write(timestampValue.getNanos());
                break;
            case 6:
                String stringValue = value.getStringValue();
                transformfromancestorel8bti8.write(25L);
                transformfromancestorel8bti8.write(stringValue);
                transformfromancestorel8bti8.write(2L);
                break;
            case 7:
                transformfromancestorel8bti8.write(30L);
                getClipMetadata bytesValue = value.getBytesValue();
                if (transformfromancestorel8bti8.IconCompatParcelizer != 0) {
                    updateLayerParametersdefault updatelayerparametersdefault = transformfromancestorel8bti8.read.write;
                    for (int i = 0; i < bytesValue.RatingCompat(); i++) {
                        updatelayerparametersdefault.read(bytesValue.RemoteActionCompatParcelizer(i));
                    }
                    updatelayerparametersdefault.serializer((byte) 0);
                    updatelayerparametersdefault.serializer((byte) 1);
                } else {
                    updateLayerParametersdefault updatelayerparametersdefault2 = transformfromancestorel8bti8.read.write;
                    for (int i2 = 0; i2 < bytesValue.RatingCompat(); i2++) {
                        updatelayerparametersdefault2.write(bytesValue.RemoteActionCompatParcelizer(i2));
                    }
                    updatelayerparametersdefault2.IconCompatParcelizer((byte) 0);
                    updatelayerparametersdefault2.IconCompatParcelizer((byte) 1);
                }
                transformfromancestorel8bti8.write(2L);
                break;
            case 8:
                String referenceValue = value.getReferenceValue();
                transformfromancestorel8bti8.write(37L);
                shareWithSiblings sharewithsiblingsIconCompatParcelizer = shareWithSiblings.IconCompatParcelizer(referenceValue);
                int size = sharewithsiblingsIconCompatParcelizer.IconCompatParcelizer.size();
                for (int i3 = 5; i3 < size; i3++) {
                    String strRemoteActionCompatParcelizer = sharewithsiblingsIconCompatParcelizer.RemoteActionCompatParcelizer(i3);
                    transformfromancestorel8bti8.write(60L);
                    transformfromancestorel8bti8.write(strRemoteActionCompatParcelizer);
                }
                break;
            case 9:
                LatLng geoPointValue = value.getGeoPointValue();
                transformfromancestorel8bti8.write(45L);
                transformfromancestorel8bti8.RemoteActionCompatParcelizer(geoPointValue.getLatitude());
                transformfromancestorel8bti8.RemoteActionCompatParcelizer(geoPointValue.getLongitude());
                break;
            case 10:
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{NodeCoordinatorCompaniononCommitAffectingLayer1.serializer, value.getMapValue().getFieldsMap().get("__type__")}, getCieXyz.write())).booleanValue()) {
                    transformfromancestorel8bti8.write(2147483647L);
                } else if (NodeCoordinatorCompaniononCommitAffectingLayer1.write(value)) {
                    Map<String, Value> fieldsMap = value.getMapValue().getFieldsMap();
                    transformfromancestorel8bti8.write(53L);
                    int valuesCount = fieldsMap.get("value").getArrayValue().getValuesCount();
                    transformfromancestorel8bti8.write(15L);
                    transformfromancestorel8bti8.write(valuesCount);
                    transformfromancestorel8bti8.write(25L);
                    transformfromancestorel8bti8.write("value");
                    write(fieldsMap.get("value"), transformfromancestorel8bti8);
                } else {
                    MapValue mapValue = value.getMapValue();
                    transformfromancestorel8bti8.write(55L);
                    for (Map.Entry<String, Value> entry : mapValue.getFieldsMap().entrySet()) {
                        String key = entry.getKey();
                        Value value2 = entry.getValue();
                        transformfromancestorel8bti8.write(25L);
                        transformfromancestorel8bti8.write(key);
                        write(value2, transformfromancestorel8bti8);
                    }
                    transformfromancestorel8bti8.write(2L);
                }
                break;
            case 11:
                ArrayValue arrayValue = value.getArrayValue();
                transformfromancestorel8bti8.write(50L);
                Iterator<Value> it = arrayValue.getValuesList().iterator();
                while (it.hasNext()) {
                    write(it.next(), transformfromancestorel8bti8);
                }
                transformfromancestorel8bti8.write(2L);
                break;
            default:
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(value.getValueTypeCase(), "unknown index value type ");
                break;
        }
    }
}
