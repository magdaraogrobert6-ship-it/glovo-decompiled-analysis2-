package com.roadrunner.liveness.data;

import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.agconnect.config.impl.m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InAppMessageHtmlBaseView;
import o.RoomDatabaseExternalSyntheticLambda2;
import o.RoomDatabaseperformClear11;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createNewStatement;
import o.getInAppMessageEventMap;
import o.r8lambdaCTegLFIY2N5eeYL50pY32CICZRI;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$3;

/* JADX INFO: loaded from: classes3.dex */
public final class LivenessRepository$uploadImage$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ RoomDatabaseperformClear11 IconCompatParcelizer;
    public final /* synthetic */ String MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public final /* synthetic */ m MediaSessionCompatQueueItem;
    public final /* synthetic */ RoomDatabaseExternalSyntheticLambda2 RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaCTegLFIY2N5eeYL50pY32CICZRI read;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivenessRepository$uploadImage$2(m mVar, r8lambdaCTegLFIY2N5eeYL50pY32CICZRI r8lambdacteglfiy2n5eeyl50py32ciczri, String str, String str2, boolean z, RoomDatabaseperformClear11 roomDatabaseperformClear11, RoomDatabaseExternalSyntheticLambda2 roomDatabaseExternalSyntheticLambda2, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.MediaSessionCompatQueueItem = mVar;
        this.read = r8lambdacteglfiy2n5eeyl50py32ciczri;
        this.write = str;
        this.MediaBrowserCompatMediaItem = str2;
        this.serializer = z;
        this.IconCompatParcelizer = roomDatabaseperformClear11;
        this.RemoteActionCompatParcelizer = roomDatabaseExternalSyntheticLambda2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 67;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ((LivenessRepository$uploadImage$2) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        }
        ((LivenessRepository$uploadImage$2) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        LivenessRepository$uploadImage$2 livenessRepository$uploadImage$2 = new LivenessRepository$uploadImage$2(this.MediaSessionCompatQueueItem, this.read, this.write, this.MediaBrowserCompatMediaItem, this.serializer, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        int i2 = MediaMetadataCompat + 77;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 32 / 0;
        }
        return livenessRepository$uploadImage$2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InAppMessageHtmlBaseView inAppMessageHtmlBaseViewWrite;
        RequestBody$Companion$toRequestBody$3 requestBody$Companion$toRequestBody$3Serializer;
        int i = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.MediaDescriptionCompat;
        RequestBody$Companion$toRequestBody$3 requestBody$Companion$toRequestBody$3Serializer2 = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
            try {
                inAppMessageHtmlBaseViewWrite = SQLite.write(ConstantKt.CONTENT_TYPE_JSON);
            } catch (IllegalArgumentException unused) {
                inAppMessageHtmlBaseViewWrite = null;
            }
            createNewStatement createnewstatement = (createNewStatement) this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer;
            RequestBody.Companion.getClass();
            RequestBody$Companion$toRequestBody$3 requestBody$Companion$toRequestBody$3Serializer3 = r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.serializer(this.write, inAppMessageHtmlBaseViewWrite);
            RequestBody$Companion$toRequestBody$3 requestBody$Companion$toRequestBody$3Serializer4 = r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.serializer(this.MediaBrowserCompatMediaItem, inAppMessageHtmlBaseViewWrite);
            RequestBody$Companion$toRequestBody$3 requestBody$Companion$toRequestBody$3Serializer5 = r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.serializer(String.valueOf(this.serializer), inAppMessageHtmlBaseViewWrite);
            RoomDatabaseperformClear11 roomDatabaseperformClear11 = this.IconCompatParcelizer;
            if (roomDatabaseperformClear11 != null) {
                int i3 = RatingCompat + 45;
                MediaMetadataCompat = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    roomDatabaseperformClear11.name();
                    throw null;
                }
                String strName = roomDatabaseperformClear11.name();
                if (strName != null) {
                    requestBody$Companion$toRequestBody$3Serializer = r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.serializer(strName, inAppMessageHtmlBaseViewWrite);
                } else {
                    requestBody$Companion$toRequestBody$3Serializer = null;
                }
            } else {
                requestBody$Companion$toRequestBody$3Serializer = null;
            }
            RoomDatabaseExternalSyntheticLambda2 roomDatabaseExternalSyntheticLambda2 = this.RemoteActionCompatParcelizer;
            if (roomDatabaseExternalSyntheticLambda2 != null) {
                int i4 = RatingCompat + 121;
                MediaMetadataCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                String strName2 = roomDatabaseExternalSyntheticLambda2.name();
                if (strName2 != null) {
                    requestBody$Companion$toRequestBody$3Serializer2 = r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.serializer(strName2, inAppMessageHtmlBaseViewWrite);
                }
            }
            this.MediaDescriptionCompat = 1;
            if (createnewstatement.read("liveness", this.read, requestBody$Companion$toRequestBody$3Serializer3, requestBody$Companion$toRequestBody$3Serializer4, requestBody$Companion$toRequestBody$3Serializer5, requestBody$Companion$toRequestBody$3Serializer, requestBody$Companion$toRequestBody$3Serializer2, this) == coroutineSingletons) {
                int i6 = RatingCompat + 75;
                MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return createFromParcel.INSTANCE;
    }
}
