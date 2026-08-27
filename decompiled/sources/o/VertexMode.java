package o;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class VertexMode implements transformQ8lPUPs, obtainMatrix {
    public final mul3x3Diag IconCompatParcelizer;
    public final android.graphics.Path write = new android.graphics.Path();
    public final android.graphics.Path read = new android.graphics.Path();
    public final android.graphics.Path RemoteActionCompatParcelizer = new android.graphics.Path();
    public final ArrayList serializer = new ArrayList();

    @Override // o.getPackedValueannotations
    public final void RemoteActionCompatParcelizer(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.serializer;
            if (i >= arrayList.size()) {
                return;
            }
            ((transformQ8lPUPs) arrayList.get(i)).RemoteActionCompatParcelizer(list, list2);
            i++;
        }
    }

    public final void RemoteActionCompatParcelizer(android.graphics.Path.Op op) {
        android.graphics.Path path = this.read;
        path.reset();
        android.graphics.Path path2 = this.write;
        path2.reset();
        ArrayList arrayList = this.serializer;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 1) {
                break;
            }
            transformQ8lPUPs transformq8lpups = (transformQ8lPUPs) arrayList.get(size);
            if (transformq8lpups instanceof accessgetCentercp) {
                accessgetCentercp accessgetcentercp = (accessgetCentercp) transformq8lpups;
                ArrayList arrayList2 = (ArrayList) accessgetcentercp.RemoteActionCompatParcelizer();
                int size2 = arrayList2.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        android.graphics.Path pathWrite = ((transformQ8lPUPs) arrayList2.get(size2)).write();
                        android.graphics.Matrix matrixIconCompatParcelizer = accessgetcentercp.serializer;
                        AdaptationCompanion adaptationCompanion = accessgetcentercp.PlaybackStateCompatCustomAction;
                        if (adaptationCompanion != null) {
                            matrixIconCompatParcelizer = adaptationCompanion.IconCompatParcelizer();
                        } else {
                            matrixIconCompatParcelizer.reset();
                        }
                        pathWrite.transform(matrixIconCompatParcelizer);
                        path.addPath(pathWrite);
                    }
                }
            } else {
                path.addPath(transformq8lpups.write());
            }
        }
        int i = 0;
        transformQ8lPUPs transformq8lpups2 = (transformQ8lPUPs) arrayList.get(0);
        if (transformq8lpups2 instanceof accessgetCentercp) {
            accessgetCentercp accessgetcentercp2 = (accessgetCentercp) transformq8lpups2;
            List listRemoteActionCompatParcelizer = accessgetcentercp2.RemoteActionCompatParcelizer();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listRemoteActionCompatParcelizer;
                if (i >= arrayList3.size()) {
                    break;
                }
                android.graphics.Path pathWrite2 = ((transformQ8lPUPs) arrayList3.get(i)).write();
                android.graphics.Matrix matrixIconCompatParcelizer2 = accessgetcentercp2.serializer;
                AdaptationCompanion adaptationCompanion2 = accessgetcentercp2.PlaybackStateCompatCustomAction;
                if (adaptationCompanion2 != null) {
                    matrixIconCompatParcelizer2 = adaptationCompanion2.IconCompatParcelizer();
                } else {
                    matrixIconCompatParcelizer2.reset();
                }
                pathWrite2.transform(matrixIconCompatParcelizer2);
                path2.addPath(pathWrite2);
                i++;
            }
        } else {
            path2.set(transformq8lpups2.write());
        }
        this.RemoteActionCompatParcelizer.op(path2, path, op);
    }

    @Override // o.transformQ8lPUPs
    public final android.graphics.Path write() {
        android.graphics.Path path = this.RemoteActionCompatParcelizer;
        path.reset();
        mul3x3Diag mul3x3diag = this.IconCompatParcelizer;
        if (!mul3x3diag.serializer) {
            int i = accessgetTriangleFancp.IconCompatParcelizer[mul3x3diag.IconCompatParcelizer.ordinal()];
            if (i == 1) {
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = this.serializer;
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((transformQ8lPUPs) arrayList.get(i2)).write());
                    i2++;
                }
            } else {
                if (i == 2) {
                    RemoteActionCompatParcelizer(android.graphics.Path.Op.UNION);
                    return path;
                }
                if (i == 3) {
                    RemoteActionCompatParcelizer(android.graphics.Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (i == 4) {
                    RemoteActionCompatParcelizer(android.graphics.Path.Op.INTERSECT);
                    return path;
                }
                if (i == 5) {
                    RemoteActionCompatParcelizer(android.graphics.Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }

    public VertexMode(mul3x3Diag mul3x3diag) {
        this.IconCompatParcelizer = mul3x3diag;
    }

    @Override // o.obtainMatrix
    public final void read(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            getPackedValueannotations getpackedvalueannotations = (getPackedValueannotations) listIterator.previous();
            if (getpackedvalueannotations instanceof transformQ8lPUPs) {
                this.serializer.add((transformQ8lPUPs) getpackedvalueannotations);
                listIterator.remove();
            }
        }
    }
}
