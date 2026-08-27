package o;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetCentercp implements TransformOriginCompanion, transformQ8lPUPs, encodeColorList {
    public final boolean IconCompatParcelizer;
    public final DeltaDecoder MediaBrowserCompatMediaItem;
    public ArrayList MediaDescriptionCompat;
    public final RectF MediaMetadataCompat;
    public final android.graphics.Path MediaSessionCompatQueueItem;
    public final AdaptationCompanion PlaybackStateCompatCustomAction;
    public final getD60 RatingCompat;
    public final RectF RemoteActionCompatParcelizer;
    public final ArrayList read;
    public final android.graphics.Matrix serializer;
    public final accessgetMirrorcp write;

    @Override // o.getPackedValueannotations
    public final void RemoteActionCompatParcelizer(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.read;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            }
            getPackedValueannotations getpackedvalueannotations = (getPackedValueannotations) arrayList.get(size2);
            getpackedvalueannotations.RemoteActionCompatParcelizer(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(getpackedvalueannotations);
        }
    }

    @Override // o.TransformOriginCompanion
    public final void read(RectF rectF, android.graphics.Matrix matrix, boolean z) {
        android.graphics.Matrix matrix2 = this.serializer;
        matrix2.set(matrix);
        AdaptationCompanion adaptationCompanion = this.PlaybackStateCompatCustomAction;
        if (adaptationCompanion != null) {
            matrix2.preConcat(adaptationCompanion.IconCompatParcelizer());
        }
        RectF rectF2 = this.MediaMetadataCompat;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.read;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            getPackedValueannotations getpackedvalueannotations = (getPackedValueannotations) arrayList.get(size);
            if (getpackedvalueannotations instanceof TransformOriginCompanion) {
                ((TransformOriginCompanion) getpackedvalueannotations).read(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    @Override // o.encodeColorList
    public final void serializer() {
        this.write.invalidateSelf();
    }

    @Override // o.transformQ8lPUPs
    public final android.graphics.Path write() {
        android.graphics.Matrix matrix = this.serializer;
        matrix.reset();
        AdaptationCompanion adaptationCompanion = this.PlaybackStateCompatCustomAction;
        if (adaptationCompanion != null) {
            matrix.set(adaptationCompanion.IconCompatParcelizer());
        }
        android.graphics.Path path = this.MediaSessionCompatQueueItem;
        path.reset();
        if (!this.IconCompatParcelizer) {
            ArrayList arrayList = this.read;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                getPackedValueannotations getpackedvalueannotations = (getPackedValueannotations) arrayList.get(size);
                if (getpackedvalueannotations instanceof transformQ8lPUPs) {
                    path.addPath(((transformQ8lPUPs) getpackedvalueannotations).write(), matrix);
                }
            }
        }
        return path;
    }

    public final boolean read() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.read;
            if (i >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i) instanceof TransformOriginCompanion) && (i2 = i2 + 1) >= 2) {
                return true;
            }
            i++;
        }
    }

    public final List RemoteActionCompatParcelizer() {
        if (this.MediaDescriptionCompat == null) {
            this.MediaDescriptionCompat = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.read;
                if (i >= arrayList.size()) {
                    break;
                }
                getPackedValueannotations getpackedvalueannotations = (getPackedValueannotations) arrayList.get(i);
                if (getpackedvalueannotations instanceof transformQ8lPUPs) {
                    this.MediaDescriptionCompat.add((transformQ8lPUPs) getpackedvalueannotations);
                }
                i++;
            }
        }
        return this.MediaDescriptionCompat;
    }

    @Override // o.TransformOriginCompanion
    public final void RemoteActionCompatParcelizer(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, getA geta) {
        if (this.IconCompatParcelizer) {
            return;
        }
        android.graphics.Matrix matrix2 = this.serializer;
        matrix2.set(matrix);
        AdaptationCompanion adaptationCompanion = this.PlaybackStateCompatCustomAction;
        if (adaptationCompanion != null) {
            matrix2.preConcat(adaptationCompanion.IconCompatParcelizer());
            getTransformui_graphics gettransformui_graphics = adaptationCompanion.MediaBrowserCompatMediaItem;
            i = (int) (((((gettransformui_graphics == null ? 100 : ((Integer) gettransformui_graphics.IconCompatParcelizer()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        accessgetMirrorcp accessgetmirrorcp = this.write;
        boolean z = (accessgetmirrorcp.PlaybackStateCompatCustomAction && read() && i != 255) || (geta != null && accessgetmirrorcp.ComponentActivity && read());
        int i2 = z ? 255 : i;
        getD60 getd60 = this.RatingCompat;
        if (z) {
            RectF rectF = this.RemoteActionCompatParcelizer;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            read(rectF, matrix, true);
            DeltaDecoder deltaDecoder = this.MediaBrowserCompatMediaItem;
            deltaDecoder.write = i;
            if (geta != null) {
                if (android.graphics.Color.alpha(geta.IconCompatParcelizer) > 0) {
                    deltaDecoder.serializer = geta;
                } else {
                    deltaDecoder.serializer = null;
                }
                geta = null;
            } else {
                deltaDecoder.serializer = null;
            }
            canvas = getd60.read(canvas, rectF, deltaDecoder);
        } else if (geta != null) {
            getA geta2 = new getA(geta);
            geta2.serializer(i2);
            geta = geta2;
        }
        ArrayList arrayList = this.read;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            Object obj = arrayList.get(size);
            if (obj instanceof TransformOriginCompanion) {
                ((TransformOriginCompanion) obj).RemoteActionCompatParcelizer(canvas, matrix2, i2, geta);
            }
        }
        if (z) {
            getd60.IconCompatParcelizer();
        }
    }

    public accessgetCentercp(accessgetMirrorcp accessgetmirrorcp, ExtendedSrgblambda0 extendedSrgblambda0, boolean z, ArrayList arrayList, ColorSpaceKt colorSpaceKt) {
        this.MediaBrowserCompatMediaItem = new DeltaDecoder((byte) 0, 4);
        this.RemoteActionCompatParcelizer = new RectF();
        this.RatingCompat = new getD60();
        this.serializer = new android.graphics.Matrix();
        this.MediaSessionCompatQueueItem = new android.graphics.Path();
        this.MediaMetadataCompat = new RectF();
        this.write = accessgetmirrorcp;
        this.IconCompatParcelizer = z;
        this.read = arrayList;
        if (colorSpaceKt != null) {
            AdaptationCompanion adaptationCompanion = new AdaptationCompanion(colorSpaceKt);
            this.PlaybackStateCompatCustomAction = adaptationCompanion;
            adaptationCompanion.read(extendedSrgblambda0);
            adaptationCompanion.RemoteActionCompatParcelizer(this);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            getPackedValueannotations getpackedvalueannotations = (getPackedValueannotations) arrayList.get(size);
            if (getpackedvalueannotations instanceof obtainMatrix) {
                arrayList2.add((obtainMatrix) getpackedvalueannotations);
            }
        }
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((obtainMatrix) arrayList2.get(size2)).read(arrayList.listIterator(arrayList.size()));
            }
        }
    }

    public accessgetCentercp(accessgetMirrorcp accessgetmirrorcp, ExtendedSrgblambda0 extendedSrgblambda0, rcpResponse rcpresponse, StrokeJoinCompanion strokeJoinCompanion) {
        ColorSpaceKt colorSpaceKt;
        String str = rcpresponse.IconCompatParcelizer;
        boolean z = rcpresponse.serializer;
        List list = rcpresponse.write;
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            getPackedValueannotations getpackedvalueannotationsIconCompatParcelizer = ((adaptdefault) list.get(i)).IconCompatParcelizer(accessgetmirrorcp, strokeJoinCompanion, extendedSrgblambda0);
            if (getpackedvalueannotationsIconCompatParcelizer != null) {
                arrayList.add(getpackedvalueannotationsIconCompatParcelizer);
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            adaptdefault adaptdefaultVar = (adaptdefault) list.get(i2);
            if (adaptdefaultVar instanceof ColorSpaceKt) {
                colorSpaceKt = (ColorSpaceKt) adaptdefaultVar;
                this(accessgetmirrorcp, extendedSrgblambda0, z, arrayList, colorSpaceKt);
            }
        }
        colorSpaceKt = null;
        this(accessgetmirrorcp, extendedSrgblambda0, z, arrayList, colorSpaceKt);
    }
}
