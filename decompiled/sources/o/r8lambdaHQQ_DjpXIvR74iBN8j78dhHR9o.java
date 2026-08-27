package o;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.thrift.O$b;
import com.sentiance.core.model.thrift.k$c;
import com.sentiance.okhttp3.u$a;
import io.sentry.util.network.NetworkBody;
import io.socket.parser.IOParser$Decoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o implements r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    public final /* synthetic */ int read;

    public /* synthetic */ r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(int i) {
        this.read = i;
    }

    private final Object IconCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        setPhoneNumberlambda3 setphonenumberlambda3 = new setPhoneNumberlambda3();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return new r8lambdadWTsgiaqHAxPuFwuGaSdvp1Vhw(setphonenumberlambda3);
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        if (s != 4) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        } else if (b == 11) {
                            setphonenumberlambda3.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        }
                    } else if (b == 11) {
                        setphonenumberlambda3.IconCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                } else if (b == 11) {
                    setphonenumberlambda3.write = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 11) {
                setphonenumberlambda3.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    private final Object read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return iOParser$Decoder.MediaMetadataCompat();
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                } else if (b == 3) {
                    iOParser$Decoder.read = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 10) {
                iOParser$Decoder.RemoteActionCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
    }

    private final Object write(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        k$c k_c = new k$c();
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                return new IBrazeNotificationFactory(k_c);
            }
            int i = 0;
            switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                case 1:
                    if (b != 15) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int i2 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList = new ArrayList(i2);
                        while (i < i2) {
                            arrayList.add((getUserId) getUserId.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            i++;
                        }
                        k_c.RemoteActionCompatParcelizer = arrayList;
                    }
                    break;
                case 2:
                    if (b != 15) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int i3 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList2 = new ArrayList(i3);
                        while (i < i3) {
                            arrayList2.add((setCountry) setCountry.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            i++;
                        }
                        k_c.write = arrayList2;
                    }
                    break;
                case 3:
                    if (b != 15) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int i4 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList3 = new ArrayList(i4);
                        while (i < i4) {
                            arrayList3.add((r8lambdadWTsgiaqHAxPuFwuGaSdvp1Vhw) r8lambdadWTsgiaqHAxPuFwuGaSdvp1Vhw.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            i++;
                        }
                        k_c.IconCompatParcelizer = arrayList3;
                    }
                    break;
                case 4:
                    if (b != 15) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int i5 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList4 = new ArrayList(i5);
                        while (i < i5) {
                            arrayList4.add((_set_userId_lambda0) _set_userId_lambda0.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            i++;
                        }
                        k_c.read = arrayList4;
                    }
                    break;
                case 5:
                    if (b != 15) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int i6 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList5 = new ArrayList(i6);
                        while (i < i6) {
                            arrayList5.add((setBrazeSdkMetadataandroid_sdk_base_release) setBrazeSdkMetadataandroid_sdk_base_release.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            i++;
                        }
                        k_c.serializer = arrayList5;
                    }
                    break;
                case 6:
                    if (b != 15) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int i7 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList6 = new ArrayList(i7);
                        while (i < i7) {
                            arrayList6.add((setPushNotificationSubscriptionTypelambda0) setPushNotificationSubscriptionTypelambda0.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            i++;
                        }
                        k_c.MediaBrowserCompatMediaItem = arrayList6;
                    }
                    break;
                case 7:
                    if (b != 15) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int i8 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList7 = new ArrayList(i8);
                        while (i < i8) {
                            arrayList7.add((Rraw) Rraw.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            i++;
                        }
                        k_c.MediaSessionCompatQueueItem = arrayList7;
                    }
                    break;
                case 8:
                    if (b != 15) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else {
                        int i9 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList8 = new ArrayList(i9);
                        while (i < i9) {
                            arrayList8.add((setApiKeylambda0) setApiKeylambda0.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                            i++;
                        }
                        k_c.MediaDescriptionCompat = arrayList8;
                    }
                    break;
                default:
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    break;
            }
        }
    }

    private final Object serializer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY((byte) 0, 1);
        while (true) {
            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
            byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            if (b == 0) {
                break;
            }
            short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    } else if (b == 3) {
                        r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                    }
                } else if (b == 3) {
                    r8lambdadeozq815xuuwmllyyvm_qv79qy.write = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                }
            } else if (b == 6) {
                r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
            } else {
                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
            }
        }
        if (((Short) r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer) != null) {
            if (((Byte) r8lambdadeozq815xuuwmllyyvm_qv79qy.write) != null) {
                if (((Byte) r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer) != null) {
                    return new BrazeUserExternalSyntheticLambda28(r8lambdadeozq815xuuwmllyyvm_qv79qy);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'low_disk_space_state_percent_threshold' is missing");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'low_battery_level_state_percent_threshold' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'minimum_app_foreground_trigger_interval_in_minutes' is missing");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        int i = this.read;
        BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21 = BrazeCompanionExternalSyntheticLambda4.IconCompatParcelizer;
        int i2 = 3;
        int i3 = 8;
        int i4 = 6;
        ?? r11 = 0;
        switch (i) {
            case 0:
                r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q r8lambdabirsljoagmyxhikohl5z5hht12q = new r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
                    if (b == 0) {
                        return new r8lambdaE7oIx09KQauliA8paOfGanE2_e8(r8lambdabirsljoagmyxhikohl5z5hht12q);
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer) {
                        case 1:
                            if (b == 12) {
                                r8lambdabirsljoagmyxhikohl5z5hht12q.serializer = (BrazeCompanionExternalSyntheticLambda4) brazeCompanionExternalSyntheticLambda21.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        case 2:
                            if (b == 15) {
                                int i5 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                ArrayList arrayList = new ArrayList(i5);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    arrayList.add((r8lambdaR6dAybf4g5pc5sZkFujTnBDSk) r8lambdaR6dAybf4g5pc5sZkFujTnBDSk.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                                }
                                r8lambdabirsljoagmyxhikohl5z5hht12q.RemoteActionCompatParcelizer = arrayList;
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        case 3:
                            if (b == 6) {
                                r8lambdabirsljoagmyxhikohl5z5hht12q.IconCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        case 4:
                            if (b == 6) {
                                r8lambdabirsljoagmyxhikohl5z5hht12q.write = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        case 5:
                            if (b == 6) {
                                r8lambdabirsljoagmyxhikohl5z5hht12q.read = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        case 6:
                            if (b == 6) {
                                r8lambdabirsljoagmyxhikohl5z5hht12q.MediaMetadataCompat = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        case 7:
                            if (b == 15) {
                                int i7 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                ArrayList arrayList2 = new ArrayList(i7);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    arrayList2.add((BrazeCompanionExternalSyntheticLambda4) brazeCompanionExternalSyntheticLambda21.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                                }
                                r8lambdabirsljoagmyxhikohl5z5hht12q.MediaSessionCompatQueueItem = arrayList2;
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        case 8:
                            if (b == 11) {
                                r8lambdabirsljoagmyxhikohl5z5hht12q.MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        case 9:
                            if (b == 3) {
                                r8lambdabirsljoagmyxhikohl5z5hht12q.MediaDescriptionCompat = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                            break;
                        case 10:
                            if (b == 6) {
                                r8lambdabirsljoagmyxhikohl5z5hht12q.RatingCompat = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
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
                androidx.lifecycle.BlockRunner blockRunner = new androidx.lifecycle.BlockRunner();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.RemoteActionCompatParcelizer;
                    if (b2 == 0) {
                        if (((String) blockRunner.read) != null) {
                            if (((Double) blockRunner.serializer) != null) {
                                if (((Double) blockRunner.RatingCompat) != null) {
                                    if (((Integer) blockRunner.write) != null) {
                                        if (((String) blockRunner.RemoteActionCompatParcelizer) != null) {
                                            return new r8lambda6bGutJ7rIyvBAu8XSUqBiLxTz6E(blockRunner);
                                        }
                                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'geofence_list_id' is missing");
                                        return null;
                                    }
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'radius' is missing");
                                    return null;
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'longitude' is missing");
                                return null;
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'latitude' is missing");
                            return null;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'sentiance_id' is missing");
                        return null;
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.serializer) {
                        case 1:
                            if (b2 == 11) {
                                blockRunner.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 2:
                            if (b2 == 4) {
                                blockRunner.serializer = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 3:
                            if (b2 == 4) {
                                blockRunner.RatingCompat = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 4:
                            if (b2 == 8) {
                                blockRunner.write = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 5:
                            if (b2 == 11) {
                                blockRunner.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                            break;
                        case 6:
                            if (b2 == 11) {
                                blockRunner.IconCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
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
            case 2:
                O$b o$b = new O$b();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b3 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.RemoteActionCompatParcelizer;
                    if (b3 == 0) {
                        return o$b.write();
                    }
                    short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.serializer;
                    if (s != 1) {
                        if (s != 2) {
                            if (s != 3) {
                                if (s != 4) {
                                    if (s != 5) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                                    } else if (b3 == 2) {
                                        o$b.IconCompatParcelizer = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                                    }
                                } else if (b3 == 8) {
                                    o$b.read = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                                }
                            } else if (b3 == 8) {
                                o$b.serializer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                            }
                        } else if (b3 == 10) {
                            o$b.RemoteActionCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                        }
                    } else if (b3 == 10) {
                        o$b.write = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                    }
                }
                break;
            case 3:
                u$a u_a = new u$a();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b4 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.RemoteActionCompatParcelizer;
                    if (b4 == 0) {
                        if (u_a.IconCompatParcelizer != null) {
                            return new r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog(u_a);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'timelines' is missing");
                        return null;
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                    } else if (b4 == 15) {
                        int i9 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                        ArrayList arrayList3 = new ArrayList(i9);
                        for (int i10 = 0; i10 < i9; i10++) {
                            arrayList3.add(Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat()));
                        }
                        u_a.IconCompatParcelizer = arrayList3;
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                    }
                }
                break;
            case 4:
                setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(i4, (boolean) r11);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b5 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5.RemoteActionCompatParcelizer;
                    if (b5 == 0) {
                        if (((r8lambdaXwjHgoHSivQ1p7NGKxWRhunWE) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write) != null) {
                            return new r8lambdaSfjrR_HlZhgR9qJKoiGmntl4F8o(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'transport_state' is missing");
                        return null;
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                    } else if (b5 == 12) {
                        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write = (r8lambdaXwjHgoHSivQ1p7NGKxWRhunWE) r8lambdaXwjHgoHSivQ1p7NGKxWRhunWE.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                    }
                }
                break;
            case 5:
                NetworkBody networkBody = new NetworkBody(15);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b6 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6.RemoteActionCompatParcelizer;
                    if (b6 == 0) {
                        if (((BrazeCompanionExternalSyntheticLambda4) networkBody.IconCompatParcelizer) != null) {
                            return new r8lambdaUwXDSMrlNtZuDA6i1VDnmBTUWe4(networkBody);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'location' is missing");
                        return null;
                    }
                    short s2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6.serializer;
                    if (s2 != 1) {
                        if (s2 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                        } else if (b6 == 12) {
                            networkBody.RemoteActionCompatParcelizer = (clearInstanceandroid_sdk_base_release) clearInstanceandroid_sdk_base_release.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                        }
                    } else if (b6 == 12) {
                        networkBody.IconCompatParcelizer = (BrazeCompanionExternalSyntheticLambda4) brazeCompanionExternalSyntheticLambda21.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                    }
                }
                break;
            case 6:
                r8lambdaYSi20pxlMiebc1pB9oHakC0OvU r8lambdaysi20pxlmiebc1pb9ohakc0ovu = new r8lambdaYSi20pxlMiebc1pB9oHakC0OvU();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b7 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7.RemoteActionCompatParcelizer;
                    if (b7 == 0) {
                        return r8lambdaysi20pxlmiebc1pb9ohakc0ovu.write();
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7.serializer) {
                        case 1:
                            if (b7 == 12) {
                                r8lambdaysi20pxlmiebc1pb9ohakc0ovu.serializer = (r8lambdaSkwTftgXIpCd_0z_JGsIzJVLWBQ) r8lambdaSkwTftgXIpCd_0z_JGsIzJVLWBQ.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 2:
                            if (b7 == 12) {
                                BrazeCompanionExternalSyntheticLambda8 brazeCompanionExternalSyntheticLambda8 = new BrazeCompanionExternalSyntheticLambda8();
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b8 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8.RemoteActionCompatParcelizer;
                                    if (b8 == 0) {
                                        r8lambdaysi20pxlmiebc1pb9ohakc0ovu.read = new BrazeActivityLifecycleCallbackListener(brazeCompanionExternalSyntheticLambda8);
                                        break;
                                    } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8.serializer != 1) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                                    } else if (b8 == 10) {
                                        brazeCompanionExternalSyntheticLambda8.IconCompatParcelizer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                                    }
                                }
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                                break;
                            }
                            break;
                        case 3:
                            if (b7 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaysi20pxlmiebc1pb9ohakc0ovu.IconCompatParcelizer = new setInAppMessagingRegistrationBlocklistlambda0();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 4:
                            if (b7 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaysi20pxlmiebc1pb9ohakc0ovu.write = new stopInstancelambda0();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 5:
                            if (b7 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaysi20pxlmiebc1pb9ohakc0ovu.RemoteActionCompatParcelizer = new r8lambdaswaApDEpJuUbSweU4qc2vSdr5ig();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 6:
                            if (b7 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaysi20pxlmiebc1pb9ohakc0ovu.MediaSessionCompatQueueItem = new getShouldPersistWebViewannotations();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 7:
                            if (b7 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaysi20pxlmiebc1pb9ohakc0ovu.RatingCompat = new getStaticExternalIEventMessengerandroid_sdk_base_release();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 8:
                            if (b7 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaysi20pxlmiebc1pb9ohakc0ovu.MediaMetadataCompat = new r8lambdak2pvEAhtRA0xuzvc1NI7cWGFSRU();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 9:
                            if (b7 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaysi20pxlmiebc1pb9ohakc0ovu.MediaDescriptionCompat = new requestTriggersIfInAppMessageTestPushandroid_sdk_base_release();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 10:
                            if (b7 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaysi20pxlmiebc1pb9ohakc0ovu.MediaBrowserCompatMediaItem = new r8lambdaPMXCRRx_V6F5OLH9NqODP3ZZ0();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 11:
                            if (b7 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaysi20pxlmiebc1pb9ohakc0ovu.MediaSessionCompatResultReceiverWrapper = new onActivityStoppedlambda0();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 12:
                            if (b7 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaysi20pxlmiebc1pb9ohakc0ovu.ParcelableVolumeInfo = new setShouldRequestFrameworkListenToNetworkUpdatesandroid_sdk_base_release();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 13:
                            if (b7 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaysi20pxlmiebc1pb9ohakc0ovu.PlaybackStateCompatCustomAction = new getShouldRequestFrameworkListenToNetworkUpdatesandroid_sdk_base_release();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 14:
                            if (b7 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaysi20pxlmiebc1pb9ohakc0ovu.PlaybackStateCompat = new r8lambdaBJpDEH5g5iqG_nC8CR__jPyOOko();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 15:
                            if (b7 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaysi20pxlmiebc1pb9ohakc0ovu.MediaSessionCompatToken = new onActivityStartedlambda0();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 16:
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            break;
                        case 17:
                            if (b7 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaysi20pxlmiebc1pb9ohakc0ovu.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new r8lambda3om67_EEI5UKut_LIHa23kd33g();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                        case 18:
                            if (b7 == 12) {
                                while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                                }
                                r8lambdaysi20pxlmiebc1pb9ohakc0ovu.ComponentActivity = new stopInstanceandroid_sdk_base_release();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                            break;
                    }
                }
                break;
            case 7:
                C$b c$b = new C$b();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b9 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9.RemoteActionCompatParcelizer;
                    if (b9 == 0) {
                        if (((String) c$b.IconCompatParcelizer) != null) {
                            if (((r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0) c$b.serializer) != null) {
                                if (((ArrayList) c$b.write) != null) {
                                    return new r8lambdalhrh0WCduaLB1UBrBFl71Ebc4o(c$b);
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'place_candidates' is missing");
                                return null;
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'place' is missing");
                            return null;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'significance' is missing");
                        return null;
                    }
                    short s3 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9.serializer;
                    if (s3 != 1) {
                        r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE r8lambdao3_bo_8zvdrigycl2l6jayoawe = r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0.RemoteActionCompatParcelizer;
                        if (s3 != 2) {
                            if (s3 != 3) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                            } else if (b9 == 15) {
                                int i11 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                ArrayList arrayList4 = new ArrayList(i11);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    arrayList4.add((r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0) r8lambdao3_bo_8zvdrigycl2l6jayoawe.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss));
                                }
                                c$b.write = arrayList4;
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                            }
                        } else if (b9 == 12) {
                            c$b.serializer = (r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0) r8lambdao3_bo_8zvdrigycl2l6jayoawe.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                        }
                    } else if (b9 == 11) {
                        c$b.IconCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                    }
                }
                break;
            case 8:
                r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls = new r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b10 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10.RemoteActionCompatParcelizer;
                    if (b10 == 0) {
                        return new r8lambdazL5YEDL8BIJUMJIduPEWP0aZmA(r8lambdayc78smgbbb6fudfjq0u5z3_ls);
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10.serializer) {
                        case 1:
                            if (b10 == 11) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                            }
                            break;
                        case 2:
                            if (b10 == 2) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                            }
                            break;
                        case 3:
                            if (b10 == 8) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                            }
                            break;
                        case 4:
                            if (b10 == 8) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.write = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                            }
                            break;
                        case 5:
                            if (b10 == 8) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.read = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                            }
                            break;
                        case 6:
                            if (b10 == 2) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                            break;
                    }
                }
                break;
            case 9:
                isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(i2);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b11 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11.RemoteActionCompatParcelizer;
                    if (b11 == 0) {
                        if (((Integer) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer) != null) {
                            if (((Integer) iscontentcardsunreadvisualindicatorenabled.write) != null) {
                                if (((Short) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer) != null) {
                                    if (((Long) iscontentcardsunreadvisualindicatorenabled.read) != null) {
                                        return new addAliaslambda3(iscontentcardsunreadvisualindicatorenabled);
                                    }
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'timestamp' is missing");
                                    return null;
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'horizontal_accuracy' is missing");
                                return null;
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'longitude' is missing");
                            return null;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'latitude' is missing");
                        return null;
                    }
                    short s4 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11.serializer;
                    if (s4 != 1) {
                        if (s4 != 2) {
                            if (s4 != 3) {
                                if (s4 != 4) {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                                } else if (b11 == 10) {
                                    iscontentcardsunreadvisualindicatorenabled.read = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                                }
                            } else if (b11 == 6) {
                                iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                            }
                        } else if (b11 == 8) {
                            iscontentcardsunreadvisualindicatorenabled.write = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                        }
                    } else if (b11 == 8) {
                        iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                    }
                }
                break;
            case 10:
                NetworkBody networkBody2 = new NetworkBody(16);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b12 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12.RemoteActionCompatParcelizer;
                    if (b12 == 0) {
                        return networkBody2.RemoteActionCompatParcelizer();
                    }
                    short s5 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12.serializer;
                    if (s5 != 1) {
                        if (s5 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                        } else if (b12 == 12) {
                            networkBody2.RemoteActionCompatParcelizer = (setCountrylambda0) setCountrylambda0.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                        }
                    } else if (b12 == 12) {
                        networkBody2.IconCompatParcelizer = (setBadNetworkIntervalandroid_sdk_base_release) setBadNetworkIntervalandroid_sdk_base_release.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                    }
                }
                break;
            case 11:
                FormBody.Builder builder = new FormBody.Builder();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem13 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b13 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem13.RemoteActionCompatParcelizer;
                    if (b13 == 0) {
                        if (((setLocationCustomAttributelambda1) builder.serializer) != null) {
                            if (((setLanguagelambda0) builder.RemoteActionCompatParcelizer) != null) {
                                return new setAttributionDatalambda0(builder);
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'sensor' is missing");
                            return null;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'hub' is missing");
                        return null;
                    }
                    short s6 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem13.serializer;
                    if (s6 != 1) {
                        if (s6 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                        } else if (b13 == 12) {
                            builder.RemoteActionCompatParcelizer = (setLanguagelambda0) setLanguagelambda0.write.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                        }
                    } else if (b13 == 12) {
                        builder.serializer = (setLocationCustomAttributelambda1) setLocationCustomAttributelambda1.serializer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b13);
                    }
                }
                break;
            case 12:
                NetworkBody networkBody3 = new NetworkBody(17);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem14 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b14 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem14.RemoteActionCompatParcelizer;
                    if (b14 == 0) {
                        if (((setCustomEndpoint) networkBody3.IconCompatParcelizer) != null) {
                            if (((unsetLocationCustomAttributelambda2) networkBody3.RemoteActionCompatParcelizer) != null) {
                                return new setCustomAttributelambda11(networkBody3);
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'install' is missing");
                            return null;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'person' is missing");
                        return null;
                    }
                    short s7 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem14.serializer;
                    if (s7 != 1) {
                        if (s7 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                        } else if (b14 == 12) {
                            networkBody3.RemoteActionCompatParcelizer = (unsetLocationCustomAttributelambda2) unsetLocationCustomAttributelambda2.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                        }
                    } else if (b14 == 12) {
                        r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(13);
                        while (true) {
                            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem15 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                            byte b15 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem15.RemoteActionCompatParcelizer;
                            if (b15 == 0) {
                                networkBody3.IconCompatParcelizer = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer();
                            } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem15.serializer != 1) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b15);
                            } else if (b15 == 11) {
                                r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b15);
                            }
                        }
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                    }
                }
                break;
            case 13:
                FormBody.Builder builder2 = new FormBody.Builder();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem16 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b16 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem16.RemoteActionCompatParcelizer;
                    if (b16 == 0) {
                        if (((setHomeCitylambda0) builder2.serializer) != null) {
                            if (((setEmaillambda0) builder2.RemoteActionCompatParcelizer) != null) {
                                return new setCustomUserAttributelambda7(builder2);
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'configuration' is missing");
                            return null;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'token' is missing");
                        return null;
                    }
                    short s8 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem16.serializer;
                    if (s8 != 1) {
                        if (s8 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                        } else if (b16 == 12) {
                            builder2.RemoteActionCompatParcelizer = (setEmaillambda0) setEmaillambda0.read.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                        }
                    } else if (b16 == 12) {
                        builder2.serializer = (setHomeCitylambda0) setHomeCitylambda0.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b16);
                    }
                }
                break;
            case 14:
                setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release2 = new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(i3, (boolean) r11);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem17 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b17 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem17.RemoteActionCompatParcelizer;
                    if (b17 == 0) {
                        return new setFirstNamelambda0(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release2);
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem17.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                    } else if (b17 == 4) {
                        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release2.write = Double.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b17);
                    }
                }
                break;
            case 15:
                r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k2 = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(7);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem18 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b18 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem18.RemoteActionCompatParcelizer;
                    if (b18 == 0) {
                        r11 = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k2.RemoteActionCompatParcelizer != null ? 1 : 0;
                        if (r11 == 1) {
                            return new setLanguagelambda0(r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k2);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m((int) r11, "Invalid union; ", " field(s) were set"));
                        return null;
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem18.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b18);
                    } else if (b18 == 11) {
                        r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k2.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b18);
                    }
                }
                break;
            case 16:
                r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem19 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b19 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem19.RemoteActionCompatParcelizer;
                    if (b19 == 0) {
                        if (((Boolean) r8lambda1mnczrzuv4owduwgkg6cjtsws.write) != null) {
                            return new setLineIdlambda0(r8lambda1mnczrzuv4owduwgkg6cjtsws);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'enabled' is missing");
                        return null;
                    }
                    short s9 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem19.serializer;
                    if (s9 != 1) {
                        if (s9 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b19);
                        } else if (b19 == 13) {
                            int i13 = r8lambdat7xjd1d4humw0psb7whucfgonss.write().RemoteActionCompatParcelizer;
                            HashMap map = new HashMap(i13);
                            for (int i14 = 0; i14 < i13; i14++) {
                                short sPlaybackStateCompatCustomAction = r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction();
                                setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release3 = new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(9, (boolean) r11);
                                while (true) {
                                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem20 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                                    byte b20 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem20.RemoteActionCompatParcelizer;
                                    if (b20 == 0) {
                                        if (((Short) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release3.write) != null) {
                                            map.put(Short.valueOf(sPlaybackStateCompatCustomAction), new setLocationCustomAttributelambda3(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release3));
                                        } else {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'peak_threshold' is missing");
                                            return null;
                                        }
                                    } else if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem20.serializer != 1) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b20);
                                    } else if (b20 == 6) {
                                        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release3.write = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b20);
                                    }
                                }
                            }
                            r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer = map;
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b19);
                        }
                    } else if (b19 == 2) {
                        r8lambda1mnczrzuv4owduwgkg6cjtsws.write = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b19);
                    }
                }
                break;
            case 17:
                r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k3 = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(8);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem21 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b21 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem21.RemoteActionCompatParcelizer;
                    if (b21 == 0) {
                        int i15 = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k3.RemoteActionCompatParcelizer != null ? 1 : 0;
                        if (i15 == 1) {
                            return new setLocationCustomAttributelambda1(r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k3);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i15, "Invalid union; ", " field(s) were set"));
                        return null;
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem21.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b21);
                    } else if (b21 == 11) {
                        r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k3.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b21);
                    }
                }
                break;
            case 18:
                applyPendingRuntimeConfiguration applypendingruntimeconfiguration = new applyPendingRuntimeConfiguration();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem22 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b22 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem22.RemoteActionCompatParcelizer;
                    if (b22 == 0) {
                        return new setPhoneNumberlambda20(applypendingruntimeconfiguration);
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem22.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b22);
                    } else if (b22 == 2) {
                        applypendingruntimeconfiguration.read = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b22);
                    }
                }
                break;
            case 19:
                r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls2 = new r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem23 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b23 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem23.RemoteActionCompatParcelizer;
                    if (b23 == 0) {
                        return r8lambdayc78smgbbb6fudfjq0u5z3_ls2.IconCompatParcelizer();
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem23.serializer) {
                        case 1:
                            if (b23 == 11) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls2.serializer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b23);
                            }
                            break;
                        case 2:
                            if (b23 == 11) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls2.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b23);
                            }
                            break;
                        case 3:
                            if (b23 == 11) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls2.MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b23);
                            }
                            break;
                        case 4:
                            if (b23 == 11) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls2.IconCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b23);
                            }
                            break;
                        case 5:
                            if (b23 == 11) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls2.write = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b23);
                            }
                            break;
                        case 6:
                            if (b23 == 11) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls2.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b23);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b23);
                            break;
                    }
                }
                break;
            case 20:
                r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k4 = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(10);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem24 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b24 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem24.RemoteActionCompatParcelizer;
                    if (b24 == 0) {
                        int i16 = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k4.RemoteActionCompatParcelizer != null ? 1 : 0;
                        if (i16 == 1) {
                            return new incrementCustomUserAttribute(r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k4);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i16, "Invalid union; ", " field(s) were set"));
                        return null;
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem24.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b24);
                    } else if (b24 == 11) {
                        r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k4.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b24);
                    }
                }
                break;
            case 21:
                r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls3 = new r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem25 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b25 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem25.RemoteActionCompatParcelizer;
                    if (b25 == 0) {
                        return new setCustomUserAttribute(r8lambdayc78smgbbb6fudfjq0u5z3_ls3);
                    }
                    switch (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem25.serializer) {
                        case 1:
                            if (b25 == 6) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls3.serializer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b25);
                            }
                            break;
                        case 2:
                            if (b25 == 6) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls3.RemoteActionCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b25);
                            }
                            break;
                        case 3:
                            if (b25 == 6) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls3.MediaBrowserCompatMediaItem = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b25);
                            }
                            break;
                        case 4:
                            if (b25 == 6) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls3.IconCompatParcelizer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b25);
                            }
                            break;
                        case 5:
                            if (b25 == 6) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls3.write = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b25);
                            }
                            break;
                        case 6:
                            if (b25 == 6) {
                                r8lambdayc78smgbbb6fudfjq0u5z3_ls3.read = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b25);
                            }
                            break;
                        default:
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b25);
                            break;
                    }
                }
                break;
            case 22:
                IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem26 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b26 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem26.RemoteActionCompatParcelizer;
                    if (b26 == 0) {
                        return iOParser$Decoder.write();
                    }
                    short s10 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem26.serializer;
                    if (s10 != 1) {
                        if (s10 != 2) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                        } else if (b26 == 12) {
                            iOParser$Decoder.read = (setLanguage) setLanguage.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                        }
                    } else if (b26 == 11) {
                        iOParser$Decoder.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b26);
                    }
                }
                break;
            case 23:
                isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled2 = new isContentCardsUnreadVisualIndicatorEnabled(i4);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem27 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b27 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem27.RemoteActionCompatParcelizer;
                    if (b27 == 0) {
                        return new setPushNotificationSubscriptionType(iscontentcardsunreadvisualindicatorenabled2);
                    }
                    short s11 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem27.serializer;
                    if (s11 != 1) {
                        if (s11 != 2) {
                            if (s11 != 3) {
                                if (s11 != 4) {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b27);
                                } else if (b27 == 3) {
                                    iscontentcardsunreadvisualindicatorenabled2.read = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b27);
                                }
                            } else if (b27 == 3) {
                                iscontentcardsunreadvisualindicatorenabled2.RemoteActionCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b27);
                            }
                        } else if (b27 == 6) {
                            iscontentcardsunreadvisualindicatorenabled2.write = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b27);
                        }
                    } else if (b27 == 8) {
                        iscontentcardsunreadvisualindicatorenabled2.IconCompatParcelizer = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b27);
                    }
                }
                break;
            case 24:
                return serializer(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 25:
                applyPendingRuntimeConfiguration applypendingruntimeconfiguration2 = new applyPendingRuntimeConfiguration();
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem28 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b28 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem28.RemoteActionCompatParcelizer;
                    if (b28 == 0) {
                        if (applypendingruntimeconfiguration2.read != null) {
                            return new createUriActionFromUri(applypendingruntimeconfiguration2);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'enabled' is missing");
                        return null;
                    }
                    if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem28.serializer != 1) {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b28);
                    } else if (b28 == 2) {
                        applypendingruntimeconfiguration2.read = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b28);
                    }
                }
                break;
            case 26:
                return write(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 27:
                return read(r8lambdat7xjd1d4humw0psb7whucfgonss);
            case 28:
                return IconCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
            default:
                r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY(r11 == true ? (byte) 1 : (byte) 0, 5);
                while (true) {
                    r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem29 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                    byte b29 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem29.RemoteActionCompatParcelizer;
                    if (b29 == 0) {
                        return new setDefaultNotificationChannelNamelambda0(r8lambdadeozq815xuuwmllyyvm_qv79qy);
                    }
                    short s12 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem29.serializer;
                    if (s12 != 1) {
                        if (s12 != 2) {
                            if (s12 != 3) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b29);
                            } else if (b29 == 15) {
                                int i17 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                                ArrayList arrayList5 = new ArrayList(i17);
                                for (int i18 = 0; i18 < i17; i18++) {
                                    arrayList5.add(Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat()));
                                }
                                r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer = arrayList5;
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b29);
                            }
                        } else if (b29 == 2) {
                            r8lambdadeozq815xuuwmllyyvm_qv79qy.write = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b29);
                        }
                    } else if (b29 == 2) {
                        r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b29);
                    }
                }
                break;
        }
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public final void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) {
        byte b;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        byte b6;
        byte b7;
        byte b8;
        byte b9;
        byte b10;
        byte b11;
        int i = this.read;
        BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21 = BrazeCompanionExternalSyntheticLambda4.IconCompatParcelizer;
        switch (i) {
            case 0:
                r8lambdaE7oIx09KQauliA8paOfGanE2_e8 r8lambdae7oix09kqaulia8paofgane2_e8 = (r8lambdaE7oIx09KQauliA8paOfGanE2_e8) obj;
                BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdae7oix09kqaulia8paofgane2_e8.read;
                Short sh = r8lambdae7oix09kqaulia8paofgane2_e8.MediaSessionCompatResultReceiverWrapper;
                Byte b12 = r8lambdae7oix09kqaulia8paofgane2_e8.MediaMetadataCompat;
                String str = r8lambdae7oix09kqaulia8paofgane2_e8.MediaDescriptionCompat;
                Short sh2 = r8lambdae7oix09kqaulia8paofgane2_e8.RatingCompat;
                Short sh3 = r8lambdae7oix09kqaulia8paofgane2_e8.MediaBrowserCompatMediaItem;
                Short sh4 = r8lambdae7oix09kqaulia8paofgane2_e8.RemoteActionCompatParcelizer;
                Short sh5 = r8lambdae7oix09kqaulia8paofgane2_e8.serializer;
                List list = r8lambdae7oix09kqaulia8paofgane2_e8.MediaSessionCompatQueueItem;
                List list2 = r8lambdae7oix09kqaulia8paofgane2_e8.IconCompatParcelizer;
                if (brazeCompanionExternalSyntheticLambda4 != null) {
                    b = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                    brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdae7oix09kqaulia8paofgane2_e8.read);
                } else {
                    b = 12;
                }
                if (list2 != null) {
                    int i2 = 2;
                    Iterator itWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 15, list2, b);
                    while (itWrite.hasNext()) {
                        r8lambdaR6dAybf4g5pc5sZkFujTnBDSk r8lambdar6daybf4g5pc5szkfujtnbdsk = (r8lambdaR6dAybf4g5pc5sZkFujTnBDSk) itWrite.next();
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(r8lambdar6daybf4g5pc5szkfujtnbdsk.read);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i2, (byte) 11);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.write(r8lambdar6daybf4g5pc5szkfujtnbdsk.serializer);
                        String str2 = r8lambdar6daybf4g5pc5szkfujtnbdsk.IconCompatParcelizer;
                        if (str2 != null) {
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str2);
                        }
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                        i2 = 2;
                    }
                }
                if (sh5 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, sh5);
                }
                if (sh4 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 4, r8lambdat7xjd1d4humw0psb7whucfgonss, sh4);
                }
                if (sh3 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 5, r8lambdat7xjd1d4humw0psb7whucfgonss, sh3);
                }
                if (sh2 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 6, r8lambdat7xjd1d4humw0psb7whucfgonss, sh2);
                }
                if (list != null) {
                    Iterator itWrite2 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 7, (byte) 15, list, (byte) 12);
                    while (itWrite2.hasNext()) {
                        brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (BrazeCompanionExternalSyntheticLambda4) itWrite2.next());
                    }
                }
                if (str != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(8, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str);
                }
                if (b12 != null) {
                    getBitmapFromCache.read((byte) 3, 9, r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                }
                if (sh != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 10, r8lambdat7xjd1d4humw0psb7whucfgonss, sh);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 1:
                r8lambda6bGutJ7rIyvBAu8XSUqBiLxTz6E r8lambda6bgutj7riyvbau8xsuqbilxtz6e = (r8lambda6bGutJ7rIyvBAu8XSUqBiLxTz6E) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(r8lambda6bgutj7riyvbau8xsuqbilxtz6e.write);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 4);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(r8lambda6bgutj7riyvbau8xsuqbilxtz6e.read.doubleValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 4);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(r8lambda6bgutj7riyvbau8xsuqbilxtz6e.RemoteActionCompatParcelizer.doubleValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 8);
                SweepGradientShader9KIMszodefault.write(r8lambda6bgutj7riyvbau8xsuqbilxtz6e.IconCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, 5, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(r8lambda6bgutj7riyvbau8xsuqbilxtz6e.MediaDescriptionCompat);
                String str3 = r8lambda6bgutj7riyvbau8xsuqbilxtz6e.MediaBrowserCompatMediaItem;
                if (str3 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str3);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 2:
                r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI r8lambdanpc69wzeqaei66oxsnhlebhusqi = (r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                Long l = r8lambdanpc69wzeqaei66oxsnhlebhusqi.read;
                Boolean bool = r8lambdanpc69wzeqaei66oxsnhlebhusqi.MediaDescriptionCompat;
                IconCompatParcelizer.serializer(l, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 10);
                IconCompatParcelizer.serializer(r8lambdanpc69wzeqaei66oxsnhlebhusqi.RemoteActionCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 8);
                r8lambdat7xjd1d4humw0psb7whucfgonss.read(r8lambdanpc69wzeqaei66oxsnhlebhusqi.serializer.intValue());
                Integer num = r8lambdanpc69wzeqaei66oxsnhlebhusqi.write;
                if (num != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 8, num);
                }
                if (bool != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 5, (byte) 2, bool);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 3:
                r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog r8lambdaqoukgs6h1gfby4ttokxnao8yog = (r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 15);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 3, r8lambdaqoukgs6h1gfby4ttokxnao8yog.write.size());
                Iterator it = r8lambdaqoukgs6h1gfby4ttokxnao8yog.write.iterator();
                while (it.hasNext()) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(((Byte) it.next()).byteValue());
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 4:
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                r8lambdaXwjHgoHSivQ1p7NGKxWRhunWE.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, ((r8lambdaSfjrR_HlZhgR9qJKoiGmntl4F8o) obj).serializer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 5:
                r8lambdaUwXDSMrlNtZuDA6i1VDnmBTUWe4 r8lambdauwxdsmrlntzuda6i1vdnmbtuwe4 = (r8lambdaUwXDSMrlNtZuDA6i1VDnmBTUWe4) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdauwxdsmrlntzuda6i1vdnmbtuwe4.RemoteActionCompatParcelizer);
                clearInstanceandroid_sdk_base_release clearinstanceandroid_sdk_base_release = r8lambdauwxdsmrlntzuda6i1vdnmbtuwe4.write;
                if (clearinstanceandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 2);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(clearinstanceandroid_sdk_base_release.serializer.booleanValue() ? (byte) 1 : (byte) 0);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 2);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(clearinstanceandroid_sdk_base_release.write.booleanValue() ? (byte) 1 : (byte) 0);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 2);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(clearinstanceandroid_sdk_base_release.RemoteActionCompatParcelizer.booleanValue() ? (byte) 1 : (byte) 0);
                    b2 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b2 = 0;
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b2);
                break;
            case 6:
                r8lambdaXwjHgoHSivQ1p7NGKxWRhunWE r8lambdaxwjhgohsivq1p7ngkxwrhunwe = (r8lambdaXwjHgoHSivQ1p7NGKxWRhunWE) obj;
                r8lambdaSkwTftgXIpCd_0z_JGsIzJVLWBQ r8lambdaskwtftgxipcd_0z_jgsizjvlwbq = r8lambdaxwjhgohsivq1p7ngkxwrhunwe.IconCompatParcelizer;
                stopInstanceandroid_sdk_base_release stopinstanceandroid_sdk_base_release = r8lambdaxwjhgohsivq1p7ngkxwrhunwe.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                r8lambda3om67_EEI5UKut_LIHa23kd33g r8lambda3om67_eei5ukut_liha23kd33g = r8lambdaxwjhgohsivq1p7ngkxwrhunwe.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                onActivityStartedlambda0 onactivitystartedlambda0 = r8lambdaxwjhgohsivq1p7ngkxwrhunwe.ResultReceiver;
                r8lambdaBJpDEH5g5iqG_nC8CR__jPyOOko r8lambdabjpdeh5g5iqg_nc8cr__jpyooko = r8lambdaxwjhgohsivq1p7ngkxwrhunwe.MediaSessionCompatToken;
                getShouldRequestFrameworkListenToNetworkUpdatesandroid_sdk_base_release getshouldrequestframeworklistentonetworkupdatesandroid_sdk_base_release = r8lambdaxwjhgohsivq1p7ngkxwrhunwe.PlaybackStateCompat;
                setShouldRequestFrameworkListenToNetworkUpdatesandroid_sdk_base_release setshouldrequestframeworklistentonetworkupdatesandroid_sdk_base_release = r8lambdaxwjhgohsivq1p7ngkxwrhunwe.MediaSessionCompatResultReceiverWrapper;
                onActivityStoppedlambda0 onactivitystoppedlambda0 = r8lambdaxwjhgohsivq1p7ngkxwrhunwe.ParcelableVolumeInfo;
                r8lambdaPMXCRRx_V6F5OLH9NqODP3ZZ0 r8lambdapmxcrrx_v6f5olh9nqodp3zz0 = r8lambdaxwjhgohsivq1p7ngkxwrhunwe.PlaybackStateCompatCustomAction;
                requestTriggersIfInAppMessageTestPushandroid_sdk_base_release requesttriggersifinappmessagetestpushandroid_sdk_base_release = r8lambdaxwjhgohsivq1p7ngkxwrhunwe.MediaSessionCompatQueueItem;
                r8lambdak2pvEAhtRA0xuzvc1NI7cWGFSRU r8lambdak2pveahtra0xuzvc1ni7cwgfsru = r8lambdaxwjhgohsivq1p7ngkxwrhunwe.MediaBrowserCompatMediaItem;
                getStaticExternalIEventMessengerandroid_sdk_base_release getstaticexternalieventmessengerandroid_sdk_base_release = r8lambdaxwjhgohsivq1p7ngkxwrhunwe.RatingCompat;
                getShouldPersistWebViewannotations getshouldpersistwebviewannotations = r8lambdaxwjhgohsivq1p7ngkxwrhunwe.MediaDescriptionCompat;
                r8lambdaswaApDEpJuUbSweU4qc2vSdr5ig r8lambdaswaapdepjuubsweu4qc2vsdr5ig = r8lambdaxwjhgohsivq1p7ngkxwrhunwe.MediaMetadataCompat;
                stopInstancelambda0 stopinstancelambda0 = r8lambdaxwjhgohsivq1p7ngkxwrhunwe.serializer;
                setInAppMessagingRegistrationBlocklistlambda0 setinappmessagingregistrationblocklistlambda0 = r8lambdaxwjhgohsivq1p7ngkxwrhunwe.read;
                BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener = r8lambdaxwjhgohsivq1p7ngkxwrhunwe.RemoteActionCompatParcelizer;
                if (r8lambdaskwtftgxipcd_0z_jgsizjvlwbq != null) {
                    b3 = 12;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                    r8lambdaSkwTftgXIpCd_0z_JGsIzJVLWBQ.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdaxwjhgohsivq1p7ngkxwrhunwe.IconCompatParcelizer);
                } else {
                    b3 = 12;
                }
                if (brazeActivityLifecycleCallbackListener != null) {
                    Long l2 = brazeActivityLifecycleCallbackListener.RemoteActionCompatParcelizer;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, b3);
                    if (l2 != null) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(l2.longValue());
                    }
                    b4 = 0;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                } else {
                    b4 = 0;
                }
                if (setinappmessagingregistrationblocklistlambda0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, b3);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b4);
                }
                if (stopinstancelambda0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, b3);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b4);
                }
                if (r8lambdaswaapdepjuubsweu4qc2vsdr5ig != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, b3);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b4);
                }
                if (getshouldpersistwebviewannotations != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, b3);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b4);
                }
                if (getstaticexternalieventmessengerandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(7, b3);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b4);
                }
                if (r8lambdak2pveahtra0xuzvc1ni7cwgfsru != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(8, b3);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b4);
                }
                if (requesttriggersifinappmessagetestpushandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(9, b3);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b4);
                }
                if (r8lambdapmxcrrx_v6f5olh9nqodp3zz0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(10, b3);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b4);
                }
                if (onactivitystoppedlambda0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(11, b3);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b4);
                }
                if (setshouldrequestframeworklistentonetworkupdatesandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(b3, b3);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b4);
                }
                if (getshouldrequestframeworklistentonetworkupdatesandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(13, b3);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b4);
                }
                if (r8lambdabjpdeh5g5iqg_nc8cr__jpyooko != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(14, b3);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b4);
                }
                if (onactivitystartedlambda0 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(15, b3);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b4);
                }
                if (r8lambda3om67_eei5ukut_liha23kd33g != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(17, b3);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b4);
                }
                if (stopinstanceandroid_sdk_base_release != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(18, b3);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b4);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b4);
                break;
            case 7:
                r8lambdalhrh0WCduaLB1UBrBFl71Ebc4o r8lambdalhrh0wcdualb1ubrbfl71ebc4o = (r8lambdalhrh0WCduaLB1UBrBFl71Ebc4o) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(r8lambdalhrh0wcdualb1ubrbfl71ebc4o.IconCompatParcelizer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0 r8lambdaxwofrgpcxeo3a8dqjc8zbxvvc0 = r8lambdalhrh0wcdualb1ubrbfl71ebc4o.write;
                r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE r8lambdao3_bo_8zvdrigycl2l6jayoawe = r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0.RemoteActionCompatParcelizer;
                r8lambdao3_bo_8zvdrigycl2l6jayoawe.read(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdaxwofrgpcxeo3a8dqjc8zbxvvc0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 15);
                List list3 = r8lambdalhrh0wcdualb1ubrbfl71ebc4o.RemoteActionCompatParcelizer;
                r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 12, list3.size());
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    r8lambdao3_bo_8zvdrigycl2l6jayoawe.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (r8lambdaxwOFRGpcXeo3A8DQjc8ZBxVVC0) it2.next());
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 8:
                r8lambdazL5YEDL8BIJUMJIduPEWP0aZmA r8lambdazl5yedl8bijumjidupewp0azma = (r8lambdazL5YEDL8BIJUMJIduPEWP0aZmA) obj;
                String str4 = r8lambdazl5yedl8bijumjidupewp0azma.IconCompatParcelizer;
                Boolean bool2 = r8lambdazl5yedl8bijumjidupewp0azma.RatingCompat;
                Integer num2 = r8lambdazl5yedl8bijumjidupewp0azma.MediaBrowserCompatMediaItem;
                Integer num3 = r8lambdazl5yedl8bijumjidupewp0azma.write;
                Integer num4 = r8lambdazl5yedl8bijumjidupewp0azma.serializer;
                Boolean bool3 = r8lambdazl5yedl8bijumjidupewp0azma.RemoteActionCompatParcelizer;
                if (str4 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(r8lambdazl5yedl8bijumjidupewp0azma.IconCompatParcelizer);
                }
                if (bool3 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 2, bool3);
                }
                if (num4 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 8, num4);
                }
                if (num3 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 8, num3);
                }
                if (num2 != null) {
                    SweepGradientShader9KIMszodefault.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 5, (byte) 8, num2);
                }
                if (bool2 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 6, (byte) 2, bool2);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 9:
                addAliaslambda3 addaliaslambda3 = (addAliaslambda3) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 8);
                SweepGradientShader9KIMszodefault.write(addaliaslambda3.RemoteActionCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 8);
                SweepGradientShader9KIMszodefault.write(addaliaslambda3.serializer, r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 6);
                IconCompatParcelizer.read((byte) 10, 4, r8lambdat7xjd1d4humw0psb7whucfgonss, addaliaslambda3.IconCompatParcelizer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(addaliaslambda3.read.longValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 10:
                incrementCustomUserAttributedefault incrementcustomuserattributedefault = (incrementCustomUserAttributedefault) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                setBadNetworkIntervalandroid_sdk_base_release setbadnetworkintervalandroid_sdk_base_release = incrementcustomuserattributedefault.IconCompatParcelizer;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 8);
                Integer num5 = setbadnetworkintervalandroid_sdk_base_release.serializer;
                Long l3 = setbadnetworkintervalandroid_sdk_base_release.IconCompatParcelizer;
                r8lambdat7xjd1d4humw0psb7whucfgonss.read(num5.intValue());
                Short sh6 = setbadnetworkintervalandroid_sdk_base_release.write;
                if (sh6 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, sh6);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 8);
                r8lambdat7xjd1d4humw0psb7whucfgonss.read(setbadnetworkintervalandroid_sdk_base_release.RemoteActionCompatParcelizer.value);
                if (l3 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 10);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(l3.longValue());
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                setCountrylambda0.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, incrementcustomuserattributedefault.write);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 11:
                setAttributionDatalambda0 setattributiondatalambda0 = (setAttributionDatalambda0) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                setLocationCustomAttributelambda1 setlocationcustomattributelambda1 = setattributiondatalambda0.RemoteActionCompatParcelizer;
                if (setlocationcustomattributelambda1.IconCompatParcelizer != null) {
                    b5 = 11;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(setlocationcustomattributelambda1.IconCompatParcelizer);
                } else {
                    b5 = 11;
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                setLanguagelambda0 setlanguagelambda0 = setattributiondatalambda0.write;
                if (setlanguagelambda0.IconCompatParcelizer != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, b5);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(setlanguagelambda0.IconCompatParcelizer);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 12:
                setCustomAttributelambda11 setcustomattributelambda11 = (setCustomAttributelambda11) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                setCustomEndpoint setcustomendpoint = setcustomattributelambda11.IconCompatParcelizer;
                if (setcustomendpoint.RemoteActionCompatParcelizer != null) {
                    b6 = 11;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(setcustomendpoint.RemoteActionCompatParcelizer);
                } else {
                    b6 = 11;
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                unsetLocationCustomAttributelambda2 unsetlocationcustomattributelambda2 = setcustomattributelambda11.read;
                if (unsetlocationcustomattributelambda2.write != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, b6);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(unsetlocationcustomattributelambda2.write);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 13:
                setCustomUserAttributelambda7 setcustomuserattributelambda7 = (setCustomUserAttributelambda7) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
                setHomeCitylambda0.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setcustomuserattributelambda7.RemoteActionCompatParcelizer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                setEmaillambda0.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setcustomuserattributelambda7.read);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 14:
                setFirstNamelambda0 setfirstnamelambda0 = (setFirstNamelambda0) obj;
                if (setfirstnamelambda0.RemoteActionCompatParcelizer != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 4);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(setfirstnamelambda0.RemoteActionCompatParcelizer.doubleValue());
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 15:
                setLanguagelambda0 setlanguagelambda1 = (setLanguagelambda0) obj;
                if (setlanguagelambda1.IconCompatParcelizer != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(setlanguagelambda1.IconCompatParcelizer);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 16:
                setLineIdlambda0 setlineidlambda0 = (setLineIdlambda0) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 2);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(setlineidlambda0.write.booleanValue() ? (byte) 1 : (byte) 0);
                Map map = setlineidlambda0.IconCompatParcelizer;
                if (map != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 13);
                    byte b13 = 6;
                    Iterator itWrite3 = MediaSessionCompatQueueItem.write(map, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 6, (byte) 12);
                    while (itWrite3.hasNext()) {
                        Map.Entry entry = (Map.Entry) itWrite3.next();
                        Short sh7 = (Short) entry.getKey();
                        setLocationCustomAttributelambda3 setlocationcustomattributelambda3 = (setLocationCustomAttributelambda3) entry.getValue();
                        IconCompatParcelizer.read(b13, 1, r8lambdat7xjd1d4humw0psb7whucfgonss, sh7);
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(setlocationcustomattributelambda3.RemoteActionCompatParcelizer.shortValue());
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                        b13 = 6;
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 17:
                setLocationCustomAttributelambda1 setlocationcustomattributelambda2 = (setLocationCustomAttributelambda1) obj;
                if (setlocationcustomattributelambda2.IconCompatParcelizer != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(setlocationcustomattributelambda2.IconCompatParcelizer);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 18:
                setPhoneNumberlambda20 setphonenumberlambda20 = (setPhoneNumberlambda20) obj;
                if (setphonenumberlambda20.RemoteActionCompatParcelizer != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 2);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(setphonenumberlambda20.RemoteActionCompatParcelizer.booleanValue() ? (byte) 1 : (byte) 0);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 19:
                unsetLocationCustomAttributelambda0 unsetlocationcustomattributelambda0 = (unsetLocationCustomAttributelambda0) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                String str5 = unsetlocationcustomattributelambda0.read;
                String str6 = unsetlocationcustomattributelambda0.MediaMetadataCompat;
                String str7 = unsetlocationcustomattributelambda0.MediaDescriptionCompat;
                String str8 = unsetlocationcustomattributelambda0.IconCompatParcelizer;
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(str5);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(unsetlocationcustomattributelambda0.write);
                String str9 = unsetlocationcustomattributelambda0.RemoteActionCompatParcelizer;
                if (str9 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str9);
                }
                if (str8 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str8);
                }
                if (str7 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(5, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str7);
                }
                if (str6 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(6, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str6);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 20:
                incrementCustomUserAttribute incrementcustomuserattribute = (incrementCustomUserAttribute) obj;
                if (incrementcustomuserattribute.read != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(incrementcustomuserattribute.read);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 21:
                setCustomUserAttribute setcustomuserattribute = (setCustomUserAttribute) obj;
                Short sh8 = setcustomuserattribute.serializer;
                Short sh9 = setcustomuserattribute.MediaSessionCompatQueueItem;
                Short sh10 = setcustomuserattribute.RatingCompat;
                Short sh11 = setcustomuserattribute.RemoteActionCompatParcelizer;
                Short sh12 = setcustomuserattribute.IconCompatParcelizer;
                Short sh13 = setcustomuserattribute.read;
                if (sh8 != null) {
                    b7 = 6;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 6);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(setcustomuserattribute.serializer.shortValue());
                } else {
                    b7 = 6;
                }
                if (sh13 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(b7, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, sh13);
                }
                if (sh12 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(b7, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, sh12);
                }
                if (sh11 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(b7, 4, r8lambdat7xjd1d4humw0psb7whucfgonss, sh11);
                }
                if (sh10 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(b7, 5, r8lambdat7xjd1d4humw0psb7whucfgonss, sh10);
                }
                if (sh9 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(b7, b7, r8lambdat7xjd1d4humw0psb7whucfgonss, sh9);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 22:
                setGender setgender = (setGender) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(setgender.read);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                setLanguage.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, setgender.write);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 23:
                setPushNotificationSubscriptionType setpushnotificationsubscriptiontype = (setPushNotificationSubscriptionType) obj;
                Integer num6 = setpushnotificationsubscriptiontype.write;
                Byte b14 = setpushnotificationsubscriptiontype.read;
                Byte b15 = setpushnotificationsubscriptiontype.serializer;
                Short sh14 = setpushnotificationsubscriptiontype.RemoteActionCompatParcelizer;
                if (num6 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 8);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.read(setpushnotificationsubscriptiontype.write.intValue());
                }
                if (sh14 != null) {
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((byte) 6, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, sh14);
                }
                if (b15 != null) {
                    getBitmapFromCache.read((byte) 3, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, b15);
                }
                if (b14 != null) {
                    getBitmapFromCache.read((byte) 3, 4, r8lambdat7xjd1d4humw0psb7whucfgonss, b14);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 24:
                BrazeUserExternalSyntheticLambda28 brazeUserExternalSyntheticLambda28 = (BrazeUserExternalSyntheticLambda28) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 6);
                IconCompatParcelizer.read((byte) 3, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, brazeUserExternalSyntheticLambda28.read);
                af$$ExternalSyntheticOutline1.m((byte) 3, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, brazeUserExternalSyntheticLambda28.write);
                IconCompatParcelizer.IconCompatParcelizer(brazeUserExternalSyntheticLambda28.serializer, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 0);
                break;
            case 25:
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 2);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(((createUriActionFromUri) obj).read.booleanValue() ? (byte) 1 : (byte) 0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 26:
                IBrazeNotificationFactory iBrazeNotificationFactory = (IBrazeNotificationFactory) obj;
                List list4 = iBrazeNotificationFactory.RemoteActionCompatParcelizer;
                List list5 = iBrazeNotificationFactory.RatingCompat;
                List list6 = iBrazeNotificationFactory.MediaDescriptionCompat;
                List list7 = iBrazeNotificationFactory.MediaMetadataCompat;
                List list8 = iBrazeNotificationFactory.MediaSessionCompatQueueItem;
                List list9 = iBrazeNotificationFactory.IconCompatParcelizer;
                List list10 = iBrazeNotificationFactory.write;
                List list11 = iBrazeNotificationFactory.serializer;
                if (list4 != null) {
                    Iterator itWrite4 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 1, (byte) 15, list4, (byte) 12);
                    while (itWrite4.hasNext()) {
                        getUserId.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (getUserId) itWrite4.next());
                    }
                }
                if (list11 != null) {
                    Iterator itWrite5 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 15, list11, (byte) 12);
                    while (itWrite5.hasNext()) {
                        setCountry.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (setCountry) itWrite5.next());
                    }
                }
                if (list10 != null) {
                    Iterator itWrite6 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 15, list10, (byte) 12);
                    while (itWrite6.hasNext()) {
                        r8lambdadWTsgiaqHAxPuFwuGaSdvp1Vhw r8lambdadwtsgiaqhaxpufwugasdvp1vhw = (r8lambdadWTsgiaqHAxPuFwuGaSdvp1Vhw) itWrite6.next();
                        String str10 = r8lambdadwtsgiaqhaxpufwugasdvp1vhw.IconCompatParcelizer;
                        String str11 = r8lambdadwtsgiaqhaxpufwugasdvp1vhw.serializer;
                        String str12 = r8lambdadwtsgiaqhaxpufwugasdvp1vhw.read;
                        String str13 = r8lambdadwtsgiaqhaxpufwugasdvp1vhw.RemoteActionCompatParcelizer;
                        if (str10 != null) {
                            b10 = 11;
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.write(r8lambdadwtsgiaqhaxpufwugasdvp1vhw.IconCompatParcelizer);
                        } else {
                            b10 = 11;
                        }
                        if (str13 != null) {
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, b10);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str13);
                        }
                        if (str12 != null) {
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, b10);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str12);
                        }
                        if (str11 != null) {
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, b10);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str11);
                        }
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    }
                }
                if (list9 != null) {
                    Iterator itWrite7 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 15, list9, (byte) 12);
                    while (itWrite7.hasNext()) {
                        _set_userId_lambda0.write.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (_set_userId_lambda0) itWrite7.next());
                    }
                }
                if (list8 != null) {
                    Iterator itWrite8 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 5, (byte) 15, list8, (byte) 12);
                    while (itWrite8.hasNext()) {
                        setBrazeSdkMetadataandroid_sdk_base_release.read.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (setBrazeSdkMetadataandroid_sdk_base_release) itWrite8.next());
                    }
                }
                if (list7 != null) {
                    Iterator itWrite9 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 6, (byte) 15, list7, (byte) 12);
                    while (itWrite9.hasNext()) {
                        setPushNotificationSubscriptionTypelambda0 setpushnotificationsubscriptiontypelambda0 = (setPushNotificationSubscriptionTypelambda0) itWrite9.next();
                        String str14 = setpushnotificationsubscriptiontypelambda0.write;
                        String str15 = setpushnotificationsubscriptiontypelambda0.RemoteActionCompatParcelizer;
                        String str16 = setpushnotificationsubscriptiontypelambda0.serializer;
                        String str17 = setpushnotificationsubscriptiontypelambda0.read;
                        if (str14 != null) {
                            b9 = 11;
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.write(setpushnotificationsubscriptiontypelambda0.write);
                        } else {
                            b9 = 11;
                        }
                        if (str17 != null) {
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, b9);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str17);
                        }
                        if (str16 != null) {
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, b9);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str16);
                        }
                        if (str15 != null) {
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, b9);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str15);
                        }
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    }
                }
                if (list6 != null) {
                    Iterator itWrite10 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 7, (byte) 15, list6, (byte) 12);
                    while (itWrite10.hasNext()) {
                        Rraw.RemoteActionCompatParcelizer.read(r8lambdat7xjd1d4humw0psb7whucfgonss, (Rraw) itWrite10.next());
                    }
                }
                if (list5 != null) {
                    Iterator itWrite11 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 8, (byte) 15, list5, (byte) 12);
                    while (itWrite11.hasNext()) {
                        setApiKeylambda0 setapikeylambda0 = (setApiKeylambda0) itWrite11.next();
                        String str18 = setapikeylambda0.serializer;
                        String str19 = setapikeylambda0.write;
                        String str20 = setapikeylambda0.RemoteActionCompatParcelizer;
                        String str21 = setapikeylambda0.read;
                        if (str18 != null) {
                            b8 = 11;
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.write(setapikeylambda0.serializer);
                        } else {
                            b8 = 11;
                        }
                        if (str21 != null) {
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, b8);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str21);
                        }
                        if (str20 != null) {
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, b8);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str20);
                        }
                        if (str19 != null) {
                            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, b8);
                            r8lambdat7xjd1d4humw0psb7whucfgonss.write(str19);
                        }
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 27:
                IBrazeDeeplinkHandlerIntentFlagPurpose iBrazeDeeplinkHandlerIntentFlagPurpose = (IBrazeDeeplinkHandlerIntentFlagPurpose) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                IconCompatParcelizer.serializer(iBrazeDeeplinkHandlerIntentFlagPurpose.serializer, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 3);
                IconCompatParcelizer.IconCompatParcelizer(iBrazeDeeplinkHandlerIntentFlagPurpose.read, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 0);
                break;
            case 28:
                r8lambdadWTsgiaqHAxPuFwuGaSdvp1Vhw r8lambdadwtsgiaqhaxpufwugasdvp1vhw2 = (r8lambdadWTsgiaqHAxPuFwuGaSdvp1Vhw) obj;
                String str22 = r8lambdadwtsgiaqhaxpufwugasdvp1vhw2.IconCompatParcelizer;
                String str23 = r8lambdadwtsgiaqhaxpufwugasdvp1vhw2.serializer;
                String str24 = r8lambdadwtsgiaqhaxpufwugasdvp1vhw2.read;
                String str25 = r8lambdadwtsgiaqhaxpufwugasdvp1vhw2.RemoteActionCompatParcelizer;
                if (str22 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(r8lambdadwtsgiaqhaxpufwugasdvp1vhw2.IconCompatParcelizer);
                }
                if (str25 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str25);
                }
                if (str24 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str24);
                }
                if (str23 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(4, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str23);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            default:
                setDefaultNotificationChannelNamelambda0 setdefaultnotificationchannelnamelambda0 = (setDefaultNotificationChannelNamelambda0) obj;
                Boolean bool4 = setdefaultnotificationchannelnamelambda0.IconCompatParcelizer;
                Boolean bool5 = setdefaultnotificationchannelnamelambda0.read;
                List list12 = setdefaultnotificationchannelnamelambda0.RemoteActionCompatParcelizer;
                if (bool4 != null) {
                    b11 = 2;
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 2);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(setdefaultnotificationchannelnamelambda0.IconCompatParcelizer.booleanValue() ? (byte) 1 : (byte) 0);
                } else {
                    b11 = 2;
                }
                if (bool5 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, b11, b11, bool5);
                }
                if (list12 != null) {
                    Iterator itWrite12 = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 15, list12, (byte) 3);
                    while (itWrite12.hasNext()) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(((Byte) itWrite12.next()).byteValue());
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
        }
    }
}
