package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import o.accessdetachAndRemoveNode;
import o.accessgetAggregateChildKindSet;
import o.accesspropagateCoordinator;
import o.accessupdateNode;
import o.createAndInsertNodeAsChild;
import o.structuralUpdate;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonValueObjectEncoderContext implements accessupdateNode, createAndInsertNodeAsChild {
    public final JsonWriter IconCompatParcelizer;
    public final Map MediaMetadataCompat;
    public final accessdetachAndRemoveNode RemoteActionCompatParcelizer;
    public final boolean read = true;
    public final Map serializer;
    public final boolean write;

    public JsonValueObjectEncoderContext(Writer writer, Map map, Map map2, accessdetachAndRemoveNode accessdetachandremovenode, boolean z) {
        this.IconCompatParcelizer = new JsonWriter(writer);
        this.serializer = map;
        this.MediaMetadataCompat = map2;
        this.RemoteActionCompatParcelizer = accessdetachandremovenode;
        this.write = z;
    }

    public final JsonValueObjectEncoderContext RemoteActionCompatParcelizer(Object obj) {
        JsonWriter jsonWriter = this.IconCompatParcelizer;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    RemoteActionCompatParcelizer(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        serializer(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            accessdetachAndRemoveNode accessdetachandremovenode = (accessdetachAndRemoveNode) this.serializer.get(obj.getClass());
            if (accessdetachandremovenode != null) {
                jsonWriter.beginObject();
                accessdetachandremovenode.serializer(obj, this);
                jsonWriter.endObject();
                return this;
            }
            accesspropagateCoordinator accesspropagatecoordinator = (accesspropagateCoordinator) this.MediaMetadataCompat.get(obj.getClass());
            if (accesspropagatecoordinator != null) {
                accesspropagatecoordinator.serializer(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.RemoteActionCompatParcelizer.serializer(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof structuralUpdate) {
                int number = ((structuralUpdate) obj).getNumber();
                IconCompatParcelizer();
                jsonWriter.value(number);
                return this;
            }
            String strName = ((Enum) obj).name();
            IconCompatParcelizer();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            IconCompatParcelizer();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i < length) {
                jsonWriter.value(iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                IconCompatParcelizer();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                RemoteActionCompatParcelizer(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                RemoteActionCompatParcelizer(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final void IconCompatParcelizer() {
        if (this.read) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // o.accessupdateNode
    public final accessupdateNode write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, int i) throws IOException {
        String str = accessgetaggregatechildkindset.read;
        IconCompatParcelizer();
        JsonWriter jsonWriter = this.IconCompatParcelizer;
        jsonWriter.name(str);
        IconCompatParcelizer();
        jsonWriter.value(i);
        return this;
    }

    @Override // o.accessupdateNode
    public final accessupdateNode write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, long j) throws IOException {
        String str = accessgetaggregatechildkindset.read;
        IconCompatParcelizer();
        JsonWriter jsonWriter = this.IconCompatParcelizer;
        jsonWriter.name(str);
        IconCompatParcelizer();
        jsonWriter.value(j);
        return this;
    }

    @Override // o.accessupdateNode
    public final accessupdateNode write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, Object obj) throws IOException {
        serializer(obj, accessgetaggregatechildkindset.read);
        return this;
    }

    @Override // o.accessupdateNode
    public final accessupdateNode read(accessgetAggregateChildKindSet accessgetaggregatechildkindset, boolean z) throws IOException {
        String str = accessgetaggregatechildkindset.read;
        IconCompatParcelizer();
        JsonWriter jsonWriter = this.IconCompatParcelizer;
        jsonWriter.name(str);
        IconCompatParcelizer();
        jsonWriter.value(z);
        return this;
    }

    public final JsonValueObjectEncoderContext serializer(Object obj, String str) throws IOException {
        boolean z = this.write;
        JsonWriter jsonWriter = this.IconCompatParcelizer;
        if (z) {
            if (obj == null) {
                return this;
            }
            IconCompatParcelizer();
            jsonWriter.name(str);
            RemoteActionCompatParcelizer(obj);
            return this;
        }
        IconCompatParcelizer();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        RemoteActionCompatParcelizer(obj);
        return this;
    }

    @Override // o.createAndInsertNodeAsChild
    public final createAndInsertNodeAsChild RemoteActionCompatParcelizer(String str) throws IOException {
        IconCompatParcelizer();
        this.IconCompatParcelizer.value(str);
        return this;
    }

    @Override // o.createAndInsertNodeAsChild
    public final createAndInsertNodeAsChild RemoteActionCompatParcelizer(boolean z) throws IOException {
        IconCompatParcelizer();
        this.IconCompatParcelizer.value(z);
        return this;
    }

    @Override // o.accessupdateNode
    public final accessupdateNode write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, double d) throws IOException {
        String str = accessgetaggregatechildkindset.read;
        IconCompatParcelizer();
        JsonWriter jsonWriter = this.IconCompatParcelizer;
        jsonWriter.name(str);
        IconCompatParcelizer();
        jsonWriter.value(d);
        return this;
    }
}
