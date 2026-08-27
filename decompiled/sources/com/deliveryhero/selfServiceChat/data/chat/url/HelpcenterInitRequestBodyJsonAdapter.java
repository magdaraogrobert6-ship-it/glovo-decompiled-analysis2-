package com.deliveryhero.selfServiceChat.data.chat.url;

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
public final class HelpcenterInitRequestBodyJsonAdapter extends JsonAdapter {
    public final getLocalBitmap RemoteActionCompatParcelizer;
    public final JsonAdapter serializer;
    public final JsonAdapter write;

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        HelpcenterInitRequestBody helpcenterInitRequestBody = (HelpcenterInitRequestBody) obj;
        jsonWriter.getClass();
        if (helpcenterInitRequestBody == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.IconCompatParcelizer();
        jsonWriter.IconCompatParcelizer("app_version");
        String str = helpcenterInitRequestBody.appVersion;
        JsonAdapter jsonAdapter = this.serializer;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.IconCompatParcelizer("bridge");
        boolean z = helpcenterInitRequestBody.bridge;
        JsonAdapter jsonAdapter2 = this.write;
        jsonAdapter2.toJson(jsonWriter, Boolean.valueOf(z));
        jsonWriter.IconCompatParcelizer("email");
        jsonAdapter.toJson(jsonWriter, helpcenterInitRequestBody.email);
        jsonWriter.IconCompatParcelizer("global_entity_id");
        jsonAdapter.toJson(jsonWriter, helpcenterInitRequestBody.globalEntityId);
        jsonWriter.IconCompatParcelizer("guest");
        jsonAdapter2.toJson(jsonWriter, Boolean.valueOf(helpcenterInitRequestBody.guest));
        jsonWriter.IconCompatParcelizer("locale");
        jsonAdapter.toJson(jsonWriter, helpcenterInitRequestBody.locale);
        jsonWriter.IconCompatParcelizer("log_country_code");
        jsonAdapter.toJson(jsonWriter, helpcenterInitRequestBody.logCountryCode);
        jsonWriter.IconCompatParcelizer("name");
        jsonAdapter.toJson(jsonWriter, helpcenterInitRequestBody.name);
        jsonWriter.IconCompatParcelizer("order_id");
        jsonAdapter.toJson(jsonWriter, helpcenterInitRequestBody.orderId);
        jsonWriter.IconCompatParcelizer("p2p_chat_token");
        jsonAdapter.toJson(jsonWriter, helpcenterInitRequestBody.p2pChatToken);
        jsonWriter.IconCompatParcelizer("p2p_chat_type");
        jsonAdapter.toJson(jsonWriter, helpcenterInitRequestBody.p2pChatType);
        jsonWriter.IconCompatParcelizer("p2p_sdk_version");
        jsonAdapter.toJson(jsonWriter, helpcenterInitRequestBody.p2pSdkVersion);
        jsonWriter.IconCompatParcelizer("p2p_chat_country");
        jsonAdapter.toJson(jsonWriter, helpcenterInitRequestBody.p2pChatCountry);
        jsonWriter.IconCompatParcelizer("platform_token");
        jsonAdapter.toJson(jsonWriter, helpcenterInitRequestBody.platformToken);
        jsonWriter.IconCompatParcelizer("service_type");
        jsonAdapter.toJson(jsonWriter, helpcenterInitRequestBody.serviceType);
        jsonWriter.IconCompatParcelizer("user_id");
        jsonAdapter.toJson(jsonWriter, helpcenterInitRequestBody.userId);
        jsonWriter.IconCompatParcelizer("verification_token");
        jsonAdapter.toJson(jsonWriter, helpcenterInitRequestBody.verificationToken);
        jsonWriter.IconCompatParcelizer("host_perseus_session_id");
        jsonAdapter.toJson(jsonWriter, helpcenterInitRequestBody.hostPerseusSessionId);
        jsonWriter.serializer();
    }

