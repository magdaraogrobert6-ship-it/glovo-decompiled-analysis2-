package o;

import android.text.TextUtils;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class OutlineKt {
    public static final String RemoteActionCompatParcelizer = setRotationX.IconCompatParcelizer("EnqueueRunnable");

    /* JADX WARN: Code duplicated, block: B:105:0x0300  */
    /* JADX WARN: Code duplicated, block: B:108:0x031e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0322 A[LOOP:4: B:109:0x0320->B:110:0x0322, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x0369 A[LOOP:5: B:112:0x0363->B:114:0x0369, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x0388  */
    /* JADX WARN: Code duplicated, block: B:117:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:88:0x0208  */
    /* JADX WARN: Code duplicated, block: B:96:0x0229  */
    /* JADX WARN: Code duplicated, block: B:99:0x0231  */
    /* JADX WARN: Instruction removed from duplicated block: B:108:0x031e, please report this as an issue */
    public static boolean serializer(ImageBitmapConfigCompanion imageBitmapConfigCompanion) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Iterator it;
        boolean z9;
        boolean z10;
        setFrom58bKbWc setfrom58bkbwc;
        UUID uuid;
        boolean zSerializer;
        OutlineGeneric outlineGenericRatingCompat;
        String string;
        Iterator it2;
        String str;
        int i;
        ImageBitmapConfigCompanion imageBitmapConfigCompanion2 = imageBitmapConfigCompanion;
        HashSet hashSetSerializer = ImageBitmapConfigCompanion.serializer(imageBitmapConfigCompanion);
        androidx.work.impl.WorkManagerImpl workManagerImpl = imageBitmapConfigCompanion2.MediaMetadataCompat;
        List list = imageBitmapConfigCompanion2.MediaDescriptionCompat;
        int i2 = 0;
        String[] strArr = (String[]) hashSetSerializer.toArray(new String[0]);
        String str2 = imageBitmapConfigCompanion2.MediaBrowserCompatMediaItem;
        accesssetColorFilterjd accesssetcolorfilterjd = imageBitmapConfigCompanion2.read;
        workManagerImpl.write.IconCompatParcelizer.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        androidx.work.impl.WorkDatabase workDatabase = workManagerImpl.PlaybackStateCompat;
        boolean z11 = strArr != null && strArr.length > 0;
        if (z11) {
            int length = strArr.length;
            z2 = false;
            z3 = false;
            z = true;
            while (true) {
                if (i2 < length) {
                    String str3 = strArr[i2];
                    int i3 = length;
                    setFrom58bKbWc setfrom58bkbwcWrite = ((translateimpldefault) workDatabase.MediaMetadataCompat()).write(str3);
                    if (setfrom58bkbwcWrite == null) {
                        setRotationX.read().serializer(RemoteActionCompatParcelizer, "Prerequisite " + str3 + " doesn't exist; not enqueuing");
                    } else {
                        setTranslationX settranslationx = setfrom58bkbwcWrite.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                        z &= settranslationx == setTranslationX.SUCCEEDED;
                        if (settranslationx == setTranslationX.FAILED) {
                            z3 = true;
                        } else if (settranslationx == setTranslationX.CANCELLED) {
                            z2 = true;
                        }
                        i2++;
                        length = i3;
                    }
                }
                z9 = true;
                z10 = false;
                imageBitmapConfigCompanion2.serializer = z9;
                return z10;
            }
        }
        z = true;
        z2 = false;
        z3 = false;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !z11) {
            translateimpldefault translateimpldefaultVar = (translateimpldefault) workDatabase.MediaMetadataCompat();
            translateimpldefaultVar.getClass();
            str2.getClass();
            z4 = z11;
            z5 = z;
            List list2 = (List) TuplesKt.write(translateimpldefaultVar.IconCompatParcelizer, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new PagereLwUrMk(str2, 9));
            if (!list2.isEmpty()) {
                int i4 = 8;
                if (accesssetcolorfilterjd == accesssetColorFilterjd.APPEND || accesssetcolorfilterjd == accesssetColorFilterjd.APPEND_OR_REPLACE) {
                    IntervalTreeiterator1 intervalTreeiterator1IconCompatParcelizer = workDatabase.IconCompatParcelizer();
                    ArrayList arrayList = new ArrayList();
                    Iterator it3 = list2.iterator();
                    z7 = z5;
                    while (it3.hasNext()) {
                        Iterator it4 = it3;
                        timesAssign58bKbWc timesassign58bkbwc = (timesAssign58bKbWc) it3.next();
                        String str4 = timesassign58bkbwc.write;
                        boolean z12 = zIsEmpty;
                        getColorsui_graphics getcolorsui_graphics = (getColorsui_graphics) intervalTreeiterator1IconCompatParcelizer;
                        getcolorsui_graphics.getClass();
                        str4.getClass();
                        IntervalTreeiterator1 intervalTreeiterator1 = intervalTreeiterator1IconCompatParcelizer;
                        androidx.work.impl.WorkManagerImpl workManagerImpl2 = workManagerImpl;
                        if (!((Boolean) TuplesKt.write(getcolorsui_graphics.RemoteActionCompatParcelizer, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new PagereLwUrMk(str4, 1))).booleanValue()) {
                            setTranslationX settranslationx2 = timesassign58bkbwc.IconCompatParcelizer;
                            boolean z13 = settranslationx2 == setTranslationX.SUCCEEDED;
                            if (settranslationx2 == setTranslationX.FAILED) {
                                z3 = true;
                            } else if (settranslationx2 == setTranslationX.CANCELLED) {
                                z2 = true;
                            }
                            arrayList.add(timesassign58bkbwc.write);
                            z7 = z13 & z7;
                        }
                        intervalTreeiterator1IconCompatParcelizer = intervalTreeiterator1;
                        it3 = it4;
                        zIsEmpty = z12;
                        workManagerImpl = workManagerImpl2;
                    }
                    workManagerImpl = workManagerImpl;
                    zIsEmpty = zIsEmpty;
                    List list3 = arrayList;
                    list3 = arrayList;
                    if (accesssetcolorfilterjd == accesssetColorFilterjd.APPEND_OR_REPLACE && (z2 || z3)) {
                        translateimpldefault translateimpldefaultVar2 = (translateimpldefault) workDatabase.MediaMetadataCompat();
                        translateimpldefaultVar2.getClass();
                        androidx.room.RoomDatabase roomDatabase = translateimpldefaultVar2.IconCompatParcelizer;
                        Iterator it5 = ((List) TuplesKt.write(roomDatabase, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new PagereLwUrMk(str2, 9))).iterator();
                        while (it5.hasNext()) {
                            String str5 = ((timesAssign58bKbWc) it5.next()).write;
                            str5.getClass();
                            TuplesKt.write(roomDatabase, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new PagereLwUrMk(str5, 8));
                        }
                        z2 = false;
                        z3 = false;
                        list3 = Collections.EMPTY_LIST;
                    }
                    strArr = (String[]) list3.toArray(strArr);
                    z6 = strArr.length > 0;
                    z8 = false;
                } else {
                    if (accesssetcolorfilterjd == accesssetColorFilterjd.KEEP) {
                        Iterator it6 = list2.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                setTranslationX settranslationx3 = ((timesAssign58bKbWc) it6.next()).IconCompatParcelizer;
                                if (settranslationx3 == setTranslationX.ENQUEUED || settranslationx3 == setTranslationX.RUNNING) {
                                    z9 = true;
                                    z10 = false;
                                    imageBitmapConfigCompanion2.serializer = z9;
                                    return z10;
                                }
                            }
                        }
                    }
                    workDatabase.getClass();
                    workDatabase.runInTransaction(new accessgetAlpha8cp(workDatabase, str2, workManagerImpl, 4));
                    scaleimpl scaleimplVarMediaMetadataCompat = workDatabase.MediaMetadataCompat();
                    Iterator it7 = list2.iterator();
                    while (it7.hasNext()) {
                        String str6 = ((timesAssign58bKbWc) it7.next()).write;
                        translateimpldefault translateimpldefaultVar3 = (translateimpldefault) scaleimplVarMediaMetadataCompat;
                        translateimpldefaultVar3.getClass();
                        str6.getClass();
                        TuplesKt.write(translateimpldefaultVar3.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new PagereLwUrMk(str6, i4));
                        scaleimplVarMediaMetadataCompat = scaleimplVarMediaMetadataCompat;
                        i4 = 8;
                    }
                    workManagerImpl = workManagerImpl;
                    zIsEmpty = zIsEmpty;
                    z6 = z4;
                    z7 = z5;
                    z8 = true;
                }
            }
            it = list.iterator();
            while (it.hasNext()) {
                setRotationY setrotationy = (setRotationY) it.next();
                setfrom58bkbwc = setrotationy.IconCompatParcelizer;
                uuid = setrotationy.RemoteActionCompatParcelizer;
                if (z6 || z7) {
                    setfrom58bkbwc.ParcelableVolumeInfo = jCurrentTimeMillis;
                } else if (z3) {
                    setfrom58bkbwc.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = setTranslationX.FAILED;
                } else if (z2) {
                    setfrom58bkbwc.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = setTranslationX.CANCELLED;
                } else {
                    setfrom58bkbwc.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = setTranslationX.BLOCKED;
                }
                if (setfrom58bkbwc.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == setTranslationX.ENQUEUED) {
                    z8 = true;
                }
                scaleimpl scaleimplVarMediaMetadataCompat2 = workDatabase.MediaMetadataCompat();
                boolean z14 = z8;
                workManagerImpl.MediaDescriptionCompat.getClass();
                Iterator it8 = it;
                zSerializer = setfrom58bkbwc.MediaSessionCompatToken.serializer("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
                long j = jCurrentTimeMillis;
                boolean zSerializer2 = setfrom58bkbwc.MediaSessionCompatToken.serializer("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
                boolean zSerializer3 = setfrom58bkbwc.MediaSessionCompatToken.serializer("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
                if (zSerializer && zSerializer2 && zSerializer3) {
                    String str7 = setfrom58bkbwc.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                    accessgetCompositingStrategyNrFUSIjd accessgetcompositingstrategynrfusijd = new accessgetCompositingStrategyNrFUSIjd(0);
                    accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd = setfrom58bkbwc.MediaSessionCompatToken;
                    accessgetambientshadowcolor0d7_kjujd.getClass();
                    accessgetcompositingstrategynrfusijd.write(accessgetambientshadowcolor0d7_kjujd.RemoteActionCompatParcelizer);
                    accessgetcompositingstrategynrfusijd.serializer.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str7);
                    accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujdIconCompatParcelizer = accessgetcompositingstrategynrfusijd.IconCompatParcelizer();
                    String str8 = setfrom58bkbwc.RatingCompat;
                    setTranslationX settranslationx4 = setfrom58bkbwc.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                    String str9 = setfrom58bkbwc.MediaSessionCompatResultReceiverWrapper;
                    accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd2 = setfrom58bkbwc.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    long j2 = setfrom58bkbwc.MediaSessionCompatQueueItem;
                    long j3 = setfrom58bkbwc.PlaybackStateCompat;
                    long j4 = setfrom58bkbwc.MediaMetadataCompat;
                    toolingGraphicsLayer toolinggraphicslayer = setfrom58bkbwc.read;
                    int i5 = setfrom58bkbwc.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                    GraphicsLayerScope graphicsLayerScope = setfrom58bkbwc.write;
                    long j5 = setfrom58bkbwc.serializer;
                    long j6 = setfrom58bkbwc.ParcelableVolumeInfo;
                    long j7 = setfrom58bkbwc.PlaybackStateCompatCustomAction;
                    long j8 = setfrom58bkbwc.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                    boolean z15 = setfrom58bkbwc.MediaBrowserCompatMediaItem;
                    setRotationZ setrotationz = setfrom58bkbwc.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    int i6 = setfrom58bkbwc.ComponentActivity;
                    int i7 = setfrom58bkbwc.MediaDescriptionCompat;
                    long j9 = setfrom58bkbwc.ResultReceiver;
                    int i8 = setfrom58bkbwc.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    int i9 = setfrom58bkbwc.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                    String str10 = setfrom58bkbwc.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                    Boolean bool = setfrom58bkbwc.IconCompatParcelizer;
                    str8.getClass();
                    settranslationx4.getClass();
                    str9.getClass();
                    accessgetambientshadowcolor0d7_kjujd2.getClass();
                    toolinggraphicslayer.getClass();
                    graphicsLayerScope.getClass();
                    setrotationz.getClass();
                    setfrom58bkbwc = new setFrom58bKbWc(str8, settranslationx4, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", str9, accessgetambientshadowcolor0d7_kjujdIconCompatParcelizer, accessgetambientshadowcolor0d7_kjujd2, j2, j3, j4, toolinggraphicslayer, i5, graphicsLayerScope, j5, j6, j7, j8, z15, setrotationz, i6, i7, j9, i8, i9, str10, bool);
                }
                translateimpldefault translateimpldefaultVar4 = (translateimpldefault) scaleimplVarMediaMetadataCompat2;
                translateimpldefaultVar4.getClass();
                TuplesKt.write(translateimpldefaultVar4.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Recomposer$$ExternalSyntheticLambda4(translateimpldefaultVar4, 17, setfrom58bkbwc));
                if (z6) {
                    for (String str11 : strArr) {
                        String string2 = uuid.toString();
                        string2.getClass();
                        LightingColorFilter lightingColorFilter = new LightingColorFilter(string2, str11);
                        getColorsui_graphics getcolorsui_graphics2 = (getColorsui_graphics) workDatabase.IconCompatParcelizer();
                        getcolorsui_graphics2.getClass();
                        TuplesKt.write(getcolorsui_graphics2.RemoteActionCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Recomposer$$ExternalSyntheticLambda4(getcolorsui_graphics2, 13, lightingColorFilter));
                    }
                }
                outlineGenericRatingCompat = workDatabase.RatingCompat();
                string = uuid.toString();
                string.getClass();
                Set set = setrotationy.read;
                outlineGenericRatingCompat.getClass();
                set.getClass();
                it2 = set.iterator();
                while (it2.hasNext()) {
                    OutlineRectangle outlineRectangle = (OutlineRectangle) outlineGenericRatingCompat;
                    TuplesKt.write(outlineRectangle.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Recomposer$$ExternalSyntheticLambda4(outlineRectangle, 20, new OffsetEffect((String) it2.next(), string)));
                }
                if (zIsEmpty) {
                    str = str2;
                } else {
                    mapimpl mapimplVar = workDatabase.read();
                    String string3 = uuid.toString();
                    string3.getClass();
                    str = str2;
                    rotateYimpl rotateyimpl = new rotateYimpl(str, string3);
                    resetToPivotedTransformimpldefault resettopivotedtransformimpldefault = (resetToPivotedTransformimpldefault) mapimplVar;
                    resettopivotedtransformimpldefault.getClass();
                    TuplesKt.write(resettopivotedtransformimpldefault.serializer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Recomposer$$ExternalSyntheticLambda4(resettopivotedtransformimpldefault, 16, rotateyimpl));
                }
                str2 = str;
                z8 = z14;
                it = it8;
                jCurrentTimeMillis = j;
                z7 = z7;
                z2 = z2;
                z3 = z3;
            }
            z9 = true;
            z10 = z8;
            imageBitmapConfigCompanion2 = imageBitmapConfigCompanion;
            imageBitmapConfigCompanion2.serializer = z9;
            return z10;
        }
        z4 = z11;
        z5 = z;
        z6 = z4;
        z7 = z5;
        z8 = false;
        it = list.iterator();
        while (it.hasNext()) {
            setRotationY setrotationy2 = (setRotationY) it.next();
            setfrom58bkbwc = setrotationy2.IconCompatParcelizer;
            uuid = setrotationy2.RemoteActionCompatParcelizer;
            if (z6) {
                setfrom58bkbwc.ParcelableVolumeInfo = jCurrentTimeMillis;
            } else {
                setfrom58bkbwc.ParcelableVolumeInfo = jCurrentTimeMillis;
            }
            if (setfrom58bkbwc.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == setTranslationX.ENQUEUED) {
                z8 = true;
            }
            scaleimpl scaleimplVarMediaMetadataCompat3 = workDatabase.MediaMetadataCompat();
            boolean z16 = z8;
            workManagerImpl.MediaDescriptionCompat.getClass();
            Iterator it9 = it;
            zSerializer = setfrom58bkbwc.MediaSessionCompatToken.serializer("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
            long j10 = jCurrentTimeMillis;
            boolean zSerializer4 = setfrom58bkbwc.MediaSessionCompatToken.serializer("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
            boolean zSerializer5 = setfrom58bkbwc.MediaSessionCompatToken.serializer("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
            if (zSerializer) {
            }
            translateimpldefault translateimpldefaultVar5 = (translateimpldefault) scaleimplVarMediaMetadataCompat3;
            translateimpldefaultVar5.getClass();
            TuplesKt.write(translateimpldefaultVar5.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Recomposer$$ExternalSyntheticLambda4(translateimpldefaultVar5, 17, setfrom58bkbwc));
            if (z6) {
                while (i < r0) {
                    String string4 = uuid.toString();
                    string4.getClass();
                    LightingColorFilter lightingColorFilter2 = new LightingColorFilter(string4, str11);
                    getColorsui_graphics getcolorsui_graphics3 = (getColorsui_graphics) workDatabase.IconCompatParcelizer();
                    getcolorsui_graphics3.getClass();
                    TuplesKt.write(getcolorsui_graphics3.RemoteActionCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Recomposer$$ExternalSyntheticLambda4(getcolorsui_graphics3, 13, lightingColorFilter2));
                }
            }
            outlineGenericRatingCompat = workDatabase.RatingCompat();
            string = uuid.toString();
            string.getClass();
            Set set2 = setrotationy2.read;
            outlineGenericRatingCompat.getClass();
            set2.getClass();
            it2 = set2.iterator();
            while (it2.hasNext()) {
                OutlineRectangle outlineRectangle2 = (OutlineRectangle) outlineGenericRatingCompat;
                TuplesKt.write(outlineRectangle2.IconCompatParcelizer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Recomposer$$ExternalSyntheticLambda4(outlineRectangle2, 20, new OffsetEffect((String) it2.next(), string)));
            }
            if (zIsEmpty) {
                mapimpl mapimplVar2 = workDatabase.read();
                String string5 = uuid.toString();
                string5.getClass();
                str = str2;
                rotateYimpl rotateyimpl2 = new rotateYimpl(str, string5);
                resetToPivotedTransformimpldefault resettopivotedtransformimpldefault2 = (resetToPivotedTransformimpldefault) mapimplVar2;
                resettopivotedtransformimpldefault2.getClass();
                TuplesKt.write(resettopivotedtransformimpldefault2.serializer, false, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Recomposer$$ExternalSyntheticLambda4(resettopivotedtransformimpldefault2, 16, rotateyimpl2));
            } else {
                str = str2;
            }
            str2 = str;
            z8 = z16;
            it = it9;
            jCurrentTimeMillis = j10;
            z7 = z7;
            z2 = z2;
            z3 = z3;
        }
        z9 = true;
        z10 = z8;
        imageBitmapConfigCompanion2 = imageBitmapConfigCompanion;
        imageBitmapConfigCompanion2.serializer = z9;
        return z10;
    }
}
