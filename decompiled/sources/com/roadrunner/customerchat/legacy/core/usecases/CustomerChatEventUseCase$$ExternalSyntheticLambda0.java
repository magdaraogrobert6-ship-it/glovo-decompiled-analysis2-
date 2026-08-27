package com.roadrunner.customerchat.legacy.core.usecases;

import android.app.Activity;
import android.content.SharedPreferences;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.re2j.Parser;
import com.huawei.riemann.location.common.utils.Constant;
import com.logistics.rider.glovo.R;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.nafath.NafathTimerManager$observeCountdown$1;
import com.roadrunner.push.messages.display.backgroud.services.SendPushReceiptWorker;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import o.ShortNewsContentCardView;
import o.accessgetAmbientShadowColor0d7_KjUjd;
import o.createFromParcel;
import o.deleteEventMetadata;
import o.foregroundTimerFiredI;
import o.getCieXyz;
import o.getDefaultDrawBlock;
import o.getHasNonTranslationComponents;
import o.getOwnerId;
import o.isInvalidated;
import o.isValidReferrerDetails;
import o.isVerticalSwipeInAllowedDirection;
import o.lambdaaddGlobalCallbackParameter20;
import o.lambdaaddGlobalCallbackParameter21;
import o.onContentCardDismissed;
import o.onViewAttachedToWindow;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.record;
import o.registerOnGlobalChange;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.scheduleDebounceCallback;
import o.setInvalidated;
import o.setOutlineO0kMr_c;
import o.setWasCloseMessageCalled;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CustomerChatEventUseCase$$ExternalSyntheticLambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public final /* synthetic */ long read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ CustomerChatEventUseCase$$ExternalSyntheticLambda0(long j, onViewAttachedToWindow onviewattachedtowindow, onViewAttachedToWindow onviewattachedtowindow2) {
        this.read = j;
        this.serializer = onviewattachedtowindow;
        this.write = onviewattachedtowindow2;
    }

    public /* synthetic */ CustomerChatEventUseCase$$ExternalSyntheticLambda0(registerOnGlobalChange registeronglobalchange, long j, Parser.Pair pair) {
        this.serializer = registeronglobalchange;
        this.read = j;
        this.write = pair;
    }

    public /* synthetic */ CustomerChatEventUseCase$$ExternalSyntheticLambda0(String str, SendPushReceiptWorker sendPushReceiptWorker, long j) {
        this.serializer = str;
        this.write = sendPushReceiptWorker;
        this.read = j;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0142 A[PHI: r11 r12
  0x0142: PHI (r11v15 java.lang.Object) = (r11v13 java.lang.Object), (r11v16 java.lang.Object) binds: [B:36:0x013f, B:33:0x010e] A[DONT_GENERATE, DONT_INLINE]
  0x0142: PHI (r12v15 o.isValidReferrerDetails) = (r12v14 o.isValidReferrerDetails), (r12v21 o.isValidReferrerDetails) binds: [B:36:0x013f, B:33:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        String str;
        Object next;
        isValidReferrerDetails isvalidreferrerdetails;
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.write;
        Object obj3 = this.serializer;
        Object obj4 = null;
        if (i2 == 0) {
            registerOnGlobalChange registeronglobalchange = (registerOnGlobalChange) obj3;
            Parser.Pair pair = (Parser.Pair) obj2;
            isInvalidated isinvalidated = (isInvalidated) obj;
            isinvalidated.getClass();
            boolean z = isinvalidated instanceof getOwnerId;
            long j = this.read;
            if (!z) {
                if (isinvalidated instanceof setInvalidated) {
                    int i3 = MediaMetadataCompat + 49;
                    RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    getHasNonTranslationComponents gethasnontranslationcomponents = registeronglobalchange.IconCompatParcelizer;
                    gethasnontranslationcomponents.RemoteActionCompatParcelizer.IconCompatParcelizer("Delivery Chat", null);
                    gethasnontranslationcomponents.MediaBrowserCompatMediaItem.getClass();
                } else if (isinvalidated.equals(record.RemoteActionCompatParcelizer)) {
                    registeronglobalchange.read.RemoteActionCompatParcelizer.put(Long.valueOf(j), Long.valueOf(registeronglobalchange.write.millis()));
                } else if (!isinvalidated.equals(record.IconCompatParcelizer) && !isinvalidated.equals(record.write) && !(isinvalidated instanceof getDefaultDrawBlock)) {
                    int i5 = MediaMetadataCompat + 91;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    if (!(isinvalidated instanceof setOutlineO0kMr_c)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                }
                getHasNonTranslationComponents gethasnontranslationcomponents2 = registeronglobalchange.IconCompatParcelizer;
                gethasnontranslationcomponents2.getClass();
                BuildersKt.RemoteActionCompatParcelizer(gethasnontranslationcomponents2.MediaDescriptionCompat, null, null, new NafathTimerManager$observeCountdown$1(gethasnontranslationcomponents2, isinvalidated, j, (ShortNewsContentCardView) null, 6), 3);
                return createfromparcel;
            }
            int i7 = RemoteActionCompatParcelizer + 109;
            MediaMetadataCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            registeronglobalchange.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer.put(Long.valueOf(j), Long.valueOf(registeronglobalchange.write.millis()));
            String str2 = ((getOwnerId) isinvalidated).IconCompatParcelizer;
            str2.getClass();
            ProtobufEncoder protobufEncoder = (ProtobufEncoder) pair.RemoteActionCompatParcelizer;
            Activity activity = (Activity) pair.write;
            scheduleDebounceCallback scheduledebouncecallback = activity instanceof scheduleDebounceCallback ? (scheduleDebounceCallback) activity : null;
            if (scheduledebouncecallback == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("The context must implement to CustomerChatView");
                return null;
            }
            scheduledebouncecallback.write(R.string.dialog_string_phone_title, R.string.all_downloading);
            registerOnGlobalChange registeronglobalchange2 = (registerOnGlobalChange) protobufEncoder.serializer;
            SessionDao_Impl$$ExternalSyntheticLambda1 sessionDao_Impl$$ExternalSyntheticLambda1 = new SessionDao_Impl$$ExternalSyntheticLambda1(scheduledebouncecallback, 8, protobufEncoder);
            SessionDao_Impl$$ExternalSyntheticLambda1 sessionDao_Impl$$ExternalSyntheticLambda2 = new SessionDao_Impl$$ExternalSyntheticLambda1(scheduledebouncecallback, protobufEncoder, activity);
            registeronglobalchange2.getClass();
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) registeronglobalchange2.RemoteActionCompatParcelizer;
            firebaseRemoteConfigImpl.getClass();
            if (firebaseRemoteConfigImpl.RemoteActionCompatParcelizer(updateAdidI.TWILIO_ENABLED)) {
                registeronglobalchange2.MediaDescriptionCompat.serializer(j, new BarcodeAnalyzer$$ExternalSyntheticLambda0(4, sessionDao_Impl$$ExternalSyntheticLambda1), new BarcodeAnalyzer$$ExternalSyntheticLambda0(5, sessionDao_Impl$$ExternalSyntheticLambda2));
                int i9 = MediaMetadataCompat + 79;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } else {
                sessionDao_Impl$$ExternalSyntheticLambda1.invoke(str2);
            }
            getHasNonTranslationComponents gethasnontranslationcomponents3 = registeronglobalchange.IconCompatParcelizer;
            gethasnontranslationcomponents3.getClass();
            BuildersKt.RemoteActionCompatParcelizer(gethasnontranslationcomponents3.MediaDescriptionCompat, null, null, new NafathTimerManager$observeCountdown$1(gethasnontranslationcomponents3, isinvalidated, j, (ShortNewsContentCardView) null, 6), 3);
            return createfromparcel;
        }
        if (i2 == 1) {
            DrawScope drawScope = (DrawScope) obj;
            drawScope.getClass();
            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32)) * 0.6f;
            long jM537constructorimpl = Size.m537constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
            float fMo48toPx0680j_4 = drawScope.mo48toPx0680j_4(Dimensions.setHasNonEmbeddedTabs);
            long jM431constructorimpl = CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(fMo48toPx0680j_4)) << 32) | (((long) Float.floatToRawIntBits(fMo48toPx0680j_4)) & 4294967295L));
            long jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32)) - Float.intBitsToFloat((int) (jM537constructorimpl >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() & 4294967295L)) - Float.intBitsToFloat((int) (jM537constructorimpl & 4294967295L))) / 2.0f)) & 4294967295L));
            Path Path = AndroidPath_androidKt.Path();
            Path.addRect$default(Path, new Rect(0.0f, 0.0f, Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() & 4294967295L))), null, 2, null);
            Path Path2 = AndroidPath_androidKt.Path();
            Path.addRoundRect$default(Path2, RoundRectKt.m532RoundRectsniSvfs(RectKt.m517Recttz77jQw(jM469constructorimpl, jM537constructorimpl), jM431constructorimpl), null, 2, null);
            DrawScope.m1294drawPathLG529CI$default(drawScope, Path.Companion.m1010combinexh6zSI8(PathOperation.Companion.m1031getDifferenceb3I0S0c(), Path, Path2), this.read, 0.0f, null, null, 0, 60, null);
            DrawScope.m1300drawRoundRectuAw5IA$default(drawScope, ((Color) ((onViewAttachedToWindow) obj3).getValue()).m732unboximpl(), jM469constructorimpl, jM537constructorimpl, jM431constructorimpl, new Stroke(drawScope.mo48toPx0680j_4(((Dp) ((onViewAttachedToWindow) obj2).getValue()).m3687unboximpl()), 0.0f, 0, 0, null, 30, null), 0.0f, null, 0, Constant.ERROR_WSS_INVALID, null);
            return createfromparcel;
        }
        SendPushReceiptWorker sendPushReceiptWorker = (SendPushReceiptWorker) obj2;
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) obj3, foregroundTimerFiredI.DELIVERY_DISPATCHED.getValue()}, getCieXyz.write())).booleanValue())) {
            lambdaaddGlobalCallbackParameter20 lambdaaddglobalcallbackparameter20 = sendPushReceiptWorker.MediaSessionCompatResultReceiverWrapper;
            accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd = sendPushReceiptWorker.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            String strRemoteActionCompatParcelizer = accessgetambientshadowcolor0d7_kjujd.RemoteActionCompatParcelizer("delivery_Id");
            if (strRemoteActionCompatParcelizer == null) {
                int i11 = RemoteActionCompatParcelizer + 83;
                MediaMetadataCompat = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    throw null;
                }
                strRemoteActionCompatParcelizer = "missing_delivery_id";
            }
            String str3 = strRemoteActionCompatParcelizer;
            String strRemoteActionCompatParcelizer2 = accessgetambientshadowcolor0d7_kjujd.RemoteActionCompatParcelizer("category");
            if (strRemoteActionCompatParcelizer2 == null) {
                int i12 = MediaMetadataCompat + 63;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    obj4.hashCode();
                    throw null;
                }
                str = "missing_category";
            } else {
                str = strRemoteActionCompatParcelizer2;
            }
            r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U entries = deleteEventMetadata.getEntries();
            Object obj5 = accessgetambientshadowcolor0d7_kjujd.RemoteActionCompatParcelizer.get("sourceTrigger");
            deleteEventMetadata deleteeventmetadata = (deleteEventMetadata) onContentCardDismissed.read(((Number) (obj5 instanceof Integer ? obj5 : 0)).intValue(), entries);
            if (deleteeventmetadata == null) {
                int i13 = RemoteActionCompatParcelizer + 63;
                MediaMetadataCompat = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                deleteeventmetadata = deleteEventMetadata.Remote;
            }
            isValidReferrerDetails isvalidreferrerdetails2 = new isValidReferrerDetails(str3, str, this.read, deleteeventmetadata);
            lambdaaddGlobalCallbackParameter21 lambdaaddglobalcallbackparameter21 = (lambdaaddGlobalCallbackParameter21) lambdaaddglobalcallbackparameter20;
            List list = lambdaaddglobalcallbackparameter21.read();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int i15 = RemoteActionCompatParcelizer + 9;
                MediaMetadataCompat = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    next = it.next();
                    isvalidreferrerdetails = (isValidReferrerDetails) next;
                    int i16 = 35 / 0;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{isvalidreferrerdetails.deliveryId, isvalidreferrerdetails2.deliveryId}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{isvalidreferrerdetails.category, isvalidreferrerdetails2.category}, getCieXyz.write())).booleanValue()) {
                        }
                    }
                } else {
                    next = it.next();
                    isvalidreferrerdetails = (isValidReferrerDetails) next;
                    if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{isvalidreferrerdetails.deliveryId, isvalidreferrerdetails2.deliveryId}, getCieXyz.write())).booleanValue())) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{isvalidreferrerdetails.category, isvalidreferrerdetails2.category}, getCieXyz.write())).booleanValue()) {
                        }
                    }
                }
                arrayList.add(next);
            }
            ArrayList arrayListRemoteActionCompatParcelizer = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) arrayList, (Object) isvalidreferrerdetails2);
            SharedPreferences.Editor editorEdit = lambdaaddglobalcallbackparameter21.read.edit();
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
            isverticalswipeinalloweddirection.getClass();
            editorEdit.putString("pref_key_push_notifications_list", isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(isValidReferrerDetails.Companion.serializer(), 0), arrayListRemoteActionCompatParcelizer));
            editorEdit.apply();
        }
        return createfromparcel;
    }
}
