package o;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.E$b;
import com.sentiance.core.model.events.N$b;
import com.sentiance.core.model.events.i$c;
import com.sentiance.core.model.thrift.E1$b;
import com.sentiance.core.model.thrift.O$b;
import io.sentry.util.network.NetworkBody;
import io.socket.parser.IOParser$Decoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(int i) {
        this.IconCompatParcelizer = i;
    }

    private final Object MediaSessionCompatQueueItem(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 = new BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.serializer();
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else if (b == 11) {
                        brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                } else if (b == 11) {
                    brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.write = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 11) {
                brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.serializer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    private final Object serializer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        FormBody.Builder builder = new FormBody.Builder();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return new gotoUri(builder);
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                } else if (b == 11) {
                    builder.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 11) {
                builder.serializer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    private final Object write(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        setUserId setuserid = new setUserId();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return new BrazeUserExternalSyntheticLambda0(setuserid);
            }
            switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                case 1:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 2:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.write = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 3:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.IconCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 4:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.serializer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 5:
                    if (b != 4) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.RemoteActionCompatParcelizer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    }
                    break;
                case 6:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.MediaMetadataCompat = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 7:
                    if (b != 4) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.MediaBrowserCompatMediaItem = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    }
                    break;
                case 8:
                    if (b != 2) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.MediaSessionCompatQueueItem = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                    }
                    break;
                case 9:
                    if (b != 2) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.MediaDescriptionCompat = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                    }
                    break;
                case 10:
                    if (b != 4) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.RatingCompat = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    }
                    break;
                case 11:
                    if (b != 4) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.PlaybackStateCompatCustomAction = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    }
                    break;
                case 12:
                    if (b != 4) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.MediaSessionCompatResultReceiverWrapper = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    }
                    break;
                case 13:
                    if (b != 4) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.MediaSessionCompatToken = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    }
                    break;
                case 14:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.ParcelableVolumeInfo = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 15:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.PlaybackStateCompat = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 16:
                    if (b != 4) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    }
                    break;
                case 17:
                    if (b != 4) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.ComponentActivity = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    }
                    break;
                case 18:
                    if (b != 4) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    }
                    break;
                case 19:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.ResultReceiver = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 20:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 21:
                    if (b != 11) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    }
                    break;
                case 22:
                    if (b != 4) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        setuserid.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    }
                    break;
                default:
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    break;
            }
        }
    }

    private final Object IconCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        E$b e$b = new E$b(13);
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return e$b.write();
            }
            int i = 0;
            switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                case 1:
                    if (b == 11) {
                        e$b.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 2:
                    if (b == 10) {
                        e$b.MediaMetadataCompat = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 3:
                    if (b == 10) {
                        e$b.RemoteActionCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 4:
                    if (b == 6) {
                        e$b.IconCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 5:
                    if (b == 2) {
                        e$b.MediaDescriptionCompat = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 6:
                    if (b == 15) {
                        int i2 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList = new ArrayList(i2);
                        while (i < i2) {
                            arrayList.add((createNotification) createNotification.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            i++;
                        }
                        e$b.MediaBrowserCompatMediaItem = arrayList;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 7:
                    if (b == 15) {
                        int i3 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList2 = new ArrayList(i3);
                        while (i < i3) {
                            arrayList2.add((removeFromSubscriptionGrouplambda0) removeFromSubscriptionGrouplambda0.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            i++;
                        }
                        e$b.write = arrayList2;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                default:
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    break;
            }
        }
    }

    private final Object MediaBrowserCompatMediaItem(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        E$b e$b = new E$b(14);
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return new Rraw(e$b);
            }
            switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                case 1:
                    if (b == 11) {
                        e$b.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 2:
                    if (b == 11) {
                        e$b.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        e$b.IconCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 4:
                    if (b == 4) {
                        e$b.write = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 5:
                    if (b == 4) {
                        e$b.MediaDescriptionCompat = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 6:
                    if (b == 4) {
                        e$b.MediaBrowserCompatMediaItem = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        e$b.MediaMetadataCompat = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                    break;
                default:
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    break;
            }
        }
    }

    private final Object read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(12);
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                break;
            }
            if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer != 1) {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            } else if (b == 11) {
                r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
        int i = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer != null ? 1 : 0;
        if (i == 1) {
            return new IBrazeDeeplinkHandler(r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i, "Invalid union; ", " field(s) were set"));
        return null;
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        int i = this.IconCompatParcelizer;
        BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21 = BrazeCompanionExternalSyntheticLambda4.IconCompatParcelizer;
        int i2 = 8;
        int i3 = 1;
        switch (i) {
            case 0:
                r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = new r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
                    if (b == 0) {
                        return r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.IconCompatParcelizer();
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                        case 1:
                            if (b == 10) {
                                r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.serializer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        case 2:
                            if (b == 10) {
                                r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.read = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        case 3:
                            if (b == 12) {
                                r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = (r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA) r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        case 4:
                            if (b == 8) {
                                r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.IconCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        case 5:
                            if (b == 10) {
                                r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.RemoteActionCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        case 6:
                            if (b == 10) {
                                r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.MediaBrowserCompatMediaItem = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            break;
                    }
                }
                break;
            case 1:
                stopInstancelambda10 stopinstancelambda10 = new stopInstancelambda10();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.RemoteActionCompatParcelizer;
                    if (b2 == 0) {
                        if (stopinstancelambda10.IconCompatParcelizer != null) {
                            return new r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A(stopinstancelambda10);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'location' is missing");
                        return null;
                    }
                    short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.serializer;
                    if (s != 1) {
                        if (s != 2) {
                            if (s != 3) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            } else if (b2 == 12) {
                                stopinstancelambda10.serializer = (BrazeCompanionExternalSyntheticLambda4) brazeCompanionExternalSyntheticLambda21.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                        } else if (b2 == 12) {
                            r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(5);
                            while (true) {
                                r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                byte b3 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.RemoteActionCompatParcelizer;
                                if (b3 == 0) {
                                    if (r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer != null) {
                                        stopinstancelambda10.RemoteActionCompatParcelizer = new handleIncomingIntent(r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k);
                                    } else {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'ssid' is missing");
                                        return null;
                                    }
                                } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.serializer != 1) {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                                } else if (b3 == 11) {
                                    r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                                }
                            }
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                        }
                    } else if (b2 == 12) {
                        stopinstancelambda10.IconCompatParcelizer = (BrazeCompanionExternalSyntheticLambda4) brazeCompanionExternalSyntheticLambda21.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                    }
                }
                break;
            case 2:
                N$b n$b = new N$b();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b4 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.RemoteActionCompatParcelizer;
                    if (b4 == 0) {
                        return n$b.IconCompatParcelizer();
                    }
                    short s2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.serializer;
                    if (s2 != 1) {
                        if (s2 != 2) {
                            if (s2 != 3) {
                                if (s2 != 4) {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                                } else if (b4 == 12) {
                                    n$b.serializer = (r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I) r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                                }
                            } else if (b4 == 12) {
                                n$b.write = (logPushCampaign) logPushCampaign.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                            }
                        } else if (b4 == 12) {
                            n$b.read = (publishBrazePushAction) publishBrazePushAction.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                        }
                    } else if (b4 == 3) {
                        n$b.IconCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                    }
                }
                break;
            case 3:
                isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(i3);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b5 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5.RemoteActionCompatParcelizer;
                    if (b5 == 0) {
                        if (((String) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer) != null) {
                            return new r8lambdaStxQZ_kvz8RG4Vu3Rz4SVrEa8Y(iscontentcardsunreadvisualindicatorenabled);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'stacktrace' is missing");
                        return null;
                    }
                    short s3 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5.serializer;
                    if (s3 != 1) {
                        if (s3 != 2) {
                            if (s3 != 3) {
                                if (s3 != 4) {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                                } else if (b5 == 2) {
                                    iscontentcardsunreadvisualindicatorenabled.read = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                                }
                            } else if (b5 == 2) {
                                iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                            }
                        } else if (b5 == 2) {
                            iscontentcardsunreadvisualindicatorenabled.write = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                        }
                    } else if (b5 == 11) {
                        iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                    }
                }
                break;
            case 4:
                break;
            case 5:
                C$b c$b = new C$b();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b6 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6.RemoteActionCompatParcelizer;
                    if (b6 == 0) {
                        if (((Byte) c$b.serializer) != null) {
                            return new r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU(c$b);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'type' is missing");
                        return null;
                    }
                    short s4 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6.serializer;
                    if (s4 != 1) {
                        if (s4 != 2) {
                            if (s4 != 3) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            } else if (b6 == 12) {
                                c$b.IconCompatParcelizer = (BrazeCompanionExternalSyntheticLambda4) brazeCompanionExternalSyntheticLambda21.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                            }
                        } else if (b6 == 12) {
                            c$b.write = (r8lambdaVErYkPFxABVjGz2VB5XGlrkR4_0) r8lambdaVErYkPFxABVjGz2VB5XGlrkR4_0.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                        }
                    } else if (b6 == 3) {
                        c$b.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                    }
                }
                break;
            case 6:
                r8lambdamXVT_jugIlUrYH44s7scl52H3aY r8lambdamxvt_jugiluryh44s7scl52h3ay = new r8lambdamXVT_jugIlUrYH44s7scl52H3aY();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b7 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7.RemoteActionCompatParcelizer;
                    if (b7 == 0) {
                        return new r8lambdajoIKu_XCIrU_X52X3vSL0ROPcOo(r8lambdamxvt_jugiluryh44s7scl52h3ay);
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7.serializer) {
                        case 1:
                            if (b7 == 11) {
                                r8lambdamxvt_jugiluryh44s7scl52h3ay.serializer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 2:
                            if (b7 == 2) {
                                r8lambdamxvt_jugiluryh44s7scl52h3ay.write = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 3:
                            if (b7 == 8) {
                                r8lambdamxvt_jugiluryh44s7scl52h3ay.read = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 4:
                            if (b7 == 8) {
                                r8lambdamxvt_jugiluryh44s7scl52h3ay.IconCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 5:
                            if (b7 == 8) {
                                r8lambdamxvt_jugiluryh44s7scl52h3ay.RemoteActionCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 6:
                            if (b7 == 2) {
                                r8lambdamxvt_jugiluryh44s7scl52h3ay.MediaMetadataCompat = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 7:
                            if (b7 == 8) {
                                r8lambdamxvt_jugiluryh44s7scl52h3ay.MediaBrowserCompatMediaItem = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            break;
                    }
                }
                break;
            case 7:
                O$b o$b = new O$b();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b8 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8.RemoteActionCompatParcelizer;
                    if (b8 == 0) {
                        return new r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0(o$b);
                    }
                    short s5 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8.serializer;
                    if (s5 != 1) {
                        if (s5 != 2) {
                            if (s5 != 3) {
                                if (s5 != 4) {
                                    if (s5 != 5) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                                    } else if (b8 == 15) {
                                        int i4 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                        ArrayList arrayList = new ArrayList(i4);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            arrayList.add(r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer());
                                        }
                                        o$b.IconCompatParcelizer = arrayList;
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                                    }
                                } else if (b8 == 4) {
                                    o$b.serializer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                                }
                            } else if (b8 == 4) {
                                o$b.RemoteActionCompatParcelizer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                            }
                        } else if (b8 == 4) {
                            o$b.write = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                        }
                    } else if (b8 == 11) {
                        o$b.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                    }
                }
                break;
            case 8:
                r8lambdamXVT_jugIlUrYH44s7scl52H3aY r8lambdamxvt_jugiluryh44s7scl52h3ay2 = new r8lambdamXVT_jugIlUrYH44s7scl52H3aY();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b9 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9.RemoteActionCompatParcelizer;
                    if (b9 == 0) {
                        return new addToCustomAttributeArraylambda0(r8lambdamxvt_jugiluryh44s7scl52h3ay2);
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9.serializer) {
                        case 1:
                            if (b9 == 11) {
                                r8lambdamxvt_jugiluryh44s7scl52h3ay2.serializer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                            }
                            break;
                        case 2:
                            if (b9 == 8) {
                                r8lambdamxvt_jugiluryh44s7scl52h3ay2.read = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                            }
                            break;
                        case 3:
                            if (b9 == 8) {
                                r8lambdamxvt_jugiluryh44s7scl52h3ay2.IconCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                            }
                            break;
                        case 4:
                            if (b9 == 2) {
                                r8lambdamxvt_jugiluryh44s7scl52h3ay2.write = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                            }
                            break;
                        case 5:
                            if (b9 == 8) {
                                r8lambdamxvt_jugiluryh44s7scl52h3ay2.RemoteActionCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                            }
                            break;
                        case 6:
                            if (b9 == 2) {
                                r8lambdamxvt_jugiluryh44s7scl52h3ay2.MediaMetadataCompat = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                            }
                            break;
                        case 7:
                            if (b9 == 8) {
                                r8lambdamxvt_jugiluryh44s7scl52h3ay2.MediaBrowserCompatMediaItem = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                            break;
                    }
                }
                break;
            case 9:
                E1$b e1$b = new E1$b();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b10 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10.RemoteActionCompatParcelizer;
                    if (b10 == 0) {
                        return e1$b.write();
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                    } else if (b10 == 15) {
                        int i6 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList2 = new ArrayList(i6);
                        for (int i7 = 0; i7 < i6; i7++) {
                            arrayList2.add((accessgetUserCachep) accessgetUserCachep.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                        }
                        e1$b.serializer = arrayList2;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                    }
                }
                break;
            case 10:
                i$c i_c = new i$c(0);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b11 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11.RemoteActionCompatParcelizer;
                    if (b11 == 0) {
                        return i_c.read();
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11.serializer) {
                        case 1:
                            if (b11 == 12) {
                                i_c.write = (setDefaultNotificationAccentColor) setDefaultNotificationAccentColor.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                            }
                            break;
                        case 2:
                            if (b11 == 12) {
                                i_c.MediaMetadataCompat = (setDefaultNotificationChannelDescription) setDefaultNotificationChannelDescription.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                            }
                            break;
                        case 3:
                            if (b11 == 12) {
                                i_c.IconCompatParcelizer = (addToSubscriptionGrouplambda2) addToSubscriptionGrouplambda2.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                            }
                            break;
                        case 4:
                            if (b11 == 12) {
                                i_c.serializer = (incrementCustomUserAttributelambda0) incrementCustomUserAttributelambda0.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                            }
                            break;
                        case 5:
                            if (b11 == 12) {
                                i_c.RemoteActionCompatParcelizer = (setAttributionDatalambda0) setAttributionDatalambda0.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                            }
                            break;
                        case 6:
                            if (b11 == 12) {
                                i_c.read = (setLineIdlambda3) setLineIdlambda3.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                            }
                            break;
                        case 7:
                            if (b11 == 12) {
                                i_c.RatingCompat = (removeFromSubscriptionGrouplambda2) removeFromSubscriptionGrouplambda2.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                            }
                            break;
                        case 8:
                            if (b11 == 12) {
                                i_c.MediaDescriptionCompat = (setCustomAttributelambda11) setCustomAttributelambda11.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                            }
                            break;
                        case 9:
                            if (b11 == 12) {
                                i_c.MediaBrowserCompatMediaItem = (setCustomAttributedefault) setCustomAttributedefault.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                            break;
                    }
                }
                break;
            case 11:
                setCountrylambda1 setcountrylambda1 = new setCountrylambda1();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b12 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12.RemoteActionCompatParcelizer;
                    if (b12 == 0) {
                        return new setCustomAttributelambda0(setcountrylambda1);
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12.serializer) {
                        case 1:
                            if (b12 == 2) {
                                setcountrylambda1.RemoteActionCompatParcelizer = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            }
                            break;
                        case 2:
                            if (b12 == 2) {
                                setcountrylambda1.read = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            }
                            break;
                        case 3:
                            if (b12 == 2) {
                                setcountrylambda1.write = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            }
                            break;
                        case 4:
                            if (b12 == 3) {
                                setcountrylambda1.IconCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            }
                            break;
                        case 5:
                            if (b12 == 3) {
                                setcountrylambda1.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            }
                            break;
                        case 6:
                            if (b12 == 2) {
                                setcountrylambda1.MediaSessionCompatQueueItem = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            }
                            break;
                        case 7:
                            if (b12 == 2) {
                                setcountrylambda1.MediaMetadataCompat = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            }
                            break;
                        case 8:
                            if (b12 == 3) {
                                setcountrylambda1.MediaBrowserCompatMediaItem = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            }
                            break;
                        case 9:
                            if (b12 == 2) {
                                setcountrylambda1.RatingCompat = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            }
                            break;
                        case 10:
                            if (b12 == 3) {
                                setcountrylambda1.MediaDescriptionCompat = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            }
                            break;
                        case 11:
                            if (b12 == 2) {
                                setcountrylambda1.PlaybackStateCompatCustomAction = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            break;
                    }
                }
                break;
            case 12:
                r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm = new r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem13 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b13 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem13.RemoteActionCompatParcelizer;
                    if (b13 == 0) {
                        return new setCustomUserAttributelambda5(r8lambdaxdc9yg9rrx23qvlbekkfzieitwm);
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem13.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                    } else if (b13 == 3) {
                        r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                    }
                }
                break;
            case 13:
                C$b c$b2 = new C$b();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem14 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b14 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem14.RemoteActionCompatParcelizer;
                    if (b14 == 0) {
                        return new setEmaillambda20(c$b2);
                    }
                    short s6 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem14.serializer;
                    io.sentry.hints.MediaSessionCompatQueueItem mediaSessionCompatQueueItem = setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release.serializer;
                    if (s6 != 1) {
                        if (s6 != 2) {
                            if (s6 != 3) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                            } else if (b14 == 12) {
                                applyPendingRuntimeConfiguration applypendingruntimeconfiguration = new applyPendingRuntimeConfiguration();
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem15 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b15 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem15.RemoteActionCompatParcelizer;
                                    if (b15 == 0) {
                                        c$b2.IconCompatParcelizer = new setPhoneNumberlambda20(applypendingruntimeconfiguration);
                                    } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem15.serializer != 1) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b15);
                                    } else if (b15 == 2) {
                                        applypendingruntimeconfiguration.read = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b15);
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                            }
                        } else if (b14 == 12) {
                            c$b2.write = (setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release) mediaSessionCompatQueueItem.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                        }
                    } else if (b14 == 12) {
                        c$b2.serializer = (setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release) mediaSessionCompatQueueItem.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                    }
                }
                break;
            case 14:
                r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls = new r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem16 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b16 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem16.RemoteActionCompatParcelizer;
                    if (b16 == 0) {
                        int i8 = ((addAlias) r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer) != null ? 1 : 0;
                        if (((addToCustomAttributeArray) r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer) != null) {
                            i8++;
                        }
                        if (((r8lambdauAWnoq1fYyNOHTe6W4x6GlR3NlQ) r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem) != null) {
                            i8++;
                        }
                        if (((r8lambdazL5YEDL8BIJUMJIduPEWP0aZmA) r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer) != null) {
                            i8++;
                        }
                        if (((addToCustomAttributeArraylambda0) r8lambdayc78smgbbb6fudfjq0u5z3_ls.write) != null) {
                            i8++;
                        }
                        if (((r8lambdajoIKu_XCIrU_X52X3vSL0ROPcOo) r8lambdayc78smgbbb6fudfjq0u5z3_ls.read) != null) {
                            i8++;
                        }
                        int i9 = i8;
                        if (i9 == 1) {
                            return new setLanguagelambda1(r8lambdayc78smgbbb6fudfjq0u5z3_ls);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i9, "Invalid union; ", " field(s) were set"));
                        return null;
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem16.serializer) {
                        case 1:
                            if (b16 == 12) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer = (addAlias) addAlias.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                            }
                            break;
                        case 2:
                            if (b16 == 12) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer = (addToCustomAttributeArray) addToCustomAttributeArray.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                            }
                            break;
                        case 3:
                            if (b16 == 12) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem = (r8lambdauAWnoq1fYyNOHTe6W4x6GlR3NlQ) r8lambdauAWnoq1fYyNOHTe6W4x6GlR3NlQ.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                            }
                            break;
                        case 4:
                            if (b16 == 12) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer = (r8lambdazL5YEDL8BIJUMJIduPEWP0aZmA) r8lambdazL5YEDL8BIJUMJIduPEWP0aZmA.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                            }
                            break;
                        case 5:
                            if (b16 == 12) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.write = (addToCustomAttributeArraylambda0) addToCustomAttributeArraylambda0.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                            }
                            break;
                        case 6:
                            if (b16 == 12) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.read = (r8lambdajoIKu_XCIrU_X52X3vSL0ROPcOo) r8lambdajoIKu_XCIrU_X52X3vSL0ROPcOo.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                            break;
                    }
                }
                break;
            case 15:
                setCountrylambda1 setcountrylambda2 = new setCountrylambda1();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem17 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b17 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem17.RemoteActionCompatParcelizer;
                    if (b17 == 0) {
                        if (((String) setcountrylambda2.RemoteActionCompatParcelizer) != null) {
                            if (((String) setcountrylambda2.read) != null) {
                                if (((String) setcountrylambda2.write) != null) {
                                    if (((String) setcountrylambda2.RatingCompat) != null) {
                                        if (((String) setcountrylambda2.PlaybackStateCompatCustomAction) != null) {
                                            if (((Integer) setcountrylambda2.IconCompatParcelizer) != null) {
                                                if (((setLanguagelambda1) setcountrylambda2.serializer) != null) {
                                                    if (((Long) setcountrylambda2.MediaBrowserCompatMediaItem) != null) {
                                                        if (((Long) setcountrylambda2.MediaDescriptionCompat) != null) {
                                                            return new setLastNamelambda0(setcountrylambda2);
                                                        }
                                                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'cts' is missing");
                                                        return null;
                                                    }
                                                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'ts' is missing");
                                                    return null;
                                                }
                                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'data' is missing");
                                                return null;
                                            }
                                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'mv' is missing");
                                            return null;
                                        }
                                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'sdtid' is missing");
                                        return null;
                                    }
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'sdid' is missing");
                                    return null;
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'uid' is missing");
                                return null;
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'mid' is missing");
                            return null;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'type' is missing");
                        return null;
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem17.serializer) {
                        case 1:
                            if (b17 == 11) {
                                setcountrylambda2.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                            }
                            break;
                        case 2:
                            if (b17 == 11) {
                                setcountrylambda2.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                            }
                            break;
                        case 3:
                            if (b17 == 11) {
                                setcountrylambda2.write = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                            }
                            break;
                        case 4:
                            if (b17 == 11) {
                                setcountrylambda2.MediaSessionCompatQueueItem = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                            }
                            break;
                        case 5:
                            if (b17 == 11) {
                                setcountrylambda2.MediaMetadataCompat = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                            }
                            break;
                        case 6:
                            if (b17 == 11) {
                                setcountrylambda2.RatingCompat = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                            }
                            break;
                        case 7:
                            if (b17 == 11) {
                                setcountrylambda2.PlaybackStateCompatCustomAction = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                            }
                            break;
                        case 8:
                            if (b17 == 8) {
                                setcountrylambda2.IconCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                            }
                            break;
                        case 9:
                            if (b17 == 12) {
                                setcountrylambda2.serializer = (setLanguagelambda1) setLanguagelambda1.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                            }
                            break;
                        case 10:
                            if (b17 == 10) {
                                setcountrylambda2.MediaBrowserCompatMediaItem = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                            }
                            break;
                        case 11:
                            if (b17 == 10) {
                                setcountrylambda2.MediaDescriptionCompat = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                            break;
                    }
                }
                break;
            case 16:
                IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem18 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b18 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem18.RemoteActionCompatParcelizer;
                    if (b18 == 0) {
                        int i10 = ((setLastNamelambda0) iOParser$Decoder.RemoteActionCompatParcelizer) != null ? 1 : 0;
                        if (((setLineIdlambda20) iOParser$Decoder.read) != null) {
                            i10++;
                        }
                        int i11 = i10;
                        if (i11 == 1) {
                            return new setPhoneNumberlambda0(iOParser$Decoder);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i11, "Invalid union; ", " field(s) were set"));
                        return null;
                    }
                    short s7 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem18.serializer;
                    if (s7 != 1) {
                        if (s7 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b18);
                        } else if (b18 == 12) {
                            iOParser$Decoder.read = (setLineIdlambda20) setLineIdlambda20.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b18);
                        }
                    } else if (b18 == 12) {
                        iOParser$Decoder.RemoteActionCompatParcelizer = (setLastNamelambda0) setLastNamelambda0.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b18);
                    }
                }
                break;
            case 17:
                NetworkBody networkBody = new NetworkBody(19);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem19 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b19 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem19.RemoteActionCompatParcelizer;
                    if (b19 == 0) {
                        if (((Long) networkBody.IconCompatParcelizer) != null) {
                            if (((Long) networkBody.RemoteActionCompatParcelizer) != null) {
                                return new unsetCustomUserAttributelambda1(networkBody);
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'stop' is missing");
                            return null;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'start' is missing");
                        return null;
                    }
                    short s8 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem19.serializer;
                    if (s8 != 1) {
                        if (s8 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b19);
                        } else if (b19 == 10) {
                            networkBody.RemoteActionCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b19);
                        }
                    } else if (b19 == 10) {
                        networkBody.IconCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b19);
                    }
                }
                break;
            case 18:
                O$b o$b2 = new O$b();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem20 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b20 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem20.RemoteActionCompatParcelizer;
                    if (b20 == 0) {
                        return new addAlias(o$b2);
                    }
                    short s9 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem20.serializer;
                    if (s9 != 1) {
                        if (s9 != 2) {
                            if (s9 != 3) {
                                if (s9 != 4) {
                                    if (s9 != 5) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b20);
                                    } else if (b20 == 4) {
                                        o$b2.IconCompatParcelizer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b20);
                                    }
                                } else if (b20 == 4) {
                                    o$b2.serializer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b20);
                                }
                            } else if (b20 == 11) {
                                o$b2.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b20);
                            }
                        } else if (b20 == 4) {
                            o$b2.RemoteActionCompatParcelizer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b20);
                        }
                    } else if (b20 == 4) {
                        o$b2.write = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b20);
                    }
                }
                break;
            case 19:
                removeFromCustomAttributeArray removefromcustomattributearray = new removeFromCustomAttributeArray();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem21 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b21 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem21.RemoteActionCompatParcelizer;
                    if (b21 == 0) {
                        return new getUserId(removefromcustomattributearray);
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem21.serializer) {
                        case 1:
                            if (b21 == 11) {
                                removefromcustomattributearray.serializer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b21);
                            }
                            break;
                        case 2:
                            if (b21 == 4) {
                                removefromcustomattributearray.write = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b21);
                            }
                            break;
                        case 3:
                            if (b21 == 11) {
                                removefromcustomattributearray.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b21);
                            }
                            break;
                        case 4:
                            if (b21 == 12) {
                                setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(i2, false);
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem22 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b22 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem22.RemoteActionCompatParcelizer;
                                    if (b22 == 0) {
                                        removefromcustomattributearray.read = new setFirstNamelambda0(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release);
                                        break;
                                    } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem22.serializer != 1) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b22);
                                    } else if (b22 == 4) {
                                        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b22);
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b21);
                                break;
                            }
                            break;
                        case 5:
                            if (b21 == 15) {
                                int i12 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                ArrayList arrayList3 = new ArrayList(i12);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    arrayList3.add((isTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release) isTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                                }
                                removefromcustomattributearray.IconCompatParcelizer = arrayList3;
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b21);
                            }
                            break;
                        case 6:
                            if (b21 == 11) {
                                removefromcustomattributearray.MediaSessionCompatQueueItem = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b21);
                            }
                            break;
                        case 7:
                            if (b21 == 11) {
                                removefromcustomattributearray.MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b21);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b21);
                            break;
                    }
                }
                break;
            case 20:
                NetworkBody networkBody2 = new NetworkBody(20);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem23 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b23 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem23.RemoteActionCompatParcelizer;
                    if (b23 == 0) {
                        return new setCustomAttribute(networkBody2);
                    }
                    short s10 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem23.serializer;
                    if (s10 != 1) {
                        if (s10 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b23);
                        } else if (b23 == 3) {
                            networkBody2.RemoteActionCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b23);
                        }
                    } else if (b23 == 15) {
                        int i14 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList4 = new ArrayList(i14);
                        for (int i15 = 0; i15 < i14; i15++) {
                            arrayList4.add(Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction()));
                        }
                        networkBody2.IconCompatParcelizer = arrayList4;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b23);
                    }
                }
                break;
            case 21:
                return IconCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 22:
                r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k2 = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(11);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem24 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b24 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem24.RemoteActionCompatParcelizer;
                    if (b24 == 0) {
                        int i16 = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k2.RemoteActionCompatParcelizer != null ? 1 : 0;
                        if (i16 == 1) {
                            return new setLocationCustomAttribute(r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k2);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i16, "Invalid union; ", " field(s) were set"));
                        return null;
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem24.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b24);
                    } else if (b24 == 11) {
                        r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k2.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b24);
                    }
                }
                break;
            case 23:
                return write(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 24:
                BrazeCompanionExternalSyntheticLambda8 brazeCompanionExternalSyntheticLambda8 = new BrazeCompanionExternalSyntheticLambda8();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem25 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b25 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem25.RemoteActionCompatParcelizer;
                    if (b25 == 0) {
                        if (brazeCompanionExternalSyntheticLambda8.IconCompatParcelizer != null) {
                            return new createUriActionFromUrlString(brazeCompanionExternalSyntheticLambda8);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'stop' is missing");
                        return null;
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem25.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b25);
                    } else if (b25 == 10) {
                        brazeCompanionExternalSyntheticLambda8.IconCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b25);
                    }
                }
                break;
            case 25:
                return read(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 26:
                return serializer(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 27:
                return MediaBrowserCompatMediaItem(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 28:
                return MediaSessionCompatQueueItem(r8lambdat7xjd1d4humw0psb7whucfgonss);
            default:
                r8lambdaZA7Eh514LyJrawNusHpVw7pA98 r8lambdaza7eh514lyjrawnushpvw7pa98 = new r8lambdaZA7Eh514LyJrawNusHpVw7pA98();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem26 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b26 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem26.RemoteActionCompatParcelizer;
                    if (b26 == 0) {
                        if (r8lambdaza7eh514lyjrawnushpvw7pa98.read != null) {
                            if (r8lambdaza7eh514lyjrawnushpvw7pa98.write != null) {
                                return new setFirebaseCloudMessagingSenderIdKeylambda0(r8lambdaza7eh514lyjrawnushpvw7pa98);
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'end_time' is missing");
                            return null;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'start_time' is missing");
                        return null;
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem26.serializer) {
                        case 1:
                            if (b26 == 10) {
                                r8lambdaza7eh514lyjrawnushpvw7pa98.read = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                            }
                            break;
                        case 2:
                            if (b26 == 10) {
                                r8lambdaza7eh514lyjrawnushpvw7pa98.write = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                            }
                            break;
                        case 3:
                            if (b26 == 8) {
                                r8lambdaza7eh514lyjrawnushpvw7pa98.IconCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                            }
                            break;
                        case 4:
                            if (b26 == 8) {
                                r8lambdaza7eh514lyjrawnushpvw7pa98.RemoteActionCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                            }
                            break;
                        case 5:
                            if (b26 == 8) {
                                r8lambdaza7eh514lyjrawnushpvw7pa98.MediaDescriptionCompat = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                            }
                            break;
                        case 6:
                            if (b26 == 3) {
                                r8lambdaza7eh514lyjrawnushpvw7pa98.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                            }
                            break;
                        case 7:
                            if (b26 == 15) {
                                int i17 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                ArrayList arrayList5 = new ArrayList(i17);
                                for (int i18 = 0; i18 < i17; i18++) {
                                    arrayList5.add((setLastKnownLocationlambda0) setLastKnownLocationlambda0.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                                }
                                r8lambdaza7eh514lyjrawnushpvw7pa98.MediaBrowserCompatMediaItem = arrayList5;
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                            }
                            break;
                        case 8:
                            if (b26 == 3) {
                                r8lambdaza7eh514lyjrawnushpvw7pa98.MediaMetadataCompat = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                            break;
                    }
                }
                break;
        }
        while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
        }
        return new r8lambdaVny7Iop5thIfAArp93JFD1zIPGQ();
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) {
        byte b;
        byte b2;
        byte b3;
        byte b4;
        int i;
        int i2;
        byte b5;
        int i3;
        int i4;
        byte b6;
        byte b7;
        byte b8;
        byte b9;
        byte b10;
        byte b11;
        byte b12;
        byte b13;
        byte b14;
        byte b15;
        byte b16;
        byte b17;
        byte b18;
        byte b19;
        byte b20;
        byte b21;
        byte b22;
        byte b23;
        byte b24;
        byte b25;
        byte b26;
        byte b27;
        byte b28;
        byte b29;
        byte b30;
        byte b31;
        int i5 = this.IconCompatParcelizer;
        BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21 = BrazeCompanionExternalSyntheticLambda4.IconCompatParcelizer;
        switch (i5) {
            case 0:
                r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsu = (r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                Long l = r8lambdaqtf70aj7a5o7b4yj33reyelsu.write;
                Long l2 = r8lambdaqtf70aj7a5o7b4yj33reyelsu.MediaDescriptionCompat;
                Long l3 = r8lambdaqtf70aj7a5o7b4yj33reyelsu.MediaSessionCompatQueueItem;
                IconCompatParcelizer.serializer(l, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 10);
                IconCompatParcelizer.serializer(r8lambdaqtf70aj7a5o7b4yj33reyelsu.RemoteActionCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 12);
                r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdaqtf70aj7a5o7b4yj33reyelsu.serializer);
                Integer num = r8lambdaqtf70aj7a5o7b4yj33reyelsu.IconCompatParcelizer;
                if (num != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 8, num);
                }
                if (l3 != null) {
                    b = 10;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 10);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(l3.longValue());
                } else {
                    b = 10;
                }
                if (l2 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, b);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(l2.longValue());
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 1:
                r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A r8lambdadtwa3yx1e9cvszaagaemidzvt8a = (r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdadtwa3yx1e9cvszaagaemidzvt8a.write;
                BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda5 = r8lambdadtwa3yx1e9cvszaagaemidzvt8a.IconCompatParcelizer;
                brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, brazeCompanionExternalSyntheticLambda4);
                handleIncomingIntent handleincomingintent = r8lambdadtwa3yx1e9cvszaagaemidzvt8a.RemoteActionCompatParcelizer;
                if (handleincomingintent != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(handleincomingintent.IconCompatParcelizer);
                    b2 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b2 = 0;
                }
                if (brazeCompanionExternalSyntheticLambda5 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 12);
                    brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, brazeCompanionExternalSyntheticLambda5);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b2);
                break;
            case 2:
                r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q r8lambdak6izilh9v8ert5zk67d8tg0vc8q = (r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                af$$ExternalSyntheticOutline1.m((byte) 12, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdak6izilh9v8ert5zk67d8tg0vc8q.RemoteActionCompatParcelizer);
                publishBrazePushAction.IconCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdak6izilh9v8ert5zk67d8tg0vc8q.IconCompatParcelizer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 12);
                logPushCampaign.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdak6izilh9v8ert5zk67d8tg0vc8q.write);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 12);
                r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdak6izilh9v8ert5zk67d8tg0vc8q.serializer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 3:
                r8lambdaStxQZ_kvz8RG4Vu3Rz4SVrEa8Y r8lambdastxqz_kvz8rg4vu3rz4svrea8y = (r8lambdaStxQZ_kvz8RG4Vu3Rz4SVrEa8Y) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                String str = r8lambdastxqz_kvz8rg4vu3rz4svrea8y.read;
                Boolean bool = r8lambdastxqz_kvz8rg4vu3rz4svrea8y.RemoteActionCompatParcelizer;
                Boolean bool2 = r8lambdastxqz_kvz8rg4vu3rz4svrea8y.write;
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(str);
                Boolean bool3 = r8lambdastxqz_kvz8rg4vu3rz4svrea8y.serializer;
                if (bool3 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 2, bool3);
                }
                if (bool2 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 2, bool2);
                }
                if (bool != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 2, bool);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 4:
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 5:
                r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu = (r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                Byte b32 = r8lambdazeccixubf3xvz58yt5bojkwhdu.read;
                BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda6 = r8lambdazeccixubf3xvz58yt5bojkwhdu.serializer;
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b32.byteValue());
                r8lambdaVErYkPFxABVjGz2VB5XGlrkR4_0 r8lambdaverykpfxabvjgz2vb5xglrkr4_0 = r8lambdazeccixubf3xvz58yt5bojkwhdu.RemoteActionCompatParcelizer;
                if (r8lambdaverykpfxabvjgz2vb5xglrkr4_0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 8);
                    SweepGradientShader9KIMszodefault.write(r8lambdaverykpfxabvjgz2vb5xglrkr4_0.RemoteActionCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 8);
                    SweepGradientShader9KIMszodefault.write(r8lambdaverykpfxabvjgz2vb5xglrkr4_0.read, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 8);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.read(r8lambdaverykpfxabvjgz2vb5xglrkr4_0.IconCompatParcelizer.intValue());
                    String str2 = r8lambdaverykpfxabvjgz2vb5xglrkr4_0.serializer;
                    if (str2 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str2);
                    }
                    b3 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b3 = 0;
                }
                if (brazeCompanionExternalSyntheticLambda6 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 12);
                    brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, brazeCompanionExternalSyntheticLambda6);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b3);
                break;
            case 6:
                r8lambdajoIKu_XCIrU_X52X3vSL0ROPcOo r8lambdajoiku_xciru_x52x3vsl0ropcoo = (r8lambdajoIKu_XCIrU_X52X3vSL0ROPcOo) obj;
                String str3 = r8lambdajoiku_xciru_x52x3vsl0ropcoo.read;
                Integer num2 = r8lambdajoiku_xciru_x52x3vsl0ropcoo.RatingCompat;
                Boolean bool4 = r8lambdajoiku_xciru_x52x3vsl0ropcoo.MediaDescriptionCompat;
                Integer num3 = r8lambdajoiku_xciru_x52x3vsl0ropcoo.MediaSessionCompatQueueItem;
                Integer num4 = r8lambdajoiku_xciru_x52x3vsl0ropcoo.RemoteActionCompatParcelizer;
                Integer num5 = r8lambdajoiku_xciru_x52x3vsl0ropcoo.IconCompatParcelizer;
                Boolean bool5 = r8lambdajoiku_xciru_x52x3vsl0ropcoo.write;
                if (str3 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(r8lambdajoiku_xciru_x52x3vsl0ropcoo.read);
                }
                if (bool5 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 2, bool5);
                }
                if (num5 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 8, num5);
                }
                if (num4 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 8, num4);
                }
                if (num3 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 5, (byte) 8, num3);
                }
                if (bool4 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 6, (byte) 2, bool4);
                }
                if (num2 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 7, (byte) 8, num2);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 7:
                r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0 r8lambdaxwofrgpcxeo3a8dqjc8zbxvvc0 = (r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0) obj;
                String str4 = r8lambdaxwofrgpcxeo3a8dqjc8zbxvvc0.write;
                Double d = r8lambdaxwofrgpcxeo3a8dqjc8zbxvvc0.IconCompatParcelizer;
                Double d2 = r8lambdaxwofrgpcxeo3a8dqjc8zbxvvc0.serializer;
                Double d3 = r8lambdaxwofrgpcxeo3a8dqjc8zbxvvc0.read;
                List list = r8lambdaxwofrgpcxeo3a8dqjc8zbxvvc0.MediaBrowserCompatMediaItem;
                if (str4 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(r8lambdaxwofrgpcxeo3a8dqjc8zbxvvc0.write);
                }
                if (d3 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 4, d3);
                }
                if (d2 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 4, d2);
                }
                if (d != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 4, d);
                }
                if (list != null) {
                    Iterator itWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 5, (byte) 15, list, (byte) 11);
                    while (itWrite.hasNext()) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write((String) itWrite.next());
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 8:
                addToCustomAttributeArraylambda0 addtocustomattributearraylambda0 = (addToCustomAttributeArraylambda0) obj;
                String str5 = addtocustomattributearraylambda0.serializer;
                Integer num6 = addtocustomattributearraylambda0.MediaSessionCompatQueueItem;
                Boolean bool6 = addtocustomattributearraylambda0.MediaBrowserCompatMediaItem;
                Integer num7 = addtocustomattributearraylambda0.RatingCompat;
                Boolean bool7 = addtocustomattributearraylambda0.write;
                Integer num8 = addtocustomattributearraylambda0.RemoteActionCompatParcelizer;
                Integer num9 = addtocustomattributearraylambda0.read;
                if (str5 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(addtocustomattributearraylambda0.serializer);
                }
                if (num9 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 8, num9);
                }
                if (num8 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 8, num8);
                }
                if (bool7 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 2, bool7);
                }
                if (num7 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 5, (byte) 8, num7);
                }
                if (bool6 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 6, (byte) 2, bool6);
                }
                if (num6 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 7, (byte) 8, num6);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 9:
                removeFromCustomAttributeArraylambda0 removefromcustomattributearraylambda0 = (removeFromCustomAttributeArraylambda0) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 15);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 12, removefromcustomattributearraylambda0.IconCompatParcelizer.size());
                Iterator it = removefromcustomattributearraylambda0.IconCompatParcelizer.iterator();
                while (it.hasNext()) {
                    accessgetUserCachep.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (accessgetUserCachep) it.next());
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 10:
                setCountrylambda0 setcountrylambda0 = (setCountrylambda0) obj;
                setDefaultNotificationAccentColor setdefaultnotificationaccentcolor = setcountrylambda0.RemoteActionCompatParcelizer;
                setCustomAttributedefault setcustomattributedefault = setcountrylambda0.MediaSessionCompatQueueItem;
                setCustomAttributelambda11 setcustomattributelambda11 = setcountrylambda0.MediaMetadataCompat;
                removeFromSubscriptionGrouplambda2 removefromsubscriptiongrouplambda2 = setcountrylambda0.MediaBrowserCompatMediaItem;
                setLineIdlambda3 setlineidlambda3 = setcountrylambda0.MediaDescriptionCompat;
                setAttributionDatalambda0 setattributiondatalambda0 = setcountrylambda0.RatingCompat;
                incrementCustomUserAttributelambda0 incrementcustomuserattributelambda0 = setcountrylambda0.read;
                addToSubscriptionGrouplambda2 addtosubscriptiongrouplambda2 = setcountrylambda0.IconCompatParcelizer;
                setDefaultNotificationChannelDescription setdefaultnotificationchanneldescription = setcountrylambda0.serializer;
                if (setdefaultnotificationaccentcolor != null) {
                    b4 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                    setDefaultNotificationAccentColor setdefaultnotificationaccentcolor2 = setcountrylambda0.RemoteActionCompatParcelizer;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                    setCustomEndpoint setcustomendpoint = setdefaultnotificationaccentcolor2.serializer;
                    if (setcustomendpoint.RemoteActionCompatParcelizer != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(setcustomendpoint.RemoteActionCompatParcelizer);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    i = 2;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                    setDefaultNotificationAccentColorandroid_sdk_base_release.IconCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setdefaultnotificationaccentcolor2.read);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b4 = 12;
                    i = 2;
                }
                if (setdefaultnotificationchanneldescription != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i, b4);
                    i2 = 1;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, b4);
                    setLocationCustomAttribute setlocationcustomattribute = setdefaultnotificationchanneldescription.IconCompatParcelizer;
                    if (setlocationcustomattribute.serializer != null) {
                        b12 = 11;
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(setlocationcustomattribute.serializer);
                    } else {
                        b12 = 11;
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i, b4);
                    setCustomEndpoint setcustomendpoint2 = setdefaultnotificationchanneldescription.write;
                    if (setcustomendpoint2.RemoteActionCompatParcelizer != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, b12);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(setcustomendpoint2.RemoteActionCompatParcelizer);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    i2 = 1;
                }
                if (addtosubscriptiongrouplambda2 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i2, (byte) 12);
                    incrementCustomUserAttribute incrementcustomuserattribute = addtosubscriptiongrouplambda2.write;
                    if (incrementcustomuserattribute.read != null) {
                        b11 = 11;
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i2, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(incrementcustomuserattribute.read);
                    } else {
                        b11 = 11;
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                    setLocationCustomAttributelambda1 setlocationcustomattributelambda1 = addtosubscriptiongrouplambda2.serializer;
                    if (setlocationcustomattributelambda1.IconCompatParcelizer != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i2, b11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(setlocationcustomattributelambda1.IconCompatParcelizer);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (incrementcustomuserattributelambda0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i2, (byte) 12);
                    incrementCustomUserAttribute incrementcustomuserattribute2 = incrementcustomuserattributelambda0.IconCompatParcelizer;
                    if (incrementcustomuserattribute2.read != null) {
                        b10 = 11;
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i2, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(incrementcustomuserattribute2.read);
                    } else {
                        b10 = 11;
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                    setCustomEndpoint setcustomendpoint3 = incrementcustomuserattributelambda0.write;
                    if (setcustomendpoint3.RemoteActionCompatParcelizer != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i2, b10);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(setcustomendpoint3.RemoteActionCompatParcelizer);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (setattributiondatalambda0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i2, (byte) 12);
                    setLocationCustomAttributelambda1 setlocationcustomattributelambda2 = setattributiondatalambda0.RemoteActionCompatParcelizer;
                    if (setlocationcustomattributelambda2.IconCompatParcelizer != null) {
                        b9 = 11;
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i2, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(setlocationcustomattributelambda2.IconCompatParcelizer);
                    } else {
                        b9 = 11;
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                    setLanguagelambda0 setlanguagelambda0 = setattributiondatalambda0.write;
                    if (setlanguagelambda0.IconCompatParcelizer != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i2, b9);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(setlanguagelambda0.IconCompatParcelizer);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
                if (setlineidlambda3 != null) {
                    b5 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i2, (byte) 12);
                    setLanguagelambda0 setlanguagelambda1 = setlineidlambda3.IconCompatParcelizer;
                    if (setlanguagelambda1.IconCompatParcelizer != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i2, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(setlanguagelambda1.IconCompatParcelizer);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                    setPhoneNumberlambda0.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setlineidlambda3.read);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b5 = 12;
                }
                if (removefromsubscriptiongrouplambda2 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(7, b5);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, b5);
                    setCustomEndpoint setcustomendpoint4 = removefromsubscriptiongrouplambda2.serializer;
                    if (setcustomendpoint4.RemoteActionCompatParcelizer != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(setcustomendpoint4.RemoteActionCompatParcelizer);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    i3 = 8;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 8);
                    SweepGradientShader9KIMszodefault.write(removefromsubscriptiongrouplambda2.IconCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 8);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.read(removefromsubscriptiongrouplambda2.RemoteActionCompatParcelizer.value);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    i3 = 8;
                }
                if (setcustomattributelambda11 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i3, (byte) 12);
                    i4 = 1;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                    setCustomEndpoint setcustomendpoint5 = setcustomattributelambda11.IconCompatParcelizer;
                    if (setcustomendpoint5.RemoteActionCompatParcelizer != null) {
                        b8 = 11;
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(setcustomendpoint5.RemoteActionCompatParcelizer);
                    } else {
                        b8 = 11;
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                    unsetLocationCustomAttributelambda2 unsetlocationcustomattributelambda2 = setcustomattributelambda11.read;
                    if (unsetlocationcustomattributelambda2.write != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, b8);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(unsetlocationcustomattributelambda2.write);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    i4 = 1;
                }
                if (setcustomattributedefault != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(9, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i4, (byte) 12);
                    setCustomEndpoint setcustomendpoint6 = setcustomattributedefault.RemoteActionCompatParcelizer;
                    if (setcustomendpoint6.RemoteActionCompatParcelizer != null) {
                        b7 = 11;
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i4, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(setcustomendpoint6.RemoteActionCompatParcelizer);
                    } else {
                        b7 = 11;
                    }
                    b6 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                    unsetLocationCustomAttributelambda2 unsetlocationcustomattributelambda3 = setcustomattributedefault.IconCompatParcelizer;
                    if (unsetlocationcustomattributelambda3.write != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i4, b7);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(unsetlocationcustomattributelambda3.write);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b6 = 0;
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b6);
                break;
            case 11:
                setCustomAttributelambda0 setcustomattributelambda0 = (setCustomAttributelambda0) obj;
                Boolean bool8 = setcustomattributelambda0.serializer;
                Boolean bool9 = setcustomattributelambda0.MediaSessionCompatToken;
                Byte b33 = setcustomattributelambda0.PlaybackStateCompatCustomAction;
                Boolean bool10 = setcustomattributelambda0.MediaBrowserCompatMediaItem;
                Byte b34 = setcustomattributelambda0.RatingCompat;
                Boolean bool11 = setcustomattributelambda0.MediaDescriptionCompat;
                Boolean bool12 = setcustomattributelambda0.MediaMetadataCompat;
                Byte b35 = setcustomattributelambda0.MediaSessionCompatQueueItem;
                Byte b36 = setcustomattributelambda0.IconCompatParcelizer;
                Boolean bool13 = setcustomattributelambda0.write;
                Boolean bool14 = setcustomattributelambda0.RemoteActionCompatParcelizer;
                if (bool8 != null) {
                    b13 = 2;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 2);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(setcustomattributelambda0.serializer.booleanValue() ? (byte) 1 : (byte) 0);
                } else {
                    b13 = 2;
                }
                if (bool14 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, b13, b13, bool14);
                }
                if (bool13 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, b13, bool13);
                }
                if (b36 != null) {
                    getBitmapFromCache.read((byte) 3, 4, r8lambdat7xjd1d4humw0psb7whucfgonss, b36);
                }
                if (b35 != null) {
                    getBitmapFromCache.read((byte) 3, 5, r8lambdat7xjd1d4humw0psb7whucfgonss, b35);
                }
                if (bool12 != null) {
                    b14 = 2;
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 6, (byte) 2, bool12);
                } else {
                    b14 = 2;
                }
                if (bool11 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 7, b14, bool11);
                }
                if (b34 != null) {
                    b15 = 3;
                    getBitmapFromCache.read((byte) 3, 8, r8lambdat7xjd1d4humw0psb7whucfgonss, b34);
                } else {
                    b15 = 3;
                }
                if (bool10 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 9, b14, bool10);
                }
                if (b33 != null) {
                    getBitmapFromCache.read(b15, 10, r8lambdat7xjd1d4humw0psb7whucfgonss, b33);
                }
                if (bool9 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 11, b14, bool9);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 12:
                setCustomUserAttributelambda5 setcustomuserattributelambda5 = (setCustomUserAttributelambda5) obj;
                if (setcustomuserattributelambda5.RemoteActionCompatParcelizer != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(setcustomuserattributelambda5.RemoteActionCompatParcelizer.byteValue());
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 13:
                setEmaillambda20 setemaillambda20 = (setEmaillambda20) obj;
                setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release = setemaillambda20.IconCompatParcelizer;
                setPhoneNumberlambda20 setphonenumberlambda20 = setemaillambda20.RemoteActionCompatParcelizer;
                setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release2 = setemaillambda20.write;
                io.sentry.hints.MediaSessionCompatQueueItem mediaSessionCompatQueueItem = setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release.serializer;
                if (setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release != null) {
                    b16 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                    mediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setemaillambda20.IconCompatParcelizer);
                } else {
                    b16 = 12;
                }
                if (setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release2 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, b16);
                    mediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setcustomhtmlwebviewactivityclassnameandroid_sdk_base_release2);
                }
                if (setphonenumberlambda20 != null) {
                    Boolean bool15 = setphonenumberlambda20.RemoteActionCompatParcelizer;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, b16);
                    if (bool15 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 2);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(bool15.booleanValue() ? (byte) 1 : (byte) 0);
                    }
                    b17 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b17 = 0;
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b17);
                break;
            case 14:
                setLanguagelambda1 setlanguagelambda2 = (setLanguagelambda1) obj;
                addAlias addalias = setlanguagelambda2.write;
                r8lambdajoIKu_XCIrU_X52X3vSL0ROPcOo r8lambdajoiku_xciru_x52x3vsl0ropcoo2 = setlanguagelambda2.MediaMetadataCompat;
                addToCustomAttributeArraylambda0 addtocustomattributearraylambda1 = setlanguagelambda2.MediaDescriptionCompat;
                r8lambdazL5YEDL8BIJUMJIduPEWP0aZmA r8lambdazl5yedl8bijumjidupewp0azma = setlanguagelambda2.IconCompatParcelizer;
                r8lambdauAWnoq1fYyNOHTe6W4x6GlR3NlQ r8lambdauawnoq1fyynohte6w4x6glr3nlq = setlanguagelambda2.serializer;
                addToCustomAttributeArray addtocustomattributearray = setlanguagelambda2.read;
                if (addalias != null) {
                    b18 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                    addAlias.IconCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setlanguagelambda2.write);
                } else {
                    b18 = 12;
                }
                if (addtocustomattributearray != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, b18);
                    addToCustomAttributeArray.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, addtocustomattributearray);
                }
                if (r8lambdauawnoq1fyynohte6w4x6glr3nlq != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, b18);
                    r8lambdauAWnoq1fYyNOHTe6W4x6GlR3NlQ.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdauawnoq1fyynohte6w4x6glr3nlq);
                }
                if (r8lambdazl5yedl8bijumjidupewp0azma != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, b18);
                    r8lambdazL5YEDL8BIJUMJIduPEWP0aZmA.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdazl5yedl8bijumjidupewp0azma);
                }
                if (addtocustomattributearraylambda1 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, b18);
                    addToCustomAttributeArraylambda0.IconCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, addtocustomattributearraylambda1);
                }
                if (r8lambdajoiku_xciru_x52x3vsl0ropcoo2 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, b18);
                    r8lambdajoIKu_XCIrU_X52X3vSL0ROPcOo.serializer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdajoiku_xciru_x52x3vsl0ropcoo2);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 15:
                setLastNamelambda0 setlastnamelambda0 = (setLastNamelambda0) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                String str6 = setlastnamelambda0.RemoteActionCompatParcelizer;
                String str7 = setlastnamelambda0.MediaSessionCompatQueueItem;
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(str6);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(setlastnamelambda0.write);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(setlastnamelambda0.read);
                String str8 = setlastnamelambda0.serializer;
                if (str8 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str8);
                }
                if (str7 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str7);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(setlastnamelambda0.MediaDescriptionCompat);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(7, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(setlastnamelambda0.MediaMetadataCompat);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(8, (byte) 8);
                SweepGradientShader9KIMszodefault.write(setlastnamelambda0.MediaBrowserCompatMediaItem, r8lambdat7xjd1d4humw0psb7whucfgonss, 9, (byte) 12);
                setLanguagelambda1.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setlastnamelambda0.RatingCompat);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(10, (byte) 10);
                IconCompatParcelizer.serializer(setlastnamelambda0.PlaybackStateCompat, r8lambdat7xjd1d4humw0psb7whucfgonss, 11, (byte) 10);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(setlastnamelambda0.PlaybackStateCompatCustomAction.longValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 16:
                setPhoneNumberlambda0 setphonenumberlambda0 = (setPhoneNumberlambda0) obj;
                setLastNamelambda0 setlastnamelambda1 = setphonenumberlambda0.write;
                setLineIdlambda20 setlineidlambda20 = setphonenumberlambda0.serializer;
                if (setlastnamelambda1 != null) {
                    b19 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                    setLastNamelambda0.IconCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setphonenumberlambda0.write);
                } else {
                    b19 = 12;
                }
                if (setlineidlambda20 != null) {
                    String str9 = setlineidlambda20.read;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, b19);
                    String str10 = setlineidlambda20.write;
                    String str11 = setlineidlambda20.RemoteActionCompatParcelizer;
                    String str12 = setlineidlambda20.serializer;
                    if (str9 != null) {
                        b21 = 11;
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str9);
                    } else {
                        b21 = 11;
                    }
                    if (str12 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, b21);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str12);
                    }
                    if (str11 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, b21);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str11);
                    }
                    if (str10 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, b21);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(str10);
                    }
                    b20 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b20 = 0;
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b20);
                break;
            case 17:
                unsetCustomUserAttributelambda1 unsetcustomuserattributelambda1 = (unsetCustomUserAttributelambda1) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                IconCompatParcelizer.serializer(unsetcustomuserattributelambda1.RemoteActionCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 10);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(unsetcustomuserattributelambda1.write.longValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 18:
                addAlias addalias2 = (addAlias) obj;
                Double d4 = addalias2.read;
                Double d5 = addalias2.MediaMetadataCompat;
                Double d6 = addalias2.serializer;
                String str13 = addalias2.RemoteActionCompatParcelizer;
                Double d7 = addalias2.write;
                if (d4 != null) {
                    b22 = 4;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 4);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(addalias2.read.doubleValue());
                } else {
                    b22 = 4;
                }
                if (d7 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, b22, d7);
                }
                if (str13 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str13);
                }
                if (d6 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, b22, b22, d6);
                }
                if (d5 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 5, b22, d5);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 19:
                getUserId getuserid = (getUserId) obj;
                String str14 = getuserid.write;
                String str15 = getuserid.MediaDescriptionCompat;
                String str16 = getuserid.RatingCompat;
                setFirstNamelambda0 setfirstnamelambda0 = getuserid.IconCompatParcelizer;
                String str17 = getuserid.RemoteActionCompatParcelizer;
                Double d8 = getuserid.serializer;
                List list2 = getuserid.MediaBrowserCompatMediaItem;
                if (str14 != null) {
                    b23 = 11;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(getuserid.write);
                } else {
                    b23 = 11;
                }
                if (d8 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 4, d8);
                }
                if (str17 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, b23);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str17);
                }
                if (setfirstnamelambda0 != null) {
                    Double d9 = setfirstnamelambda0.RemoteActionCompatParcelizer;
                    b24 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 12);
                    if (d9 != null) {
                        af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 1, (byte) 4, d9);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b24 = 12;
                }
                if (list2 != null) {
                    Iterator itWrite2 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 5, (byte) 15, list2, b24);
                    while (itWrite2.hasNext()) {
                        isTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (isTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release) itWrite2.next());
                    }
                }
                if (str16 != null) {
                    b25 = 11;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str16);
                } else {
                    b25 = 11;
                }
                if (str15 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(7, b25);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str15);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 20:
                setCustomAttribute setcustomattribute = (setCustomAttribute) obj;
                List list3 = setcustomattribute.read;
                Byte b37 = setcustomattribute.serializer;
                if (list3 != null) {
                    Iterator itWrite3 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 1, (byte) 15, list3, (byte) 6);
                    while (itWrite3.hasNext()) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(((Short) itWrite3.next()).shortValue());
                    }
                }
                if (b37 != null) {
                    getBitmapFromCache.read((byte) 3, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, b37);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 21:
                setEmail setemail = (setEmail) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                String str18 = setemail.IconCompatParcelizer;
                List list4 = setemail.MediaSessionCompatQueueItem;
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(str18);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 10);
                IconCompatParcelizer.serializer(setemail.serializer, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 10);
                IconCompatParcelizer.serializer(setemail.RemoteActionCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 6);
                IconCompatParcelizer.read((byte) 2, 5, r8lambdat7xjd1d4humw0psb7whucfgonss, setemail.write);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(setemail.MediaMetadataCompat.booleanValue() ? (byte) 1 : (byte) 0);
                List list5 = setemail.MediaDescriptionCompat;
                if (list5 != null) {
                    Iterator itWrite4 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 6, (byte) 15, list5, (byte) 12);
                    while (itWrite4.hasNext()) {
                        createNotification.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (createNotification) itWrite4.next());
                    }
                }
                if (list4 != null) {
                    Iterator itWrite5 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 7, (byte) 15, list4, (byte) 12);
                    while (itWrite5.hasNext()) {
                        removeFromSubscriptionGrouplambda0.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (removeFromSubscriptionGrouplambda0) itWrite5.next());
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 22:
                setLocationCustomAttribute setlocationcustomattribute2 = (setLocationCustomAttribute) obj;
                if (setlocationcustomattribute2.serializer != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(setlocationcustomattribute2.serializer);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 23:
                BrazeUserExternalSyntheticLambda0 brazeUserExternalSyntheticLambda0 = (BrazeUserExternalSyntheticLambda0) obj;
                String str19 = brazeUserExternalSyntheticLambda0.RemoteActionCompatParcelizer;
                Double d10 = brazeUserExternalSyntheticLambda0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                String str20 = brazeUserExternalSyntheticLambda0.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                String str21 = brazeUserExternalSyntheticLambda0.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                String str22 = brazeUserExternalSyntheticLambda0.ResultReceiver;
                Double d11 = brazeUserExternalSyntheticLambda0.ComponentActivity;
                Double d12 = brazeUserExternalSyntheticLambda0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                Double d13 = brazeUserExternalSyntheticLambda0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                String str23 = brazeUserExternalSyntheticLambda0.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                String str24 = brazeUserExternalSyntheticLambda0.PlaybackStateCompat;
                Double d14 = brazeUserExternalSyntheticLambda0.PlaybackStateCompatCustomAction;
                Double d15 = brazeUserExternalSyntheticLambda0.ParcelableVolumeInfo;
                Double d16 = brazeUserExternalSyntheticLambda0.MediaSessionCompatResultReceiverWrapper;
                Double d17 = brazeUserExternalSyntheticLambda0.MediaSessionCompatToken;
                Boolean bool16 = brazeUserExternalSyntheticLambda0.MediaDescriptionCompat;
                Boolean bool17 = brazeUserExternalSyntheticLambda0.MediaMetadataCompat;
                Double d18 = brazeUserExternalSyntheticLambda0.RatingCompat;
                String str25 = brazeUserExternalSyntheticLambda0.MediaBrowserCompatMediaItem;
                Double d19 = brazeUserExternalSyntheticLambda0.MediaSessionCompatQueueItem;
                String str26 = brazeUserExternalSyntheticLambda0.IconCompatParcelizer;
                String str27 = brazeUserExternalSyntheticLambda0.write;
                String str28 = brazeUserExternalSyntheticLambda0.serializer;
                if (str19 != null) {
                    b26 = 11;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(brazeUserExternalSyntheticLambda0.RemoteActionCompatParcelizer);
                } else {
                    b26 = 11;
                }
                if (str28 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, b26);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str28);
                }
                if (str27 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, b26);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str27);
                }
                if (str26 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, b26);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str26);
                }
                if (d19 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 5, (byte) 4, d19);
                }
                if (str25 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, b26);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str25);
                }
                if (d18 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 7, (byte) 4, d18);
                }
                if (bool17 != null) {
                    b27 = 2;
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 8, (byte) 2, bool17);
                } else {
                    b27 = 2;
                }
                if (bool16 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 9, b27, bool16);
                }
                if (d17 != null) {
                    b28 = 4;
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 10, (byte) 4, d17);
                } else {
                    b28 = 4;
                }
                if (d16 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 11, b28, d16);
                }
                if (d15 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 12, b28, d15);
                }
                if (d14 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 13, b28, d14);
                }
                if (str24 != null) {
                    b29 = 11;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(14, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str24);
                } else {
                    b29 = 11;
                }
                if (str23 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(15, b29);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str23);
                }
                if (d13 != null) {
                    b30 = 4;
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 16, (byte) 4, d13);
                } else {
                    b30 = 4;
                }
                if (d12 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 17, b30, d12);
                }
                if (d11 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 18, b30, d11);
                }
                if (str22 != null) {
                    b31 = 11;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(19, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str22);
                } else {
                    b31 = 11;
                }
                if (str21 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(20, b31);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str21);
                }
                if (str20 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(21, b31);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str20);
                }
                if (d10 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 22, (byte) 4, d10);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 24:
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(((createUriActionFromUrlString) obj).read.longValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 25:
                IBrazeDeeplinkHandler iBrazeDeeplinkHandler = (IBrazeDeeplinkHandler) obj;
                if (iBrazeDeeplinkHandler.RemoteActionCompatParcelizer != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(iBrazeDeeplinkHandler.RemoteActionCompatParcelizer);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 26:
                gotoUri gotouri = (gotoUri) obj;
                String str29 = gotouri.RemoteActionCompatParcelizer;
                String str30 = gotouri.read;
                if (str29 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(gotouri.RemoteActionCompatParcelizer);
                }
                if (str30 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str30);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 27:
                Rraw rraw = (Rraw) obj;
                String str31 = rraw.serializer;
                String str32 = rraw.MediaDescriptionCompat;
                Double d20 = rraw.MediaBrowserCompatMediaItem;
                Double d21 = rraw.MediaSessionCompatQueueItem;
                Double d22 = rraw.write;
                String str33 = rraw.read;
                String str34 = rraw.IconCompatParcelizer;
                if (str31 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(rraw.serializer);
                }
                if (str34 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str34);
                }
                if (str33 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str33);
                }
                if (d22 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 4, d22);
                }
                if (d21 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 5, (byte) 4, d21);
                }
                if (d20 != null) {
                    af$$ExternalSyntheticOutline1.m(r8lambdat7xjd1d4humw0psb7whucfgonss, 6, (byte) 4, d20);
                }
                if (str32 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(7, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str32);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 28:
                getAdmMessagingRegistrationEnabledandroid_sdk_base_release getadmmessagingregistrationenabledandroid_sdk_base_release = (getAdmMessagingRegistrationEnabledandroid_sdk_base_release) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(getadmmessagingregistrationenabledandroid_sdk_base_release.IconCompatParcelizer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(getadmmessagingregistrationenabledandroid_sdk_base_release.serializer);
                String str35 = getadmmessagingregistrationenabledandroid_sdk_base_release.write;
                if (str35 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str35);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            default:
                setFirebaseCloudMessagingSenderIdKeylambda0 setfirebasecloudmessagingsenderidkeylambda0 = (setFirebaseCloudMessagingSenderIdKeylambda0) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                Long l4 = setfirebasecloudmessagingsenderidkeylambda0.write;
                Byte b38 = setfirebasecloudmessagingsenderidkeylambda0.MediaSessionCompatQueueItem;
                Byte b39 = setfirebasecloudmessagingsenderidkeylambda0.MediaDescriptionCompat;
                Integer num10 = setfirebasecloudmessagingsenderidkeylambda0.MediaMetadataCompat;
                Integer num11 = setfirebasecloudmessagingsenderidkeylambda0.RemoteActionCompatParcelizer;
                List list6 = setfirebasecloudmessagingsenderidkeylambda0.MediaBrowserCompatMediaItem;
                IconCompatParcelizer.serializer(l4, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 10);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(setfirebasecloudmessagingsenderidkeylambda0.read.longValue());
                Integer num12 = setfirebasecloudmessagingsenderidkeylambda0.IconCompatParcelizer;
                if (num12 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 8, num12);
                }
                if (num11 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 8, num11);
                }
                if (num10 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 5, (byte) 8, num10);
                }
                if (b39 != null) {
                    getBitmapFromCache.read((byte) 3, 6, r8lambdat7xjd1d4humw0psb7whucfgonss, b39);
                }
                if (list6 != null) {
                    Iterator itWrite6 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 7, (byte) 15, list6, (byte) 12);
                    while (itWrite6.hasNext()) {
                        setLastKnownLocationlambda0 setlastknownlocationlambda0 = (setLastKnownLocationlambda0) itWrite6.next();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                        IconCompatParcelizer.serializer(setlastknownlocationlambda0.serializer, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 8);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.read(setlastknownlocationlambda0.read.intValue());
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    }
                }
                if (b38 != null) {
                    getBitmapFromCache.read((byte) 3, 8, r8lambdat7xjd1d4humw0psb7whucfgonss, b38);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
        }
    }
}
