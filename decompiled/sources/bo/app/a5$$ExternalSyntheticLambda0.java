package bo.app;

import android.content.Context;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import coil3.Extras$Key;
import coil3.util.UtilsKt;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import o.BlockInnerShadowElement;
import o.ImageBitmapConfigCompanion;
import o.ImageBitmapDefaultImpls;
import o.OutlineKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.asFrameworkPaint;
import o.createFromParcel;
import o.defaultViewModelProviderFactory_delegatelambda0;
import o.getBlueannotations;
import o.getDarkGray0d7_KjU;
import o.getPostalCode;
import o.getTransparent0d7_KjU;
import o.graphicsLayerpANQ8Wgdefault;
import o.isUnspecified8_81llAannotations;
import o.menuHostHelperlambda0;
import o.onCreateVirtualViewTranslationRequests;
import o.prepareToDraw;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.relocationOffsetfbGrOKE;
import o.setSpread;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a5$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ a5$$ExternalSyntheticLambda0(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x01bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x01c1 A[Catch: all -> 0x01d4, LOOP:3: B:84:0x0184->B:96:0x01c1, LOOP_END, TryCatch #1 {all -> 0x01d4, blocks: (B:92:0x01b2, B:93:0x01b9, B:98:0x01ca, B:96:0x01c1), top: B:139:0x01b2 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() throws Throwable {
        Object obj;
        boolean z;
        ?? r3;
        FrameworkSQLiteOpenHelper$OpenHelper frameworkSQLiteOpenHelper$OpenHelper;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        boolean z2 = false;
        boolean z3 = true;
        switch (i) {
            case 0:
                return a5.a((DelayedInitializationAnalyticsBehavior) obj2);
            case 1:
                return new menuHostHelperlambda0((defaultViewModelProviderFactory_delegatelambda0) obj2);
            case 2:
                return (AnnotatedString) obj2;
            case 3:
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) obj2;
                if (populateViewStructure_androidKtpopulate7 != null) {
                    return (List) populateViewStructure_androidKtpopulate7.getValue();
                }
                return null;
            case 4:
                TextAnnotatedStringNode textAnnotatedStringNode = (TextAnnotatedStringNode) obj2;
                textAnnotatedStringNode.ResultReceiver = null;
                SemanticsModifierNodeKt.invalidateSemantics(textAnnotatedStringNode);
                LayoutModifierNodeKt.invalidateMeasurement(textAnnotatedStringNode);
                DrawModifierNodeKt.invalidateDraw(textAnnotatedStringNode);
                return Boolean.TRUE;
            case 5:
                TextStringSimpleNode textStringSimpleNode = (TextStringSimpleNode) obj2;
                textStringSimpleNode.ParcelableVolumeInfo = null;
                SemanticsModifierNodeKt.invalidateSemantics(textStringSimpleNode);
                LayoutModifierNodeKt.invalidateMeasurement(textStringSimpleNode);
                DrawModifierNodeKt.invalidateDraw(textStringSimpleNode);
                return Boolean.TRUE;
            case 6:
                return ((getPostalCode) obj2).IconCompatParcelizer();
            case 7:
                setSpread setspread = (setSpread) obj2;
                while (true) {
                    Object obj3 = setspread.RatingCompat;
                    synchronized (obj3) {
                        try {
                            if (setspread.MediaDescriptionCompat) {
                                obj = obj3;
                                z = z2;
                            } else {
                                setspread.MediaDescriptionCompat = z3;
                                try {
                                    onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = setspread.RemoteActionCompatParcelizer;
                                    Object[] objArr = oncreatevirtualviewtranslationrequests.write;
                                    int i2 = oncreatevirtualviewtranslationrequests.read;
                                    int i3 = z2 ? 1 : 0;
                                    boolean z4 = z2;
                                    while (i3 < i2) {
                                        BlockInnerShadowElement blockInnerShadowElement = (BlockInnerShadowElement) objArr[i3];
                                        relocationOffsetfbGrOKE relocationoffsetfbgroke = blockInnerShadowElement.MediaSessionCompatQueueItem;
                                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = blockInnerShadowElement.MediaDescriptionCompat;
                                        Object[] objArr2 = relocationoffsetfbgroke.RemoteActionCompatParcelizer;
                                        long[] jArr = relocationoffsetfbgroke.IconCompatParcelizer;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i4 = z4 ? 1 : 0;
                                            boolean z5 = z4;
                                            while (true) {
                                                long j = jArr[i4];
                                                obj = obj3;
                                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i5 = 8;
                                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                                    while (r3 < i6) {
                                                        if ((j & 255) < 128) {
                                                            r3 = z5;
                                                            try {
                                                                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(objArr2[(i4 << 3) + r3]);
                                                                i5 = 8;
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                setspread.MediaDescriptionCompat = false;
                                                                throw th;
                                                            }
                                                        } else {
                                                            r3 = z5;
                                                        }
                                                        j >>= i5;
                                                        r3++;
                                                    }
                                                    if (i6 != i5) {
                                                        r3 = z5;
                                                    } else if (i4 != length) {
                                                        i4++;
                                                        obj3 = obj;
                                                        z5 = false;
                                                    }
                                                } else if (i4 != length) {
                                                    i4++;
                                                    obj3 = obj;
                                                    z5 = false;
                                                }
                                            }
                                        } else {
                                            obj = obj3;
                                        }
                                        relocationoffsetfbgroke.serializer();
                                        i3++;
                                        obj3 = obj;
                                        z4 = false;
                                    }
                                    obj = obj3;
                                    try {
                                        setspread.MediaDescriptionCompat = z4;
                                        z = false;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj = obj3;
                                }
                            }
                            if (!setspread.write()) {
                                return createFromParcel.INSTANCE;
                            }
                            z3 = true;
                            z2 = z;
                        } catch (Throwable th4) {
                            th = th4;
                            obj = obj3;
                        }
                    }
                }
                break;
            case 8:
                return prepareToDraw.serializer((asFrameworkPaint) obj2);
            case 9:
                RoomDatabase roomDatabase = ((InvalidationTracker) obj2).read;
                return Boolean.valueOf(!roomDatabase.inCompatibilityMode() || roomDatabase.isOpenInternal$room_runtime());
            case 10:
                return ((Callable) obj2).call();
            case 11:
                getBlueannotations getblueannotations = (getBlueannotations) obj2;
                return getblueannotations.write.read(getblueannotations.IconCompatParcelizer);
            case 12:
                getTransparent0d7_KjU gettransparent0d7_kju = (getTransparent0d7_KjU) obj2;
                gettransparent0d7_kju.getLifecycle().IconCompatParcelizer(new getDarkGray0d7_KjU(gettransparent0d7_kju, z2 ? 1 : 0));
                return createFromParcel.INSTANCE;
            case 13:
                isUnspecified8_81llAannotations isunspecified8_81llaannotations = (isUnspecified8_81llAannotations) obj2;
                String str = isunspecified8_81llaannotations.serializer;
                if (str == null || !isunspecified8_81llaannotations.MediaSessionCompatQueueItem) {
                    frameworkSQLiteOpenHelper$OpenHelper = new FrameworkSQLiteOpenHelper$OpenHelper(isunspecified8_81llaannotations.write, isunspecified8_81llaannotations.serializer, new Extras$Key(), isunspecified8_81llaannotations.IconCompatParcelizer, isunspecified8_81llaannotations.read);
                } else {
                    Context context = isunspecified8_81llaannotations.write;
                    context.getClass();
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    frameworkSQLiteOpenHelper$OpenHelper = new FrameworkSQLiteOpenHelper$OpenHelper(isunspecified8_81llaannotations.write, new File(noBackupFilesDir, str).getAbsolutePath(), new Extras$Key(), isunspecified8_81llaannotations.IconCompatParcelizer, isunspecified8_81llaannotations.read);
                }
                frameworkSQLiteOpenHelper$OpenHelper.setWriteAheadLoggingEnabled(isunspecified8_81llaannotations.MediaDescriptionCompat);
                return frameworkSQLiteOpenHelper$OpenHelper;
            case 14:
                ImageBitmapConfigCompanion imageBitmapConfigCompanion = (ImageBitmapConfigCompanion) obj2;
                String str2 = OutlineKt.RemoteActionCompatParcelizer;
                WorkManagerImpl workManagerImpl = imageBitmapConfigCompanion.MediaMetadataCompat;
                HashSet hashSet = new HashSet();
                hashSet.addAll(imageBitmapConfigCompanion.IconCompatParcelizer);
                HashSet hashSetSerializer = ImageBitmapConfigCompanion.serializer(imageBitmapConfigCompanion);
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    if (hashSetSerializer.contains((String) it.next())) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("WorkContinuation has cycles (", imageBitmapConfigCompanion, ")");
                        return null;
                    }
                }
                hashSet.removeAll(imageBitmapConfigCompanion.IconCompatParcelizer);
                WorkDatabase workDatabase = workManagerImpl.PlaybackStateCompat;
                graphicsLayerpANQ8Wgdefault graphicslayerpanq8wgdefault = workManagerImpl.write;
                workDatabase.beginTransaction();
                try {
                    UtilsKt.read(workDatabase, graphicslayerpanq8wgdefault, imageBitmapConfigCompanion);
                    boolean zSerializer = OutlineKt.serializer(imageBitmapConfigCompanion);
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    if (zSerializer) {
                        ImageBitmapDefaultImpls.RemoteActionCompatParcelizer(graphicslayerpanq8wgdefault, workManagerImpl.PlaybackStateCompat, workManagerImpl.MediaDescriptionCompat);
                    }
                    return createFromParcel.INSTANCE;
                } catch (Throwable th5) {
                    workDatabase.endTransaction();
                    throw th5;
                }
            case 15:
                return g5.a((g5) obj2);
            case 16:
                return ih.a((ih) obj2);
            case 17:
                return k7.a((rd) obj2);
            case 18:
                return l2.c((l2) obj2);
            case 19:
                return o6.b((s9) obj2);
            case 20:
                return o6.a((r9) obj2);
            case 21:
                return r6.a((Exception) obj2);
            case 22:
                return u7.a((Map.Entry) obj2);
            case 23:
                return v5.a((zd) obj2);
            case 24:
                return vb.a((vb) obj2);
            case 25:
                return vb.a((wb) obj2);
            case 26:
                return vg.e((ch) obj2);
            case 27:
                return vg.a((LinkedHashMap) obj2);
            case 28:
                return w7.a((u9) obj2);
            default:
                return zg.b((Map) obj2);
        }
    }
}
