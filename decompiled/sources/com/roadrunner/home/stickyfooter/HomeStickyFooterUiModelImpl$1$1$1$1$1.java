package com.roadrunner.home.stickyfooter;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.CombinedScopeView;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.accesssafeCallFlushDelayedInitPushAnalyticsQueue;
import o.accesssetCustomBrazeNotificationFactorycp;
import o.accesssetDeviceDataProvidercp;
import o.changeUserlambda1;
import o.createFromParcel;
import o.f8;
import o.f9;
import o.fd;
import o.g0ExternalSyntheticLambda1;
import o.g5;
import o.gExternalSyntheticLambda1;
import o.getQueryParameterslambda2;
import o.setLastHorizontalStyle;
import o.setPrevious;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeStickyFooterUiModelImpl$1$1$1$1$1 implements FlowCollector {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ HomeStickyFooterUiModelImpl$1$1$1$1$1(Object obj, int i, Object obj2) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    private final Object emit$com$roadrunner$startingarea$map$GetStartingAreaMapLayer$invoke$$inlined$map$1$2(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        changeUserlambda1 changeuserlambda1;
        f9 f9Var;
        ArrayList arrayList;
        int i;
        int i2 = 2 % 2;
        int i3 = read + 61;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            if (shortNewsContentCardView instanceof changeUserlambda1) {
                changeuserlambda1 = (changeUserlambda1) shortNewsContentCardView;
                int i4 = changeuserlambda1.serializer;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    changeuserlambda1.serializer = i4 - Integer.MIN_VALUE;
                } else {
                    changeuserlambda1 = new changeUserlambda1(this, shortNewsContentCardView);
                }
            } else {
                changeuserlambda1 = new changeUserlambda1(this, shortNewsContentCardView);
            }
            Object obj2 = changeuserlambda1.write;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = changeuserlambda1.serializer;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                FlowCollector flowCollector = (FlowCollector) this.RemoteActionCompatParcelizer;
                accesssetCustomBrazeNotificationFactorycp accesssetcustombrazenotificationfactorycp = (accesssetCustomBrazeNotificationFactorycp) obj;
                if (accesssetcustombrazenotificationfactorycp == null) {
                    f9Var = new f9((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{new g0ExternalSyntheticLambda1(g5.ALWAYS)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()));
                } else {
                    int i6 = read + 33;
                    write = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        if (accesssetcustombrazenotificationfactorycp.IconCompatParcelizer != accesssetDeviceDataProvidercp.ZONE_BOUNDARY) {
                            g0ExternalSyntheticLambda1 g0externalsyntheticlambda1 = new g0ExternalSyntheticLambda1(g5.ALWAYS);
                            int iM776toArgb8_81llA = ColorKt.m776toArgb8_81llA(((setLastHorizontalStyle) ((CombinedScopeView) this.IconCompatParcelizer).read).IconCompatParcelizer().read());
                            ArrayList<accesssafeCallFlushDelayedInitPushAnalyticsQueue> arrayList2 = accesssetcustombrazenotificationfactorycp.RemoteActionCompatParcelizer;
                            arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
                            for (accesssafeCallFlushDelayedInitPushAnalyticsQueue accesssafecallflushdelayedinitpushanalyticsqueue : arrayList2) {
                                arrayList.add(new f8(accesssafecallflushdelayedinitpushanalyticsqueue.write(), accesssafecallflushdelayedinitpushanalyticsqueue.IconCompatParcelizer()));
                                i = write + 113;
                                read = i % Fields.SpotShadowColor;
                                if (i % 2 != 0) {
                                    int i7 = 5 % 5;
                                }
                            }
                            f9Var = new f9(SQLite.read(g0externalsyntheticlambda1, new gExternalSyntheticLambda1(arrayList, 2.0d, iM776toArgb8_81llA, setPrevious.write(iM776toArgb8_81llA, 48), g5.ALWAYS, new fd(), 16)));
                        } else {
                            f9Var = new f9((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{new g0ExternalSyntheticLambda1(g5.ALWAYS)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()));
                        }
                    } else {
                        int i8 = 56 / 0;
                        if (accesssetcustombrazenotificationfactorycp.IconCompatParcelizer != accesssetDeviceDataProvidercp.ZONE_BOUNDARY) {
                            g0ExternalSyntheticLambda1 g0externalsyntheticlambda2 = new g0ExternalSyntheticLambda1(g5.ALWAYS);
                            int iM776toArgb8_81llA2 = ColorKt.m776toArgb8_81llA(((setLastHorizontalStyle) ((CombinedScopeView) this.IconCompatParcelizer).read).IconCompatParcelizer().read());
                            ArrayList<accesssafeCallFlushDelayedInitPushAnalyticsQueue> arrayList3 = accesssetcustombrazenotificationfactorycp.RemoteActionCompatParcelizer;
                            arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayList3, 10));
                            while (r4.hasNext()) {
                                arrayList.add(new f8(accesssafecallflushdelayedinitpushanalyticsqueue.write(), accesssafecallflushdelayedinitpushanalyticsqueue.IconCompatParcelizer()));
                                i = write + 113;
                                read = i % Fields.SpotShadowColor;
                                if (i % 2 != 0) {
                                    int i9 = 5 % 5;
                                }
                            }
                            f9Var = new f9(SQLite.read(g0externalsyntheticlambda2, new gExternalSyntheticLambda1(arrayList, 2.0d, iM776toArgb8_81llA2, setPrevious.write(iM776toArgb8_81llA2, 48), g5.ALWAYS, new fd(), 16)));
                        } else {
                            f9Var = new f9((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{new g0ExternalSyntheticLambda1(g5.ALWAYS)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()));
                        }
                    }
                }
                changeuserlambda1.serializer = 1;
                if (flowCollector.emit(f9Var, changeuserlambda1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i5 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            return createFromParcel.INSTANCE;
        }
        boolean z = shortNewsContentCardView instanceof changeUserlambda1;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:54:0x0104  */
    /* JADX WARN: Code duplicated, block: B:57:0x011b A[LOOP:1: B:55:0x0115->B:57:0x011b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x013a  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0023 A[PHI: r1
  0x0023: PHI (r1v6 coil3.ComponentRegistry$Builder) = (r1v5 coil3.ComponentRegistry$Builder), (r1v27 coil3.ComponentRegistry$Builder) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0145, code lost:
    
        if (r15.emit(r1, r3) == r4) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object emit$com$roadrunner$startingarea$data$StartingAreaRepository$getStartingArea$$inlined$map$1$2(java.lang.Object r14, o.ShortNewsContentCardView r15) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.home.stickyfooter.HomeStickyFooterUiModelImpl$1$1$1$1$1.emit$com$roadrunner$startingarea$data$StartingAreaRepository$getStartingArea$$inlined$map$1$2(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0264  */
    /* JADX WARN: Code duplicated, block: B:147:0x030b  */
    /* JADX WARN: Code duplicated, block: B:166:0x037e  */
    /* JADX WARN: Code duplicated, block: B:178:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:194:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:213:0x044d  */
    /* JADX WARN: Code duplicated, block: B:232:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:256:0x0594  */
    /* JADX WARN: Code duplicated, block: B:285:0x062b  */
    /* JADX WARN: Code duplicated, block: B:337:0x0759  */
    /* JADX WARN: Code duplicated, block: B:421:0x0946  */
    /* JADX WARN: Code duplicated, block: B:455:0x09f4  */
    /* JADX WARN: Code duplicated, block: B:473:0x0a6c  */
    /* JADX WARN: Code duplicated, block: B:487:0x0ac5  */
    /* JADX WARN: Code duplicated, block: B:498:0x0aee  */
    /* JADX WARN: Code duplicated, block: B:533:0x0b99  */
    /* JADX WARN: Code duplicated, block: B:562:0x0c21  */
    /* JADX WARN: Code duplicated, block: B:57:0x011c  */
    /* JADX WARN: Code duplicated, block: B:662:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ee  */
    /* JADX WARN: Type inference failed for: r2v124 */
    /* JADX WARN: Type inference failed for: r2v128, types: [java.util.Collection, java.util.Iterator, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r2v131 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01b1 -> B:74:0x01b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object r44, o.ShortNewsContentCardView r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.home.stickyfooter.HomeStickyFooterUiModelImpl$1$1$1$1$1.emit(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
    }
}
