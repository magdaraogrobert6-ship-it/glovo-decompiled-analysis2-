package com.deliveryhero.perseus.data.local;

import android.content.Context;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.heatmap.data.HeatmapDataStore$set$2;
import com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import o.BackspaceCommand;
import o.FocusTransactionsKt;
import o.ShortNewsContentCardView;
import o.backwardFocusSearch;
import o.createBrazeUserChangeEventSubscriberlambda00;
import o.createInAppMessageEventSubscriber;
import o.curveTo;
import o.curveToRelative;
import o.displayInAppMessagelambda1;
import o.generateImageVectorIdui;
import o.getNoActiveChildannotations;
import o.getNodes;
import o.horizontalLineTo;
import o.isRoot;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.registerInAppMessageManagerlambda2;

/* JADX INFO: loaded from: classes2.dex */
public final class UnencryptedSharedPreferencesLocalStorage implements generateImageVectorIdui {
    public static final /* synthetic */ registerInAppMessageManagerlambda2[] write;
    public final Context IconCompatParcelizer;
    public final FocusTransactionsKt serializer;

    @Override // o.generateImageVectorIdui
    public final Object RemoteActionCompatParcelizer(long j, String str, ContinuationImpl continuationImpl) {
        isRoot isroot = new isRoot(str);
        Long l = new Long(j);
        return pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) this.serializer.getValue(this.IconCompatParcelizer, write[0]), new HeatmapDataStore$set$2(isroot, l, null, 1), continuationImpl);
    }

    @Override // o.generateImageVectorIdui
    public final Object serializer(String str, String str2, ContinuationImpl continuationImpl) {
        isRoot isroot = new isRoot(str);
        return pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) this.serializer.getValue(this.IconCompatParcelizer, write[0]), new HeatmapDataStore$set$2(isroot, str2, null, 1), continuationImpl);
    }

    public UnencryptedSharedPreferencesLocalStorage(Context context) {
        context.getClass();
        this.IconCompatParcelizer = context;
        this.serializer = DelayKt.write("perseus-sdk-pref", null, null, 14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.generateImageVectorIdui
    public final Object getLong(long j, String str, ContinuationImpl continuationImpl) {
        curveToRelative curvetorelative;
        if (continuationImpl instanceof curveToRelative) {
            curvetorelative = (curveToRelative) continuationImpl;
            int i = curvetorelative.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                curvetorelative.read = i - Integer.MIN_VALUE;
            } else {
                curvetorelative = new curveToRelative(this, continuationImpl);
            }
        } else {
            curvetorelative = new curveToRelative(this, continuationImpl);
        }
        Object longOrNull = curvetorelative.write;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = curvetorelative.read;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(longOrNull);
            curvetorelative.serializer = j;
            curvetorelative.read = 1;
            longOrNull = getLongOrNull(str, curvetorelative);
            if (longOrNull == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = curvetorelative.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(longOrNull);
        }
        Long l = (Long) longOrNull;
        if (l != null) {
            j = l.longValue();
        }
        return new Long(j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getLongOrNull(String str, ContinuationImpl continuationImpl) {
        horizontalLineTo horizontallineto;
        if (continuationImpl instanceof horizontalLineTo) {
            horizontallineto = (horizontalLineTo) continuationImpl;
            int i = horizontallineto.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                horizontallineto.write = i - Integer.MIN_VALUE;
            } else {
                horizontallineto = new horizontalLineTo(this, continuationImpl);
            }
        } else {
            horizontallineto = new horizontalLineTo(this, continuationImpl);
        }
        Object objFirstOrNull = horizontallineto.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = horizontallineto.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            horizontallineto.serializer = str;
            horizontallineto.write = 1;
            objFirstOrNull = FlowKt.firstOrNull(((performCustomExitMxy_nc0) this.serializer.getValue(this.IconCompatParcelizer, write[0])).serializer(), horizontallineto);
            if (objFirstOrNull == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = horizontallineto.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        }
        getNoActiveChildannotations getnoactivechildannotations = (getNoActiveChildannotations) objFirstOrNull;
        if (getnoactivechildannotations == null) {
            return null;
        }
        int iWrite = BackspaceCommand.write();
        return (Long) ((backwardFocusSearch) getnoactivechildannotations).RemoteActionCompatParcelizer.get((isRoot) RangesKt.read(-1579077835, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{str}, BackspaceCommand.write(), 1579077836, iWrite));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getOrPut(isRoot isroot, Object obj, ContinuationImpl continuationImpl) {
        curveTo curveto;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        if (continuationImpl instanceof curveTo) {
            curveto = (curveTo) continuationImpl;
            int i = curveto.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                curveto.read = i - Integer.MIN_VALUE;
            } else {
                curveto = new curveTo(this, continuationImpl);
            }
        } else {
            curveto = new curveTo(this, continuationImpl);
        }
        Object obj2 = curveto.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = curveto.read;
        if (i2 == 0) {
            createInAppMessageEventSubscriber createinappmessageeventsubscriberM3979m = c8$$ExternalSyntheticOutline0.m3979m(obj2);
            createinappmessageeventsubscriberM3979m.IconCompatParcelizer = obj;
            performCustomExitMxy_nc0 performcustomexitmxy_nc0 = (performCustomExitMxy_nc0) this.serializer.getValue(this.IconCompatParcelizer, write[0]);
            SideMenuCacheImpl.AnonymousClass2 anonymousClass2 = new SideMenuCacheImpl.AnonymousClass2(isroot, obj, (Object) createinappmessageeventsubscriberM3979m, (ShortNewsContentCardView) null, 3);
            curveto.IconCompatParcelizer = createinappmessageeventsubscriberM3979m;
            curveto.read = 1;
            if (pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0, anonymousClass2, curveto) == coroutineSingletons) {
                return coroutineSingletons;
            }
            createinappmessageeventsubscriber = createinappmessageeventsubscriberM3979m;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            createinappmessageeventsubscriber = curveto.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        }
        return createinappmessageeventsubscriber.IconCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.generateImageVectorIdui
    public final Object getString(String str, ContinuationImpl continuationImpl) {
        getNodes getnodes;
        if (continuationImpl instanceof getNodes) {
            getnodes = (getNodes) continuationImpl;
            int i = getnodes.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                getnodes.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                getnodes = new getNodes(this, continuationImpl);
            }
        } else {
            getnodes = new getNodes(this, continuationImpl);
        }
        Object objFirstOrNull = getnodes.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getnodes.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            getnodes.read = str;
            getnodes.RemoteActionCompatParcelizer = 1;
            objFirstOrNull = FlowKt.firstOrNull(((performCustomExitMxy_nc0) this.serializer.getValue(this.IconCompatParcelizer, write[0])).serializer(), getnodes);
            if (objFirstOrNull == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = getnodes.read;
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        }
        getNoActiveChildannotations getnoactivechildannotations = (getNoActiveChildannotations) objFirstOrNull;
        if (getnoactivechildannotations == null) {
            return null;
        }
        int iWrite = BackspaceCommand.write();
        return (String) ((backwardFocusSearch) getnoactivechildannotations).RemoteActionCompatParcelizer.get((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{str}, BackspaceCommand.write(), -220732894, iWrite));
    }

    static {
        createBrazeUserChangeEventSubscriberlambda00 createbrazeuserchangeeventsubscriberlambda00 = new createBrazeUserChangeEventSubscriberlambda00(UnencryptedSharedPreferencesLocalStorage.class, "perseusDataStore", "getPerseusDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        displayInAppMessagelambda1.IconCompatParcelizer.getClass();
        write = new registerInAppMessageManagerlambda2[]{createbrazeuserchangeeventsubscriberlambda00};
    }
}
