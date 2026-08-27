package o;

import com.sentiance.okhttp3.u$a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class getTrianglesc2xauaI implements transformQ8lPUPs, encodeColorList {
    public boolean IconCompatParcelizer;
    public final accessgetMirrorcp RemoteActionCompatParcelizer;
    public final Adaptation read;
    public final boolean serializer;
    public final android.graphics.Path write = new android.graphics.Path();
    public final u$a RatingCompat = new u$a(2);

    @Override // o.encodeColorList
    public final void serializer() {
        this.IconCompatParcelizer = false;
        this.RemoteActionCompatParcelizer.invalidateSelf();
    }

    @Override // o.transformQ8lPUPs
    public final android.graphics.Path write() {
        boolean z = this.IconCompatParcelizer;
        Adaptation adaptation = this.read;
        android.graphics.Path path = this.write;
        if (z) {
            adaptation.getClass();
            return path;
        }
        path.reset();
        if (this.serializer) {
            this.IconCompatParcelizer = true;
            return path;
        }
        android.graphics.Path path2 = (android.graphics.Path) adaptation.IconCompatParcelizer();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        this.RatingCompat.serializer(path);
        this.IconCompatParcelizer = true;
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:12:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e A[SYNTHETIC] */
    @Override // o.getPackedValueannotations
    public final void RemoteActionCompatParcelizer(List list, List list2) {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i < arrayList2.size()) {
                getPackedValueannotations getpackedvalueannotations = (getPackedValueannotations) arrayList2.get(i);
                if (getpackedvalueannotations instanceof encodePointList) {
                    encodePointList encodepointlist = (encodePointList) getpackedvalueannotations;
                    if (encodepointlist.RatingCompat == Bt2020Pqlambda0.SIMULTANEOUSLY) {
                        this.RatingCompat.IconCompatParcelizer.add(encodepointlist);
                        encodepointlist.serializer(this);
                    } else if (!(getpackedvalueannotations instanceof accessgetTrianglescp)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        accessgetTrianglescp accessgettrianglescp = (accessgetTrianglescp) getpackedvalueannotations;
                        accessgettrianglescp.write.write(this);
                        arrayList.add(accessgettrianglescp);
                    }
                } else if (!(getpackedvalueannotations instanceof accessgetTrianglescp)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    accessgetTrianglescp accessgettrianglescp2 = (accessgetTrianglescp) getpackedvalueannotations;
                    accessgettrianglescp2.write.write(this);
                    arrayList.add(accessgettrianglescp2);
                }
                i++;
            } else {
                this.read.MediaDescriptionCompat = arrayList;
                return;
            }
        }
    }

    public getTrianglesc2xauaI(accessgetMirrorcp accessgetmirrorcp, ExtendedSrgblambda0 extendedSrgblambda0, r8lambdari4swWY4EFQdKU1W_SyLqgkcz7Q r8lambdari4swwy4efqdku1w_sylqgkcz7q) {
        this.serializer = r8lambdari4swwy4efqdku1w_sylqgkcz7q.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = accessgetmirrorcp;
        Adaptation adaptation = new Adaptation((List) r8lambdari4swwy4efqdku1w_sylqgkcz7q.write.RatingCompat);
        this.read = adaptation;
        extendedSrgblambda0.RemoteActionCompatParcelizer(adaptation);
        adaptation.write(this);
    }
}
