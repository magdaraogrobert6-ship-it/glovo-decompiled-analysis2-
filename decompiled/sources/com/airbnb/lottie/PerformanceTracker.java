package com.airbnb.lottie;

import android.os.Parcelable;
import android.text.TextUtils;
import androidx.sqlite.SQLite;
import com.deliveryhero.fwf_http.ConstantKt;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.utils.DecodeUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import java.util.UUID;
import o.DrawableTransformation;
import o.NodeCoordinatorCompanionPointerInputSource1;
import o.accessgetInstancedelegatecp;
import o.createnHHXs2Y;
import o.getContentChild;
import o.getRectManager;
import o.instance_delegatelambda0;
import o.nodeInserted;
import o.nodeRemoved;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.visitNodes;

/* JADX INFO: loaded from: classes.dex */
public final class PerformanceTracker {
    public HashMap IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public void IconCompatParcelizer(nodeInserted nodeinserted) {
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = nodeinserted.IconCompatParcelizer;
        visitNodes visitnodes = nodeCoordinatorCompanionPointerInputSource1.read;
        HashMap map = this.IconCompatParcelizer;
        nodeInserted nodeinserted2 = (nodeInserted) map.get(visitnodes);
        if (nodeinserted2 == null) {
            map.put(visitnodes, nodeinserted);
            return;
        }
        nodeRemoved noderemoved = nodeinserted2.read;
        nodeRemoved noderemoved2 = nodeinserted.read;
        nodeRemoved noderemoved3 = nodeRemoved.ADDED;
        if (noderemoved2 != noderemoved3 && noderemoved == nodeRemoved.METADATA) {
            map.put(visitnodes, nodeinserted);
            return;
        }
        if (noderemoved2 == nodeRemoved.METADATA && noderemoved != nodeRemoved.REMOVED) {
            map.put(visitnodes, new nodeInserted(noderemoved, nodeCoordinatorCompanionPointerInputSource1));
            return;
        }
        nodeRemoved noderemoved4 = nodeRemoved.MODIFIED;
        if (noderemoved2 == noderemoved4 && noderemoved == noderemoved4) {
            map.put(visitnodes, new nodeInserted(noderemoved4, nodeCoordinatorCompanionPointerInputSource1));
            return;
        }
        if (noderemoved2 == noderemoved4 && noderemoved == noderemoved3) {
            map.put(visitnodes, new nodeInserted(noderemoved3, nodeCoordinatorCompanionPointerInputSource1));
            return;
        }
        nodeRemoved noderemoved5 = nodeRemoved.REMOVED;
        if (noderemoved2 == noderemoved5 && noderemoved == noderemoved3) {
            map.remove(visitnodes);
            return;
        }
        if (noderemoved2 == noderemoved5 && noderemoved == noderemoved4) {
            map.put(visitnodes, new nodeInserted(noderemoved5, nodeinserted2.IconCompatParcelizer));
        } else if (noderemoved2 == noderemoved3 && noderemoved == noderemoved5) {
            map.put(visitnodes, new nodeInserted(noderemoved4, nodeCoordinatorCompanionPointerInputSource1));
        } else {
            getRectManager.write("Unsupported combination of changes %s after %s", noderemoved2, noderemoved);
            throw null;
        }
    }

    public void write(getContentChild getcontentchild) {
        for (Map.Entry entry : getcontentchild.IconCompatParcelizer.entrySet()) {
            write(entry.getValue(), (String) entry.getKey());
        }
    }

    public PerformanceTracker(int i) {
        this.serializer = i;
        if (i == 1) {
            this.IconCompatParcelizer = new HashMap();
            return;
        }
        if (i == 2) {
            this.IconCompatParcelizer = new HashMap();
            return;
        }
        if (i == 3) {
            this.IconCompatParcelizer = new HashMap();
        } else if (i == 4) {
            this(UUID.randomUUID().toString());
        } else {
            new createnHHXs2Y(0);
            this.IconCompatParcelizer = new HashMap();
        }
    }

    public String toString() {
        if (this.serializer != 4) {
            return super.toString();
        }
        return "HeadBuilder{headers=" + this.IconCompatParcelizer + '}';
    }

    public void write(Object obj, String str) {
        HashMap map = this.IconCompatParcelizer;
        if (obj == null) {
            map.put(str, null);
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls == Integer.class || cls == String.class || (obj instanceof Serializable) || (obj instanceof Parcelable)) {
            map.put(str, obj);
        } else {
            Locale locale = Locale.ENGLISH;
            DrawableTransformation.read("Key ", str, " has invalid type ", cls);
        }
    }

    public void IconCompatParcelizer(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.IconCompatParcelizer.put("X-CP-Info", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.ArrayList] */
    public void onRoutesChanged(List list) {
        ?? arrayList;
        this.IconCompatParcelizer = new HashMap();
        int i = 0;
        for (Object obj : list) {
            RandomAccess randomAccess = null;
            if (i >= 0) {
                HashMap map = this.IconCompatParcelizer;
                String str = ((NavigationRoute) list.get(i)).id;
                DirectionsRoute directionsRoute = ((NavigationRoute) obj).directionsRoute;
                List<RouteLeg> listLegs = directionsRoute.legs();
                RandomAccess randomAccess2 = instance_delegatelambda0.write;
                if (listLegs != null) {
                    List<RouteLeg> list2 = listLegs;
                    int i2 = 10;
                    ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        List<LegStep> listSteps = ((RouteLeg) it.next()).steps();
                        if (listSteps != null) {
                            List<LegStep> list3 = listSteps;
                            arrayList = new ArrayList(accessgetInstancedelegatecp.write(list3, i2));
                            final int i3 = 0;
                            for (LegStep legStep : list3) {
                                legStep.getClass();
                                final int size = DecodeUtils.stepGeometryToPoints(directionsRoute, legStep).size();
                                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.ui.maps.internal.camera.RoutesIndicesConverter$processIndices$1$1$lambda$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                    public final Object invoke(Object obj2) {
                                        int iIntValue = ((Number) obj2).intValue() - i3;
                                        if (iIntValue < 0 || iIntValue >= size) {
                                            return null;
                                        }
                                        return Integer.valueOf(iIntValue);
                                    }
                                };
                                i3 += size - 1;
                                arrayList.add(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                            }
                        } else {
                            arrayList = 0;
                        }
                        if (arrayList == 0) {
                            arrayList = randomAccess2;
                        }
                        arrayList2.add(arrayList);
                        i2 = 10;
                    }
                    randomAccess = arrayList2;
                }
                if (randomAccess != null) {
                    randomAccess2 = randomAccess;
                }
                map.put(str, randomAccess2);
                i++;
            } else {
                SQLite.serializer();
                throw null;
            }
        }
    }

    public String read(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (String) this.IconCompatParcelizer.get(str);
    }

    public PerformanceTracker(String str) {
        this.serializer = 4;
        HashMap map = new HashMap(16);
        this.IconCompatParcelizer = map;
        map.put("X-Request-ID", TextUtils.isEmpty(str) ? UUID.randomUUID().toString() : str);
        map.put(ConstantKt.CONTENT_TYPE_HEADER, ConstantKt.CONTENT_TYPE_JSON);
    }

    public /* synthetic */ PerformanceTracker(int i, boolean z) {
        this.serializer = i;
    }
}
