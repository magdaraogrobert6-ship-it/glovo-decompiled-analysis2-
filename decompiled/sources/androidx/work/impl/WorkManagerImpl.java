package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.navigation.Navigator$$ExternalSyntheticLambda1;
import androidx.sqlite.SQLite;
import androidx.work.impl.Schedulers$$ExternalSyntheticLambda1;
import androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1;
import coil3.memory.MemoryCacheService;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.logger.logger.perseus.buffer.EventsBufferImpl$1$1;
import java.util.List;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.internal.ContextScope;
import o.ImageBitmapConfigCompanion;
import o.ImageBitmapDefaultImpls;
import o.ImageBitmapKt;
import o.ShortNewsContentCardView;
import o.accessgetF16cp;
import o.accessgetIntersectcp;
import o.accessgetStrokecp;
import o.accesssetColorFilterjd;
import o.drawOutlinehn5TExgdefault;
import o.getClipannotations;
import o.getDefaultShadowColor;
import o.getDifferencertfAjoo;
import o.getEmptyInterval;
import o.getQueryParameterslambda2;
import o.getRoundRect;
import o.graphicsLayerpANQ8Wgdefault;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.rememberGraphicsLayer;
import o.scaleimpl;
import o.setRotationX;
import o.setRotationY;
import o.sourceInformationContextOfdefault;
import o.translateimpldefault;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerImpl {
    public static final Object RemoteActionCompatParcelizer;
    public static WorkManagerImpl read;
    public static WorkManagerImpl serializer;
    public final Context IconCompatParcelizer;
    public final MemoryCacheService MediaBrowserCompatMediaItem;
    public final List MediaDescriptionCompat;
    public final getDefaultShadowColor MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem = false;
    public final accessgetStrokecp MediaSessionCompatToken;
    public final getEmptyInterval ParcelableVolumeInfo;
    public final WorkDatabase PlaybackStateCompat;
    public BroadcastReceiver.PendingResult RatingCompat;
    public final graphicsLayerpANQ8Wgdefault write;

    static {
        setRotationX.IconCompatParcelizer("WorkManagerImpl");
        serializer = null;
        read = null;
        RemoteActionCompatParcelizer = new Object();
    }

    public static WorkManagerImpl RemoteActionCompatParcelizer(Context context) {
        WorkManagerImpl workManagerImpl;
        Object obj = RemoteActionCompatParcelizer;
        synchronized (obj) {
            synchronized (obj) {
                workManagerImpl = serializer;
                if (workManagerImpl == null) {
                    workManagerImpl = read;
                }
            }
            return workManagerImpl;
        }
        if (workManagerImpl != null) {
            return workManagerImpl;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public static void serializer(Context context, graphicsLayerpANQ8Wgdefault graphicslayerpanq8wgdefault) {
        synchronized (RemoteActionCompatParcelizer) {
            WorkManagerImpl workManagerImpl = serializer;
            if (workManagerImpl != null && read != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (workManagerImpl == null) {
                Context applicationContext = context.getApplicationContext();
                if (read == null) {
                    read = DelayKt.RemoteActionCompatParcelizer(applicationContext, graphicslayerpanq8wgdefault);
                }
                serializer = read;
            }
        }
    }

    public final Flow IconCompatParcelizer(String str) {
        scaleimpl scaleimplVarMediaMetadataCompat = this.PlaybackStateCompat.MediaMetadataCompat();
        CoroutineDispatcher coroutineDispatcher = this.MediaSessionCompatToken.serializer;
        scaleimplVarMediaMetadataCompat.getClass();
        coroutineDispatcher.getClass();
        translateimpldefault translateimpldefaultVar = (translateimpldefault) scaleimplVarMediaMetadataCompat;
        return FlowKt.RemoteActionCompatParcelizer(FlowKt.serializer(new WorkSpecDaoKt$dedup$$inlined$map$1(0, DelayKt.RemoteActionCompatParcelizer(translateimpldefaultVar.IconCompatParcelizer, true, new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, new Navigator$$ExternalSyntheticLambda1(str, 20, translateimpldefaultVar)))), coroutineDispatcher);
    }

    public final void read() {
        synchronized (RemoteActionCompatParcelizer) {
            this.MediaSessionCompatQueueItem = true;
            BroadcastReceiver.PendingResult pendingResult = this.RatingCompat;
            if (pendingResult != null) {
                pendingResult.finish();
                this.RatingCompat = null;
            }
        }
    }

    public final void serializer() {
        getClipannotations getclipannotations = this.write.PlaybackStateCompatCustomAction;
        ImageBitmapKt imageBitmapKt = new ImageBitmapKt(this, 0);
        getclipannotations.getClass();
        int i = sourceInformationContextOfdefault.read();
        int i2 = sourceInformationContextOfdefault.read();
        int i3 = sourceInformationContextOfdefault.read();
        boolean zBooleanValue = ((Boolean) r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(-1240730099, i, i2, 1240730100, sourceInformationContextOfdefault.read(), new Object[0], i3)).booleanValue();
        if (zBooleanValue) {
            try {
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("ReschedulingWork");
            } finally {
                if (zBooleanValue) {
                    Trace.endSection();
                }
            }
        }
        imageBitmapKt.invoke();
    }

    public final getClipannotations RemoteActionCompatParcelizer(setRotationY setrotationy) {
        setrotationy.getClass();
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        List list = (List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{setrotationy}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
        if (!list.isEmpty()) {
            return new ImageBitmapConfigCompanion(this, null, accesssetColorFilterjd.KEEP, list, 0).write();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("enqueue needs at least one WorkRequest.");
        return null;
    }

    public final getClipannotations serializer(String str, accesssetColorFilterjd accesssetcolorfilterjd, setRotationY setrotationy) {
        accesssetcolorfilterjd.getClass();
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        return new ImageBitmapConfigCompanion(this, str, accesssetcolorfilterjd, (List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{setrotationy}, getQueryParameterslambda2.serializer(), -516583649, iSerializer), 0).write();
    }

    public WorkManagerImpl(Context context, final graphicsLayerpANQ8Wgdefault graphicslayerpanq8wgdefault, accessgetStrokecp accessgetstrokecp, final WorkDatabase workDatabase, final List list, getDefaultShadowColor getdefaultshadowcolor, getEmptyInterval getemptyinterval) {
        Context applicationContext = context.getApplicationContext();
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (applicationContext.isDeviceProtectedStorage()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        setRotationX setrotationx = new setRotationX(graphicslayerpanq8wgdefault.MediaMetadataCompat);
        synchronized (setRotationX.RemoteActionCompatParcelizer) {
            if (setRotationX.serializer == null) {
                setRotationX.serializer = setrotationx;
            }
        }
        this.IconCompatParcelizer = applicationContext;
        this.MediaSessionCompatToken = accessgetstrokecp;
        this.PlaybackStateCompat = workDatabase;
        this.MediaMetadataCompat = getdefaultshadowcolor;
        this.ParcelableVolumeInfo = getemptyinterval;
        this.write = graphicslayerpanq8wgdefault;
        this.MediaDescriptionCompat = list;
        CoroutineDispatcher coroutineDispatcher = accessgetstrokecp.serializer;
        coroutineDispatcher.getClass();
        ContextScope contextScopeRemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(coroutineDispatcher);
        this.MediaBrowserCompatMediaItem = new MemoryCacheService(workDatabase);
        final getDifferencertfAjoo getdifferencertfajoo = accessgetstrokecp.RemoteActionCompatParcelizer;
        int i = ImageBitmapDefaultImpls.read;
        getdefaultshadowcolor.RemoteActionCompatParcelizer(new rememberGraphicsLayer() { // from class: o.ImageBitmapConfig
            @Override // o.rememberGraphicsLayer
            public final void write(mapMKHz9U mapmkhz9u, boolean z) {
                getdifferencertfajoo.execute(new Schedulers$$ExternalSyntheticLambda1(list, mapmkhz9u, graphicslayerpanq8wgdefault, workDatabase, 0));
            }
        });
        accessgetstrokecp.RemoteActionCompatParcelizer.execute(new getRoundRect(applicationContext, this));
        String str = accessgetF16cp.write;
        if (drawOutlinehn5TExgdefault.RemoteActionCompatParcelizer(applicationContext, graphicslayerpanq8wgdefault)) {
            FlowKt.RemoteActionCompatParcelizer(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new EventsBufferImpl$1$1(applicationContext, shortNewsContentCardView, 1), FlowKt.serializer(FlowKt.IconCompatParcelizer(new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(DelayKt.RemoteActionCompatParcelizer(((translateimpldefault) workDatabase.MediaMetadataCompat()).IconCompatParcelizer, false, new String[]{"workspec"}, new accessgetIntersectcp(11)), new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(4, null)), -1))), contextScopeRemoteActionCompatParcelizer);
        }
    }
}
