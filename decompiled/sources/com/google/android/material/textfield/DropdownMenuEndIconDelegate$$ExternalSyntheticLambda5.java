package com.google.android.material.textfield;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.compose.ui.graphics.Fields;
import androidx.emoji2.text.EmojiProcessor;
import androidx.recyclerview.widget.ChildHelper;
import androidx.sqlite.SQLite;
import bo.app.hg$$ExternalSyntheticLambda5;
import bo.app.wg$$ExternalSyntheticLambda0;
import coil3.ImageLoader$Builder;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.core.FirestoreClient$$ExternalSyntheticLambda1;
import com.google.firebase.firestore.local.LocalDocumentsView;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Util;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.agconnect.config.impl.m;
import com.huawei.location.gwi.CarGwiFileManager;
import com.huawei.location.lite.common.util.filedownload.DownLoadFileBean;
import com.huawei.wisesecurity.ucs_credential.x;
import com.incognia.internal.C2w;
import com.incognia.internal.jx;
import com.incognia.internal.uEN;
import com.incognia.internal.yw;
import com.incognia.internal.zB6;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.crypto.PublicKeyImpl;
import com.mapbox.common.location.GoogleDeviceLocationProvider;
import com.sentiance.core.model.events.i$c;
import io.reactivex.CompletableEmitter;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import kotlin.LazyKt__LazyJVMKt;
import o.AbstractComposeViewExternalSyntheticLambda0;
import o.AccessibilityIteratorsAbstractTextSegmentIterator;
import o.InputModeCompanion;
import o.NodeCoordinatorCompanionPointerInputSource1;
import o.NodeCoordinatorKt;
import o.NodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1;
import o.OuterPlacementScope;
import o.PausedPrecompositionImpl;
import o.PinnableContainer;
import o.WrappedCompositionsetContent1211;
import o.accessdispatchGenericMotionEvents408734394;
import o.accessfindNextNonChildView;
import o.accessgetEightcp;
import o.accessgetHcp;
import o.accessgetMediaFastForwardcp;
import o.accessgetMovecp;
import o.accessgetPointerInputSourcecp;
import o.accessswap;
import o.accessupdateUnsafe;
import o.clearPlaceOrder;
import o.compareEquals;
import o.distanceInMinimumTouchTargettz77jQw;
import o.drawDebugBackground;
import o.getAlignmentLinesMap;
import o.getOnPasteRequested;
import o.getQueryParameterslambda2;
import o.getRectManager;
import o.getShouldAttachOnInsert;
import o.getTextInputService;
import o.getWrappedByui;
import o.headH91voCI;
import o.invalidateRootLayer;
import o.onEndApplyChanges;
import o.onLayoutChange;
import o.onLayoutModifierNodeChanged;
import o.onPostAttach;
import o.onRequestMeasure;
import o.onScrollCaptureStart;
import o.rectInParentuidefault;
import o.setAfter;
import o.setLastMatrixRecalculationAnimationTimeui;
import o.setWrappedui;
import o.shareWithSiblings;
import o.tailH91voCIui;
import o.toParentPosition8S9VItk;
import o.touchBoundsInRoot;
import o.updateLayerParameters;
import o.visitNodes;
import o.visitNodesaLcG6gQ;
import o.withPositionTranslation;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5 implements OnSuccessListener, Function, PinnableContainer, accessgetMediaFastForwardcp, OuterPlacementScope, onLayoutChange, AccessibilityIteratorsAbstractTextSegmentIterator, onRequestMeasure, Consumer, PausedPrecompositionImpl, getOnPasteRequested, uEN, Expected.Transformer, OnFailureListener {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(int i, Object obj) {
        this.read = i;
        this.serializer = obj;
    }

    @Override // o.AccessibilityIteratorsAbstractTextSegmentIterator
    public void RemoteActionCompatParcelizer(AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0) {
        int i = this.read;
        Object obj = this.serializer;
        if (i == 11) {
            synchronized (((getShouldAttachOnInsert) obj)) {
                if (abstractComposeViewExternalSyntheticLambda0.write() != null) {
                    throw new ClassCastException();
                }
            }
            return;
        }
        setAfter setafter = (setAfter) obj;
        synchronized (setafter) {
            if (abstractComposeViewExternalSyntheticLambda0.write() != null) {
                throw new ClassCastException();
            }
            synchronized (setafter) {
                FirestoreClient$$ExternalSyntheticLambda1 firestoreClient$$ExternalSyntheticLambda1 = setafter.IconCompatParcelizer;
                if (firestoreClient$$ExternalSyntheticLambda1 != null) {
                    synchronized (setafter) {
                        firestoreClient$$ExternalSyntheticLambda1.serializer();
                    }
                }
            }
        }
        throw null;
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        accessupdateUnsafe accessupdateunsafe;
        int i = this.read;
        Object obj2 = this.serializer;
        if (i == 4) {
            obj.getClass();
            return (accessgetMovecp) ((hg$$ExternalSyntheticLambda5) obj2).invoke(obj);
        }
        if (i != 10) {
            if (i == 14) {
                return Boolean.valueOf(((accessgetPointerInputSourcecp) obj2).IconCompatParcelizer((NodeCoordinatorCompanionPointerInputSource1) obj));
            }
            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
            nodeCoordinatorCompanionPointerInputSource1.getClass();
            int iSerializer = getQueryParameterslambda2.serializer();
            return Boolean.valueOf(!((tailH91voCIui) obj2).IconCompatParcelizer((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{nodeCoordinatorCompanionPointerInputSource1}, getQueryParameterslambda2.serializer(), -516583649, iSerializer)).isEmpty());
        }
        FirebaseFirestore firebaseFirestore = (FirebaseFirestore) obj2;
        getTextInputService gettextinputservice = (getTextInputService) obj;
        synchronized (firebaseFirestore.serializer) {
            visitNodesaLcG6gQ visitnodesalcg6gq = firebaseFirestore.MediaMetadataCompat;
            String str = firebaseFirestore.MediaBrowserCompatMediaItem;
            firebaseFirestore.RatingCompat.getClass();
            firebaseFirestore.RatingCompat.getClass();
            accessupdateunsafe = new accessupdateUnsafe(firebaseFirestore.write, new m(visitnodesalcg6gq, 3, str), firebaseFirestore.read, firebaseFirestore.RemoteActionCompatParcelizer, gettextinputservice, firebaseFirestore.MediaSessionCompatQueueItem, (i$c) firebaseFirestore.IconCompatParcelizer.apply(firebaseFirestore.RatingCompat));
        }
        return accessupdateunsafe;
    }

    @Override // com.incognia.internal.uEN
    public void BGx(boolean z, List list) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            jx.BGx((zB6) this.serializer, z, list);
            int i3 = 28 / 0;
        } else {
            jx.BGx((zB6) this.serializer, z, list);
        }
        int i4 = IconCompatParcelizer + 119;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 3;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            GoogleDeviceLocationProvider.doStop$lambda$5((GoogleDeviceLocationProvider) this.serializer, exc);
        } else {
            GoogleDeviceLocationProvider.doStop$lambda$5((GoogleDeviceLocationProvider) this.serializer, exc);
            int i3 = 47 / 0;
        }
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return PublicKeyImpl.verify$lambda$1((Signature) this.serializer, (com.mapbox.common.crypto.Signature) obj);
        }
        PublicKeyImpl.verify$lambda$1((Signature) this.serializer, (com.mapbox.common.crypto.Signature) obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.OuterPlacementScope
    public Object then(Task task) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 97;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i3 = this.read;
        Object obj2 = this.serializer;
        if (i3 != 8) {
            return (Task) ((clearPlaceOrder) obj2).call();
        }
        ((CountDownLatch) obj2).countDown();
        int i4 = RemoteActionCompatParcelizer + 55;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.PausedPrecompositionImpl
    public Task then(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 109;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        zzw zzwVarRemoteActionCompatParcelizer = LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((setLastMatrixRecalculationAnimationTimeui) this.serializer);
        int i4 = IconCompatParcelizer + 115;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zzwVarRemoteActionCompatParcelizer;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i3 = this.read;
        Object obj3 = this.serializer;
        if (i3 == 1) {
            ((hg$$ExternalSyntheticLambda5) obj3).invoke(obj);
            int i4 = RemoteActionCompatParcelizer + 17;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (i3 == 2) {
            ((InputModeCompanion) obj3).invoke(obj);
            return;
        }
        if (i3 == 3) {
            ((hg$$ExternalSyntheticLambda5) obj3).invoke(obj);
        } else if (i3 != 19) {
            C2w.BGx((yw) obj3, obj);
        } else {
            ((FirebaseMessaging) obj3).lambda$setNotificationDelegationEnabled$6((Void) obj);
        }
    }

    @Override // o.PinnableContainer
    public void onComplete(Task task) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.read;
        Object obj = this.serializer;
        if (i3 == 5) {
            CompletableEmitter completableEmitter = (CompletableEmitter) obj;
            task.getClass();
            try {
                if (task.isSuccessful()) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("GMS Push Token: deleted success", new Object[0]);
                } else {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(task.getException(), "GMS Push Token delete failed.", new Object[0]);
                }
            } catch (Exception e) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "GMS Push Token: delete failed inside listener", new Object[0]);
            }
            completableEmitter.IconCompatParcelizer();
            return;
        }
        if (i3 == 20) {
            accessfindNextNonChildView.RemoteActionCompatParcelizer((Intent) obj);
            int i4 = RemoteActionCompatParcelizer + 13;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 16 / 0;
                return;
            }
            return;
        }
        if (i3 != 21) {
            ((ScheduledFuture) obj).cancel(false);
            return;
        }
        ((accessdispatchGenericMotionEvents408734394) obj).RemoteActionCompatParcelizer.write(null);
        int i6 = IconCompatParcelizer + 47;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    @Override // o.getOnPasteRequested
    public boolean read(DownLoadFileBean downLoadFileBean) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        Object obj = this.serializer;
        if (i4 == 24) {
            boolean zLambda$checkGwiSoFile$0 = ((CarGwiFileManager) obj).lambda$checkGwiSoFile$0(downLoadFileBean);
            int i5 = RemoteActionCompatParcelizer + 33;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return zLambda$checkGwiSoFile$0;
        }
        drawDebugBackground drawdebugbackground = (drawDebugBackground) obj;
        String version = downLoadFileBean.getFileAccessInfo().getVersion();
        File file = new File(onScrollCaptureStart.RemoteActionCompatParcelizer);
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("VdrFileManager", "the file isFileExist is " + file.exists());
        if (file.exists()) {
            String str = drawdebugbackground.IconCompatParcelizer;
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("VdrFileManager", "versionNumFromServer is: " + version + ", versionNumSp is: " + str);
            if (version.compareTo(str) <= 0) {
                int i7 = RemoteActionCompatParcelizer + 99;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return false;
            }
        }
        return true;
    }

    @Override // o.accessgetMediaFastForwardcp
    public Object read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        Object obj = this.serializer;
        if (i4 != 6) {
            ImageLoader$Builder imageLoader$Builder = (ImageLoader$Builder) obj;
            SQLiteDatabase sQLiteDatabaseIconCompatParcelizer = ((SQLiteEventStore) imageLoader$Builder.IconCompatParcelizer).IconCompatParcelizer();
            sQLiteDatabaseIconCompatParcelizer.beginTransaction();
            try {
                List list = (List) SQLiteEventStore.write(sQLiteDatabaseIconCompatParcelizer.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new getAlignmentLinesMap(3));
                sQLiteDatabaseIconCompatParcelizer.setTransactionSuccessful();
                sQLiteDatabaseIconCompatParcelizer.endTransaction();
                Iterator it = list.iterator();
                while (!(!it.hasNext())) {
                    int i5 = RemoteActionCompatParcelizer + 125;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        ((EmojiProcessor) imageLoader$Builder.read).IconCompatParcelizer((accessgetEightcp) it.next(), 1, true);
                    } else {
                        ((EmojiProcessor) imageLoader$Builder.read).IconCompatParcelizer((accessgetEightcp) it.next(), 1, false);
                    }
                }
                return null;
            } catch (Throwable th) {
                sQLiteDatabaseIconCompatParcelizer.endTransaction();
                throw th;
            }
        }
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) obj;
        long jIconCompatParcelizer = sQLiteEventStore.MediaMetadataCompat.IconCompatParcelizer();
        long j = sQLiteEventStore.IconCompatParcelizer.read;
        SQLiteDatabase sQLiteDatabaseIconCompatParcelizer2 = sQLiteEventStore.IconCompatParcelizer();
        sQLiteDatabaseIconCompatParcelizer2.beginTransaction();
        try {
            String[] strArr = {String.valueOf(jIconCompatParcelizer - j)};
            Cursor cursorRawQuery = sQLiteDatabaseIconCompatParcelizer2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
            while (cursorRawQuery.moveToNext()) {
                try {
                    int i6 = IconCompatParcelizer + 73;
                    RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    sQLiteEventStore.read(cursorRawQuery.getInt(0), accessgetHcp.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                } catch (Throwable th2) {
                    cursorRawQuery.close();
                    throw th2;
                }
            }
            cursorRawQuery.close();
            int iDelete = sQLiteDatabaseIconCompatParcelizer2.delete("events", "timestamp_ms < ?", strArr);
            sQLiteDatabaseIconCompatParcelizer2.setTransactionSuccessful();
            sQLiteDatabaseIconCompatParcelizer2.endTransaction();
            return Integer.valueOf(iDelete);
        } catch (Throwable th3) {
            sQLiteDatabaseIconCompatParcelizer2.endTransaction();
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r5.serializer == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r5.RemoteActionCompatParcelizer == true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        r2 = r5.write + 1;
        r5.write = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r2 < 5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r5.RemoteActionCompatParcelizer = false;
        r1.read("fresh_install", false);
        r2 = com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5.IconCompatParcelizer + 91;
        com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5.RemoteActionCompatParcelizer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        r8 = r8.getMessagesList().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r8.hasNext() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r8.next().getIsTestCampaign() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        r5.serializer = true;
        r1.read("test_device", true);
        o.DefaultContentCardsUpdateHandlerCompanionCREATOR1.serializer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        r5 = (com.google.firebase.inappmessaging.internal.AnalyticsEventsManager) r5;
        r5.getClass();
        r1 = new java.util.HashSet();
        r8 = ((com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse) r8).getMessagesList().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if ((!r8.hasNext()) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        if (r1.size() <= 50) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        o.DefaultContentCardsUpdateHandlerCompanionCREATOR1.serializer();
        r8 = com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5.RemoteActionCompatParcelizer + 45;
        com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5.IconCompatParcelizer = r8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
    
        r1.toString();
        o.DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
        r5.write.serializer(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
    
        r2 = r8.next().getTriggeringConditionsList().iterator();
        r3 = com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5.RemoteActionCompatParcelizer + 19;
        com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5.IconCompatParcelizer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c7, code lost:
    
        if (r2.hasNext() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:
    
        r3 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        if (android.text.TextUtils.isEmpty(r3.getEvent().getName()) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dd, code lost:
    
        r1.add(r3.getEvent().getName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r1 != 17) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r1 != 17) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r5 = (com.google.android.gms.measurement.internal.zzgs) r5;
        r8 = (com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse) r8;
        r1 = (com.google.firebase.inappmessaging.internal.SharedPreferencesUtils) r5.IconCompatParcelizer;
     */
    @Override // io.reactivex.functions.Consumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void accept(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5.accept(java.lang.Object):void");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0051 A[PHI: r7
  0x0051: PHI (r7v7 o.toParentPosition8S9VItk) = (r7v6 o.toParentPosition8S9VItk), (r7v65 o.toParentPosition8S9VItk) binds: [B:10:0x004f, B:7:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0055  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.firebase.firestore.local.LocalDocumentsView] */
    @Override // o.onRequestMeasure
    public Object write() {
        toParentPosition8S9VItk toparentposition8s9vitk;
        String str;
        distanceInMinimumTouchTargettz77jQw distanceinminimumtouchtargettz77jqw;
        ?? r2;
        String str2;
        String str3;
        onLayoutModifierNodeChanged onlayoutmodifiernodechanged;
        ?? map;
        String str4;
        int i;
        HashMap map2;
        HashMap map3;
        int i2 = 2;
        int i3 = 2 % 2;
        ChildHelper childHelper = (ChildHelper) this.serializer;
        distanceInMinimumTouchTargettz77jQw distanceinminimumtouchtargettz77jqw2 = (distanceInMinimumTouchTargettz77jQw) childHelper.read;
        onLayoutModifierNodeChanged onlayoutmodifiernodechanged2 = (onLayoutModifierNodeChanged) distanceinminimumtouchtargettz77jqw2.RemoteActionCompatParcelizer.read;
        HashSet hashSet = new HashSet();
        int i4 = childHelper.IconCompatParcelizer;
        int iRemoteActionCompatParcelizer = i4;
        while (iRemoteActionCompatParcelizer > 0) {
            int i5 = RemoteActionCompatParcelizer + 37;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            Object obj = null;
            if (i5 % i2 == 0) {
                getRectManager.RemoteActionCompatParcelizer(onlayoutmodifiernodechanged2.MediaSessionCompatQueueItem, "IndexManager not started", new Object[1]);
                toparentposition8s9vitk = (toParentPosition8S9VItk) onlayoutmodifiernodechanged2.MediaDescriptionCompat.peek();
                if (toparentposition8s9vitk != null) {
                    str = toparentposition8s9vitk.IconCompatParcelizer;
                } else {
                    str = null;
                }
            } else {
                getRectManager.RemoteActionCompatParcelizer(onlayoutmodifiernodechanged2.MediaSessionCompatQueueItem, "IndexManager not started", new Object[0]);
                toparentposition8s9vitk = (toParentPosition8S9VItk) onlayoutmodifiernodechanged2.MediaDescriptionCompat.peek();
                if (toparentposition8s9vitk != null) {
                    str = toparentposition8s9vitk.IconCompatParcelizer;
                } else {
                    str = null;
                }
            }
            if (str == null) {
                break;
            }
            int i6 = IconCompatParcelizer + 61;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % i2;
            if (hashSet.contains(str)) {
                break;
            }
            onEndApplyChanges.read("IndexBackfiller", "Processing collection: %s", str);
            onLayoutModifierNodeChanged onlayoutmodifiernodechanged3 = (onLayoutModifierNodeChanged) distanceinminimumtouchtargettz77jqw2.RemoteActionCompatParcelizer.read;
            LocalDocumentsView localDocumentsView = (LocalDocumentsView) ((distanceInMinimumTouchTargettz77jQw) childHelper.MediaSessionCompatQueueItem).RemoteActionCompatParcelizer.MediaDescriptionCompat;
            Collection collectionIconCompatParcelizer = onlayoutmodifiernodechanged3.IconCompatParcelizer(str);
            getRectManager.RemoteActionCompatParcelizer(!collectionIconCompatParcelizer.isEmpty(), "minOffset was called for collection without indexes", new Object[0]);
            setWrappedui setwrappeduiRemoteActionCompatParcelizer = onLayoutModifierNodeChanged.RemoteActionCompatParcelizer(collectionIconCompatParcelizer);
            LocalDocumentsView localDocumentsView2 = (LocalDocumentsView) localDocumentsView.read;
            List listRemoteActionCompatParcelizer = localDocumentsView2.IconCompatParcelizer.RemoteActionCompatParcelizer(str);
            ChildHelper childHelper2 = childHelper;
            ArrayList arrayList = new ArrayList(listRemoteActionCompatParcelizer.size());
            Iterator it = listRemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                arrayList.add((shareWithSiblings) ((shareWithSiblings) it.next()).write(str));
            }
            if (arrayList.isEmpty()) {
                map = Collections.EMPTY_MAP;
                distanceinminimumtouchtargettz77jqw = distanceinminimumtouchtargettz77jqw2;
                r2 = localDocumentsView;
                onlayoutmodifiernodechanged = onlayoutmodifiernodechanged3;
                str2 = "IndexBackfiller";
                str3 = str;
            } else if (arrayList.size() * 9 < 900) {
                int i8 = RemoteActionCompatParcelizer + 87;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    localDocumentsView2.serializer(arrayList, setwrappeduiRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer, null, null, null);
                    throw null;
                }
                str2 = "IndexBackfiller";
                str3 = str;
                distanceinminimumtouchtargettz77jqw = distanceinminimumtouchtargettz77jqw2;
                r2 = localDocumentsView;
                onlayoutmodifiernodechanged = onlayoutmodifiernodechanged3;
                map = localDocumentsView2.serializer(arrayList, setwrappeduiRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer, null, null, null);
            } else {
                distanceinminimumtouchtargettz77jqw = distanceinminimumtouchtargettz77jqw2;
                r2 = localDocumentsView;
                onLayoutModifierNodeChanged onlayoutmodifiernodechanged4 = onlayoutmodifiernodechanged3;
                str2 = "IndexBackfiller";
                str3 = str;
                HashMap map4 = new HashMap();
                int i9 = 0;
                while (i9 < arrayList.size()) {
                    int i10 = IconCompatParcelizer + 13;
                    RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    int i12 = i9 + 100;
                    HashMap map5 = map4;
                    map5.putAll(localDocumentsView2.serializer(arrayList.subList(i9, Math.min(arrayList.size(), i12)), setwrappeduiRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer, null, null, null));
                    map4 = map5;
                    localDocumentsView2 = localDocumentsView2;
                    i9 = i12;
                    onlayoutmodifiernodechanged4 = onlayoutmodifiernodechanged4;
                }
                HashMap map6 = map4;
                onlayoutmodifiernodechanged = onlayoutmodifiernodechanged4;
                wg$$ExternalSyntheticLambda0 wg__externalsyntheticlambda0 = setWrappedui.read;
                int i13 = Util.write;
                if (map6.size() <= iRemoteActionCompatParcelizer) {
                    map = map6;
                } else {
                    ArrayList arrayList2 = new ArrayList(map6.entrySet());
                    Collections.sort(arrayList2, new rectInParentuidefault(wg__externalsyntheticlambda0, 2));
                    map = new HashMap();
                    for (int i14 = 0; i14 < iRemoteActionCompatParcelizer; i14++) {
                        map.put(((Map.Entry) arrayList2.get(i14)).getKey(), ((Map.Entry) arrayList2.get(i14)).getValue());
                    }
                }
            }
            if (iRemoteActionCompatParcelizer - map.size() > 0) {
                final x xVar = (x) r2.RemoteActionCompatParcelizer;
                int i15 = setwrappeduiRemoteActionCompatParcelizer.IconCompatParcelizer;
                int size = map.size();
                xVar.getClass();
                final HashMap map7 = new HashMap();
                final String[] strArr = new String[1];
                final String[] strArr2 = new String[1];
                final int[] iArr = new int[1];
                invalidateRootLayer invalidaterootlayer = new invalidateRootLayer();
                headH91voCI headh91voci = (headH91voCI) xVar.read;
                x xVar2 = headh91voci.read("SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?");
                str4 = str3;
                xVar2.IconCompatParcelizer((String) xVar.IconCompatParcelizer, str4, Integer.valueOf(i15), Integer.valueOf(iRemoteActionCompatParcelizer - size));
                final invalidateRootLayer invalidaterootlayer2 = invalidaterootlayer;
                HashMap map8 = map7;
                xVar2.RemoteActionCompatParcelizer(new onPostAttach() { // from class: o.isPointerInBoundsk4lQ0M
                    @Override // o.onPostAttach
                    public final void IconCompatParcelizer(Object obj2) {
                        Cursor cursor = (Cursor) obj2;
                        iArr[0] = cursor.getInt(1);
                        strArr[0] = cursor.getString(2);
                        strArr2[0] = cursor.getString(3);
                        xVar.RemoteActionCompatParcelizer(invalidaterootlayer2, map7, cursor);
                    }
                });
                i = 0;
                if (strArr[0] == null) {
                    map3 = map8;
                } else {
                    x xVar3 = headh91voci.read("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?");
                    String str5 = (String) xVar.IconCompatParcelizer;
                    String str6 = strArr[0];
                    xVar3.IconCompatParcelizer(str5, str4, str6, str6, strArr2[0], Integer.valueOf(iArr[0]));
                    Cursor cursorIconCompatParcelizer = xVar3.IconCompatParcelizer();
                    while (cursorIconCompatParcelizer.moveToNext()) {
                        try {
                            invalidateRootLayer invalidaterootlayer3 = invalidaterootlayer2;
                            HashMap map9 = map8;
                            xVar.RemoteActionCompatParcelizer(invalidaterootlayer3, map9, cursorIconCompatParcelizer);
                            map8 = map9;
                            invalidaterootlayer2 = invalidaterootlayer3;
                        } catch (Throwable th) {
                            if (cursorIconCompatParcelizer == null) {
                                throw th;
                            }
                            int i16 = IconCompatParcelizer + 117;
                            RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                            try {
                                if (i16 % 2 != 0) {
                                    cursorIconCompatParcelizer.close();
                                    int i17 = 17 / 0;
                                } else {
                                    cursorIconCompatParcelizer.close();
                                }
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    map3 = map8;
                    cursorIconCompatParcelizer.close();
                    invalidaterootlayer2.write();
                }
                map2 = map3;
            } else {
                str4 = str3;
                i = 0;
                map2 = new HashMap();
            }
            Iterator it2 = map2.values().iterator();
            int iMax = -1;
            while (!(!it2.hasNext())) {
                String str7 = str2;
                onLayoutModifierNodeChanged onlayoutmodifiernodechanged5 = onlayoutmodifiernodechanged;
                HashSet hashSet2 = hashSet;
                int i18 = IconCompatParcelizer + 115;
                RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                if (i18 % 2 != 0) {
                    map.containsKey(((NodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1) it2.next()).serializer.read);
                    obj.hashCode();
                    throw null;
                }
                NodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1 nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1 = (NodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1) it2.next();
                if (!map.containsKey(nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1.serializer.read)) {
                    NodeCoordinatorKt nodeCoordinatorKt = nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1.serializer;
                    visitNodes visitnodes = nodeCoordinatorKt.read;
                    map.put(visitnodes, nodeCoordinatorKt instanceof compareEquals ? ((LocalDocumentsView) r2.read).read(visitnodes) : NodeCoordinatorCompanionPointerInputSource1.serializer(visitnodes));
                }
                iMax = Math.max(iMax, nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1.IconCompatParcelizer);
                onlayoutmodifiernodechanged = onlayoutmodifiernodechanged5;
                str2 = str7;
                hashSet = hashSet2;
                i = 0;
            }
            r2.serializer(map2, map.keySet());
            HashMap mapIconCompatParcelizer = r2.IconCompatParcelizer(Collections.EMPTY_SET, map, map2);
            accessswap accessswapVarRemoteActionCompatParcelizer = withPositionTranslation.read;
            for (Map.Entry entry : mapIconCompatParcelizer.entrySet()) {
                accessswapVarRemoteActionCompatParcelizer = accessswapVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer((visitNodes) entry.getKey(), ((getWrappedByui) entry.getValue()).write);
            }
            onLayoutModifierNodeChanged onlayoutmodifiernodechanged6 = onlayoutmodifiernodechanged;
            onlayoutmodifiernodechanged6.RemoteActionCompatParcelizer(accessswapVarRemoteActionCompatParcelizer);
            Iterator it3 = accessswapVarRemoteActionCompatParcelizer.iterator();
            setWrappedui setwrappedui = setwrappeduiRemoteActionCompatParcelizer;
            while (it3.hasNext()) {
                int i19 = IconCompatParcelizer + 37;
                RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                setWrappedui setwrappeduiRemoteActionCompatParcelizer2 = setWrappedui.RemoteActionCompatParcelizer((NodeCoordinatorCompanionPointerInputSource1) ((Map.Entry) it3.next()).getValue());
                if (setwrappeduiRemoteActionCompatParcelizer2.compareTo(setwrappedui) > 0) {
                    setwrappedui = setwrappeduiRemoteActionCompatParcelizer2;
                }
            }
            setWrappedui setwrappedui2 = new setWrappedui(setwrappedui.serializer, setwrappedui.write, Math.max(iMax, setwrappeduiRemoteActionCompatParcelizer.IconCompatParcelizer));
            onEndApplyChanges.read(str2, "Updating offset: %s", setwrappedui2);
            getRectManager.RemoteActionCompatParcelizer(onlayoutmodifiernodechanged6.MediaSessionCompatQueueItem, "IndexManager not started", new Object[i]);
            onlayoutmodifiernodechanged6.MediaMetadataCompat++;
            for (toParentPosition8S9VItk toparentposition8s9vitk2 : onlayoutmodifiernodechanged6.IconCompatParcelizer(str4)) {
                toParentPosition8S9VItk toparentposition8s9vitk3 = new toParentPosition8S9VItk(toparentposition8s9vitk2.RemoteActionCompatParcelizer, toparentposition8s9vitk2.IconCompatParcelizer, toparentposition8s9vitk2.write, new touchBoundsInRoot(onlayoutmodifiernodechanged6.MediaMetadataCompat, setwrappedui2));
                headH91voCI headh91voci2 = onlayoutmodifiernodechanged6.serializer;
                int i21 = toparentposition8s9vitk2.RemoteActionCompatParcelizer;
                String str8 = onlayoutmodifiernodechanged6.ParcelableVolumeInfo;
                long j = onlayoutmodifiernodechanged6.MediaMetadataCompat;
                SnapshotVersion snapshotVersion = setwrappedui2.serializer;
                headh91voci2.IconCompatParcelizer("REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(i21), str8, Long.valueOf(j), Long.valueOf(snapshotVersion.read.IconCompatParcelizer), Integer.valueOf(snapshotVersion.read.RemoteActionCompatParcelizer), updateLayerParameters.write(setwrappedui2.write.RemoteActionCompatParcelizer), Integer.valueOf(setwrappedui2.IconCompatParcelizer));
                onlayoutmodifiernodechanged6.RemoteActionCompatParcelizer(toparentposition8s9vitk3);
            }
            iRemoteActionCompatParcelizer -= accessswapVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            HashSet hashSet3 = hashSet;
            hashSet3.add(str4);
            hashSet = hashSet3;
            childHelper = childHelper2;
            distanceinminimumtouchtargettz77jqw2 = distanceinminimumtouchtargettz77jqw;
            onlayoutmodifiernodechanged2 = onlayoutmodifiernodechanged2;
            i4 = i4;
            i2 = 2;
        }
        return Integer.valueOf(i4 - iRemoteActionCompatParcelizer);
    }
}
