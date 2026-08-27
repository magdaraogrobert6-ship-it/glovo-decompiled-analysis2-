package o;

import android.os.Bundle;
import bo.app.af$$ExternalSyntheticOutline1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.login.presentation.LoginActivity;
import com.roadrunner.rider.recruitment.accountcreation.presentation.AccountCreationFragment;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.N$b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class stopInstancelambda11 implements onActivityLifecycle, r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int write;

    public stopInstancelambda11(ImageHeaderParserImageType imageHeaderParserImageType) {
        this.write = 12;
    }

    public /* synthetic */ stopInstancelambda11(int i) {
        this.write = i;
    }

    public void write(LoginActivity loginActivity, String str, String str2, String str3, int i) {
        int i2 = 2 % 2;
        str.getClass();
        str2.getClass();
        str3.getClass();
        AccountCreationFragment accountCreationFragment = new AccountCreationFragment();
        Bundle bundle = new Bundle();
        bundle.putString("result_code", str);
        bundle.putString("phone_number", str2);
        bundle.putString("original_message_id", str3);
        bundle.putInt("retry_count", i);
        accountCreationFragment.setArguments(bundle);
        accountCreationFragment.RemoteActionCompatParcelizer(loginActivity.getSupportFragmentManager(), "com.roadrunner.rider.recruitment.accountcreation.presentation.AccountCreationFragment");
        int i3 = IconCompatParcelizer + 63;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public Object RemoteActionCompatParcelizer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss) throws IOException {
        int i = 2 % 2;
        int i2 = this.write;
        Object obj = null;
        if (i2 != 0) {
            switch (i2) {
                case 13:
                    C$b c$b = new C$b();
                    while (true) {
                        r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                        byte b = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
                        if (b == 0) {
                            if (((Long) c$b.serializer) == null) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'timestamp' is missing");
                                return null;
                            }
                            if (((Integer) c$b.write) != null) {
                                return new getDelayedInitializationProviderandroid_sdk_base_release(c$b);
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'magnitude' is missing");
                            return null;
                        }
                        short s = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem.serializer;
                        if (s != 1) {
                            if (s != 2) {
                                if (s != 3) {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                                } else if (b == 11) {
                                    int i3 = RemoteActionCompatParcelizer + 65;
                                    IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i4 = i3 % 2;
                                    c$b.IconCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                                }
                            } else if (b == 8) {
                                c$b.write = Integer.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                            }
                        } else if (b == 10) {
                            c$b.serializer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b);
                        }
                    }
                    break;
                case 14:
                    while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                    }
                    return new stopInstanceandroid_sdk_base_release();
                case 15:
                    while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                    }
                    return new r8lambda3om67_EEI5UKut_LIHa23kd33g();
                case 16:
                    while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                    }
                    return new r8lambdaPMXCRRx_V6F5OLH9NqODP3ZZ0();
                case 17:
                    while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                    }
                    return new r8lambdak2pvEAhtRA0xuzvc1NI7cWGFSRU();
                case 18:
                    while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                    }
                    return new r8lambdaswaApDEpJuUbSweU4qc2vSdr5ig();
                case 19:
                    while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                    }
                    return new onActivityStoppedlambda0();
                case 20:
                    r8lambdaRBUg8qiONCPYgCSL25Td35Mcmxs r8lambdarbug8qioncpygcsl25td35mcmxs = new r8lambdaRBUg8qiONCPYgCSL25Td35Mcmxs();
                    while (true) {
                        r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                        byte b2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.RemoteActionCompatParcelizer;
                        if (b2 == 0) {
                            return r8lambdarbug8qioncpygcsl25td35mcmxs.IconCompatParcelizer();
                        }
                        short s2 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem2.serializer;
                        if (s2 != 1) {
                            int i5 = IconCompatParcelizer + 101;
                            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i6 = i5 % 2;
                            if (s2 != 2) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            } else if (b2 == 3) {
                                r8lambdarbug8qioncpygcsl25td35mcmxs.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                            }
                        } else if (b2 == 3) {
                            int i7 = RemoteActionCompatParcelizer + 63;
                            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i7 % 2 != 0) {
                                r8lambdarbug8qioncpygcsl25td35mcmxs.IconCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                                int i8 = 49 / 0;
                            } else {
                                r8lambdarbug8qioncpygcsl25td35mcmxs.IconCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            }
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                        }
                    }
                    break;
                case 21:
                    while (r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer != 0) {
                    }
                    return new setShouldPersistWebView();
                case 22:
                    BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 = new BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4();
                    while (true) {
                        r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                        byte b3 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.RemoteActionCompatParcelizer;
                        if (b3 == 0) {
                            return brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.IconCompatParcelizer();
                        }
                        short s3 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem3.serializer;
                        if (s3 != 1) {
                            if (s3 != 2) {
                                if (s3 != 3) {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                                } else if (b3 == 11) {
                                    brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                                }
                            } else if (b3 == 11) {
                                brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.write = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                            }
                        } else if (b3 == 11) {
                            brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.serializer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                        }
                    }
                    break;
                case 23:
                    N$b n$b = new N$b();
                    while (true) {
                        r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                        byte b4 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.RemoteActionCompatParcelizer;
                        if (b4 == 0) {
                            int i9 = RemoteActionCompatParcelizer + 115;
                            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i9 % 2 == 0) {
                                return n$b.serializer();
                            }
                            n$b.serializer();
                            throw null;
                        }
                        short s4 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem4.serializer;
                        if (s4 != 1) {
                            if (s4 != 2) {
                                if (s4 != 3) {
                                    if (s4 != 4) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                                    } else if (b4 == 6) {
                                        n$b.serializer = Short.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                                    }
                                } else if (b4 == 3) {
                                    n$b.IconCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                                }
                            } else if (b4 == 11) {
                                n$b.write = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                            }
                        } else if (b4 == 11) {
                            n$b.read = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b4);
                        }
                    }
                    break;
                case 24:
                    N$b n$b2 = new N$b();
                    while (true) {
                        r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                        byte b5 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5.RemoteActionCompatParcelizer;
                        if (b5 == 0) {
                            return new BrazeInternal(n$b2);
                        }
                        short s5 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem5.serializer;
                        if (s5 != 1) {
                            if (s5 != 2) {
                                if (s5 != 3) {
                                    if (s5 != 4) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                                    } else if (b5 == 2) {
                                        n$b2.serializer = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                                    } else {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                                    }
                                } else if (b5 == 3) {
                                    int i10 = IconCompatParcelizer + 23;
                                    RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i10 % 2 == 0) {
                                        n$b2.IconCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                                        throw null;
                                    }
                                    n$b2.IconCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                                }
                            } else if (b5 == 2) {
                                n$b2.write = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                            }
                        } else if (b5 == 2) {
                            n$b2.read = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                        }
                    }
                    break;
                case 25:
                    applyPendingRuntimeConfiguration applypendingruntimeconfiguration = new applyPendingRuntimeConfiguration();
                    while (true) {
                        r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                        byte b6 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6.RemoteActionCompatParcelizer;
                        if (b6 == 0) {
                            if (applypendingruntimeconfiguration.read != null) {
                                return new addSerializedContentCardToStorage(applypendingruntimeconfiguration);
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'granted' is missing");
                            return null;
                        }
                        if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem6.serializer != 1) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                        } else if (b6 == 2) {
                            int i11 = IconCompatParcelizer + 17;
                            RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i11 % 2 == 0) {
                                applypendingruntimeconfiguration.read = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                                obj.hashCode();
                                throw null;
                            }
                            applypendingruntimeconfiguration.read = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                        }
                    }
                    break;
                case 26:
                    r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
                    while (true) {
                        r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                        byte b7 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7.RemoteActionCompatParcelizer;
                        if (b7 == 0) {
                            return r8lambda1mnczrzuv4owduwgkg6cjtsws.write();
                        }
                        short s6 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem7.serializer;
                        if (s6 != 1) {
                            if (s6 != 2) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            } else if (b7 == 3) {
                                r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                            }
                        } else if (b7 == 15) {
                            int i12 = r8lambdat7xjd1d4humw0psb7whucfgonss.read().read;
                            ArrayList arrayList = new ArrayList(i12);
                            for (int i13 = 0; i13 < i12; i13++) {
                                int i14 = IconCompatParcelizer + 75;
                                RemoteActionCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i15 = i14 % 2;
                                arrayList.add(r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer());
                            }
                            r8lambda1mnczrzuv4owduwgkg6cjtsws.write = arrayList;
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b7);
                        }
                    }
                    break;
                case 27:
                    getDeviceDataProviderandroid_sdk_base_release getdevicedataproviderandroid_sdk_base_release = new getDeviceDataProviderandroid_sdk_base_release();
                    while (true) {
                        r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                        byte b8 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8.RemoteActionCompatParcelizer;
                        if (b8 == 0) {
                            return new deleteRegisteredGeofenceCache(getdevicedataproviderandroid_sdk_base_release);
                        }
                        short s7 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem8.serializer;
                        if (s7 != 1) {
                            if (s7 != 2) {
                                if (s7 != 3) {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                                } else if (b8 == 2) {
                                    getdevicedataproviderandroid_sdk_base_release.serializer = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                                }
                            } else if (b8 == 2) {
                                getdevicedataproviderandroid_sdk_base_release.IconCompatParcelizer = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                            }
                        } else if (b8 == 2) {
                            getdevicedataproviderandroid_sdk_base_release.write = Boolean.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b8);
                        }
                    }
                    break;
                case 28:
                    C$b c$b2 = new C$b();
                    while (true) {
                        r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                        byte b9 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9.RemoteActionCompatParcelizer;
                        if (b9 == 0) {
                            return c$b2.serializer();
                        }
                        short s8 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem9.serializer;
                        if (s8 != 1) {
                            if (s8 != 2) {
                                if (s8 != 3) {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                                } else if (b9 == 11) {
                                    c$b2.IconCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                                }
                            } else if (b9 == 10) {
                                int i16 = IconCompatParcelizer + 95;
                                RemoteActionCompatParcelizer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i16 % 2 == 0) {
                                    c$b2.serializer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                                    throw null;
                                }
                                c$b2.serializer = Long.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                            }
                        } else if (b9 == 3) {
                            c$b2.write = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b9);
                        }
                    }
                    break;
                default:
                    C$b c$b3 = new C$b();
                    while (true) {
                        r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                        byte b10 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10.RemoteActionCompatParcelizer;
                        if (b10 == 0) {
                            int i17 = RemoteActionCompatParcelizer + 41;
                            IconCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i18 = i17 % 2;
                            if (((Byte) c$b3.serializer) != null) {
                                return new r8lambdaX8O0CQVGYSvyuZ1ZQ9WvuF9jtM(c$b3);
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'level' is missing");
                            return null;
                        }
                        short s9 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem10.serializer;
                        if (s9 != 1) {
                            if (s9 != 2) {
                                if (s9 != 3) {
                                    int i19 = RemoteActionCompatParcelizer + 57;
                                    IconCompatParcelizer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i19 % 2 != 0) {
                                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                                        throw null;
                                    }
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                                } else if (b10 == 3) {
                                    c$b3.IconCompatParcelizer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                                } else {
                                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                                }
                            } else if (b10 == 3) {
                                c$b3.write = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                            }
                        } else if (b10 == 3) {
                            c$b3.serializer = Byte.valueOf(r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat());
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b10);
                        }
                    }
                    break;
            }
        } else {
            stopInstancelambda10 stopinstancelambda10 = new stopInstancelambda10();
            while (true) {
                r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                byte b11 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11.RemoteActionCompatParcelizer;
                if (b11 == 0) {
                    if (stopinstancelambda10.IconCompatParcelizer != null) {
                        return new wipeDatalambda0(stopinstancelambda10);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'location' is missing");
                    return null;
                }
                short s10 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem11.serializer;
                BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21 = BrazeCompanionExternalSyntheticLambda4.IconCompatParcelizer;
                if (s10 != 1) {
                    if (s10 != 2) {
                        if (s10 != 3) {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                        } else if (b11 == 12) {
                            stopinstancelambda10.serializer = (BrazeCompanionExternalSyntheticLambda4) brazeCompanionExternalSyntheticLambda21.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                        } else {
                            getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                        }
                    } else if (b11 == 12) {
                        r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(5);
                        while (true) {
                            r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem();
                            byte b12 = r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12.RemoteActionCompatParcelizer;
                            if (b12 == 0) {
                                break;
                            }
                            if (r8lambdau4n4uufm_ipqdhmmao_rti5aek0MediaBrowserCompatMediaItem12.serializer != 1) {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            } else if (b12 == 11) {
                                r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer = r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                            } else {
                                getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b12);
                            }
                        }
                        if (r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'ssid' is missing");
                            return null;
                        }
                        stopinstancelambda10.RemoteActionCompatParcelizer = new handleIncomingIntent(r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k);
                    } else {
                        getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                    }
                } else if (b11 == 12) {
                    stopinstancelambda10.IconCompatParcelizer = (BrazeCompanionExternalSyntheticLambda4) brazeCompanionExternalSyntheticLambda21.RemoteActionCompatParcelizer(r8lambdat7xjd1d4humw0psb7whucfgonss);
                } else {
                    getLowestValueslo4al4.serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b11);
                }
            }
        }
    }

    @Override // o.r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0
    public void read(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Object obj) throws IOException {
        int i = 2 % 2;
        int i2 = this.write;
        if (i2 == 0) {
            wipeDatalambda0 wipedatalambda0 = (wipeDatalambda0) obj;
            r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 12);
            BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = wipedatalambda0.RemoteActionCompatParcelizer;
            BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda5 = wipedatalambda0.serializer;
            BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21 = BrazeCompanionExternalSyntheticLambda4.IconCompatParcelizer;
            brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, brazeCompanionExternalSyntheticLambda4);
            handleIncomingIntent handleincomingintent = wipedatalambda0.write;
            if (handleincomingintent != null) {
                int i3 = RemoteActionCompatParcelizer + 25;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 49);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(0, (byte) 14);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(handleincomingintent.IconCompatParcelizer);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 1);
                } else {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 12);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(handleincomingintent.IconCompatParcelizer);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                }
            }
            if (brazeCompanionExternalSyntheticLambda5 != null) {
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 12);
                brazeCompanionExternalSyntheticLambda21.read(r8lambdat7xjd1d4humw0psb7whucfgonss, brazeCompanionExternalSyntheticLambda5);
            }
            r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
            return;
        }
        switch (i2) {
            case 13:
                getDelayedInitializationProviderandroid_sdk_base_release getdelayedinitializationproviderandroid_sdk_base_release = (getDelayedInitializationProviderandroid_sdk_base_release) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 10);
                IconCompatParcelizer.serializer(getdelayedinitializationproviderandroid_sdk_base_release.RemoteActionCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 8);
                r8lambdat7xjd1d4humw0psb7whucfgonss.read(getdelayedinitializationproviderandroid_sdk_base_release.IconCompatParcelizer.intValue());
                String str = getdelayedinitializationproviderandroid_sdk_base_release.write;
                if (str != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 14:
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 15:
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 16:
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 17:
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 18:
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 19:
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 20:
                setSessionHandlingBlocklistlambda0 setsessionhandlingblocklistlambda0 = (setSessionHandlingBlocklistlambda0) obj;
                Byte b = setsessionhandlingblocklistlambda0.RemoteActionCompatParcelizer;
                Byte b2 = setsessionhandlingblocklistlambda0.serializer;
                if (b != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(setsessionhandlingblocklistlambda0.RemoteActionCompatParcelizer.byteValue());
                }
                if (b2 != null) {
                    int i4 = RemoteActionCompatParcelizer + 117;
                    IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        getBitmapFromCache.read((byte) 2, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                    } else {
                        getBitmapFromCache.read((byte) 3, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                    }
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 21:
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 22:
                r8lambdaR6dAybf4g5pc5sZkFujTnBDSk r8lambdar6daybf4g5pc5szkfujtnbdsk = (r8lambdaR6dAybf4g5pc5sZkFujTnBDSk) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(r8lambdar6daybf4g5pc5szkfujtnbdsk.read);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(r8lambdar6daybf4g5pc5szkfujtnbdsk.serializer);
                String str2 = r8lambdar6daybf4g5pc5szkfujtnbdsk.IconCompatParcelizer;
                if (str2 != null) {
                    int i5 = IconCompatParcelizer + 87;
                    RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 84);
                    } else {
                        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                    }
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str2);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 23:
                r8lambda0MdKuROsXEIrniGHcQsvY2A8sFY r8lambda0mdkurosxeirnighcqsvy2a8sfy = (r8lambda0MdKuROsXEIrniGHcQsvY2A8sFY) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(r8lambda0mdkurosxeirnighcqsvy2a8sfy.RemoteActionCompatParcelizer);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 11);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write(r8lambda0mdkurosxeirnighcqsvy2a8sfy.write);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 3);
                af$$ExternalSyntheticOutline1.m((byte) 6, 4, r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambda0mdkurosxeirnighcqsvy2a8sfy.read);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(r8lambda0mdkurosxeirnighcqsvy2a8sfy.serializer.shortValue());
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 24:
                BrazeInternal brazeInternal = (BrazeInternal) obj;
                Boolean bool = brazeInternal.RemoteActionCompatParcelizer;
                Boolean bool2 = brazeInternal.read;
                Byte b3 = brazeInternal.serializer;
                Boolean bool3 = brazeInternal.IconCompatParcelizer;
                if (bool != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 2);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(brazeInternal.RemoteActionCompatParcelizer.booleanValue() ? (byte) 1 : (byte) 0);
                }
                if (bool3 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 2, bool3);
                }
                if (b3 != null) {
                    getBitmapFromCache.read((byte) 3, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, b3);
                }
                if (bool2 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 4, (byte) 2, bool2);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 25:
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 2);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(((addSerializedContentCardToStorage) obj).write.booleanValue() ? (byte) 1 : (byte) 0);
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 26:
                recordGeofenceTransition recordgeofencetransition = (recordGeofenceTransition) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 15);
                r8lambdat7xjd1d4humw0psb7whucfgonss.write((byte) 11, recordgeofencetransition.write.size());
                Iterator it = recordgeofencetransition.write.iterator();
                while (it.hasNext()) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write((String) it.next());
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(2, (byte) 3);
                IconCompatParcelizer.IconCompatParcelizer(recordgeofencetransition.RemoteActionCompatParcelizer, r8lambdat7xjd1d4humw0psb7whucfgonss, (byte) 0);
                break;
            case 27:
                deleteRegisteredGeofenceCache deleteregisteredgeofencecache = (deleteRegisteredGeofenceCache) obj;
                Boolean bool4 = deleteregisteredgeofencecache.write;
                Boolean bool5 = deleteregisteredgeofencecache.RemoteActionCompatParcelizer;
                Boolean bool6 = deleteregisteredgeofencecache.IconCompatParcelizer;
                if (bool4 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 2);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(deleteregisteredgeofencecache.write.booleanValue() ? (byte) 1 : (byte) 0);
                }
                if (bool6 != null) {
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 2, (byte) 2, bool6);
                }
                if (bool5 != null) {
                    int i6 = IconCompatParcelizer + 71;
                    RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    MediaSessionCompatQueueItem.read(r8lambdat7xjd1d4humw0psb7whucfgonss, 3, (byte) 2, bool5);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            case 28:
                validateAndStorePushId validateandstorepushid = (validateAndStorePushId) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                af$$ExternalSyntheticOutline1.m((byte) 10, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, validateandstorepushid.write);
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(validateandstorepushid.read.longValue());
                String str3 = validateandstorepushid.serializer;
                if (str3 != null) {
                    r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(3, (byte) 11);
                    r8lambdat7xjd1d4humw0psb7whucfgonss.write(str3);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
            default:
                r8lambdaX8O0CQVGYSvyuZ1ZQ9WvuF9jtM r8lambdax8o0cqvgysvyuz1zq9wvuf9jtm = (r8lambdaX8O0CQVGYSvyuZ1ZQ9WvuF9jtM) obj;
                r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(1, (byte) 3);
                Byte b4 = r8lambdax8o0cqvgysvyuz1zq9wvuf9jtm.serializer;
                Byte b5 = r8lambdax8o0cqvgysvyuz1zq9wvuf9jtm.RemoteActionCompatParcelizer;
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b4.byteValue());
                Byte b6 = r8lambdax8o0cqvgysvyuz1zq9wvuf9jtm.read;
                if (b6 != null) {
                    getBitmapFromCache.read((byte) 3, 2, r8lambdat7xjd1d4humw0psb7whucfgonss, b6);
                }
                if (b5 != null) {
                    getBitmapFromCache.read((byte) 3, 3, r8lambdat7xjd1d4humw0psb7whucfgonss, b5);
                }
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer((byte) 0);
                break;
        }
    }
}
