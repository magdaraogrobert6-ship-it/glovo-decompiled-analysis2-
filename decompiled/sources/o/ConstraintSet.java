package o;

import android.annotation.SuppressLint;
import com.roadrunner.face.verification.data.SelfieStatusResponse;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint
public interface ConstraintSet {
    @getEvalNonAuth(IconCompatParcelizer = "/api/iam-login/selfie/status")
    Object RemoteActionCompatParcelizer(ShortNewsContentCardView<? super SelfieStatusResponse> shortNewsContentCardView);

    @ProtoParserKtdecodeProtoAndCachedecodedResponse1(RemoteActionCompatParcelizer = "/api/iam-login/selfie")
    @ProtoListValueserializer
    Object RemoteActionCompatParcelizer(@ProtoParticipantsCompanion r8lambdaCTegLFIY2N5eeYL50pY32CICZRI r8lambdacteglfiy2n5eeyl50py32ciczri, @ProtoParticipantsCompanion(RemoteActionCompatParcelizer = com.deliveryhero.chatsdk.util.PushNotificationParserObj.COUNTRY_KEY) RequestBody requestBody, @ProtoParticipantsCompanion(RemoteActionCompatParcelizer = "user_id") RequestBody requestBody2, @ProtoParticipantsCompanion(RemoteActionCompatParcelizer = "consent") boolean z, @getClauses(serializer = "Authorization") String str, @getClauses(serializer = "X-Selfie-Trigger") String str2, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView);
}
