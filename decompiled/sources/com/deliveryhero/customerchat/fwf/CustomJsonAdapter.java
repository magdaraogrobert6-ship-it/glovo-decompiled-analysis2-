package com.deliveryhero.customerchat.fwf;

import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;
import o.IconCompatParcelizer;
import o.ItemTouchHelperAdapter;
import o.getDisplayHeightAndWidthPixels;
import o.getLocalBitmap;
import o.getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations;
import o.getRemoteBitmaplambda4;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomJsonAdapter extends JsonAdapter {
    public final getLocalBitmap IconCompatParcelizer;
    public final JsonAdapter write;

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        Custom custom = (Custom) obj;
        jsonWriter.getClass();
        if (custom == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.IconCompatParcelizer();
        jsonWriter.IconCompatParcelizer("customUserId");
        String str = custom.customUserId;
        JsonAdapter jsonAdapter = this.write;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.IconCompatParcelizer("gid");
        jsonAdapter.toJson(jsonWriter, custom.gid);
        jsonWriter.IconCompatParcelizer(PushNotificationParserObj.COUNTRY_KEY);
        jsonAdapter.toJson(jsonWriter, custom.country);
        jsonWriter.IconCompatParcelizer("userType");
        jsonAdapter.toJson(jsonWriter, custom.userType);
        jsonWriter.IconCompatParcelizer("deviceOsVersion");
        jsonAdapter.toJson(jsonWriter, custom.deviceOsVersion);
        jsonWriter.IconCompatParcelizer("platformName");
        jsonAdapter.toJson(jsonWriter, custom.platformName);
        jsonWriter.IconCompatParcelizer("appVersion");
        jsonAdapter.toJson(jsonWriter, custom.appVersion);
        jsonWriter.IconCompatParcelizer("applicationId");
        jsonAdapter.toJson(jsonWriter, custom.applicationId);
        jsonWriter.serializer();
    }

    public CustomJsonAdapter(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations) {
        getruntime_memory_image_loader_usage_quotientannotations.getClass();
        this.IconCompatParcelizer = getLocalBitmap.RemoteActionCompatParcelizer("customUserId", "gid", PushNotificationParserObj.COUNTRY_KEY, "userType", "deviceOsVersion", "platformName", "appVersion", "applicationId");
        this.write = getruntime_memory_image_loader_usage_quotientannotations.read(String.class, ItemTouchHelperAdapter.serializer, "customUserId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        getdisplayheightandwidthpixels.getClass();
        getdisplayheightandwidthpixels.read();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (true) {
            String str9 = str8;
            String str10 = str7;
            String str11 = str6;
            if (getdisplayheightandwidthpixels.MediaBrowserCompatMediaItem()) {
                int iSerializer = getdisplayheightandwidthpixels.serializer(this.IconCompatParcelizer);
                String str12 = str5;
                JsonAdapter jsonAdapter = this.write;
                switch (iSerializer) {
                    case -1:
                        getdisplayheightandwidthpixels.PlaybackStateCompatCustomAction();
                        getdisplayheightandwidthpixels.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                        str8 = str9;
                        str7 = str10;
                        str6 = str11;
                        str5 = str12;
                        break;
                    case 0:
                        String str13 = (String) jsonAdapter.fromJson(getdisplayheightandwidthpixels);
                        if (str13 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("customUserId", "customUserId", getdisplayheightandwidthpixels);
                        }
                        str = str13;
                        str8 = str9;
                        str7 = str10;
                        str6 = str11;
                        str5 = str12;
                        break;
                        break;
                    case 1:
                        str2 = (String) jsonAdapter.fromJson(getdisplayheightandwidthpixels);
                        if (str2 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("gid", "gid", getdisplayheightandwidthpixels);
                        }
                        str8 = str9;
                        str7 = str10;
                        str6 = str11;
                        str5 = str12;
                        break;
                    case 2:
                        String str14 = (String) jsonAdapter.fromJson(getdisplayheightandwidthpixels);
                        if (str14 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer(PushNotificationParserObj.COUNTRY_KEY, PushNotificationParserObj.COUNTRY_KEY, getdisplayheightandwidthpixels);
                        }
                        str3 = str14;
                        str8 = str9;
                        str7 = str10;
                        str6 = str11;
                        str5 = str12;
                        break;
                        break;
                    case 3:
                        String str15 = (String) jsonAdapter.fromJson(getdisplayheightandwidthpixels);
                        if (str15 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("userType", "userType", getdisplayheightandwidthpixels);
                        }
                        str4 = str15;
                        str8 = str9;
                        str7 = str10;
                        str6 = str11;
                        str5 = str12;
                        break;
                        break;
                    case 4:
                        String str16 = (String) jsonAdapter.fromJson(getdisplayheightandwidthpixels);
                        if (str16 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("deviceOsVersion", "deviceOsVersion", getdisplayheightandwidthpixels);
                        }
                        str5 = str16;
                        str8 = str9;
                        str7 = str10;
                        str6 = str11;
                        break;
                        break;
                    case 5:
                        String str17 = (String) jsonAdapter.fromJson(getdisplayheightandwidthpixels);
                        if (str17 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("platformName", "platformName", getdisplayheightandwidthpixels);
                        }
                        str6 = str17;
                        str8 = str9;
                        str7 = str10;
                        str5 = str12;
                        break;
                        break;
                    case 6:
                        String str18 = (String) jsonAdapter.fromJson(getdisplayheightandwidthpixels);
                        if (str18 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("appVersion", "appVersion", getdisplayheightandwidthpixels);
                        }
                        str7 = str18;
                        str8 = str9;
                        str6 = str11;
                        str5 = str12;
                        break;
                        break;
                    case 7:
                        String str19 = (String) jsonAdapter.fromJson(getdisplayheightandwidthpixels);
                        if (str19 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("applicationId", "applicationId", getdisplayheightandwidthpixels);
                        }
                        str8 = str19;
                        str7 = str10;
                        str6 = str11;
                        str5 = str12;
                        break;
                        break;
                    default:
                        str8 = str9;
                        str7 = str10;
                        str6 = str11;
                        str5 = str12;
                        break;
                }
            } else {
                String str20 = str5;
                getdisplayheightandwidthpixels.IconCompatParcelizer();
                if (str == null) {
                    throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("customUserId", "customUserId", getdisplayheightandwidthpixels);
                }
                if (str2 == null) {
                    throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("gid", "gid", getdisplayheightandwidthpixels);
                }
                if (str3 == null) {
                    throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer(PushNotificationParserObj.COUNTRY_KEY, PushNotificationParserObj.COUNTRY_KEY, getdisplayheightandwidthpixels);
                }
                if (str4 == null) {
                    throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("userType", "userType", getdisplayheightandwidthpixels);
                }
                if (str20 == null) {
                    throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("deviceOsVersion", "deviceOsVersion", getdisplayheightandwidthpixels);
                }
                if (str11 == null) {
                    throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("platformName", "platformName", getdisplayheightandwidthpixels);
                }
                if (str10 == null) {
                    throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("appVersion", "appVersion", getdisplayheightandwidthpixels);
                }
                if (str9 != null) {
                    return new Custom(str, str2, str3, str4, str20, str11, str10, str9);
                }
                throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("applicationId", "applicationId", getdisplayheightandwidthpixels);
            }
        }
    }

    public final String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(28, "GeneratedJsonAdapter(Custom)");
    }
}
