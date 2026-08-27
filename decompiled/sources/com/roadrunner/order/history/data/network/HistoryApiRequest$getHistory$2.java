package com.roadrunner.order.history.data.network;

import androidx.cardview.widget.CardView$1;
import androidx.compose.ui.graphics.Fields;
import androidx.transition.TransitionValuesMaps;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.data.local.SharedPreferenceToDataStoreBridge;
import com.deliveryhero.perseus.data.local.UnencryptedSharedPreferencesLocalStorage;
import com.huawei.location.Vw$Vw;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.base.internal.route.parsing.ResponseToParse;
import com.mapbox.navigation.base.internal.route.parsing.parser.directions.NnAndModelsParallelNavigationRoutesParser;
import com.roadrunner.customerchat.legacy.chatlist.analytics.ChatLogger$log$2;
import com.roadrunner.nafath.NafathTimerManager$observeCountdown$1;
import com.roadrunner.phonenumber.domain.GetCustomerPhoneNumberUseCaseImpl;
import com.roadrunner.vendor.review.data.SubmitVendorReviewWorker;
import io.grpc.internal.SharedResourcePool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AsyncImagePainterStateError;
import o.AsyncImagePainterStateSuccess;
import o.RealImageLoaderexecute2job1;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.getCachedContentCards;
import o.getLeftD9Ej5fMannotations;
import o.getSpanUnitR2X_6oannotations;
import o.isItemDismissable;
import o.isRoot;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdapwU9vT7rpJZcI3849jLOV6VNoHA;
import o.setTransactionSuccessful;
import o.stopInstancelambda11;
import o.waitForUserDependencyThreadlambda1;
import o.y2;
import o.yb;
import o.yd;
import o.yf;
import o.z0;
import o.z4;
import o.z5;
import o.z6;
import o.z7;
import o.z8;
import o.zExternalSyntheticLambda0;
import o.zExternalSyntheticLambda1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class HistoryApiRequest$getHistory$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ long write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HistoryApiRequest$getHistory$2(Object obj, long j, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.read = i;
        this.serializer = obj;
        this.write = j;
        this.IconCompatParcelizer = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objSerializer;
        String strMediaBrowserCompatMediaItem;
        DateTime dateTime;
        long j;
        Object objM5002invokegIAlus;
        int i = this.read;
        int i2 = 4;
        final int i3 = 1;
        String str = null;
        if (i == 0) {
            LocalDate localDate = (LocalDate) this.IconCompatParcelizer;
            HistoryApiRequest historyApiRequest = (HistoryApiRequest) this.serializer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.RemoteActionCompatParcelizer;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                z7 z7Var = historyApiRequest.IconCompatParcelizer;
                long j2 = this.write;
                String string = localDate.toString("yyyy-MM-dd");
                string.getClass();
                this.RemoteActionCompatParcelizer = 1;
                objSerializer = z7Var.serializer(j2, string, this);
                if (objSerializer == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objSerializer = obj;
            }
            z8 z8Var = (z8) objSerializer;
            final z6 z6Var = historyApiRequest.serializer;
            z6Var.getClass();
            localDate.getClass();
            z8Var.getClass();
            stopInstancelambda11 stopinstancelambda11 = new stopInstancelambda11(i2);
            List listRemoteActionCompatParcelizer = z8Var.RemoteActionCompatParcelizer();
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listRemoteActionCompatParcelizer, 10));
            Iterator it = listRemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                z5 z5Var = (z5) it.next();
                long jMediaDescriptionCompat = z5Var.MediaDescriptionCompat();
                String str2 = (String) z5.IconCompatParcelizer(getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer(), 1360911588, -1360911588, getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer(), getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer(), new Object[]{z5Var}, getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer());
                int iMediaSessionCompatResultReceiverWrapper = z5Var.MediaSessionCompatResultReceiverWrapper();
                z5.MediaMetadataCompat mediaMetadataCompatMediaSessionCompatToken = z5Var.MediaSessionCompatToken();
                if (mediaMetadataCompatMediaSessionCompatToken == null || (strMediaBrowserCompatMediaItem = mediaMetadataCompatMediaSessionCompatToken.IconCompatParcelizer()) == null) {
                    z4 z4VarPlaybackStateCompatCustomAction = z5Var.PlaybackStateCompatCustomAction();
                    strMediaBrowserCompatMediaItem = z4VarPlaybackStateCompatCustomAction != null ? z4VarPlaybackStateCompatCustomAction.MediaBrowserCompatMediaItem() : str;
                    if (strMediaBrowserCompatMediaItem == null) {
                        strMediaBrowserCompatMediaItem = "";
                    }
                }
                z5.MediaMetadataCompat mediaMetadataCompatMediaSessionCompatToken2 = z5Var.MediaSessionCompatToken();
                String strRemoteActionCompatParcelizer = mediaMetadataCompatMediaSessionCompatToken2 != null ? mediaMetadataCompatMediaSessionCompatToken2.RemoteActionCompatParcelizer() : str;
                z4 z4VarPlaybackStateCompatCustomAction2 = z5Var.PlaybackStateCompatCustomAction();
                zExternalSyntheticLambda0 zexternalsyntheticlambda0 = new zExternalSyntheticLambda0(strMediaBrowserCompatMediaItem, strRemoteActionCompatParcelizer, z4VarPlaybackStateCompatCustomAction2 != null ? z6.IconCompatParcelizer(z4VarPlaybackStateCompatCustomAction2, stopinstancelambda11, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.z3
                    private static int serializer = 1;
                    private static int write;

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj2) {
                        int i5 = 2 % 2;
                        int i6 = serializer + 69;
                        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        int i8 = i3;
                        z6 z6Var2 = z6Var;
                        accessgetTextTopcp accessgettexttopcp = (accessgetTextTopcp) obj2;
                        if (i8 == 0) {
                            accessgettexttopcp.getClass();
                            Room room = z6Var2.IconCompatParcelizer;
                            room.getClass();
                            return room.RemoteActionCompatParcelizer.read(accessgettexttopcp).write(accessgettexttopcp);
                        }
                        accessgettexttopcp.getClass();
                        Room room2 = z6Var2.IconCompatParcelizer;
                        room2.getClass();
                        String strRemoteActionCompatParcelizer2 = room2.RemoteActionCompatParcelizer.read(accessgettexttopcp).RemoteActionCompatParcelizer(accessgettexttopcp);
                        int i9 = write + 1;
                        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        return strRemoteActionCompatParcelizer2;
                    }
                }) : null);
                String strMediaMetadataCompat = z5Var.MediaMetadataCompat();
                String strPlaybackStateCompat = z5Var.PlaybackStateCompat();
                z4 z4Var = (z4) z5.IconCompatParcelizer(getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer(), -79708075, 79708076, getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer(), getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer(), new Object[]{z5Var}, getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer());
                final int i5 = 0;
                yf yfVar = new yf(strMediaMetadataCompat, strPlaybackStateCompat, z4Var != null ? z6.IconCompatParcelizer(z4Var, stopinstancelambda11, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.z3
                    private static int serializer = 1;
                    private static int write;

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj2) {
                        int i6 = 2 % 2;
                        int i7 = serializer + 69;
                        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        int i9 = i5;
                        z6 z6Var2 = z6Var;
                        accessgetTextTopcp accessgettexttopcp = (accessgetTextTopcp) obj2;
                        if (i9 == 0) {
                            accessgettexttopcp.getClass();
                            Room room = z6Var2.IconCompatParcelizer;
                            room.getClass();
                            return room.RemoteActionCompatParcelizer.read(accessgettexttopcp).write(accessgettexttopcp);
                        }
                        accessgettexttopcp.getClass();
                        Room room2 = z6Var2.IconCompatParcelizer;
                        room2.getClass();
                        String strRemoteActionCompatParcelizer2 = room2.RemoteActionCompatParcelizer.read(accessgettexttopcp).RemoteActionCompatParcelizer(accessgettexttopcp);
                        int i10 = write + 1;
                        serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        return strRemoteActionCompatParcelizer2;
                    }
                }) : null);
                Double dParcelableVolumeInfo = z5Var.ParcelableVolumeInfo();
                double dDoubleValue = dParcelableVolumeInfo != null ? dParcelableVolumeInfo.doubleValue() : 0.0d;
                Integer numRatingCompat = z5Var.RatingCompat();
                int iIntValue = numRatingCompat != null ? numRatingCompat.intValue() : 0;
                Integer numMediaSessionCompatQueueItem = z5Var.MediaSessionCompatQueueItem();
                zExternalSyntheticLambda1 zexternalsyntheticlambda1 = new zExternalSyntheticLambda1(dDoubleValue, iIntValue, numMediaSessionCompatQueueItem != null ? numMediaSessionCompatQueueItem.intValue() : 0);
                z5.serializer serializerVarRemoteActionCompatParcelizer = z5Var.RemoteActionCompatParcelizer();
                yb ybVar = serializerVarRemoteActionCompatParcelizer != null ? new yb(serializerVarRemoteActionCompatParcelizer.write(), serializerVarRemoteActionCompatParcelizer.IconCompatParcelizer()) : null;
                List<z5.IconCompatParcelizer> list = (List) z5.IconCompatParcelizer(getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer(), 57134549, -57134547, getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer(), getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer(), new Object[]{z5Var}, getLeftD9Ej5fMannotations.RemoteActionCompatParcelizer());
                ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                for (z5.IconCompatParcelizer iconCompatParcelizer : list) {
                    arrayList2.add(new yd(iconCompatParcelizer.serializer(), iconCompatParcelizer.read(), iconCompatParcelizer.IconCompatParcelizer(), iconCompatParcelizer.write(), iconCompatParcelizer.RemoteActionCompatParcelizer()));
                }
                double dIconCompatParcelizer = z5Var.IconCompatParcelizer();
                String strWrite = z5Var.write();
                if (strWrite != null) {
                    DateTime dateTime2 = DateTime.parse(strWrite, ISODateTimeFormat.dateTimeParser());
                    dateTime2.getClass();
                    dateTime = dateTime2;
                } else {
                    dateTime = null;
                }
                arrayList.add(new y2(jMediaDescriptionCompat, str2, iMediaSessionCompatResultReceiverWrapper, zexternalsyntheticlambda0, yfVar, zexternalsyntheticlambda1, ybVar, arrayList2, dIconCompatParcelizer, dateTime));
                it = it;
                z6Var = z6Var;
                stopinstancelambda11 = stopinstancelambda11;
                i3 = 1;
                str = null;
            }
            return new z0(localDate, arrayList);
        }
        if (i == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.RemoteActionCompatParcelizer;
            if (i6 != 0) {
                if (i6 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            CardView$1 cardView$1 = ((SharedPreferenceToDataStoreBridge) this.serializer).RemoteActionCompatParcelizer;
            String str3 = (String) this.IconCompatParcelizer;
            long j3 = this.write;
            synchronized (cardView$1) {
                j = cardView$1.read().getLong(str3, j3);
            }
            UnencryptedSharedPreferencesLocalStorage unencryptedSharedPreferencesLocalStorage = ((SharedPreferenceToDataStoreBridge) this.serializer).read;
            String str4 = (String) this.IconCompatParcelizer;
            this.RemoteActionCompatParcelizer = 1;
            unencryptedSharedPreferencesLocalStorage.getClass();
            Object orPut = unencryptedSharedPreferencesLocalStorage.getOrPut(new isRoot(str4), new Long(j), this);
            return orPut == coroutineSingletons2 ? coroutineSingletons2 : orPut;
        }
        if (i == 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.RemoteActionCompatParcelizer;
            if (i7 != 0) {
                if (i7 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            NnAndModelsParallelNavigationRoutesParser nnAndModelsParallelNavigationRoutesParser = (NnAndModelsParallelNavigationRoutesParser) this.serializer;
            CoroutineDispatcher coroutineDispatcher = nnAndModelsParallelNavigationRoutesParser.parsingDispatcher;
            NafathTimerManager$observeCountdown$1 nafathTimerManager$observeCountdown$1 = new NafathTimerManager$observeCountdown$1((ResponseToParse) this.IconCompatParcelizer, this.write, nnAndModelsParallelNavigationRoutesParser, (ShortNewsContentCardView) null, 4);
            this.RemoteActionCompatParcelizer = 1;
            Object objWithContext = BuildersKt.withContext(coroutineDispatcher, nafathTimerManager$observeCountdown$1, this);
            return objWithContext == coroutineSingletons3 ? coroutineSingletons3 : objWithContext;
        }
        if (i == 3) {
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = this.RemoteActionCompatParcelizer;
            if (i8 != 0) {
                if (i8 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            TransitionValuesMaps transitionValuesMaps = (TransitionValuesMaps) this.serializer;
            CoroutineDispatcher coroutineDispatcher2 = (CoroutineDispatcher) transitionValuesMaps.MediaDescriptionCompat;
            ChatLogger$log$2 chatLogger$log$2 = new ChatLogger$log$2(transitionValuesMaps, (ArrayList) this.IconCompatParcelizer, this.write, null, 2);
            this.RemoteActionCompatParcelizer = 1;
            Object objWithContext2 = BuildersKt.withContext(coroutineDispatcher2, chatLogger$log$2, this);
            return objWithContext2 == coroutineSingletons4 ? coroutineSingletons4 : objWithContext2;
        }
        if (i == 4) {
            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i9 = this.RemoteActionCompatParcelizer;
            if (i9 != 0) {
                if (i9 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getSpanUnitR2X_6oannotations getspanunitr2x_6oannotations = (getSpanUnitR2X_6oannotations) ((Vw$Vw) this.serializer).serializer;
            long j4 = this.write;
            String str5 = (String) this.IconCompatParcelizer;
            this.RemoteActionCompatParcelizer = 1;
            Object objIconCompatParcelizer = getspanunitr2x_6oannotations.IconCompatParcelizer(j4, str5, this);
            return objIconCompatParcelizer == coroutineSingletons5 ? coroutineSingletons5 : objIconCompatParcelizer;
        }
        if (i != 5) {
            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.RemoteActionCompatParcelizer;
            if (i10 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                waitForUserDependencyThreadlambda1 waitforuserdependencythreadlambda1 = ((SubmitVendorReviewWorker) this.serializer).MediaMetadataCompat;
                long j5 = this.write;
                getCachedContentCards getcachedcontentcards = (getCachedContentCards) this.IconCompatParcelizer;
                this.RemoteActionCompatParcelizer = 1;
                if (waitforuserdependencythreadlambda1.IconCompatParcelizer(j5, getcachedcontentcards, this) == coroutineSingletons6) {
                    return coroutineSingletons6;
                }
            } else {
                if (i10 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createFromParcel.INSTANCE;
        }
        RealImageLoaderexecute2job1 realImageLoaderexecute2job1 = (RealImageLoaderexecute2job1) this.serializer;
        SharedResourcePool sharedResourcePool = realImageLoaderexecute2job1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.RemoteActionCompatParcelizer;
        if (i11 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            sharedResourcePool.serializer(new AsyncImagePainterStateError(null, null, 5));
            GetCustomerPhoneNumberUseCaseImpl getCustomerPhoneNumberUseCaseImpl = realImageLoaderexecute2job1.read;
            r8lambdapwU9vT7rpJZcI3849jLOV6VNoHA r8lambdapwu9vt7rpjzci3849jlov6vnoha = new r8lambdapwU9vT7rpJZcI3849jLOV6VNoHA(this.write, (String) this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = 1;
            objM5002invokegIAlus = getCustomerPhoneNumberUseCaseImpl.m5002invokegIAlus(r8lambdapwu9vt7rpjzci3849jlov6vnoha, this);
            if (objM5002invokegIAlus == coroutineSingletons7) {
                return coroutineSingletons7;
            }
        } else {
            if (i11 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM5002invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (!(objM5002invokegIAlus instanceof isItemDismissable)) {
            ExtrasKt.RemoteActionCompatParcelizer(objM5002invokegIAlus);
            sharedResourcePool.serializer(new AsyncImagePainterStateError(m1$$ExternalSyntheticOutline0.m(objM5002invokegIAlus, "tel:"), null, 6));
        }
        Throwable thSerializer = onItemDismiss.serializer(objM5002invokegIAlus);
        if (thSerializer != null) {
            setTransactionSuccessful settransactionsuccessful = realImageLoaderexecute2job1.RatingCompat;
            String strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.all_error);
            String strIconCompatParcelizer2 = settransactionsuccessful.IconCompatParcelizer(R.string.history_order_details_order_details_call_customer_error_message);
            String strIconCompatParcelizer3 = settransactionsuccessful.IconCompatParcelizer(R.string.all_ok);
            String localizedMessage = thSerializer.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = c8$$ExternalSyntheticOutline0.m(thSerializer.getClass(), "exception: ");
            }
            sharedResourcePool.serializer(new AsyncImagePainterStateError(null, new AsyncImagePainterStateSuccess(strIconCompatParcelizer, strIconCompatParcelizer2, strIconCompatParcelizer3, localizedMessage), 3));
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HistoryApiRequest$getHistory$2(Object obj, Object obj2, long j, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.read = i;
        this.serializer = obj;
        this.IconCompatParcelizer = obj2;
        this.write = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r1 != 5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r1 != 5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        return ((com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2) create(r9)).invokeSuspend(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        return ((com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2) create(r9)).invokeSuspend(r6);
     */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2.RatingCompat
            r2 = 3
            int r1 = r1 + r2
            int r3 = r1 % 128
            com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2.MediaDescriptionCompat = r3
            int r1 = r1 % r0
            r3 = 5
            r4 = 4
            r5 = 1
            if (r1 == 0) goto L28
            int r1 = r8.read
            o.createFromParcel r6 = o.createFromParcel.INSTANCE
            o.ShortNewsContentCardView r9 = (o.ShortNewsContentCardView) r9
            r7 = 52
            int r7 = r7 / 0
            if (r1 == 0) goto L7c
            if (r1 == r5) goto L71
            if (r1 == r0) goto L66
            if (r1 == r2) goto L5b
            if (r1 == r4) goto L50
            if (r1 == r3) goto L45
            goto L3a
        L28:
            int r1 = r8.read
            o.createFromParcel r6 = o.createFromParcel.INSTANCE
            o.ShortNewsContentCardView r9 = (o.ShortNewsContentCardView) r9
            if (r1 == 0) goto L7c
            if (r1 == r5) goto L71
            if (r1 == r0) goto L66
            if (r1 == r2) goto L5b
            if (r1 == r4) goto L50
            if (r1 == r3) goto L45
        L3a:
            o.ShortNewsContentCardView r9 = r8.create(r9)
            com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2 r9 = (com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2) r9
            java.lang.Object r9 = r9.invokeSuspend(r6)
            return r9
        L45:
            o.ShortNewsContentCardView r9 = r8.create(r9)
            com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2 r9 = (com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2) r9
            java.lang.Object r9 = r9.invokeSuspend(r6)
            return r9
        L50:
            o.ShortNewsContentCardView r9 = r8.create(r9)
            com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2 r9 = (com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2) r9
            java.lang.Object r9 = r9.invokeSuspend(r6)
            return r9
        L5b:
            o.ShortNewsContentCardView r9 = r8.create(r9)
            com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2 r9 = (com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2) r9
            java.lang.Object r9 = r9.invokeSuspend(r6)
            return r9
        L66:
            o.ShortNewsContentCardView r9 = r8.create(r9)
            com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2 r9 = (com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2) r9
            java.lang.Object r9 = r9.invokeSuspend(r6)
            return r9
        L71:
            o.ShortNewsContentCardView r9 = r8.create(r9)
            com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2 r9 = (com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2) r9
            java.lang.Object r9 = r9.invokeSuspend(r6)
            return r9
        L7c:
            o.ShortNewsContentCardView r9 = r8.create(r9)
            com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2 r9 = (com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2) r9
            java.lang.Object r9 = r9.invokeSuspend(r6)
            int r1 = com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2.RatingCompat
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2.MediaDescriptionCompat = r2
            int r1 = r1 % r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2.invoke(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 9;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        Object obj = this.IconCompatParcelizer;
        Object obj2 = this.serializer;
        if (i4 == 0) {
            return new HistoryApiRequest$getHistory$2((HistoryApiRequest) obj2, this.write, (LocalDate) obj, shortNewsContentCardView, 0);
        }
        if (i4 == 1) {
            HistoryApiRequest$getHistory$2 historyApiRequest$getHistory$2 = new HistoryApiRequest$getHistory$2((SharedPreferenceToDataStoreBridge) obj2, (String) obj, this.write, shortNewsContentCardView, 1);
            int i5 = MediaDescriptionCompat + 11;
            RatingCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 88 / 0;
            }
            return historyApiRequest$getHistory$2;
        }
        if (i4 == 2) {
            return new HistoryApiRequest$getHistory$2((NnAndModelsParallelNavigationRoutesParser) obj2, (ResponseToParse) obj, this.write, shortNewsContentCardView, 2);
        }
        if (i4 == 3) {
            HistoryApiRequest$getHistory$2 historyApiRequest$getHistory$3 = new HistoryApiRequest$getHistory$2((TransitionValuesMaps) obj2, (ArrayList) obj, this.write, shortNewsContentCardView, 3);
            int i7 = MediaDescriptionCompat + 53;
            RatingCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return historyApiRequest$getHistory$3;
        }
        if (i4 == 4) {
            return new HistoryApiRequest$getHistory$2((Vw$Vw) obj2, this.write, (String) obj, shortNewsContentCardView, 4);
        }
        if (i4 != 5) {
            return new HistoryApiRequest$getHistory$2((SubmitVendorReviewWorker) obj2, this.write, (getCachedContentCards) obj, shortNewsContentCardView, 6);
        }
        return new HistoryApiRequest$getHistory$2((RealImageLoaderexecute2job1) obj2, this.write, (String) obj, shortNewsContentCardView, 5);
    }
}
