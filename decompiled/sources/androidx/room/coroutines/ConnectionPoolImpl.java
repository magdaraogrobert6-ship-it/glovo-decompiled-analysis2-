package androidx.room.coroutines;

import androidx.camera.video.Recorder$3;
import androidx.lifecycle.BlockRunner$maybeRun$1;
import androidx.room.Room;
import androidx.sqlite.SQLite;
import bo.app.b$$ExternalSyntheticLambda0;
import bo.app.h$$ExternalSyntheticLambda0;
import coil3.ExtrasKt;
import coil3.RealImageLoader$execute$2$job$1;
import coil3.UriKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.Timestamp;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.ThreadLocalElement;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.accessgetWhitecp;
import o.accessgetYellowcp;
import o.component3impl;
import o.createInAppMessageEventSubscriber;
import o.markOnScreenCardsAsReadlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setUnregisteredInAppMessage;
import o.unregisterInAppMessageManager;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectionPoolImpl implements accessgetWhitecp {
    public final Pool IconCompatParcelizer;
    public final Pool MediaMetadataCompat;
    public final long RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final ThreadLocal read;
    public final Timestamp.Companion serializer;
    public volatile boolean write;

    public ConnectionPoolImpl(final Recorder$3 recorder$3, final String str, int i) {
        str.getClass();
        final int i2 = 0;
        this.serializer = new Timestamp.Companion(0);
        this.read = new ThreadLocal();
        unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
        this.RatingCompat = UriKt.RemoteActionCompatParcelizer(30, setUnregisteredInAppMessage.SECONDS);
        this.RemoteActionCompatParcelizer = 2;
        if (i <= 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Maximum number of readers must be greater than 0");
            throw null;
        }
        this.IconCompatParcelizer = new Pool(i, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.component4impl
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = i2;
                String str2 = str;
                Recorder$3 recorder$4 = recorder$3;
                if (i3 != 0) {
                    return recorder$4.read(str2);
                }
                tintxETnrds tintxetnrds = recorder$4.read(str2);
                androidx.sqlite.SQLite.serializer(tintxetnrds, "PRAGMA query_only = 1");
                return tintxetnrds;
            }
        });
        final int i3 = 1;
        this.MediaMetadataCompat = new Pool(1, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.component4impl
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i4 = i3;
                String str2 = str;
                Recorder$3 recorder$4 = recorder$3;
                if (i4 != 0) {
                    return recorder$4.read(str2);
                }
                tintxETnrds tintxetnrds = recorder$4.read(str2);
                androidx.sqlite.SQLite.serializer(tintxetnrds, "PRAGMA query_only = 1");
                return tintxetnrds;
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.write) {
            return;
        }
        this.write = true;
        this.IconCompatParcelizer.write();
        this.MediaMetadataCompat.write();
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0184  */
    /* JADX WARN: Code duplicated, block: B:79:0x0188  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0195  */
    @Override // o.accessgetWhitecp
    public final Object useConnection(boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        accessgetYellowcp accessgetyellowcp;
        Pool pool;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        Throwable th;
        Pool pool2;
        TextAnnouncementContentCardView textAnnouncementContentCardView;
        Pool pool3;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber2;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
        Timestamp.Companion companion;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber3;
        Throwable th2;
        PooledConnectionImpl pooledConnectionImpl;
        boolean z2 = z;
        if (shortNewsContentCardView instanceof accessgetYellowcp) {
            accessgetyellowcp = (accessgetYellowcp) shortNewsContentCardView;
            int i = accessgetyellowcp.MediaBrowserCompatMediaItem;
            if ((i & Integer.MIN_VALUE) != 0) {
                accessgetyellowcp.MediaBrowserCompatMediaItem = i - Integer.MIN_VALUE;
            } else {
                accessgetyellowcp = new accessgetYellowcp(this, shortNewsContentCardView);
            }
        } else {
            accessgetyellowcp = new accessgetYellowcp(this, shortNewsContentCardView);
        }
        Object objWithContext = accessgetyellowcp.MediaMetadataCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = accessgetyellowcp.MediaBrowserCompatMediaItem;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                if (!this.write) {
                    PooledConnectionImpl pooledConnectionImpl2 = (PooledConnectionImpl) this.read.get();
                    if (pooledConnectionImpl2 == null) {
                        component3impl component3implVar = (component3impl) accessgetyellowcp.getContext().get(this.serializer);
                        pooledConnectionImpl2 = component3implVar != null ? component3implVar.RemoteActionCompatParcelizer : null;
                    }
                    if (pooledConnectionImpl2 != null) {
                        if (!z2 && pooledConnectionImpl2.serializer) {
                            SQLite.read(1, "Cannot upgrade connection from reader to writer");
                            throw null;
                        }
                        if (accessgetyellowcp.getContext().get(this.serializer) == null) {
                            component3impl component3implVar2 = new component3impl(this.serializer, pooledConnectionImpl2);
                            ThreadLocal threadLocal = this.read;
                            threadLocal.getClass();
                            TextAnnouncementContentCardView textAnnouncementContentCardView2 = Room.read(component3implVar2, new ThreadLocalElement(pooledConnectionImpl2, threadLocal));
                            BlockRunner$maybeRun$1 blockRunner$maybeRun$1 = new BlockRunner$maybeRun$1(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, pooledConnectionImpl2, shortNewsContentCardView2, 29);
                            accessgetyellowcp.MediaBrowserCompatMediaItem = 1;
                            Object objWithContext2 = BuildersKt.withContext(textAnnouncementContentCardView2, blockRunner$maybeRun$1, accessgetyellowcp);
                            if (objWithContext2 != coroutineSingletons) {
                                return objWithContext2;
                            }
                        } else {
                            accessgetyellowcp.MediaBrowserCompatMediaItem = 2;
                            Object objInvoke = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(pooledConnectionImpl2, accessgetyellowcp);
                            if (objInvoke != coroutineSingletons) {
                                return objInvoke;
                            }
                        }
                    } else {
                        if (z2) {
                            pool = this.IconCompatParcelizer;
                        } else {
                            pool = this.MediaMetadataCompat;
                        }
                        createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                        try {
                            TextAnnouncementContentCardView context = accessgetyellowcp.getContext();
                            Timestamp.Companion companion2 = this.serializer;
                            long j = this.RatingCompat;
                            b$$ExternalSyntheticLambda0 b__externalsyntheticlambda0 = new b$$ExternalSyntheticLambda0(this, z2, 2);
                            accessgetyellowcp.IconCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                            accessgetyellowcp.read = pool;
                            accessgetyellowcp.RemoteActionCompatParcelizer = createinappmessageeventsubscriber;
                            accessgetyellowcp.serializer = context;
                            accessgetyellowcp.write = createinappmessageeventsubscriber;
                            accessgetyellowcp.RatingCompat = companion2;
                            accessgetyellowcp.MediaDescriptionCompat = z2;
                            accessgetyellowcp.MediaBrowserCompatMediaItem = 3;
                            Object objM3952acquireWithTimeoutKLykuaI = pool.m3952acquireWithTimeoutKLykuaI(j, b__externalsyntheticlambda0, accessgetyellowcp);
                            if (objM3952acquireWithTimeoutKLykuaI != coroutineSingletons) {
                                textAnnouncementContentCardView = context;
                                pool3 = pool;
                                objWithContext = objM3952acquireWithTimeoutKLykuaI;
                                createinappmessageeventsubscriber2 = createinappmessageeventsubscriber;
                                r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                                companion = companion2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            pool2 = pool;
                            throw th;
                        }
                    }
                    return coroutineSingletons;
                }
                SQLite.read(21, "Connection pool is closed");
                throw null;
            }
            if (i2 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                return objWithContext;
            }
            if (i2 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                return objWithContext;
            }
            if (i2 == 3) {
                z2 = accessgetyellowcp.MediaDescriptionCompat;
                companion = accessgetyellowcp.RatingCompat;
                createInAppMessageEventSubscriber createinappmessageeventsubscriber4 = accessgetyellowcp.write;
                TextAnnouncementContentCardView textAnnouncementContentCardView3 = accessgetyellowcp.serializer;
                createInAppMessageEventSubscriber createinappmessageeventsubscriber5 = accessgetyellowcp.RemoteActionCompatParcelizer;
                pool3 = (Pool) accessgetyellowcp.read;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) accessgetyellowcp.IconCompatParcelizer;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                    createinappmessageeventsubscriber2 = createinappmessageeventsubscriber4;
                    createinappmessageeventsubscriber = createinappmessageeventsubscriber5;
                    textAnnouncementContentCardView = textAnnouncementContentCardView3;
                } catch (Throwable th4) {
                    th2 = th4;
                    createinappmessageeventsubscriber3 = createinappmessageeventsubscriber5;
                    pool2 = pool3;
                    createinappmessageeventsubscriber = createinappmessageeventsubscriber3;
                    th = th2;
                    throw th;
                }
            } else if (i2 == 4) {
                createinappmessageeventsubscriber3 = (createInAppMessageEventSubscriber) accessgetyellowcp.read;
                pool2 = (Pool) accessgetyellowcp.IconCompatParcelizer;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                } catch (Throwable th5) {
                    th2 = th5;
                    createinappmessageeventsubscriber = createinappmessageeventsubscriber3;
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        try {
                            PooledConnectionImpl pooledConnectionImpl3 = (PooledConnectionImpl) createinappmessageeventsubscriber.IconCompatParcelizer;
                            if (pooledConnectionImpl3 != null) {
                                if (!pooledConnectionImpl3.RemoteActionCompatParcelizer) {
                                    pooledConnectionImpl3.RemoteActionCompatParcelizer = true;
                                    if (pooledConnectionImpl3.read.RemoteActionCompatParcelizer.IconCompatParcelizer()) {
                                        SQLite.serializer(pooledConnectionImpl3.read, "ROLLBACK TRANSACTION");
                                    }
                                }
                                ConnectionWithLock connectionWithLock = pooledConnectionImpl3.read;
                                connectionWithLock.IconCompatParcelizer = null;
                                connectionWithLock.read = null;
                                pool2.RemoteActionCompatParcelizer(connectionWithLock);
                                throw th6;
                            }
                            throw th6;
                        } catch (Throwable th7) {
                            markOnScreenCardsAsReadlambda1.read(th, th7);
                            throw th6;
                        }
                    }
                }
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pooledConnectionImpl = (PooledConnectionImpl) createinappmessageeventsubscriber3.IconCompatParcelizer;
            if (pooledConnectionImpl != null) {
                if (!pooledConnectionImpl.RemoteActionCompatParcelizer) {
                    pooledConnectionImpl.RemoteActionCompatParcelizer = true;
                    if (pooledConnectionImpl.read.RemoteActionCompatParcelizer.IconCompatParcelizer()) {
                        SQLite.serializer(pooledConnectionImpl.read, "ROLLBACK TRANSACTION");
                    }
                }
                ConnectionWithLock connectionWithLock2 = pooledConnectionImpl.read;
                connectionWithLock2.IconCompatParcelizer = null;
                connectionWithLock2.read = null;
                pool2.RemoteActionCompatParcelizer(connectionWithLock2);
            }
            return objWithContext;
            ConnectionWithLock connectionWithLock3 = (ConnectionWithLock) objWithContext;
            connectionWithLock3.getClass();
            textAnnouncementContentCardView.getClass();
            connectionWithLock3.IconCompatParcelizer = textAnnouncementContentCardView;
            connectionWithLock3.read = new Throwable();
            createinappmessageeventsubscriber2.IconCompatParcelizer = new PooledConnectionImpl(companion, connectionWithLock3, this.IconCompatParcelizer != this.MediaMetadataCompat && z2);
            Object obj = createinappmessageeventsubscriber.IconCompatParcelizer;
            if (obj != null) {
                PooledConnectionImpl pooledConnectionImpl4 = (PooledConnectionImpl) obj;
                component3impl component3implVar3 = new component3impl(this.serializer, pooledConnectionImpl4);
                ThreadLocal threadLocal2 = this.read;
                threadLocal2.getClass();
                TextAnnouncementContentCardView textAnnouncementContentCardView4 = Room.read(component3implVar3, new ThreadLocalElement(pooledConnectionImpl4, threadLocal2));
                RealImageLoader$execute$2$job$1 realImageLoader$execute$2$job$1 = new RealImageLoader$execute$2$job$1(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, createinappmessageeventsubscriber, (ShortNewsContentCardView) null, 1);
                accessgetyellowcp.IconCompatParcelizer = pool3;
                accessgetyellowcp.read = createinappmessageeventsubscriber;
                accessgetyellowcp.RemoteActionCompatParcelizer = null;
                accessgetyellowcp.serializer = null;
                accessgetyellowcp.write = null;
                accessgetyellowcp.RatingCompat = null;
                accessgetyellowcp.MediaBrowserCompatMediaItem = 4;
                objWithContext = BuildersKt.withContext(textAnnouncementContentCardView4, realImageLoader$execute$2$job$1, accessgetyellowcp);
                if (objWithContext != coroutineSingletons) {
                    createinappmessageeventsubscriber3 = createinappmessageeventsubscriber;
                    pool2 = pool3;
                    pooledConnectionImpl = (PooledConnectionImpl) createinappmessageeventsubscriber3.IconCompatParcelizer;
                    if (pooledConnectionImpl != null) {
                        if (!pooledConnectionImpl.RemoteActionCompatParcelizer) {
                            pooledConnectionImpl.RemoteActionCompatParcelizer = true;
                            if (pooledConnectionImpl.read.RemoteActionCompatParcelizer.IconCompatParcelizer()) {
                                SQLite.serializer(pooledConnectionImpl.read, "ROLLBACK TRANSACTION");
                            }
                        }
                        ConnectionWithLock connectionWithLock4 = pooledConnectionImpl.read;
                        connectionWithLock4.IconCompatParcelizer = null;
                        connectionWithLock4.read = null;
                        pool2.RemoteActionCompatParcelizer(connectionWithLock4);
                    }
                    return objWithContext;
                }
                return coroutineSingletons;
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Throwable th8) {
            th2 = th8;
            createinappmessageeventsubscriber3 = createinappmessageeventsubscriber;
            pool2 = pool3;
            createinappmessageeventsubscriber = createinappmessageeventsubscriber3;
            th = th2;
            throw th;
        }
    }

    public ConnectionPoolImpl(Recorder$3 recorder$3) {
        this.serializer = new Timestamp.Companion(0);
        this.read = new ThreadLocal();
        unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
        this.RatingCompat = UriKt.RemoteActionCompatParcelizer(30, setUnregisteredInAppMessage.SECONDS);
        this.RemoteActionCompatParcelizer = 2;
        Pool pool = new Pool(1, new h$$ExternalSyntheticLambda0(2, recorder$3));
        this.IconCompatParcelizer = pool;
        this.MediaMetadataCompat = pool;
    }
}
