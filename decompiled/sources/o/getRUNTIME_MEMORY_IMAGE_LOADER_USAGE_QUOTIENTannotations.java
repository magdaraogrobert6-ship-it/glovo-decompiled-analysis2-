package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.squareup.moshi.ClassJsonAdapter;
import com.squareup.moshi.CollectionJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.MapJsonAdapter;
import com.squareup.moshi.Moshi$Lookup;
import com.squareup.moshi.StandardJsonAdapters;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations {
    public static final ArrayList RemoteActionCompatParcelizer;
    public final List read;
    public final ThreadLocal write = new ThreadLocal();
    public final LinkedHashMap IconCompatParcelizer = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        RemoteActionCompatParcelizer = arrayList;
        arrayList.add(StandardJsonAdapters.IconCompatParcelizer);
        arrayList.add(CollectionJsonAdapter.RemoteActionCompatParcelizer);
        arrayList.add(MapJsonAdapter.read);
        arrayList.add(MapJsonAdapter.write);
        arrayList.add(getRemoteBitmaplambda1.write);
        arrayList.add(ClassJsonAdapter.read);
    }

    public getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations(r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8 r8lambdae2bxepptxpg5qj9wrzyqgcf9s8) {
        ArrayList arrayList = r8lambdae2bxepptxpg5qj9wrzyqgcf9s8.read;
        int size = arrayList.size();
        ArrayList arrayList2 = RemoteActionCompatParcelizer;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.read = Collections.unmodifiableList(arrayList3);
    }

    public final JsonAdapter read(Type type, Set set, String str) {
        JsonAdapter jsonAdapter = null;
        if (type == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("type == null");
            return null;
        }
        if (set != null) {
            Type typeSerializer = getRemoteBitmaplambda4.serializer(type);
            if (typeSerializer instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) typeSerializer;
                if (wildcardType.getLowerBounds().length == 0) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (upperBounds.length == 1) {
                        typeSerializer = upperBounds[0];
                    } else {
                        DrawableTransformation.write();
                        return null;
                    }
                }
            }
            Object objAsList = set.isEmpty() ? typeSerializer : Arrays.asList(typeSerializer, set);
            synchronized (this.IconCompatParcelizer) {
                JsonAdapter jsonAdapter2 = (JsonAdapter) this.IconCompatParcelizer.get(objAsList);
                if (jsonAdapter2 != null) {
                    return jsonAdapter2;
                }
                getRemoteBitmaplambda0 getremotebitmaplambda0 = (getRemoteBitmaplambda0) this.write.get();
                if (getremotebitmaplambda0 == null) {
                    getremotebitmaplambda0 = new getRemoteBitmaplambda0(this);
                    this.write.set(getremotebitmaplambda0);
                }
                ArrayDeque arrayDeque = getremotebitmaplambda0.write;
                ArrayList arrayList = getremotebitmaplambda0.IconCompatParcelizer;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        Moshi$Lookup moshi$Lookup = (Moshi$Lookup) arrayList.get(i);
                        if (moshi$Lookup.IconCompatParcelizer.equals(objAsList)) {
                            arrayDeque.add(moshi$Lookup);
                            jsonAdapter = moshi$Lookup.read;
                            if (jsonAdapter != null) {
                                break;
                            }
                            jsonAdapter = moshi$Lookup;
                            break;
                        }
                        i++;
                    } else {
                        Moshi$Lookup moshi$Lookup2 = new Moshi$Lookup(typeSerializer, str, objAsList);
                        arrayList.add(moshi$Lookup2);
                        arrayDeque.add(moshi$Lookup2);
                        break;
                    }
                }
                try {
                    if (jsonAdapter != null) {
                        getremotebitmaplambda0.read(false);
                        return jsonAdapter;
                    }
                    try {
                        int size2 = this.read.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            JsonAdapter jsonAdapterSerializer = ((getRemoteBitmap) this.read.get(i2)).serializer(typeSerializer, set, this);
                            if (jsonAdapterSerializer != null) {
                                ((Moshi$Lookup) getremotebitmaplambda0.write.getLast()).read = jsonAdapterSerializer;
                                getremotebitmaplambda0.read(true);
                                return jsonAdapterSerializer;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + getRemoteBitmaplambda4.read(typeSerializer, set));
                    } catch (IllegalArgumentException e) {
                        throw getremotebitmaplambda0.serializer(e);
                    }
                } catch (Throwable th) {
                    getremotebitmaplambda0.read(false);
                    throw th;
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("annotations == null");
        return null;
    }
}
