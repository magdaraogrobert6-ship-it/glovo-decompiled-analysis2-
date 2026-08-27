package o;

import android.net.NetworkRequest;
import android.os.Build;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.mapbox.navigation.voice.api.VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import okio.Okio;
import okio.Options;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final class isIdentity58bKbWc extends TuplesKt {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ isIdentity58bKbWc(int i) {
        this.write = i;
    }

    public /* synthetic */ isIdentity58bKbWc(int i, Object obj) {
        this.write = i;
    }

    @Override // kotlin.TuplesKt
    public final String serializer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 105;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        switch (this.write) {
            case 0:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 4:
                int i5 = i2 + 81;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 6:
                int i6 = i2 + 111;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return "INSERT OR REPLACE INTO `tracking_perseus_events` (`id`,`timestamp`,`payloadTimeStamp`,`country`,`advertisingId`,`appId`,`appName`,`appVersionCode`,`adjustId`,`userId`,`uaId`,`clientId`,`sessionId`,`sdkVersionName`,`globalEntityId`,`consent`,`sessionOffset`,`eventVariables`,`ecommerceItems`,`ecommerceComponents`,`isDebug`,`eventAction`,`appBuildVersion`,`rechargeTo`,`firebaseInstanceId`,`priority`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `country_config` (`id_country_config`,`name`,`country_code`,`country_iso_code`,`brand`,`currency`,`url`,`global_entity_id`,`register_url`,`privacy_policy_url`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `session` (`id_session`,`country`,`countryUrl`,`userId`,`contract`,`cityId`) VALUES (?,?,?,?,?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `in_app_message` (`id`,`message_data`,`content_response_json`,`is_shown`,`message_id`,`campaign_id`,`execution_id`,`template_id`,`notification_id`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 10:
                return "INSERT OR REPLACE INTO `shift_info` (`id`,`zone`,`city`,`cityId`,`contractType`,`status`,`statusEndingTime`,`isEndBreakAllowed`,`isBreakScheduled`,`isShiftExtensionAllowed`,`isShiftExtensionRequestedByRider`,`shifts`,`startingArea`,`timestamp`,`balanceLimit`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 11:
                return "INSERT OR REPLACE INTO `status` (`id`,`status_type`,`status_text`,`description`,`action_type`,`action_text`,`action_url`,`timestamp`) VALUES (?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `work_opportunity` (`id`,`type`,`description`,`zone_name`,`zone_geo_json`,`center_geo_json`,`bonus_types`,`bonus_multiplier`,`calender_enabled`,`subzones`,`start_time`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    @Override // kotlin.TuplesKt
    public final void write(UncheckedColordefault uncheckedColordefault, Object obj) throws IOException {
        int i;
        int i2;
        byte[] byteArray;
        byte[] byteArray2;
        String strRemoteActionCompatParcelizer;
        String strRemoteActionCompatParcelizer2;
        String strRemoteActionCompatParcelizer3;
        String str;
        String str2;
        String str3;
        String strRemoteActionCompatParcelizer4;
        int i3 = 2 % 2;
        int i4 = 3;
        switch (this.write) {
            case 0:
                OffsetEffect offsetEffect = (OffsetEffect) obj;
                uncheckedColordefault.getClass();
                offsetEffect.getClass();
                uncheckedColordefault.IconCompatParcelizer(1, offsetEffect.write);
                uncheckedColordefault.IconCompatParcelizer(2, offsetEffect.read);
                return;
            case 1:
                LightingColorFilter lightingColorFilter = (LightingColorFilter) obj;
                uncheckedColordefault.getClass();
                lightingColorFilter.getClass();
                uncheckedColordefault.IconCompatParcelizer(1, lightingColorFilter.RemoteActionCompatParcelizer);
                uncheckedColordefault.IconCompatParcelizer(2, lightingColorFilter.write);
                return;
            case 2:
                getMultiply0d7_KjU getmultiply0d7_kju = (getMultiply0d7_KjU) obj;
                uncheckedColordefault.getClass();
                getmultiply0d7_kju.getClass();
                uncheckedColordefault.IconCompatParcelizer(1, getmultiply0d7_kju.write);
                uncheckedColordefault.RemoteActionCompatParcelizer(2, getmultiply0d7_kju.read.longValue());
                return;
            case 3:
                Matrix matrix = (Matrix) obj;
                uncheckedColordefault.getClass();
                matrix.getClass();
                uncheckedColordefault.IconCompatParcelizer(1, matrix.write);
                uncheckedColordefault.RemoteActionCompatParcelizer(2, matrix.IconCompatParcelizer);
                uncheckedColordefault.RemoteActionCompatParcelizer(3, matrix.RemoteActionCompatParcelizer);
                return;
            case 4:
                rotateYimpl rotateyimpl = (rotateYimpl) obj;
                uncheckedColordefault.getClass();
                rotateyimpl.getClass();
                uncheckedColordefault.IconCompatParcelizer(1, rotateyimpl.IconCompatParcelizer);
                uncheckedColordefault.IconCompatParcelizer(2, rotateyimpl.serializer);
                return;
            case 5:
                setFrom58bKbWc setfrom58bkbwc = (setFrom58bKbWc) obj;
                uncheckedColordefault.getClass();
                setfrom58bkbwc.getClass();
                uncheckedColordefault.IconCompatParcelizer(1, setfrom58bkbwc.RatingCompat);
                uncheckedColordefault.RemoteActionCompatParcelizer(2, Options.Companion.read(setfrom58bkbwc.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8));
                uncheckedColordefault.IconCompatParcelizer(3, setfrom58bkbwc.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
                uncheckedColordefault.IconCompatParcelizer(4, setfrom58bkbwc.MediaSessionCompatResultReceiverWrapper);
                accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd = accessgetAmbientShadowColor0d7_KjUjd.write;
                uncheckedColordefault.IconCompatParcelizer(5, Okio.serializer(setfrom58bkbwc.MediaSessionCompatToken));
                uncheckedColordefault.IconCompatParcelizer(6, Okio.serializer(setfrom58bkbwc.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY));
                uncheckedColordefault.RemoteActionCompatParcelizer(7, setfrom58bkbwc.MediaSessionCompatQueueItem);
                uncheckedColordefault.RemoteActionCompatParcelizer(8, setfrom58bkbwc.PlaybackStateCompat);
                uncheckedColordefault.RemoteActionCompatParcelizer(9, setfrom58bkbwc.MediaMetadataCompat);
                uncheckedColordefault.RemoteActionCompatParcelizer(10, setfrom58bkbwc.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
                GraphicsLayerScope graphicsLayerScope = setfrom58bkbwc.write;
                graphicsLayerScope.getClass();
                int i5 = getRoundRectPathui_graphics.write[graphicsLayerScope.ordinal()];
                if (i5 != 1) {
                    int i6 = serializer;
                    int i7 = i6 + 125;
                    read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i7 % 2 != 0 ? i5 != 2 : i5 != 4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    }
                    int i8 = i6 + 21;
                    read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    i = 1;
                } else {
                    i = 0;
                }
                uncheckedColordefault.RemoteActionCompatParcelizer(11, i);
                uncheckedColordefault.RemoteActionCompatParcelizer(12, setfrom58bkbwc.serializer);
                uncheckedColordefault.RemoteActionCompatParcelizer(13, setfrom58bkbwc.ParcelableVolumeInfo);
                uncheckedColordefault.RemoteActionCompatParcelizer(14, setfrom58bkbwc.PlaybackStateCompatCustomAction);
                uncheckedColordefault.RemoteActionCompatParcelizer(15, setfrom58bkbwc.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
                uncheckedColordefault.RemoteActionCompatParcelizer(16, setfrom58bkbwc.MediaBrowserCompatMediaItem ? 1L : 0L);
                setRotationZ setrotationz = setfrom58bkbwc.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                setrotationz.getClass();
                int i10 = getRoundRectPathui_graphics.read[setrotationz.ordinal()];
                if (i10 == 1) {
                    i2 = 0;
                } else {
                    if (i10 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    }
                    i2 = 1;
                }
                uncheckedColordefault.RemoteActionCompatParcelizer(17, i2);
                uncheckedColordefault.RemoteActionCompatParcelizer(18, setfrom58bkbwc.ComponentActivity);
                uncheckedColordefault.RemoteActionCompatParcelizer(19, setfrom58bkbwc.MediaDescriptionCompat);
                uncheckedColordefault.RemoteActionCompatParcelizer(20, setfrom58bkbwc.ResultReceiver);
                uncheckedColordefault.RemoteActionCompatParcelizer(21, setfrom58bkbwc.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                uncheckedColordefault.RemoteActionCompatParcelizer(22, setfrom58bkbwc.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
                String str4 = setfrom58bkbwc.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                if (str4 == null) {
                    uncheckedColordefault.IconCompatParcelizer(23);
                } else {
                    uncheckedColordefault.IconCompatParcelizer(23, str4);
                }
                Boolean bool = setfrom58bkbwc.IconCompatParcelizer;
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    int i11 = serializer + 75;
                    read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    uncheckedColordefault.IconCompatParcelizer(24);
                } else {
                    uncheckedColordefault.RemoteActionCompatParcelizer(24, numValueOf.intValue());
                }
                toolingGraphicsLayer toolinggraphicslayer = setfrom58bkbwc.read;
                setCompositingStrategyaDBOjCE setcompositingstrategyadbojce = toolinggraphicslayer.MediaDescriptionCompat;
                setcompositingstrategyadbojce.getClass();
                int i13 = getRoundRectPathui_graphics.RemoteActionCompatParcelizer[setcompositingstrategyadbojce.ordinal()];
                if (i13 == 1) {
                    i4 = 0;
                } else if (i13 == 2) {
                    i4 = 1;
                } else if (i13 == 3) {
                    i4 = 2;
                } else if (i13 != 4) {
                    int i14 = read + 17;
                    serializer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i14 % 2 == 0 ? i13 == 5 : i13 == 3) {
                        i4 = 4;
                    } else if (Build.VERSION.SDK_INT < 30 || setcompositingstrategyadbojce != setCompositingStrategyaDBOjCE.TEMPORARILY_UNMETERED) {
                        DrawableTransformation.IconCompatParcelizer("Could not convert ", setcompositingstrategyadbojce, " to int");
                        i4 = 0;
                    } else {
                        i4 = 5;
                    }
                }
                uncheckedColordefault.RemoteActionCompatParcelizer(25, i4);
                drawOutlinehn5TExg drawoutlinehn5texg = toolinggraphicslayer.read;
                drawoutlinehn5texg.getClass();
                NetworkRequest networkRequest = (NetworkRequest) drawoutlinehn5texg.read;
                if (networkRequest == null) {
                    byteArray = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            int[] iArr = addOutline.read(networkRequest);
                            int[] iArrRemoteActionCompatParcelizer = addOutline.RemoteActionCompatParcelizer(networkRequest);
                            objectOutputStream.writeInt(iArr.length);
                            for (int i15 : iArr) {
                                objectOutputStream.writeInt(i15);
                            }
                            objectOutputStream.writeInt(iArrRemoteActionCompatParcelizer.length);
                            for (int i16 : iArrRemoteActionCompatParcelizer) {
                                int i17 = read + 101;
                                serializer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i18 = i17 % 2;
                                objectOutputStream.writeInt(i16);
                            }
                            objectOutputStream.close();
                            byteArrayOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                            byteArray.getClass();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{objectOutputStream, th}, sourceInformationContextOfdefault.read());
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{byteArrayOutputStream, th3}, sourceInformationContextOfdefault.read());
                            throw th4;
                        }
                    }
                }
                uncheckedColordefault.IconCompatParcelizer(26, byteArray);
                uncheckedColordefault.RemoteActionCompatParcelizer(27, toolinggraphicslayer.MediaMetadataCompat ? 1L : 0L);
                uncheckedColordefault.RemoteActionCompatParcelizer(28, toolinggraphicslayer.MediaSessionCompatQueueItem ? 1L : 0L);
                uncheckedColordefault.RemoteActionCompatParcelizer(29, toolinggraphicslayer.RatingCompat ? 1L : 0L);
                uncheckedColordefault.RemoteActionCompatParcelizer(30, toolinggraphicslayer.MediaBrowserCompatMediaItem ? 1L : 0L);
                uncheckedColordefault.RemoteActionCompatParcelizer(31, toolinggraphicslayer.serializer);
                uncheckedColordefault.RemoteActionCompatParcelizer(32, toolinggraphicslayer.RemoteActionCompatParcelizer);
                Set<accessgetRenderEffectjd> set = toolinggraphicslayer.write;
                set.getClass();
                if (set.isEmpty()) {
                    byteArray2 = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                        try {
                            objectOutputStream2.writeInt(set.size());
                            for (accessgetRenderEffectjd accessgetrendereffectjd : set) {
                                objectOutputStream2.writeUTF(accessgetrendereffectjd.RemoteActionCompatParcelizer().toString());
                                objectOutputStream2.writeBoolean(accessgetrendereffectjd.write());
                            }
                            objectOutputStream2.close();
                            byteArrayOutputStream2.close();
                            byteArray2 = byteArrayOutputStream2.toByteArray();
                            byteArray2.getClass();
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{objectOutputStream2, th5}, sourceInformationContextOfdefault.read());
                                throw th6;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{byteArrayOutputStream2, th7}, sourceInformationContextOfdefault.read());
                            throw th8;
                        }
                    }
                }
                uncheckedColordefault.IconCompatParcelizer(33, byteArray2);
                return;
            case 6:
                quadTo quadto = (quadTo) obj;
                uncheckedColordefault.getClass();
                quadto.getClass();
                uncheckedColordefault.RemoteActionCompatParcelizer(1, quadto.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                uncheckedColordefault.RemoteActionCompatParcelizer(2, quadto.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
                uncheckedColordefault.IconCompatParcelizer(3, quadto.ResultReceiver);
                uncheckedColordefault.IconCompatParcelizer(4, quadto.MediaBrowserCompatMediaItem);
                String str5 = quadto.serializer;
                if (str5 == null) {
                    uncheckedColordefault.IconCompatParcelizer(5);
                } else {
                    uncheckedColordefault.IconCompatParcelizer(5, str5);
                }
                uncheckedColordefault.IconCompatParcelizer(6, quadto.read);
                uncheckedColordefault.IconCompatParcelizer(7, quadto.RemoteActionCompatParcelizer);
                uncheckedColordefault.IconCompatParcelizer(8, quadto.MediaSessionCompatQueueItem);
                String str6 = quadto.write;
                if (str6 == null) {
                    uncheckedColordefault.IconCompatParcelizer(9);
                } else {
                    uncheckedColordefault.IconCompatParcelizer(9, str6);
                }
                uncheckedColordefault.IconCompatParcelizer(10, quadto.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                String str7 = quadto.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                if (str7 == null) {
                    uncheckedColordefault.IconCompatParcelizer(11);
                } else {
                    uncheckedColordefault.IconCompatParcelizer(11, str7);
                }
                uncheckedColordefault.IconCompatParcelizer(12, quadto.MediaDescriptionCompat);
                uncheckedColordefault.IconCompatParcelizer(13, quadto.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
                uncheckedColordefault.IconCompatParcelizer(14, quadto.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                String str8 = quadto.MediaSessionCompatResultReceiverWrapper;
                if (str8 == null) {
                    uncheckedColordefault.IconCompatParcelizer(15);
                } else {
                    uncheckedColordefault.IconCompatParcelizer(15, str8);
                }
                String str9 = quadto.MediaMetadataCompat;
                if (str9 == null) {
                    uncheckedColordefault.IconCompatParcelizer(16);
                } else {
                    uncheckedColordefault.IconCompatParcelizer(16, str9);
                }
                uncheckedColordefault.RemoteActionCompatParcelizer(17, quadto.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                uncheckedColordefault.IconCompatParcelizer(18, quadto.PlaybackStateCompatCustomAction);
                String str10 = quadto.ParcelableVolumeInfo;
                if (str10 == null) {
                    uncheckedColordefault.IconCompatParcelizer(19);
                } else {
                    uncheckedColordefault.IconCompatParcelizer(19, str10);
                }
                String str11 = quadto.RatingCompat;
                if (str11 == null) {
                    uncheckedColordefault.IconCompatParcelizer(20);
                } else {
                    uncheckedColordefault.IconCompatParcelizer(20, str11);
                }
                uncheckedColordefault.RemoteActionCompatParcelizer(21, quadto.ComponentActivity ? 1L : 0L);
                String str12 = quadto.PlaybackStateCompat;
                if (str12 == null) {
                    uncheckedColordefault.IconCompatParcelizer(22);
                } else {
                    uncheckedColordefault.IconCompatParcelizer(22, str12);
                }
                uncheckedColordefault.IconCompatParcelizer(23, quadto.IconCompatParcelizer);
                String str13 = quadto.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                if (str13 == null) {
                    int i19 = serializer + 105;
                    read = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    uncheckedColordefault.IconCompatParcelizer(24);
                } else {
                    uncheckedColordefault.IconCompatParcelizer(24, str13);
                }
                String str14 = quadto.MediaSessionCompatToken;
                if (str14 == null) {
                    uncheckedColordefault.IconCompatParcelizer(25);
                } else {
                    uncheckedColordefault.IconCompatParcelizer(25, str14);
                }
                Integer num = quadto.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                if (num == null) {
                    uncheckedColordefault.IconCompatParcelizer(26);
                    return;
                } else {
                    uncheckedColordefault.RemoteActionCompatParcelizer(26, num.intValue());
                    return;
                }
            case 7:
                unpackMetaFocusable unpackmetafocusable = (unpackMetaFocusable) obj;
                uncheckedColordefault.getClass();
                unpackmetafocusable.getClass();
                uncheckedColordefault.RemoteActionCompatParcelizer(1, unpackmetafocusable.MediaSessionCompatQueueItem);
                uncheckedColordefault.IconCompatParcelizer(2, unpackmetafocusable.MediaDescriptionCompat);
                uncheckedColordefault.IconCompatParcelizer(3, unpackmetafocusable.serializer);
                uncheckedColordefault.IconCompatParcelizer(4, unpackmetafocusable.write);
                uncheckedColordefault.IconCompatParcelizer(5, unpackmetafocusable.read);
                uncheckedColordefault.IconCompatParcelizer(6, unpackmetafocusable.RemoteActionCompatParcelizer);
                uncheckedColordefault.IconCompatParcelizer(7, unpackmetafocusable.MediaBrowserCompatMediaItem);
                uncheckedColordefault.IconCompatParcelizer(8, unpackmetafocusable.IconCompatParcelizer);
                String str15 = unpackmetafocusable.RatingCompat;
                if (str15 == null) {
                    uncheckedColordefault.IconCompatParcelizer(9);
                } else {
                    uncheckedColordefault.IconCompatParcelizer(9, str15);
                }
                String str16 = unpackmetafocusable.MediaMetadataCompat;
                if (str16 == null) {
                    uncheckedColordefault.IconCompatParcelizer(10);
                    return;
                } else {
                    uncheckedColordefault.IconCompatParcelizer(10, str16);
                    return;
                }
            case 8:
                getTextCenterJ6kI3mc gettextcenterj6ki3mc = (getTextCenterJ6kI3mc) obj;
                uncheckedColordefault.getClass();
                gettextcenterj6ki3mc.getClass();
                uncheckedColordefault.RemoteActionCompatParcelizer(1, gettextcenterj6ki3mc.IconCompatParcelizer);
                uncheckedColordefault.IconCompatParcelizer(2, gettextcenterj6ki3mc.read);
                uncheckedColordefault.IconCompatParcelizer(3, gettextcenterj6ki3mc.write);
                uncheckedColordefault.RemoteActionCompatParcelizer(4, gettextcenterj6ki3mc.MediaBrowserCompatMediaItem);
                uncheckedColordefault.IconCompatParcelizer(5, gettextcenterj6ki3mc.serializer);
                uncheckedColordefault.RemoteActionCompatParcelizer(6, gettextcenterj6ki3mc.RemoteActionCompatParcelizer);
                return;
            case 9:
                suppressLayout suppresslayout = (suppressLayout) obj;
                uncheckedColordefault.getClass();
                suppresslayout.getClass();
                uncheckedColordefault.RemoteActionCompatParcelizer(1, ((Long) suppressLayout.RemoteActionCompatParcelizer(-1785169446, new Object[]{suppresslayout}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), 1785169447)).longValue());
                uncheckedColordefault.IconCompatParcelizer(2, suppresslayout.serializer());
                uncheckedColordefault.IconCompatParcelizer(3, suppresslayout.IconCompatParcelizer());
                uncheckedColordefault.RemoteActionCompatParcelizer(4, suppresslayout.MediaBrowserCompatMediaItem() ? 1L : 0L);
                uncheckedColordefault.IconCompatParcelizer(5, suppresslayout.MediaSessionCompatQueueItem());
                uncheckedColordefault.IconCompatParcelizer(6, suppresslayout.write());
                uncheckedColordefault.IconCompatParcelizer(7, suppresslayout.read());
                uncheckedColordefault.IconCompatParcelizer(8, suppresslayout.MediaMetadataCompat());
                uncheckedColordefault.IconCompatParcelizer(9, (String) suppressLayout.RemoteActionCompatParcelizer(-730533709, new Object[]{suppresslayout}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), 730533709));
                return;
            case 10:
                OnEventTrackingSucceededListener onEventTrackingSucceededListener = (OnEventTrackingSucceededListener) obj;
                uncheckedColordefault.getClass();
                onEventTrackingSucceededListener.getClass();
                uncheckedColordefault.RemoteActionCompatParcelizer(1, onEventTrackingSucceededListener.read);
                uncheckedColordefault.IconCompatParcelizer(2, onEventTrackingSucceededListener.MediaSessionCompatResultReceiverWrapper);
                uncheckedColordefault.IconCompatParcelizer(3, onEventTrackingSucceededListener.write);
                uncheckedColordefault.RemoteActionCompatParcelizer(4, onEventTrackingSucceededListener.IconCompatParcelizer);
                uncheckedColordefault.IconCompatParcelizer(5, onEventTrackingSucceededListener.RemoteActionCompatParcelizer);
                uncheckedColordefault.IconCompatParcelizer(6, onEventTrackingSucceededListener.MediaSessionCompatToken);
                Calendar calendar = onEventTrackingSucceededListener.PlaybackStateCompat;
                Long lValueOf = calendar != null ? Long.valueOf(calendar.getTimeInMillis()) : null;
                if (lValueOf == null) {
                    int i21 = read + 53;
                    serializer = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    uncheckedColordefault.IconCompatParcelizer(7);
                } else {
                    uncheckedColordefault.RemoteActionCompatParcelizer(7, lValueOf.longValue());
                }
                uncheckedColordefault.RemoteActionCompatParcelizer(8, onEventTrackingSucceededListener.RatingCompat ? 1L : 0L);
                uncheckedColordefault.RemoteActionCompatParcelizer(9, onEventTrackingSucceededListener.MediaDescriptionCompat ? 1L : 0L);
                uncheckedColordefault.RemoteActionCompatParcelizer(10, onEventTrackingSucceededListener.MediaMetadataCompat ? 1L : 0L);
                uncheckedColordefault.RemoteActionCompatParcelizer(11, onEventTrackingSucceededListener.MediaSessionCompatQueueItem ? 1L : 0L);
                List list = onEventTrackingSucceededListener.MediaBrowserCompatMediaItem;
                try {
                    r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = getModulateAlphake2Ky5w.serializer;
                    r8lambda3kmch7yklpui_5smgazrgczhglc.getClass();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(new setWasCloseMessageCalled(OnGooglePlayInstallReferrerReadListener.Companion.serializer(), 0));
                    strRemoteActionCompatParcelizer = r8lambda3kmch7yklpui_5smgazrgczhglc.RemoteActionCompatParcelizer(setgraphicmodalmaxwidthdp, list);
                    break;
                } catch (Exception e) {
                    Timber.RemoteActionCompatParcelizer.write(new Throwable(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n                 |Error in serializing the JSON data in type converter\n                 |object serialized = " + list + "\n                "), e));
                    strRemoteActionCompatParcelizer = null;
                }
                uncheckedColordefault.IconCompatParcelizer(12, String.valueOf(strRemoteActionCompatParcelizer));
                OnGoogleAdIdReadListener onGoogleAdIdReadListener = onEventTrackingSucceededListener.PlaybackStateCompatCustomAction;
                try {
                    r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc2 = getModulateAlphake2Ky5w.serializer;
                    r8lambda3kmch7yklpui_5smgazrgczhglc2.getClass();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = LazyKt__LazyJVMKt.read(OnGoogleAdIdReadListener.Companion.serializer());
                    strRemoteActionCompatParcelizer2 = r8lambda3kmch7yklpui_5smgazrgczhglc2.RemoteActionCompatParcelizer(setgraphicmodalmaxwidthdp2, onGoogleAdIdReadListener);
                    break;
                } catch (Exception e2) {
                    Timber.RemoteActionCompatParcelizer.write(new Throwable(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n                 |Error in serializing the JSON data in type converter\n                 |object serialized = " + onGoogleAdIdReadListener + "\n                "), e2));
                    strRemoteActionCompatParcelizer2 = null;
                }
                uncheckedColordefault.IconCompatParcelizer(13, String.valueOf(strRemoteActionCompatParcelizer2));
                uncheckedColordefault.RemoteActionCompatParcelizer(14, onEventTrackingSucceededListener.ParcelableVolumeInfo);
                OnAdidReadListener onAdidReadListener = onEventTrackingSucceededListener.serializer;
                try {
                    r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc3 = getModulateAlphake2Ky5w.serializer;
                    r8lambda3kmch7yklpui_5smgazrgczhglc3.getClass();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp3 = LazyKt__LazyJVMKt.read(OnAdidReadListener.Companion.serializer());
                    strRemoteActionCompatParcelizer3 = r8lambda3kmch7yklpui_5smgazrgczhglc3.RemoteActionCompatParcelizer(setgraphicmodalmaxwidthdp3, onAdidReadListener);
                    break;
                } catch (Exception e3) {
                    Timber.RemoteActionCompatParcelizer.write(new Throwable(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n                 |Error in serializing the JSON data in type converter\n                 |object serialized = " + onAdidReadListener + "\n                "), e3));
                    strRemoteActionCompatParcelizer3 = null;
                }
                uncheckedColordefault.IconCompatParcelizer(15, String.valueOf(strRemoteActionCompatParcelizer3));
                return;
            case 11:
                OnIsEnabledListener onIsEnabledListener = (OnIsEnabledListener) obj;
                uncheckedColordefault.getClass();
                onIsEnabledListener.getClass();
                uncheckedColordefault.RemoteActionCompatParcelizer(1, onIsEnabledListener.serializer);
                switch (OnAmazonAdIdReadListener.serializer[onIsEnabledListener.RatingCompat.ordinal()]) {
                    case 1:
                        str = "AVAILABLE";
                        break;
                    case 2:
                        str = "ENDING";
                        break;
                    case 3:
                        str = "LATE";
                        break;
                    case 4:
                        str = "NOT_WORKING";
                        break;
                    case 5:
                        str = "ON_PAID_BREAK";
                        break;
                    case 6:
                        str = "ON_BREAK";
                        break;
                    case 7:
                        str = "READY";
                        break;
                    case 8:
                        str = "STARTING";
                        break;
                    case 9:
                        str = "SUSPENDED";
                        break;
                    case 10:
                        str = "WORKING";
                        break;
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                }
                uncheckedColordefault.IconCompatParcelizer(2, str);
                uncheckedColordefault.IconCompatParcelizer(3, onIsEnabledListener.MediaDescriptionCompat);
                String str17 = onIsEnabledListener.IconCompatParcelizer;
                if (str17 == null) {
                    uncheckedColordefault.IconCompatParcelizer(4);
                } else {
                    uncheckedColordefault.IconCompatParcelizer(4, str17);
                }
                GooglePlayInstallReferrerDetails googlePlayInstallReferrerDetails = onIsEnabledListener.RemoteActionCompatParcelizer;
                if (googlePlayInstallReferrerDetails == null) {
                    uncheckedColordefault.IconCompatParcelizer(5);
                } else {
                    switch (OnAmazonAdIdReadListener.read[googlePlayInstallReferrerDetails.ordinal()]) {
                        case 1:
                            str2 = "REQUEST_BREAK";
                            break;
                        case 2:
                            str2 = "END_BREAK";
                            break;
                        case 3:
                            str2 = "CANCEL_BREAK";
                            break;
                        case 4:
                            str2 = "URL_ACTION";
                            break;
                        case 5:
                            str2 = "STOP_WORKING";
                            break;
                        case 6:
                            str2 = "UNKNOWN_ACTION";
                            break;
                        default:
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return;
                    }
                    uncheckedColordefault.IconCompatParcelizer(5, str2);
                }
                String str18 = onIsEnabledListener.write;
                if (str18 == null) {
                    uncheckedColordefault.IconCompatParcelizer(6);
                } else {
                    uncheckedColordefault.IconCompatParcelizer(6, str18);
                }
                String str19 = onIsEnabledListener.read;
                if (str19 == null) {
                    uncheckedColordefault.IconCompatParcelizer(7);
                } else {
                    uncheckedColordefault.IconCompatParcelizer(7, str19);
                }
                uncheckedColordefault.RemoteActionCompatParcelizer(8, onIsEnabledListener.MediaSessionCompatQueueItem);
                return;
            default:
                OnLastDeeplinkReadListener onLastDeeplinkReadListener = (OnLastDeeplinkReadListener) obj;
                uncheckedColordefault.getClass();
                onLastDeeplinkReadListener.getClass();
                uncheckedColordefault.IconCompatParcelizer(1, onLastDeeplinkReadListener.MediaBrowserCompatMediaItem);
                int i23 = onAmazonAdIdRead.RemoteActionCompatParcelizer[onLastDeeplinkReadListener.RatingCompat.ordinal()];
                if (i23 == 1) {
                    str3 = "WORK_NOW";
                } else if (i23 == 2) {
                    str3 = "WORK_NOW_LOW_FILL";
                } else if (i23 == 3) {
                    str3 = "GO_AND_START_NOW";
                } else {
                    if (i23 != 4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    }
                    str3 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                }
                uncheckedColordefault.IconCompatParcelizer(2, str3);
                uncheckedColordefault.IconCompatParcelizer(3, onLastDeeplinkReadListener.RemoteActionCompatParcelizer);
                String str20 = onLastDeeplinkReadListener.MediaSessionCompatResultReceiverWrapper;
                if (str20 == null) {
                    int i24 = read + 53;
                    serializer = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i25 = i24 % 2;
                    uncheckedColordefault.IconCompatParcelizer(4);
                } else {
                    uncheckedColordefault.IconCompatParcelizer(4, str20);
                }
                String str21 = onLastDeeplinkReadListener.MediaSessionCompatQueueItem;
                if (str21 == null) {
                    int i26 = serializer + 91;
                    read = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i27 = i26 % 2;
                    uncheckedColordefault.IconCompatParcelizer(5);
                } else {
                    uncheckedColordefault.IconCompatParcelizer(5, str21);
                }
                String str22 = onLastDeeplinkReadListener.serializer;
                if (str22 == null) {
                    uncheckedColordefault.IconCompatParcelizer(6);
                } else {
                    uncheckedColordefault.IconCompatParcelizer(6, str22);
                }
                String str23 = onLastDeeplinkReadListener.IconCompatParcelizer;
                if (str23 == null) {
                    int i28 = read + 5;
                    serializer = i28 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i28 % 2 != 0) {
                        uncheckedColordefault.IconCompatParcelizer(78);
                    } else {
                        uncheckedColordefault.IconCompatParcelizer(7);
                    }
                } else {
                    uncheckedColordefault.IconCompatParcelizer(7, str23);
                }
                String str24 = onLastDeeplinkReadListener.write;
                if (str24 == null) {
                    uncheckedColordefault.IconCompatParcelizer(8);
                } else {
                    uncheckedColordefault.IconCompatParcelizer(8, str24);
                }
                Boolean bool2 = onLastDeeplinkReadListener.read;
                Integer numValueOf2 = bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null;
                if (numValueOf2 == null) {
                    uncheckedColordefault.IconCompatParcelizer(9);
                } else {
                    uncheckedColordefault.RemoteActionCompatParcelizer(9, numValueOf2.intValue());
                }
                List list2 = onLastDeeplinkReadListener.MediaDescriptionCompat;
                try {
                    r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc4 = getModulateAlphake2Ky5w.serializer;
                    r8lambda3kmch7yklpui_5smgazrgczhglc4.getClass();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp4 = LazyKt__LazyJVMKt.read(new setWasCloseMessageCalled(onIsEnabledRead.Companion.serializer(), 0));
                    strRemoteActionCompatParcelizer4 = r8lambda3kmch7yklpui_5smgazrgczhglc4.RemoteActionCompatParcelizer(setgraphicmodalmaxwidthdp4, list2);
                } catch (Exception e4) {
                    Timber.RemoteActionCompatParcelizer.write(new Throwable(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n                 |Error in serializing the JSON data in type converter\n                 |object serialized = " + list2 + "\n                "), e4));
                    strRemoteActionCompatParcelizer4 = null;
                }
                uncheckedColordefault.IconCompatParcelizer(10, String.valueOf(strRemoteActionCompatParcelizer4));
                String str25 = onLastDeeplinkReadListener.MediaMetadataCompat;
                if (str25 == null) {
                    uncheckedColordefault.IconCompatParcelizer(11);
                    return;
                } else {
                    uncheckedColordefault.IconCompatParcelizer(11, str25);
                    return;
                }
        }
    }
}