    public HelpcenterInitRequestBodyJsonAdapter(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations) {
        getruntime_memory_image_loader_usage_quotientannotations.getClass();
        this.RemoteActionCompatParcelizer = getLocalBitmap.RemoteActionCompatParcelizer("app_version", "bridge", "email", "global_entity_id", "guest", "locale", "log_country_code", "name", "order_id", "p2p_chat_token", "p2p_chat_type", "p2p_sdk_version", "p2p_chat_country", "platform_token", "service_type", "user_id", "verification_token", "host_perseus_session_id");
        ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
        this.serializer = getruntime_memory_image_loader_usage_quotientannotations.read(String.class, itemTouchHelperAdapter, "appVersion");
        this.write = getruntime_memory_image_loader_usage_quotientannotations.read(Boolean.TYPE, itemTouchHelperAdapter, "bridge");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        getdisplayheightandwidthpixels.getClass();
        getdisplayheightandwidthpixels.read();
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        while (true) {
            String str17 = str10;
            String str18 = str9;
            String str19 = str8;
            String str20 = str7;
            String str21 = str6;
            String str22 = str5;
            String str23 = str4;
            Boolean bool3 = bool2;
            String str24 = str3;
            String str25 = str2;
            Boolean bool4 = bool;
            String str26 = str;
            if (getdisplayheightandwidthpixels.MediaBrowserCompatMediaItem()) {
                int iSerializer = getdisplayheightandwidthpixels.serializer(this.RemoteActionCompatParcelizer);
                JsonAdapter jsonAdapter = this.write;
                JsonAdapter jsonAdapter2 = this.serializer;
                switch (iSerializer) {
                    case -1:
                        getdisplayheightandwidthpixels.PlaybackStateCompatCustomAction();
                        getdisplayheightandwidthpixels.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                        str9 = str18;
                        str8 = str19;
                        str7 = str20;
                        str6 = str21;
                        str5 = str22;
                        str4 = str23;
                        bool2 = bool3;
                        str3 = str24;
                        str2 = str25;
                        bool = bool4;
                        str = str26;
                        str10 = str17;
                        break;
                    case 0:
                        String str27 = (String) jsonAdapter2.fromJson(getdisplayheightandwidthpixels);
                        if (str27 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("appVersion", "app_version", getdisplayheightandwidthpixels);
                        }
                        str = str27;
                        str9 = str18;
                        str8 = str19;
                        str7 = str20;
                        str6 = str21;
                        str5 = str22;
                        str4 = str23;
                        bool2 = bool3;
                        str3 = str24;
                        str2 = str25;
                        bool = bool4;
                        str10 = str17;
                        break;
                        break;
                    case 1:
                        bool = (Boolean) jsonAdapter.fromJson(getdisplayheightandwidthpixels);
                        if (bool == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("bridge", "bridge", getdisplayheightandwidthpixels);
                        }
                        str9 = str18;
                        str8 = str19;
                        str7 = str20;
                        str6 = str21;
                        str5 = str22;
                        str4 = str23;
                        bool2 = bool3;
                        str3 = str24;
                        str2 = str25;
                        str = str26;
                        str10 = str17;
                        break;
                        break;
                    case 2:
                        String str28 = (String) jsonAdapter2.fromJson(getdisplayheightandwidthpixels);
                        if (str28 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("email", "email", getdisplayheightandwidthpixels);
                        }
                        str2 = str28;
                        str9 = str18;
                        str8 = str19;
                        str7 = str20;
                        str6 = str21;
                        str5 = str22;
                        str4 = str23;
                        bool2 = bool3;
                        str3 = str24;
                        bool = bool4;
                        str = str26;
                        str10 = str17;
                        break;
                        break;
                    case 3:
                        String str29 = (String) jsonAdapter2.fromJson(getdisplayheightandwidthpixels);
                        if (str29 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("globalEntityId", "global_entity_id", getdisplayheightandwidthpixels);
                        }
                        str3 = str29;
                        str9 = str18;
                        str8 = str19;
                        str7 = str20;
                        str6 = str21;
                        str5 = str22;
                        str4 = str23;
                        bool2 = bool3;
                        str2 = str25;
                        bool = bool4;
                        str = str26;
                        str10 = str17;
                        break;
                        break;
                    case 4:
                        Boolean bool5 = (Boolean) jsonAdapter.fromJson(getdisplayheightandwidthpixels);
                        if (bool5 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("guest", "guest", getdisplayheightandwidthpixels);
                        }
                        bool2 = bool5;
                        str9 = str18;
                        str8 = str19;
                        str7 = str20;
                        str6 = str21;
                        str5 = str22;
                        str4 = str23;
                        str3 = str24;
                        str2 = str25;
                        bool = bool4;
                        str = str26;
                        str10 = str17;
                        break;
                        break;
                    case 5:
                        String str30 = (String) jsonAdapter2.fromJson(getdisplayheightandwidthpixels);
                        if (str30 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("locale", "locale", getdisplayheightandwidthpixels);
                        }
                        str4 = str30;
                        str9 = str18;
                        str8 = str19;
                        str7 = str20;
                        str6 = str21;
                        str5 = str22;
                        bool2 = bool3;
                        str3 = str24;
                        str2 = str25;
                        bool = bool4;
                        str = str26;
                        str10 = str17;
                        break;
                        break;
                    case 6:
                        String str31 = (String) jsonAdapter2.fromJson(getdisplayheightandwidthpixels);
                        if (str31 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("logCountryCode", "log_country_code", getdisplayheightandwidthpixels);
                        }
                        str5 = str31;
                        str9 = str18;
                        str8 = str19;
                        str7 = str20;
                        str6 = str21;
                        str4 = str23;
                        bool2 = bool3;
                        str3 = str24;
                        str2 = str25;
                        bool = bool4;
                        str = str26;
                        str10 = str17;
                        break;
                        break;
                    case 7:
                        String str32 = (String) jsonAdapter2.fromJson(getdisplayheightandwidthpixels);
                        if (str32 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("name", "name", getdisplayheightandwidthpixels);
                        }
                        str6 = str32;
                        str9 = str18;
                        str8 = str19;
                        str7 = str20;
                        str5 = str22;
                        str4 = str23;
                        bool2 = bool3;
                        str3 = str24;
                        str2 = str25;
                        bool = bool4;
                        str = str26;
                        str10 = str17;
                        break;
                        break;
                    case 8:
                        String str33 = (String) jsonAdapter2.fromJson(getdisplayheightandwidthpixels);
                        if (str33 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("orderId", "order_id", getdisplayheightandwidthpixels);
                        }
                        str7 = str33;
                        str9 = str18;
                        str8 = str19;
                        str6 = str21;
                        str5 = str22;
                        str4 = str23;
                        bool2 = bool3;
                        str3 = str24;
                        str2 = str25;
                        bool = bool4;
                        str = str26;
                        str10 = str17;
                        break;
                        break;
                    case 9:
                        String str34 = (String) jsonAdapter2.fromJson(getdisplayheightandwidthpixels);
                        if (str34 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("p2pChatToken", "p2p_chat_token", getdisplayheightandwidthpixels);
                        }
                        str8 = str34;
                        str9 = str18;
                        str7 = str20;
                        str6 = str21;
                        str5 = str22;
                        str4 = str23;
                        bool2 = bool3;
                        str3 = str24;
                        str2 = str25;
                        bool = bool4;
                        str = str26;
                        str10 = str17;
                        break;
                        break;
                    case 10:
                        String str35 = (String) jsonAdapter2.fromJson(getdisplayheightandwidthpixels);
                        if (str35 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("p2pChatType", "p2p_chat_type", getdisplayheightandwidthpixels);
                        }
                        str9 = str35;
                        str8 = str19;
                        str7 = str20;
                        str6 = str21;
                        str5 = str22;
                        str4 = str23;
                        bool2 = bool3;
                        str3 = str24;
                        str2 = str25;
                        bool = bool4;
                        str = str26;
                        str10 = str17;
                        break;
                        break;
                    case 11:
                        str10 = (String) jsonAdapter2.fromJson(getdisplayheightandwidthpixels);
                        if (str10 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("p2pSdkVersion", "p2p_sdk_version", getdisplayheightandwidthpixels);
                        }
                        str9 = str18;
                        str8 = str19;
                        str7 = str20;
                        str6 = str21;
                        str5 = str22;
                        str4 = str23;
                        bool2 = bool3;
                        str3 = str24;
                        str2 = str25;
                        bool = bool4;
                        str = str26;
                        break;
                        break;
                    case 12:
                        String str36 = (String) jsonAdapter2.fromJson(getdisplayheightandwidthpixels);
                        if (str36 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("p2pChatCountry", "p2p_chat_country", getdisplayheightandwidthpixels);
                        }
                        str11 = str36;
                        str9 = str18;
                        str8 = str19;
                        str7 = str20;
                        str6 = str21;
                        str5 = str22;
                        str4 = str23;
                        bool2 = bool3;
                        str3 = str24;
                        str2 = str25;
                        bool = bool4;
                        str = str26;
                        str10 = str17;
                        break;
                        break;
                    case 13:
                        String str37 = (String) jsonAdapter2.fromJson(getdisplayheightandwidthpixels);
                        if (str37 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("platformToken", "platform_token", getdisplayheightandwidthpixels);
                        }
                        str12 = str37;
                        str9 = str18;
                        str8 = str19;
                        str7 = str20;
                        str6 = str21;
                        str5 = str22;
                        str4 = str23;
                        bool2 = bool3;
                        str3 = str24;
                        str2 = str25;
                        bool = bool4;
                        str = str26;
                        str10 = str17;
                        break;
                        break;
                    case 14:
                        String str38 = (String) jsonAdapter2.fromJson(getdisplayheightandwidthpixels);
                        if (str38 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("serviceType", "service_type", getdisplayheightandwidthpixels);
                        }
                        str13 = str38;
                        str9 = str18;
                        str8 = str19;
                        str7 = str20;
                        str6 = str21;
                        str5 = str22;
                        str4 = str23;
                        bool2 = bool3;
                        str3 = str24;
                        str2 = str25;
                        bool = bool4;
                        str = str26;
                        str10 = str17;
                        break;
                        break;
                    case 15:
                        String str39 = (String) jsonAdapter2.fromJson(getdisplayheightandwidthpixels);
                        if (str39 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("userId", "user_id", getdisplayheightandwidthpixels);
                        }
                        str14 = str39;
                        str9 = str18;
                        str8 = str19;
                        str7 = str20;
                        str6 = str21;
                        str5 = str22;
                        str4 = str23;
                        bool2 = bool3;
                        str3 = str24;
                        str2 = str25;
                        bool = bool4;
                        str = str26;
                        str10 = str17;
                        break;
                        break;
                    case 16:
                        String str40 = (String) jsonAdapter2.fromJson(getdisplayheightandwidthpixels);
                        if (str40 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("verificationToken", "verification_token", getdisplayheightandwidthpixels);
                        }
                        str15 = str40;
                        str9 = str18;
                        str8 = str19;
                        str7 = str20;
                        str6 = str21;
                        str5 = str22;
                        str4 = str23;
                        bool2 = bool3;
                        str3 = str24;
                        str2 = str25;
                        bool = bool4;
                        str = str26;
                        str10 = str17;
                        break;
                        break;
                    case 17:
                        String str41 = (String) jsonAdapter2.fromJson(getdisplayheightandwidthpixels);
                        if (str41 == null) {
                            throw getRemoteBitmaplambda4.IconCompatParcelizer("hostPerseusSessionId", "host_perseus_session_id", getdisplayheightandwidthpixels);
                        }
                        str16 = str41;
                        str9 = str18;
                        str8 = str19;
                        str7 = str20;
                        str6 = str21;
                        str5 = str22;
                        str4 = str23;
                        bool2 = bool3;
                        str3 = str24;
                        str2 = str25;
                        bool = bool4;
                        str = str26;
                        str10 = str17;
                        break;
                        break;
                    default:
                        str9 = str18;
                        str8 = str19;
                        str7 = str20;
                        str6 = str21;
                        str5 = str22;
                        str4 = str23;
                        bool2 = bool3;
                        str3 = str24;
                        str2 = str25;
                        bool = bool4;
                        str = str26;
                        str10 = str17;
                        break;
                }
            } else {
                getdisplayheightandwidthpixels.IconCompatParcelizer();
                if (str26 == null) {
                    throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("appVersion", "app_version", getdisplayheightandwidthpixels);
                }
                if (bool4 != null) {
                    boolean zBooleanValue = bool4.booleanValue();
                    if (str25 == null) {
                        throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("email", "email", getdisplayheightandwidthpixels);
                    }
                    if (str24 == null) {
                        throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("globalEntityId", "global_entity_id", getdisplayheightandwidthpixels);
                    }
                    if (bool3 != null) {
                        boolean zBooleanValue2 = bool3.booleanValue();
                        if (str23 == null) {
                            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("locale", "locale", getdisplayheightandwidthpixels);
                        }
                        if (str22 == null) {
                            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("logCountryCode", "log_country_code", getdisplayheightandwidthpixels);
                        }
                        if (str21 == null) {
                            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("name", "name", getdisplayheightandwidthpixels);
                        }
                        if (str20 == null) {
                            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("orderId", "order_id", getdisplayheightandwidthpixels);
                        }
                        if (str19 == null) {
                            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("p2pChatToken", "p2p_chat_token", getdisplayheightandwidthpixels);
                        }
                        if (str18 == null) {
                            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("p2pChatType", "p2p_chat_type", getdisplayheightandwidthpixels);
                        }
                        if (str17 == null) {
                            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("p2pSdkVersion", "p2p_sdk_version", getdisplayheightandwidthpixels);
                        }
                        if (str11 == null) {
                            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("p2pChatCountry", "p2p_chat_country", getdisplayheightandwidthpixels);
                        }
                        if (str12 == null) {
                            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("platformToken", "platform_token", getdisplayheightandwidthpixels);
                        }
                        if (str13 == null) {
                            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("serviceType", "service_type", getdisplayheightandwidthpixels);
                        }
                        if (str14 == null) {
                            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("userId", "user_id", getdisplayheightandwidthpixels);
                        }
                        if (str15 == null) {
                            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("verificationToken", "verification_token", getdisplayheightandwidthpixels);
                        }
                        if (str16 != null) {
                            return new HelpcenterInitRequestBody(str26, zBooleanValue, str25, str24, zBooleanValue2, str23, str22, str21, str20, str19, str18, str17, str11, str12, str13, str14, str15, str16);
                        }
                        throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("hostPerseusSessionId", "host_perseus_session_id", getdisplayheightandwidthpixels);
                    }
                    throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("guest", "guest", getdisplayheightandwidthpixels);
                }
                throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("bridge", "bridge", getdisplayheightandwidthpixels);
            }
        }
    }

    public final String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(47, "GeneratedJsonAdapter(HelpcenterInitRequestBody)");
    }
}
