package o;

import io.sentry.SentryBaseEvent;
import io.sentry.SentryOptions;
import io.sentry.SentryThreadFactory;
import java.io.Closeable;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class runlambda1 implements r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI, Closeable {
    public final SentryThreadFactory IconCompatParcelizer;
    public volatile getBrazeActionVersionAndJsonlambda0 RemoteActionCompatParcelizer = null;
    public final SentryOptions read;
    public final SentryThreadFactory write;

    @Override // o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI
    public final r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY RemoteActionCompatParcelizer(r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY r8lambdawgrr1ctqcsomiguyjgvk752ezy) {
        return r8lambdawgrr1ctqcsomiguyjgvk752ezy;
    }

    public runlambda1(SentryOptions sentryOptions) {
        this.read = sentryOptions;
        UriActionExternalSyntheticLambda1 uriActionExternalSyntheticLambda1 = new UriActionExternalSyntheticLambda1(sentryOptions);
        this.IconCompatParcelizer = new SentryThreadFactory(uriActionExternalSyntheticLambda1);
        this.write = new SentryThreadFactory(uriActionExternalSyntheticLambda1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.RemoteActionCompatParcelizer != null) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        }
    }

    public final void write(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.RatingCompat == null) {
            sentryBaseEvent.RatingCompat = this.read.getRelease();
        }
        if (sentryBaseEvent.serializer == null) {
            sentryBaseEvent.serializer = this.read.getEnvironment();
        }
        if (sentryBaseEvent.MediaSessionCompatResultReceiverWrapper == null) {
            sentryBaseEvent.MediaSessionCompatResultReceiverWrapper = this.read.getServerName();
        }
        if (this.read.isAttachServerName() && sentryBaseEvent.MediaSessionCompatResultReceiverWrapper == null) {
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = getBrazeActionVersionAndJsonlambda0.serializer();
            }
            if (this.RemoteActionCompatParcelizer != null) {
                sentryBaseEvent.MediaSessionCompatResultReceiverWrapper = this.RemoteActionCompatParcelizer.write();
            }
        }
        if (sentryBaseEvent.RemoteActionCompatParcelizer == null) {
            sentryBaseEvent.RemoteActionCompatParcelizer = this.read.getDist();
        }
        if (sentryBaseEvent.PlaybackStateCompat == null) {
            sentryBaseEvent.PlaybackStateCompat = this.read.getSdkVersion();
        }
        SentryOptions sentryOptions = this.read;
        if (sentryBaseEvent.PlaybackStateCompatCustomAction == null) {
            sentryBaseEvent.PlaybackStateCompatCustomAction = new HashMap(new HashMap(sentryOptions.getTags()));
        } else {
            for (Map.Entry<String, String> entry : sentryOptions.getTags().entrySet()) {
                if (!sentryBaseEvent.PlaybackStateCompatCustomAction.containsKey(entry.getKey())) {
                    sentryBaseEvent.IconCompatParcelizer(entry.getKey(), entry.getValue());
                }
            }
        }
        io.sentry.protocol.addObserverForBackInvoker addobserverforbackinvoker = sentryBaseEvent.ParcelableVolumeInfo;
        if (addobserverforbackinvoker == null) {
            addobserverforbackinvoker = new io.sentry.protocol.addObserverForBackInvoker();
            sentryBaseEvent.ParcelableVolumeInfo = addobserverforbackinvoker;
        }
        if (addobserverforbackinvoker.IconCompatParcelizer == null && this.read.isSendDefaultPii()) {
            addobserverforbackinvoker.IconCompatParcelizer = "{{auto}}";
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI
    public final BannerViewExternalSyntheticLambda2 read(BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2, executelambda4 executelambda4Var) {
        ArrayList arrayList;
        if (bannerViewExternalSyntheticLambda2.MediaSessionCompatQueueItem == null) {
            bannerViewExternalSyntheticLambda2.MediaSessionCompatQueueItem = "java";
        }
        Throwable th = bannerViewExternalSyntheticLambda2.MediaSessionCompatToken;
        if (th != null) {
            SentryThreadFactory sentryThreadFactory = this.IconCompatParcelizer;
            sentryThreadFactory.getClass();
            AtomicInteger atomicInteger = new AtomicInteger(-1);
            HashSet hashSet = new HashSet();
            ArrayDeque arrayDeque = new ArrayDeque();
            sentryThreadFactory.IconCompatParcelizer(th, atomicInteger, hashSet, arrayDeque, null);
            bannerViewExternalSyntheticLambda2.ComponentActivity = new r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8(new ArrayList(arrayDeque));
        }
        io.sentry.protocol.RemoteActionCompatParcelizer remoteActionCompatParcelizer = bannerViewExternalSyntheticLambda2.write;
        SentryOptions sentryOptions = this.read;
        io.sentry.protocol.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = io.sentry.protocol.RemoteActionCompatParcelizer.read(remoteActionCompatParcelizer, sentryOptions);
        if (remoteActionCompatParcelizer2 != null) {
            bannerViewExternalSyntheticLambda2.write = remoteActionCompatParcelizer2;
        }
        Map map = sentryOptions.getModulesLoader().read();
        if (map != null) {
            AbstractMap abstractMap = bannerViewExternalSyntheticLambda2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            if (abstractMap == null) {
                bannerViewExternalSyntheticLambda2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new HashMap(map);
            } else {
                abstractMap.putAll(map);
            }
        }
        if (serializer(bannerViewExternalSyntheticLambda2, executelambda4Var)) {
            write(bannerViewExternalSyntheticLambda2);
            if (bannerViewExternalSyntheticLambda2.serializer() == null) {
                ArrayList<io.sentry.protocol.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8> arrayListRemoteActionCompatParcelizer = bannerViewExternalSyntheticLambda2.RemoteActionCompatParcelizer();
                if (arrayListRemoteActionCompatParcelizer == null || arrayListRemoteActionCompatParcelizer.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = null;
                    for (io.sentry.protocol.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8 : arrayListRemoteActionCompatParcelizer) {
                        if (r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.write != null && r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.read != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.read);
                        }
                    }
                }
                boolean zIsAttachThreads = sentryOptions.isAttachThreads();
                SentryThreadFactory sentryThreadFactory2 = this.write;
                boolean zRemoteActionCompatParcelizer = false;
                if (zIsAttachThreads || io.sentry.hints.IconCompatParcelizer.class.isInstance(executelambda4Var.read("sentry:typeCheckHint"))) {
                    Object obj = executelambda4Var.read("sentry:typeCheckHint");
                    boolean zIsAttachStacktrace = sentryOptions.isAttachStacktrace();
                    if (obj instanceof io.sentry.hints.IconCompatParcelizer) {
                        zRemoteActionCompatParcelizer = ((io.sentry.hints.IconCompatParcelizer) obj).RemoteActionCompatParcelizer();
                        zIsAttachStacktrace = true;
                    }
                    sentryThreadFactory2.getClass();
                    bannerViewExternalSyntheticLambda2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8(sentryThreadFactory2.RemoteActionCompatParcelizer(Thread.getAllStackTraces(), arrayList, zRemoteActionCompatParcelizer, zIsAttachStacktrace));
                } else if (sentryOptions.isAttachStacktrace() && ((arrayListRemoteActionCompatParcelizer == null || arrayListRemoteActionCompatParcelizer.isEmpty()) && !io.sentry.hints.serializer.class.isInstance(executelambda4Var.read("sentry:typeCheckHint")))) {
                    boolean zIsAttachStacktrace2 = sentryOptions.isAttachStacktrace();
                    sentryThreadFactory2.getClass();
                    HashMap map2 = new HashMap();
                    Thread threadCurrentThread = Thread.currentThread();
                    map2.put(threadCurrentThread, threadCurrentThread.getStackTrace());
                    bannerViewExternalSyntheticLambda2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8(sentryThreadFactory2.RemoteActionCompatParcelizer(map2, null, false, zIsAttachStacktrace2));
                    return bannerViewExternalSyntheticLambda2;
                }
            }
        }
        return bannerViewExternalSyntheticLambda2;
    }

    public final boolean serializer(SentryBaseEvent sentryBaseEvent, executelambda4 executelambda4Var) {
        if (pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(executelambda4Var)) {
            return true;
        }
        this.read.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", sentryBaseEvent.MediaMetadataCompat);
        return false;
    }

    @Override // o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI
    public final onCustomEventAction write(onCustomEventAction oncustomeventaction, executelambda4 executelambda4Var) {
        if (oncustomeventaction.MediaSessionCompatQueueItem == null) {
            oncustomeventaction.MediaSessionCompatQueueItem = "java";
        }
        if (serializer(oncustomeventaction, executelambda4Var)) {
            write(oncustomeventaction);
            io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 = this.read.getSessionReplay().ParcelableVolumeInfo;
            if (r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 != null) {
                oncustomeventaction.PlaybackStateCompat = r8lambdaxj9c8vip9dfevatmzt0ejauc4a4;
            }
        }
        return oncustomeventaction;
    }

    @Override // o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI
    public final io.sentry.protocol.accessensureViewModelStore RemoteActionCompatParcelizer(io.sentry.protocol.accessensureViewModelStore accessensureviewmodelstore, executelambda4 executelambda4Var) {
        if (accessensureviewmodelstore.MediaSessionCompatQueueItem == null) {
            accessensureviewmodelstore.MediaSessionCompatQueueItem = "java";
        }
        io.sentry.protocol.RemoteActionCompatParcelizer remoteActionCompatParcelizer = io.sentry.protocol.RemoteActionCompatParcelizer.read(accessensureviewmodelstore.write, this.read);
        if (remoteActionCompatParcelizer != null) {
            accessensureviewmodelstore.write = remoteActionCompatParcelizer;
        }
        if (serializer(accessensureviewmodelstore, executelambda4Var)) {
            write(accessensureviewmodelstore);
        }
        return accessensureviewmodelstore;
    }
}
