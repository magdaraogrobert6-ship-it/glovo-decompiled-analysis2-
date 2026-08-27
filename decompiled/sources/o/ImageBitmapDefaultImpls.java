package o;

import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImageBitmapDefaultImpls {
    public static final /* synthetic */ int read = 0;

    static {
        setRotationX.IconCompatParcelizer("Schedulers");
    }

    public static void RemoteActionCompatParcelizer(graphicsLayerpANQ8Wgdefault graphicslayerpanq8wgdefault, androidx.work.impl.WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        scaleimpl scaleimplVarMediaMetadataCompat = workDatabase.MediaMetadataCompat();
        workDatabase.beginTransaction();
        try {
            List list2 = (List) TuplesKt.write(((translateimpldefault) scaleimplVarMediaMetadataCompat).IconCompatParcelizer, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new accessgetIntersectcp(10));
            write(scaleimplVarMediaMetadataCompat, graphicslayerpanq8wgdefault.IconCompatParcelizer, list2);
            List list3 = (List) TuplesKt.write(((translateimpldefault) scaleimplVarMediaMetadataCompat).IconCompatParcelizer, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new translateimpl(graphicslayerpanq8wgdefault.MediaSessionCompatQueueItem, 0));
            write(scaleimplVarMediaMetadataCompat, graphicslayerpanq8wgdefault.IconCompatParcelizer, list3);
            list3.addAll(list2);
            List list4 = (List) TuplesKt.write(((translateimpldefault) scaleimplVarMediaMetadataCompat).IconCompatParcelizer, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new accessgetIntersectcp(12));
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (list3.size() > 0) {
                setFrom58bKbWc[] setfrom58bkbwcArr = (setFrom58bKbWc[]) list3.toArray(new setFrom58bKbWc[list3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ImageBitmapCompanion imageBitmapCompanion = (ImageBitmapCompanion) it.next();
                    if (imageBitmapCompanion.write()) {
                        imageBitmapCompanion.serializer(setfrom58bkbwcArr);
                    }
                }
            }
            if (list4.size() > 0) {
                setFrom58bKbWc[] setfrom58bkbwcArr2 = (setFrom58bKbWc[]) list4.toArray(new setFrom58bKbWc[list4.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ImageBitmapCompanion imageBitmapCompanion2 = (ImageBitmapCompanion) it2.next();
                    if (!imageBitmapCompanion2.write()) {
                        imageBitmapCompanion2.serializer(setfrom58bkbwcArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }

    public static void write(scaleimpl scaleimplVar, getClipannotations getclipannotations, List list) {
        if (list.size() > 0) {
            getclipannotations.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((translateimpldefault) scaleimplVar).write(jCurrentTimeMillis, ((setFrom58bKbWc) it.next()).RatingCompat);
            }
        }
    }
}
