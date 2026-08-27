package androidx.work;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.view.ActionMode;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.recyclerview.widget.ChildHelper;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import coil3.ComponentRegistry$Builder;
import coil3.disk.DiskLruCache$Editor;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.local.LocalDocumentsView;
import com.google.mlkit.vision.face.internal.zzm;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.locationSdk.k1;
import com.huawei.hms.locationSdk.l1;
import com.huawei.hms.locationSdk.w0;
import com.huawei.location.logic.zp;
import com.huawei.wisesecurity.ucs_credential.x;
import com.sentiance.core.model.events.I$b;
import io.reactivex.disposables.Disposable;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Semaphore;
import o.ActualLinearGradientShaderVjE6UOU;
import o.NodeCoordinatorKt;
import o.NodeCoordinatorupdateLayerParameters1;
import o.ParentDataModifierDefaultImpls;
import o.TransformOrigin;
import o.accessassignFocus3ESFkO8;
import o.accessdispatchGenericMotionEvents408734394;
import o.accessgetDrawBlockCanvasp;
import o.accessgetMirrorcp;
import o.accessupdateUnsafe;
import o.ancestorToLocalS_NoaFU;
import o.asList;
import o.clearChildFocusdefault;
import o.colorResource;
import o.component5kKHJgLs;
import o.containsAll;
import o.createInAppMessageEventSubscriber;
import o.decrementKeepScreenOnCount;
import o.div7Ah8Wj8;
import o.fetchFocusRectuidefault;
import o.findCommonAncestorui;
import o.getAccessibilityManager;
import o.getBt2020;
import o.getDisplayCutout;
import o.getLastLayerDrawingWasSkippedui;
import o.getMinimumTouchTargetSizeNHjbRc;
import o.getRectManager;
import o.getTextInputService;
import o.headH91voCI;
import o.incrementSensitiveComponentCount;
import o.movegyyYBs;
import o.onEndApplyChanges;
import o.onPreAttach;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeIf;
import o.reuseLayer;
import o.scaledRadiiRect;
import o.setForcePlaceWithLookaheadOffsetui;
import o.setOffset;
import o.setOwnerScopeui;
import o.toRectuvyYCjk;
import o.visitNodes;
import o.visitScrollCaptureCandidates;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RxWorker$1$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ RxWorker$1$$ExternalSyntheticLambda0(int i, Object obj) {
        this.serializer = i;
        this.write = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        Object obj = this.write;
        int i2 = 2;
        int i3 = 0;
        char c = 1;
        switch (i) {
            case 0:
                ((Disposable) obj).dispose();
                return;
            case 1:
                ActionMode actionMode = ((AndroidTextContextMenuToolbarProvider) obj).read;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 2:
                setOwnerScopeui.setRippleState$lambda$1((setOwnerScopeui) obj);
                return;
            case 3:
                TextInputServiceAndroid.sendInputCommand$lambda$0((TextInputServiceAndroid) obj);
                return;
            case 4:
                fetchFocusRectuidefault fetchfocusrectuidefault = ((accessassignFocus3ESFkO8) obj).serializer;
                ViewParent parent = fetchfocusrectuidefault.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(fetchfocusrectuidefault);
                    return;
                }
                return;
            case 5:
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((createInAppMessageEventSubscriber) obj).IconCompatParcelizer;
                if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                    return;
                }
                return;
            case 6:
                toRectuvyYCjk.RemoteActionCompatParcelizer(4, (ArrayList) obj);
                return;
            case 7:
                scaledRadiiRect scaledradiirect = (scaledRadiiRect) obj;
                div7Ah8Wj8.RemoteActionCompatParcelizer(2);
                Iterator it = scaledradiirect.ParcelableVolumeInfo.iterator();
                while (it.hasNext()) {
                    ((component5kKHJgLs) it.next()).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(scaledradiirect);
                }
                return;
            case 8:
                Iterator it2 = ((div7Ah8Wj8) obj).write.iterator();
                while (it2.hasNext()) {
                    ((ActualLinearGradientShaderVjE6UOU) it2.next()).getClass();
                }
                return;
            case 9:
                int[] iArr = SwipeRefreshLayout.read;
                ((SwipeRefreshLayout) obj).write();
                return;
            case 10:
                accessgetMirrorcp accessgetmirrorcp = (accessgetMirrorcp) obj;
                Semaphore semaphore = accessgetmirrorcp.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                getBt2020 getbt2020 = accessgetmirrorcp.PlaybackStateCompat;
                if (getbt2020 == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    getbt2020.serializer(accessgetmirrorcp.RemoteActionCompatParcelizer.serializer());
                    break;
                } catch (InterruptedException unused) {
                } finally {
                    semaphore.release();
                }
                return;
            case 11:
                ((TransformOrigin) obj).serializer();
                return;
            case 12:
                ((WebView) obj).requestFocus();
                return;
            case 13:
                ((DiskLruCache$Editor) obj).read = false;
                return;
            case 14:
                visitScrollCaptureCandidates visitscrollcapturecandidates = (visitScrollCaptureCandidates) obj;
                visitscrollcapturecandidates.write = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) visitscrollcapturecandidates.RemoteActionCompatParcelizer;
                clearChildFocusdefault clearchildfocusdefault = sideSheetBehavior.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                if (clearchildfocusdefault != null && clearchildfocusdefault.write()) {
                    visitscrollcapturecandidates.serializer(visitscrollcapturecandidates.read);
                    return;
                } else {
                    if (sideSheetBehavior.ResultReceiver == 2) {
                        sideSheetBehavior.serializer(visitscrollcapturecandidates.read);
                        return;
                    }
                    return;
                }
            case 15:
                ((containsAll) obj).RemoteActionCompatParcelizer(true);
                return;
            case 16:
                removeIf removeif = (removeIf) obj;
                boolean zIsPopupShowing = removeif.serializer.isPopupShowing();
                removeif.serializer(zIsPopupShowing);
                removeif.MediaDescriptionCompat = zIsPopupShowing;
                return;
            case 17:
                ((getDisplayCutout) obj).serializer();
                return;
            case 18:
                accessupdateUnsafe accessupdateunsafe = (accessupdateUnsafe) obj;
                setOffset setoffset = setOffset.write;
                getRectManager.RemoteActionCompatParcelizer(accessupdateunsafe.RatingCompat != null, "SyncEngine not yet initialized", new Object[0]);
                onEndApplyChanges.read("FirestoreClient", "Credential changed. Current user: %s", null);
                ancestorToLocalS_NoaFU ancestortolocals_noafu = accessupdateunsafe.RatingCompat;
                boolean zEquals = ancestortolocals_noafu.IconCompatParcelizer.equals(setoffset);
                ancestortolocals_noafu.IconCompatParcelizer = setoffset;
                if (!zEquals) {
                    HashMap map = ancestortolocals_noafu.MediaMetadataCompat;
                    Iterator it3 = map.entrySet().iterator();
                    while (it3.hasNext()) {
                        for (ParentDataModifierDefaultImpls parentDataModifierDefaultImpls : (List) ((Map.Entry) it3.next()).getValue()) {
                            FirebaseFirestoreException.IconCompatParcelizer iconCompatParcelizer = FirebaseFirestoreException.IconCompatParcelizer.CANCELLED;
                            FirebaseFirestoreException firebaseFirestoreException = new FirebaseFirestoreException("'waitForPendingWrites' task is cancelled due to User change.");
                            getRectManager.RemoteActionCompatParcelizer(iconCompatParcelizer != FirebaseFirestoreException.IconCompatParcelizer.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
                            onPreAttach.serializer(iconCompatParcelizer, "Provided code must not be null.");
                            parentDataModifierDefaultImpls.RemoteActionCompatParcelizer(firebaseFirestoreException);
                        }
                    }
                    map.clear();
                    I$b i$b = ancestortolocals_noafu.MediaSessionCompatQueueItem;
                    getMinimumTouchTargetSizeNHjbRc getminimumtouchtargetsizenhjbrc = (getMinimumTouchTargetSizeNHjbRc) i$b.IconCompatParcelizer;
                    List listSerializer = ((ChildHelper) i$b.serializer).serializer();
                    i$b.IconCompatParcelizer(setoffset);
                    getminimumtouchtargetsizenhjbrc.read(new findCommonAncestorui(i$b, i3), "Start IndexManager");
                    getminimumtouchtargetsizenhjbrc.read(new findCommonAncestorui(i$b, c == true ? 1 : 0), "Start MutationQueue");
                    List listSerializer2 = ((ChildHelper) i$b.serializer).serializer();
                    asList aslistIconCompatParcelizer = visitNodes.IconCompatParcelizer;
                    Iterator it4 = Arrays.asList(listSerializer, listSerializer2).iterator();
                    while (it4.hasNext()) {
                        Iterator it5 = ((List) it4.next()).iterator();
                        while (it5.hasNext()) {
                            Iterator it6 = ((NodeCoordinatorupdateLayerParameters1) it5.next()).serializer.iterator();
                            while (it6.hasNext()) {
                                aslistIconCompatParcelizer = aslistIconCompatParcelizer.IconCompatParcelizer(((NodeCoordinatorKt) it6.next()).read);
                            }
                        }
                    }
                    ancestortolocals_noafu.serializer(((LocalDocumentsView) i$b.MediaDescriptionCompat).serializer(aslistIconCompatParcelizer), (DropShadowEffect) null);
                }
                getAccessibilityManager getaccessibilitymanager = ancestortolocals_noafu.PlaybackStateCompatCustomAction;
                if (getaccessibilitymanager.write) {
                    onEndApplyChanges.read("RemoteStore", "Restarting streams for new credential.", new Object[0]);
                    getaccessibilitymanager.serializer();
                    return;
                }
                return;
            case 19:
                colorResource colorresource = (colorResource) obj;
                ChildHelper childHelper = (ChildHelper) colorresource.write;
                Integer num = (Integer) ((getMinimumTouchTargetSizeNHjbRc) childHelper.write).write("Backfill Indexes", new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(13, childHelper));
                num.getClass();
                onEndApplyChanges.read("IndexBackfiller", "Documents written: %s", num);
                ((getTextInputService) colorresource.IconCompatParcelizer).serializer(incrementSensitiveComponentCount.INDEX_BACKFILL, 60000L, new RxWorker$1$$ExternalSyntheticLambda0(19, colorresource));
                return;
            case 20:
                DiskLruCache$Editor diskLruCache$Editor = (DiskLruCache$Editor) obj;
                I$b i$b2 = (I$b) diskLruCache$Editor.RemoteActionCompatParcelizer;
                diskLruCache$Editor.read = true;
                ((getTextInputService) diskLruCache$Editor.write).serializer(incrementSensitiveComponentCount.GARBAGE_COLLECTION, 300000L, new RxWorker$1$$ExternalSyntheticLambda0(20, diskLruCache$Editor));
                return;
            case 21:
                Boolean[] boolArr = {Boolean.FALSE};
                headH91voCI headh91voci = (headH91voCI) ((getLastLayerDrawingWasSkippedui) obj).read;
                headh91voci.read("SELECT migration_name FROM data_migrations").RemoteActionCompatParcelizer(new setForcePlaceWithLookaheadOffsetui(i2, boolArr));
                if (boolArr[0].booleanValue()) {
                    HashSet hashSet = new HashSet();
                    Cursor cursorIconCompatParcelizer = headh91voci.read("SELECT DISTINCT uid FROM mutation_queues").IconCompatParcelizer();
                    while (cursorIconCompatParcelizer.moveToNext()) {
                        try {
                            hashSet.add(cursorIconCompatParcelizer.getString(0));
                        } catch (Throwable th) {
                            if (cursorIconCompatParcelizer != null) {
                                try {
                                    cursorIconCompatParcelizer.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                break;
                            }
                            throw th;
                        }
                    }
                    cursorIconCompatParcelizer.close();
                    LocalDocumentsView localDocumentsView = headh91voci.read;
                    Iterator it7 = hashSet.iterator();
                    while (it7.hasNext()) {
                        setOffset setoffset2 = new setOffset((String) it7.next());
                        ChildHelper childHelperWrite = headh91voci.write(setoffset2, headh91voci.serializer(setoffset2));
                        HashSet hashSet2 = new HashSet();
                        Iterator it8 = ((ArrayList) childHelperWrite.serializer()).iterator();
                        while (it8.hasNext()) {
                            hashSet2.addAll(((NodeCoordinatorupdateLayerParameters1) it8.next()).IconCompatParcelizer());
                        }
                        new LocalDocumentsView(localDocumentsView, childHelperWrite, headh91voci.RemoteActionCompatParcelizer(setoffset2), headh91voci.serializer(setoffset2)).write(localDocumentsView.write(hashSet2));
                    }
                    headh91voci.IconCompatParcelizer("DELETE FROM data_migrations WHERE migration_name = ?", "BUILD_OVERLAYS");
                    return;
                }
                return;
            case 22:
                reuseLayer reuselayer = (reuseLayer) ((zp) obj).IconCompatParcelizer;
                onEndApplyChanges.read(reuselayer.getClass().getSimpleName(), "(%x) Stream is open", Integer.valueOf(System.identityHashCode(reuselayer)));
                reuselayer.MediaSessionCompatToken = decrementKeepScreenOnCount.Open;
                reuselayer.MediaSessionCompatQueueItem.read();
                if (reuselayer.serializer == null) {
                    reuselayer.serializer = reuselayer.MediaSessionCompatResultReceiverWrapper.serializer(reuselayer.MediaBrowserCompatMediaItem, DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, new movegyyYBs(reuselayer, 1));
                    return;
                }
                return;
            case 23:
                zzm zzmVar = (zzm) obj;
                zzmVar.read = null;
                getRectManager.RemoteActionCompatParcelizer(((accessgetDrawBlockCanvasp) zzmVar.IconCompatParcelizer) == accessgetDrawBlockCanvasp.UNKNOWN, "Timer should be canceled if we transitioned to a different state.", new Object[0]);
                Locale locale = Locale.ENGLISH;
                zzmVar.read("Backend didn't respond within 10 seconds\n");
                zzmVar.read(accessgetDrawBlockCanvasp.OFFLINE);
                return;
            case 24:
                Throwable th3 = (Throwable) obj;
                if (!(th3 instanceof OutOfMemoryError)) {
                    throw new RuntimeException("Internal error in Cloud Firestore (26.1.1).", th3);
                }
                OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (26.1.1) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
                outOfMemoryError.initCause(th3);
                throw outOfMemoryError;
            case 25:
                x xVar = (x) obj;
                ((getTextInputService) xVar.IconCompatParcelizer).IconCompatParcelizer();
                if (((ScheduledFuture) xVar.RemoteActionCompatParcelizer) != null) {
                    xVar.serializer();
                    ((Runnable) xVar.read).run();
                    return;
                }
                return;
            case 26:
                ComponentRegistry$Builder componentRegistry$Builder = (ComponentRegistry$Builder) obj;
                synchronized (((ArrayDeque) componentRegistry$Builder.IconCompatParcelizer)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) componentRegistry$Builder.write).edit();
                    String str = (String) componentRegistry$Builder.read;
                    StringBuilder sb = new StringBuilder();
                    Iterator it9 = ((ArrayDeque) componentRegistry$Builder.IconCompatParcelizer).iterator();
                    while (it9.hasNext()) {
                        sb.append((String) it9.next());
                        sb.append((String) componentRegistry$Builder.RemoteActionCompatParcelizer);
                    }
                    editorEdit.putString(str, sb.toString()).commit();
                    break;
                }
                return;
            case 27:
                accessdispatchGenericMotionEvents408734394 accessdispatchgenericmotionevents408734394 = (accessdispatchGenericMotionEvents408734394) obj;
                SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Service took too long to process intent: " + accessdispatchgenericmotionevents408734394.read.getAction() + " finishing.");
                accessdispatchgenericmotionevents408734394.RemoteActionCompatParcelizer.write(null);
                return;
            case 28:
                l1.b((LocationResult) obj);
                return;
            default:
                w0.a((k1) obj);
                return;
        }
    }
}
