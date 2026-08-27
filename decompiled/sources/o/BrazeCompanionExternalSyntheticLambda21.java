package o;

import android.content.Intent;
import android.net.Uri;
import bo.app.af$$ExternalSyntheticOutline1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.mapbox.maps.plugin.locationcomponent.LocationProvider;
import com.roadrunner.login.presentation.LoginActivity;
import com.roadrunner.login.presentation.router.RouterActivity;
import com.sentiance.core.model.events.I$b;
import com.sentiance.core.model.events.R0$b;
import com.sentiance.core.model.thrift.O$b;
import io.socket.parser.IOParser$Decoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import org.joda.time.DateTime;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeCompanionExternalSyntheticLambda21 implements TransacterDefaultImpls, LocationProvider, r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int write;

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationProvider
    public void registerLocationConsumer(LocationComponentPluginImpl locationComponentPluginImpl) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationProvider
    public void unRegisterLocationConsumer(LocationComponentPluginImpl locationComponentPluginImpl) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 97;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ BrazeCompanionExternalSyntheticLambda21(int i) {
        this.write = i;
    }

    public Intent read(androidx.activity.ComponentActivity componentActivity) {
        int i = 2 % 2;
        Intent intent = new Intent(componentActivity, (Class<?>) LoginActivity.class);
        intent.setFlags(67108864);
        int i2 = IconCompatParcelizer + 109;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return intent;
    }

    @Override // o.TransacterDefaultImpls
    public void IconCompatParcelizer(RouterActivity routerActivity, Uri uri) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Intent intent = read(routerActivity);
        if (uri != null) {
            intent.putExtra("deeplinkUri", uri);
        }
        routerActivity.startActivity(intent);
        int i4 = RemoteActionCompatParcelizer + 5;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        return new o.r8lambdam8zKDGVczFsFTURUOoSF_afmF0(r4, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (o.setCarryoverInAppMessage.RemoteActionCompatParcelizer(r4, "roadrunner://web-integration", false) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        return new o.r8lambdal_FwgRU_WvotLRXDsO9ikjmB4o(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        r5 = new o.r8lambdamcioKCS7zG0FxR0ccpXoY9T79ZQ(r4);
        r4 = o.BrazeCompanionExternalSyntheticLambda21.RemoteActionCompatParcelizer + 37;
        o.BrazeCompanionExternalSyntheticLambda21.IconCompatParcelizer = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (o.setCarryoverInAppMessage.RemoteActionCompatParcelizer(r4, "https://", true) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (o.setCarryoverInAppMessage.RemoteActionCompatParcelizer(r4, "https://", false) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o.r8lambdaltZ1uNITaEov9GRvWdNWxxSy0k IconCompatParcelizer(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.BrazeCompanionExternalSyntheticLambda21.IconCompatParcelizer
            int r1 = r1 + 3
            int r2 = r1 % 128
            o.BrazeCompanionExternalSyntheticLambda21.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "https://"
            if (r1 != 0) goto L1c
            bo.app.af$$ExternalSyntheticOutline0.m3978m(r4, r5, r6)
            r1 = 1
            boolean r1 = o.setCarryoverInAppMessage.RemoteActionCompatParcelizer(r4, r3, r1)
            if (r1 == 0) goto L2b
            goto L25
        L1c:
            bo.app.af$$ExternalSyntheticOutline0.m3978m(r4, r5, r6)
            boolean r1 = o.setCarryoverInAppMessage.RemoteActionCompatParcelizer(r4, r3, r2)
            if (r1 == 0) goto L2b
        L25:
            o.r8lambdam8zKDGVczFsFTURUOoSF_afmF0 r5 = new o.r8lambdam8zKDGVczFsFTURUOoSF_afmF0
            r5.<init>(r4, r6)
            return r5
        L2b:
            java.lang.String r1 = "roadrunner://web-integration"
            boolean r1 = o.setCarryoverInAppMessage.RemoteActionCompatParcelizer(r4, r1, r2)
            if (r1 == 0) goto L39
            o.r8lambdal_FwgRU_WvotLRXDsO9ikjmB4o r0 = new o.r8lambdal_FwgRU_WvotLRXDsO9ikjmB4o
            r0.<init>(r4, r5, r6)
            return r0
        L39:
            o.r8lambdamcioKCS7zG0FxR0ccpXoY9T79ZQ r5 = new o.r8lambdamcioKCS7zG0FxR0ccpXoY9T79ZQ
            r5.<init>(r4)
            int r4 = o.BrazeCompanionExternalSyntheticLambda21.RemoteActionCompatParcelizer
            int r4 = r4 + 37
            int r6 = r4 % 128
            o.BrazeCompanionExternalSyntheticLambda21.IconCompatParcelizer = r6
            int r4 = r4 % r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BrazeCompanionExternalSyntheticLambda21.IconCompatParcelizer(java.lang.String, java.lang.String, java.lang.String):o.r8lambdaltZ1uNITaEov9GRvWdNWxxSy0k");
    }

    public static ArrayList write(String str) {
        List list;
        int i = 2;
        int i2 = 2 % 2;
        str.getClass();
        try {
            r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = getModulateAlphake2Ky5w.serializer;
            r8lambda3kmch7yklpui_5smgazrgczhglc.getClass();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(new setWasCloseMessageCalled(xf.Companion.serializer(), 0));
            list = (List) r8lambda3kmch7yklpui_5smgazrgczhglc.serializer(str, setgraphicmodalmaxwidthdp);
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.write(new Throwable(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n                         |Error in deserializing the JSON data in type converter\n                         |json value = " + str + "\n                        "), e));
            list = null;
        }
        if (list == null) {
            list = instance_delegatelambda0.write;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int i3 = IconCompatParcelizer + 121;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % i;
            xf xfVar = (xf) it.next();
            xfVar.getClass();
            long j = xfVar.id;
            String str2 = xfVar.confirmationNumber;
            int i5 = xfVar.vendorOrderNumber;
            zExternalSyntheticLambda0 zexternalsyntheticlambda0 = xfVar.vendor;
            yf yfVar = xfVar.customer;
            zExternalSyntheticLambda1 zexternalsyntheticlambda1 = xfVar.payment;
            yb ybVar = xfVar.cashCollection;
            List list3 = xfVar.items;
            double d = xfVar.distance;
            Long l = xfVar.completedAt;
            arrayList.add(new y2(j, str2, i5, zexternalsyntheticlambda0, yfVar, zexternalsyntheticlambda1, ybVar, list3, d, l != null ? new DateTime(l.longValue()) : null));
            it = it;
            i = 2;
        }
        int i6 = RemoteActionCompatParcelizer + 51;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return arrayList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        int i = 2 % 2;
        int i2 = this.write;
        BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21 = BrazeCompanionExternalSyntheticLambda4.IconCompatParcelizer;
        if (i2 == 0) {
            while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
            }
            return new setStaticExternalIEventMessengerandroid_sdk_base_release();
        }
        short s = 5;
        byte b = 13;
        int i3 = 4;
        switch (i2) {
            case 14:
                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                }
                return new getShouldRequestFrameworkListenToNetworkUpdatesandroid_sdk_base_release();
            case 15:
                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                }
                return new getStaticExternalIEventMessengerandroid_sdk_base_release();
            case 16:
                I$b i$b = new I$b(0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.getClass();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
                    if (b2 == 0) {
                        return i$b.read();
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                        case 1:
                            if (b2 == 10) {
                                i$b.IconCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 2:
                            if (b2 == 8) {
                                i$b.read = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 3:
                            if (b2 == 8) {
                                i$b.serializer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 4:
                            if (b2 == 6) {
                                i$b.write = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 5:
                            if (b2 == 6) {
                                i$b.RemoteActionCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 6:
                            if (b2 == 6) {
                                i$b.MediaDescriptionCompat = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 7:
                            if (b2 == 6) {
                                i$b.RatingCompat = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 8:
                            if (b2 == 6) {
                                i$b.MediaMetadataCompat = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 9:
                            if (b2 == 3) {
                                i$b.MediaSessionCompatQueueItem = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 10:
                            if (b2 == 6) {
                                int i4 = RemoteActionCompatParcelizer + 113;
                                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i5 = i4 % 2;
                                i$b.MediaBrowserCompatMediaItem = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 11:
                            if (b2 == 6) {
                                int i6 = RemoteActionCompatParcelizer + 71;
                                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i7 = i6 % 2;
                                i$b.MediaSessionCompatResultReceiverWrapper = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 12:
                            if (b2 == 6) {
                                i$b.PlaybackStateCompat = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            break;
                    }
                }
                break;
            case 17:
                r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk r8lambdamlvle2kr5fvc3vtodzmadfjxk = new r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b3 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.RemoteActionCompatParcelizer;
                    if (b3 == 0) {
                        int i8 = RemoteActionCompatParcelizer + 119;
                        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        if (r8lambdamlvle2kr5fvc3vtodzmadfjxk.write != null) {
                            return new r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU(r8lambdamlvle2kr5fvc3vtodzmadfjxk);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'location' is missing");
                        return null;
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                    } else if (b3 == 12) {
                        r8lambdamlvle2kr5fvc3vtodzmadfjxk.write = (BrazeCompanionExternalSyntheticLambda4) brazeCompanionExternalSyntheticLambda21.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                    }
                }
                break;
            case 18:
                r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm = new r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b4 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.RemoteActionCompatParcelizer;
                    if (b4 == 0) {
                        if (r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer != null) {
                            return new onActivityPausedlambda1(r8lambdaxdc9yg9rrx23qvlbekkfzieitwm);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'status' is missing");
                        return null;
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                    } else if (b4 == 3) {
                        int i10 = RemoteActionCompatParcelizer + 79;
                        IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i10 % 2 != 0) {
                            r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            int i11 = 64 / 0;
                        } else {
                            r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                        }
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                    }
                }
                break;
            case 19:
                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                }
                return new onActivityStartedlambda0();
            case 20:
                R0$b r0$b = new R0$b();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b5 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.RemoteActionCompatParcelizer;
                    if (b5 == 0) {
                        if (r0$b.read != null) {
                            return new getShouldPersistWebView(r0$b);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'metadata' is missing");
                        return null;
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                    } else if (b5 == 13) {
                        int i12 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                        HashMap map = new HashMap(i12);
                        int iWrite = 0;
                        while (iWrite < i12) {
                            iWrite = getBitmapFromCache.write(r8lambdat7xjd1d4humw0psb7whucfgonss, map, r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(), iWrite, 1);
                        }
                        r0$b.read = map;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                    }
                }
                break;
            case 21:
                setInAppMessagingRegistrationBlocklist setinappmessagingregistrationblocklist = new setInAppMessagingRegistrationBlocklist();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b6 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5.RemoteActionCompatParcelizer;
                    if (b6 == 0) {
                        if (setinappmessagingregistrationblocklist.RemoteActionCompatParcelizer != null) {
                            return new shouldHandleLifecycleMethodsInActivity(setinappmessagingregistrationblocklist);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'trip_id' is missing");
                        return null;
                    }
                    short s2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5.serializer;
                    if (s2 != 1) {
                        int i13 = RemoteActionCompatParcelizer + 109;
                        IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        if (s2 != 2) {
                            if (s2 != 3) {
                                if (s2 != 4) {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                                } else if (b6 == 10) {
                                    setinappmessagingregistrationblocklist.IconCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                                }
                            } else if (b6 == 10) {
                                setinappmessagingregistrationblocklist.serializer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                        } else if (b6 == 15) {
                            int i15 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                            ArrayList arrayList = new ArrayList(i15);
                            for (int i16 = 0; i16 < i15; i16++) {
                                arrayList.add((r8lambdaYCpCax7c0Cs_kAm0o8Re2fZmjhE) r8lambdaYCpCax7c0Cs_kAm0o8Re2fZmjhE.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            }
                            setinappmessagingregistrationblocklist.read = arrayList;
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                        }
                    } else if (b6 == 11) {
                        setinappmessagingregistrationblocklist.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                    }
                }
                break;
            case 22:
                r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk r8lambdamlvle2kr5fvc3vtodzmadfjxk2 = new r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b7 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6.RemoteActionCompatParcelizer;
                    if (b7 == 0) {
                        if (r8lambdamlvle2kr5fvc3vtodzmadfjxk2.write != null) {
                            return new BrazeActivityLifecycleCallbackListeneronActivityCreated2(r8lambdamlvle2kr5fvc3vtodzmadfjxk2);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'location' is missing");
                        return null;
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                    } else if (b7 == 12) {
                        r8lambdamlvle2kr5fvc3vtodzmadfjxk2.write = (BrazeCompanionExternalSyntheticLambda4) brazeCompanionExternalSyntheticLambda21.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                    }
                }
                break;
            case 23:
                O$b o$b = new O$b();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b8 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7.RemoteActionCompatParcelizer;
                    if (b8 == 0) {
                        return o$b.read();
                    }
                    short s3 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7.serializer;
                    if (s3 != 1) {
                        if (s3 != 2) {
                            if (s3 != 3) {
                                int i17 = IconCompatParcelizer + 23;
                                RemoteActionCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i18 = i17 % 2;
                                if (s3 != 4) {
                                    if (s3 != 5) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                                    } else if (b8 == 2) {
                                        o$b.IconCompatParcelizer = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                                    }
                                } else if (b8 == 8) {
                                    o$b.read = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                                }
                            } else if (b8 == 8) {
                                o$b.serializer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                            }
                        } else if (b8 == 2) {
                            o$b.RemoteActionCompatParcelizer = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                        }
                    } else if (b8 == 10) {
                        o$b.write = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                    }
                }
                break;
            case 24:
                r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(i3);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b9 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8.RemoteActionCompatParcelizer;
                    if (b9 == 0) {
                        if (r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer != null) {
                            return new handleIncomingIntentlambda2(r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'thread_dump' is missing");
                        return null;
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8.serializer != 1) {
                        int i19 = IconCompatParcelizer + 69;
                        RemoteActionCompatParcelizer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i20 = i19 % 2;
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                    } else if (b9 == 11) {
                        r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                    }
                }
                break;
            case 25:
                r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk r8lambdamlvle2kr5fvc3vtodzmadfjxk3 = new r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b10 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9.RemoteActionCompatParcelizer;
                    if (b10 == 0) {
                        if (r8lambdamlvle2kr5fvc3vtodzmadfjxk3.write != null) {
                            return new r8lambdaCZkUcdbCfyQviN9woG5_oLGdyQ(r8lambdamlvle2kr5fvc3vtodzmadfjxk3);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'location' is missing");
                        return null;
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                    } else if (b10 == 12) {
                        r8lambdamlvle2kr5fvc3vtodzmadfjxk3.write = (BrazeCompanionExternalSyntheticLambda4) brazeCompanionExternalSyntheticLambda21.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                    }
                }
                break;
            case 26:
                O$b o$b2 = new O$b();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b11 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10.RemoteActionCompatParcelizer;
                    if (b11 == 0) {
                        return o$b2.RemoteActionCompatParcelizer();
                    }
                    short s4 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10.serializer;
                    if (s4 != 1) {
                        if (s4 != 2) {
                            if (s4 != 3) {
                                if (s4 != 4) {
                                    if (s4 != 5) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                                    } else if (b11 == 13) {
                                        int i21 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                                        HashMap map2 = new HashMap(i21);
                                        for (int i22 = 0; i22 < i21; i22++) {
                                            int i23 = RemoteActionCompatParcelizer + 21;
                                            IconCompatParcelizer = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i24 = i23 % 2;
                                            map2.put(Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat()), Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer()));
                                        }
                                        o$b2.IconCompatParcelizer = map2;
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                                    }
                                } else if (b11 == 15) {
                                    int i25 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                    ArrayList arrayList2 = new ArrayList(i25);
                                    for (int i26 = 0; i26 < i25; i26++) {
                                        int i27 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                        ArrayList arrayList3 = new ArrayList(i27);
                                        for (int i28 = 0; i28 < i27; i28++) {
                                            arrayList3.add(Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken()));
                                        }
                                        arrayList2.add(arrayList3);
                                    }
                                    o$b2.read = arrayList2;
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                                }
                            } else if (b11 == 15) {
                                int i29 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                ArrayList arrayList4 = new ArrayList(i29);
                                int i30 = RemoteActionCompatParcelizer + 47;
                                IconCompatParcelizer = i30 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i31 = i30 % 2;
                                for (int i32 = 0; i32 < i29; i32++) {
                                    arrayList4.add(Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken()));
                                }
                                o$b2.serializer = arrayList4;
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                            }
                        } else if (b11 == 10) {
                            int i33 = IconCompatParcelizer + 91;
                            RemoteActionCompatParcelizer = i33 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i34 = i33 % 2;
                            o$b2.write = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                        }
                    } else if (b11 == 3) {
                        o$b2.RemoteActionCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                    }
                }
                break;
            case 27:
                IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b12 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11.RemoteActionCompatParcelizer;
                    if (b12 == 0) {
                        return new addBannerViewMonitor(iOParser$Decoder);
                    }
                    short s5 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11.serializer;
                    if (s5 != 1) {
                        if (s5 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                        } else if (b12 == 2) {
                            iOParser$Decoder.read = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                        }
                    } else if (b12 == 12) {
                        iOParser$Decoder.RemoteActionCompatParcelizer = (validateAndStorePushId) validateAndStorePushId.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                    }
                }
                break;
            case 28:
                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                }
                return new unsubscribeFromBannersDismissedEvent();
            default:
                O$b o$b3 = new O$b();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b13 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12.RemoteActionCompatParcelizer;
                    if (b13 == 0) {
                        return o$b3.IconCompatParcelizer();
                    }
                    short s6 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12.serializer;
                    if (s6 != 1) {
                        if (s6 != 2) {
                            if (s6 != 3) {
                                if (s6 != 4) {
                                    if (s6 != s) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                                    } else if (b13 == b) {
                                        int i35 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                                        HashMap map3 = new HashMap(i35);
                                        for (int i36 = 0; i36 < i35; i36++) {
                                            map3.put(Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat()), Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer()));
                                        }
                                        o$b3.IconCompatParcelizer = map3;
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                                    }
                                } else if (b13 == 15) {
                                    int i37 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                    ArrayList arrayList5 = new ArrayList(i37);
                                    for (int i38 = 0; i38 < i37; i38++) {
                                        int i39 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                        ArrayList arrayList6 = new ArrayList(i39);
                                        for (int i40 = 0; i40 < i39; i40++) {
                                            arrayList6.add(Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken()));
                                        }
                                        arrayList5.add(arrayList6);
                                    }
                                    o$b3.read = arrayList5;
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                                }
                            } else if (b13 == 15) {
                                int i41 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                ArrayList arrayList7 = new ArrayList(i41);
                                for (int i42 = 0; i42 < i41; i42++) {
                                    arrayList7.add(Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken()));
                                }
                                o$b3.serializer = arrayList7;
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                            }
                        } else if (b13 == 10) {
                            o$b3.write = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                        }
                    } else if (b13 == 3) {
                        o$b3.RemoteActionCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                    }
                    s = 5;
                    b = 13;
                }
                break;
        }
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) throws IOException {
        int i = 2 % 2;
        int i2 = this.write;
        BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21 = BrazeCompanionExternalSyntheticLambda4.IconCompatParcelizer;
        if (i2 == 0) {
            r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
            return;
        }
        switch (i2) {
            case 14:
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                return;
            case 15:
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                return;
            case 16:
                BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = (BrazeCompanionExternalSyntheticLambda4) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.getClass();
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                Long l = brazeCompanionExternalSyntheticLambda4.RemoteActionCompatParcelizer;
                Short sh = brazeCompanionExternalSyntheticLambda4.PlaybackStateCompat;
                Short sh2 = brazeCompanionExternalSyntheticLambda4.ParcelableVolumeInfo;
                Short sh3 = brazeCompanionExternalSyntheticLambda4.PlaybackStateCompatCustomAction;
                Byte b = brazeCompanionExternalSyntheticLambda4.MediaDescriptionCompat;
                Short sh4 = brazeCompanionExternalSyntheticLambda4.RatingCompat;
                Short sh5 = brazeCompanionExternalSyntheticLambda4.MediaMetadataCompat;
                Short sh6 = brazeCompanionExternalSyntheticLambda4.MediaBrowserCompatMediaItem;
                Short sh7 = brazeCompanionExternalSyntheticLambda4.MediaSessionCompatQueueItem;
                IconCompatParcelizer.serializer(l, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 8);
                SweepGradientShader9KIMszodefault.write(brazeCompanionExternalSyntheticLambda4.read, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 8);
                r8lambdat7xjd1d4humw0psb7whucfgonss.read(brazeCompanionExternalSyntheticLambda4.write.intValue());
                Short sh8 = brazeCompanionExternalSyntheticLambda4.serializer;
                if (sh8 != null) {
                    int i3 = RemoteActionCompatParcelizer + 85;
                    IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 23, 4, r8lambdat7xjd1d4humw0psb7whucfgonss, sh8);
                    } else {
                        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 4, r8lambdat7xjd1d4humw0psb7whucfgonss, sh8);
                    }
                }
                if (sh7 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 5, r8lambdat7xjd1d4humw0psb7whucfgonss, sh7);
                }
                if (sh6 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 6, r8lambdat7xjd1d4humw0psb7whucfgonss, sh6);
                }
                if (sh5 != null) {
                    int i4 = RemoteActionCompatParcelizer + 57;
                    IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 7, r8lambdat7xjd1d4humw0psb7whucfgonss, sh5);
                }
                if (sh4 != null) {
                    int i6 = IconCompatParcelizer + 39;
                    RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 48, 16, r8lambdat7xjd1d4humw0psb7whucfgonss, sh4);
                    } else {
                        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 8, r8lambdat7xjd1d4humw0psb7whucfgonss, sh4);
                    }
                }
                if (b != null) {
                    getBitmapFromCache.read((byte) 3, 9, r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
                if (sh3 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 10, r8lambdat7xjd1d4humw0psb7whucfgonss, sh3);
                }
                if (sh2 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 11, r8lambdat7xjd1d4humw0psb7whucfgonss, sh2);
                }
                if (sh != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 12, r8lambdat7xjd1d4humw0psb7whucfgonss, sh);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                return;
            case 17:
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, ((r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU) obj).RemoteActionCompatParcelizer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                return;
            case 18:
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                IconCompatParcelizer.IconCompatParcelizer(((onActivityPausedlambda1) obj).IconCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 0);
                return;
            case 19:
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                return;
            case 20:
                getShouldPersistWebView getshouldpersistwebview = (getShouldPersistWebView) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 13);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer((byte) 11, (byte) 11, getshouldpersistwebview.serializer.size());
                Iterator it = getshouldpersistwebview.serializer.entrySet().iterator();
                while (!(!it.hasNext())) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str2);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                return;
            case 21:
                shouldHandleLifecycleMethodsInActivity shouldhandlelifecyclemethodsinactivity = (shouldHandleLifecycleMethodsInActivity) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                String str3 = shouldhandlelifecyclemethodsinactivity.read;
                Long l2 = shouldhandlelifecyclemethodsinactivity.write;
                Long l3 = shouldhandlelifecyclemethodsinactivity.RemoteActionCompatParcelizer;
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(str3);
                List list = shouldhandlelifecyclemethodsinactivity.serializer;
                if (list != null) {
                    Iterator itWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 15, list, (byte) 12);
                    while (itWrite.hasNext()) {
                        int i7 = IconCompatParcelizer + 61;
                        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i7 % 2 == 0) {
                            r8lambdaYCpCax7c0Cs_kAm0o8Re2fZmjhE.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (r8lambdaYCpCax7c0Cs_kAm0o8Re2fZmjhE) itWrite.next());
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        r8lambdaYCpCax7c0Cs_kAm0o8Re2fZmjhE.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (r8lambdaYCpCax7c0Cs_kAm0o8Re2fZmjhE) itWrite.next());
                    }
                }
                if (l3 != null) {
                    int i8 = IconCompatParcelizer + 97;
                    RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 10);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(l3.longValue());
                }
                if (l2 != null) {
                    int i10 = RemoteActionCompatParcelizer + 69;
                    IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i10 % 2 != 0) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 77);
                    } else {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 10);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(l2.longValue());
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                return;
            case 22:
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, ((BrazeActivityLifecycleCallbackListeneronActivityCreated2) obj).read);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                return;
            case 23:
                invokeSuspendlambda1 invokesuspendlambda1 = (invokeSuspendlambda1) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                Long l4 = invokesuspendlambda1.IconCompatParcelizer;
                Integer num = invokesuspendlambda1.write;
                IconCompatParcelizer.serializer(l4, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 2);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(invokesuspendlambda1.read.booleanValue() ? (byte) 1 : (byte) 0);
                Integer num2 = invokesuspendlambda1.serializer;
                if (num2 != null) {
                    int i11 = IconCompatParcelizer + 87;
                    RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i11 % 2 == 0) {
                        SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 102, num2);
                    } else {
                        SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 8, num2);
                    }
                }
                if (num != null) {
                    int i12 = IconCompatParcelizer + 71;
                    RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i12 % 2 == 0) {
                        SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 22, num);
                    } else {
                        SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 8, num);
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 2);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(invokesuspendlambda1.MediaDescriptionCompat.booleanValue() ? (byte) 1 : (byte) 0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                return;
            case 24:
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(((handleIncomingIntentlambda2) obj).serializer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                int i13 = RemoteActionCompatParcelizer + 81;
                IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i14 = i13 % 2;
                return;
            case 25:
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, ((r8lambdaCZkUcdbCfyQviN9woG5_oLGdyQ) obj).serializer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                return;
            case 26:
                logLocationRecordedEvent loglocationrecordedevent = (logLocationRecordedEvent) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                Byte b2 = loglocationrecordedevent.serializer;
                List list2 = loglocationrecordedevent.read;
                Map map = loglocationrecordedevent.MediaSessionCompatQueueItem;
                af$$ExternalSyntheticOutline1.m((byte) 10, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                IconCompatParcelizer.serializer(loglocationrecordedevent.IconCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 15);
                List list3 = loglocationrecordedevent.write;
                r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 8, list3.size());
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.read(((Integer) it2.next()).intValue());
                }
                Iterator itWrite2 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 15, list2, (byte) 15);
                while (itWrite2.hasNext()) {
                    int i15 = IconCompatParcelizer + 75;
                    RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    List list4 = (List) itWrite2.next();
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 8, list4.size());
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.read(((Integer) it3.next()).intValue());
                    }
                }
                if (map != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 13);
                    Iterator itWrite3 = MediaSessionCompatQueueItem.write(map, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 3, (byte) 10);
                    while (itWrite3.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) itWrite3.next();
                        Byte b3 = (Byte) entry2.getKey();
                        Long l5 = (Long) entry2.getValue();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b3.byteValue());
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(l5.longValue());
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                return;
            case 27:
                addBannerViewMonitor addbannerviewmonitor = (addBannerViewMonitor) obj;
                validateAndStorePushId validateandstorepushid = addbannerviewmonitor.serializer;
                Boolean bool = addbannerviewmonitor.read;
                if (validateandstorepushid != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                    validateAndStorePushId validateandstorepushid2 = addbannerviewmonitor.serializer;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                    af$$ExternalSyntheticOutline1.m((byte) 10, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, validateandstorepushid2.write);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(validateandstorepushid2.read.longValue());
                    String str4 = validateandstorepushid2.serializer;
                    if (str4 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str4);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (bool != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 2, bool);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                return;
            case 28:
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                return;
            default:
                BrazeUser brazeUser = (BrazeUser) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                Byte b4 = brazeUser.write;
                List list5 = brazeUser.IconCompatParcelizer;
                Map map2 = brazeUser.MediaBrowserCompatMediaItem;
                af$$ExternalSyntheticOutline1.m((byte) 10, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                IconCompatParcelizer.serializer(brazeUser.RemoteActionCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 15);
                List list6 = brazeUser.serializer;
                r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 8, list6.size());
                Iterator it4 = list6.iterator();
                while (it4.hasNext()) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.read(((Integer) it4.next()).intValue());
                }
                Iterator itWrite4 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 15, list5, (byte) 15);
                while (itWrite4.hasNext()) {
                    List list7 = (List) itWrite4.next();
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 8, list7.size());
                    Iterator it5 = list7.iterator();
                    while (!(!it5.hasNext())) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.read(((Integer) it5.next()).intValue());
                    }
                }
                if (map2 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 13);
                    Iterator itWrite5 = MediaSessionCompatQueueItem.write(map2, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 3, (byte) 10);
                    while (itWrite5.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) itWrite5.next();
                        Byte b5 = (Byte) entry3.getKey();
                        Long l6 = (Long) entry3.getValue();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b5.byteValue());
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(l6.longValue());
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                return;
        }
    }
}
