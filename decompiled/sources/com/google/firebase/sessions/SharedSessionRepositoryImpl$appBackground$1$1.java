package com.google.firebase.sessions;

import coil3.ExtrasKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import o.AndroidComposeViewAccessibilityDelegateCompat;
import o.AndroidComposeViewderivedIsAttached2;
import o.AndroidComposeViewgetFocusedRect1;
import o.AndroidComposeViewlocaleList2;
import o.AndroidComposeViewpointerIconService1;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.accessgetExclusioncp;
import o.createFromParcel;
import o.getCieXyz;
import o.invoke12SF9DM;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class SharedSessionRepositoryImpl$appBackground$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ SharedSessionRepositoryImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SharedSessionRepositoryImpl$appBackground$1$1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.write = sharedSessionRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.serializer;
        SharedSessionRepositoryImpl sharedSessionRepositoryImpl = this.write;
        if (i != 0) {
            SharedSessionRepositoryImpl$appBackground$1$1 sharedSessionRepositoryImpl$appBackground$1$1 = new SharedSessionRepositoryImpl$appBackground$1$1(sharedSessionRepositoryImpl, shortNewsContentCardView, 1);
            sharedSessionRepositoryImpl$appBackground$1$1.RemoteActionCompatParcelizer = obj;
            return sharedSessionRepositoryImpl$appBackground$1$1;
        }
        SharedSessionRepositoryImpl$appBackground$1$1 sharedSessionRepositoryImpl$appBackground$1$2 = new SharedSessionRepositoryImpl$appBackground$1$1(sharedSessionRepositoryImpl, shortNewsContentCardView, 0);
        sharedSessionRepositoryImpl$appBackground$1$2.RemoteActionCompatParcelizer = obj;
        return sharedSessionRepositoryImpl$appBackground$1$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        AndroidComposeViewlocaleList2 androidComposeViewlocaleList2 = (AndroidComposeViewlocaleList2) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        return i != 0 ? ((SharedSessionRepositoryImpl$appBackground$1$1) create(androidComposeViewlocaleList2, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((SharedSessionRepositoryImpl$appBackground$1$1) create(androidComposeViewlocaleList2, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i = this.serializer;
        SharedSessionRepositoryImpl sharedSessionRepositoryImpl = this.write;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AndroidComposeViewlocaleList2 androidComposeViewlocaleList2 = (AndroidComposeViewlocaleList2) this.RemoteActionCompatParcelizer;
            sharedSessionRepositoryImpl.MediaSessionCompatToken.getClass();
            return AndroidComposeViewlocaleList2.write(androidComposeViewlocaleList2, null, AndroidComposeViewAccessibilityDelegateCompat.RemoteActionCompatParcelizer(), null, 5);
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        AndroidComposeViewlocaleList2 androidComposeViewlocaleList3 = (AndroidComposeViewlocaleList2) this.RemoteActionCompatParcelizer;
        AndroidComposeViewderivedIsAttached2 androidComposeViewderivedIsAttached2 = sharedSessionRepositoryImpl.MediaBrowserCompatMediaItem;
        boolean zWrite = sharedSessionRepositoryImpl.write(androidComposeViewlocaleList3);
        Map mapIconCompatParcelizer = androidComposeViewlocaleList3.processDataMap;
        if (mapIconCompatParcelizer != null) {
            androidComposeViewderivedIsAttached2.getClass();
            if (!androidComposeViewderivedIsAttached2.write) {
                ArrayList<AndroidComposeViewgetFocusedRect1> arrayList = accessgetExclusioncp.read(androidComposeViewderivedIsAttached2.RemoteActionCompatParcelizer);
                ArrayList arrayList2 = new ArrayList();
                for (AndroidComposeViewgetFocusedRect1 androidComposeViewgetFocusedRect1 : arrayList) {
                    invoke12SF9DM invoke12sf9dm = (invoke12SF9DM) mapIconCompatParcelizer.get(androidComposeViewgetFocusedRect1.read);
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = invoke12sf9dm != null ? new onViewAttachedToWindowlambda0(androidComposeViewgetFocusedRect1, invoke12sf9dm) : null;
                    if (onviewattachedtowindowlambda0 != null) {
                        arrayList2.add(onviewattachedtowindowlambda0);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = (onViewAttachedToWindowlambda0) it.next();
                            AndroidComposeViewgetFocusedRect1 androidComposeViewgetFocusedRect2 = (AndroidComposeViewgetFocusedRect1) onviewattachedtowindowlambda1.serializer;
                            invoke12SF9DM invoke12sf9dm2 = (invoke12SF9DM) onviewattachedtowindowlambda1.write;
                            boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{androidComposeViewderivedIsAttached2.IconCompatParcelizer(), androidComposeViewgetFocusedRect2.read}, getCieXyz.write())).booleanValue();
                            int i2 = androidComposeViewgetFocusedRect2.IconCompatParcelizer;
                            if (zBooleanValue) {
                                if (i2 == invoke12sf9dm2.pid) {
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) androidComposeViewderivedIsAttached2.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper(), invoke12sf9dm2.uuid}, getCieXyz.write())).booleanValue()) {
                                    }
                                } else {
                                    continue;
                                }
                            } else if (i2 != invoke12sf9dm2.pid) {
                            }
                        }
                    }
                }
                z = true;
            }
            z = false;
        } else {
            z = true;
        }
        boolean zSerializer = sharedSessionRepositoryImpl.serializer(androidComposeViewlocaleList3);
        if (z) {
            mapIconCompatParcelizer = androidComposeViewderivedIsAttached2.IconCompatParcelizer(SimpleItemTouchHelperCallback.serializer);
        } else if (zSerializer) {
            mapIconCompatParcelizer = androidComposeViewderivedIsAttached2.IconCompatParcelizer(mapIconCompatParcelizer);
        }
        AndroidComposeViewpointerIconService1 androidComposeViewpointerIconService1 = z ? null : androidComposeViewlocaleList3.sessionDetails;
        if (!zWrite && !z) {
            return zSerializer ? AndroidComposeViewlocaleList2.write(androidComposeViewlocaleList3, null, null, androidComposeViewderivedIsAttached2.IconCompatParcelizer(mapIconCompatParcelizer), 3) : androidComposeViewlocaleList3;
        }
        AndroidComposeViewpointerIconService1 androidComposeViewpointerIconService1RemoteActionCompatParcelizer = sharedSessionRepositoryImpl.RatingCompat.RemoteActionCompatParcelizer(androidComposeViewpointerIconService1);
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl = sharedSessionRepositoryImpl.MediaSessionCompatQueueItem;
        BuildersKt.RemoteActionCompatParcelizer(YieldKt.RemoteActionCompatParcelizer(sessionFirelogPublisherImpl.RemoteActionCompatParcelizer), null, null, new SessionFirelogPublisherImpl$mayLogSession$1(sessionFirelogPublisherImpl, androidComposeViewpointerIconService1RemoteActionCompatParcelizer, null), 3);
        androidComposeViewderivedIsAttached2.write = true;
        return new AndroidComposeViewlocaleList2(androidComposeViewpointerIconService1RemoteActionCompatParcelizer, null, mapIconCompatParcelizer);
    }
}
