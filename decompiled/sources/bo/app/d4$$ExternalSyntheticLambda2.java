package bo.app;

import android.content.Context;
import android.net.ConnectivityManager;
import android.view.View;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.emoji2.text.EmojiProcessor;
import androidx.sqlite.SQLite;
import coil3.compose.AsyncImagePainter$launchJob$1;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.braze.Braze;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.deliveryhero.perseus.Perseus;
import com.deliveryhero.perseus.PerseusApp;
import com.deliveryhero.perseus.PerseusEvent;
import com.foodora.courier.legacy.ui.main.MainPresenter;
import com.incognia.Incognia;
import com.roadrunner.freelancing.presentation.WorkNowUiModelImpl;
import com.roadrunner.freelancing.presentation.bonus.WorkNowWithBonusUiModelImpl;
import com.roadrunner.freelancing.presentation.infraboost.WorkNowWithInfraBoostUiModelImpl;
import com.roadrunner.incognia.implementation.IncogniaInitializerImpl;
import com.roadrunner.login.logging.RouterLogger;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.DragAndDropNodeacceptDragAndDropTransfer1;
import o.EmptyFillMeasurePolicymeasure1;
import o.ExecuteDelayed;
import o.LazyListKtrememberLazyListMeasurePolicy11;
import o.accessgetStaticcp;
import o.addOnConfigurationChangedListener;
import o.addPathoIyEayM;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.createNotificationChannelGroupsCompat;
import o.forEachFocusableIntersection;
import o.forEachui_graphics;
import o.getContentViewGroupParentLayout;
import o.getCreditCardSecurityCode;
import o.getQueryParameterslambda2;
import o.getStart;
import o.getSystemWindowInsets;
import o.isRoot;
import o.iterator;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.openSessionlambda0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.relocationOffsetfbGrOKE;
import o.sendContentCaptureTextUpdateEvent;
import o.setRotationX;
import o.subscribeToBannersErrorslambda0;
import o.toSvg;
import o.updateRenderPath;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d4$$ExternalSyntheticLambda2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ d4$$ExternalSyntheticLambda2(Object obj, int i, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0295 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0297 A[LOOP:0: B:79:0x0262->B:89:0x0297, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Map concurrentHashMap;
        Map mapSerializer;
        Map mapSingletonMap = null;
        Object[] objArr = 0;
        switch (this.$r8$classId) {
            case 0:
                return d4.a((createInAppMessageEventSubscriber) this.f$0, (d4) this.f$1);
            case 1:
                ((addOnConfigurationChangedListener) this.f$0).serializer = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.f$1;
                return createFromParcel.INSTANCE;
            case 2:
                LazyListKtrememberLazyListMeasurePolicy11 lazyListKtrememberLazyListMeasurePolicy11 = (LazyListKtrememberLazyListMeasurePolicy11) this.f$0;
                ContentDrawScope contentDrawScope = (ContentDrawScope) this.f$1;
                lazyListKtrememberLazyListMeasurePolicy11.MediaBrowserCompatMediaItem = lazyListKtrememberLazyListMeasurePolicy11.RatingCompat.mo24createOutlinePq9zytI(contentDrawScope.mo1304getSizeNHjbRc(), contentDrawScope.getLayoutDirection(), contentDrawScope);
                return createFromParcel.INSTANCE;
            case 3:
                TextLinkScope textLinkScope = (TextLinkScope) this.f$0;
                AnnotatedString annotatedString = (AnnotatedString) this.f$1;
                if (textLinkScope == null) {
                    return annotatedString;
                }
                SnapshotStateList snapshotStateList = textLinkScope.write;
                boolean zIsEmpty = snapshotStateList.isEmpty();
                AnnotatedString annotatedStringIconCompatParcelizer = textLinkScope.IconCompatParcelizer;
                if (!zIsEmpty) {
                    getStart getstart = new getStart(annotatedStringIconCompatParcelizer);
                    int size = snapshotStateList.size();
                    for (int i = 0; i < size; i++) {
                        ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) snapshotStateList.get(i)).invoke(getstart);
                    }
                    annotatedStringIconCompatParcelizer = getstart.IconCompatParcelizer();
                }
                textLinkScope.IconCompatParcelizer = annotatedStringIconCompatParcelizer;
                return annotatedStringIconCompatParcelizer == null ? annotatedString : annotatedStringIconCompatParcelizer;
            case 4:
                EmojiProcessor emojiProcessor = (EmojiProcessor) this.f$0;
                sendContentCaptureTextUpdateEvent sendcontentcapturetextupdateevent = (sendContentCaptureTextUpdateEvent) this.f$1;
                if (((DragAndDropNodeacceptDragAndDropTransfer1) emojiProcessor.serializer).get() == 0) {
                    sendcontentcapturetextupdateevent.invoke();
                }
                return createFromParcel.INSTANCE;
            case 5:
                relocationOffsetfbGrOKE relocationoffsetfbgroke = (relocationOffsetfbGrOKE) this.f$0;
                getCreditCardSecurityCode getcreditcardsecuritycode = (getCreditCardSecurityCode) this.f$1;
                Object[] objArr2 = relocationoffsetfbgroke.RemoteActionCompatParcelizer;
                long[] jArr = relocationoffsetfbgroke.IconCompatParcelizer;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    getcreditcardsecuritycode.IconCompatParcelizer(objArr2[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 == 8) {
                                if (i2 != length) {
                                    i2++;
                                }
                            }
                        } else if (i2 != length) {
                            i2++;
                        }
                    }
                }
                return createFromParcel.INSTANCE;
            case 6:
                Recomposer$$ExternalSyntheticLambda4 recomposer$$ExternalSyntheticLambda4 = (Recomposer$$ExternalSyntheticLambda4) this.f$0;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f$1;
                synchronized (iterator.MediaDescriptionCompat) {
                    LinkedHashMap linkedHashMap = iterator.write;
                    linkedHashMap.remove(recomposer$$ExternalSyntheticLambda4);
                    if (linkedHashMap.isEmpty()) {
                        setRotationX setrotationx = setRotationX.read();
                        int i5 = forEachui_graphics.IconCompatParcelizer;
                        setrotationx.getClass();
                        connectivityManager.unregisterNetworkCallback(iterator.IconCompatParcelizer);
                        iterator.serializer = null;
                        iterator.read = null;
                        iterator.RemoteActionCompatParcelizer = false;
                    }
                    break;
                }
                return createFromParcel.INSTANCE;
            case 7:
                return b2.a((b2) this.f$0, (String) this.f$1);
            case 8:
                return hg.a((String) this.f$0, (isRoot) this.f$1);
            case 9:
                return jh.a((Context) this.f$0, (jh) this.f$1);
            case 10:
                return o2.a((o2) this.f$0, (af) this.f$1);
            case 11:
                return o2.a((o2) this.f$0, (JSONArray) this.f$1);
            case 12:
                return w6.a((createInAppMessageEventSubscriber) this.f$0, (createInAppMessageEventSubscriber) this.f$1);
            case 13:
                return x7.a((Class) this.f$0, (Set) this.f$1);
            case 14:
                return zc.a((List) this.f$0, (ArrayList) this.f$1);
            case 15:
                return (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{new onViewAttachedToWindowlambda0((toSvg) this.f$0, (r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) this.f$1)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
            case 16:
                return Braze._set_registeredPushToken_$lambda$1((Braze) this.f$0, (String) this.f$1);
            case 17:
                return Braze._init_$lambda$3((Braze) this.f$0, (Context) this.f$1);
            case 18:
                return BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$0$1((String) this.f$0, (BrazeUserChangeEvent) this.f$1);
            case 19:
                PerseusEvent perseusEvent = (PerseusEvent) this.f$0;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.f$1;
                LinkedHashSet linkedHashSet = PerseusApp.write;
                perseusEvent.appending("perseusHitMatchId", perseusEvent.getHitMatchId().RemoteActionCompatParcelizer);
                perseusEvent.appending("eventAction", perseusEvent.getEventAction());
                perseusEvent.appending("perseusDataSource", perseusEvent.getPerseusDataSource());
                addPathoIyEayM addpathoiyeaym = updateRenderPath.write;
                addpathoiyeaym.getClass();
                ConcurrentHashMap concurrentHashMap2 = addPathoIyEayM.RemoteActionCompatParcelizer;
                Map mapSerializer2 = onMove.serializer(concurrentHashMap2);
                String eventAction = perseusEvent.getEventAction();
                int i6 = Perseus.serializer;
                eventAction.getClass();
                if (eventAction.length() == 0) {
                    mapSerializer = onMove.serializer(concurrentHashMap2);
                } else {
                    synchronized (addpathoiyeaym) {
                        ConcurrentHashMap concurrentHashMap3 = addPathoIyEayM.serializer;
                        concurrentHashMap = (Map) concurrentHashMap3.get(eventAction);
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                            concurrentHashMap3.put(eventAction, concurrentHashMap);
                        }
                        break;
                    }
                    mapSerializer = onMove.serializer(concurrentHashMap);
                }
                return BuildersKt.RemoteActionCompatParcelizer(YieldKt.RemoteActionCompatParcelizer(updateRenderPath.MediaMetadataCompat.plus(UrlUtils.serializer())), null, null, new AsyncImagePainter$launchJob$1(onMove.RemoteActionCompatParcelizer(onMove.RemoteActionCompatParcelizer(mapSerializer2, mapSerializer), perseusEvent.getParams()), perseusEvent, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, 12), 3);
            case 20:
                MainPresenter mainPresenter = (MainPresenter) this.f$0;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.f$1;
                mainPresenter.MediaDescriptionCompat = false;
                if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                }
                return null;
            case 21:
                View view = (View) this.f$0;
                forEachFocusableIntersection foreachfocusableintersection = (forEachFocusableIntersection) this.f$1;
                view.performHapticFeedback(1);
                foreachfocusableintersection.PlaybackStateCompatCustomAction.serializer(ExecuteDelayed.IconCompatParcelizer);
                EmptyFillMeasurePolicymeasure1 emptyFillMeasurePolicymeasure1 = foreachfocusableintersection.write;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = emptyFillMeasurePolicymeasure1.write;
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new DiskLruCache$launchCleanup$1(emptyFillMeasurePolicymeasure1, objArr == true ? 1 : 0, 16), 2);
                return createFromParcel.INSTANCE;
            case 22:
                ((subscribeToBannersErrorslambda0) ((RouterLogger) this.f$0).read).IconCompatParcelizer.getContentResolver().unregisterContentObserver((accessgetStaticcp) this.f$1);
                return createFromParcel.INSTANCE;
            case 23:
                return ((openSessionlambda0) this.f$0).serializer(((WorkNowUiModelImpl) this.f$1).IconCompatParcelizer);
            case 24:
                return ((openSessionlambda0) this.f$0).serializer(((WorkNowWithBonusUiModelImpl) this.f$1).read);
            case 25:
                return ((getSystemWindowInsets) this.f$0).RemoteActionCompatParcelizer(((WorkNowWithBonusUiModelImpl) this.f$1).read);
            case 26:
                return ((openSessionlambda0) this.f$0).serializer(((WorkNowWithInfraBoostUiModelImpl) this.f$1).write);
            case 27:
                return ((getSystemWindowInsets) this.f$0).RemoteActionCompatParcelizer(((WorkNowWithInfraBoostUiModelImpl) this.f$1).write);
            case 28:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.f$0).invoke((createNotificationChannelGroupsCompat) this.f$1);
                return createFromParcel.INSTANCE;
            default:
                IncogniaInitializerImpl incogniaInitializerImpl = (IncogniaInitializerImpl) this.f$0;
                String str = (String) this.f$1;
                Incognia.init$default(incogniaInitializerImpl.IconCompatParcelizer, null, 2, null);
                Incognia.setLocationEnabled(false);
                incogniaInitializerImpl.read.set(true);
                if (str.length() > 0) {
                    mapSingletonMap = Collections.singletonMap("source", str);
                    mapSingletonMap.getClass();
                }
                incogniaInitializerImpl.write.logEvent("incognia_initialized", mapSingletonMap);
                return createFromParcel.INSTANCE;
        }
    }
}
