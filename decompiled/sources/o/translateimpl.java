package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import okio.Okio;
import okio.Options;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class translateimpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ translateimpl(int i, int i2) {
        this.write = i2;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Exception {
        Boolean boolValueOf;
        int i = this.write;
        int i2 = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            tintxETnrds tintxetnrds = (tintxETnrds) obj;
            tintxetnrds.getClass();
            UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("SELECT * FROM tracking_perseus_events ORDER BY priority ASC, timestamp DESC LIMIT ?");
            try {
                uncheckedColordefaultRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(1, i2);
                int iWrite = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "id");
                int iWrite2 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "timestamp");
                int iWrite3 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "payloadTimeStamp");
                int iWrite4 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, com.deliveryhero.chatsdk.util.PushNotificationParserObj.COUNTRY_KEY);
                int iWrite5 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "advertisingId");
                int iWrite6 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "appId");
                int iWrite7 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "appName");
                int iWrite8 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "appVersionCode");
                int iWrite9 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "adjustId");
                int iWrite10 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "userId");
                int iWrite11 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "uaId");
                int iWrite12 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "clientId");
                int iWrite13 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "sessionId");
                int iWrite14 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "sdkVersionName");
                int iWrite15 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "globalEntityId");
                int iWrite16 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "consent");
                int iWrite17 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "sessionOffset");
                int iWrite18 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "eventVariables");
                int iWrite19 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "ecommerceItems");
                int iWrite20 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "ecommerceComponents");
                int iWrite21 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "isDebug");
                int iWrite22 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "eventAction");
                int iWrite23 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "appBuildVersion");
                int iWrite24 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "rechargeTo");
                int iWrite25 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "firebaseInstanceId");
                int iWrite26 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, RemoteMessageConst.Notification.PRIORITY);
                ArrayList arrayList = new ArrayList();
                while (uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer()) {
                    long jSerializer = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite);
                    long jSerializer2 = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite2);
                    String str = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite3);
                    String str2 = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite4);
                    String str3 = uncheckedColordefaultRemoteActionCompatParcelizer.MediaSessionCompatQueueItem(iWrite5) ? null : uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite5);
                    String str4 = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite6);
                    String str5 = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite7);
                    String str6 = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite8);
                    String str7 = uncheckedColordefaultRemoteActionCompatParcelizer.MediaSessionCompatQueueItem(iWrite9) ? null : uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite9);
                    String str8 = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite10);
                    String str9 = uncheckedColordefaultRemoteActionCompatParcelizer.MediaSessionCompatQueueItem(iWrite11) ? null : uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite11);
                    String str10 = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite12);
                    String str11 = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite13);
                    String str12 = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite14);
                    int i3 = iWrite;
                    iWrite15 = iWrite15;
                    String str13 = uncheckedColordefaultRemoteActionCompatParcelizer.MediaSessionCompatQueueItem(iWrite15) ? null : uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite15);
                    String str14 = uncheckedColordefaultRemoteActionCompatParcelizer.MediaSessionCompatQueueItem(iWrite16) ? null : uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite16);
                    long jSerializer3 = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite17);
                    iWrite17 = iWrite17;
                    int i4 = iWrite18;
                    String str15 = uncheckedColordefaultRemoteActionCompatParcelizer.read(i4);
                    iWrite18 = i4;
                    iWrite19 = iWrite19;
                    String str16 = uncheckedColordefaultRemoteActionCompatParcelizer.MediaSessionCompatQueueItem(iWrite19) ? null : uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite19);
                    String str17 = uncheckedColordefaultRemoteActionCompatParcelizer.MediaSessionCompatQueueItem(iWrite20) ? null : uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite20);
                    int i5 = iWrite2;
                    boolean z = ((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite21)) != 0;
                    String str18 = uncheckedColordefaultRemoteActionCompatParcelizer.MediaSessionCompatQueueItem(iWrite22) ? null : uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite22);
                    int i6 = iWrite21;
                    iWrite24 = iWrite24;
                    arrayList.add(new quadTo(jSerializer, jSerializer2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, jSerializer3, str15, str16, str17, z, str18, uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite23), uncheckedColordefaultRemoteActionCompatParcelizer.MediaSessionCompatQueueItem(iWrite24) ? null : uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite24), uncheckedColordefaultRemoteActionCompatParcelizer.MediaSessionCompatQueueItem(iWrite25) ? null : uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite25), uncheckedColordefaultRemoteActionCompatParcelizer.MediaSessionCompatQueueItem(iWrite26) ? null : Integer.valueOf((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite26))));
                    iWrite2 = i5;
                    iWrite21 = i6;
                    iWrite22 = iWrite22;
                    iWrite23 = iWrite23;
                    iWrite3 = iWrite3;
                    iWrite26 = iWrite26;
                    iWrite = i3;
                }
                return arrayList;
            } finally {
                uncheckedColordefaultRemoteActionCompatParcelizer.close();
            }
        }
        tintxETnrds tintxetnrds2 = (tintxETnrds) obj;
        tintxetnrds2.getClass();
        UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer2 = tintxetnrds2.RemoteActionCompatParcelizer("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        try {
            uncheckedColordefaultRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer(1, i2);
            int iWrite27 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "id");
            int iWrite28 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "state");
            int iWrite29 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "worker_class_name");
            int iWrite30 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "input_merger_class_name");
            int iWrite31 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "input");
            int iWrite32 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "output");
            int iWrite33 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "initial_delay");
            int iWrite34 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "interval_duration");
            int iWrite35 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "flex_duration");
            int iWrite36 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "run_attempt_count");
            int iWrite37 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "backoff_policy");
            int iWrite38 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "backoff_delay_duration");
            int iWrite39 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "last_enqueue_time");
            int iWrite40 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "minimum_retention_duration");
            int iWrite41 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "schedule_requested_at");
            int iWrite42 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "run_in_foreground");
            int iWrite43 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "out_of_quota_policy");
            int iWrite44 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "period_count");
            int iWrite45 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "generation");
            int iWrite46 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "next_schedule_time_override");
            int iWrite47 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "next_schedule_time_override_generation");
            int iWrite48 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "stop_reason");
            int iWrite49 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "trace_tag");
            int iWrite50 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "backoff_on_system_interruptions");
            int iWrite51 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "required_network_type");
            int iWrite52 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "required_network_request");
            int iWrite53 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "requires_charging");
            int iWrite54 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "requires_device_idle");
            int iWrite55 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "requires_battery_not_low");
            int iWrite56 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "requires_storage_not_low");
            int iWrite57 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "trigger_content_update_delay");
            int iWrite58 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "trigger_max_content_delay");
            int iWrite59 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "content_uri_triggers");
            ArrayList arrayList2 = new ArrayList();
            while (uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer()) {
                String str19 = uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite27);
                int i7 = iWrite39;
                int i8 = iWrite40;
                setTranslationX settranslationxWrite = Options.Companion.write((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite28));
                String str20 = uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite29);
                String str21 = uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite30);
                byte[] bArrWrite = uncheckedColordefaultRemoteActionCompatParcelizer2.write(iWrite31);
                accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd = accessgetAmbientShadowColor0d7_KjUjd.write;
                accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd2 = (accessgetAmbientShadowColor0d7_KjUjd) Okio.IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{bArrWrite}, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -2102996089, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 2102996089);
                accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd3 = (accessgetAmbientShadowColor0d7_KjUjd) Okio.IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{uncheckedColordefaultRemoteActionCompatParcelizer2.write(iWrite32)}, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -2102996089, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 2102996089);
                long jSerializer4 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite33);
                long jSerializer5 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite34);
                long jSerializer6 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite35);
                int iSerializer = (int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite36);
                int i9 = iWrite27;
                int i10 = iWrite28;
                GraphicsLayerScope graphicsLayerScopeIconCompatParcelizer = Options.Companion.IconCompatParcelizer((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite37));
                long jSerializer7 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite38);
                long jSerializer8 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i7);
                long jSerializer9 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i8);
                int i11 = iWrite41;
                long jSerializer10 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i11);
                iWrite41 = i11;
                int i12 = iWrite42;
                int i13 = iWrite29;
                boolean z2 = ((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i12)) != 0;
                int i14 = iWrite30;
                setRotationZ setrotationzSerializer = Options.Companion.serializer((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite43));
                int i15 = iWrite44;
                int i16 = iWrite43;
                int iSerializer2 = (int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i15);
                int i17 = iWrite45;
                int iSerializer3 = (int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i17);
                int i18 = iWrite46;
                long jSerializer11 = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i18);
                int i19 = iWrite47;
                int i20 = iWrite31;
                int iSerializer4 = (int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i19);
                int i21 = iWrite33;
                int i22 = iWrite48;
                int i23 = iWrite32;
                int iSerializer5 = (int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i22);
                int i24 = iWrite49;
                String str22 = uncheckedColordefaultRemoteActionCompatParcelizer2.MediaSessionCompatQueueItem(i24) ? null : uncheckedColordefaultRemoteActionCompatParcelizer2.read(i24);
                Integer numValueOf = uncheckedColordefaultRemoteActionCompatParcelizer2.MediaSessionCompatQueueItem(iWrite50) ? null : Integer.valueOf((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite50));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                } else {
                    boolValueOf = null;
                }
                int i25 = iWrite35;
                setCompositingStrategyaDBOjCE setcompositingstrategyadbojceRemoteActionCompatParcelizer = Options.Companion.RemoteActionCompatParcelizer((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite51));
                int i26 = iWrite52;
                drawOutlinehn5TExg drawoutlinehn5texgRemoteActionCompatParcelizer = Options.Companion.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer2.write(i26));
                int i27 = iWrite51;
                int i28 = iWrite53;
                int i29 = iWrite36;
                int i30 = iWrite55;
                int i31 = iWrite58;
                int i32 = iWrite50;
                int i33 = iWrite59;
                iWrite59 = i33;
                arrayList2.add(new setFrom58bKbWc(str19, settranslationxWrite, str20, str21, accessgetambientshadowcolor0d7_kjujd2, accessgetambientshadowcolor0d7_kjujd3, jSerializer4, jSerializer5, jSerializer6, new toolingGraphicsLayer(drawoutlinehn5texgRemoteActionCompatParcelizer, setcompositingstrategyadbojceRemoteActionCompatParcelizer, ((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i28)) != 0, ((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite54)) != 0, ((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite55)) != 0, ((int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite56)) != 0, uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite57), uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i31), Options.Companion.IconCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer2.write(i33))), iSerializer, graphicsLayerScopeIconCompatParcelizer, jSerializer7, jSerializer8, jSerializer9, jSerializer10, z2, setrotationzSerializer, iSerializer2, iSerializer3, jSerializer11, iSerializer4, iSerializer5, str22, boolValueOf));
                iWrite58 = i31;
                iWrite27 = i9;
                iWrite29 = i13;
                iWrite30 = i14;
                iWrite43 = i16;
                iWrite44 = i15;
                iWrite45 = i17;
                iWrite32 = i23;
                iWrite34 = iWrite34;
                iWrite50 = i32;
                iWrite39 = i7;
                iWrite40 = i8;
                iWrite28 = i10;
                iWrite42 = i12;
                iWrite46 = i18;
                iWrite48 = i22;
                iWrite57 = iWrite57;
                iWrite31 = i20;
                iWrite47 = i19;
                iWrite33 = i21;
                iWrite49 = i24;
                iWrite56 = iWrite56;
                iWrite35 = i25;
                iWrite51 = i27;
                iWrite52 = i26;
                iWrite53 = i28;
                iWrite54 = iWrite54;
                iWrite36 = i29;
                iWrite55 = i30;
            }
            return arrayList2;
        } finally {
            uncheckedColordefaultRemoteActionCompatParcelizer2.close();
        }
    }
}
