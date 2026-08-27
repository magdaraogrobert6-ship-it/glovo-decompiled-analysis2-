package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.firestore.v1.ArrayValue;
import com.google.firestore.v1.MapValue;
import com.google.firestore.v1.Value;
import com.google.protobuf.Timestamp;
import com.google.type.LatLng;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class NodeCoordinatorCompaniononCommitAffectingLayer1 {
    public static final Value IconCompatParcelizer;
    public static final Value MediaBrowserCompatMediaItem;
    public static final Value MediaDescriptionCompat;
    public static final Value MediaMetadataCompat;
    public static final Value MediaSessionCompatQueueItem;
    public static final Value MediaSessionCompatResultReceiverWrapper;
    public static final Value MediaSessionCompatToken;
    public static final Value ParcelableVolumeInfo;
    public static final Value PlaybackStateCompat;
    public static final Value PlaybackStateCompatCustomAction;
    public static final Value RatingCompat;
    public static final NodeCoordinatorCompaniononCommitAffectingLayer1 RemoteActionCompatParcelizer = new NodeCoordinatorCompaniononCommitAffectingLayer1();
    public static final Value ResultReceiver;
    public static final Value r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public static final Value r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public static final Value r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public static final Value read;
    public static final Value serializer;
    public static final Value write;

    static {
        accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
        accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer(Double.NaN);
        ResultReceiver = (Value) accesscontainsdescendantNewBuilder.serializer();
        accesscontainsDescendant accesscontainsdescendantNewBuilder2 = Value.newBuilder();
        component21 component21Var = component21.NULL_VALUE;
        accesscontainsdescendantNewBuilder2.RemoteActionCompatParcelizer();
        ((Value) accesscontainsdescendantNewBuilder2.RemoteActionCompatParcelizer).setNullValue(component21Var);
        Value value = (Value) accesscontainsdescendantNewBuilder2.serializer();
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = value;
        ParcelableVolumeInfo = value;
        accesscontainsDescendant accesscontainsdescendantNewBuilder3 = Value.newBuilder();
        accesscontainsdescendantNewBuilder3.read("__max__");
        Value value2 = (Value) accesscontainsdescendantNewBuilder3.serializer();
        serializer = value2;
        accesscontainsDescendant accesscontainsdescendantNewBuilder4 = Value.newBuilder();
        getAction getactionNewBuilder = MapValue.newBuilder();
        getactionNewBuilder.serializer("__type__", value2);
        accesscontainsdescendantNewBuilder4.RemoteActionCompatParcelizer(getactionNewBuilder);
        read = (Value) accesscontainsdescendantNewBuilder4.serializer();
        accesscontainsDescendant accesscontainsdescendantNewBuilder5 = Value.newBuilder();
        accesscontainsdescendantNewBuilder5.read("__vector__");
        Value value3 = (Value) accesscontainsdescendantNewBuilder5.serializer();
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = value3;
        accesscontainsDescendant accesscontainsdescendantNewBuilder6 = Value.newBuilder();
        getAction getactionNewBuilder2 = MapValue.newBuilder();
        getactionNewBuilder2.serializer("__type__", value3);
        accesscontainsDescendant accesscontainsdescendantNewBuilder7 = Value.newBuilder();
        accesscontainsdescendantNewBuilder7.serializer(ArrayValue.newBuilder());
        getactionNewBuilder2.serializer("value", (Value) accesscontainsdescendantNewBuilder7.serializer());
        accesscontainsdescendantNewBuilder6.RemoteActionCompatParcelizer(getactionNewBuilder2);
        PlaybackStateCompat = (Value) accesscontainsdescendantNewBuilder6.serializer();
        accesscontainsDescendant accesscontainsdescendantNewBuilder8 = Value.newBuilder();
        accesscontainsdescendantNewBuilder8.RemoteActionCompatParcelizer();
        ((Value) accesscontainsdescendantNewBuilder8.RemoteActionCompatParcelizer).setBooleanValue(false);
        MediaMetadataCompat = (Value) accesscontainsdescendantNewBuilder8.serializer();
        accesscontainsDescendant accesscontainsdescendantNewBuilder9 = Value.newBuilder();
        accesscontainsdescendantNewBuilder9.RemoteActionCompatParcelizer(Double.NaN);
        MediaDescriptionCompat = (Value) accesscontainsdescendantNewBuilder9.serializer();
        accesscontainsDescendant accesscontainsdescendantNewBuilder10 = Value.newBuilder();
        encodedString encodedstringNewBuilder = Timestamp.newBuilder();
        encodedstringNewBuilder.RemoteActionCompatParcelizer();
        ((Timestamp) encodedstringNewBuilder.RemoteActionCompatParcelizer).setSeconds(Long.MIN_VALUE);
        accesscontainsdescendantNewBuilder10.RemoteActionCompatParcelizer();
        ((Value) accesscontainsdescendantNewBuilder10.RemoteActionCompatParcelizer).setTimestampValue((Timestamp) encodedstringNewBuilder.serializer());
        MediaSessionCompatToken = (Value) accesscontainsdescendantNewBuilder10.serializer();
        accesscontainsDescendant accesscontainsdescendantNewBuilder11 = Value.newBuilder();
        accesscontainsdescendantNewBuilder11.read("");
        PlaybackStateCompatCustomAction = (Value) accesscontainsdescendantNewBuilder11.serializer();
        accesscontainsDescendant accesscontainsdescendantNewBuilder12 = Value.newBuilder();
        ClipboardExtensions_androidKt clipboardExtensions_androidKt = getClipMetadata.serializer;
        accesscontainsdescendantNewBuilder12.RemoteActionCompatParcelizer();
        ((Value) accesscontainsdescendantNewBuilder12.RemoteActionCompatParcelizer).setBytesValue(clipboardExtensions_androidKt);
        MediaBrowserCompatMediaItem = (Value) accesscontainsdescendantNewBuilder12.serializer();
        visitNodes visitnodesRemoteActionCompatParcelizer = visitNodes.RemoteActionCompatParcelizer();
        accesscontainsDescendant accesscontainsdescendantNewBuilder13 = Value.newBuilder();
        accesscontainsdescendantNewBuilder13.RemoteActionCompatParcelizer(String.format("projects/%s/databases/%s/documents/%s", Arrays.copyOf(new Object[]{"", "", visitnodesRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.write()}, 3)));
        MediaSessionCompatResultReceiverWrapper = (Value) accesscontainsdescendantNewBuilder13.serializer();
        accesscontainsDescendant accesscontainsdescendantNewBuilder14 = Value.newBuilder();
        stopRetainingExitedValues stopretainingexitedvaluesNewBuilder = LatLng.newBuilder();
        stopretainingexitedvaluesNewBuilder.RemoteActionCompatParcelizer();
        ((LatLng) stopretainingexitedvaluesNewBuilder.RemoteActionCompatParcelizer).setLatitude(-90.0d);
        stopretainingexitedvaluesNewBuilder.RemoteActionCompatParcelizer();
        ((LatLng) stopretainingexitedvaluesNewBuilder.RemoteActionCompatParcelizer).setLongitude(-180.0d);
        accesscontainsdescendantNewBuilder14.RemoteActionCompatParcelizer();
        ((Value) accesscontainsdescendantNewBuilder14.RemoteActionCompatParcelizer).setGeoPointValue((LatLng) stopretainingexitedvaluesNewBuilder.serializer());
        MediaSessionCompatQueueItem = (Value) accesscontainsdescendantNewBuilder14.serializer();
        accesscontainsDescendant accesscontainsdescendantNewBuilder15 = Value.newBuilder();
        ArrayValue defaultInstance = ArrayValue.getDefaultInstance();
        accesscontainsdescendantNewBuilder15.RemoteActionCompatParcelizer();
        ((Value) accesscontainsdescendantNewBuilder15.RemoteActionCompatParcelizer).setArrayValue(defaultInstance);
        IconCompatParcelizer = (Value) accesscontainsdescendantNewBuilder15.serializer();
        accesscontainsDescendant accesscontainsdescendantNewBuilder16 = Value.newBuilder();
        MapValue defaultInstance2 = MapValue.getDefaultInstance();
        accesscontainsdescendantNewBuilder16.RemoteActionCompatParcelizer();
        ((Value) accesscontainsdescendantNewBuilder16.RemoteActionCompatParcelizer).setMapValue(defaultInstance2);
        RatingCompat = (Value) accesscontainsdescendantNewBuilder16.serializer();
        accesscontainsDescendant accesscontainsdescendantNewBuilder17 = Value.newBuilder();
        accesscontainsdescendantNewBuilder17.RemoteActionCompatParcelizer();
        ((Value) accesscontainsdescendantNewBuilder17.RemoteActionCompatParcelizer).setBooleanValue(true);
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = (Value) accesscontainsdescendantNewBuilder17.serializer();
        accesscontainsDescendant accesscontainsdescendantNewBuilder18 = Value.newBuilder();
        accesscontainsdescendantNewBuilder18.RemoteActionCompatParcelizer();
        ((Value) accesscontainsdescendantNewBuilder18.RemoteActionCompatParcelizer).setBooleanValue(false);
        write = (Value) accesscontainsdescendantNewBuilder18.serializer();
    }

    public static final boolean read(Value value) {
        return value != null && value.hasArrayValue();
    }

    public static final boolean serializer(Value value) {
        return value != null && value.hasIntegerValue();
    }

    public static final int RemoteActionCompatParcelizer(Value value) {
        Value.RemoteActionCompatParcelizer valueTypeCase = value != null ? value.getValueTypeCase() : null;
        switch (valueTypeCase == null ? -1 : NodeCoordinatorinvalidateParentLayer1.write[valueTypeCase.ordinal()]) {
            case -1:
            case 1:
                return 0;
            case 0:
            default:
                getRectManager.write("Invalid value type: " + value.getValueTypeCase(), new Object[0]);
                throw null;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return Double.isNaN(value.getDoubleValue()) ? 3 : 4;
            case 5:
                return 5;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 10;
            case 9:
                return 13;
            case 10:
                return 15;
            case 11:
                if (shouldHitTestChildren.read(value)) {
                    return 6;
                }
                value.getClass();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{serializer, value.getMapValue().getFieldsMap().get("__type__")}, getCieXyz.write())).booleanValue()) {
                    return Integer.MAX_VALUE;
                }
                return write(value) ? 16 : 17;
        }
    }

    public static final Value serializer(Map map) {
        map.getClass();
        accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
        getAction getactionNewBuilder = MapValue.newBuilder();
        getactionNewBuilder.RemoteActionCompatParcelizer();
        ((MapValue) getactionNewBuilder.RemoteActionCompatParcelizer).getMutableFieldsMap().putAll(map);
        accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer(getactionNewBuilder);
        return (Value) accesscontainsdescendantNewBuilder.serializer();
    }

    public static final boolean serializer(legacyScrollOntoScreenscrollDelta legacyscrollontoscreenscrolldelta, Value value) {
        legacyscrollontoscreenscrolldelta.getClass();
        Iterator it = legacyscrollontoscreenscrolldelta.getValuesList().iterator();
        while (it.hasNext()) {
            if (serializer((Value) it.next(), value)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean write(Value value) {
        value.getClass();
        Object[] objArr = {r8lambda54BeH8ZsBru0CXI2CCSP2syNys, value.getMapValue().getFieldsMap().get("__type__")};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    public static final int RemoteActionCompatParcelizer(Value value, Value value2) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(value);
        int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(value2);
        if (iRemoteActionCompatParcelizer != iRemoteActionCompatParcelizer2) {
            return removeNodeAtDepth.serializer(iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
        }
        Value value3 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (value == null) {
            value = value3;
        }
        if (value2 == null) {
            value2 = value3;
        }
        return read(iRemoteActionCompatParcelizer, value, value2);
    }

    public static final String IconCompatParcelizer(Value value) {
        value.getClass();
        StringBuilder sb = new StringBuilder();
        write(sb, value);
        return sb.toString();
    }

    public static int serializer(ArrayValue arrayValue, ArrayValue arrayValue2) {
        int iMin = (int) Math.min(arrayValue.getValuesCount(), arrayValue2.getValuesCount());
        for (int i = 0; i < iMin; i++) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(arrayValue.getValues(i), arrayValue2.getValues(i));
            if (iRemoteActionCompatParcelizer != 0) {
                return iRemoteActionCompatParcelizer;
            }
        }
        return removeNodeAtDepth.serializer(arrayValue.getValuesCount(), arrayValue2.getValuesCount());
    }

    public static void write(StringBuilder sb, Value value) {
        Value.RemoteActionCompatParcelizer valueTypeCase = value.getValueTypeCase();
        switch (valueTypeCase == null ? -1 : NodeCoordinatorinvalidateParentLayer1.write[valueTypeCase.ordinal()]) {
            case 1:
                sb.append("null");
                return;
            case 2:
                sb.append(value.getBooleanValue());
                return;
            case 3:
                sb.append(value.getIntegerValue());
                return;
            case 4:
                sb.append(value.getDoubleValue());
                return;
            case 5:
                Timestamp timestampValue = value.getTimestampValue();
                timestampValue.getClass();
                sb.append(String.format("time(%s,%s)", Arrays.copyOf(new Object[]{Long.valueOf(timestampValue.getSeconds()), Integer.valueOf(timestampValue.getNanos())}, 2)));
                return;
            case 6:
                sb.append(value.getStringValue());
                return;
            case 7:
                sb.append(com.google.firebase.firestore.util.Util.RemoteActionCompatParcelizer(value.getBytesValue()));
                return;
            case 8:
                getRectManager.RemoteActionCompatParcelizer(value.hasReferenceValue(), "Value should be a ReferenceValue", new Object[0]);
                sb.append(visitNodes.IconCompatParcelizer(value.getReferenceValue()));
                return;
            case 9:
                LatLng geoPointValue = value.getGeoPointValue();
                geoPointValue.getClass();
                sb.append(String.format("geo(%s,%s)", Arrays.copyOf(new Object[]{Double.valueOf(geoPointValue.getLatitude()), Double.valueOf(geoPointValue.getLongitude())}, 2)));
                return;
            case 10:
                ArrayValue arrayValue = value.getArrayValue();
                arrayValue.getClass();
                sb.append("[");
                if (arrayValue.getValuesCount() > 0) {
                    Value values = arrayValue.getValues(0);
                    values.getClass();
                    write(sb, values);
                    int valuesCount = arrayValue.getValuesCount();
                    for (int i = 1; i < valuesCount; i++) {
                        sb.append(",");
                        Value values2 = arrayValue.getValues(i);
                        values2.getClass();
                        write(sb, values2);
                    }
                }
                sb.append("]");
                return;
            case 11:
                MapValue mapValue = value.getMapValue();
                mapValue.getClass();
                ArrayList arrayList = new ArrayList(mapValue.getFieldsMap().keySet());
                BrazeContentCardsManagerCompanion.RatingCompat(arrayList);
                sb.append("{");
                Iterator it = arrayList.iterator();
                it.getClass();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    sb.append(str);
                    sb.append(":");
                    Value fieldsOrThrow = mapValue.getFieldsOrThrow(str);
                    fieldsOrThrow.getClass();
                    write(sb, fieldsOrThrow);
                    if (it.hasNext()) {
                        sb.append(",");
                    }
                }
                sb.append("}");
                return;
            default:
                getRectManager.write("Invalid value type: " + value.getValueTypeCase(), new Object[0]);
                throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x014c A[RETURN] */
    public static final boolean serializer(Value value, Value value2) {
        int iRemoteActionCompatParcelizer;
        int i;
        if (value == value2) {
            return true;
        }
        if (value == null || value2 == null || (iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(value)) != RemoteActionCompatParcelizer(value2)) {
            return false;
        }
        if (iRemoteActionCompatParcelizer == 3 || iRemoteActionCompatParcelizer == 4) {
            Value.RemoteActionCompatParcelizer valueTypeCase = value.getValueTypeCase();
            int i2 = valueTypeCase == null ? -1 : NodeCoordinatorinvalidateParentLayer1.write[valueTypeCase.ordinal()];
            if (i2 == 3) {
                Value.RemoteActionCompatParcelizer valueTypeCase2 = value2.getValueTypeCase();
                i = valueTypeCase2 != null ? NodeCoordinatorinvalidateParentLayer1.write[valueTypeCase2.ordinal()] : -1;
                if (i == 3 ? value.getIntegerValue() != value2.getIntegerValue() : !(i == 4 && ApproachLayoutModifierNodeImpl.serializer(value2.getDoubleValue(), value.getIntegerValue()) == 0)) {
                    return false;
                }
                return true;
            }
            if (i2 == 4) {
                Value.RemoteActionCompatParcelizer valueTypeCase3 = value2.getValueTypeCase();
                i = valueTypeCase3 != null ? NodeCoordinatorinvalidateParentLayer1.write[valueTypeCase3.ordinal()] : -1;
                if (i == 3 ? ApproachLayoutModifierNodeImpl.serializer(value.getDoubleValue(), value2.getIntegerValue()) == 0 : !(i != 4 || ApproachLayoutModifierNodeImpl.RemoteActionCompatParcelizer(value.getDoubleValue(), value2.getDoubleValue()) != 0)) {
                    return true;
                }
            }
            return false;
        }
        if (iRemoteActionCompatParcelizer == 6) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{shouldHitTestChildren.IconCompatParcelizer(value), shouldHitTestChildren.IconCompatParcelizer(value2)}, getCieXyz.write())).booleanValue();
        }
        if (iRemoteActionCompatParcelizer != Integer.MAX_VALUE) {
            switch (iRemoteActionCompatParcelizer) {
                case 15:
                    ArrayValue arrayValue = value.getArrayValue();
                    ArrayValue arrayValue2 = value2.getArrayValue();
                    if (arrayValue.getValuesCount() == arrayValue2.getValuesCount()) {
                        int valuesCount = arrayValue.getValuesCount();
                        for (int i3 = 0; i3 < valuesCount; i3++) {
                            if (serializer(arrayValue.getValues(i3), arrayValue2.getValues(i3))) {
                            }
                        }
                        break;
                    }
                    return false;
                case 16:
                case 17:
                    MapValue mapValue = value.getMapValue();
                    MapValue mapValue2 = value2.getMapValue();
                    if (mapValue.getFieldsCount() == mapValue2.getFieldsCount()) {
                        Map<String, Value> fieldsMap = mapValue.getFieldsMap();
                        fieldsMap.getClass();
                        for (Map.Entry<String, Value> entry : fieldsMap.entrySet()) {
                            String key = entry.getKey();
                            Value value3 = entry.getValue();
                            Value value4 = mapValue2.getFieldsMap().get(key);
                            if (value4 != null && serializer(value3, value4)) {
                            }
                        }
                        return true;
                    }
                    return false;
                default:
                    return value.equals(value2);
            }
        }
        return true;
    }

    public static int read(int i, Value value, Value value2) {
        if (i != 0) {
            if (i == 10) {
                String referenceValue = value.getReferenceValue();
                referenceValue.getClass();
                String referenceValue2 = value2.getReferenceValue();
                referenceValue2.getClass();
                String[] strArr = (String[]) new getInAppMessageEventMap("/").write(0, (CharSequence) referenceValue).toArray(new String[0]);
                String[] strArr2 = (String[]) new getInAppMessageEventMap("/").write(0, (CharSequence) referenceValue2).toArray(new String[0]);
                int iMin = (int) Math.min(strArr.length, strArr2.length);
                for (int i2 = 0; i2 < iMin; i2++) {
                    int iCompareTo = strArr[i2].compareTo(strArr2[i2]);
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                return removeNodeAtDepth.serializer(strArr.length, strArr2.length);
            }
            if (i == 13) {
                LatLng geoPointValue = value.getGeoPointValue();
                geoPointValue.getClass();
                LatLng geoPointValue2 = value2.getGeoPointValue();
                geoPointValue2.getClass();
                int iRemoteActionCompatParcelizer = ApproachLayoutModifierNodeImpl.RemoteActionCompatParcelizer(geoPointValue.getLatitude(), geoPointValue2.getLatitude());
                return iRemoteActionCompatParcelizer == 0 ? ApproachLayoutModifierNodeImpl.RemoteActionCompatParcelizer(geoPointValue.getLongitude(), geoPointValue2.getLongitude()) : iRemoteActionCompatParcelizer;
            }
            if (i != Integer.MAX_VALUE) {
                switch (i) {
                    case 2:
                        return Boolean.compare(value.getBooleanValue(), value2.getBooleanValue());
                    case 3:
                        break;
                    case 4:
                        if (value.hasDoubleValue()) {
                            if (value2.hasDoubleValue()) {
                                return ApproachLayoutModifierNodeImpl.RemoteActionCompatParcelizer(value.getDoubleValue(), value2.getDoubleValue());
                            }
                            if (value2.hasIntegerValue()) {
                                return ApproachLayoutModifierNodeImpl.serializer(value.getDoubleValue(), value2.getIntegerValue());
                            }
                        } else if (value.hasIntegerValue()) {
                            if (value2.hasIntegerValue()) {
                                return Long.compare(value.getIntegerValue(), value2.getIntegerValue());
                            }
                            if (value2.hasDoubleValue()) {
                                return ApproachLayoutModifierNodeImpl.serializer(value2.getDoubleValue(), value.getIntegerValue()) * (-1);
                            }
                        }
                        getRectManager.write("Unexpected values: %s vs %s", value, value2);
                        throw null;
                    case 5:
                        Timestamp timestampValue = value.getTimestampValue();
                        timestampValue.getClass();
                        Timestamp timestampValue2 = value2.getTimestampValue();
                        timestampValue2.getClass();
                        int i3 = removeNodeAtDepth.read(timestampValue.getSeconds(), timestampValue2.getSeconds());
                        return i3 != 0 ? i3 : removeNodeAtDepth.serializer(timestampValue.getNanos(), timestampValue2.getNanos());
                    case 6:
                        Timestamp timestampIconCompatParcelizer = shouldHitTestChildren.IconCompatParcelizer(value);
                        timestampIconCompatParcelizer.getClass();
                        Timestamp timestampIconCompatParcelizer2 = shouldHitTestChildren.IconCompatParcelizer(value2);
                        timestampIconCompatParcelizer2.getClass();
                        int i4 = removeNodeAtDepth.read(timestampIconCompatParcelizer.getSeconds(), timestampIconCompatParcelizer2.getSeconds());
                        return i4 != 0 ? i4 : removeNodeAtDepth.serializer(timestampIconCompatParcelizer.getNanos(), timestampIconCompatParcelizer2.getNanos());
                    case 7:
                        return com.google.firebase.firestore.util.Util.RemoteActionCompatParcelizer(value.getStringValue(), value2.getStringValue());
                    case 8:
                        return com.google.firebase.firestore.util.Util.IconCompatParcelizer(value.getBytesValue(), value2.getBytesValue());
                    default:
                        switch (i) {
                            case 15:
                                ArrayValue arrayValue = value.getArrayValue();
                                arrayValue.getClass();
                                ArrayValue arrayValue2 = value2.getArrayValue();
                                arrayValue2.getClass();
                                return serializer(arrayValue, arrayValue2);
                            case 16:
                                MapValue mapValue = value.getMapValue();
                                mapValue.getClass();
                                MapValue mapValue2 = value2.getMapValue();
                                mapValue2.getClass();
                                Map<String, Value> fieldsMap = mapValue.getFieldsMap();
                                Map<String, Value> fieldsMap2 = mapValue2.getFieldsMap();
                                Value value3 = fieldsMap.get("value");
                                value3.getClass();
                                ArrayValue arrayValue3 = value3.getArrayValue();
                                Value value4 = fieldsMap2.get("value");
                                value4.getClass();
                                ArrayValue arrayValue4 = value4.getArrayValue();
                                int iSerializer = removeNodeAtDepth.serializer(arrayValue3.getValuesCount(), arrayValue4.getValuesCount());
                                return iSerializer != 0 ? iSerializer : serializer(arrayValue3, arrayValue4);
                            case 17:
                                MapValue mapValue3 = value.getMapValue();
                                mapValue3.getClass();
                                MapValue mapValue4 = value2.getMapValue();
                                mapValue4.getClass();
                                Iterator it = new TreeMap(mapValue3.getFieldsMap()).entrySet().iterator();
                                Iterator it2 = new TreeMap(mapValue4.getFieldsMap()).entrySet().iterator();
                                while (it.hasNext() && it2.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    Map.Entry entry2 = (Map.Entry) it2.next();
                                    int iRemoteActionCompatParcelizer2 = com.google.firebase.firestore.util.Util.RemoteActionCompatParcelizer((String) entry.getKey(), (String) entry2.getKey());
                                    if (iRemoteActionCompatParcelizer2 != 0) {
                                        return iRemoteActionCompatParcelizer2;
                                    }
                                    int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer((Value) entry.getValue(), (Value) entry2.getValue());
                                    if (iRemoteActionCompatParcelizer3 != 0) {
                                        return iRemoteActionCompatParcelizer3;
                                    }
                                }
                                return Boolean.compare(it.hasNext(), it2.hasNext());
                            default:
                                getRectManager.write(c8$$ExternalSyntheticOutline0.m(i, "Invalid value type: "), new Object[0]);
                                throw null;
                        }
                }
            }
        }
        return 0;
    }

    public static final Timestamp read(int i, long j) {
        if (i < 0 || i >= 1000000000) {
            DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i, "Timestamp nanoseconds out of range: "));
            return null;
        }
        if (-62135596800L <= j && j < 253402300800L) {
            encodedString encodedstringNewBuilder = Timestamp.newBuilder();
            encodedstringNewBuilder.RemoteActionCompatParcelizer();
            ((Timestamp) encodedstringNewBuilder.RemoteActionCompatParcelizer).setSeconds(j);
            encodedstringNewBuilder.RemoteActionCompatParcelizer();
            ((Timestamp) encodedstringNewBuilder.RemoteActionCompatParcelizer).setNanos((i / 1000) * 1000);
            return (Timestamp) encodedstringNewBuilder.serializer();
        }
        DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j, "Timestamp seconds out of range: "));
        return null;
    }

    public static final Value read(byte[] bArr) {
        accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
        ClipboardExtensions_androidKt clipboardExtensions_androidKt = getClipMetadata.read(bArr, 0, bArr.length);
        accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer();
        ((Value) accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer).setBytesValue(clipboardExtensions_androidKt);
        return (Value) accesscontainsdescendantNewBuilder.serializer();
    }

    public static final Value write(String str) {
        str.getClass();
        accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
        accesscontainsdescendantNewBuilder.read(str);
        return (Value) accesscontainsdescendantNewBuilder.serializer();
    }

    public static final Value write(Iterable iterable) {
        accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
        performActionHelper performactionhelperNewBuilder = ArrayValue.newBuilder();
        performactionhelperNewBuilder.RemoteActionCompatParcelizer();
        ((ArrayValue) performactionhelperNewBuilder.RemoteActionCompatParcelizer).addAllValues(iterable);
        accesscontainsdescendantNewBuilder.serializer(performactionhelperNewBuilder);
        return (Value) accesscontainsdescendantNewBuilder.serializer();
    }
}
